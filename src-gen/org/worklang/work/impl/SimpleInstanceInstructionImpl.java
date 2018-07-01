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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.worklang.work.Instance;
import org.worklang.work.SimpleInstanceInstruction;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Instance Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.SimpleInstanceInstructionImpl#getToExecute <em>To Execute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleInstanceInstructionImpl extends InstanceInstructionExpressionImpl implements SimpleInstanceInstruction
{
  /**
   * The cached value of the '{@link #getToExecute() <em>To Execute</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToExecute()
   * @generated
   * @ordered
   */
  protected EList<Instance> toExecute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleInstanceInstructionImpl()
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
    return WorkPackage.Literals.SIMPLE_INSTANCE_INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instance> getToExecute()
  {
    if (toExecute == null)
    {
      toExecute = new EObjectResolvingEList<Instance>(Instance.class, this, WorkPackage.SIMPLE_INSTANCE_INSTRUCTION__TO_EXECUTE);
    }
    return toExecute;
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
      case WorkPackage.SIMPLE_INSTANCE_INSTRUCTION__TO_EXECUTE:
        return getToExecute();
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
      case WorkPackage.SIMPLE_INSTANCE_INSTRUCTION__TO_EXECUTE:
        getToExecute().clear();
        getToExecute().addAll((Collection<? extends Instance>)newValue);
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
      case WorkPackage.SIMPLE_INSTANCE_INSTRUCTION__TO_EXECUTE:
        getToExecute().clear();
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
      case WorkPackage.SIMPLE_INSTANCE_INSTRUCTION__TO_EXECUTE:
        return toExecute != null && !toExecute.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SimpleInstanceInstructionImpl
