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
 * A representation of the model object '<em><b>With Transitions Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.WithTransitionsDefinition#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.worklang.work.WithTransitionsDefinition#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getWithTransitionsDefinition()
 * @model
 * @generated
 */
public interface WithTransitionsDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Composition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composition</em>' attribute.
   * @see #setComposition(String)
   * @see org.worklang.work.WorkPackage#getWithTransitionsDefinition_Composition()
   * @model
   * @generated
   */
  String getComposition();

  /**
   * Sets the value of the '{@link org.worklang.work.WithTransitionsDefinition#getComposition <em>Composition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composition</em>' attribute.
   * @see #getComposition()
   * @generated
   */
  void setComposition(String value);

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference.
   * @see #setTransitions(TransitionalExpression)
   * @see org.worklang.work.WorkPackage#getWithTransitionsDefinition_Transitions()
   * @model containment="true"
   * @generated
   */
  TransitionalExpression getTransitions();

  /**
   * Sets the value of the '{@link org.worklang.work.WithTransitionsDefinition#getTransitions <em>Transitions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transitions</em>' containment reference.
   * @see #getTransitions()
   * @generated
   */
  void setTransitions(TransitionalExpression value);

} // WithTransitionsDefinition