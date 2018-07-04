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
package org.worklang.work.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.worklang.work.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.worklang.work.WorkPackage
 * @generated
 */
public class WorkAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WorkPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = WorkPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkSwitch<Adapter> modelSwitch =
    new WorkSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseFieldDefinition(FieldDefinition object)
      {
        return createFieldDefinitionAdapter();
      }
      @Override
      public Adapter caseMapSpace(MapSpace object)
      {
        return createMapSpaceAdapter();
      }
      @Override
      public Adapter caseStateMapping(StateMapping object)
      {
        return createStateMappingAdapter();
      }
      @Override
      public Adapter caseTransitionMapping(TransitionMapping object)
      {
        return createTransitionMappingAdapter();
      }
      @Override
      public Adapter caseDefinitionSpace(DefinitionSpace object)
      {
        return createDefinitionSpaceAdapter();
      }
      @Override
      public Adapter caseStateDefinition(StateDefinition object)
      {
        return createStateDefinitionAdapter();
      }
      @Override
      public Adapter casePrimitiveStateDefinition(PrimitiveStateDefinition object)
      {
        return createPrimitiveStateDefinitionAdapter();
      }
      @Override
      public Adapter caseCompoundStateDefinition(CompoundStateDefinition object)
      {
        return createCompoundStateDefinitionAdapter();
      }
      @Override
      public Adapter caseTransitionDefinition(TransitionDefinition object)
      {
        return createTransitionDefinitionAdapter();
      }
      @Override
      public Adapter casePrimitiveTransitionDefinition(PrimitiveTransitionDefinition object)
      {
        return createPrimitiveTransitionDefinitionAdapter();
      }
      @Override
      public Adapter caseCompoundTransitionDefinition(CompoundTransitionDefinition object)
      {
        return createCompoundTransitionDefinitionAdapter();
      }
      @Override
      public Adapter caseReferenceSpace(ReferenceSpace object)
      {
        return createReferenceSpaceAdapter();
      }
      @Override
      public Adapter caseReferenceTransition(ReferenceTransition object)
      {
        return createReferenceTransitionAdapter();
      }
      @Override
      public Adapter caseReferenceState(ReferenceState object)
      {
        return createReferenceStateAdapter();
      }
      @Override
      public Adapter caseInstanceSpace(InstanceSpace object)
      {
        return createInstanceSpaceAdapter();
      }
      @Override
      public Adapter caseWithStatesDefinition(WithStatesDefinition object)
      {
        return createWithStatesDefinitionAdapter();
      }
      @Override
      public Adapter caseInputDefinition(InputDefinition object)
      {
        return createInputDefinitionAdapter();
      }
      @Override
      public Adapter caseOutputDefinition(OutputDefinition object)
      {
        return createOutputDefinitionAdapter();
      }
      @Override
      public Adapter caseInstance(Instance object)
      {
        return createInstanceAdapter();
      }
      @Override
      public Adapter caseTransitionDeclaration(TransitionDeclaration object)
      {
        return createTransitionDeclarationAdapter();
      }
      @Override
      public Adapter caseStateDeclaration(StateDeclaration object)
      {
        return createStateDeclarationAdapter();
      }
      @Override
      public Adapter caseTransitionInstance(TransitionInstance object)
      {
        return createTransitionInstanceAdapter();
      }
      @Override
      public Adapter caseStateInstance(StateInstance object)
      {
        return createStateInstanceAdapter();
      }
      @Override
      public Adapter caseCollectionInstance(CollectionInstance object)
      {
        return createCollectionInstanceAdapter();
      }
      @Override
      public Adapter caseUseDefinition(UseDefinition object)
      {
        return createUseDefinitionAdapter();
      }
      @Override
      public Adapter caseSetStatement(SetStatement object)
      {
        return createSetStatementAdapter();
      }
      @Override
      public Adapter caseToDefinition(ToDefinition object)
      {
        return createToDefinitionAdapter();
      }
      @Override
      public Adapter casePredicate(Predicate object)
      {
        return createPredicateAdapter();
      }
      @Override
      public Adapter caseBinaryExpression(BinaryExpression object)
      {
        return createBinaryExpressionAdapter();
      }
      @Override
      public Adapter caseTransitionComposition(TransitionComposition object)
      {
        return createTransitionCompositionAdapter();
      }
      @Override
      public Adapter caseTransitionCompositionBody(TransitionCompositionBody object)
      {
        return createTransitionCompositionBodyAdapter();
      }
      @Override
      public Adapter caseInstructionExpression(InstructionExpression object)
      {
        return createInstructionExpressionAdapter();
      }
      @Override
      public Adapter caseIfInstruction(IfInstruction object)
      {
        return createIfInstructionAdapter();
      }
      @Override
      public Adapter caseWhileInstruction(WhileInstruction object)
      {
        return createWhileInstructionAdapter();
      }
      @Override
      public Adapter caseSimpleInstruction(SimpleInstruction object)
      {
        return createSimpleInstructionAdapter();
      }
      @Override
      public Adapter caseCompoundTransitionInstance(CompoundTransitionInstance object)
      {
        return createCompoundTransitionInstanceAdapter();
      }
      @Override
      public Adapter caseCompoundTransitionInstanceBody(CompoundTransitionInstanceBody object)
      {
        return createCompoundTransitionInstanceBodyAdapter();
      }
      @Override
      public Adapter caseInstanceInstructionExpression(InstanceInstructionExpression object)
      {
        return createInstanceInstructionExpressionAdapter();
      }
      @Override
      public Adapter caseSimpleInstanceInstruction(SimpleInstanceInstruction object)
      {
        return createSimpleInstanceInstructionAdapter();
      }
      @Override
      public Adapter caseIfInstanceInstruction(IfInstanceInstruction object)
      {
        return createIfInstanceInstructionAdapter();
      }
      @Override
      public Adapter caseWhileInstanceInstruction(WhileInstanceInstruction object)
      {
        return createWhileInstanceInstructionAdapter();
      }
      @Override
      public Adapter caseTestValue(TestValue object)
      {
        return createTestValueAdapter();
      }
      @Override
      public Adapter caseLiteralValue(LiteralValue object)
      {
        return createLiteralValueAdapter();
      }
      @Override
      public Adapter caseResolvableValue(ResolvableValue object)
      {
        return createResolvableValueAdapter();
      }
      @Override
      public Adapter caseResolvableInstanceValue(ResolvableInstanceValue object)
      {
        return createResolvableInstanceValueAdapter();
      }
      @Override
      public Adapter caseResolvableTransitionOutputValue(ResolvableTransitionOutputValue object)
      {
        return createResolvableTransitionOutputValueAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseExecutionResult(ExecutionResult object)
      {
        return createExecutionResultAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.FieldDefinition <em>Field Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.FieldDefinition
   * @generated
   */
  public Adapter createFieldDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.MapSpace <em>Map Space</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.MapSpace
   * @generated
   */
  public Adapter createMapSpaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.StateMapping <em>State Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.StateMapping
   * @generated
   */
  public Adapter createStateMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.TransitionMapping <em>Transition Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.TransitionMapping
   * @generated
   */
  public Adapter createTransitionMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.DefinitionSpace <em>Definition Space</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.DefinitionSpace
   * @generated
   */
  public Adapter createDefinitionSpaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.StateDefinition <em>State Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.StateDefinition
   * @generated
   */
  public Adapter createStateDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.PrimitiveStateDefinition <em>Primitive State Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.PrimitiveStateDefinition
   * @generated
   */
  public Adapter createPrimitiveStateDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.CompoundStateDefinition <em>Compound State Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.CompoundStateDefinition
   * @generated
   */
  public Adapter createCompoundStateDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.TransitionDefinition <em>Transition Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.TransitionDefinition
   * @generated
   */
  public Adapter createTransitionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.PrimitiveTransitionDefinition <em>Primitive Transition Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.PrimitiveTransitionDefinition
   * @generated
   */
  public Adapter createPrimitiveTransitionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.CompoundTransitionDefinition <em>Compound Transition Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.CompoundTransitionDefinition
   * @generated
   */
  public Adapter createCompoundTransitionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.ReferenceSpace <em>Reference Space</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.ReferenceSpace
   * @generated
   */
  public Adapter createReferenceSpaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.ReferenceTransition <em>Reference Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.ReferenceTransition
   * @generated
   */
  public Adapter createReferenceTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.ReferenceState <em>Reference State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.ReferenceState
   * @generated
   */
  public Adapter createReferenceStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.InstanceSpace <em>Instance Space</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.InstanceSpace
   * @generated
   */
  public Adapter createInstanceSpaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.WithStatesDefinition <em>With States Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.WithStatesDefinition
   * @generated
   */
  public Adapter createWithStatesDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.InputDefinition <em>Input Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.InputDefinition
   * @generated
   */
  public Adapter createInputDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.OutputDefinition <em>Output Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.OutputDefinition
   * @generated
   */
  public Adapter createOutputDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.Instance
   * @generated
   */
  public Adapter createInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.TransitionDeclaration <em>Transition Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.TransitionDeclaration
   * @generated
   */
  public Adapter createTransitionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.StateDeclaration <em>State Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.StateDeclaration
   * @generated
   */
  public Adapter createStateDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.TransitionInstance <em>Transition Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.TransitionInstance
   * @generated
   */
  public Adapter createTransitionInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.StateInstance <em>State Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.StateInstance
   * @generated
   */
  public Adapter createStateInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.CollectionInstance <em>Collection Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.CollectionInstance
   * @generated
   */
  public Adapter createCollectionInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.UseDefinition <em>Use Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.UseDefinition
   * @generated
   */
  public Adapter createUseDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.SetStatement <em>Set Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.SetStatement
   * @generated
   */
  public Adapter createSetStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.ToDefinition <em>To Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.ToDefinition
   * @generated
   */
  public Adapter createToDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.Predicate
   * @generated
   */
  public Adapter createPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.BinaryExpression
   * @generated
   */
  public Adapter createBinaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.TransitionComposition <em>Transition Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.TransitionComposition
   * @generated
   */
  public Adapter createTransitionCompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.TransitionCompositionBody <em>Transition Composition Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.TransitionCompositionBody
   * @generated
   */
  public Adapter createTransitionCompositionBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.InstructionExpression <em>Instruction Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.InstructionExpression
   * @generated
   */
  public Adapter createInstructionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.IfInstruction <em>If Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.IfInstruction
   * @generated
   */
  public Adapter createIfInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.WhileInstruction <em>While Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.WhileInstruction
   * @generated
   */
  public Adapter createWhileInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.SimpleInstruction <em>Simple Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.SimpleInstruction
   * @generated
   */
  public Adapter createSimpleInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.CompoundTransitionInstance <em>Compound Transition Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.CompoundTransitionInstance
   * @generated
   */
  public Adapter createCompoundTransitionInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.CompoundTransitionInstanceBody <em>Compound Transition Instance Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.CompoundTransitionInstanceBody
   * @generated
   */
  public Adapter createCompoundTransitionInstanceBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.InstanceInstructionExpression <em>Instance Instruction Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.InstanceInstructionExpression
   * @generated
   */
  public Adapter createInstanceInstructionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.SimpleInstanceInstruction <em>Simple Instance Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.SimpleInstanceInstruction
   * @generated
   */
  public Adapter createSimpleInstanceInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.IfInstanceInstruction <em>If Instance Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.IfInstanceInstruction
   * @generated
   */
  public Adapter createIfInstanceInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.WhileInstanceInstruction <em>While Instance Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.WhileInstanceInstruction
   * @generated
   */
  public Adapter createWhileInstanceInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.TestValue <em>Test Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.TestValue
   * @generated
   */
  public Adapter createTestValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.LiteralValue <em>Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.LiteralValue
   * @generated
   */
  public Adapter createLiteralValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.ResolvableValue <em>Resolvable Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.ResolvableValue
   * @generated
   */
  public Adapter createResolvableValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.ResolvableInstanceValue <em>Resolvable Instance Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.ResolvableInstanceValue
   * @generated
   */
  public Adapter createResolvableInstanceValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.ResolvableTransitionOutputValue <em>Resolvable Transition Output Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.ResolvableTransitionOutputValue
   * @generated
   */
  public Adapter createResolvableTransitionOutputValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.worklang.work.ExecutionResult <em>Execution Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.worklang.work.ExecutionResult
   * @generated
   */
  public Adapter createExecutionResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //WorkAdapterFactory
