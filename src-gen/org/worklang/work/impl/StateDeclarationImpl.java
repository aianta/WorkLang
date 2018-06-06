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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.worklang.work.StateDeclaration;
import org.worklang.work.StateID;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.StateDeclarationImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.worklang.work.impl.StateDeclarationImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateDeclarationImpl extends MinimalEObjectImpl.Container implements StateDeclaration
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
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected StateID state;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateDeclarationImpl()
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
    return WorkPackage.Literals.STATE_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.STATE_DECLARATION__OBJECT_TYPE, oldObjectType, objectType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateID getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetState(StateID newState, NotificationChain msgs)
  {
    StateID oldState = state;
    state = newState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.STATE_DECLARATION__STATE, oldState, newState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(StateID newState)
  {
    if (newState != state)
    {
      NotificationChain msgs = null;
      if (state != null)
        msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.STATE_DECLARATION__STATE, null, msgs);
      if (newState != null)
        msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.STATE_DECLARATION__STATE, null, msgs);
      msgs = basicSetState(newState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.STATE_DECLARATION__STATE, newState, newState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WorkPackage.STATE_DECLARATION__STATE:
        return basicSetState(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case WorkPackage.STATE_DECLARATION__OBJECT_TYPE:
        return getObjectType();
      case WorkPackage.STATE_DECLARATION__STATE:
        return getState();
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
      case WorkPackage.STATE_DECLARATION__OBJECT_TYPE:
        setObjectType((String)newValue);
        return;
      case WorkPackage.STATE_DECLARATION__STATE:
        setState((StateID)newValue);
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
      case WorkPackage.STATE_DECLARATION__OBJECT_TYPE:
        setObjectType(OBJECT_TYPE_EDEFAULT);
        return;
      case WorkPackage.STATE_DECLARATION__STATE:
        setState((StateID)null);
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
      case WorkPackage.STATE_DECLARATION__OBJECT_TYPE:
        return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
      case WorkPackage.STATE_DECLARATION__STATE:
        return state != null;
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

} //StateDeclarationImpl
