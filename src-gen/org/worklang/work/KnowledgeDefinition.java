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
 * A representation of the model object '<em><b>Knowledge Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.KnowledgeDefinition#getKnowledgeDef <em>Knowledge Def</em>}</li>
 *   <li>{@link org.worklang.work.KnowledgeDefinition#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getKnowledgeDefinition()
 * @model
 * @generated
 */
public interface KnowledgeDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Knowledge Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Knowledge Def</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Knowledge Def</em>' attribute.
   * @see #setKnowledgeDef(String)
   * @see org.worklang.work.WorkPackage#getKnowledgeDefinition_KnowledgeDef()
   * @model
   * @generated
   */
  String getKnowledgeDef();

  /**
   * Sets the value of the '{@link org.worklang.work.KnowledgeDefinition#getKnowledgeDef <em>Knowledge Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Knowledge Def</em>' attribute.
   * @see #getKnowledgeDef()
   * @generated
   */
  void setKnowledgeDef(String value);

  /**
   * Returns the value of the '<em><b>Knowledge</b></em>' containment reference list.
   * The list contents are of type {@link org.worklang.work.ReferenceState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Knowledge</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Knowledge</em>' containment reference list.
   * @see org.worklang.work.WorkPackage#getKnowledgeDefinition_Knowledge()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceState> getKnowledge();

} // KnowledgeDefinition
