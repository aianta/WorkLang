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

import org.worklang.work.Instance;
import org.worklang.work.StateDeclaration;
import org.worklang.work.StateInstance;
import org.worklang.work.TransitionDeclaration;
import org.worklang.work.TransitionInstance;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.InstanceImpl#getInstanceDef <em>Instance Def</em>}</li>
 *   <li>{@link org.worklang.work.impl.InstanceImpl#getTransitionDeclaration <em>Transition Declaration</em>}</li>
 *   <li>{@link org.worklang.work.impl.InstanceImpl#getStateDeclaration <em>State Declaration</em>}</li>
 *   <li>{@link org.worklang.work.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.worklang.work.impl.InstanceImpl#getState <em>State</em>}</li>
 *   <li>{@link org.worklang.work.impl.InstanceImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends MinimalEObjectImpl.Container implements Instance
{
  /**
   * The default value of the '{@link #getInstanceDef() <em>Instance Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstanceDef()
   * @generated
   * @ordered
   */
  protected static final String INSTANCE_DEF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInstanceDef() <em>Instance Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstanceDef()
   * @generated
   * @ordered
   */
  protected String instanceDef = INSTANCE_DEF_EDEFAULT;

  /**
   * The cached value of the '{@link #getTransitionDeclaration() <em>Transition Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionDeclaration()
   * @generated
   * @ordered
   */
  protected TransitionDeclaration transitionDeclaration;

  /**
   * The cached value of the '{@link #getStateDeclaration() <em>State Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateDeclaration()
   * @generated
   * @ordered
   */
  protected StateDeclaration stateDeclaration;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected StateInstance state;

  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected TransitionInstance transition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceImpl()
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
    return WorkPackage.Literals.INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInstanceDef()
  {
    return instanceDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstanceDef(String newInstanceDef)
  {
    String oldInstanceDef = instanceDef;
    instanceDef = newInstanceDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCE__INSTANCE_DEF, oldInstanceDef, instanceDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionDeclaration getTransitionDeclaration()
  {
    return transitionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransitionDeclaration(TransitionDeclaration newTransitionDeclaration, NotificationChain msgs)
  {
    TransitionDeclaration oldTransitionDeclaration = transitionDeclaration;
    transitionDeclaration = newTransitionDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCE__TRANSITION_DECLARATION, oldTransitionDeclaration, newTransitionDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransitionDeclaration(TransitionDeclaration newTransitionDeclaration)
  {
    if (newTransitionDeclaration != transitionDeclaration)
    {
      NotificationChain msgs = null;
      if (transitionDeclaration != null)
        msgs = ((InternalEObject)transitionDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.INSTANCE__TRANSITION_DECLARATION, null, msgs);
      if (newTransitionDeclaration != null)
        msgs = ((InternalEObject)newTransitionDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.INSTANCE__TRANSITION_DECLARATION, null, msgs);
      msgs = basicSetTransitionDeclaration(newTransitionDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCE__TRANSITION_DECLARATION, newTransitionDeclaration, newTransitionDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDeclaration getStateDeclaration()
  {
    return stateDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStateDeclaration(StateDeclaration newStateDeclaration, NotificationChain msgs)
  {
    StateDeclaration oldStateDeclaration = stateDeclaration;
    stateDeclaration = newStateDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCE__STATE_DECLARATION, oldStateDeclaration, newStateDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateDeclaration(StateDeclaration newStateDeclaration)
  {
    if (newStateDeclaration != stateDeclaration)
    {
      NotificationChain msgs = null;
      if (stateDeclaration != null)
        msgs = ((InternalEObject)stateDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.INSTANCE__STATE_DECLARATION, null, msgs);
      if (newStateDeclaration != null)
        msgs = ((InternalEObject)newStateDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.INSTANCE__STATE_DECLARATION, null, msgs);
      msgs = basicSetStateDeclaration(newStateDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCE__STATE_DECLARATION, newStateDeclaration, newStateDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateInstance getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetState(StateInstance newState, NotificationChain msgs)
  {
    StateInstance oldState = state;
    state = newState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCE__STATE, oldState, newState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(StateInstance newState)
  {
    if (newState != state)
    {
      NotificationChain msgs = null;
      if (state != null)
        msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.INSTANCE__STATE, null, msgs);
      if (newState != null)
        msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.INSTANCE__STATE, null, msgs);
      msgs = basicSetState(newState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCE__STATE, newState, newState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionInstance getTransition()
  {
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransition(TransitionInstance newTransition, NotificationChain msgs)
  {
    TransitionInstance oldTransition = transition;
    transition = newTransition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCE__TRANSITION, oldTransition, newTransition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransition(TransitionInstance newTransition)
  {
    if (newTransition != transition)
    {
      NotificationChain msgs = null;
      if (transition != null)
        msgs = ((InternalEObject)transition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.INSTANCE__TRANSITION, null, msgs);
      if (newTransition != null)
        msgs = ((InternalEObject)newTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.INSTANCE__TRANSITION, null, msgs);
      msgs = basicSetTransition(newTransition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCE__TRANSITION, newTransition, newTransition));
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
      case WorkPackage.INSTANCE__TRANSITION_DECLARATION:
        return basicSetTransitionDeclaration(null, msgs);
      case WorkPackage.INSTANCE__STATE_DECLARATION:
        return basicSetStateDeclaration(null, msgs);
      case WorkPackage.INSTANCE__STATE:
        return basicSetState(null, msgs);
      case WorkPackage.INSTANCE__TRANSITION:
        return basicSetTransition(null, msgs);
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
      case WorkPackage.INSTANCE__INSTANCE_DEF:
        return getInstanceDef();
      case WorkPackage.INSTANCE__TRANSITION_DECLARATION:
        return getTransitionDeclaration();
      case WorkPackage.INSTANCE__STATE_DECLARATION:
        return getStateDeclaration();
      case WorkPackage.INSTANCE__NAME:
        return getName();
      case WorkPackage.INSTANCE__STATE:
        return getState();
      case WorkPackage.INSTANCE__TRANSITION:
        return getTransition();
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
      case WorkPackage.INSTANCE__INSTANCE_DEF:
        setInstanceDef((String)newValue);
        return;
      case WorkPackage.INSTANCE__TRANSITION_DECLARATION:
        setTransitionDeclaration((TransitionDeclaration)newValue);
        return;
      case WorkPackage.INSTANCE__STATE_DECLARATION:
        setStateDeclaration((StateDeclaration)newValue);
        return;
      case WorkPackage.INSTANCE__NAME:
        setName((String)newValue);
        return;
      case WorkPackage.INSTANCE__STATE:
        setState((StateInstance)newValue);
        return;
      case WorkPackage.INSTANCE__TRANSITION:
        setTransition((TransitionInstance)newValue);
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
      case WorkPackage.INSTANCE__INSTANCE_DEF:
        setInstanceDef(INSTANCE_DEF_EDEFAULT);
        return;
      case WorkPackage.INSTANCE__TRANSITION_DECLARATION:
        setTransitionDeclaration((TransitionDeclaration)null);
        return;
      case WorkPackage.INSTANCE__STATE_DECLARATION:
        setStateDeclaration((StateDeclaration)null);
        return;
      case WorkPackage.INSTANCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WorkPackage.INSTANCE__STATE:
        setState((StateInstance)null);
        return;
      case WorkPackage.INSTANCE__TRANSITION:
        setTransition((TransitionInstance)null);
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
      case WorkPackage.INSTANCE__INSTANCE_DEF:
        return INSTANCE_DEF_EDEFAULT == null ? instanceDef != null : !INSTANCE_DEF_EDEFAULT.equals(instanceDef);
      case WorkPackage.INSTANCE__TRANSITION_DECLARATION:
        return transitionDeclaration != null;
      case WorkPackage.INSTANCE__STATE_DECLARATION:
        return stateDeclaration != null;
      case WorkPackage.INSTANCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WorkPackage.INSTANCE__STATE:
        return state != null;
      case WorkPackage.INSTANCE__TRANSITION:
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
    result.append(" (instanceDef: ");
    result.append(instanceDef);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //InstanceImpl
