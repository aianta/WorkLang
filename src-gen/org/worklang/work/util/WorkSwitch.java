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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.worklang.work.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.worklang.work.WorkPackage
 * @generated
 */
public class WorkSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WorkPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = WorkPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case WorkPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.FIELD_DEFINITION:
      {
        FieldDefinition fieldDefinition = (FieldDefinition)theEObject;
        T result = caseFieldDefinition(fieldDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.MAP_SPACE:
      {
        MapSpace mapSpace = (MapSpace)theEObject;
        T result = caseMapSpace(mapSpace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.STATE_MAPPING:
      {
        StateMapping stateMapping = (StateMapping)theEObject;
        T result = caseStateMapping(stateMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.TRANSITION_MAPPING:
      {
        TransitionMapping transitionMapping = (TransitionMapping)theEObject;
        T result = caseTransitionMapping(transitionMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.DEFINITION_SPACE:
      {
        DefinitionSpace definitionSpace = (DefinitionSpace)theEObject;
        T result = caseDefinitionSpace(definitionSpace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.STATE_DEFINITION:
      {
        StateDefinition stateDefinition = (StateDefinition)theEObject;
        T result = caseStateDefinition(stateDefinition);
        if (result == null) result = caseBinaryExpression(stateDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.PRIMITIVE_STATE_DEFINITION:
      {
        PrimitiveStateDefinition primitiveStateDefinition = (PrimitiveStateDefinition)theEObject;
        T result = casePrimitiveStateDefinition(primitiveStateDefinition);
        if (result == null) result = caseStateDefinition(primitiveStateDefinition);
        if (result == null) result = caseBinaryExpression(primitiveStateDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.COMPOUND_STATE_DEFINITION:
      {
        CompoundStateDefinition compoundStateDefinition = (CompoundStateDefinition)theEObject;
        T result = caseCompoundStateDefinition(compoundStateDefinition);
        if (result == null) result = caseStateDefinition(compoundStateDefinition);
        if (result == null) result = caseBinaryExpression(compoundStateDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.TRANSITION_DEFINITION:
      {
        TransitionDefinition transitionDefinition = (TransitionDefinition)theEObject;
        T result = caseTransitionDefinition(transitionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.PRIMITIVE_TRANSITION_DEFINITION:
      {
        PrimitiveTransitionDefinition primitiveTransitionDefinition = (PrimitiveTransitionDefinition)theEObject;
        T result = casePrimitiveTransitionDefinition(primitiveTransitionDefinition);
        if (result == null) result = caseTransitionDefinition(primitiveTransitionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.COMPOUND_TRANSITION_DEFINITION:
      {
        CompoundTransitionDefinition compoundTransitionDefinition = (CompoundTransitionDefinition)theEObject;
        T result = caseCompoundTransitionDefinition(compoundTransitionDefinition);
        if (result == null) result = caseTransitionDefinition(compoundTransitionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.REFERENCE_SPACE:
      {
        ReferenceSpace referenceSpace = (ReferenceSpace)theEObject;
        T result = caseReferenceSpace(referenceSpace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.REFERENCE_TRANSITION:
      {
        ReferenceTransition referenceTransition = (ReferenceTransition)theEObject;
        T result = caseReferenceTransition(referenceTransition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.REFERENCE_STATE:
      {
        ReferenceState referenceState = (ReferenceState)theEObject;
        T result = caseReferenceState(referenceState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.INSTANCE_SPACE:
      {
        InstanceSpace instanceSpace = (InstanceSpace)theEObject;
        T result = caseInstanceSpace(instanceSpace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.WITH_STATES_DEFINITION:
      {
        WithStatesDefinition withStatesDefinition = (WithStatesDefinition)theEObject;
        T result = caseWithStatesDefinition(withStatesDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.INPUT_DEFINITION:
      {
        InputDefinition inputDefinition = (InputDefinition)theEObject;
        T result = caseInputDefinition(inputDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.OUTPUT_DEFINITION:
      {
        OutputDefinition outputDefinition = (OutputDefinition)theEObject;
        T result = caseOutputDefinition(outputDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.INSTANCE:
      {
        Instance instance = (Instance)theEObject;
        T result = caseInstance(instance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.TRANSITION_DECLARATION:
      {
        TransitionDeclaration transitionDeclaration = (TransitionDeclaration)theEObject;
        T result = caseTransitionDeclaration(transitionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.STATE_DECLARATION:
      {
        StateDeclaration stateDeclaration = (StateDeclaration)theEObject;
        T result = caseStateDeclaration(stateDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.TRANSITION_INSTANCE:
      {
        TransitionInstance transitionInstance = (TransitionInstance)theEObject;
        T result = caseTransitionInstance(transitionInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.STATE_INSTANCE:
      {
        StateInstance stateInstance = (StateInstance)theEObject;
        T result = caseStateInstance(stateInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.USE_DEFINITION:
      {
        UseDefinition useDefinition = (UseDefinition)theEObject;
        T result = caseUseDefinition(useDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.SET_STATEMENT:
      {
        SetStatement setStatement = (SetStatement)theEObject;
        T result = caseSetStatement(setStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.TO_DEFINITION:
      {
        ToDefinition toDefinition = (ToDefinition)theEObject;
        T result = caseToDefinition(toDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.PREDICATE:
      {
        Predicate predicate = (Predicate)theEObject;
        T result = casePredicate(predicate);
        if (result == null) result = caseBinaryExpression(predicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.BINARY_EXPRESSION:
      {
        BinaryExpression binaryExpression = (BinaryExpression)theEObject;
        T result = caseBinaryExpression(binaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.TRANSITION_COMPOSITION:
      {
        TransitionComposition transitionComposition = (TransitionComposition)theEObject;
        T result = caseTransitionComposition(transitionComposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.TRANSITION_COMPOSITION_BODY:
      {
        TransitionCompositionBody transitionCompositionBody = (TransitionCompositionBody)theEObject;
        T result = caseTransitionCompositionBody(transitionCompositionBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.INSTRUCTION_EXPRESSION:
      {
        InstructionExpression instructionExpression = (InstructionExpression)theEObject;
        T result = caseInstructionExpression(instructionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.IF_INSTRUCTION:
      {
        IfInstruction ifInstruction = (IfInstruction)theEObject;
        T result = caseIfInstruction(ifInstruction);
        if (result == null) result = caseInstructionExpression(ifInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.WHILE_INSTRUCTION:
      {
        WhileInstruction whileInstruction = (WhileInstruction)theEObject;
        T result = caseWhileInstruction(whileInstruction);
        if (result == null) result = caseInstructionExpression(whileInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.SIMPLE_INSTRUCTION:
      {
        SimpleInstruction simpleInstruction = (SimpleInstruction)theEObject;
        T result = caseSimpleInstruction(simpleInstruction);
        if (result == null) result = caseInstructionExpression(simpleInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.COMPOUND_TRANSITION_INSTANCE:
      {
        CompoundTransitionInstance compoundTransitionInstance = (CompoundTransitionInstance)theEObject;
        T result = caseCompoundTransitionInstance(compoundTransitionInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY:
      {
        CompoundTransitionInstanceBody compoundTransitionInstanceBody = (CompoundTransitionInstanceBody)theEObject;
        T result = caseCompoundTransitionInstanceBody(compoundTransitionInstanceBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.INSTANCE_INSTRUCTION_EXPRESSION:
      {
        InstanceInstructionExpression instanceInstructionExpression = (InstanceInstructionExpression)theEObject;
        T result = caseInstanceInstructionExpression(instanceInstructionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.SIMPLE_INSTANCE_INSTRUCTION:
      {
        SimpleInstanceInstruction simpleInstanceInstruction = (SimpleInstanceInstruction)theEObject;
        T result = caseSimpleInstanceInstruction(simpleInstanceInstruction);
        if (result == null) result = caseInstanceInstructionExpression(simpleInstanceInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.IF_INSTANCE_INSTRUCTION:
      {
        IfInstanceInstruction ifInstanceInstruction = (IfInstanceInstruction)theEObject;
        T result = caseIfInstanceInstruction(ifInstanceInstruction);
        if (result == null) result = caseInstanceInstructionExpression(ifInstanceInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.WHILE_INSTANCE_INSTRUCTION:
      {
        WhileInstanceInstruction whileInstanceInstruction = (WhileInstanceInstruction)theEObject;
        T result = caseWhileInstanceInstruction(whileInstanceInstruction);
        if (result == null) result = caseInstanceInstructionExpression(whileInstanceInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.TEST_VALUE:
      {
        TestValue testValue = (TestValue)theEObject;
        T result = caseTestValue(testValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.LITERAL_VALUE:
      {
        LiteralValue literalValue = (LiteralValue)theEObject;
        T result = caseLiteralValue(literalValue);
        if (result == null) result = caseTestValue(literalValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.RESOLVABLE_VALUE:
      {
        ResolvableValue resolvableValue = (ResolvableValue)theEObject;
        T result = caseResolvableValue(resolvableValue);
        if (result == null) result = caseTestValue(resolvableValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.RESOLVABLE_INSTANCE_VALUE:
      {
        ResolvableInstanceValue resolvableInstanceValue = (ResolvableInstanceValue)theEObject;
        T result = caseResolvableInstanceValue(resolvableInstanceValue);
        if (result == null) result = caseResolvableValue(resolvableInstanceValue);
        if (result == null) result = caseTestValue(resolvableInstanceValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.RESOLVABLE_TRANSITION_OUTPUT_VALUE:
      {
        ResolvableTransitionOutputValue resolvableTransitionOutputValue = (ResolvableTransitionOutputValue)theEObject;
        T result = caseResolvableTransitionOutputValue(resolvableTransitionOutputValue);
        if (result == null) result = caseResolvableValue(resolvableTransitionOutputValue);
        if (result == null) result = caseTestValue(resolvableTransitionOutputValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseBinaryExpression(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WorkPackage.EXECUTION_RESULT:
      {
        ExecutionResult executionResult = (ExecutionResult)theEObject;
        T result = caseExecutionResult(executionResult);
        if (result == null) result = caseInstructionExpression(executionResult);
        if (result == null) result = caseInstanceInstructionExpression(executionResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldDefinition(FieldDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Space</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Space</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapSpace(MapSpace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateMapping(StateMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionMapping(TransitionMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Space</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Space</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionSpace(DefinitionSpace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateDefinition(StateDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive State Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive State Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveStateDefinition(PrimitiveStateDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound State Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound State Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundStateDefinition(CompoundStateDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionDefinition(TransitionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Transition Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Transition Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveTransitionDefinition(PrimitiveTransitionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound Transition Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound Transition Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundTransitionDefinition(CompoundTransitionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Space</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Space</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceSpace(ReferenceSpace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceTransition(ReferenceTransition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceState(ReferenceState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Space</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Space</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceSpace(InstanceSpace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>With States Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>With States Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWithStatesDefinition(WithStatesDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputDefinition(InputDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputDefinition(OutputDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstance(Instance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionDeclaration(TransitionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateDeclaration(StateDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionInstance(TransitionInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateInstance(StateInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseDefinition(UseDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetStatement(SetStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>To Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>To Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToDefinition(ToDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicate(Predicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExpression(BinaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Composition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Composition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionComposition(TransitionComposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Composition Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Composition Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionCompositionBody(TransitionCompositionBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstructionExpression(InstructionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfInstruction(IfInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileInstruction(WhileInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleInstruction(SimpleInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound Transition Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound Transition Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundTransitionInstance(CompoundTransitionInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound Transition Instance Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound Transition Instance Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundTransitionInstanceBody(CompoundTransitionInstanceBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Instruction Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Instruction Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceInstructionExpression(InstanceInstructionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Instance Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Instance Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleInstanceInstruction(SimpleInstanceInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Instance Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Instance Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfInstanceInstruction(IfInstanceInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Instance Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Instance Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileInstanceInstruction(WhileInstanceInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Test Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestValue(TestValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralValue(LiteralValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resolvable Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resolvable Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResolvableValue(ResolvableValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resolvable Instance Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resolvable Instance Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResolvableInstanceValue(ResolvableInstanceValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resolvable Transition Output Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resolvable Transition Output Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResolvableTransitionOutputValue(ResolvableTransitionOutputValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Execution Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Execution Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecutionResult(ExecutionResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //WorkSwitch
