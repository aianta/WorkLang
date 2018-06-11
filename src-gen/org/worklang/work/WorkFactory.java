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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.worklang.work.WorkPackage
 * @generated
 */
public interface WorkFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WorkFactory eINSTANCE = org.worklang.work.impl.WorkFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Practitioner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Practitioner</em>'.
   * @generated
   */
  Practitioner createPractitioner();

  /**
   * Returns a new object of class '<em>Expert Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expert Definition</em>'.
   * @generated
   */
  ExpertDefinition createExpertDefinition();

  /**
   * Returns a new object of class '<em>User</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User</em>'.
   * @generated
   */
  User createUser();

  /**
   * Returns a new object of class '<em>Domain Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Definition</em>'.
   * @generated
   */
  DomainDefinition createDomainDefinition();

  /**
   * Returns a new object of class '<em>Knowledge Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Knowledge Definition</em>'.
   * @generated
   */
  KnowledgeDefinition createKnowledgeDefinition();

  /**
   * Returns a new object of class '<em>Skills Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Skills Definition</em>'.
   * @generated
   */
  SkillsDefinition createSkillsDefinition();

  /**
   * Returns a new object of class '<em>Field Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Definition</em>'.
   * @generated
   */
  FieldDefinition createFieldDefinition();

  /**
   * Returns a new object of class '<em>Space</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Space</em>'.
   * @generated
   */
  Space createSpace();

  /**
   * Returns a new object of class '<em>Namespace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace</em>'.
   * @generated
   */
  Namespace createNamespace();

  /**
   * Returns a new object of class '<em>Referencespace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Referencespace</em>'.
   * @generated
   */
  Referencespace createReferencespace();

  /**
   * Returns a new object of class '<em>Instancespace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instancespace</em>'.
   * @generated
   */
  Instancespace createInstancespace();

  /**
   * Returns a new object of class '<em>Reference Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Field</em>'.
   * @generated
   */
  ReferenceField createReferenceField();

  /**
   * Returns a new object of class '<em>State Object Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Object Definition</em>'.
   * @generated
   */
  StateObjectDefinition createStateObjectDefinition();

  /**
   * Returns a new object of class '<em>Transition Object Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Object Definition</em>'.
   * @generated
   */
  TransitionObjectDefinition createTransitionObjectDefinition();

  /**
   * Returns a new object of class '<em>Primitive State Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive State Definition</em>'.
   * @generated
   */
  PrimitiveStateDefinition createPrimitiveStateDefinition();

  /**
   * Returns a new object of class '<em>Compound State Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compound State Definition</em>'.
   * @generated
   */
  CompoundStateDefinition createCompoundStateDefinition();

  /**
   * Returns a new object of class '<em>State Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Definition</em>'.
   * @generated
   */
  StateDefinition createStateDefinition();

  /**
   * Returns a new object of class '<em>State ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State ID</em>'.
   * @generated
   */
  StateID createStateID();

  /**
   * Returns a new object of class '<em>With States Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With States Definition</em>'.
   * @generated
   */
  WithStatesDefinition createWithStatesDefinition();

  /**
   * Returns a new object of class '<em>With Transitions Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With Transitions Definition</em>'.
   * @generated
   */
  WithTransitionsDefinition createWithTransitionsDefinition();

  /**
   * Returns a new object of class '<em>Reference State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference State</em>'.
   * @generated
   */
  ReferenceState createReferenceState();

  /**
   * Returns a new object of class '<em>Transition Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Definition</em>'.
   * @generated
   */
  TransitionDefinition createTransitionDefinition();

  /**
   * Returns a new object of class '<em>Transition ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition ID</em>'.
   * @generated
   */
  TransitionID createTransitionID();

  /**
   * Returns a new object of class '<em>Reference Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Transition</em>'.
   * @generated
   */
  ReferenceTransition createReferenceTransition();

  /**
   * Returns a new object of class '<em>From Field Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From Field Definition</em>'.
   * @generated
   */
  FromFieldDefinition createFromFieldDefinition();

  /**
   * Returns a new object of class '<em>Input Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Definition</em>'.
   * @generated
   */
  InputDefinition createInputDefinition();

  /**
   * Returns a new object of class '<em>Output Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Definition</em>'.
   * @generated
   */
  OutputDefinition createOutputDefinition();

  /**
   * Returns a new object of class '<em>Extends Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extends Definition</em>'.
   * @generated
   */
  ExtendsDefinition createExtendsDefinition();

  /**
   * Returns a new object of class '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance</em>'.
   * @generated
   */
  Instance createInstance();

  /**
   * Returns a new object of class '<em>Transition Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Declaration</em>'.
   * @generated
   */
  TransitionDeclaration createTransitionDeclaration();

  /**
   * Returns a new object of class '<em>State Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Declaration</em>'.
   * @generated
   */
  StateDeclaration createStateDeclaration();

  /**
   * Returns a new object of class '<em>Transition Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Instance</em>'.
   * @generated
   */
  TransitionInstance createTransitionInstance();

  /**
   * Returns a new object of class '<em>State Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Instance</em>'.
   * @generated
   */
  StateInstance createStateInstance();

  /**
   * Returns a new object of class '<em>Use Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Definition</em>'.
   * @generated
   */
  UseDefinition createUseDefinition();

  /**
   * Returns a new object of class '<em>Set Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Statement</em>'.
   * @generated
   */
  SetStatement createSetStatement();

  /**
   * Returns a new object of class '<em>To Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>To Definition</em>'.
   * @generated
   */
  ToDefinition createToDefinition();

  /**
   * Returns a new object of class '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate</em>'.
   * @generated
   */
  Predicate createPredicate();

  /**
   * Returns a new object of class '<em>Binary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Expression</em>'.
   * @generated
   */
  BinaryExpression createBinaryExpression();

  /**
   * Returns a new object of class '<em>Transitional Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transitional Expression</em>'.
   * @generated
   */
  TransitionalExpression createTransitionalExpression();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WorkPackage getWorkPackage();

} //WorkFactory
