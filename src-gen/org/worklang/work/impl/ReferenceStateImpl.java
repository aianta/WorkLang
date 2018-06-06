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

import org.worklang.work.FromFieldDefinition;
import org.worklang.work.ReferenceState;
import org.worklang.work.StateID;
import org.worklang.work.WithStatesDefinition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.ReferenceStateImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferenceStateImpl#getRefState <em>Ref State</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferenceStateImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferenceStateImpl#getState <em>State</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferenceStateImpl#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceStateImpl extends MinimalEObjectImpl.Container implements ReferenceState
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
   * The cached value of the '{@link #getRefState() <em>Ref State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefState()
   * @generated
   * @ordered
   */
  protected StateID refState;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected FromFieldDefinition from;

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
   * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposition()
   * @generated
   * @ordered
   */
  protected WithStatesDefinition composition;

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
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_STATE__OBJECT, oldObject, object));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateID getRefState()
  {
    if (refState != null && refState.eIsProxy())
    {
      InternalEObject oldRefState = (InternalEObject)refState;
      refState = (StateID)eResolveProxy(oldRefState);
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
  public StateID basicGetRefState()
  {
    return refState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefState(StateID newRefState)
  {
    StateID oldRefState = refState;
    refState = newRefState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_STATE__REF_STATE, oldRefState, refState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromFieldDefinition getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFrom(FromFieldDefinition newFrom, NotificationChain msgs)
  {
    FromFieldDefinition oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_STATE__FROM, oldFrom, newFrom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(FromFieldDefinition newFrom)
  {
    if (newFrom != from)
    {
      NotificationChain msgs = null;
      if (from != null)
        msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_STATE__FROM, null, msgs);
      if (newFrom != null)
        msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_STATE__FROM, null, msgs);
      msgs = basicSetFrom(newFrom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_STATE__FROM, newFrom, newFrom));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_STATE__STATE, oldState, newState);
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
        msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_STATE__STATE, null, msgs);
      if (newState != null)
        msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_STATE__STATE, null, msgs);
      msgs = basicSetState(newState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_STATE__STATE, newState, newState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithStatesDefinition getComposition()
  {
    return composition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComposition(WithStatesDefinition newComposition, NotificationChain msgs)
  {
    WithStatesDefinition oldComposition = composition;
    composition = newComposition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_STATE__COMPOSITION, oldComposition, newComposition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposition(WithStatesDefinition newComposition)
  {
    if (newComposition != composition)
    {
      NotificationChain msgs = null;
      if (composition != null)
        msgs = ((InternalEObject)composition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_STATE__COMPOSITION, null, msgs);
      if (newComposition != null)
        msgs = ((InternalEObject)newComposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_STATE__COMPOSITION, null, msgs);
      msgs = basicSetComposition(newComposition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_STATE__COMPOSITION, newComposition, newComposition));
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
      case WorkPackage.REFERENCE_STATE__FROM:
        return basicSetFrom(null, msgs);
      case WorkPackage.REFERENCE_STATE__STATE:
        return basicSetState(null, msgs);
      case WorkPackage.REFERENCE_STATE__COMPOSITION:
        return basicSetComposition(null, msgs);
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
      case WorkPackage.REFERENCE_STATE__OBJECT:
        return getObject();
      case WorkPackage.REFERENCE_STATE__REF_STATE:
        if (resolve) return getRefState();
        return basicGetRefState();
      case WorkPackage.REFERENCE_STATE__FROM:
        return getFrom();
      case WorkPackage.REFERENCE_STATE__STATE:
        return getState();
      case WorkPackage.REFERENCE_STATE__COMPOSITION:
        return getComposition();
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
      case WorkPackage.REFERENCE_STATE__OBJECT:
        setObject((String)newValue);
        return;
      case WorkPackage.REFERENCE_STATE__REF_STATE:
        setRefState((StateID)newValue);
        return;
      case WorkPackage.REFERENCE_STATE__FROM:
        setFrom((FromFieldDefinition)newValue);
        return;
      case WorkPackage.REFERENCE_STATE__STATE:
        setState((StateID)newValue);
        return;
      case WorkPackage.REFERENCE_STATE__COMPOSITION:
        setComposition((WithStatesDefinition)newValue);
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
      case WorkPackage.REFERENCE_STATE__OBJECT:
        setObject(OBJECT_EDEFAULT);
        return;
      case WorkPackage.REFERENCE_STATE__REF_STATE:
        setRefState((StateID)null);
        return;
      case WorkPackage.REFERENCE_STATE__FROM:
        setFrom((FromFieldDefinition)null);
        return;
      case WorkPackage.REFERENCE_STATE__STATE:
        setState((StateID)null);
        return;
      case WorkPackage.REFERENCE_STATE__COMPOSITION:
        setComposition((WithStatesDefinition)null);
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
      case WorkPackage.REFERENCE_STATE__OBJECT:
        return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
      case WorkPackage.REFERENCE_STATE__REF_STATE:
        return refState != null;
      case WorkPackage.REFERENCE_STATE__FROM:
        return from != null;
      case WorkPackage.REFERENCE_STATE__STATE:
        return state != null;
      case WorkPackage.REFERENCE_STATE__COMPOSITION:
        return composition != null;
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

} //ReferenceStateImpl
