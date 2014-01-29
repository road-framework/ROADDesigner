package au.edu.swin.ict.road.designer.smc.diagram.extension;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;

public class ExportCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart activeEditor = PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		IFile diagramFile = ((IFileEditorInput) activeEditor.getEditorInput())
								.getFile();
		IProject project = ((IResource) diagramFile).getProject();

		IFile sourceFile = project.getFile("/res/USDL.xml");
		String fullFileName = diagramFile.getFullPath().toString();
		String fileName = fullFileName.substring(0, fullFileName.indexOf(diagramFile.getFileExtension()));
		IPath targetFilePath = new Path(fileName + "xml");
		try {
			sourceFile.copy(targetFilePath, false, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return null;
	}

}
