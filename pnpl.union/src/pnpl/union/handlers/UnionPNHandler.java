package pnpl.union.handlers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.factory.SessionFactory;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.ui.handlers.HandlerUtil;

import PetriNets.PetriNet;
import pnpl.union.helpers.LoadPetriNetsHelper;
import pnpl.union.helpers.MenuHelper;
import pnpl.union.union.UnionPetriNets;
import pnpl.union.union.UnionVariability;

public class UnionPNHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// Obtaining all the input files

		ResourceSet resSet = new ResourceSetImpl();
		LoadPetriNetsHelper lpnsHelper = new LoadPetriNetsHelper(resSet);
		if(lpnsHelper.loadingFiles(event) == false)
			return null;

		// Obtaining the Petri nets of the files

		lpnsHelper.loadingPetriNets();

		// Asking for a name for the output file and more

		MenuHelper fileNameDialog = new MenuHelper(HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell());
		fileNameDialog.create();
		int flag = 1;
		while (flag == 1) {
			if (fileNameDialog.open() == Window.OK) {
				if (fileNameDialog.getUnionFileName().equals("")) {
					MessageDialog.openError(HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell(),
							"No name given to the file", "Please, give a name to the file.");
				} else if (fileNameDialog.getProjectName().equals("")) {
					MessageDialog.openError(HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell(),
							"No name given to the project", "Please, give a name to the file.");
				} else {
					flag = 0;
				}
			} else {
				return null;
			}
		}

		// Working with Petri nets, remember always put the pn destiny in the second
		// argument of unionPetriNets

		UnionPetriNets upn = new UnionPetriNets();
		PetriNet unifiedPN = null;
		Copier cp = new Copier();
		for (PetriNet pn : lpnsHelper.getPns()) {
			if (pn.equals(lpnsHelper.getPns().get(0))) {
				unifiedPN = (PetriNet) cp.copy(pn);
				cp.copyReferences();
			} else {
				upn.unionPetriNets(pn, unifiedPN);
			}
		}
		cp.clear();

		// Creating the new project with the given name

		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(fileNameDialog.getProjectName());
		try {
			if (!project.exists()) {
				project.create(progressMonitor);
				project.open(progressMonitor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put("key", new XMIResourceFactoryImpl());

		// Creating the new Petri net file with the given name

		URI pnResourceURI = null;
		Resource pnResource = null;
		try {
			pnResourceURI = URI.createFileURI(
					project.getLocation().toString() + "/" + fileNameDialog.getUnionFileName() + ".petrinets");
			pnResource = resSet.createResource(pnResourceURI);
			pnResource.getContents().add(unifiedPN);
			pnResource.save(Collections.EMPTY_MAP);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// if the user wants to unify variabilities too..
		URI varResourceURI = null;
		Resource varResource = null;
		if (fileNameDialog.getVarFiles() == true) {

			// Load variability from files

			lpnsHelper.loadingVarFiles();
			lpnsHelper.loadingVariabilities();

			// Check if all variabilities has the same feature model

			UnionVariability uVar = new UnionVariability(lpnsHelper.getPns().get(0));
			if (!uVar.featureModelChecker(lpnsHelper.getVar())) {
				MessageDialog.openError(HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell(),
						"Error in the variability files",
						"All the given variability files should have the same feature model referenced.");
				return null;

			}

			// Copying the feature model to the new project

			File srcfmFile = new File(
					lpnsHelper.getFiles().get(0).getProject().getLocation().toString() + "/" + uVar.getFmodel());
			File dstfmFile = new File(project.getLocation().toString() + "/" + uVar.getFmodel());

			try {
				Files.copy(srcfmFile.toPath(), dstfmFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			// Unify variabilities

			uVar.setPetriNetName(fileNameDialog.getUnionFileName() + ".petrinets");
			lpnsHelper.getVar().get(0).getPetrinet().setImportURI(fileNameDialog.getUnionFileName() + ".petrinets");
			uVar.unionVariability(lpnsHelper.getVar());

			// Creating the new variability file with the given name for the petri net

			try {
				varResourceURI = URI.createFileURI(
						project.getLocation().toString() + "/" + fileNameDialog.getUnionFileName() + ".vrb");
				varResource = resSet.createResource(varResourceURI);
				varResource.getContents().add(lpnsHelper.getVar().get(0));
				varResource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// Creating a session for add the new resources to the new representations.aird

		try {
			URI sessionResourceURI = URI.createFileURI(project.getLocation().toString() + "/representations.aird");
			Session session = SessionFactory.INSTANCE.createSession(sessionResourceURI, progressMonitor);
			session.open(progressMonitor);
			Command addSemanticResourceCmd = new AddSemanticResourceCommand(session, pnResource.getURI(),
					progressMonitor);
			TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
			CommandStack commandStack = domain.getCommandStack();
			commandStack.execute(addSemanticResourceCmd);
			session.save(progressMonitor);
			
			
			//Si se anade la variabilidad de esta forma, sirius no resuelve las referencias
			if(fileNameDialog.getVarFiles() == true) {
				Command varAddSemanticResourceCmd = new AddSemanticResourceCommand(session, varResource.getURI(),
						progressMonitor);
				commandStack.execute(varAddSemanticResourceCmd);
			}
			
			project.refreshLocal(IResource.DEPTH_INFINITE, progressMonitor);
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}
}