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
import org.worklang.work.Transition;
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
 *   <li>{@link org.worklang.work.impl.InstanceImpl#getConceptualTransition <em>Conceptual Transition</em>}</li>
 *   <li>{@link org.worklang.work.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.worklang.work.impl.InstanceImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends MinimalEObjectImpl.Container implements Instance
{
  /**
   * The cached value of the '{@link #getConceptualTransition() <em>Conceptual Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConceptualTransition()
   * @generated
   * @ordered
   */
  protected Transition conceptualTransition;

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
  public Transition getConceptualTransition()
  {
    if (conceptualTransition != null && conceptualTransition.eIsProxy())
    {
      InternalEObject oldConceptualTransition = (InternalEObject)conceptualTransition;
      conceptualTransition = (Transition)eResolveProxy(oldConceptualTransition);
      if (conceptualTransition != oldConceptualTransition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.INSTANCE__CONCEPTUAL_TRANSITION, oldConceptualTransition, conceptualTransition));
      }
    }
    return conceptualTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition basicGetConceptualTransition()
  {
    return conceptualTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConceptualTransition(Transition newConceptualTransition)
  {
    Transition oldConceptualTransition = conceptualTransition;
    conceptualTransition = newConceptualTransition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCE__CONCEPTUAL_TRANSITION, oldConceptualTransition, conceptualTransition));
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
      case WorkPackage.INSTANCE__CONCEPTUAL_TRANSITION:
        if (resolve) return getConceptualTransition();
        return basicGetConceptualTransition();
      case WorkPackage.INSTANCE__NAME:
        return getName();
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
      case WorkPackage.INSTANCE__CONCEPTUAL_TRANSITION:
        setConceptualTransition((Transition)newValue);
        return;
      case WorkPackage.INSTANCE__NAME:
        setName((String)newValue);
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
      case WorkPackage.INSTANCE__CONCEPTUAL_TRANSITION:
        setConceptualTransition((Transition)null);
        return;
      case WorkPackage.INSTANCE__NAME:
        setName(NAME_EDEFAULT);
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
      case WorkPackage.INSTANCE__CONCEPTUAL_TRANSITION:
        return conceptualTransition != null;
      case WorkPackage.INSTANCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //InstanceImpl
