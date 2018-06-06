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
 * A representation of the model object '<em><b>Expert Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.ExpertDefinition#getExpertDef <em>Expert Def</em>}</li>
 *   <li>{@link org.worklang.work.ExpertDefinition#getUser <em>User</em>}</li>
 *   <li>{@link org.worklang.work.ExpertDefinition#getDomainDef <em>Domain Def</em>}</li>
 *   <li>{@link org.worklang.work.ExpertDefinition#getKnowledgeDef <em>Knowledge Def</em>}</li>
 *   <li>{@link org.worklang.work.ExpertDefinition#getSkillsDef <em>Skills Def</em>}</li>
 *   <li>{@link org.worklang.work.ExpertDefinition#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see org.worklang.work.WorkPackage#getExpertDefinition()
 * @model
 * @generated
 */
public interface ExpertDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Expert Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expert Def</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expert Def</em>' attribute.
   * @see #setExpertDef(String)
   * @see org.worklang.work.WorkPackage#getExpertDefinition_ExpertDef()
   * @model
   * @generated
   */
  String getExpertDef();

  /**
   * Sets the value of the '{@link org.worklang.work.ExpertDefinition#getExpertDef <em>Expert Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expert Def</em>' attribute.
   * @see #getExpertDef()
   * @generated
   */
  void setExpertDef(String value);

  /**
   * Returns the value of the '<em><b>User</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User</em>' containment reference.
   * @see #setUser(User)
   * @see org.worklang.work.WorkPackage#getExpertDefinition_User()
   * @model containment="true"
   * @generated
   */
  User getUser();

  /**
   * Sets the value of the '{@link org.worklang.work.ExpertDefinition#getUser <em>User</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User</em>' containment reference.
   * @see #getUser()
   * @generated
   */
  void setUser(User value);

  /**
   * Returns the value of the '<em><b>Domain Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Def</em>' containment reference.
   * @see #setDomainDef(DomainDefinition)
   * @see org.worklang.work.WorkPackage#getExpertDefinition_DomainDef()
   * @model containment="true"
   * @generated
   */
  DomainDefinition getDomainDef();

  /**
   * Sets the value of the '{@link org.worklang.work.ExpertDefinition#getDomainDef <em>Domain Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain Def</em>' containment reference.
   * @see #getDomainDef()
   * @generated
   */
  void setDomainDef(DomainDefinition value);

  /**
   * Returns the value of the '<em><b>Knowledge Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Knowledge Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Knowledge Def</em>' containment reference.
   * @see #setKnowledgeDef(KnowledgeDefinition)
   * @see org.worklang.work.WorkPackage#getExpertDefinition_KnowledgeDef()
   * @model containment="true"
   * @generated
   */
  KnowledgeDefinition getKnowledgeDef();

  /**
   * Sets the value of the '{@link org.worklang.work.ExpertDefinition#getKnowledgeDef <em>Knowledge Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Knowledge Def</em>' containment reference.
   * @see #getKnowledgeDef()
   * @generated
   */
  void setKnowledgeDef(KnowledgeDefinition value);

  /**
   * Returns the value of the '<em><b>Skills Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skills Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skills Def</em>' containment reference.
   * @see #setSkillsDef(SkillsDefinition)
   * @see org.worklang.work.WorkPackage#getExpertDefinition_SkillsDef()
   * @model containment="true"
   * @generated
   */
  SkillsDefinition getSkillsDef();

  /**
   * Sets the value of the '{@link org.worklang.work.ExpertDefinition#getSkillsDef <em>Skills Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skills Def</em>' containment reference.
   * @see #getSkillsDef()
   * @generated
   */
  void setSkillsDef(SkillsDefinition value);

  /**
   * Returns the value of the '<em><b>Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' attribute.
   * @see #setRate(int)
   * @see org.worklang.work.WorkPackage#getExpertDefinition_Rate()
   * @model
   * @generated
   */
  int getRate();

  /**
   * Sets the value of the '{@link org.worklang.work.ExpertDefinition#getRate <em>Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' attribute.
   * @see #getRate()
   * @generated
   */
  void setRate(int value);

} // ExpertDefinition
