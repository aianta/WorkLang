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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.worklang.work.InputDefinition;
import org.worklang.work.StateID;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.InputDefinitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.worklang.work.impl.InputDefinitionImpl#getInputState <em>Input State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputDefinitionImpl extends MinimalEObjectImpl.Container implements InputDefinition
{
  /**
   * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected static final String INPUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected String input = INPUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getInputState() <em>Input State</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputState()
   * @generated
   * @ordered
   */
  protected EList<StateID> inputState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputDefinitionImpl()
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
    return WorkPackage.Literals.INPUT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(String newInput)
  {
    String oldInput = input;
    input = newInput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INPUT_DEFINITION__INPUT, oldInput, input));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateID> getInputState()
  {
    if (inputState == null)
    {
      inputState = new EObjectResolvingEList<StateID>(StateID.class, this, WorkPackage.INPUT_DEFINITION__INPUT_STATE);
    }
    return inputState;
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
      case WorkPackage.INPUT_DEFINITION__INPUT:
        return getInput();
      case WorkPackage.INPUT_DEFINITION__INPUT_STATE:
        return getInputState();
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
      case WorkPackage.INPUT_DEFINITION__INPUT:
        setInput((String)newValue);
        return;
      case WorkPackage.INPUT_DEFINITION__INPUT_STATE:
        getInputState().clear();
        getInputState().addAll((Collection<? extends StateID>)newValue);
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
      case WorkPackage.INPUT_DEFINITION__INPUT:
        setInput(INPUT_EDEFAULT);
        return;
      case WorkPackage.INPUT_DEFINITION__INPUT_STATE:
        getInputState().clear();
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
      case WorkPackage.INPUT_DEFINITION__INPUT:
        return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
      case WorkPackage.INPUT_DEFINITION__INPUT_STATE:
        return inputState != null && !inputState.isEmpty();
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
    result.append(" (input: ");
    result.append(input);
    result.append(')');
    return result.toString();
  }

} //InputDefinitionImpl
