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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.Model#getFields <em>Fields</em>}</li>
 *   <li>{@link org.worklang.work.Model#getExperts <em>Experts</em>}</li>
 *   <li>{@link org.worklang.work.Model#getPractitioners <em>Practitioners</em>}</li>
 *   <li>{@link org.worklang.work.Model#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.worklang.work.FieldDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.worklang.work.WorkPackage#getModel_Fields()
   * @model containment="true"
   * @generated
   */
  EList<FieldDefinition> getFields();

  /**
   * Returns the value of the '<em><b>Experts</b></em>' containment reference list.
   * The list contents are of type {@link org.worklang.work.ExpertDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Experts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Experts</em>' containment reference list.
   * @see org.worklang.work.WorkPackage#getModel_Experts()
   * @model containment="true"
   * @generated
   */
  EList<ExpertDefinition> getExperts();

  /**
   * Returns the value of the '<em><b>Practitioners</b></em>' containment reference list.
   * The list contents are of type {@link org.worklang.work.Practitioner}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Practitioners</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Practitioners</em>' containment reference list.
   * @see org.worklang.work.WorkPackage#getModel_Practitioners()
   * @model containment="true"
   * @generated
   */
  EList<Practitioner> getPractitioners();

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link org.worklang.work.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see org.worklang.work.WorkPackage#getModel_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // Model
