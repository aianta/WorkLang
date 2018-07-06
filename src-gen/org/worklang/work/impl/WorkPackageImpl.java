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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.worklang.work.BinaryExpression;
import org.worklang.work.CollectionInstance;
import org.worklang.work.CompoundStateDefinition;
import org.worklang.work.CompoundTransitionDefinition;
import org.worklang.work.CompoundTransitionInstance;
import org.worklang.work.CompoundTransitionInstanceBody;
import org.worklang.work.DefinitionSpace;
import org.worklang.work.ExecutionResult;
import org.worklang.work.FieldDefinition;
import org.worklang.work.IfInstanceInstruction;
import org.worklang.work.IfInstruction;
import org.worklang.work.InputDefinition;
import org.worklang.work.Instance;
import org.worklang.work.InstanceInstructionExpression;
import org.worklang.work.InstanceSpace;
import org.worklang.work.InstructionExpression;
import org.worklang.work.LiteralValue;
import org.worklang.work.MapSpace;
import org.worklang.work.Model;
import org.worklang.work.Operation;
import org.worklang.work.OutputDefinition;
import org.worklang.work.Predicate;
import org.worklang.work.PrimitiveStateDefinition;
import org.worklang.work.PrimitiveTransitionDefinition;
import org.worklang.work.ReferenceSpace;
import org.worklang.work.ReferenceState;
import org.worklang.work.ReferenceTransition;
import org.worklang.work.ResolvableInstanceValue;
import org.worklang.work.ResolvableTransitionOutputValue;
import org.worklang.work.ResolvableValue;
import org.worklang.work.SetStatement;
import org.worklang.work.SimpleInstanceInstruction;
import org.worklang.work.SimpleInstruction;
import org.worklang.work.StateDeclaration;
import org.worklang.work.StateDefinition;
import org.worklang.work.StateInstance;
import org.worklang.work.StateMapping;
import org.worklang.work.TestValue;
import org.worklang.work.ToDefinition;
import org.worklang.work.TransitionComposition;
import org.worklang.work.TransitionCompositionBody;
import org.worklang.work.TransitionDeclaration;
import org.worklang.work.TransitionDefinition;
import org.worklang.work.TransitionInstance;
import org.worklang.work.TransitionMapping;
import org.worklang.work.UseDefinition;
import org.worklang.work.WhileInstanceInstruction;
import org.worklang.work.WhileInstruction;
import org.worklang.work.WithStatesDefinition;
import org.worklang.work.WorkFactory;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkPackageImpl extends EPackageImpl implements WorkPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapSpaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionSpaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveStateDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundStateDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveTransitionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundTransitionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceSpaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceTransitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceSpaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withStatesDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass useDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionCompositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionCompositionBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundTransitionInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundTransitionInstanceBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceInstructionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleInstanceInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifInstanceInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileInstanceInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resolvableValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resolvableInstanceValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resolvableTransitionOutputValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executionResultEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.worklang.work.WorkPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WorkPackageImpl()
  {
    super(eNS_URI, WorkFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link WorkPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WorkPackage init()
  {
    if (isInited) return (WorkPackage)EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI);

    // Obtain or create and register package
    WorkPackageImpl theWorkPackage = (WorkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theWorkPackage.createPackageContents();

    // Initialize created meta-data
    theWorkPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theWorkPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WorkPackage.eNS_URI, theWorkPackage);
    return theWorkPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Fields()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldDefinition()
  {
    return fieldDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldDefinition_Name()
  {
    return (EAttribute)fieldDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDefinition_DefinitionSpace()
  {
    return (EReference)fieldDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDefinition_ReferenceSpace()
  {
    return (EReference)fieldDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDefinition_MapSpace()
  {
    return (EReference)fieldDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDefinition_InstanceSpace()
  {
    return (EReference)fieldDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapSpace()
  {
    return mapSpaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapSpace_MappedStates()
  {
    return (EReference)mapSpaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapSpace_MappedTransitions()
  {
    return (EReference)mapSpaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateMapping()
  {
    return stateMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMapping_ForeignState()
  {
    return (EReference)stateMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMapping_Field()
  {
    return (EReference)stateMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMapping_LocalState()
  {
    return (EReference)stateMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionMapping()
  {
    return transitionMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionMapping_ForeignTransition()
  {
    return (EReference)transitionMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionMapping_Field()
  {
    return (EReference)transitionMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionMapping_LocalTransition()
  {
    return (EReference)transitionMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinitionSpace()
  {
    return definitionSpaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinitionSpace_States()
  {
    return (EReference)definitionSpaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinitionSpace_Transitions()
  {
    return (EReference)definitionSpaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateDefinition()
  {
    return stateDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateDefinition_Instance()
  {
    return (EReference)stateDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateDefinition_List()
  {
    return (EAttribute)stateDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateDefinition_Type()
  {
    return (EAttribute)stateDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateDefinition_Name()
  {
    return (EAttribute)stateDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveStateDefinition()
  {
    return primitiveStateDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundStateDefinition()
  {
    return compoundStateDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundStateDefinition_Composition()
  {
    return (EReference)compoundStateDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionDefinition()
  {
    return transitionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionDefinition_Type()
  {
    return (EAttribute)transitionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionDefinition_Name()
  {
    return (EAttribute)transitionDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDefinition_In()
  {
    return (EReference)transitionDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDefinition_Out()
  {
    return (EReference)transitionDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveTransitionDefinition()
  {
    return primitiveTransitionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundTransitionDefinition()
  {
    return compoundTransitionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundTransitionDefinition_Composition()
  {
    return (EReference)compoundTransitionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceSpace()
  {
    return referenceSpaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceSpace_RefStates()
  {
    return (EReference)referenceSpaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceSpace_RefTransitions()
  {
    return (EReference)referenceSpaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceTransition()
  {
    return referenceTransitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceTransition_RefTransition()
  {
    return (EReference)referenceTransitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceTransition_ForeignField()
  {
    return (EReference)referenceTransitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceState()
  {
    return referenceStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceState_RefState()
  {
    return (EReference)referenceStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceState_ForeignField()
  {
    return (EReference)referenceStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceSpace()
  {
    return instanceSpaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceSpace_Instances()
  {
    return (EReference)instanceSpaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWithStatesDefinition()
  {
    return withStatesDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWithStatesDefinition_Predicate()
  {
    return (EReference)withStatesDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputDefinition()
  {
    return inputDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputDefinition_InputState()
  {
    return (EReference)inputDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputDefinition()
  {
    return outputDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputDefinition_OutputState()
  {
    return (EReference)outputDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstance()
  {
    return instanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_TransitionDeclaration()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_StateDeclaration()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstance_IsCollectionElement()
  {
    return (EAttribute)instanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstance_Name()
  {
    return (EAttribute)instanceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_State()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Transition()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_CompoundTransition()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Collection()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionDeclaration()
  {
    return transitionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDeclaration_Transition()
  {
    return (EReference)transitionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateDeclaration()
  {
    return stateDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateDeclaration_State()
  {
    return (EReference)stateDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionInstance()
  {
    return transitionInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionInstance_Host()
  {
    return (EAttribute)transitionInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionInstance_Port()
  {
    return (EAttribute)transitionInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionInstance_Path()
  {
    return (EAttribute)transitionInstanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionInstance_SupportCollections()
  {
    return (EAttribute)transitionInstanceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateInstance()
  {
    return stateInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateInstance_Members()
  {
    return (EReference)stateInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectionInstance()
  {
    return collectionInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollectionInstance_Elements()
  {
    return (EReference)collectionInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUseDefinition()
  {
    return useDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseDefinition_PredefinedValue()
  {
    return (EReference)useDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetStatement()
  {
    return setStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetStatement_Variable()
  {
    return (EReference)setStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetStatement_ToDef()
  {
    return (EReference)setStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToDefinition()
  {
    return toDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToDefinition_Value()
  {
    return (EAttribute)toDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicate()
  {
    return predicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPredicate_Negation()
  {
    return (EAttribute)predicateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicate_Expression()
  {
    return (EReference)predicateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryExpression()
  {
    return binaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionComposition()
  {
    return transitionCompositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionComposition_Body()
  {
    return (EReference)transitionCompositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionCompositionBody()
  {
    return transitionCompositionBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionCompositionBody_StartingInputs()
  {
    return (EReference)transitionCompositionBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionCompositionBody_Expression()
  {
    return (EReference)transitionCompositionBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructionExpression()
  {
    return instructionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfInstruction()
  {
    return ifInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfInstruction_TestKey()
  {
    return (EReference)ifInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfInstruction_TestValue()
  {
    return (EReference)ifInstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfInstruction_ToComputeIfTrue()
  {
    return (EReference)ifInstructionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfInstruction_ToComputeIfFalse()
  {
    return (EReference)ifInstructionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileInstruction()
  {
    return whileInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileInstruction_TestKey()
  {
    return (EReference)whileInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileInstruction_TestValue()
  {
    return (EReference)whileInstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileInstruction_ToCompute()
  {
    return (EReference)whileInstructionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleInstruction()
  {
    return simpleInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleInstruction_ToExecute()
  {
    return (EReference)simpleInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundTransitionInstance()
  {
    return compoundTransitionInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundTransitionInstance_Body()
  {
    return (EReference)compoundTransitionInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundTransitionInstanceBody()
  {
    return compoundTransitionInstanceBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundTransitionInstanceBody_StartingInputs()
  {
    return (EReference)compoundTransitionInstanceBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundTransitionInstanceBody_Expression()
  {
    return (EReference)compoundTransitionInstanceBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceInstructionExpression()
  {
    return instanceInstructionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleInstanceInstruction()
  {
    return simpleInstanceInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleInstanceInstruction_ToExecute()
  {
    return (EReference)simpleInstanceInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfInstanceInstruction()
  {
    return ifInstanceInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfInstanceInstruction_TestKey()
  {
    return (EReference)ifInstanceInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfInstanceInstruction_TestValue()
  {
    return (EReference)ifInstanceInstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfInstanceInstruction_ToComputeIfTrue()
  {
    return (EReference)ifInstanceInstructionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfInstanceInstruction_ToComputeIfFalse()
  {
    return (EReference)ifInstanceInstructionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileInstanceInstruction()
  {
    return whileInstanceInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileInstanceInstruction_TestKey()
  {
    return (EReference)whileInstanceInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileInstanceInstruction_TestValue()
  {
    return (EReference)whileInstanceInstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileInstanceInstruction_ToCompute()
  {
    return (EReference)whileInstanceInstructionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestValue()
  {
    return testValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralValue()
  {
    return literalValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralValue_Value()
  {
    return (EAttribute)literalValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResolvableValue()
  {
    return resolvableValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResolvableValue_Key()
  {
    return (EReference)resolvableValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResolvableInstanceValue()
  {
    return resolvableInstanceValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResolvableInstanceValue_Instance()
  {
    return (EReference)resolvableInstanceValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResolvableTransitionOutputValue()
  {
    return resolvableTransitionOutputValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResolvableTransitionOutputValue_State()
  {
    return (EReference)resolvableTransitionOutputValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Left()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Op()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Right()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecutionResult()
  {
    return executionResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecutionResult_ComputeFirst()
  {
    return (EReference)executionResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecutionResult_ComputeNext()
  {
    return (EReference)executionResultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkFactory getWorkFactory()
  {
    return (WorkFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__FIELDS);

    fieldDefinitionEClass = createEClass(FIELD_DEFINITION);
    createEAttribute(fieldDefinitionEClass, FIELD_DEFINITION__NAME);
    createEReference(fieldDefinitionEClass, FIELD_DEFINITION__DEFINITION_SPACE);
    createEReference(fieldDefinitionEClass, FIELD_DEFINITION__REFERENCE_SPACE);
    createEReference(fieldDefinitionEClass, FIELD_DEFINITION__MAP_SPACE);
    createEReference(fieldDefinitionEClass, FIELD_DEFINITION__INSTANCE_SPACE);

    mapSpaceEClass = createEClass(MAP_SPACE);
    createEReference(mapSpaceEClass, MAP_SPACE__MAPPED_STATES);
    createEReference(mapSpaceEClass, MAP_SPACE__MAPPED_TRANSITIONS);

    stateMappingEClass = createEClass(STATE_MAPPING);
    createEReference(stateMappingEClass, STATE_MAPPING__FOREIGN_STATE);
    createEReference(stateMappingEClass, STATE_MAPPING__FIELD);
    createEReference(stateMappingEClass, STATE_MAPPING__LOCAL_STATE);

    transitionMappingEClass = createEClass(TRANSITION_MAPPING);
    createEReference(transitionMappingEClass, TRANSITION_MAPPING__FOREIGN_TRANSITION);
    createEReference(transitionMappingEClass, TRANSITION_MAPPING__FIELD);
    createEReference(transitionMappingEClass, TRANSITION_MAPPING__LOCAL_TRANSITION);

    definitionSpaceEClass = createEClass(DEFINITION_SPACE);
    createEReference(definitionSpaceEClass, DEFINITION_SPACE__STATES);
    createEReference(definitionSpaceEClass, DEFINITION_SPACE__TRANSITIONS);

    stateDefinitionEClass = createEClass(STATE_DEFINITION);
    createEReference(stateDefinitionEClass, STATE_DEFINITION__INSTANCE);
    createEAttribute(stateDefinitionEClass, STATE_DEFINITION__LIST);
    createEAttribute(stateDefinitionEClass, STATE_DEFINITION__TYPE);
    createEAttribute(stateDefinitionEClass, STATE_DEFINITION__NAME);

    primitiveStateDefinitionEClass = createEClass(PRIMITIVE_STATE_DEFINITION);

    compoundStateDefinitionEClass = createEClass(COMPOUND_STATE_DEFINITION);
    createEReference(compoundStateDefinitionEClass, COMPOUND_STATE_DEFINITION__COMPOSITION);

    transitionDefinitionEClass = createEClass(TRANSITION_DEFINITION);
    createEAttribute(transitionDefinitionEClass, TRANSITION_DEFINITION__TYPE);
    createEAttribute(transitionDefinitionEClass, TRANSITION_DEFINITION__NAME);
    createEReference(transitionDefinitionEClass, TRANSITION_DEFINITION__IN);
    createEReference(transitionDefinitionEClass, TRANSITION_DEFINITION__OUT);

    primitiveTransitionDefinitionEClass = createEClass(PRIMITIVE_TRANSITION_DEFINITION);

    compoundTransitionDefinitionEClass = createEClass(COMPOUND_TRANSITION_DEFINITION);
    createEReference(compoundTransitionDefinitionEClass, COMPOUND_TRANSITION_DEFINITION__COMPOSITION);

    referenceSpaceEClass = createEClass(REFERENCE_SPACE);
    createEReference(referenceSpaceEClass, REFERENCE_SPACE__REF_STATES);
    createEReference(referenceSpaceEClass, REFERENCE_SPACE__REF_TRANSITIONS);

    referenceTransitionEClass = createEClass(REFERENCE_TRANSITION);
    createEReference(referenceTransitionEClass, REFERENCE_TRANSITION__REF_TRANSITION);
    createEReference(referenceTransitionEClass, REFERENCE_TRANSITION__FOREIGN_FIELD);

    referenceStateEClass = createEClass(REFERENCE_STATE);
    createEReference(referenceStateEClass, REFERENCE_STATE__REF_STATE);
    createEReference(referenceStateEClass, REFERENCE_STATE__FOREIGN_FIELD);

    instanceSpaceEClass = createEClass(INSTANCE_SPACE);
    createEReference(instanceSpaceEClass, INSTANCE_SPACE__INSTANCES);

    withStatesDefinitionEClass = createEClass(WITH_STATES_DEFINITION);
    createEReference(withStatesDefinitionEClass, WITH_STATES_DEFINITION__PREDICATE);

    inputDefinitionEClass = createEClass(INPUT_DEFINITION);
    createEReference(inputDefinitionEClass, INPUT_DEFINITION__INPUT_STATE);

    outputDefinitionEClass = createEClass(OUTPUT_DEFINITION);
    createEReference(outputDefinitionEClass, OUTPUT_DEFINITION__OUTPUT_STATE);

    instanceEClass = createEClass(INSTANCE);
    createEReference(instanceEClass, INSTANCE__TRANSITION_DECLARATION);
    createEReference(instanceEClass, INSTANCE__STATE_DECLARATION);
    createEAttribute(instanceEClass, INSTANCE__IS_COLLECTION_ELEMENT);
    createEAttribute(instanceEClass, INSTANCE__NAME);
    createEReference(instanceEClass, INSTANCE__STATE);
    createEReference(instanceEClass, INSTANCE__TRANSITION);
    createEReference(instanceEClass, INSTANCE__COMPOUND_TRANSITION);
    createEReference(instanceEClass, INSTANCE__COLLECTION);

    transitionDeclarationEClass = createEClass(TRANSITION_DECLARATION);
    createEReference(transitionDeclarationEClass, TRANSITION_DECLARATION__TRANSITION);

    stateDeclarationEClass = createEClass(STATE_DECLARATION);
    createEReference(stateDeclarationEClass, STATE_DECLARATION__STATE);

    transitionInstanceEClass = createEClass(TRANSITION_INSTANCE);
    createEAttribute(transitionInstanceEClass, TRANSITION_INSTANCE__HOST);
    createEAttribute(transitionInstanceEClass, TRANSITION_INSTANCE__PORT);
    createEAttribute(transitionInstanceEClass, TRANSITION_INSTANCE__PATH);
    createEAttribute(transitionInstanceEClass, TRANSITION_INSTANCE__SUPPORT_COLLECTIONS);

    stateInstanceEClass = createEClass(STATE_INSTANCE);
    createEReference(stateInstanceEClass, STATE_INSTANCE__MEMBERS);

    collectionInstanceEClass = createEClass(COLLECTION_INSTANCE);
    createEReference(collectionInstanceEClass, COLLECTION_INSTANCE__ELEMENTS);

    useDefinitionEClass = createEClass(USE_DEFINITION);
    createEReference(useDefinitionEClass, USE_DEFINITION__PREDEFINED_VALUE);

    setStatementEClass = createEClass(SET_STATEMENT);
    createEReference(setStatementEClass, SET_STATEMENT__VARIABLE);
    createEReference(setStatementEClass, SET_STATEMENT__TO_DEF);

    toDefinitionEClass = createEClass(TO_DEFINITION);
    createEAttribute(toDefinitionEClass, TO_DEFINITION__VALUE);

    predicateEClass = createEClass(PREDICATE);
    createEAttribute(predicateEClass, PREDICATE__NEGATION);
    createEReference(predicateEClass, PREDICATE__EXPRESSION);

    binaryExpressionEClass = createEClass(BINARY_EXPRESSION);

    transitionCompositionEClass = createEClass(TRANSITION_COMPOSITION);
    createEReference(transitionCompositionEClass, TRANSITION_COMPOSITION__BODY);

    transitionCompositionBodyEClass = createEClass(TRANSITION_COMPOSITION_BODY);
    createEReference(transitionCompositionBodyEClass, TRANSITION_COMPOSITION_BODY__STARTING_INPUTS);
    createEReference(transitionCompositionBodyEClass, TRANSITION_COMPOSITION_BODY__EXPRESSION);

    instructionExpressionEClass = createEClass(INSTRUCTION_EXPRESSION);

    ifInstructionEClass = createEClass(IF_INSTRUCTION);
    createEReference(ifInstructionEClass, IF_INSTRUCTION__TEST_KEY);
    createEReference(ifInstructionEClass, IF_INSTRUCTION__TEST_VALUE);
    createEReference(ifInstructionEClass, IF_INSTRUCTION__TO_COMPUTE_IF_TRUE);
    createEReference(ifInstructionEClass, IF_INSTRUCTION__TO_COMPUTE_IF_FALSE);

    whileInstructionEClass = createEClass(WHILE_INSTRUCTION);
    createEReference(whileInstructionEClass, WHILE_INSTRUCTION__TEST_KEY);
    createEReference(whileInstructionEClass, WHILE_INSTRUCTION__TEST_VALUE);
    createEReference(whileInstructionEClass, WHILE_INSTRUCTION__TO_COMPUTE);

    simpleInstructionEClass = createEClass(SIMPLE_INSTRUCTION);
    createEReference(simpleInstructionEClass, SIMPLE_INSTRUCTION__TO_EXECUTE);

    compoundTransitionInstanceEClass = createEClass(COMPOUND_TRANSITION_INSTANCE);
    createEReference(compoundTransitionInstanceEClass, COMPOUND_TRANSITION_INSTANCE__BODY);

    compoundTransitionInstanceBodyEClass = createEClass(COMPOUND_TRANSITION_INSTANCE_BODY);
    createEReference(compoundTransitionInstanceBodyEClass, COMPOUND_TRANSITION_INSTANCE_BODY__STARTING_INPUTS);
    createEReference(compoundTransitionInstanceBodyEClass, COMPOUND_TRANSITION_INSTANCE_BODY__EXPRESSION);

    instanceInstructionExpressionEClass = createEClass(INSTANCE_INSTRUCTION_EXPRESSION);

    simpleInstanceInstructionEClass = createEClass(SIMPLE_INSTANCE_INSTRUCTION);
    createEReference(simpleInstanceInstructionEClass, SIMPLE_INSTANCE_INSTRUCTION__TO_EXECUTE);

    ifInstanceInstructionEClass = createEClass(IF_INSTANCE_INSTRUCTION);
    createEReference(ifInstanceInstructionEClass, IF_INSTANCE_INSTRUCTION__TEST_KEY);
    createEReference(ifInstanceInstructionEClass, IF_INSTANCE_INSTRUCTION__TEST_VALUE);
    createEReference(ifInstanceInstructionEClass, IF_INSTANCE_INSTRUCTION__TO_COMPUTE_IF_TRUE);
    createEReference(ifInstanceInstructionEClass, IF_INSTANCE_INSTRUCTION__TO_COMPUTE_IF_FALSE);

    whileInstanceInstructionEClass = createEClass(WHILE_INSTANCE_INSTRUCTION);
    createEReference(whileInstanceInstructionEClass, WHILE_INSTANCE_INSTRUCTION__TEST_KEY);
    createEReference(whileInstanceInstructionEClass, WHILE_INSTANCE_INSTRUCTION__TEST_VALUE);
    createEReference(whileInstanceInstructionEClass, WHILE_INSTANCE_INSTRUCTION__TO_COMPUTE);

    testValueEClass = createEClass(TEST_VALUE);

    literalValueEClass = createEClass(LITERAL_VALUE);
    createEAttribute(literalValueEClass, LITERAL_VALUE__VALUE);

    resolvableValueEClass = createEClass(RESOLVABLE_VALUE);
    createEReference(resolvableValueEClass, RESOLVABLE_VALUE__KEY);

    resolvableInstanceValueEClass = createEClass(RESOLVABLE_INSTANCE_VALUE);
    createEReference(resolvableInstanceValueEClass, RESOLVABLE_INSTANCE_VALUE__INSTANCE);

    resolvableTransitionOutputValueEClass = createEClass(RESOLVABLE_TRANSITION_OUTPUT_VALUE);
    createEReference(resolvableTransitionOutputValueEClass, RESOLVABLE_TRANSITION_OUTPUT_VALUE__STATE);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__LEFT);
    createEAttribute(operationEClass, OPERATION__OP);
    createEReference(operationEClass, OPERATION__RIGHT);

    executionResultEClass = createEClass(EXECUTION_RESULT);
    createEReference(executionResultEClass, EXECUTION_RESULT__COMPUTE_FIRST);
    createEReference(executionResultEClass, EXECUTION_RESULT__COMPUTE_NEXT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    stateDefinitionEClass.getESuperTypes().add(this.getBinaryExpression());
    primitiveStateDefinitionEClass.getESuperTypes().add(this.getStateDefinition());
    compoundStateDefinitionEClass.getESuperTypes().add(this.getStateDefinition());
    primitiveTransitionDefinitionEClass.getESuperTypes().add(this.getTransitionDefinition());
    compoundTransitionDefinitionEClass.getESuperTypes().add(this.getTransitionDefinition());
    predicateEClass.getESuperTypes().add(this.getBinaryExpression());
    ifInstructionEClass.getESuperTypes().add(this.getInstructionExpression());
    whileInstructionEClass.getESuperTypes().add(this.getInstructionExpression());
    simpleInstructionEClass.getESuperTypes().add(this.getInstructionExpression());
    simpleInstanceInstructionEClass.getESuperTypes().add(this.getInstanceInstructionExpression());
    ifInstanceInstructionEClass.getESuperTypes().add(this.getInstanceInstructionExpression());
    whileInstanceInstructionEClass.getESuperTypes().add(this.getInstanceInstructionExpression());
    literalValueEClass.getESuperTypes().add(this.getTestValue());
    resolvableValueEClass.getESuperTypes().add(this.getTestValue());
    resolvableInstanceValueEClass.getESuperTypes().add(this.getResolvableValue());
    resolvableTransitionOutputValueEClass.getESuperTypes().add(this.getResolvableValue());
    operationEClass.getESuperTypes().add(this.getBinaryExpression());
    executionResultEClass.getESuperTypes().add(this.getInstructionExpression());
    executionResultEClass.getESuperTypes().add(this.getInstanceInstructionExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Fields(), this.getFieldDefinition(), null, "fields", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldDefinitionEClass, FieldDefinition.class, "FieldDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFieldDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldDefinition_DefinitionSpace(), this.getDefinitionSpace(), null, "definitionSpace", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldDefinition_ReferenceSpace(), this.getReferenceSpace(), null, "referenceSpace", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldDefinition_MapSpace(), this.getMapSpace(), null, "mapSpace", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldDefinition_InstanceSpace(), this.getInstanceSpace(), null, "instanceSpace", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mapSpaceEClass, MapSpace.class, "MapSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapSpace_MappedStates(), this.getStateMapping(), null, "mappedStates", null, 0, -1, MapSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapSpace_MappedTransitions(), this.getTransitionMapping(), null, "mappedTransitions", null, 0, -1, MapSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateMappingEClass, StateMapping.class, "StateMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateMapping_ForeignState(), this.getStateDefinition(), null, "foreignState", null, 0, 1, StateMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateMapping_Field(), this.getFieldDefinition(), null, "field", null, 0, 1, StateMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateMapping_LocalState(), this.getStateDefinition(), null, "localState", null, 0, 1, StateMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionMappingEClass, TransitionMapping.class, "TransitionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionMapping_ForeignTransition(), this.getTransitionDefinition(), null, "foreignTransition", null, 0, 1, TransitionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionMapping_Field(), this.getFieldDefinition(), null, "field", null, 0, 1, TransitionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionMapping_LocalTransition(), this.getTransitionDefinition(), null, "localTransition", null, 0, 1, TransitionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionSpaceEClass, DefinitionSpace.class, "DefinitionSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinitionSpace_States(), this.getStateDefinition(), null, "states", null, 0, -1, DefinitionSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinitionSpace_Transitions(), this.getTransitionDefinition(), null, "transitions", null, 0, -1, DefinitionSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateDefinitionEClass, StateDefinition.class, "StateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateDefinition_Instance(), this.getStateDefinition(), null, "instance", null, 0, 1, StateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateDefinition_List(), ecorePackage.getEBoolean(), "list", null, 0, 1, StateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateDefinition_Type(), ecorePackage.getEString(), "type", null, 0, 1, StateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveStateDefinitionEClass, PrimitiveStateDefinition.class, "PrimitiveStateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compoundStateDefinitionEClass, CompoundStateDefinition.class, "CompoundStateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompoundStateDefinition_Composition(), this.getWithStatesDefinition(), null, "composition", null, 0, 1, CompoundStateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionDefinitionEClass, TransitionDefinition.class, "TransitionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionDefinition_Type(), ecorePackage.getEString(), "type", null, 0, 1, TransitionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransitionDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, TransitionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionDefinition_In(), this.getInputDefinition(), null, "in", null, 0, 1, TransitionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionDefinition_Out(), this.getOutputDefinition(), null, "out", null, 0, 1, TransitionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveTransitionDefinitionEClass, PrimitiveTransitionDefinition.class, "PrimitiveTransitionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compoundTransitionDefinitionEClass, CompoundTransitionDefinition.class, "CompoundTransitionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompoundTransitionDefinition_Composition(), this.getTransitionComposition(), null, "composition", null, 0, 1, CompoundTransitionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceSpaceEClass, ReferenceSpace.class, "ReferenceSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceSpace_RefStates(), this.getReferenceState(), null, "refStates", null, 0, -1, ReferenceSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceSpace_RefTransitions(), this.getReferenceTransition(), null, "refTransitions", null, 0, -1, ReferenceSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceTransitionEClass, ReferenceTransition.class, "ReferenceTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceTransition_RefTransition(), this.getTransitionDefinition(), null, "refTransition", null, 0, 1, ReferenceTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceTransition_ForeignField(), this.getFieldDefinition(), null, "foreignField", null, 0, 1, ReferenceTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceStateEClass, ReferenceState.class, "ReferenceState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceState_RefState(), this.getStateDefinition(), null, "refState", null, 0, 1, ReferenceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceState_ForeignField(), this.getFieldDefinition(), null, "foreignField", null, 0, 1, ReferenceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceSpaceEClass, InstanceSpace.class, "InstanceSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstanceSpace_Instances(), this.getInstance(), null, "instances", null, 0, -1, InstanceSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(withStatesDefinitionEClass, WithStatesDefinition.class, "WithStatesDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWithStatesDefinition_Predicate(), this.getPredicate(), null, "predicate", null, 0, 1, WithStatesDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputDefinitionEClass, InputDefinition.class, "InputDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInputDefinition_InputState(), this.getStateDefinition(), null, "inputState", null, 0, -1, InputDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputDefinitionEClass, OutputDefinition.class, "OutputDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputDefinition_OutputState(), this.getStateDefinition(), null, "outputState", null, 0, 1, OutputDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstance_TransitionDeclaration(), this.getTransitionDeclaration(), null, "transitionDeclaration", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_StateDeclaration(), this.getStateDeclaration(), null, "stateDeclaration", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstance_IsCollectionElement(), ecorePackage.getEBoolean(), "isCollectionElement", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_State(), this.getStateInstance(), null, "state", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_Transition(), this.getTransitionInstance(), null, "transition", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_CompoundTransition(), this.getCompoundTransitionInstance(), null, "compoundTransition", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_Collection(), this.getCollectionInstance(), null, "collection", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionDeclarationEClass, TransitionDeclaration.class, "TransitionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionDeclaration_Transition(), this.getTransitionDefinition(), null, "transition", null, 0, 1, TransitionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateDeclarationEClass, StateDeclaration.class, "StateDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateDeclaration_State(), this.getStateDefinition(), null, "state", null, 0, 1, StateDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionInstanceEClass, TransitionInstance.class, "TransitionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionInstance_Host(), ecorePackage.getEString(), "host", null, 0, 1, TransitionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransitionInstance_Port(), ecorePackage.getEInt(), "port", null, 0, 1, TransitionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransitionInstance_Path(), ecorePackage.getEString(), "path", null, 0, 1, TransitionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransitionInstance_SupportCollections(), ecorePackage.getEBoolean(), "supportCollections", null, 0, 1, TransitionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateInstanceEClass, StateInstance.class, "StateInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateInstance_Members(), ecorePackage.getEObject(), null, "members", null, 0, -1, StateInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectionInstanceEClass, CollectionInstance.class, "CollectionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCollectionInstance_Elements(), this.getInstance(), null, "elements", null, 0, -1, CollectionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(useDefinitionEClass, UseDefinition.class, "UseDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUseDefinition_PredefinedValue(), this.getInstance(), null, "predefinedValue", null, 0, 1, UseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setStatementEClass, SetStatement.class, "SetStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetStatement_Variable(), this.getStateDefinition(), null, "variable", null, 0, 1, SetStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetStatement_ToDef(), this.getToDefinition(), null, "toDef", null, 0, 1, SetStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(toDefinitionEClass, ToDefinition.class, "ToDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getToDefinition_Value(), ecorePackage.getEString(), "value", null, 0, 1, ToDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPredicate_Negation(), ecorePackage.getEBoolean(), "negation", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicate_Expression(), this.getBinaryExpression(), null, "expression", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionCompositionEClass, TransitionComposition.class, "TransitionComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionComposition_Body(), this.getTransitionCompositionBody(), null, "body", null, 0, 1, TransitionComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionCompositionBodyEClass, TransitionCompositionBody.class, "TransitionCompositionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionCompositionBody_StartingInputs(), this.getStateDefinition(), null, "startingInputs", null, 0, -1, TransitionCompositionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionCompositionBody_Expression(), this.getInstructionExpression(), null, "expression", null, 0, 1, TransitionCompositionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionExpressionEClass, InstructionExpression.class, "InstructionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ifInstructionEClass, IfInstruction.class, "IfInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfInstruction_TestKey(), this.getResolvableValue(), null, "testKey", null, 0, 1, IfInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfInstruction_TestValue(), this.getTestValue(), null, "testValue", null, 0, 1, IfInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfInstruction_ToComputeIfTrue(), this.getInstructionExpression(), null, "toComputeIfTrue", null, 0, 1, IfInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfInstruction_ToComputeIfFalse(), this.getInstructionExpression(), null, "toComputeIfFalse", null, 0, 1, IfInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileInstructionEClass, WhileInstruction.class, "WhileInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhileInstruction_TestKey(), this.getResolvableValue(), null, "testKey", null, 0, 1, WhileInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileInstruction_TestValue(), this.getTestValue(), null, "testValue", null, 0, 1, WhileInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileInstruction_ToCompute(), this.getInstructionExpression(), null, "toCompute", null, 0, 1, WhileInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleInstructionEClass, SimpleInstruction.class, "SimpleInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleInstruction_ToExecute(), this.getTransitionDefinition(), null, "toExecute", null, 0, -1, SimpleInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundTransitionInstanceEClass, CompoundTransitionInstance.class, "CompoundTransitionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompoundTransitionInstance_Body(), this.getCompoundTransitionInstanceBody(), null, "body", null, 0, 1, CompoundTransitionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundTransitionInstanceBodyEClass, CompoundTransitionInstanceBody.class, "CompoundTransitionInstanceBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompoundTransitionInstanceBody_StartingInputs(), this.getInstance(), null, "startingInputs", null, 0, -1, CompoundTransitionInstanceBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompoundTransitionInstanceBody_Expression(), this.getInstanceInstructionExpression(), null, "expression", null, 0, 1, CompoundTransitionInstanceBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceInstructionExpressionEClass, InstanceInstructionExpression.class, "InstanceInstructionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleInstanceInstructionEClass, SimpleInstanceInstruction.class, "SimpleInstanceInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleInstanceInstruction_ToExecute(), this.getInstance(), null, "toExecute", null, 0, -1, SimpleInstanceInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifInstanceInstructionEClass, IfInstanceInstruction.class, "IfInstanceInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfInstanceInstruction_TestKey(), this.getResolvableValue(), null, "testKey", null, 0, 1, IfInstanceInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfInstanceInstruction_TestValue(), this.getTestValue(), null, "testValue", null, 0, 1, IfInstanceInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfInstanceInstruction_ToComputeIfTrue(), this.getInstanceInstructionExpression(), null, "toComputeIfTrue", null, 0, 1, IfInstanceInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfInstanceInstruction_ToComputeIfFalse(), this.getInstanceInstructionExpression(), null, "toComputeIfFalse", null, 0, 1, IfInstanceInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileInstanceInstructionEClass, WhileInstanceInstruction.class, "WhileInstanceInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhileInstanceInstruction_TestKey(), this.getResolvableValue(), null, "testKey", null, 0, 1, WhileInstanceInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileInstanceInstruction_TestValue(), this.getTestValue(), null, "testValue", null, 0, 1, WhileInstanceInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileInstanceInstruction_ToCompute(), this.getInstanceInstructionExpression(), null, "toCompute", null, 0, 1, WhileInstanceInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testValueEClass, TestValue.class, "TestValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(literalValueEClass, LiteralValue.class, "LiteralValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resolvableValueEClass, ResolvableValue.class, "ResolvableValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResolvableValue_Key(), this.getStateDefinition(), null, "key", null, 0, 1, ResolvableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resolvableInstanceValueEClass, ResolvableInstanceValue.class, "ResolvableInstanceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResolvableInstanceValue_Instance(), this.getInstance(), null, "instance", null, 0, 1, ResolvableInstanceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resolvableTransitionOutputValueEClass, ResolvableTransitionOutputValue.class, "ResolvableTransitionOutputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResolvableTransitionOutputValue_State(), this.getStateDefinition(), null, "state", null, 0, 1, ResolvableTransitionOutputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_Left(), this.getBinaryExpression(), null, "left", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Op(), ecorePackage.getEString(), "op", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Right(), this.getBinaryExpression(), null, "right", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(executionResultEClass, ExecutionResult.class, "ExecutionResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecutionResult_ComputeFirst(), ecorePackage.getEObject(), null, "computeFirst", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecutionResult_ComputeNext(), ecorePackage.getEObject(), null, "computeNext", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //WorkPackageImpl
