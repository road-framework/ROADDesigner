/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getRole <em>Role</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getContract <em>Contract</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getProcessDefinition <em>Process Definition</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getBehaviorTerm <em>Behavior Term</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getPlayerBinding <em>Player Binding</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getMessageAnalyzer <em>Message Analyzer</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getRulesDir <em>Rules Dir</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getRoutingRuleFile <em>Routing Rule File</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getCompositeRuleFile <em>Composite Rule File</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getOrganizerBinding <em>Organizer Binding</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getDescription <em>Description</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SMC#getFact <em>Fact</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC()
 * @model
 * @generated
 */
public interface SMC extends Player {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.Contract}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_Contract()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contract> getContract();

	/**
	 * Returns the value of the '<em><b>Process Definition</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.ProcessDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Definition</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_ProcessDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessDefinition> getProcessDefinition();

	/**
	 * Returns the value of the '<em><b>Behavior Term</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.BehaviorTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Term</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_BehaviorTerm()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviorTerm> getBehaviorTerm();

	/**
	 * Returns the value of the '<em><b>Player Binding</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.PlayerBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Binding</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_PlayerBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlayerBinding> getPlayerBinding();

	/**
	 * Returns the value of the '<em><b>Message Analyzer</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.MessageAnalyzer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Analyzer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Analyzer</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_MessageAnalyzer()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageAnalyzer> getMessageAnalyzer();

	/**
	 * Returns the value of the '<em><b>Rules Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules Dir</em>' attribute.
	 * @see #setRulesDir(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_RulesDir()
	 * @model
	 * @generated
	 */
	String getRulesDir();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.SMC#getRulesDir <em>Rules Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules Dir</em>' attribute.
	 * @see #getRulesDir()
	 * @generated
	 */
	void setRulesDir(String value);

	/**
	 * Returns the value of the '<em><b>Routing Rule File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Rule File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Rule File</em>' attribute.
	 * @see #setRoutingRuleFile(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_RoutingRuleFile()
	 * @model
	 * @generated
	 */
	String getRoutingRuleFile();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.SMC#getRoutingRuleFile <em>Routing Rule File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Rule File</em>' attribute.
	 * @see #getRoutingRuleFile()
	 * @generated
	 */
	void setRoutingRuleFile(String value);

	/**
	 * Returns the value of the '<em><b>Composite Rule File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Rule File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Rule File</em>' attribute.
	 * @see #setCompositeRuleFile(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_CompositeRuleFile()
	 * @model
	 * @generated
	 */
	String getCompositeRuleFile();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.SMC#getCompositeRuleFile <em>Composite Rule File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Rule File</em>' attribute.
	 * @see #getCompositeRuleFile()
	 * @generated
	 */
	void setCompositeRuleFile(String value);

	/**
	 * Returns the value of the '<em><b>Organizer Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizer Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizer Binding</em>' attribute.
	 * @see #setOrganizerBinding(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_OrganizerBinding()
	 * @model
	 * @generated
	 */
	String getOrganizerBinding();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.SMC#getOrganizerBinding <em>Organizer Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizer Binding</em>' attribute.
	 * @see #getOrganizerBinding()
	 * @generated
	 */
	void setOrganizerBinding(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.SMC#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fact</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.Fact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSMC_Fact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fact> getFact();

} // SMC
