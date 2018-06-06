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

import org.worklang.work.StateDefinition;
import org.worklang.work.StateID;
import org.worklang.work.WithStatesDefinition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.StateDefinitionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.worklang.work.impl.StateDefinitionImpl#getState <em>State</em>}</li>
 *   <li>{@link org.worklang.work.impl.StateDefinitionImpl#getWithDefinition <em>With Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateDefinitionImpl extends MinimalEObjectImpl.Container implements StateDefinition
{
  /**
   * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected String object = OBJECT_EDEFAULT;

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
   * The cached value of the '{@link #getWithDefinition() <em>With Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWithDefinition()
   * @generated
   * @ordered
   */
  protected WithStatesDefinition withDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateDefinitionImpl()
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
    return WorkPackage.Literals.STATE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(String newObject)
  {
    String oldObject = object;
    object = newObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.STATE_DEFINITION__OBJECT, oldObject, object));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.STATE_DEFINITION__STATE, oldState, newState);
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
        msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.STATE_DEFINITION__STATE, null, msgs);
      if (newState != null)
        msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.STATE_DEFINITION__STATE, null, msgs);
      msgs = basicSetState(newState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.STATE_DEFINITION__STATE, newState, newState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithStatesDefinition getWithDefinition()
  {
    return withDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWithDefinition(WithStatesDefinition newWithDefinition, NotificationChain msgs)
  {
    WithStatesDefinition oldWithDefinition = withDefinition;
    withDefinition = newWithDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.STATE_DEFINITION__WITH_DEFINITION, oldWithDefinition, newWithDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWithDefinition(WithStatesDefinition newWithDefinition)
  {
    if (newWithDefinition != withDefinition)
    {
      NotificationChain msgs = null;
      if (withDefinition != null)
        msgs = ((InternalEObject)withDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.STATE_DEFINITION__WITH_DEFINITION, null, msgs);
      if (newWithDefinition != null)
        msgs = ((InternalEObject)newWithDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.STATE_DEFINITION__WITH_DEFINITION, null, msgs);
      msgs = basicSetWithDefinition(newWithDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.STATE_DEFINITION__WITH_DEFINITION, newWithDefinition, newWithDefinition));
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
      case WorkPackage.STATE_DEFINITION__STATE:
        return basicSetState(null, msgs);
      case WorkPackage.STATE_DEFINITION__WITH_DEFINITION:
        return basicSetWithDefinition(null, msgs);
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
      case WorkPackage.STATE_DEFINITION__OBJECT:
        return getObject();
      case WorkPackage.STATE_DEFINITION__STATE:
        return getState();
      case WorkPackage.STATE_DEFINITION__WITH_DEFINITION:
        return getWithDefinition();
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
      case WorkPackage.STATE_DEFINITION__OBJECT:
        setObject((String)newValue);
        return;
      case WorkPackage.STATE_DEFINITION__STATE:
        setState((StateID)newValue);
        return;
      case WorkPackage.STATE_DEFINITION__WITH_DEFINITION:
        setWithDefinition((WithStatesDefinition)newValue);
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
      case WorkPackage.STATE_DEFINITION__OBJECT:
        setObject(OBJECT_EDEFAULT);
        return;
      case WorkPackage.STATE_DEFINITION__STATE:
        setState((StateID)null);
        return;
      case WorkPackage.STATE_DEFINITION__WITH_DEFINITION:
        setWithDefinition((WithStatesDefinition)null);
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
      case WorkPackage.STATE_DEFINITION__OBJECT:
        return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
      case WorkPackage.STATE_DEFINITION__STATE:
        return state != null;
      case WorkPackage.STATE_DEFINITION__WITH_DEFINITION:
        return withDefinition != null;
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
    result.append(" (object: ");
    result.append(object);
    result.append(')');
    return result.toString();
  }

} //StateDefinitionImpl
