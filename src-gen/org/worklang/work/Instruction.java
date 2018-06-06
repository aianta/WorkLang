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
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.Instruction#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.worklang.work.Instruction#getSpace <em>Space</em>}</li>
 *   <li>{@link org.worklang.work.Instruction#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type</em>' attribute.
   * @see #setObjectType(String)
   * @see org.worklang.work.WorkPackage#getInstruction_ObjectType()
   * @model
   * @generated
   */
  String getObjectType();

  /**
   * Sets the value of the '{@link org.worklang.work.Instruction#getObjectType <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Type</em>' attribute.
   * @see #getObjectType()
   * @generated
   */
  void setObjectType(String value);

  /**
   * Returns the value of the '<em><b>Space</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Space</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Space</em>' reference.
   * @see #setSpace(Space)
   * @see org.worklang.work.WorkPackage#getInstruction_Space()
   * @model
   * @generated
   */
  Space getSpace();

  /**
   * Sets the value of the '{@link org.worklang.work.Instruction#getSpace <em>Space</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Space</em>' reference.
   * @see #getSpace()
   * @generated
   */
  void setSpace(Space value);

  /**
   * Returns the value of the '<em><b>Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' reference.
   * @see #setTransition(TransitionID)
   * @see org.worklang.work.WorkPackage#getInstruction_Transition()
   * @model
   * @generated
   */
  TransitionID getTransition();

  /**
   * Sets the value of the '{@link org.worklang.work.Instruction#getTransition <em>Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' reference.
   * @see #getTransition()
   * @generated
   */
  void setTransition(TransitionID value);

} // Instruction
