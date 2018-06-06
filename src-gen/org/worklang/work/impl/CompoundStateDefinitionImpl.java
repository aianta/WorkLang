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

import org.worklang.work.CompoundStateDefinition;
import org.worklang.work.StateID;
import org.worklang.work.WithStatesDefinition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound State Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.CompoundStateDefinitionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.worklang.work.impl.CompoundStateDefinitionImpl#getState <em>State</em>}</li>
 *   <li>{@link org.worklang.work.impl.CompoundStateDefinitionImpl#getCompoundStateDef <em>Compound State Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundStateDefinitionImpl extends MinimalEObjectImpl.Container implements CompoundStateDefinition
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
   * The cached value of the '{@link #getCompoundStateDef() <em>Compound State Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompoundStateDef()
   * @generated
   * @ordered
   */
  protected WithStatesDefinition compoundStateDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompoundStateDefinitionImpl()
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
    return WorkPackage.Literals.COMPOUND_STATE_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.COMPOUND_STATE_DEFINITION__OBJECT, oldObject, object));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.COMPOUND_STATE_DEFINITION__STATE, oldState, newState);
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
        msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.COMPOUND_STATE_DEFINITION__STATE, null, msgs);
      if (newState != null)
        msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.COMPOUND_STATE_DEFINITION__STATE, null, msgs);
      msgs = basicSetState(newState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.COMPOUND_STATE_DEFINITION__STATE, newState, newState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithStatesDefinition getCompoundStateDef()
  {
    return compoundStateDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompoundStateDef(WithStatesDefinition newCompoundStateDef, NotificationChain msgs)
  {
    WithStatesDefinition oldCompoundStateDef = compoundStateDef;
    compoundStateDef = newCompoundStateDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF, oldCompoundStateDef, newCompoundStateDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompoundStateDef(WithStatesDefinition newCompoundStateDef)
  {
    if (newCompoundStateDef != compoundStateDef)
    {
      NotificationChain msgs = null;
      if (compoundStateDef != null)
        msgs = ((InternalEObject)compoundStateDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF, null, msgs);
      if (newCompoundStateDef != null)
        msgs = ((InternalEObject)newCompoundStateDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF, null, msgs);
      msgs = basicSetCompoundStateDef(newCompoundStateDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF, newCompoundStateDef, newCompoundStateDef));
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
      case WorkPackage.COMPOUND_STATE_DEFINITION__STATE:
        return basicSetState(null, msgs);
      case WorkPackage.COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF:
        return basicSetCompoundStateDef(null, msgs);
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
      case WorkPackage.COMPOUND_STATE_DEFINITION__OBJECT:
        return getObject();
      case WorkPackage.COMPOUND_STATE_DEFINITION__STATE:
        return getState();
      case WorkPackage.COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF:
        return getCompoundStateDef();
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
      case WorkPackage.COMPOUND_STATE_DEFINITION__OBJECT:
        setObject((String)newValue);
        return;
      case WorkPackage.COMPOUND_STATE_DEFINITION__STATE:
        setState((StateID)newValue);
        return;
      case WorkPackage.COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF:
        setCompoundStateDef((WithStatesDefinition)newValue);
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
      case WorkPackage.COMPOUND_STATE_DEFINITION__OBJECT:
        setObject(OBJECT_EDEFAULT);
        return;
      case WorkPackage.COMPOUND_STATE_DEFINITION__STATE:
        setState((StateID)null);
        return;
      case WorkPackage.COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF:
        setCompoundStateDef((WithStatesDefinition)null);
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
      case WorkPackage.COMPOUND_STATE_DEFINITION__OBJECT:
        return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
      case WorkPackage.COMPOUND_STATE_DEFINITION__STATE:
        return state != null;
      case WorkPackage.COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF:
        return compoundStateDef != null;
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

} //CompoundStateDefinitionImpl
