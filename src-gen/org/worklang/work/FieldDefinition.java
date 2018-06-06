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
 * A representation of the model object '<em><b>Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.FieldDefinition#getField <em>Field</em>}</li>
 *   <li>{@link org.worklang.work.FieldDefinition#getSpace <em>Space</em>}</li>
 *   <li>{@link org.worklang.work.FieldDefinition#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.worklang.work.FieldDefinition#getConceptualspace <em>Conceptualspace</em>}</li>
 *   <li>{@link org.worklang.work.FieldDefinition#getReferencespace <em>Referencespace</em>}</li>
 *   <li>{@link org.worklang.work.FieldDefinition#getInstancespace <em>Instancespace</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getFieldDefinition()
 * @model
 * @generated
 */
public interface FieldDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' attribute.
   * @see #setField(String)
   * @see org.worklang.work.WorkPackage#getFieldDefinition_Field()
   * @model
   * @generated
   */
  String getField();

  /**
   * Sets the value of the '{@link org.worklang.work.FieldDefinition#getField <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' attribute.
   * @see #getField()
   * @generated
   */
  void setField(String value);

  /**
   * Returns the value of the '<em><b>Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Space</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Space</em>' containment reference.
   * @see #setSpace(Space)
   * @see org.worklang.work.WorkPackage#getFieldDefinition_Space()
   * @model containment="true"
   * @generated
   */
  Space getSpace();

  /**
   * Sets the value of the '{@link org.worklang.work.FieldDefinition#getSpace <em>Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Space</em>' containment reference.
   * @see #getSpace()
   * @generated
   */
  void setSpace(Space value);

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference.
   * @see #setExtends(ExtendsDefinition)
   * @see org.worklang.work.WorkPackage#getFieldDefinition_Extends()
   * @model containment="true"
   * @generated
   */
  ExtendsDefinition getExtends();

  /**
   * Sets the value of the '{@link org.worklang.work.FieldDefinition#getExtends <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' containment reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(ExtendsDefinition value);

  /**
   * Returns the value of the '<em><b>Conceptualspace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conceptualspace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conceptualspace</em>' containment reference.
   * @see #setConceptualspace(Namespace)
   * @see org.worklang.work.WorkPackage#getFieldDefinition_Conceptualspace()
   * @model containment="true"
   * @generated
   */
  Namespace getConceptualspace();

  /**
   * Sets the value of the '{@link org.worklang.work.FieldDefinition#getConceptualspace <em>Conceptualspace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conceptualspace</em>' containment reference.
   * @see #getConceptualspace()
   * @generated
   */
  void setConceptualspace(Namespace value);

  /**
   * Returns the value of the '<em><b>Referencespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referencespace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referencespace</em>' containment reference.
   * @see #setReferencespace(Referencespace)
   * @see org.worklang.work.WorkPackage#getFieldDefinition_Referencespace()
   * @model containment="true"
   * @generated
   */
  Referencespace getReferencespace();

  /**
   * Sets the value of the '{@link org.worklang.work.FieldDefinition#getReferencespace <em>Referencespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referencespace</em>' containment reference.
   * @see #getReferencespace()
   * @generated
   */
  void setReferencespace(Referencespace value);

  /**
   * Returns the value of the '<em><b>Instancespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instancespace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instancespace</em>' containment reference.
   * @see #setInstancespace(Instancespace)
   * @see org.worklang.work.WorkPackage#getFieldDefinition_Instancespace()
   * @model containment="true"
   * @generated
   */
  Instancespace getInstancespace();

  /**
   * Sets the value of the '{@link org.worklang.work.FieldDefinition#getInstancespace <em>Instancespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instancespace</em>' containment reference.
   * @see #getInstancespace()
   * @generated
   */
  void setInstancespace(Instancespace value);

} // FieldDefinition
