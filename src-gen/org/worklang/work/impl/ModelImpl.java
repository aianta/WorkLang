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

import org.worklang.work.ExpertDefinition;
import org.worklang.work.FieldDefinition;
import org.worklang.work.Instruction;
import org.worklang.work.Model;
import org.worklang.work.Practitioner;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.ModelImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.worklang.work.impl.ModelImpl#getExperts <em>Experts</em>}</li>
 *   <li>{@link org.worklang.work.impl.ModelImpl#getPractitioners <em>Practitioners</em>}</li>
 *   <li>{@link org.worklang.work.impl.ModelImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<FieldDefinition> fields;

  /**
   * The cached value of the '{@link #getExperts() <em>Experts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExperts()
   * @generated
   * @ordered
   */
  protected EList<ExpertDefinition> experts;

  /**
   * The cached value of the '{@link #getPractitioners() <em>Practitioners</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPractitioners()
   * @generated
   * @ordered
   */
  protected EList<Practitioner> practitioners;

  /**
   * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstructions()
   * @generated
   * @ordered
   */
  protected EList<Instruction> instructions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return WorkPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldDefinition> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<FieldDefinition>(FieldDefinition.class, this, WorkPackage.MODEL__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpertDefinition> getExperts()
  {
    if (experts == null)
    {
      experts = new EObjectContainmentEList<ExpertDefinition>(ExpertDefinition.class, this, WorkPackage.MODEL__EXPERTS);
    }
    return experts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Practitioner> getPractitioners()
  {
    if (practitioners == null)
    {
      practitioners = new EObjectContainmentEList<Practitioner>(Practitioner.class, this, WorkPackage.MODEL__PRACTITIONERS);
    }
    return practitioners;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instruction> getInstructions()
  {
    if (instructions == null)
    {
      instructions = new EObjectContainmentEList<Instruction>(Instruction.class, this, WorkPackage.MODEL__INSTRUCTIONS);
    }
    return instructions;
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
      case WorkPackage.MODEL__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case WorkPackage.MODEL__EXPERTS:
        return ((InternalEList<?>)getExperts()).basicRemove(otherEnd, msgs);
      case WorkPackage.MODEL__PRACTITIONERS:
        return ((InternalEList<?>)getPractitioners()).basicRemove(otherEnd, msgs);
      case WorkPackage.MODEL__INSTRUCTIONS:
        return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
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
      case WorkPackage.MODEL__FIELDS:
        return getFields();
      case WorkPackage.MODEL__EXPERTS:
        return getExperts();
      case WorkPackage.MODEL__PRACTITIONERS:
        return getPractitioners();
      case WorkPackage.MODEL__INSTRUCTIONS:
        return getInstructions();
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
      case WorkPackage.MODEL__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends FieldDefinition>)newValue);
        return;
      case WorkPackage.MODEL__EXPERTS:
        getExperts().clear();
        getExperts().addAll((Collection<? extends ExpertDefinition>)newValue);
        return;
      case WorkPackage.MODEL__PRACTITIONERS:
        getPractitioners().clear();
        getPractitioners().addAll((Collection<? extends Practitioner>)newValue);
        return;
      case WorkPackage.MODEL__INSTRUCTIONS:
        getInstructions().clear();
        getInstructions().addAll((Collection<? extends Instruction>)newValue);
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
      case WorkPackage.MODEL__FIELDS:
        getFields().clear();
        return;
      case WorkPackage.MODEL__EXPERTS:
        getExperts().clear();
        return;
      case WorkPackage.MODEL__PRACTITIONERS:
        getPractitioners().clear();
        return;
      case WorkPackage.MODEL__INSTRUCTIONS:
        getInstructions().clear();
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
      case WorkPackage.MODEL__FIELDS:
        return fields != null && !fields.isEmpty();
      case WorkPackage.MODEL__EXPERTS:
        return experts != null && !experts.isEmpty();
      case WorkPackage.MODEL__PRACTITIONERS:
        return practitioners != null && !practitioners.isEmpty();
      case WorkPackage.MODEL__INSTRUCTIONS:
        return instructions != null && !instructions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
