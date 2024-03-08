/*******************************************************************************
 * Copyright (c) 2007, 2010 BMW Car IT, Technische Universitaet Muenchen, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * BMW Car IT - Initial API and implementation
 * Technische Universitaet Muenchen - Major refactoring and extension
 *******************************************************************************/
package org.eclipse.emf.edapt.spi.history.provider;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edapt.declaration.Operation;
import org.eclipse.emf.edapt.history.provider.util.HistoryUIUtils;
import org.eclipse.emf.edapt.spi.history.HistoryPackage;
import org.eclipse.emf.edapt.spi.history.OperationChange;
import org.eclipse.emf.edapt.spi.history.OperationInstance;
import org.eclipse.emf.edapt.spi.history.ParameterInstance;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.edapt.spi.history.OperationChange} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OperationChangeItemProvider
	extends CompositeChangeItemProvider
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
	 *
	 * @generated
	 */
	public OperationChangeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns OperationChange.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OperationChange")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		final OperationChange element = (OperationChange) object;
		final OperationInstance operationInstance = element.getOperation();
		final Operation operation = operationInstance.getOperation();

		String result = "("; //$NON-NLS-1$
		for (final Iterator<ParameterInstance> i = operationInstance.getParameters()
			.iterator(); i.hasNext();) {
			result += getLabel(i.next());
			if (i.hasNext()) {
				result += ", "; //$NON-NLS-1$
			}
		}
		result += ")"; //$NON-NLS-1$

		final String label = "Operation \"" + operation.getLabel() //$NON-NLS-1$
			+ "\" has been executed " + result; //$NON-NLS-1$
		return label;
	}

	/**
	 * Get the textual representation of the instance of a parameter
	 *
	 * @param parameterInstance
	 * @return Textual representation
	 */
	private String getLabel(ParameterInstance parameterInstance) {
		final Object o = parameterInstance.getValue();
		if (o instanceof List) {
			String result = "["; //$NON-NLS-1$
			for (final Iterator i = ((List) o).iterator(); i.hasNext();) {
				final Object element = i.next();
				if (element instanceof EObject) {
					result += HistoryUIUtils.getBracedLabel(element);
				} else {
					result += HistoryUIUtils.getLabel(element);
				}
				if (i.hasNext()) {
					result += ", "; //$NON-NLS-1$
				}
			}
			result += "]"; //$NON-NLS-1$
			return parameterInstance.getName() + " = " + result; //$NON-NLS-1$
		}
		if (o instanceof EObject) {
			return parameterInstance.getName() + " = " //$NON-NLS-1$
				+ HistoryUIUtils.getBracedLabel(o);
		}
		return parameterInstance.getName() + " = " //$NON-NLS-1$
			+ HistoryUIUtils.getLabel(o);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(OperationChange.class)) {
		case HistoryPackage.OPERATION_CHANGE__OPERATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}
}
