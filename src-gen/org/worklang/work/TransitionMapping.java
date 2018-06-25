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
 * A representation of the model object '<em><b>Transition Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.TransitionMapping#getForeignTransition <em>Foreign Transition</em>}</li>
 *   <li>{@link org.worklang.work.TransitionMapping#getField <em>Field</em>}</li>
 *   <li>{@link org.worklang.work.TransitionMapping#getLocalTransition <em>Local Transition</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getTransitionMapping()
 * @model
 * @generated
 */
public interface TransitionMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Foreign Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreign Transition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreign Transition</em>' reference.
   * @see #setForeignTransition(TransitionDefinition)
   * @see org.worklang.work.WorkPackage#getTransitionMapping_ForeignTransition()
   * @model
   * @generated
   */
  TransitionDefinition getForeignTransition();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionMapping#getForeignTransition <em>Foreign Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreign Transition</em>' reference.
   * @see #getForeignTransition()
   * @generated
   */
  void setForeignTransition(TransitionDefinition value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' reference.
   * @see #setField(FieldDefinition)
   * @see org.worklang.work.WorkPackage#getTransitionMapping_Field()
   * @model
   * @generated
   */
  FieldDefinition getField();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionMapping#getField <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' reference.
   * @see #getField()
   * @generated
   */
  void setField(FieldDefinition value);

  /**
   * Returns the value of the '<em><b>Local Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Transition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Transition</em>' reference.
   * @see #setLocalTransition(TransitionDefinition)
   * @see org.worklang.work.WorkPackage#getTransitionMapping_LocalTransition()
   * @model
   * @generated
   */
  TransitionDefinition getLocalTransition();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionMapping#getLocalTransition <em>Local Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Transition</em>' reference.
   * @see #getLocalTransition()
   * @generated
   */
  void setLocalTransition(TransitionDefinition value);

} // TransitionMapping
