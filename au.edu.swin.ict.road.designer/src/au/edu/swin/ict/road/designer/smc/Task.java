/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Task#getId <em>Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Task#getMsgAnalyser <em>Msg Analyser</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Task#getIn <em>In</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Task#getOut <em>Out</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Task#isIsMsgDriven <em>Is Msg Driven</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Task#getResultMsg <em>Result Msg</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Task#getSrcMsg <em>Src Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTask_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Task#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Msg Analyser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Analyser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Analyser</em>' attribute.
	 * @see #setMsgAnalyser(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTask_MsgAnalyser()
	 * @model
	 * @generated
	 */
	String getMsgAnalyser();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Task#getMsgAnalyser <em>Msg Analyser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Analyser</em>' attribute.
	 * @see #getMsgAnalyser()
	 * @generated
	 */
	void setMsgAnalyser(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(InMsg)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTask_In()
	 * @model containment="true"
	 * @generated
	 */
	InMsg getIn();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Task#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(InMsg value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference.
	 * @see #setOut(OutMsg)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTask_Out()
	 * @model containment="true"
	 * @generated
	 */
	OutMsg getOut();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Task#getOut <em>Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' containment reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(OutMsg value);

	/**
	 * Returns the value of the '<em><b>Is Msg Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Msg Driven</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Msg Driven</em>' attribute.
	 * @see #setIsMsgDriven(boolean)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTask_IsMsgDriven()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMsgDriven();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Task#isIsMsgDriven <em>Is Msg Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Msg Driven</em>' attribute.
	 * @see #isIsMsgDriven()
	 * @generated
	 */
	void setIsMsgDriven(boolean value);

	/**
	 * Returns the value of the '<em><b>Result Msg</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.ResultMsg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Msg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Msg</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTask_ResultMsg()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultMsg> getResultMsg();

	/**
	 * Returns the value of the '<em><b>Src Msg</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.SrcMsg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Msg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Msg</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTask_SrcMsg()
	 * @model containment="true"
	 * @generated
	 */
	EList<SrcMsg> getSrcMsg();

} // Task
