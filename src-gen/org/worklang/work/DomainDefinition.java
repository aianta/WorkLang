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
 * A representation of the model object '<em><b>Domain Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.DomainDefinition#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.worklang.work.DomainDefinition#getDomainAreas <em>Domain Areas</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getDomainDefinition()
 * @model
 * @generated
 */
public interface DomainDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Domain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' attribute.
   * @see #setDomain(String)
   * @see org.worklang.work.WorkPackage#getDomainDefinition_Domain()
   * @model
   * @generated
   */
  String getDomain();

  /**
   * Sets the value of the '{@link org.worklang.work.DomainDefinition#getDomain <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' attribute.
   * @see #getDomain()
   * @generated
   */
  void setDomain(String value);

  /**
   * Returns the value of the '<em><b>Domain Areas</b></em>' containment reference list.
   * The list contents are of type {@link org.worklang.work.ReferenceField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Areas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Areas</em>' containment reference list.
   * @see org.worklang.work.WorkPackage#getDomainDefinition_DomainAreas()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceField> getDomainAreas();

} // DomainDefinition
