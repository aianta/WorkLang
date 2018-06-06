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
 *   <li>{@link org.worklang.work.ReferenceTransition#getObject <em>Object</em>}</li>
 *   <li>{@link org.worklang.work.ReferenceTransition#getRefTransition <em>Ref Transition</em>}</li>
 *   <li>{@link org.worklang.work.ReferenceTransition#getFromDef <em>From Def</em>}</li>
 *   <li>{@link org.worklang.work.ReferenceTransition#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.worklang.work.ReferenceTransition#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getReferenceTransition()
 * @model
 * @generated
 */
public interface ReferenceTransition extends EObject
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
   * @see org.worklang.work.WorkPackage#getReferenceTransition_Object()
   * @model
   * @generated
   */
  String getObject();

  /**
   * Sets the value of the '{@link org.worklang.work.ReferenceTransition#getObject <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' attribute.
   * @see #getObject()
   * @generated
   */
  void setObject(String value);

  /**
   * Returns the value of the '<em><b>Ref Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Transition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Transition</em>' reference.
   * @see #setRefTransition(TransitionID)
   * @see org.worklang.work.WorkPackage#getReferenceTransition_RefTransition()
   * @model
   * @generated
   */
  TransitionID getRefTransition();

  /**
   * Sets the value of the '{@link org.worklang.work.ReferenceTransition#getRefTransition <em>Ref Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Transition</em>' reference.
   * @see #getRefTransition()
   * @generated
   */
  void setRefTransition(TransitionID value);

  /**
   * Returns the value of the '<em><b>From Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Def</em>' containment reference.
   * @see #setFromDef(FromFieldDefinition)
   * @see org.worklang.work.WorkPackage#getReferenceTransition_FromDef()
   * @model containment="true"
   * @generated
   */
  FromFieldDefinition getFromDef();

  /**
   * Sets the value of the '{@link org.worklang.work.ReferenceTransition#getFromDef <em>From Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Def</em>' containment reference.
   * @see #getFromDef()
   * @generated
   */
  void setFromDef(FromFieldDefinition value);

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
   * @see org.worklang.work.WorkPackage#getReferenceTransition_Transition()
   * @model containment="true"
   * @generated
   */
  TransitionID getTransition();

  /**
   * Sets the value of the '{@link org.worklang.work.ReferenceTransition#getTransition <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' containment reference.
   * @see #getTransition()
   * @generated
   */
  void setTransition(TransitionID value);

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
   * @see org.worklang.work.WorkPackage#getReferenceTransition_Composition()
   * @model containment="true"
   * @generated
   */
  WithTransitionsDefinition getComposition();

  /**
   * Sets the value of the '{@link org.worklang.work.ReferenceTransition#getComposition <em>Composition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composition</em>' containment reference.
   * @see #getComposition()
   * @generated
   */
  void setComposition(WithTransitionsDefinition value);

} // ReferenceTransition
