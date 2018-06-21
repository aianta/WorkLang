/**
 * Copyright 2018 Alexandru Ianta
 *  
 * 	Licensed under the Apache License, Version 2.0 (the "License"); 
 * 	you may not use this file except in compliance with the License.
 * 	You may obtain a copy of the License at
 *  
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 */
package org.worklang.work.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.worklang.work.FieldDefinition;
import org.worklang.work.ReferenceTransition;
import org.worklang.work.TransitionDefinition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.ReferenceTransitionImpl#getRefTransition <em>Ref Transition</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferenceTransitionImpl#getForeignField <em>Foreign Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceTransitionImpl extends MinimalEObjectImpl.Container implements ReferenceTransition
{
  /**
   * The cached value of the '{@link #getRefTransition() <em>Ref Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTransition()
   * @generated
   * @ordered
   */
  protected TransitionDefinition refTransition;

  /**
   * The cached value of the '{@link #getForeignField() <em>Foreign Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignField()
   * @generated
   * @ordered
   */
  protected FieldDefinition foreignField;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceTransitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WorkPackage.Literals.REFERENCE_TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionDefinition getRefTransition()
  {
    if (refTransition != null && refTransition.eIsProxy())
    {
      InternalEObject oldRefTransition = (InternalEObject)refTransition;
      refTransition = (TransitionDefinition)eResolveProxy(oldRefTransition);
      if (refTransition != oldRefTransition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION, oldRefTransition, refTransition));
      }
    }
    return refTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionDefinition basicGetRefTransition()
  {
    return refTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefTransition(TransitionDefinition newRefTransition)
  {
    TransitionDefinition oldRefTransition = refTransition;
    refTransition = newRefTransition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION, oldRefTransition, refTransition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDefinition getForeignField()
  {
    if (foreignField != null && foreignField.eIsProxy())
    {
      InternalEObject oldForeignField = (InternalEObject)foreignField;
      foreignField = (FieldDefinition)eResolveProxy(oldForeignField);
      if (foreignField != oldForeignField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.REFERENCE_TRANSITION__FOREIGN_FIELD, oldForeignField, foreignField));
      }
    }
    return foreignField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDefinition basicGetForeignField()
  {
    return foreignField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeignField(FieldDefinition newForeignField)
  {
    FieldDefinition oldForeignField = foreignField;
    foreignField = newForeignField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_TRANSITION__FOREIGN_FIELD, oldForeignField, foreignField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION:
        if (resolve) return getRefTransition();
        return basicGetRefTransition();
      case WorkPackage.REFERENCE_TRANSITION__FOREIGN_FIELD:
        if (resolve) return getForeignField();
        return basicGetForeignField();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION:
        setRefTransition((TransitionDefinition)newValue);
        return;
      case WorkPackage.REFERENCE_TRANSITION__FOREIGN_FIELD:
        setForeignField((FieldDefinition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION:
        setRefTransition((TransitionDefinition)null);
        return;
      case WorkPackage.REFERENCE_TRANSITION__FOREIGN_FIELD:
        setForeignField((FieldDefinition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION:
        return refTransition != null;
      case WorkPackage.REFERENCE_TRANSITION__FOREIGN_FIELD:
        return foreignField != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferenceTransitionImpl
