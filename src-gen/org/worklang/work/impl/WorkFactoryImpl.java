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
package org.worklang.work.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.worklang.work.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkFactoryImpl extends EFactoryImpl implements WorkFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WorkFactory init()
  {
    try
    {
      WorkFactory theWorkFactory = (WorkFactory)EPackage.Registry.INSTANCE.getEFactory(WorkPackage.eNS_URI);
      if (theWorkFactory != null)
      {
        return theWorkFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WorkFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WorkPackage.MODEL: return createModel();
      case WorkPackage.FIELD_DEFINITION: return createFieldDefinition();
      case WorkPackage.MAP_SPACE: return createMapSpace();
      case WorkPackage.STATE_MAPPING: return createStateMapping();
      case WorkPackage.TRANSITION_MAPPING: return createTransitionMapping();
      case WorkPackage.DEFINITION_SPACE: return createDefinitionSpace();
      case WorkPackage.STATE_DEFINITION: return createStateDefinition();
      case WorkPackage.PRIMITIVE_STATE_DEFINITION: return createPrimitiveStateDefinition();
      case WorkPackage.COMPOUND_STATE_DEFINITION: return createCompoundStateDefinition();
      case WorkPackage.TRANSITION_DEFINITION: return createTransitionDefinition();
      case WorkPackage.PRIMITIVE_TRANSITION_DEFINITION: return createPrimitiveTransitionDefinition();
      case WorkPackage.COMPOUND_TRANSITION_DEFINITION: return createCompoundTransitionDefinition();
      case WorkPackage.REFERENCE_SPACE: return createReferenceSpace();
      case WorkPackage.REFERENCE_TRANSITION: return createReferenceTransition();
      case WorkPackage.REFERENCE_STATE: return createReferenceState();
      case WorkPackage.INSTANCE_SPACE: return createInstanceSpace();
      case WorkPackage.WITH_STATES_DEFINITION: return createWithStatesDefinition();
      case WorkPackage.WITH_TRANSITIONS_DEFINITION: return createWithTransitionsDefinition();
      case WorkPackage.INPUT_DEFINITION: return createInputDefinition();
      case WorkPackage.OUTPUT_DEFINITION: return createOutputDefinition();
      case WorkPackage.INSTANCE: return createInstance();
      case WorkPackage.TRANSITION_DECLARATION: return createTransitionDeclaration();
      case WorkPackage.STATE_DECLARATION: return createStateDeclaration();
      case WorkPackage.TRANSITION_INSTANCE: return createTransitionInstance();
      case WorkPackage.STATE_INSTANCE: return createStateInstance();
      case WorkPackage.USE_DEFINITION: return createUseDefinition();
      case WorkPackage.SET_STATEMENT: return createSetStatement();
      case WorkPackage.TO_DEFINITION: return createToDefinition();
      case WorkPackage.PREDICATE: return createPredicate();
      case WorkPackage.BINARY_EXPRESSION: return createBinaryExpression();
      case WorkPackage.TRANSITIONAL_EXPRESSION: return createTransitionalExpression();
      case WorkPackage.OPERATION: return createOperation();
      case WorkPackage.TRANSITION_ID: return createTransitionID();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDefinition createFieldDefinition()
  {
    FieldDefinitionImpl fieldDefinition = new FieldDefinitionImpl();
    return fieldDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapSpace createMapSpace()
  {
    MapSpaceImpl mapSpace = new MapSpaceImpl();
    return mapSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMapping createStateMapping()
  {
    StateMappingImpl stateMapping = new StateMappingImpl();
    return stateMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionMapping createTransitionMapping()
  {
    TransitionMappingImpl transitionMapping = new TransitionMappingImpl();
    return transitionMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionSpace createDefinitionSpace()
  {
    DefinitionSpaceImpl definitionSpace = new DefinitionSpaceImpl();
    return definitionSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDefinition createStateDefinition()
  {
    StateDefinitionImpl stateDefinition = new StateDefinitionImpl();
    return stateDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveStateDefinition createPrimitiveStateDefinition()
  {
    PrimitiveStateDefinitionImpl primitiveStateDefinition = new PrimitiveStateDefinitionImpl();
    return primitiveStateDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundStateDefinition createCompoundStateDefinition()
  {
    CompoundStateDefinitionImpl compoundStateDefinition = new CompoundStateDefinitionImpl();
    return compoundStateDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionDefinition createTransitionDefinition()
  {
    TransitionDefinitionImpl transitionDefinition = new TransitionDefinitionImpl();
    return transitionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveTransitionDefinition createPrimitiveTransitionDefinition()
  {
    PrimitiveTransitionDefinitionImpl primitiveTransitionDefinition = new PrimitiveTransitionDefinitionImpl();
    return primitiveTransitionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundTransitionDefinition createCompoundTransitionDefinition()
  {
    CompoundTransitionDefinitionImpl compoundTransitionDefinition = new CompoundTransitionDefinitionImpl();
    return compoundTransitionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceSpace createReferenceSpace()
  {
    ReferenceSpaceImpl referenceSpace = new ReferenceSpaceImpl();
    return referenceSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceTransition createReferenceTransition()
  {
    ReferenceTransitionImpl referenceTransition = new ReferenceTransitionImpl();
    return referenceTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceState createReferenceState()
  {
    ReferenceStateImpl referenceState = new ReferenceStateImpl();
    return referenceState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceSpace createInstanceSpace()
  {
    InstanceSpaceImpl instanceSpace = new InstanceSpaceImpl();
    return instanceSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithStatesDefinition createWithStatesDefinition()
  {
    WithStatesDefinitionImpl withStatesDefinition = new WithStatesDefinitionImpl();
    return withStatesDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithTransitionsDefinition createWithTransitionsDefinition()
  {
    WithTransitionsDefinitionImpl withTransitionsDefinition = new WithTransitionsDefinitionImpl();
    return withTransitionsDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputDefinition createInputDefinition()
  {
    InputDefinitionImpl inputDefinition = new InputDefinitionImpl();
    return inputDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputDefinition createOutputDefinition()
  {
    OutputDefinitionImpl outputDefinition = new OutputDefinitionImpl();
    return outputDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionDeclaration createTransitionDeclaration()
  {
    TransitionDeclarationImpl transitionDeclaration = new TransitionDeclarationImpl();
    return transitionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDeclaration createStateDeclaration()
  {
    StateDeclarationImpl stateDeclaration = new StateDeclarationImpl();
    return stateDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionInstance createTransitionInstance()
  {
    TransitionInstanceImpl transitionInstance = new TransitionInstanceImpl();
    return transitionInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateInstance createStateInstance()
  {
    StateInstanceImpl stateInstance = new StateInstanceImpl();
    return stateInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseDefinition createUseDefinition()
  {
    UseDefinitionImpl useDefinition = new UseDefinitionImpl();
    return useDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetStatement createSetStatement()
  {
    SetStatementImpl setStatement = new SetStatementImpl();
    return setStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToDefinition createToDefinition()
  {
    ToDefinitionImpl toDefinition = new ToDefinitionImpl();
    return toDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predicate createPredicate()
  {
    PredicateImpl predicate = new PredicateImpl();
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpression createBinaryExpression()
  {
    BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
    return binaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionalExpression createTransitionalExpression()
  {
    TransitionalExpressionImpl transitionalExpression = new TransitionalExpressionImpl();
    return transitionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionID createTransitionID()
  {
    TransitionIDImpl transitionID = new TransitionIDImpl();
    return transitionID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkPackage getWorkPackage()
  {
    return (WorkPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WorkPackage getPackage()
  {
    return WorkPackage.eINSTANCE;
  }

} //WorkFactoryImpl
