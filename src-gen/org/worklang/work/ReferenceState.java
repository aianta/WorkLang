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
 * A representation of the model object '<em><b>Reference State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.ReferenceState#getRefState <em>Ref State</em>}</li>
 *   <li>{@link org.worklang.work.ReferenceState#getForeignField <em>Foreign Field</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getReferenceState()
 * @model
 * @generated
 */
public interface ReferenceState extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref State</em>' reference.
   * @see #setRefState(StateDefinition)
   * @see org.worklang.work.WorkPackage#getReferenceState_RefState()
   * @model
   * @generated
   */
  StateDefinition getRefState();

  /**
   * Sets the value of the '{@link org.worklang.work.ReferenceState#getRefState <em>Ref State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref State</em>' reference.
   * @see #getRefState()
   * @generated
   */
  void setRefState(StateDefinition value);

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
   * @see org.worklang.work.WorkPackage#getReferenceState_ForeignField()
   * @model
   * @generated
   */
  FieldDefinition getForeignField();

  /**
   * Sets the value of the '{@link org.worklang.work.ReferenceState#getForeignField <em>Foreign Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreign Field</em>' reference.
   * @see #getForeignField()
   * @generated
   */
  void setForeignField(FieldDefinition value);

} // ReferenceState
