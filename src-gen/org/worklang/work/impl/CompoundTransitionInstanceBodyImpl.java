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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.worklang.work.CompoundTransitionInstanceBody;
import org.worklang.work.Instance;
import org.worklang.work.InstanceInstructionExpression;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Transition Instance Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.CompoundTransitionInstanceBodyImpl#getStartingInputs <em>Starting Inputs</em>}</li>
 *   <li>{@link org.worklang.work.impl.CompoundTransitionInstanceBodyImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundTransitionInstanceBodyImpl extends MinimalEObjectImpl.Container implements CompoundTransitionInstanceBody
{
  /**
   * The cached value of the '{@link #getStartingInputs() <em>Starting Inputs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartingInputs()
   * @generated
   * @ordered
   */
  protected EList<Instance> startingInputs;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected InstanceInstructionExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompoundTransitionInstanceBodyImpl()
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
    return WorkPackage.Literals.COMPOUND_TRANSITION_INSTANCE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instance> getStartingInputs()
  {
    if (startingInputs == null)
    {
      startingInputs = new EObjectResolvingEList<Instance>(Instance.class, this, WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__STARTING_INPUTS);
    }
    return startingInputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceInstructionExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(InstanceInstructionExpression newExpression, NotificationChain msgs)
  {
    InstanceInstructionExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(InstanceInstructionExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__EXPRESSION, newExpression, newExpression));
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
      case WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__STARTING_INPUTS:
        return getStartingInputs();
      case WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__EXPRESSION:
        return getExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__STARTING_INPUTS:
        getStartingInputs().clear();
        getStartingInputs().addAll((Collection<? extends Instance>)newValue);
        return;
      case WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__EXPRESSION:
        setExpression((InstanceInstructionExpression)newValue);
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
      case WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__STARTING_INPUTS:
        getStartingInputs().clear();
        return;
      case WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__EXPRESSION:
        setExpression((InstanceInstructionExpression)null);
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
      case WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__STARTING_INPUTS:
        return startingInputs != null && !startingInputs.isEmpty();
      case WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //CompoundTransitionInstanceBodyImpl
