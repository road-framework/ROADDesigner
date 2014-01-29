/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.provider;


import au.edu.swin.ict.road.designer.smc.SMC;
import au.edu.swin.ict.road.designer.smc.SmcFactory;
import au.edu.swin.ict.road.designer.smc.SmcPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link au.edu.swin.ict.road.designer.smc.SMC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SMCItemProvider
	extends PlayerItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMCItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRulesDirPropertyDescriptor(object);
			addRoutingRuleFilePropertyDescriptor(object);
			addCompositeRuleFilePropertyDescriptor(object);
			addOrganizerBindingPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Rules Dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRulesDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SMC_rulesDir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SMC_rulesDir_feature", "_UI_SMC_type"),
				 SmcPackage.Literals.SMC__RULES_DIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Routing Rule File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoutingRuleFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SMC_routingRuleFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SMC_routingRuleFile_feature", "_UI_SMC_type"),
				 SmcPackage.Literals.SMC__ROUTING_RULE_FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Composite Rule File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompositeRuleFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SMC_compositeRuleFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SMC_compositeRuleFile_feature", "_UI_SMC_type"),
				 SmcPackage.Literals.SMC__COMPOSITE_RULE_FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Organizer Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizerBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SMC_OrganizerBinding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SMC_OrganizerBinding_feature", "_UI_SMC_type"),
				 SmcPackage.Literals.SMC__ORGANIZER_BINDING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SMC_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SMC_Description_feature", "_UI_SMC_type"),
				 SmcPackage.Literals.SMC__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SmcPackage.Literals.SMC__ROLE);
			childrenFeatures.add(SmcPackage.Literals.SMC__CONTRACT);
			childrenFeatures.add(SmcPackage.Literals.SMC__PROCESS_DEFINITION);
			childrenFeatures.add(SmcPackage.Literals.SMC__BEHAVIOR_TERM);
			childrenFeatures.add(SmcPackage.Literals.SMC__PLAYER_BINDING);
			childrenFeatures.add(SmcPackage.Literals.SMC__MESSAGE_ANALYZER);
			childrenFeatures.add(SmcPackage.Literals.SMC__FACT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SMC.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SMC"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SMC)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SMC_type") :
			getString("_UI_SMC_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SMC.class)) {
			case SmcPackage.SMC__RULES_DIR:
			case SmcPackage.SMC__ROUTING_RULE_FILE:
			case SmcPackage.SMC__COMPOSITE_RULE_FILE:
			case SmcPackage.SMC__ORGANIZER_BINDING:
			case SmcPackage.SMC__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SmcPackage.SMC__ROLE:
			case SmcPackage.SMC__CONTRACT:
			case SmcPackage.SMC__PROCESS_DEFINITION:
			case SmcPackage.SMC__BEHAVIOR_TERM:
			case SmcPackage.SMC__PLAYER_BINDING:
			case SmcPackage.SMC__MESSAGE_ANALYZER:
			case SmcPackage.SMC__FACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SmcPackage.Literals.SMC__ROLE,
				 SmcFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(SmcPackage.Literals.SMC__CONTRACT,
				 SmcFactory.eINSTANCE.createContract()));

		newChildDescriptors.add
			(createChildParameter
				(SmcPackage.Literals.SMC__PROCESS_DEFINITION,
				 SmcFactory.eINSTANCE.createProcessDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SmcPackage.Literals.SMC__BEHAVIOR_TERM,
				 SmcFactory.eINSTANCE.createBehaviorTerm()));

		newChildDescriptors.add
			(createChildParameter
				(SmcPackage.Literals.SMC__PLAYER_BINDING,
				 SmcFactory.eINSTANCE.createPlayerBinding()));

		newChildDescriptors.add
			(createChildParameter
				(SmcPackage.Literals.SMC__MESSAGE_ANALYZER,
				 SmcFactory.eINSTANCE.createMessageAnalyzer()));

		newChildDescriptors.add
			(createChildParameter
				(SmcPackage.Literals.SMC__FACT,
				 SmcFactory.eINSTANCE.createFact()));
	}

}
