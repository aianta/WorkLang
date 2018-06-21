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
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.Instance#getTransitionDeclaration <em>Transition Declaration</em>}</li>
 *   <li>{@link org.worklang.work.Instance#getStateDeclaration <em>State Declaration</em>}</li>
 *   <li>{@link org.worklang.work.Instance#getName <em>Name</em>}</li>
 *   <li>{@link org.worklang.work.Instance#getState <em>State</em>}</li>
 *   <li>{@link org.worklang.work.Instance#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject
{
  /**
   * Returns the value of the '<em><b>Transition Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition Declaration</em>' containment reference.
   * @see #setTransitionDeclaration(TransitionDeclaration)
   * @see org.worklang.work.WorkPackage#getInstance_TransitionDeclaration()
   * @model containment="true"
   * @generated
   */
  TransitionDeclaration getTransitionDeclaration();

  /**
   * Sets the value of the '{@link org.worklang.work.Instance#getTransitionDeclaration <em>Transition Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition Declaration</em>' containment reference.
   * @see #getTransitionDeclaration()
   * @generated
   */
  void setTransitionDeclaration(TransitionDeclaration value);

  /**
   * Returns the value of the '<em><b>State Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Declaration</em>' containment reference.
   * @see #setStateDeclaration(StateDeclaration)
   * @see org.worklang.work.WorkPackage#getInstance_StateDeclaration()
   * @model containment="true"
   * @generated
   */
  StateDeclaration getStateDeclaration();

  /**
   * Sets the value of the '{@link org.worklang.work.Instance#getStateDeclaration <em>State Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Declaration</em>' containment reference.
   * @see #getStateDeclaration()
   * @generated
   */
  void setStateDeclaration(StateDeclaration value);

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
   * @see org.worklang.work.WorkPackage#getInstance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.worklang.work.Instance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference.
   * @see #setState(StateInstance)
   * @see org.worklang.work.WorkPackage#getInstance_State()
   * @model containment="true"
   * @generated
   */
  StateInstance getState();

  /**
   * Sets the value of the '{@link org.worklang.work.Instance#getState <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' containment reference.
   * @see #getState()
   * @generated
   */
  void setState(StateInstance value);

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference.
   * @see #setTransition(TransitionInstance)
   * @see org.worklang.work.WorkPackage#getInstance_Transition()
   * @model containment="true"
   * @generated
   */
  TransitionInstance getTransition();

  /**
   * Sets the value of the '{@link org.worklang.work.Instance#getTransition <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' containment reference.
   * @see #getTransition()
   * @generated
   */
  void setTransition(TransitionInstance value);

} // Instance
