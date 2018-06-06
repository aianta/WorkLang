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

import org.worklang.work.Instruction;
import org.worklang.work.Space;
import org.worklang.work.TransitionID;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.InstructionImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.worklang.work.impl.InstructionImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.worklang.work.impl.InstructionImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction
{
  /**
   * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectType()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectType()
   * @generated
   * @ordered
   */
  protected String objectType = OBJECT_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpace() <em>Space</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpace()
   * @generated
   * @ordered
   */
  protected Space space;

  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected TransitionID transition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstructionImpl()
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
    return WorkPackage.Literals.INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjectType()
  {
    return objectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectType(String newObjectType)
  {
    String oldObjectType = objectType;
    objectType = newObjectType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INSTRUCTION__OBJECT_TYPE, oldObjectType, objectType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Space getSpace()
  {
    if (space != null && space.eIsProxy())
    {
      InternalEObject oldSpace = (InternalEObject)space;
      space = (Space)eResolveProxy(oldSpace);
      if (space != oldSpace)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.INSTRUCTION__SPACE, oldSpace, space));
      }
    }
    return space;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Space basicGetSpace()
  {
    return space;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpace(Space newSpace)
  {
    Space oldSpace = space;
    space = newSpace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INSTRUCTION__SPACE, oldSpace, space));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionID getTransition()
  {
    if (transition != null && transition.eIsProxy())
    {
      InternalEObject oldTransition = (InternalEObject)transition;
      transition = (TransitionID)eResolveProxy(oldTransition);
      if (transition != oldTransition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.INSTRUCTION__TRANSITION, oldTransition, transition));
      }
    }
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionID basicGetTransition()
  {
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransition(TransitionID newTransition)
  {
    TransitionID oldTransition = transition;
    transition = newTransition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INSTRUCTION__TRANSITION, oldTransition, transition));
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
      case WorkPackage.INSTRUCTION__OBJECT_TYPE:
        return getObjectType();
      case WorkPackage.INSTRUCTION__SPACE:
        if (resolve) return getSpace();
        return basicGetSpace();
      case WorkPackage.INSTRUCTION__TRANSITION:
        if (resolve) return getTransition();
        return basicGetTransition();
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
      case WorkPackage.INSTRUCTION__OBJECT_TYPE:
        setObjectType((String)newValue);
        return;
      case WorkPackage.INSTRUCTION__SPACE:
        setSpace((Space)newValue);
        return;
      case WorkPackage.INSTRUCTION__TRANSITION:
        setTransition((TransitionID)newValue);
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
      case WorkPackage.INSTRUCTION__OBJECT_TYPE:
        setObjectType(OBJECT_TYPE_EDEFAULT);
        return;
      case WorkPackage.INSTRUCTION__SPACE:
        setSpace((Space)null);
        return;
      case WorkPackage.INSTRUCTION__TRANSITION:
        setTransition((TransitionID)null);
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
      case WorkPackage.INSTRUCTION__OBJECT_TYPE:
        return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
      case WorkPackage.INSTRUCTION__SPACE:
        return space != null;
      case WorkPackage.INSTRUCTION__TRANSITION:
        return transition != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (objectType: ");
    result.append(objectType);
    result.append(')');
    return result.toString();
  }

} //InstructionImpl
