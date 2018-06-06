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
 * A representation of the model object '<em><b>Transition Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.TransitionInstance#getHost <em>Host</em>}</li>
 *   <li>{@link org.worklang.work.TransitionInstance#getPort <em>Port</em>}</li>
 *   <li>{@link org.worklang.work.TransitionInstance#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getTransitionInstance()
 * @model
 * @generated
 */
public interface TransitionInstance extends EObject
{
  /**
   * Returns the value of the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host</em>' attribute.
   * @see #setHost(String)
   * @see org.worklang.work.WorkPackage#getTransitionInstance_Host()
   * @model
   * @generated
   */
  String getHost();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionInstance#getHost <em>Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Host</em>' attribute.
   * @see #getHost()
   * @generated
   */
  void setHost(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(int)
   * @see org.worklang.work.WorkPackage#getTransitionInstance_Port()
   * @model
   * @generated
   */
  int getPort();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionInstance#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(int value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see org.worklang.work.WorkPackage#getTransitionInstance_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link org.worklang.work.TransitionInstance#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // TransitionInstance
