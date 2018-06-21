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
   * Returns a new object of class '<em>Field Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Definition</em>'.
   * @generated
   */
  FieldDefinition createFieldDefinition();

  /**
   * Returns a new object of class '<em>Map Space</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Space</em>'.
   * @generated
   */
  MapSpace createMapSpace();

  /**
   * Returns a new object of class '<em>State Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Mapping</em>'.
   * @generated
   */
  StateMapping createStateMapping();

  /**
   * Returns a new object of class '<em>Transition Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Mapping</em>'.
   * @generated
   */
  TransitionMapping createTransitionMapping();

  /**
   * Returns a new object of class '<em>Definition Space</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition Space</em>'.
   * @generated
   */
  DefinitionSpace createDefinitionSpace();

  /**
   * Returns a new object of class '<em>State Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Definition</em>'.
   * @generated
   */
  StateDefinition createStateDefinition();

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
   * Returns a new object of class '<em>Transition Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Definition</em>'.
   * @generated
   */
  TransitionDefinition createTransitionDefinition();

  /**
   * Returns a new object of class '<em>Primitive Transition Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Transition Definition</em>'.
   * @generated
   */
  PrimitiveTransitionDefinition createPrimitiveTransitionDefinition();

  /**
   * Returns a new object of class '<em>Compound Transition Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compound Transition Definition</em>'.
   * @generated
   */
  CompoundTransitionDefinition createCompoundTransitionDefinition();

  /**
   * Returns a new object of class '<em>Reference Space</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Space</em>'.
   * @generated
   */
  ReferenceSpace createReferenceSpace();

  /**
   * Returns a new object of class '<em>Reference Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Transition</em>'.
   * @generated
   */
  ReferenceTransition createReferenceTransition();

  /**
   * Returns a new object of class '<em>Reference State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference State</em>'.
   * @generated
   */
  ReferenceState createReferenceState();

  /**
   * Returns a new object of class '<em>Instance Space</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Space</em>'.
   * @generated
   */
  InstanceSpace createInstanceSpace();

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
   * Returns a new object of class '<em>Transition ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition ID</em>'.
   * @generated
   */
  TransitionID createTransitionID();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WorkPackage getWorkPackage();

} //WorkFactory
