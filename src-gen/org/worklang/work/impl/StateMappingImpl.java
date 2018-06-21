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
import org.worklang.work.StateDefinition;
import org.worklang.work.StateMapping;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.StateMappingImpl#getForeignState <em>Foreign State</em>}</li>
 *   <li>{@link org.worklang.work.impl.StateMappingImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.worklang.work.impl.StateMappingImpl#getLocalState <em>Local State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMappingImpl extends MinimalEObjectImpl.Container implements StateMapping
{
  /**
   * The cached value of the '{@link #getForeignState() <em>Foreign State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignState()
   * @generated
   * @ordered
   */
  protected StateDefinition foreignState;

  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected FieldDefinition field;

  /**
   * The cached value of the '{@link #getLocalState() <em>Local State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalState()
   * @generated
   * @ordered
   */
  protected StateDefinition localState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateMappingImpl()
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
    return WorkPackage.Literals.STATE_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDefinition getForeignState()
  {
    if (foreignState != null && foreignState.eIsProxy())
    {
      InternalEObject oldForeignState = (InternalEObject)foreignState;
      foreignState = (StateDefinition)eResolveProxy(oldForeignState);
      if (foreignState != oldForeignState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.STATE_MAPPING__FOREIGN_STATE, oldForeignState, foreignState));
      }
    }
    return foreignState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDefinition basicGetForeignState()
  {
    return foreignState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeignState(StateDefinition newForeignState)
  {
    StateDefinition oldForeignState = foreignState;
    foreignState = newForeignState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.STATE_MAPPING__FOREIGN_STATE, oldForeignState, foreignState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDefinition getField()
  {
    if (field != null && field.eIsProxy())
    {
      InternalEObject oldField = (InternalEObject)field;
      field = (FieldDefinition)eResolveProxy(oldField);
      if (field != oldField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.STATE_MAPPING__FIELD, oldField, field));
      }
    }
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDefinition basicGetField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(FieldDefinition newField)
  {
    FieldDefinition oldField = field;
    field = newField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.STATE_MAPPING__FIELD, oldField, field));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDefinition getLocalState()
  {
    if (localState != null && localState.eIsProxy())
    {
      InternalEObject oldLocalState = (InternalEObject)localState;
      localState = (StateDefinition)eResolveProxy(oldLocalState);
      if (localState != oldLocalState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.STATE_MAPPING__LOCAL_STATE, oldLocalState, localState));
      }
    }
    return localState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDefinition basicGetLocalState()
  {
    return localState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalState(StateDefinition newLocalState)
  {
    StateDefinition oldLocalState = localState;
    localState = newLocalState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.STATE_MAPPING__LOCAL_STATE, oldLocalState, localState));
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
      case WorkPackage.STATE_MAPPING__FOREIGN_STATE:
        if (resolve) return getForeignState();
        return basicGetForeignState();
      case WorkPackage.STATE_MAPPING__FIELD:
        if (resolve) return getField();
        return basicGetField();
      case WorkPackage.STATE_MAPPING__LOCAL_STATE:
        if (resolve) return getLocalState();
        return basicGetLocalState();
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
      case WorkPackage.STATE_MAPPING__FOREIGN_STATE:
        setForeignState((StateDefinition)newValue);
        return;
      case WorkPackage.STATE_MAPPING__FIELD:
        setField((FieldDefinition)newValue);
        return;
      case WorkPackage.STATE_MAPPING__LOCAL_STATE:
        setLocalState((StateDefinition)newValue);
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
      case WorkPackage.STATE_MAPPING__FOREIGN_STATE:
        setForeignState((StateDefinition)null);
        return;
      case WorkPackage.STATE_MAPPING__FIELD:
        setField((FieldDefinition)null);
        return;
      case WorkPackage.STATE_MAPPING__LOCAL_STATE:
        setLocalState((StateDefinition)null);
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
      case WorkPackage.STATE_MAPPING__FOREIGN_STATE:
        return foreignState != null;
      case WorkPackage.STATE_MAPPING__FIELD:
        return field != null;
      case WorkPackage.STATE_MAPPING__LOCAL_STATE:
        return localState != null;
    }
    return super.eIsSet(featureID);
  }

} //StateMappingImpl
