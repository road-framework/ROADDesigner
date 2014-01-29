package au.edu.swin.ict.road.designer.smc.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import au.edu.swin.ict.road.designer.smc.diagram.edit.policies.ExternalFactLinkItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExternalFactLinkEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4005;

	/**
	 * @generated
	 */
	public ExternalFactLinkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ExternalFactLinkItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ExternalFactLinkFigure();
	}

	/**
	 * @generated
	 */
	public ExternalFactLinkFigure getPrimaryShape() {
		return (ExternalFactLinkFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ExternalFactLinkFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ExternalFactLinkFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DASHDOT);

		}

	}

}
