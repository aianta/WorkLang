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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.worklang.work.OutputDefinition;
import org.worklang.work.StateID;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.OutputDefinitionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.worklang.work.impl.OutputDefinitionImpl#getOutputState <em>Output State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputDefinitionImpl extends MinimalEObjectImpl.Container implements OutputDefinition
{
  /**
   * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected static final String OUTPUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected String output = OUTPUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getOutputState() <em>Output State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputState()
   * @generated
   * @ordered
   */
  protected StateID outputState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputDefinitionImpl()
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
    return WorkPackage.Literals.OUTPUT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(String newOutput)
  {
    String oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.OUTPUT_DEFINITION__OUTPUT, oldOutput, output));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateID getOutputState()
  {
    if (outputState != null && outputState.eIsProxy())
    {
      InternalEObject oldOutputState = (InternalEObject)outputState;
      outputState = (StateID)eResolveProxy(oldOutputState);
      if (outputState != oldOutputState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.OUTPUT_DEFINITION__OUTPUT_STATE, oldOutputState, outputState));
      }
    }
    return outputState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateID basicGetOutputState()
  {
    return outputState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputState(StateID newOutputState)
  {
    StateID oldOutputState = outputState;
    outputState = newOutputState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.OUTPUT_DEFINITION__OUTPUT_STATE, oldOutputState, outputState));
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
      case WorkPackage.OUTPUT_DEFINITION__OUTPUT:
        return getOutput();
      case WorkPackage.OUTPUT_DEFINITION__OUTPUT_STATE:
        if (resolve) return getOutputState();
        return basicGetOutputState();
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
      case WorkPackage.OUTPUT_DEFINITION__OUTPUT:
        setOutput((String)newValue);
        return;
      case WorkPackage.OUTPUT_DEFINITION__OUTPUT_STATE:
        setOutputState((StateID)newValue);
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
      case WorkPackage.OUTPUT_DEFINITION__OUTPUT:
        setOutput(OUTPUT_EDEFAULT);
        return;
      case WorkPackage.OUTPUT_DEFINITION__OUTPUT_STATE:
        setOutputState((StateID)null);
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
      case WorkPackage.OUTPUT_DEFINITION__OUTPUT:
        return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
      case WorkPackage.OUTPUT_DEFINITION__OUTPUT_STATE:
        return outputState != null;
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
    result.append(" (output: ");
    result.append(output);
    result.append(')');
    return result.toString();
  }

} //OutputDefinitionImpl
