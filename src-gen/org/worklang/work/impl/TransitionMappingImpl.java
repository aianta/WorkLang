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
import org.worklang.work.TransitionID;
import org.worklang.work.TransitionMapping;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.TransitionMappingImpl#getForeignTransition <em>Foreign Transition</em>}</li>
 *   <li>{@link org.worklang.work.impl.TransitionMappingImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.worklang.work.impl.TransitionMappingImpl#getLocalTransition <em>Local Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionMappingImpl extends MinimalEObjectImpl.Container implements TransitionMapping
{
  /**
   * The cached value of the '{@link #getForeignTransition() <em>Foreign Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignTransition()
   * @generated
   * @ordered
   */
  protected TransitionID foreignTransition;

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
   * The cached value of the '{@link #getLocalTransition() <em>Local Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalTransition()
   * @generated
   * @ordered
   */
  protected TransitionID localTransition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionMappingImpl()
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
    return WorkPackage.Literals.TRANSITION_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionID getForeignTransition()
  {
    if (foreignTransition != null && foreignTransition.eIsProxy())
    {
      InternalEObject oldForeignTransition = (InternalEObject)foreignTransition;
      foreignTransition = (TransitionID)eResolveProxy(oldForeignTransition);
      if (foreignTransition != oldForeignTransition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.TRANSITION_MAPPING__FOREIGN_TRANSITION, oldForeignTransition, foreignTransition));
      }
    }
    return foreignTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionID basicGetForeignTransition()
  {
    return foreignTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeignTransition(TransitionID newForeignTransition)
  {
    TransitionID oldForeignTransition = foreignTransition;
    foreignTransition = newForeignTransition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_MAPPING__FOREIGN_TRANSITION, oldForeignTransition, foreignTransition));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.TRANSITION_MAPPING__FIELD, oldField, field));
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
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_MAPPING__FIELD, oldField, field));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionID getLocalTransition()
  {
    if (localTransition != null && localTransition.eIsProxy())
    {
      InternalEObject oldLocalTransition = (InternalEObject)localTransition;
      localTransition = (TransitionID)eResolveProxy(oldLocalTransition);
      if (localTransition != oldLocalTransition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.TRANSITION_MAPPING__LOCAL_TRANSITION, oldLocalTransition, localTransition));
      }
    }
    return localTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionID basicGetLocalTransition()
  {
    return localTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalTransition(TransitionID newLocalTransition)
  {
    TransitionID oldLocalTransition = localTransition;
    localTransition = newLocalTransition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_MAPPING__LOCAL_TRANSITION, oldLocalTransition, localTransition));
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
      case WorkPackage.TRANSITION_MAPPING__FOREIGN_TRANSITION:
        if (resolve) return getForeignTransition();
        return basicGetForeignTransition();
      case WorkPackage.TRANSITION_MAPPING__FIELD:
        if (resolve) return getField();
        return basicGetField();
      case WorkPackage.TRANSITION_MAPPING__LOCAL_TRANSITION:
        if (resolve) return getLocalTransition();
        return basicGetLocalTransition();
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
      case WorkPackage.TRANSITION_MAPPING__FOREIGN_TRANSITION:
        setForeignTransition((TransitionID)newValue);
        return;
      case WorkPackage.TRANSITION_MAPPING__FIELD:
        setField((FieldDefinition)newValue);
        return;
      case WorkPackage.TRANSITION_MAPPING__LOCAL_TRANSITION:
        setLocalTransition((TransitionID)newValue);
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
      case WorkPackage.TRANSITION_MAPPING__FOREIGN_TRANSITION:
        setForeignTransition((TransitionID)null);
        return;
      case WorkPackage.TRANSITION_MAPPING__FIELD:
        setField((FieldDefinition)null);
        return;
      case WorkPackage.TRANSITION_MAPPING__LOCAL_TRANSITION:
        setLocalTransition((TransitionID)null);
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
      case WorkPackage.TRANSITION_MAPPING__FOREIGN_TRANSITION:
        return foreignTransition != null;
      case WorkPackage.TRANSITION_MAPPING__FIELD:
        return field != null;
      case WorkPackage.TRANSITION_MAPPING__LOCAL_TRANSITION:
        return localTransition != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionMappingImpl
