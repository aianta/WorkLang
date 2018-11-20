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
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.Domain#getName <em>Name</em>}</li>
 *   <li>{@link org.worklang.work.Domain#getDefinitionSpace <em>Definition Space</em>}</li>
 *   <li>{@link org.worklang.work.Domain#getInstanceSpace <em>Instance Space</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.worklang.work.WorkPackage#getDomain_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.worklang.work.Domain#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Definition Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition Space</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition Space</em>' containment reference.
   * @see #setDefinitionSpace(DefinitionSpace)
   * @see org.worklang.work.WorkPackage#getDomain_DefinitionSpace()
   * @model containment="true"
   * @generated
   */
  DefinitionSpace getDefinitionSpace();

  /**
   * Sets the value of the '{@link org.worklang.work.Domain#getDefinitionSpace <em>Definition Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition Space</em>' containment reference.
   * @see #getDefinitionSpace()
   * @generated
   */
  void setDefinitionSpace(DefinitionSpace value);

  /**
   * Returns the value of the '<em><b>Instance Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance Space</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance Space</em>' containment reference.
   * @see #setInstanceSpace(InstanceSpace)
   * @see org.worklang.work.WorkPackage#getDomain_InstanceSpace()
   * @model containment="true"
   * @generated
   */
  InstanceSpace getInstanceSpace();

  /**
   * Sets the value of the '{@link org.worklang.work.Domain#getInstanceSpace <em>Instance Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Space</em>' containment reference.
   * @see #getInstanceSpace()
   * @generated
   */
  void setInstanceSpace(InstanceSpace value);

} // Domain
