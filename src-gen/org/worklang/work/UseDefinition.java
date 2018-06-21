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
 * A representation of the model object '<em><b>Use Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.UseDefinition#getPredefinedValue <em>Predefined Value</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getUseDefinition()
 * @model
 * @generated
 */
public interface UseDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Predefined Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predefined Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predefined Value</em>' reference.
   * @see #setPredefinedValue(Instance)
   * @see org.worklang.work.WorkPackage#getUseDefinition_PredefinedValue()
   * @model
   * @generated
   */
  Instance getPredefinedValue();

  /**
   * Sets the value of the '{@link org.worklang.work.UseDefinition#getPredefinedValue <em>Predefined Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predefined Value</em>' reference.
   * @see #getPredefinedValue()
   * @generated
   */
  void setPredefinedValue(Instance value);

} // UseDefinition
