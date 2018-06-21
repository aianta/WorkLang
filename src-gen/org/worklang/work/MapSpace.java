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
 * A representation of the model object '<em><b>Map Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.MapSpace#getMappedStates <em>Mapped States</em>}</li>
 *   <li>{@link org.worklang.work.MapSpace#getMappedTransitions <em>Mapped Transitions</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getMapSpace()
 * @model
 * @generated
 */
public interface MapSpace extends EObject
{
  /**
   * Returns the value of the '<em><b>Mapped States</b></em>' containment reference list.
   * The list contents are of type {@link org.worklang.work.StateMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped States</em>' containment reference list.
   * @see org.worklang.work.WorkPackage#getMapSpace_MappedStates()
   * @model containment="true"
   * @generated
   */
  EList<StateMapping> getMappedStates();

  /**
   * Returns the value of the '<em><b>Mapped Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.worklang.work.TransitionMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped Transitions</em>' containment reference list.
   * @see org.worklang.work.WorkPackage#getMapSpace_MappedTransitions()
   * @model containment="true"
   * @generated
   */
  EList<TransitionMapping> getMappedTransitions();

} // MapSpace
