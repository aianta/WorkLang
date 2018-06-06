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
 * A representation of the model object '<em><b>Compound State Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.CompoundStateDefinition#getObject <em>Object</em>}</li>
 *   <li>{@link org.worklang.work.CompoundStateDefinition#getState <em>State</em>}</li>
 *   <li>{@link org.worklang.work.CompoundStateDefinition#getCompoundStateDef <em>Compound State Def</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getCompoundStateDefinition()
 * @model
 * @generated
 */
public interface CompoundStateDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' attribute.
   * @see #setObject(String)
   * @see org.worklang.work.WorkPackage#getCompoundStateDefinition_Object()
   * @model
   * @generated
   */
  String getObject();

  /**
   * Sets the value of the '{@link org.worklang.work.CompoundStateDefinition#getObject <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' attribute.
   * @see #getObject()
   * @generated
   */
  void setObject(String value);

  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference.
   * @see #setState(StateID)
   * @see org.worklang.work.WorkPackage#getCompoundStateDefinition_State()
   * @model containment="true"
   * @generated
   */
  StateID getState();

  /**
   * Sets the value of the '{@link org.worklang.work.CompoundStateDefinition#getState <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' containment reference.
   * @see #getState()
   * @generated
   */
  void setState(StateID value);

  /**
   * Returns the value of the '<em><b>Compound State Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compound State Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compound State Def</em>' containment reference.
   * @see #setCompoundStateDef(WithStatesDefinition)
   * @see org.worklang.work.WorkPackage#getCompoundStateDefinition_CompoundStateDef()
   * @model containment="true"
   * @generated
   */
  WithStatesDefinition getCompoundStateDef();

  /**
   * Sets the value of the '{@link org.worklang.work.CompoundStateDefinition#getCompoundStateDef <em>Compound State Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compound State Def</em>' containment reference.
   * @see #getCompoundStateDef()
   * @generated
   */
  void setCompoundStateDef(WithStatesDefinition value);

} // CompoundStateDefinition
