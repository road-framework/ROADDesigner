package au.edu.swin.ict.road.designer.diagram.editors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

import au.edu.swin.ict.road.designer.smc.diagram.part.SmcDiagramEditor;
import au.edu.swin.ict.road.designer.smc.diagram.part.SmcDocumentProvider;

/**
 * A multipage editor for ROAD Designer. This editor has 2 pages:
 * <ul>
 * <li>page 0 contains the diagram editor.
 * <li>page 1 displays the Composite XML
 * </ul>
 */
public class MultiPageSmcDiagramEditor extends MultiPageEditorPart implements
		IResourceChangeListener {

	public static final String CONSOLE_NAME = "ROADDesigner";

	/** The diagram editor used in page 0. */
	private SmcDiagramEditor diagramEditor;

	/** The text widget used in page 1. */
	private SmcXMLEditor smcXMLEditor;
	IPath domainFilePath, xmlCompositeFilePath;
	IFile domainFile, xmlCompositeFile;

	/**
	 * Creates a multipage editor example.
	 */
	public MultiPageSmcDiagramEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	/**
	 * Creates page 0 of the multipage editor, which contains a GMF diagram
	 * editor.
	 */
	void createPage0() {
		try {
			diagramEditor = new SmcDiagramEditor();
			int index = addPage(diagramEditor, getEditorInput());
			setPageText(index, "Design");
		} catch (PartInitException e) {
			ErrorDialog
					.openError(getSite().getShell(),
							"Error creating nested diagram editor", null, e
									.getStatus());
		}
	}

	/**
	 * Creates page 1 of the multipage editor, which shows the Composite XML.
	 */
	void createPage1() {

		// Automatic transformation
		autoTransform();

		IEditorInput domainEditorInput = new FileEditorInput(xmlCompositeFile);

		try {
			smcXMLEditor = new SmcXMLEditor();
			int index = addPage(smcXMLEditor, domainEditorInput);
			setPageText(index, "Composite XML");
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested Composite XML editor", null, e
							.getStatus());
		}
	}

	private void autoTransform() {
		String xsltFilePath = "platform:/plugin/au.edu.swin.ict.road.designer.diagram/files/transform.xsl";

		try {
			SmcDocumentProvider documentProvider = (SmcDocumentProvider) diagramEditor
					.getDocumentProvider();
			URI domainResourceURI = documentProvider
					.getDomainResourceURI(getEditorInput());
			domainFilePath = new Path(domainResourceURI.toPlatformString(false));
			domainFile = ResourcesPlugin.getWorkspace().getRoot().getFile(
					domainFilePath);

			// Transform XML
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			// 1. Instantiate a TransformerFactory.
			TransformerFactory tFactory = TransformerFactory.newInstance();

			// 2. Use the TransformerFactory to process the stylesheet Source
			// and generate a Transformer.
			Transformer transformer;
			URL transformationFileURL = new URL(xsltFilePath);
			transformer = tFactory.newTransformer(new StreamSource(
					transformationFileURL.openConnection().getInputStream()));

			// 3. Use the Transformer to transform an XML Source and send the
			// output to a Result object.
			StreamResult streamResult = new StreamResult(baos);
			transformer.transform(new StreamSource(domainFile.getContents()),
					streamResult);

			ByteArrayInputStream bais = new ByteArrayInputStream(baos
					.toByteArray());
			xmlCompositeFilePath = domainFilePath.removeFileExtension()
					.addFileExtension("xml");
			xmlCompositeFile = ResourcesPlugin.getWorkspace().getRoot()
					.getFile(xmlCompositeFilePath);
			// Create a new file
			if (!xmlCompositeFile.exists()) {
				try {
					String contents = "";
					InputStream source = new ByteArrayInputStream(contents
							.getBytes());
					xmlCompositeFile.create(source, false, null);
				} catch (CoreException e1) {
					e1.printStackTrace();
				}
				printDebugMsg(xmlCompositeFilePath + " created");
			}
			xmlCompositeFile.setContents(bais, false, false, null);

		} catch (CoreException e) {
			printDebugMsg("Exception " + e.getMessage());
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			printDebugMsg("Exception " + e.getMessage());
			e.printStackTrace();
		} catch (TransformerException e) {
			printDebugMsg("Exception " + e.getMessage());
			e.printStackTrace();
		} catch (MalformedURLException e) {
			printDebugMsg("Exception " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			printDebugMsg("Exception " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Creates the pages of the multipage editor.
	 */
	protected void createPages() {
		createPage0();
		createPage1();
//		showConsole();
	}

	/**
	 * The <code>MultiPageEditorPart</code> implementation of this
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}

	/**
	 * Saves the multipage editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		getEditor(getActivePage()).doSave(monitor);
		autoTransform();
	}

	/**
	 * Saves the multi-page editor's document as another file. Also updates the
	 * text for page 0's tab, and updates this multi-page editor's input to
	 * correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}

	/*
	 * (non-Javadoc) Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}

	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
			throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException(
					"Invalid Input: Must be IFileEditorInput");

		super.init(site, editorInput);
	}

	private void showConsole() {
		try {
			// Reveal the console view
			IConsole myConsole = findConsole(CONSOLE_NAME);// your console instance
			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
			IWorkbenchPage page = win.getActivePage();// obtain the active page
			String id = IConsoleConstants.ID_CONSOLE_VIEW;
			IConsoleView view;
			view = (IConsoleView) page.showView(id);
			view.display(myConsole);		
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * (non-Javadoc) Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * Calculates the contents of page 1 when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		if (newPageIndex == 1) {
			EMF2XML();
		}
	}

	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event) {
		if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow()
							.getPages();
					for (int i = 0; i < pages.length; i++) {
						if (((FileEditorInput) diagramEditor.getEditorInput())
								.getFile().getProject().equals(
										event.getResource())) {
							IEditorPart editorPart = pages[i]
									.findEditor(diagramEditor.getEditorInput());
							pages[i].closeEditor(editorPart, true);
						}
					}
				}
			});
		}
	}

	/**
	 * Sorts the words in page 0, and shows them in page 2.
	 */
	void EMF2XML() {
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	private void printDebugMsg(String msg) {
		MessageConsole myConsole = findConsole(CONSOLE_NAME);
		MessageConsoleStream out = myConsole.newMessageStream();
		out.println(msg);
	}
}
