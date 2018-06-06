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
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.Predicate#isNegation <em>Negation</em>}</li>
 *   <li>{@link org.worklang.work.Predicate#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends BinaryExpression
{
  /**
   * Returns the value of the '<em><b>Negation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negation</em>' attribute.
   * @see #setNegation(boolean)
   * @see org.worklang.work.WorkPackage#getPredicate_Negation()
   * @model
   * @generated
   */
  boolean isNegation();

  /**
   * Sets the value of the '{@link org.worklang.work.Predicate#isNegation <em>Negation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negation</em>' attribute.
   * @see #isNegation()
   * @generated
   */
  void setNegation(boolean value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(BinaryExpression)
   * @see org.worklang.work.WorkPackage#getPredicate_Expression()
   * @model containment="true"
   * @generated
   */
  BinaryExpression getExpression();

  /**
   * Sets the value of the '{@link org.worklang.work.Predicate#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(BinaryExpression value);

} // Predicate
