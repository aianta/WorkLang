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
import org.worklang.work.CompoundStateDefinition;
import org.worklang.work.CompoundTransitionDefinition;
import org.worklang.work.DefinitionSpace;
import org.worklang.work.FieldDefinition;
import org.worklang.work.InputDefinition;
import org.worklang.work.Instance;
import org.worklang.work.InstanceSpace;
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
import org.worklang.work.SetStatement;
import org.worklang.work.StateDeclaration;
import org.worklang.work.StateDefinition;
import org.worklang.work.StateInstance;
import org.worklang.work.StateMapping;
import org.worklang.work.ToDefinition;
import org.worklang.work.TransitionDeclaration;
import org.worklang.work.TransitionID;
import org.worklang.work.TransitionInstance;
import org.worklang.work.TransitionMapping;
import org.worklang.work.UseDefinition;
import org.worklang.work.WithStatesDefinition;
import org.worklang.work.WithTransitionsDefinition;
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
			case WorkPackage.COMPOUND_STATE_DEFINITION:
				sequence_CompoundStateDefinition(context, (CompoundStateDefinition) semanticObject); 
				return; 
			case WorkPackage.COMPOUND_TRANSITION_DEFINITION:
				sequence_CompoundTransitionDefinition(context, (CompoundTransitionDefinition) semanticObject); 
				return; 
			case WorkPackage.DEFINITION_SPACE:
				sequence_DefinitionSpace(context, (DefinitionSpace) semanticObject); 
				return; 
			case WorkPackage.FIELD_DEFINITION:
				sequence_FieldDefinition(context, (FieldDefinition) semanticObject); 
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
			case WorkPackage.MAP_SPACE:
				sequence_MapSpace(context, (MapSpace) semanticObject); 
				return; 
			case WorkPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case WorkPackage.OPERATION:
				if (rule == grammarAccess.getBinaryExpressionRule()
						|| action == grammarAccess.getBinaryExpressionAccess().getOperationLeftAction_1_0()) {
					sequence_BinaryExpression(context, (Operation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTransitionalExpressionRule()
						|| action == grammarAccess.getTransitionalExpressionAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getTerminalTransitionalExpressionRule()) {
					sequence_TransitionalExpression(context, (Operation) semanticObject); 
					return; 
				}
				else break;
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
			case WorkPackage.SET_STATEMENT:
				sequence_SetStatement(context, (SetStatement) semanticObject); 
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
			case WorkPackage.TRANSITION_DECLARATION:
				sequence_TransitionDeclaration(context, (TransitionDeclaration) semanticObject); 
				return; 
			case WorkPackage.TRANSITION_ID:
				sequence_TerminalTransitionalExpression(context, (TransitionID) semanticObject); 
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
			case WorkPackage.WITH_STATES_DEFINITION:
				sequence_WithStatesDefinition(context, (WithStatesDefinition) semanticObject); 
				return; 
			case WorkPackage.WITH_TRANSITIONS_DEFINITION:
				sequence_WithTransitionsDefinition(context, (WithTransitionsDefinition) semanticObject); 
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
	 *     (type='compound' name=ID in=InputDefinition? out=OutputDefinition composition=WithTransitionsDefinition)
	 */
	protected void sequence_CompoundTransitionDefinition(ISerializationContext context, CompoundTransitionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *         name=STRING 
	 *         (state=StateInstance | transition=TransitionInstance)
	 *     )
	 */
	protected void sequence_Instance(ISerializationContext context, Instance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (instance=[StateDefinition|ID] | (list?='setOf' value=[StateDefinition|ID]))
	 */
	protected void sequence_TerminalBinaryExpression(ISerializationContext context, StateDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionalExpression returns TransitionID
	 *     TransitionalExpression.Operation_1_0 returns TransitionID
	 *     TerminalTransitionalExpression returns TransitionID
	 *
	 * Constraint:
	 *     value=[TransitionID|ID]
	 */
	protected void sequence_TerminalTransitionalExpression(ISerializationContext context, TransitionID semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION_ID__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION_ID__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalTransitionalExpressionAccess().getValueTransitionIDIDTerminalRuleCall_1_1_0_1(), semanticObject.eGet(WorkPackage.Literals.TRANSITION_ID__VALUE, false));
		feeder.finish();
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
	 *     (host=STRING port=INT path=STRING?)
	 */
	protected void sequence_TransitionInstance(ISerializationContext context, TransitionInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionMapping returns TransitionMapping
	 *
	 * Constraint:
	 *     (foreignTransition=[TransitionID|ID] field=[FieldDefinition|ID] localTransition=[TransitionID|ID])
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
		feeder.accept(grammarAccess.getTransitionMappingAccess().getForeignTransitionTransitionIDIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.TRANSITION_MAPPING__FOREIGN_TRANSITION, false));
		feeder.accept(grammarAccess.getTransitionMappingAccess().getFieldFieldDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.eGet(WorkPackage.Literals.TRANSITION_MAPPING__FIELD, false));
		feeder.accept(grammarAccess.getTransitionMappingAccess().getLocalTransitionTransitionIDIDTerminalRuleCall_5_0_1(), semanticObject.eGet(WorkPackage.Literals.TRANSITION_MAPPING__LOCAL_TRANSITION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionalExpression returns Operation
	 *     TransitionalExpression.Operation_1_0 returns Operation
	 *     TerminalTransitionalExpression returns Operation
	 *
	 * Constraint:
	 *     (left=TransitionalExpression_Operation_1_0 op='THEN' right=TerminalTransitionalExpression)
	 */
	protected void sequence_TransitionalExpression(ISerializationContext context, Operation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.OPERATION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.OPERATION__OP));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionalExpressionAccess().getOperationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTransitionalExpressionAccess().getOpTHENKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getTransitionalExpressionAccess().getRightTerminalTransitionalExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UseDefinition returns UseDefinition
	 *
	 * Constraint:
	 *     predefinedValue=[Instance|ID]
	 */
	protected void sequence_UseDefinition(ISerializationContext context, UseDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.USE_DEFINITION__PREDEFINED_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.USE_DEFINITION__PREDEFINED_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUseDefinitionAccess().getPredefinedValueInstanceIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.USE_DEFINITION__PREDEFINED_VALUE, false));
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
	
	
	/**
	 * Contexts:
	 *     WithTransitionsDefinition returns WithTransitionsDefinition
	 *
	 * Constraint:
	 *     transitions=TransitionalExpression
	 */
	protected void sequence_WithTransitionsDefinition(ISerializationContext context, WithTransitionsDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WITH_TRANSITIONS_DEFINITION__TRANSITIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WITH_TRANSITIONS_DEFINITION__TRANSITIONS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWithTransitionsDefinitionAccess().getTransitionsTransitionalExpressionParserRuleCall_2_0(), semanticObject.getTransitions());
		feeder.finish();
	}
	
	
}
