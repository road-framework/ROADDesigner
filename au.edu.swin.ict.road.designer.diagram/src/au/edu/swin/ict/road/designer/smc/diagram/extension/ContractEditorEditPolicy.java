package au.edu.swin.ict.road.designer.smc.diagram.extension;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;

import au.edu.swin.ict.road.designer.smc.Contract;

public class ContractEditorEditPolicy extends OpenEditPolicy {

	Contract contract;
	EditingDomain mEditingDomain;
	IProject project;
	IFile diagramFile;

	@Override
	protected Command getOpenCommand(Request request) {

		retrieveParameters(request);

		Shell shell = new Shell(SWT.SHELL_TRIM);
		shell.setLayout(new FillLayout());

		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		Tab[] tabs = createTabs();

		for (int i = 0; i < tabs.length; i++) {
			TabItem item = new TabItem(tabFolder, SWT.NONE);
			item.setText(tabs[i].getTabText());
			item.setControl(tabs[i].createTabFolderPage(tabFolder));
			item.setData(tabs[i]);
		}

		shell.setText("Edit Contract \"" + contract.getName() + "\"");
		shell.setSize(900, 500);
		shell.open();

		return null;
	}

	void retrieveParameters(Request request) {
		EditPart editPart = getTargetEditPart(request);
		contract = (Contract) ((View) editPart.getModel()).getElement();
		mEditingDomain = ((IGraphicalEditPart) editPart).getEditingDomain();

		IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().
									getActivePage().getActiveEditor();
		diagramFile = ((IFileEditorInput)activeEditor.getEditorInput()).getFile();
		project = ((IResource)diagramFile).getProject();
	}
	
	Tab[] createTabs() {
		return new Tab[] { new TermTab(this), new FactTab4Contract(this),
				new RuleTab(this) };
	}

	public Contract getContract() {
		return this.contract;
	}

	public EditingDomain getEditingDomain() {
		return this.mEditingDomain;
	}
	
	public IProject getProject() {
		return this.project;
	}
	
	public IFile getDiagramFile() {
		return this.diagramFile;
	}
}
