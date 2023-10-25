package pnpl.union.helpers;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class MenuHelper extends TitleAreaDialog {

	private Text uFNText;
	private String unionFileName;
	private Text pNText;
	private String projectName;
	private Button checkbox;
	private Boolean varFiles = false;

	public MenuHelper(Shell parentShell) {
		super(parentShell);
	}

	private void saveInput() {
		setUnionFileName(uFNText.getText());
		setProjectName(pNText.getText());
		setVarFiles(checkbox.getSelection());
	}

	@Override
	public void create() {
		super.create();
		setTitle("Union settings");
		setMessage(
				"Give a name to the file resulting from the union of the selected elements.\n Also give a name to the project where files will be saved.",
				IMessageProvider.INFORMATION);
	}

	@Override
	protected Control createDialogArea(Composite parent) {

		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);

		createUFNText(container);
		createPNText(container);
		createVarQuestion(container);

		return area;
	}

	private void createUFNText(Composite container) {

		Label lbtFileName = new Label(container, SWT.NONE);
		lbtFileName.setText("File Name");

		GridData dataUnionFileName = new GridData();
		dataUnionFileName.grabExcessHorizontalSpace = true;
		dataUnionFileName.horizontalAlignment = GridData.FILL;

		uFNText = new Text(container, SWT.BORDER);
		uFNText.setLayoutData(dataUnionFileName);
	}

	private void createPNText(Composite container) {

		Label lbtFileName = new Label(container, SWT.NONE);
		lbtFileName.setText("Project name");

		GridData dataUnionFileName = new GridData();
		dataUnionFileName.grabExcessHorizontalSpace = true;
		dataUnionFileName.horizontalAlignment = GridData.FILL;

		pNText = new Text(container, SWT.BORDER);
		pNText.setLayoutData(dataUnionFileName);
	}

	private void createVarQuestion(Composite container) {

		checkbox = new Button(container, SWT.CHECK);
		checkbox.setText("Unify variability");
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	@Override
	protected void cancelPressed() {
		close();
		super.cancelPressed();
	}

	public String getUnionFileName() {
		return unionFileName;
	}

	public void setUnionFileName(String unionFileName) {
		this.unionFileName = unionFileName;
	}

	public Boolean getVarFiles() {
		return varFiles;
	}

	public void setVarFiles(Boolean varFiles) {
		this.varFiles = varFiles;
	}

	public Button getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(Button checkbox) {
		this.checkbox = checkbox;
	}

	public Text getpNText() {
		return pNText;
	}

	public void setpNText(Text pNText) {
		this.pNText = pNText;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
