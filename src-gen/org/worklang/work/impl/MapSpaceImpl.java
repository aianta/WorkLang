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

import org.worklang.work.MapSpace;
import org.worklang.work.StateMapping;
import org.worklang.work.TransitionMapping;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.MapSpaceImpl#getMappedStates <em>Mapped States</em>}</li>
 *   <li>{@link org.worklang.work.impl.MapSpaceImpl#getMappedTransitions <em>Mapped Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapSpaceImpl extends MinimalEObjectImpl.Container implements MapSpace
{
  /**
   * The cached value of the '{@link #getMappedStates() <em>Mapped States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedStates()
   * @generated
   * @ordered
   */
  protected EList<StateMapping> mappedStates;

  /**
   * The cached value of the '{@link #getMappedTransitions() <em>Mapped Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedTransitions()
   * @generated
   * @ordered
   */
  protected EList<TransitionMapping> mappedTransitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapSpaceImpl()
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
    return WorkPackage.Literals.MAP_SPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateMapping> getMappedStates()
  {
    if (mappedStates == null)
    {
      mappedStates = new EObjectContainmentEList<StateMapping>(StateMapping.class, this, WorkPackage.MAP_SPACE__MAPPED_STATES);
    }
    return mappedStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransitionMapping> getMappedTransitions()
  {
    if (mappedTransitions == null)
    {
      mappedTransitions = new EObjectContainmentEList<TransitionMapping>(TransitionMapping.class, this, WorkPackage.MAP_SPACE__MAPPED_TRANSITIONS);
    }
    return mappedTransitions;
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
      case WorkPackage.MAP_SPACE__MAPPED_STATES:
        return ((InternalEList<?>)getMappedStates()).basicRemove(otherEnd, msgs);
      case WorkPackage.MAP_SPACE__MAPPED_TRANSITIONS:
        return ((InternalEList<?>)getMappedTransitions()).basicRemove(otherEnd, msgs);
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
      case WorkPackage.MAP_SPACE__MAPPED_STATES:
        return getMappedStates();
      case WorkPackage.MAP_SPACE__MAPPED_TRANSITIONS:
        return getMappedTransitions();
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
      case WorkPackage.MAP_SPACE__MAPPED_STATES:
        getMappedStates().clear();
        getMappedStates().addAll((Collection<? extends StateMapping>)newValue);
        return;
      case WorkPackage.MAP_SPACE__MAPPED_TRANSITIONS:
        getMappedTransitions().clear();
        getMappedTransitions().addAll((Collection<? extends TransitionMapping>)newValue);
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
      case WorkPackage.MAP_SPACE__MAPPED_STATES:
        getMappedStates().clear();
        return;
      case WorkPackage.MAP_SPACE__MAPPED_TRANSITIONS:
        getMappedTransitions().clear();
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
      case WorkPackage.MAP_SPACE__MAPPED_STATES:
        return mappedStates != null && !mappedStates.isEmpty();
      case WorkPackage.MAP_SPACE__MAPPED_TRANSITIONS:
        return mappedTransitions != null && !mappedTransitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MapSpaceImpl
