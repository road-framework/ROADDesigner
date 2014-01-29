package au.edu.swin.ict.road.designer.smc.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ContractEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.FactEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.RoleEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.part.SmcDiagramUpdater;
import au.edu.swin.ict.road.designer.smc.diagram.part.SmcNodeDescriptor;
import au.edu.swin.ict.road.designer.smc.diagram.part.SmcVisualIDRegistry;

/**
 * @generated
 */
public class SMCSMCCompartmentCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = SmcDiagramUpdater
				.getSMCSMCCompartment_7001SemanticChildren(viewObject)
				.iterator(); it.hasNext();) {
			result.add(((SmcNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = SmcVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case RoleEditPart.VISUAL_ID:
		case ContractEditPart.VISUAL_ID:
		case FactEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(SmcPackage.eINSTANCE.getSMC_Role());
			myFeaturesToSynchronize.add(SmcPackage.eINSTANCE.getSMC_Contract());
			myFeaturesToSynchronize.add(SmcPackage.eINSTANCE.getSMC_Fact());
		}
		return myFeaturesToSynchronize;
	}

}
