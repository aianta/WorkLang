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
 * A representation of the model object '<em><b>Execution Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.ExecutionResult#getComputeFirst <em>Compute First</em>}</li>
 *   <li>{@link org.worklang.work.ExecutionResult#getComputeNext <em>Compute Next</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getExecutionResult()
 * @model
 * @generated
 */
public interface ExecutionResult extends InstructionExpression, InstanceInstructionExpression
{
  /**
   * Returns the value of the '<em><b>Compute First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compute First</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compute First</em>' containment reference.
   * @see #setComputeFirst(EObject)
   * @see org.worklang.work.WorkPackage#getExecutionResult_ComputeFirst()
   * @model containment="true"
   * @generated
   */
  EObject getComputeFirst();

  /**
   * Sets the value of the '{@link org.worklang.work.ExecutionResult#getComputeFirst <em>Compute First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compute First</em>' containment reference.
   * @see #getComputeFirst()
   * @generated
   */
  void setComputeFirst(EObject value);

  /**
   * Returns the value of the '<em><b>Compute Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compute Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compute Next</em>' containment reference.
   * @see #setComputeNext(EObject)
   * @see org.worklang.work.WorkPackage#getExecutionResult_ComputeNext()
   * @model containment="true"
   * @generated
   */
  EObject getComputeNext();

  /**
   * Sets the value of the '{@link org.worklang.work.ExecutionResult#getComputeNext <em>Compute Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compute Next</em>' containment reference.
   * @see #getComputeNext()
   * @generated
   */
  void setComputeNext(EObject value);

} // ExecutionResult
