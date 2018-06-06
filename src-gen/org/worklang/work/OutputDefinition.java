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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.OutputDefinition#getOutput <em>Output</em>}</li>
 *   <li>{@link org.worklang.work.OutputDefinition#getOutputState <em>Output State</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getOutputDefinition()
 * @model
 * @generated
 */
public interface OutputDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' attribute.
   * @see #setOutput(String)
   * @see org.worklang.work.WorkPackage#getOutputDefinition_Output()
   * @model
   * @generated
   */
  String getOutput();

  /**
   * Sets the value of the '{@link org.worklang.work.OutputDefinition#getOutput <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' attribute.
   * @see #getOutput()
   * @generated
   */
  void setOutput(String value);

  /**
   * Returns the value of the '<em><b>Output State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output State</em>' reference.
   * @see #setOutputState(StateID)
   * @see org.worklang.work.WorkPackage#getOutputDefinition_OutputState()
   * @model
   * @generated
   */
  StateID getOutputState();

  /**
   * Sets the value of the '{@link org.worklang.work.OutputDefinition#getOutputState <em>Output State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output State</em>' reference.
   * @see #getOutputState()
   * @generated
   */
  void setOutputState(StateID value);

} // OutputDefinition
