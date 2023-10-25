package pnpl.union.helpers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
//import org.eclipse.xtext.resource.XtextResourceSet;

import PetriNets.PetriNet;
import variability.Variability;

public class LoadPetriNetsHelper {
	
	private ResourceSet rs;
//	public XtextResourceSet xrs;
	private ArrayList<PetriNet> pns = new ArrayList<PetriNet>();
	private ArrayList<IFile> files = new ArrayList<IFile>();
	private ArrayList<Variability> var = new ArrayList<Variability>();
	private ArrayList<IFile> varFiles = new ArrayList<IFile>();
	private ArrayList<Resource> pnresources = new ArrayList<Resource>();
	
	public LoadPetriNetsHelper(ResourceSet rs) {
		this.rs = rs;
//		this.xrs = xrs;
	}
	
	public boolean loadingFiles(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			Object[] filesSelected = ((IStructuredSelection) selection).toArray();
			// if there is only one input file, we cant use this plugin
			if (filesSelected.length == 1) {
				MessageDialog.openError(HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell(),
						"Only one file selected", "This option must be used with more than one file.");
				return false;
			}
			for (Object f : filesSelected) {
				files.add(Platform.getAdapterManager().getAdapter(f, IFile.class));
				if (files.get(files.size() - 1) == null) {
					files.remove(files.size() - 1);
					if (f instanceof IAdaptable)
						files.add(((IAdaptable) f).getAdapter(IFile.class));
				}
			}
		}
		return true;
	}

	public boolean loadingPetriNets() {
		for (IFile f : files) {
			try {
				Resource resource = rs.getResource(URI.createURI(f.getRawLocationURI().toString()), true);
				resource.load(null);
				if (!resource.getContents().isEmpty())
					pns.add((PetriNet) (resource.getContents().get(0)));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (!(pns.size() == files.size())) {
			System.out.println("[This is not working]");
			return false;
		}
		return true;
	}
	
	public void loadingVarFiles() {
		for (IFile f : getFiles()) {
			String root = f.getRawLocationURI().toString();
			if(root.startsWith("file:")) {
				root = root.replace("file:", "");		
			}
			
			String [] splitRoot = root.split("\\.");
			splitRoot[splitRoot.length-1] = "vrb";
			String varFileName = splitRoot[0];
			
			for(int i = 1; i < splitRoot.length; i++) {
				varFileName += ".";
				varFileName += splitRoot[i];
			}
			
			File varFile = new File(varFileName);
			if(varFile.exists()) {
				IWorkspace workspace= ResourcesPlugin.getWorkspace();    
				IPath location= Path.fromOSString(varFile.getAbsolutePath()); 
				IFile i = workspace.getRoot().getFileForLocation(location);
				varFiles.add(i);
					
			}
		}
	}
	
	public boolean loadingVariabilities() {
		for (IFile f : varFiles) {
			try {
				Resource resource = rs.getResource(URI.createURI(f.getRawLocationURI().toString()), true);
				resource.load(null);
				var.add((Variability) (resource.getContents().get(0)));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (!(var.size() == varFiles.size())) {
			System.out.println("[This is not working]");
			return false;
		}
		return true;
	}
	
	public void loadingResources() {
		for (IFile f : files) {
			try {
				Resource resource = rs.getResource(URI.createURI(f.getRawLocationURI().toString()),true);
				resource.load(null);
				pnresources.add(resource);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//Getters y setters
	public ResourceSet getRs() {
		return rs;
	}

	public void setRs(ResourceSet rs) {
		this.rs = rs;
	}

	public ArrayList<PetriNet> getPns() {
		return pns;
	}

	public void setPns(ArrayList<PetriNet> pns) {
		this.pns = pns;
	}

	public ArrayList<Variability> getVar() {
		return var;
	}

	public void setVar(ArrayList<Variability> var) {
		this.var = var;
	}

	public ArrayList<IFile> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<IFile> files) {
		this.files = files;
	}

	public ArrayList<IFile> getVarFiles() {
		return varFiles;
	}

	public void setVarFiles(ArrayList<IFile> varFiles) {
		this.varFiles = varFiles;
	}

	public ArrayList<Resource> getPnresources() {
		return pnresources;
	}


}
