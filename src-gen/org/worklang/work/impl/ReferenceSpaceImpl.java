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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.worklang.work.ReferenceSpace;
import org.worklang.work.ReferenceState;
import org.worklang.work.ReferenceTransition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.ReferenceSpaceImpl#getRefStates <em>Ref States</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferenceSpaceImpl#getRefTransitions <em>Ref Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceSpaceImpl extends MinimalEObjectImpl.Container implements ReferenceSpace
{
  /**
   * The cached value of the '{@link #getRefStates() <em>Ref States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefStates()
   * @generated
   * @ordered
   */
  protected EList<ReferenceState> refStates;

  /**
   * The cached value of the '{@link #getRefTransitions() <em>Ref Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTransitions()
   * @generated
   * @ordered
   */
  protected EList<ReferenceTransition> refTransitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceSpaceImpl()
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
    return WorkPackage.Literals.REFERENCE_SPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceState> getRefStates()
  {
    if (refStates == null)
    {
      refStates = new EObjectContainmentEList<ReferenceState>(ReferenceState.class, this, WorkPackage.REFERENCE_SPACE__REF_STATES);
    }
    return refStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceTransition> getRefTransitions()
  {
    if (refTransitions == null)
    {
      refTransitions = new EObjectContainmentEList<ReferenceTransition>(ReferenceTransition.class, this, WorkPackage.REFERENCE_SPACE__REF_TRANSITIONS);
    }
    return refTransitions;
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
      case WorkPackage.REFERENCE_SPACE__REF_STATES:
        return ((InternalEList<?>)getRefStates()).basicRemove(otherEnd, msgs);
      case WorkPackage.REFERENCE_SPACE__REF_TRANSITIONS:
        return ((InternalEList<?>)getRefTransitions()).basicRemove(otherEnd, msgs);
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
      case WorkPackage.REFERENCE_SPACE__REF_STATES:
        return getRefStates();
      case WorkPackage.REFERENCE_SPACE__REF_TRANSITIONS:
        return getRefTransitions();
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
      case WorkPackage.REFERENCE_SPACE__REF_STATES:
        getRefStates().clear();
        getRefStates().addAll((Collection<? extends ReferenceState>)newValue);
        return;
      case WorkPackage.REFERENCE_SPACE__REF_TRANSITIONS:
        getRefTransitions().clear();
        getRefTransitions().addAll((Collection<? extends ReferenceTransition>)newValue);
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
      case WorkPackage.REFERENCE_SPACE__REF_STATES:
        getRefStates().clear();
        return;
      case WorkPackage.REFERENCE_SPACE__REF_TRANSITIONS:
        getRefTransitions().clear();
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
      case WorkPackage.REFERENCE_SPACE__REF_STATES:
        return refStates != null && !refStates.isEmpty();
      case WorkPackage.REFERENCE_SPACE__REF_TRANSITIONS:
        return refTransitions != null && !refTransitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReferenceSpaceImpl
