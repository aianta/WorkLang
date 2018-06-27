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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
   * The cached value of the '{@link #getToExecute() <em>To Execute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToExecute()
   * @generated
   * @ordered
   */
  protected Instance toExecute;

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
  public Instance getToExecute()
  {
    if (toExecute != null && toExecute.eIsProxy())
    {
      InternalEObject oldToExecute = (InternalEObject)toExecute;
      toExecute = (Instance)eResolveProxy(oldToExecute);
      if (toExecute != oldToExecute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.SIMPLE_INSTANCE_INSTRUCTION__TO_EXECUTE, oldToExecute, toExecute));
      }
    }
    return toExecute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance basicGetToExecute()
  {
    return toExecute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToExecute(Instance newToExecute)
  {
    Instance oldToExecute = toExecute;
    toExecute = newToExecute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.SIMPLE_INSTANCE_INSTRUCTION__TO_EXECUTE, oldToExecute, toExecute));
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
        if (resolve) return getToExecute();
        return basicGetToExecute();
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
      case WorkPackage.SIMPLE_INSTANCE_INSTRUCTION__TO_EXECUTE:
        setToExecute((Instance)newValue);
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
        setToExecute((Instance)null);
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
        return toExecute != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleInstanceInstructionImpl
