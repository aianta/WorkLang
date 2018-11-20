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

import org.worklang.work.State;
import org.worklang.work.Transition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.worklang.work.impl.TransitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.worklang.work.impl.TransitionImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
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
   * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected State input;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected State output;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return WorkPackage.Literals.TRANSITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getInput()
  {
    if (input != null && input.eIsProxy())
    {
      InternalEObject oldInput = (InternalEObject)input;
      input = (State)eResolveProxy(oldInput);
      if (input != oldInput)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.TRANSITION__INPUT, oldInput, input));
      }
    }
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(State newInput)
  {
    State oldInput = input;
    input = newInput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION__INPUT, oldInput, input));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getOutput()
  {
    if (output != null && output.eIsProxy())
    {
      InternalEObject oldOutput = (InternalEObject)output;
      output = (State)eResolveProxy(oldOutput);
      if (output != oldOutput)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.TRANSITION__OUTPUT, oldOutput, output));
      }
    }
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(State newOutput)
  {
    State oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION__OUTPUT, oldOutput, output));
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
      case WorkPackage.TRANSITION__NAME:
        return getName();
      case WorkPackage.TRANSITION__INPUT:
        if (resolve) return getInput();
        return basicGetInput();
      case WorkPackage.TRANSITION__OUTPUT:
        if (resolve) return getOutput();
        return basicGetOutput();
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
      case WorkPackage.TRANSITION__NAME:
        setName((String)newValue);
        return;
      case WorkPackage.TRANSITION__INPUT:
        setInput((State)newValue);
        return;
      case WorkPackage.TRANSITION__OUTPUT:
        setOutput((State)newValue);
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
      case WorkPackage.TRANSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WorkPackage.TRANSITION__INPUT:
        setInput((State)null);
        return;
      case WorkPackage.TRANSITION__OUTPUT:
        setOutput((State)null);
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
      case WorkPackage.TRANSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WorkPackage.TRANSITION__INPUT:
        return input != null;
      case WorkPackage.TRANSITION__OUTPUT:
        return output != null;
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

} //TransitionImpl
