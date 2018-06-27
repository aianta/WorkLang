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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.worklang.work.ExecutionResult;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.ExecutionResultImpl#getComputeFirst <em>Compute First</em>}</li>
 *   <li>{@link org.worklang.work.impl.ExecutionResultImpl#getComputeNext <em>Compute Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionResultImpl extends InstructionExpressionImpl implements ExecutionResult
{
  /**
   * The cached value of the '{@link #getComputeFirst() <em>Compute First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComputeFirst()
   * @generated
   * @ordered
   */
  protected EObject computeFirst;

  /**
   * The cached value of the '{@link #getComputeNext() <em>Compute Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComputeNext()
   * @generated
   * @ordered
   */
  protected EObject computeNext;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecutionResultImpl()
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
    return WorkPackage.Literals.EXECUTION_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getComputeFirst()
  {
    return computeFirst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComputeFirst(EObject newComputeFirst, NotificationChain msgs)
  {
    EObject oldComputeFirst = computeFirst;
    computeFirst = newComputeFirst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.EXECUTION_RESULT__COMPUTE_FIRST, oldComputeFirst, newComputeFirst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComputeFirst(EObject newComputeFirst)
  {
    if (newComputeFirst != computeFirst)
    {
      NotificationChain msgs = null;
      if (computeFirst != null)
        msgs = ((InternalEObject)computeFirst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXECUTION_RESULT__COMPUTE_FIRST, null, msgs);
      if (newComputeFirst != null)
        msgs = ((InternalEObject)newComputeFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXECUTION_RESULT__COMPUTE_FIRST, null, msgs);
      msgs = basicSetComputeFirst(newComputeFirst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.EXECUTION_RESULT__COMPUTE_FIRST, newComputeFirst, newComputeFirst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getComputeNext()
  {
    return computeNext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComputeNext(EObject newComputeNext, NotificationChain msgs)
  {
    EObject oldComputeNext = computeNext;
    computeNext = newComputeNext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.EXECUTION_RESULT__COMPUTE_NEXT, oldComputeNext, newComputeNext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComputeNext(EObject newComputeNext)
  {
    if (newComputeNext != computeNext)
    {
      NotificationChain msgs = null;
      if (computeNext != null)
        msgs = ((InternalEObject)computeNext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXECUTION_RESULT__COMPUTE_NEXT, null, msgs);
      if (newComputeNext != null)
        msgs = ((InternalEObject)newComputeNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXECUTION_RESULT__COMPUTE_NEXT, null, msgs);
      msgs = basicSetComputeNext(newComputeNext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.EXECUTION_RESULT__COMPUTE_NEXT, newComputeNext, newComputeNext));
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
      case WorkPackage.EXECUTION_RESULT__COMPUTE_FIRST:
        return basicSetComputeFirst(null, msgs);
      case WorkPackage.EXECUTION_RESULT__COMPUTE_NEXT:
        return basicSetComputeNext(null, msgs);
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
      case WorkPackage.EXECUTION_RESULT__COMPUTE_FIRST:
        return getComputeFirst();
      case WorkPackage.EXECUTION_RESULT__COMPUTE_NEXT:
        return getComputeNext();
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
      case WorkPackage.EXECUTION_RESULT__COMPUTE_FIRST:
        setComputeFirst((EObject)newValue);
        return;
      case WorkPackage.EXECUTION_RESULT__COMPUTE_NEXT:
        setComputeNext((EObject)newValue);
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
      case WorkPackage.EXECUTION_RESULT__COMPUTE_FIRST:
        setComputeFirst((EObject)null);
        return;
      case WorkPackage.EXECUTION_RESULT__COMPUTE_NEXT:
        setComputeNext((EObject)null);
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
      case WorkPackage.EXECUTION_RESULT__COMPUTE_FIRST:
        return computeFirst != null;
      case WorkPackage.EXECUTION_RESULT__COMPUTE_NEXT:
        return computeNext != null;
    }
    return super.eIsSet(featureID);
  }

} //ExecutionResultImpl
