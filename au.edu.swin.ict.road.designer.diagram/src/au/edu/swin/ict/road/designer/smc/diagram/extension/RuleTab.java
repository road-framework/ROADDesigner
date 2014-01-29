package au.edu.swin.ict.road.designer.smc.diagram.extension;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import au.edu.swin.ict.road.designer.smc.Contract;
import au.edu.swin.ict.road.designer.smc.SmcPackage;

public class RuleTab extends SingleColumnTab {

	Button mAddWidget, mEditWidget;
	Shell dialog;
	Text mFileName;
	Button mCreateButton, mCancelButton;

	public static final String BUTTON_TEXT_ADD = "Create rule file";
	public static final String BUTTON_TEXT_EDIT = "Edit";

	RuleTab(ContractEditorEditPolicy instance) {
		super(instance);
	}

	@Override
	String getTabText() {
		return "Rules";
	}

	@Override
	void createItemGroup() {
		super.createItemGroup();
		itemGroup.setText("Rule File");
	}

	@Override
	void createItemWidgets() {
		super.createItemWidgets();

		Contract contract = this.instance.getContract();
		if (contract.getRuleFile() != null && 
			contract.getRuleFile().length() > 0 &&
			isRuleFileExist(contract.getRuleFile()))
			createEditComposite();
		else
			createAddComposite();
	}

	void createAddComposite() {
		mAddWidget = new Button(itemGroup, SWT.PUSH);
		GridData data = new GridData();
		data.horizontalSpan = 2;
		mAddWidget.setLayoutData(data);
		mAddWidget.setText(BUTTON_TEXT_ADD);

		mAddWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button button = (Button) e.widget;
				Point pt = button.getLocation();
				pt = e.display.map(button, null, pt);
				createSetGetDialog(pt.x, pt.y);
			}
		});
	}

	void createSetGetDialog(int x, int y) {

		dialog = new Shell(shell, SWT.DIALOG_TRIM | SWT.MODELESS);
		dialog.setLayout(new GridLayout(2, false));
		dialog.setText("Enter file name");
		dialog.setSize(300, 100);

		// Create text box for filename
		mFileName = new Text(dialog, SWT.BORDER | SWT.FILL);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
		data.horizontalSpan = 2;
		mFileName.setLayoutData(data);

		// Create default filename
		String defaultFileName = getDefaultFileName();
		mFileName.setText(defaultFileName);

		// Create buttons
		mCreateButton = new Button(dialog, SWT.PUSH);
		mCreateButton.setText("Create File");
		mCreateButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				createFile(mFileName.getText());
			}
		});

		mCancelButton = new Button(dialog, SWT.PUSH);
		mCancelButton.setText("Cancel");
		mCancelButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dialog.close();
			}
		});

		dialog.setLocation(x, y);
		dialog.open();
	}

	String getDefaultFileName() {
		String input = this.instance.getContract().getName();
		if (input == null || input.length() == 0) {
			int i = 0;
			IProject project = this.instance.getProject();
			while (true) {
				IFile file = project.getFile("src/main/rules/Contract" + i
						+ ".drl");
				if (!file.exists())
					break;
				i++;
			}
			input = "Contract" + i;
		} else
			input = input.replace(" ", "");

		return input + ".drl";
	}

	void createFile(String fileName) {
		if (fileName == null || fileName.length() == 0) {
			MessageDialog.openError(dialog, "Error",
					"Rule filename is not specified");
			return;
		}

		if (!fileName.endsWith(".drl")) {
			MessageDialog.openError(dialog, "Error",
					"Rule file needs to have .drl extension");
			return;
		}

		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		IProject project = this.instance.getProject();
		IFile file = project.getFile("src/main/rules/" + fileName);

		if (file.exists()) {
			MessageDialog
					.openError(dialog, "Error", "Rule file already exists");
			return;
		}

		// Create a new file
		try {
			String contents = "";
			InputStream source = new ByteArrayInputStream(contents.getBytes());
			file.create(source, false, null);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}

		// Set ruleFile in contract
		setRuleFile(file.getProjectRelativePath().toString());

		// Close the dialog, shell and open a rule editor
		dialog.close();
		shell.close();
		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry()
				.getDefaultEditor(file.getName());
		try {
			page.openEditor(new FileEditorInput(file), desc.getId());
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	boolean isRuleFileExist(String fileName) {
		IWorkbenchPage page = PlatformUI.getWorkbench().
							  getActiveWorkbenchWindow().getActivePage();
		IProject project = this.instance.getProject();
		IFile file = project.getFile(fileName);

		return file.exists();
	}
	
	void setRuleFile(String ruleFile) {
		EAttribute feature = SmcPackage.eINSTANCE.getContract_RuleFile();
		Contract contract = this.instance.getContract();
		Command cmd = SetCommand.create(instance.getEditingDomain(), contract,
				feature, ruleFile);
		instance.getEditingDomain().getCommandStack().execute(cmd);
	}

	void createEditComposite() {
		Label label = new Label(itemGroup, SWT.NONE);
		label.setText(this.instance.getContract().getRuleFile());

		mEditWidget = new Button(itemGroup, SWT.PUSH);
		mEditWidget.setText(BUTTON_TEXT_EDIT);
		mEditWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.close();
				editRuleFile();
			}
		});
	}

	void editRuleFile() {
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		IProject project = this.instance.getProject();
		IFile file = project.getFile(this.instance.getContract().getRuleFile());

		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry()
				.getDefaultEditor(file.getName());
		try {
			page.openEditor(new FileEditorInput(file), desc.getId());
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
