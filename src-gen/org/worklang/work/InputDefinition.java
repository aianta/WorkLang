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
package org.worklang.work;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.InputDefinition#getInput <em>Input</em>}</li>
 *   <li>{@link org.worklang.work.InputDefinition#getInputState <em>Input State</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getInputDefinition()
 * @model
 * @generated
 */
public interface InputDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute.
   * @see #setInput(String)
   * @see org.worklang.work.WorkPackage#getInputDefinition_Input()
   * @model
   * @generated
   */
  String getInput();

  /**
   * Sets the value of the '{@link org.worklang.work.InputDefinition#getInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see #getInput()
   * @generated
   */
  void setInput(String value);

  /**
   * Returns the value of the '<em><b>Input State</b></em>' reference list.
   * The list contents are of type {@link org.worklang.work.StateID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input State</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input State</em>' reference list.
   * @see org.worklang.work.WorkPackage#getInputDefinition_InputState()
   * @model
   * @generated
   */
  EList<StateID> getInputState();

} // InputDefinition
