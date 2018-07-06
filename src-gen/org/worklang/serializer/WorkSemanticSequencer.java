/*
	Copyright 2018 Alexandru Ianta
 
	Licensed under the Apache License, Version 2.0 (the "License"); 
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
 
	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 
 */
package org.worklang.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.worklang.services.WorkGrammarAccess;
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
import org.worklang.work.InstanceSpace;
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
import org.worklang.work.SetStatement;
import org.worklang.work.SimpleInstanceInstruction;
import org.worklang.work.SimpleInstruction;
import org.worklang.work.StateDeclaration;
import org.worklang.work.StateDefinition;
import org.worklang.work.StateInstance;
import org.worklang.work.StateMapping;
import org.worklang.work.ToDefinition;
import org.worklang.work.TransitionComposition;
import org.worklang.work.TransitionCompositionBody;
import org.worklang.work.TransitionDeclaration;
import org.worklang.work.TransitionInstance;
import org.worklang.work.TransitionMapping;
import org.worklang.work.UseDefinition;
import org.worklang.work.WhileInstanceInstruction;
import org.worklang.work.WhileInstruction;
import org.worklang.work.WithStatesDefinition;
import org.worklang.work.WorkPackage;

@SuppressWarnings("all")
public class WorkSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WorkGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WorkPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WorkPackage.COLLECTION_INSTANCE:
				sequence_CollectionInstance(context, (CollectionInstance) semanticObject); 
				return; 
			case WorkPackage.COMPOUND_STATE_DEFINITION:
				sequence_CompoundStateDefinition(context, (CompoundStateDefinition) semanticObject); 
				return; 
			case WorkPackage.COMPOUND_TRANSITION_DEFINITION:
				sequence_CompoundTransitionDefinition(context, (CompoundTransitionDefinition) semanticObject); 
				return; 
			case WorkPackage.COMPOUND_TRANSITION_INSTANCE:
				sequence_CompoundTransitionInstance(context, (CompoundTransitionInstance) semanticObject); 
				return; 
			case WorkPackage.COMPOUND_TRANSITION_INSTANCE_BODY:
				sequence_CompoundTransitionInstanceBody(context, (CompoundTransitionInstanceBody) semanticObject); 
				return; 
			case WorkPackage.DEFINITION_SPACE:
				sequence_DefinitionSpace(context, (DefinitionSpace) semanticObject); 
				return; 
			case WorkPackage.EXECUTION_RESULT:
				if (rule == grammarAccess.getInstanceInstructionExpressionRule()
						|| action == grammarAccess.getInstanceInstructionExpressionAccess().getExecutionResultComputeFirstAction_1_0()) {
					sequence_InstanceInstructionExpression(context, (ExecutionResult) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getInstructionExpressionRule()
						|| action == grammarAccess.getInstructionExpressionAccess().getExecutionResultComputeFirstAction_1_0()) {
					sequence_InstructionExpression(context, (ExecutionResult) semanticObject); 
					return; 
				}
				else break;
			case WorkPackage.FIELD_DEFINITION:
				sequence_FieldDefinition(context, (FieldDefinition) semanticObject); 
				return; 
			case WorkPackage.IF_INSTANCE_INSTRUCTION:
				sequence_IfInstanceInstruction(context, (IfInstanceInstruction) semanticObject); 
				return; 
			case WorkPackage.IF_INSTRUCTION:
				sequence_IfInstruction(context, (IfInstruction) semanticObject); 
				return; 
			case WorkPackage.INPUT_DEFINITION:
				sequence_InputDefinition(context, (InputDefinition) semanticObject); 
				return; 
			case WorkPackage.INSTANCE:
				sequence_Instance(context, (Instance) semanticObject); 
				return; 
			case WorkPackage.INSTANCE_SPACE:
				sequence_InstanceSpace(context, (InstanceSpace) semanticObject); 
				return; 
			case WorkPackage.LITERAL_VALUE:
				sequence_LiteralValue(context, (LiteralValue) semanticObject); 
				return; 
			case WorkPackage.MAP_SPACE:
				sequence_MapSpace(context, (MapSpace) semanticObject); 
				return; 
			case WorkPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case WorkPackage.OPERATION:
				sequence_BinaryExpression(context, (Operation) semanticObject); 
				return; 
			case WorkPackage.OUTPUT_DEFINITION:
				sequence_OutputDefinition(context, (OutputDefinition) semanticObject); 
				return; 
			case WorkPackage.PREDICATE:
				sequence_Predicate(context, (Predicate) semanticObject); 
				return; 
			case WorkPackage.PRIMITIVE_STATE_DEFINITION:
				sequence_PrimitiveStateDefinition(context, (PrimitiveStateDefinition) semanticObject); 
				return; 
			case WorkPackage.PRIMITIVE_TRANSITION_DEFINITION:
				sequence_PrimitiveTransitionDefinition(context, (PrimitiveTransitionDefinition) semanticObject); 
				return; 
			case WorkPackage.REFERENCE_SPACE:
				sequence_ReferenceSpace(context, (ReferenceSpace) semanticObject); 
				return; 
			case WorkPackage.REFERENCE_STATE:
				sequence_ReferenceState(context, (ReferenceState) semanticObject); 
				return; 
			case WorkPackage.REFERENCE_TRANSITION:
				sequence_ReferenceTransition(context, (ReferenceTransition) semanticObject); 
				return; 
			case WorkPackage.RESOLVABLE_INSTANCE_VALUE:
				sequence_ResolvableInstanceValue(context, (ResolvableInstanceValue) semanticObject); 
				return; 
			case WorkPackage.RESOLVABLE_TRANSITION_OUTPUT_VALUE:
				sequence_ResolvableTransitionOutputValue(context, (ResolvableTransitionOutputValue) semanticObject); 
				return; 
			case WorkPackage.SET_STATEMENT:
				sequence_SetStatement(context, (SetStatement) semanticObject); 
				return; 
			case WorkPackage.SIMPLE_INSTANCE_INSTRUCTION:
				sequence_SimpleInstanceInstruction(context, (SimpleInstanceInstruction) semanticObject); 
				return; 
			case WorkPackage.SIMPLE_INSTRUCTION:
				sequence_SimpleInstruction(context, (SimpleInstruction) semanticObject); 
				return; 
			case WorkPackage.STATE_DECLARATION:
				sequence_StateDeclaration(context, (StateDeclaration) semanticObject); 
				return; 
			case WorkPackage.STATE_DEFINITION:
				sequence_TerminalBinaryExpression(context, (StateDefinition) semanticObject); 
				return; 
			case WorkPackage.STATE_INSTANCE:
				sequence_StateInstance(context, (StateInstance) semanticObject); 
				return; 
			case WorkPackage.STATE_MAPPING:
				sequence_StateMapping(context, (StateMapping) semanticObject); 
				return; 
			case WorkPackage.TO_DEFINITION:
				sequence_ToDefinition(context, (ToDefinition) semanticObject); 
				return; 
			case WorkPackage.TRANSITION_COMPOSITION:
				sequence_TransitionComposition(context, (TransitionComposition) semanticObject); 
				return; 
			case WorkPackage.TRANSITION_COMPOSITION_BODY:
				sequence_TransitionCompositionBody(context, (TransitionCompositionBody) semanticObject); 
				return; 
			case WorkPackage.TRANSITION_DECLARATION:
				sequence_TransitionDeclaration(context, (TransitionDeclaration) semanticObject); 
				return; 
			case WorkPackage.TRANSITION_INSTANCE:
				sequence_TransitionInstance(context, (TransitionInstance) semanticObject); 
				return; 
			case WorkPackage.TRANSITION_MAPPING:
				sequence_TransitionMapping(context, (TransitionMapping) semanticObject); 
				return; 
			case WorkPackage.USE_DEFINITION:
				sequence_UseDefinition(context, (UseDefinition) semanticObject); 
				return; 
			case WorkPackage.WHILE_INSTANCE_INSTRUCTION:
				sequence_WhileInstanceInstruction(context, (WhileInstanceInstruction) semanticObject); 
				return; 
			case WorkPackage.WHILE_INSTRUCTION:
				sequence_WhileInstruction(context, (WhileInstruction) semanticObject); 
				return; 
			case WorkPackage.WITH_STATES_DEFINITION:
				sequence_WithStatesDefinition(context, (WithStatesDefinition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BinaryExpression returns Operation
	 *     BinaryExpression.Operation_1_0 returns Operation
	 *
	 * Constraint:
	 *     (left=BinaryExpression_Operation_1_0 (op='AND' | op='OR') right=TerminalBinaryExpression)
	 */
	protected void sequence_BinaryExpression(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CollectionInstance returns CollectionInstance
	 *
	 * Constraint:
	 *     elements+=[Instance|COLLECTION_ELEMENT_NAME]+
	 */
	protected void sequence_CollectionInstance(ISerializationContext context, CollectionInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateDefinition returns CompoundStateDefinition
	 *     CompoundStateDefinition returns CompoundStateDefinition
	 *
	 * Constraint:
	 *     (type='compound' name=ID composition=WithStatesDefinition)
	 */
	protected void sequence_CompoundStateDefinition(ISerializationContext context, CompoundStateDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE_DEFINITION__TYPE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE_DEFINITION__NAME));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.COMPOUND_STATE_DEFINITION__COMPOSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.COMPOUND_STATE_DEFINITION__COMPOSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompoundStateDefinitionAccess().getTypeCompoundKeyword_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCompoundStateDefinitionAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCompoundStateDefinitionAccess().getCompositionWithStatesDefinitionParserRuleCall_3_0(), semanticObject.getComposition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionDefinition returns CompoundTransitionDefinition
	 *     CompoundTransitionDefinition returns CompoundTransitionDefinition
	 *
	 * Constraint:
	 *     (type='compound' name=ID in=InputDefinition? out=OutputDefinition composition=TransitionComposition)
	 */
	protected void sequence_CompoundTransitionDefinition(ISerializationContext context, CompoundTransitionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompoundTransitionInstanceBody returns CompoundTransitionInstanceBody
	 *
	 * Constraint:
	 *     (startingInputs+=[Instance|ID]* expression=InstanceInstructionExpression)
	 */
	protected void sequence_CompoundTransitionInstanceBody(ISerializationContext context, CompoundTransitionInstanceBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompoundTransitionInstance returns CompoundTransitionInstance
	 *
	 * Constraint:
	 *     body=CompoundTransitionInstanceBody
	 */
	protected void sequence_CompoundTransitionInstance(ISerializationContext context, CompoundTransitionInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.COMPOUND_TRANSITION_INSTANCE__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.COMPOUND_TRANSITION_INSTANCE__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompoundTransitionInstanceAccess().getBodyCompoundTransitionInstanceBodyParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DefinitionSpace returns DefinitionSpace
	 *
	 * Constraint:
	 *     (states+=StateDefinition* transitions+=TransitionDefinition*)
	 */
	protected void sequence_DefinitionSpace(ISerializationContext context, DefinitionSpace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FieldDefinition returns FieldDefinition
	 *
	 * Constraint:
	 *     (name=ID definitionSpace=DefinitionSpace? referenceSpace=ReferenceSpace? mapSpace=MapSpace? instanceSpace=InstanceSpace?)
	 */
	protected void sequence_FieldDefinition(ISerializationContext context, FieldDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InstanceInstructionExpression returns IfInstanceInstruction
	 *     InstanceInstructionExpression.ExecutionResult_1_0 returns IfInstanceInstruction
	 *     TerminalInstanceInstruction returns IfInstanceInstruction
	 *     IfInstanceInstruction returns IfInstanceInstruction
	 *
	 * Constraint:
	 *     (testKey=ResolvableValue testValue=TestValue toComputeIfTrue=InstanceInstructionExpression toComputeIfFalse=InstanceInstructionExpression?)
	 */
	protected void sequence_IfInstanceInstruction(ISerializationContext context, IfInstanceInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InstructionExpression returns IfInstruction
	 *     InstructionExpression.ExecutionResult_1_0 returns IfInstruction
	 *     TerminalInstruction returns IfInstruction
	 *     IfInstruction returns IfInstruction
	 *
	 * Constraint:
	 *     (testKey=ResolvableValue testValue=TestValue toComputeIfTrue=InstructionExpression toComputeIfFalse=InstructionExpression?)
	 */
	protected void sequence_IfInstruction(ISerializationContext context, IfInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InputDefinition returns InputDefinition
	 *
	 * Constraint:
	 *     inputState+=[StateDefinition|ID]*
	 */
	protected void sequence_InputDefinition(ISerializationContext context, InputDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InstanceInstructionExpression returns ExecutionResult
	 *     InstanceInstructionExpression.ExecutionResult_1_0 returns ExecutionResult
	 *
	 * Constraint:
	 *     (computeFirst=InstanceInstructionExpression_ExecutionResult_1_0 computeNext=TerminalInstanceInstruction)
	 */
	protected void sequence_InstanceInstructionExpression(ISerializationContext context, ExecutionResult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.EXECUTION_RESULT__COMPUTE_FIRST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.EXECUTION_RESULT__COMPUTE_FIRST));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.EXECUTION_RESULT__COMPUTE_NEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.EXECUTION_RESULT__COMPUTE_NEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstanceInstructionExpressionAccess().getExecutionResultComputeFirstAction_1_0(), semanticObject.getComputeFirst());
		feeder.accept(grammarAccess.getInstanceInstructionExpressionAccess().getComputeNextTerminalInstanceInstructionParserRuleCall_1_1_0(), semanticObject.getComputeNext());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InstanceSpace returns InstanceSpace
	 *
	 * Constraint:
	 *     instances+=Instance*
	 */
	protected void sequence_InstanceSpace(ISerializationContext context, InstanceSpace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instance returns Instance
	 *
	 * Constraint:
	 *     (
	 *         (transitionDeclaration=TransitionDeclaration | stateDeclaration=StateDeclaration) 
	 *         isCollectionElement?='collectionElement'? 
	 *         (name=STRING | name=COLLECTION_ELEMENT_NAME) 
	 *         (state=StateInstance | transition=TransitionInstance | compoundTransition=CompoundTransitionInstance | collection=CollectionInstance)
	 *     )
	 */
	protected void sequence_Instance(ISerializationContext context, Instance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InstructionExpression returns ExecutionResult
	 *     InstructionExpression.ExecutionResult_1_0 returns ExecutionResult
	 *
	 * Constraint:
	 *     (computeFirst=InstructionExpression_ExecutionResult_1_0 computeNext=TerminalInstruction)
	 */
	protected void sequence_InstructionExpression(ISerializationContext context, ExecutionResult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.EXECUTION_RESULT__COMPUTE_FIRST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.EXECUTION_RESULT__COMPUTE_FIRST));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.EXECUTION_RESULT__COMPUTE_NEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.EXECUTION_RESULT__COMPUTE_NEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstructionExpressionAccess().getExecutionResultComputeFirstAction_1_0(), semanticObject.getComputeFirst());
		feeder.accept(grammarAccess.getInstructionExpressionAccess().getComputeNextTerminalInstructionParserRuleCall_1_1_0(), semanticObject.getComputeNext());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TestValue returns LiteralValue
	 *     LiteralValue returns LiteralValue
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_LiteralValue(ISerializationContext context, LiteralValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.LITERAL_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.LITERAL_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLiteralValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MapSpace returns MapSpace
	 *
	 * Constraint:
	 *     (mappedStates+=StateMapping* mappedTransitions+=TransitionMapping*)
	 */
	protected void sequence_MapSpace(ISerializationContext context, MapSpace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     fields+=FieldDefinition+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OutputDefinition returns OutputDefinition
	 *
	 * Constraint:
	 *     outputState=[StateDefinition|ID]
	 */
	protected void sequence_OutputDefinition(ISerializationContext context, OutputDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.OUTPUT_DEFINITION__OUTPUT_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.OUTPUT_DEFINITION__OUTPUT_STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOutputDefinitionAccess().getOutputStateStateDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.OUTPUT_DEFINITION__OUTPUT_STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Predicate returns Predicate
	 *     BinaryExpression returns Predicate
	 *     BinaryExpression.Operation_1_0 returns Predicate
	 *     TerminalBinaryExpression returns Predicate
	 *
	 * Constraint:
	 *     (negation?='NOT'? expression=BinaryExpression)
	 */
	protected void sequence_Predicate(ISerializationContext context, Predicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateDefinition returns PrimitiveStateDefinition
	 *     PrimitiveStateDefinition returns PrimitiveStateDefinition
	 *
	 * Constraint:
	 *     (type='primitive' name=ID)
	 */
	protected void sequence_PrimitiveStateDefinition(ISerializationContext context, PrimitiveStateDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE_DEFINITION__TYPE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimitiveStateDefinitionAccess().getTypePrimitiveKeyword_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getPrimitiveStateDefinitionAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionDefinition returns PrimitiveTransitionDefinition
	 *     PrimitiveTransitionDefinition returns PrimitiveTransitionDefinition
	 *
	 * Constraint:
	 *     (type='primitive' name=ID in=InputDefinition? out=OutputDefinition)
	 */
	protected void sequence_PrimitiveTransitionDefinition(ISerializationContext context, PrimitiveTransitionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReferenceSpace returns ReferenceSpace
	 *
	 * Constraint:
	 *     (refStates+=ReferenceState* refTransitions+=ReferenceTransition*)
	 */
	protected void sequence_ReferenceSpace(ISerializationContext context, ReferenceSpace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReferenceState returns ReferenceState
	 *
	 * Constraint:
	 *     (refState=[StateDefinition|ID] foreignField=[FieldDefinition|ID])
	 */
	protected void sequence_ReferenceState(ISerializationContext context, ReferenceState semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.REFERENCE_STATE__REF_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.REFERENCE_STATE__REF_STATE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.REFERENCE_STATE__FOREIGN_FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.REFERENCE_STATE__FOREIGN_FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReferenceStateAccess().getRefStateStateDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.REFERENCE_STATE__REF_STATE, false));
		feeder.accept(grammarAccess.getReferenceStateAccess().getForeignFieldFieldDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.eGet(WorkPackage.Literals.REFERENCE_STATE__FOREIGN_FIELD, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ReferenceTransition returns ReferenceTransition
	 *
	 * Constraint:
	 *     (refTransition=[TransitionDefinition|ID] foreignField=[FieldDefinition|ID])
	 */
	protected void sequence_ReferenceTransition(ISerializationContext context, ReferenceTransition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.REFERENCE_TRANSITION__REF_TRANSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.REFERENCE_TRANSITION__REF_TRANSITION));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.REFERENCE_TRANSITION__FOREIGN_FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.REFERENCE_TRANSITION__FOREIGN_FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReferenceTransitionAccess().getRefTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.REFERENCE_TRANSITION__REF_TRANSITION, false));
		feeder.accept(grammarAccess.getReferenceTransitionAccess().getForeignFieldFieldDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.eGet(WorkPackage.Literals.REFERENCE_TRANSITION__FOREIGN_FIELD, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TestValue returns ResolvableInstanceValue
	 *     ResolvableValue returns ResolvableInstanceValue
	 *     ResolvableInstanceValue returns ResolvableInstanceValue
	 *
	 * Constraint:
	 *     (instance=[Instance|ID] key=[StateDefinition|ID])
	 */
	protected void sequence_ResolvableInstanceValue(ISerializationContext context, ResolvableInstanceValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.RESOLVABLE_INSTANCE_VALUE__INSTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.RESOLVABLE_INSTANCE_VALUE__INSTANCE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.RESOLVABLE_VALUE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.RESOLVABLE_VALUE__KEY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getResolvableInstanceValueAccess().getInstanceInstanceIDTerminalRuleCall_0_0_1(), semanticObject.eGet(WorkPackage.Literals.RESOLVABLE_INSTANCE_VALUE__INSTANCE, false));
		feeder.accept(grammarAccess.getResolvableInstanceValueAccess().getKeyStateDefinitionIDTerminalRuleCall_2_0_1(), semanticObject.eGet(WorkPackage.Literals.RESOLVABLE_VALUE__KEY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TestValue returns ResolvableTransitionOutputValue
	 *     ResolvableValue returns ResolvableTransitionOutputValue
	 *     ResolvableTransitionOutputValue returns ResolvableTransitionOutputValue
	 *
	 * Constraint:
	 *     (state=[StateDefinition|ID] key=[StateDefinition|ID])
	 */
	protected void sequence_ResolvableTransitionOutputValue(ISerializationContext context, ResolvableTransitionOutputValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.RESOLVABLE_TRANSITION_OUTPUT_VALUE__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.RESOLVABLE_TRANSITION_OUTPUT_VALUE__STATE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.RESOLVABLE_VALUE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.RESOLVABLE_VALUE__KEY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getResolvableTransitionOutputValueAccess().getStateStateDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.RESOLVABLE_TRANSITION_OUTPUT_VALUE__STATE, false));
		feeder.accept(grammarAccess.getResolvableTransitionOutputValueAccess().getKeyStateDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.eGet(WorkPackage.Literals.RESOLVABLE_VALUE__KEY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SetStatement returns SetStatement
	 *
	 * Constraint:
	 *     (variable=[StateDefinition|ID] toDef=ToDefinition)
	 */
	protected void sequence_SetStatement(ISerializationContext context, SetStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.SET_STATEMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.SET_STATEMENT__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.SET_STATEMENT__TO_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.SET_STATEMENT__TO_DEF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSetStatementAccess().getVariableStateDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.SET_STATEMENT__VARIABLE, false));
		feeder.accept(grammarAccess.getSetStatementAccess().getToDefToDefinitionParserRuleCall_2_0(), semanticObject.getToDef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InstanceInstructionExpression returns SimpleInstanceInstruction
	 *     InstanceInstructionExpression.ExecutionResult_1_0 returns SimpleInstanceInstruction
	 *     TerminalInstanceInstruction returns SimpleInstanceInstruction
	 *     SimpleInstanceInstruction returns SimpleInstanceInstruction
	 *
	 * Constraint:
	 *     toExecute+=[Instance|STRING]+
	 */
	protected void sequence_SimpleInstanceInstruction(ISerializationContext context, SimpleInstanceInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InstructionExpression returns SimpleInstruction
	 *     InstructionExpression.ExecutionResult_1_0 returns SimpleInstruction
	 *     TerminalInstruction returns SimpleInstruction
	 *     SimpleInstruction returns SimpleInstruction
	 *
	 * Constraint:
	 *     toExecute+=[TransitionDefinition|ID]+
	 */
	protected void sequence_SimpleInstruction(ISerializationContext context, SimpleInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateDeclaration returns StateDeclaration
	 *
	 * Constraint:
	 *     state=[StateDefinition|ID]
	 */
	protected void sequence_StateDeclaration(ISerializationContext context, StateDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE_DECLARATION__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE_DECLARATION__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateDeclarationAccess().getStateStateDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.STATE_DECLARATION__STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateInstance returns StateInstance
	 *
	 * Constraint:
	 *     (members+=SetStatement | members+=UseDefinition | members+=Instance)+
	 */
	protected void sequence_StateInstance(ISerializationContext context, StateInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateMapping returns StateMapping
	 *
	 * Constraint:
	 *     (foreignState=[StateDefinition|ID] field=[FieldDefinition|ID] localState=[StateDefinition|ID])
	 */
	protected void sequence_StateMapping(ISerializationContext context, StateMapping semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE_MAPPING__FOREIGN_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE_MAPPING__FOREIGN_STATE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE_MAPPING__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE_MAPPING__FIELD));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE_MAPPING__LOCAL_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE_MAPPING__LOCAL_STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateMappingAccess().getForeignStateStateDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.STATE_MAPPING__FOREIGN_STATE, false));
		feeder.accept(grammarAccess.getStateMappingAccess().getFieldFieldDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.eGet(WorkPackage.Literals.STATE_MAPPING__FIELD, false));
		feeder.accept(grammarAccess.getStateMappingAccess().getLocalStateStateDefinitionIDTerminalRuleCall_5_0_1(), semanticObject.eGet(WorkPackage.Literals.STATE_MAPPING__LOCAL_STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BinaryExpression returns StateDefinition
	 *     BinaryExpression.Operation_1_0 returns StateDefinition
	 *     TerminalBinaryExpression returns StateDefinition
	 *
	 * Constraint:
	 *     (instance=[StateDefinition|ID] | (list?='collectionOf' instance=[StateDefinition|ID]))
	 */
	protected void sequence_TerminalBinaryExpression(ISerializationContext context, StateDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ToDefinition returns ToDefinition
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_ToDefinition(ISerializationContext context, ToDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TO_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TO_DEFINITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getToDefinitionAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionCompositionBody returns TransitionCompositionBody
	 *
	 * Constraint:
	 *     (startingInputs+=[StateDefinition|ID]* expression=InstructionExpression)
	 */
	protected void sequence_TransitionCompositionBody(ISerializationContext context, TransitionCompositionBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionComposition returns TransitionComposition
	 *
	 * Constraint:
	 *     body=TransitionCompositionBody
	 */
	protected void sequence_TransitionComposition(ISerializationContext context, TransitionComposition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION_COMPOSITION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION_COMPOSITION__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionCompositionAccess().getBodyTransitionCompositionBodyParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionDeclaration returns TransitionDeclaration
	 *
	 * Constraint:
	 *     transition=[TransitionDefinition|ID]
	 */
	protected void sequence_TransitionDeclaration(ISerializationContext context, TransitionDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION_DECLARATION__TRANSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION_DECLARATION__TRANSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionDeclarationAccess().getTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.TRANSITION_DECLARATION__TRANSITION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionInstance returns TransitionInstance
	 *
	 * Constraint:
	 *     (host=STRING port=INT path=STRING? supportCollections?='hasCollectionSupport'?)
	 */
	protected void sequence_TransitionInstance(ISerializationContext context, TransitionInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionMapping returns TransitionMapping
	 *
	 * Constraint:
	 *     (foreignTransition=[TransitionDefinition|ID] field=[FieldDefinition|ID] localTransition=[TransitionDefinition|ID])
	 */
	protected void sequence_TransitionMapping(ISerializationContext context, TransitionMapping semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION_MAPPING__FOREIGN_TRANSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION_MAPPING__FOREIGN_TRANSITION));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION_MAPPING__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION_MAPPING__FIELD));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION_MAPPING__LOCAL_TRANSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION_MAPPING__LOCAL_TRANSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionMappingAccess().getForeignTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.TRANSITION_MAPPING__FOREIGN_TRANSITION, false));
		feeder.accept(grammarAccess.getTransitionMappingAccess().getFieldFieldDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.eGet(WorkPackage.Literals.TRANSITION_MAPPING__FIELD, false));
		feeder.accept(grammarAccess.getTransitionMappingAccess().getLocalTransitionTransitionDefinitionIDTerminalRuleCall_5_0_1(), semanticObject.eGet(WorkPackage.Literals.TRANSITION_MAPPING__LOCAL_TRANSITION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UseDefinition returns UseDefinition
	 *
	 * Constraint:
	 *     (predefinedValue=[Instance|STRING] | predefinedValue=[Instance|COLLECTION_ELEMENT_NAME])
	 */
	protected void sequence_UseDefinition(ISerializationContext context, UseDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InstanceInstructionExpression returns WhileInstanceInstruction
	 *     InstanceInstructionExpression.ExecutionResult_1_0 returns WhileInstanceInstruction
	 *     TerminalInstanceInstruction returns WhileInstanceInstruction
	 *     WhileInstanceInstruction returns WhileInstanceInstruction
	 *
	 * Constraint:
	 *     (testKey=ResolvableValue testValue=TestValue toCompute=InstanceInstructionExpression)
	 */
	protected void sequence_WhileInstanceInstruction(ISerializationContext context, WhileInstanceInstruction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WHILE_INSTANCE_INSTRUCTION__TEST_KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WHILE_INSTANCE_INSTRUCTION__TEST_KEY));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WHILE_INSTANCE_INSTRUCTION__TEST_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WHILE_INSTANCE_INSTRUCTION__TEST_VALUE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WHILE_INSTANCE_INSTRUCTION__TO_COMPUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WHILE_INSTANCE_INSTRUCTION__TO_COMPUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhileInstanceInstructionAccess().getTestKeyResolvableValueParserRuleCall_2_0(), semanticObject.getTestKey());
		feeder.accept(grammarAccess.getWhileInstanceInstructionAccess().getTestValueTestValueParserRuleCall_4_0(), semanticObject.getTestValue());
		feeder.accept(grammarAccess.getWhileInstanceInstructionAccess().getToComputeInstanceInstructionExpressionParserRuleCall_7_0(), semanticObject.getToCompute());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InstructionExpression returns WhileInstruction
	 *     InstructionExpression.ExecutionResult_1_0 returns WhileInstruction
	 *     TerminalInstruction returns WhileInstruction
	 *     WhileInstruction returns WhileInstruction
	 *
	 * Constraint:
	 *     (testKey=ResolvableValue testValue=TestValue toCompute=InstructionExpression)
	 */
	protected void sequence_WhileInstruction(ISerializationContext context, WhileInstruction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WHILE_INSTRUCTION__TEST_KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WHILE_INSTRUCTION__TEST_KEY));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WHILE_INSTRUCTION__TEST_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WHILE_INSTRUCTION__TEST_VALUE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WHILE_INSTRUCTION__TO_COMPUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WHILE_INSTRUCTION__TO_COMPUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhileInstructionAccess().getTestKeyResolvableValueParserRuleCall_2_0(), semanticObject.getTestKey());
		feeder.accept(grammarAccess.getWhileInstructionAccess().getTestValueTestValueParserRuleCall_4_0(), semanticObject.getTestValue());
		feeder.accept(grammarAccess.getWhileInstructionAccess().getToComputeInstructionExpressionParserRuleCall_7_0(), semanticObject.getToCompute());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WithStatesDefinition returns WithStatesDefinition
	 *
	 * Constraint:
	 *     predicate=Predicate
	 */
	protected void sequence_WithStatesDefinition(ISerializationContext context, WithStatesDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WITH_STATES_DEFINITION__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WITH_STATES_DEFINITION__PREDICATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWithStatesDefinitionAccess().getPredicatePredicateParserRuleCall_2_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
}
