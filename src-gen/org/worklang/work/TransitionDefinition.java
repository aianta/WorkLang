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
 * A representation of the model object '<em><b>Transition Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.TransitionDefinition#getObject <em>Object</em>}</li>
 *   <li>{@link org.worklang.work.TransitionDefinition#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.worklang.work.TransitionDefinition#getIn <em>In</em>}</li>
 *   <li>{@link org.worklang.work.TransitionDefinition#getOut <em>Out</em>}</li>
 *   <li>{@link org.worklang.work.TransitionDefinition#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getTransitionDefinition()
 * @model
 * @generated
 */
public interface TransitionDefinition extends EObject
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
   * @see org.worklang.work.WorkPackage#getTransitionDefinition_Object()
   * @model
   * @generated
   */
  String getObject();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionDefinition#getObject <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' attribute.
   * @see #getObject()
   * @generated
   */
  void setObject(String value);

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference.
   * @see #setTransition(TransitionID)
   * @see org.worklang.work.WorkPackage#getTransitionDefinition_Transition()
   * @model containment="true"
   * @generated
   */
  TransitionID getTransition();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionDefinition#getTransition <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' containment reference.
   * @see #getTransition()
   * @generated
   */
  void setTransition(TransitionID value);

  /**
   * Returns the value of the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' containment reference.
   * @see #setIn(InputDefinition)
   * @see org.worklang.work.WorkPackage#getTransitionDefinition_In()
   * @model containment="true"
   * @generated
   */
  InputDefinition getIn();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionDefinition#getIn <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' containment reference.
   * @see #getIn()
   * @generated
   */
  void setIn(InputDefinition value);

  /**
   * Returns the value of the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out</em>' containment reference.
   * @see #setOut(OutputDefinition)
   * @see org.worklang.work.WorkPackage#getTransitionDefinition_Out()
   * @model containment="true"
   * @generated
   */
  OutputDefinition getOut();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionDefinition#getOut <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out</em>' containment reference.
   * @see #getOut()
   * @generated
   */
  void setOut(OutputDefinition value);

  /**
   * Returns the value of the '<em><b>Composition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composition</em>' containment reference.
   * @see #setComposition(WithTransitionsDefinition)
   * @see org.worklang.work.WorkPackage#getTransitionDefinition_Composition()
   * @model containment="true"
   * @generated
   */
  WithTransitionsDefinition getComposition();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionDefinition#getComposition <em>Composition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composition</em>' containment reference.
   * @see #getComposition()
   * @generated
   */
  void setComposition(WithTransitionsDefinition value);

} // TransitionDefinition
