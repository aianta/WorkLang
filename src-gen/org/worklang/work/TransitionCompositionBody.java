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
 * A representation of the model object '<em><b>Transition Composition Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.TransitionCompositionBody#getStartingInputs <em>Starting Inputs</em>}</li>
 *   <li>{@link org.worklang.work.TransitionCompositionBody#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getTransitionCompositionBody()
 * @model
 * @generated
 */
public interface TransitionCompositionBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Starting Inputs</b></em>' reference list.
   * The list contents are of type {@link org.worklang.work.StateDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Starting Inputs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Starting Inputs</em>' reference list.
   * @see org.worklang.work.WorkPackage#getTransitionCompositionBody_StartingInputs()
   * @model
   * @generated
   */
  EList<StateDefinition> getStartingInputs();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(InstructionExpression)
   * @see org.worklang.work.WorkPackage#getTransitionCompositionBody_Expression()
   * @model containment="true"
   * @generated
   */
  InstructionExpression getExpression();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionCompositionBody#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(InstructionExpression value);

} // TransitionCompositionBody
