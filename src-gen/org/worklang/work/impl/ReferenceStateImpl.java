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
import org.worklang.work.ReferenceState;
import org.worklang.work.StateDefinition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.ReferenceStateImpl#getRefState <em>Ref State</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferenceStateImpl#getForeignField <em>Foreign Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceStateImpl extends MinimalEObjectImpl.Container implements ReferenceState
{
  /**
   * The cached value of the '{@link #getRefState() <em>Ref State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefState()
   * @generated
   * @ordered
   */
  protected StateDefinition refState;

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
  protected ReferenceStateImpl()
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
    return WorkPackage.Literals.REFERENCE_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDefinition getRefState()
  {
    if (refState != null && refState.eIsProxy())
    {
      InternalEObject oldRefState = (InternalEObject)refState;
      refState = (StateDefinition)eResolveProxy(oldRefState);
      if (refState != oldRefState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.REFERENCE_STATE__REF_STATE, oldRefState, refState));
      }
    }
    return refState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDefinition basicGetRefState()
  {
    return refState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefState(StateDefinition newRefState)
  {
    StateDefinition oldRefState = refState;
    refState = newRefState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_STATE__REF_STATE, oldRefState, refState));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.REFERENCE_STATE__FOREIGN_FIELD, oldForeignField, foreignField));
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
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_STATE__FOREIGN_FIELD, oldForeignField, foreignField));
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
      case WorkPackage.REFERENCE_STATE__REF_STATE:
        if (resolve) return getRefState();
        return basicGetRefState();
      case WorkPackage.REFERENCE_STATE__FOREIGN_FIELD:
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
      case WorkPackage.REFERENCE_STATE__REF_STATE:
        setRefState((StateDefinition)newValue);
        return;
      case WorkPackage.REFERENCE_STATE__FOREIGN_FIELD:
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
      case WorkPackage.REFERENCE_STATE__REF_STATE:
        setRefState((StateDefinition)null);
        return;
      case WorkPackage.REFERENCE_STATE__FOREIGN_FIELD:
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
      case WorkPackage.REFERENCE_STATE__REF_STATE:
        return refState != null;
      case WorkPackage.REFERENCE_STATE__FOREIGN_FIELD:
        return foreignField != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferenceStateImpl
