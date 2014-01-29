package au.edu.swin.ict.road.designer.smc.diagram.extension;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import au.edu.swin.ict.road.designer.smc.ExternalFactLink;
import au.edu.swin.ict.road.designer.smc.Role;

public class RoleEditorEditPolicy extends OpenEditPolicy {

	Role role;
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

		shell.setText("Edit Role \"" + role.getName() + "\"");
		shell.setMaximized(true);
//		shell.setSize(900, 500);
		shell.open();

		return null;
	}

	void retrieveParameters(Request request) {
		EditPart editPart = getTargetEditPart(request);
		role = (Role) ((View) editPart.getModel()).getElement();
		mEditingDomain = ((IGraphicalEditPart) editPart).getEditingDomain();

		IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().
									getActivePage().getActiveEditor();
		diagramFile = ((IFileEditorInput)activeEditor.getEditorInput()).getFile();
		project = ((IResource)diagramFile).getProject();
	}
	
	Tab[] createTabs() {
		return new Tab[] { new TaskTab(this), new FactTab4Role(this)};
	}

	public Role getRole() {
		return this.role;
	}

	public ArrayList<Contract> getContracts() {
		ArrayList<Contract> contracts = new ArrayList<Contract>();
		
		ResourceSet resourceSet = mEditingDomain.getResourceSet();
		Iterator<Object> iterator = EcoreUtil.getAllProperContents(resourceSet, true);
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			if (obj instanceof Contract) {
				Contract contract = (Contract)obj;
				if (contract.getRoleAID().equals(role) ||
					contract.getRoleBID().equals(role))
					contracts.add(contract);
			}
		}
		
		return contracts;
	}
	
	public ArrayList<ExternalFactLink> getProvideFactLink() {
		java.util.List<ExternalFactLink> factLinks = role.getExternalFactLink();
		ArrayList<ExternalFactLink> provideFactLinks = new ArrayList<ExternalFactLink>();
		
		for (ExternalFactLink factLink: factLinks) {
			if (factLink.getProvisionRegime() != null) provideFactLinks.add(factLink);
		}
		
		return provideFactLinks;
	}
	
	public ArrayList<ExternalFactLink> getMonitorFactLink() {
		java.util.List<ExternalFactLink> factLinks = role.getExternalFactLink();
		ArrayList<ExternalFactLink> monitorFactLinks = new ArrayList<ExternalFactLink>();
		
		for (ExternalFactLink factLink: factLinks) {
			if (factLink.getAcquisitionRegime() != null) monitorFactLinks.add(factLink);
		}
		
		return monitorFactLinks;
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
