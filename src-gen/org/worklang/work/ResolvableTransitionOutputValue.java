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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolvable Transition Output Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.ResolvableTransitionOutputValue#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getResolvableTransitionOutputValue()
 * @model
 * @generated
 */
public interface ResolvableTransitionOutputValue extends ResolvableValue
{
  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(StateDefinition)
   * @see org.worklang.work.WorkPackage#getResolvableTransitionOutputValue_State()
   * @model
   * @generated
   */
  StateDefinition getState();

  /**
   * Sets the value of the '{@link org.worklang.work.ResolvableTransitionOutputValue#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(StateDefinition value);

} // ResolvableTransitionOutputValue
