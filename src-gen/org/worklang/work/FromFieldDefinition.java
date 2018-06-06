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
 * A representation of the model object '<em><b>From Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.FromFieldDefinition#getFrom <em>From</em>}</li>
 *   <li>{@link org.worklang.work.FromFieldDefinition#getRefSpace <em>Ref Space</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getFromFieldDefinition()
 * @model
 * @generated
 */
public interface FromFieldDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see org.worklang.work.WorkPackage#getFromFieldDefinition_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link org.worklang.work.FromFieldDefinition#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>Ref Space</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Space</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Space</em>' reference.
   * @see #setRefSpace(Space)
   * @see org.worklang.work.WorkPackage#getFromFieldDefinition_RefSpace()
   * @model
   * @generated
   */
  Space getRefSpace();

  /**
   * Sets the value of the '{@link org.worklang.work.FromFieldDefinition#getRefSpace <em>Ref Space</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Space</em>' reference.
   * @see #getRefSpace()
   * @generated
   */
  void setRefSpace(Space value);

} // FromFieldDefinition
