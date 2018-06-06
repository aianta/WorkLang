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
 * A representation of the model object '<em><b>Instancespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.Instancespace#getSpaceType <em>Space Type</em>}</li>
 *   <li>{@link org.worklang.work.Instancespace#getInstanceStates <em>Instance States</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getInstancespace()
 * @model
 * @generated
 */
public interface Instancespace extends EObject
{
  /**
   * Returns the value of the '<em><b>Space Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Space Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Space Type</em>' attribute.
   * @see #setSpaceType(String)
   * @see org.worklang.work.WorkPackage#getInstancespace_SpaceType()
   * @model
   * @generated
   */
  String getSpaceType();

  /**
   * Sets the value of the '{@link org.worklang.work.Instancespace#getSpaceType <em>Space Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Space Type</em>' attribute.
   * @see #getSpaceType()
   * @generated
   */
  void setSpaceType(String value);

  /**
   * Returns the value of the '<em><b>Instance States</b></em>' containment reference list.
   * The list contents are of type {@link org.worklang.work.Instance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance States</em>' containment reference list.
   * @see org.worklang.work.WorkPackage#getInstancespace_InstanceStates()
   * @model containment="true"
   * @generated
   */
  EList<Instance> getInstanceStates();

} // Instancespace
