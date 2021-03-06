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
 * A representation of the model object '<em><b>Reference Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.ReferenceTransition#getRefTransition <em>Ref Transition</em>}</li>
 *   <li>{@link org.worklang.work.ReferenceTransition#getForeignField <em>Foreign Field</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getReferenceTransition()
 * @model
 * @generated
 */
public interface ReferenceTransition extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Transition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Transition</em>' reference.
   * @see #setRefTransition(TransitionDefinition)
   * @see org.worklang.work.WorkPackage#getReferenceTransition_RefTransition()
   * @model
   * @generated
   */
  TransitionDefinition getRefTransition();

  /**
   * Sets the value of the '{@link org.worklang.work.ReferenceTransition#getRefTransition <em>Ref Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Transition</em>' reference.
   * @see #getRefTransition()
   * @generated
   */
  void setRefTransition(TransitionDefinition value);

  /**
   * Returns the value of the '<em><b>Foreign Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreign Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreign Field</em>' reference.
   * @see #setForeignField(FieldDefinition)
   * @see org.worklang.work.WorkPackage#getReferenceTransition_ForeignField()
   * @model
   * @generated
   */
  FieldDefinition getForeignField();

  /**
   * Sets the value of the '{@link org.worklang.work.ReferenceTransition#getForeignField <em>Foreign Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreign Field</em>' reference.
   * @see #getForeignField()
   * @generated
   */
  void setForeignField(FieldDefinition value);

} // ReferenceTransition
