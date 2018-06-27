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
 * A representation of the model object '<em><b>If Instance Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.IfInstanceInstruction#getTestKey <em>Test Key</em>}</li>
 *   <li>{@link org.worklang.work.IfInstanceInstruction#getTestValue <em>Test Value</em>}</li>
 *   <li>{@link org.worklang.work.IfInstanceInstruction#getToComputeIfTrue <em>To Compute If True</em>}</li>
 *   <li>{@link org.worklang.work.IfInstanceInstruction#getToComputeIfFalse <em>To Compute If False</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getIfInstanceInstruction()
 * @model
 * @generated
 */
public interface IfInstanceInstruction extends InstanceInstructionExpression
{
  /**
   * Returns the value of the '<em><b>Test Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Key</em>' containment reference.
   * @see #setTestKey(ResolvableValue)
   * @see org.worklang.work.WorkPackage#getIfInstanceInstruction_TestKey()
   * @model containment="true"
   * @generated
   */
  ResolvableValue getTestKey();

  /**
   * Sets the value of the '{@link org.worklang.work.IfInstanceInstruction#getTestKey <em>Test Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Key</em>' containment reference.
   * @see #getTestKey()
   * @generated
   */
  void setTestKey(ResolvableValue value);

  /**
   * Returns the value of the '<em><b>Test Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Value</em>' containment reference.
   * @see #setTestValue(TestValue)
   * @see org.worklang.work.WorkPackage#getIfInstanceInstruction_TestValue()
   * @model containment="true"
   * @generated
   */
  TestValue getTestValue();

  /**
   * Sets the value of the '{@link org.worklang.work.IfInstanceInstruction#getTestValue <em>Test Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Value</em>' containment reference.
   * @see #getTestValue()
   * @generated
   */
  void setTestValue(TestValue value);

  /**
   * Returns the value of the '<em><b>To Compute If True</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Compute If True</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Compute If True</em>' containment reference.
   * @see #setToComputeIfTrue(InstanceInstructionExpression)
   * @see org.worklang.work.WorkPackage#getIfInstanceInstruction_ToComputeIfTrue()
   * @model containment="true"
   * @generated
   */
  InstanceInstructionExpression getToComputeIfTrue();

  /**
   * Sets the value of the '{@link org.worklang.work.IfInstanceInstruction#getToComputeIfTrue <em>To Compute If True</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Compute If True</em>' containment reference.
   * @see #getToComputeIfTrue()
   * @generated
   */
  void setToComputeIfTrue(InstanceInstructionExpression value);

  /**
   * Returns the value of the '<em><b>To Compute If False</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Compute If False</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Compute If False</em>' containment reference.
   * @see #setToComputeIfFalse(InstanceInstructionExpression)
   * @see org.worklang.work.WorkPackage#getIfInstanceInstruction_ToComputeIfFalse()
   * @model containment="true"
   * @generated
   */
  InstanceInstructionExpression getToComputeIfFalse();

  /**
   * Sets the value of the '{@link org.worklang.work.IfInstanceInstruction#getToComputeIfFalse <em>To Compute If False</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Compute If False</em>' containment reference.
   * @see #getToComputeIfFalse()
   * @generated
   */
  void setToComputeIfFalse(InstanceInstructionExpression value);

} // IfInstanceInstruction
