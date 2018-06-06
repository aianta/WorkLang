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
 * A representation of the model object '<em><b>Set Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.SetStatement#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.worklang.work.SetStatement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.worklang.work.SetStatement#getToDef <em>To Def</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getSetStatement()
 * @model
 * @generated
 */
public interface SetStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' attribute.
   * @see #setStatement(String)
   * @see org.worklang.work.WorkPackage#getSetStatement_Statement()
   * @model
   * @generated
   */
  String getStatement();

  /**
   * Sets the value of the '{@link org.worklang.work.SetStatement#getStatement <em>Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' attribute.
   * @see #getStatement()
   * @generated
   */
  void setStatement(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(StateID)
   * @see org.worklang.work.WorkPackage#getSetStatement_Variable()
   * @model
   * @generated
   */
  StateID getVariable();

  /**
   * Sets the value of the '{@link org.worklang.work.SetStatement#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(StateID value);

  /**
   * Returns the value of the '<em><b>To Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Def</em>' containment reference.
   * @see #setToDef(ToDefinition)
   * @see org.worklang.work.WorkPackage#getSetStatement_ToDef()
   * @model containment="true"
   * @generated
   */
  ToDefinition getToDef();

  /**
   * Sets the value of the '{@link org.worklang.work.SetStatement#getToDef <em>To Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Def</em>' containment reference.
   * @see #getToDef()
   * @generated
   */
  void setToDef(ToDefinition value);

} // SetStatement
