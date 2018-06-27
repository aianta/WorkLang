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
 * A representation of the model object '<em><b>If Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.IfInstruction#getTestKey <em>Test Key</em>}</li>
 *   <li>{@link org.worklang.work.IfInstruction#getTestValue <em>Test Value</em>}</li>
 *   <li>{@link org.worklang.work.IfInstruction#getToComputeIfTrue <em>To Compute If True</em>}</li>
 *   <li>{@link org.worklang.work.IfInstruction#getToComputeIfFalse <em>To Compute If False</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getIfInstruction()
 * @model
 * @generated
 */
public interface IfInstruction extends InstructionExpression
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
   * @see org.worklang.work.WorkPackage#getIfInstruction_TestKey()
   * @model containment="true"
   * @generated
   */
  ResolvableValue getTestKey();

  /**
   * Sets the value of the '{@link org.worklang.work.IfInstruction#getTestKey <em>Test Key</em>}' containment reference.
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
   * @see org.worklang.work.WorkPackage#getIfInstruction_TestValue()
   * @model containment="true"
   * @generated
   */
  TestValue getTestValue();

  /**
   * Sets the value of the '{@link org.worklang.work.IfInstruction#getTestValue <em>Test Value</em>}' containment reference.
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
   * @see #setToComputeIfTrue(InstructionExpression)
   * @see org.worklang.work.WorkPackage#getIfInstruction_ToComputeIfTrue()
   * @model containment="true"
   * @generated
   */
  InstructionExpression getToComputeIfTrue();

  /**
   * Sets the value of the '{@link org.worklang.work.IfInstruction#getToComputeIfTrue <em>To Compute If True</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Compute If True</em>' containment reference.
   * @see #getToComputeIfTrue()
   * @generated
   */
  void setToComputeIfTrue(InstructionExpression value);

  /**
   * Returns the value of the '<em><b>To Compute If False</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Compute If False</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Compute If False</em>' containment reference.
   * @see #setToComputeIfFalse(InstructionExpression)
   * @see org.worklang.work.WorkPackage#getIfInstruction_ToComputeIfFalse()
   * @model containment="true"
   * @generated
   */
  InstructionExpression getToComputeIfFalse();

  /**
   * Sets the value of the '{@link org.worklang.work.IfInstruction#getToComputeIfFalse <em>To Compute If False</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Compute If False</em>' containment reference.
   * @see #getToComputeIfFalse()
   * @generated
   */
  void setToComputeIfFalse(InstructionExpression value);

} // IfInstruction
