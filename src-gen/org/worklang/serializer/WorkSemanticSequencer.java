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
import org.worklang.work.DomainDefinition;
import org.worklang.work.ExpertDefinition;
import org.worklang.work.ExtendsDefinition;
import org.worklang.work.FieldDefinition;
import org.worklang.work.FromFieldDefinition;
import org.worklang.work.InputDefinition;
import org.worklang.work.Instance;
import org.worklang.work.Instancespace;
import org.worklang.work.Instruction;
import org.worklang.work.KnowledgeDefinition;
import org.worklang.work.Model;
import org.worklang.work.Namespace;
import org.worklang.work.Operation;
import org.worklang.work.OutputDefinition;
import org.worklang.work.Practitioner;
import org.worklang.work.Predicate;
import org.worklang.work.PrimitiveStateDefinition;
import org.worklang.work.ReferenceField;
import org.worklang.work.ReferenceState;
import org.worklang.work.ReferenceTransition;
import org.worklang.work.Referencespace;
import org.worklang.work.SetStatement;
import org.worklang.work.SkillsDefinition;
import org.worklang.work.Space;
import org.worklang.work.StateDeclaration;
import org.worklang.work.StateDefinition;
import org.worklang.work.StateID;
import org.worklang.work.StateInstance;
import org.worklang.work.StateObjectDefinition;
import org.worklang.work.ToDefinition;
import org.worklang.work.TransitionDeclaration;
import org.worklang.work.TransitionDefinition;
import org.worklang.work.TransitionID;
import org.worklang.work.TransitionInstance;
import org.worklang.work.TransitionObjectDefinition;
import org.worklang.work.UseDefinition;
import org.worklang.work.User;
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
			case WorkPackage.DOMAIN_DEFINITION:
				sequence_DomainDefinition(context, (DomainDefinition) semanticObject); 
				return; 
			case WorkPackage.EXPERT_DEFINITION:
				sequence_ExpertDefinition(context, (ExpertDefinition) semanticObject); 
				return; 
			case WorkPackage.EXTENDS_DEFINITION:
				sequence_ExtendsDefinition(context, (ExtendsDefinition) semanticObject); 
				return; 
			case WorkPackage.FIELD_DEFINITION:
				sequence_FieldDefinition(context, (FieldDefinition) semanticObject); 
				return; 
			case WorkPackage.FROM_FIELD_DEFINITION:
				sequence_FromFieldDefinition(context, (FromFieldDefinition) semanticObject); 
				return; 
			case WorkPackage.INPUT_DEFINITION:
				sequence_InputDefinition(context, (InputDefinition) semanticObject); 
				return; 
			case WorkPackage.INSTANCE:
				sequence_Instance(context, (Instance) semanticObject); 
				return; 
			case WorkPackage.INSTANCESPACE:
				sequence_Instancespace(context, (Instancespace) semanticObject); 
				return; 
			case WorkPackage.INSTRUCTION:
				sequence_Instruction(context, (Instruction) semanticObject); 
				return; 
			case WorkPackage.KNOWLEDGE_DEFINITION:
				sequence_KnowledgeDefinition(context, (KnowledgeDefinition) semanticObject); 
				return; 
			case WorkPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case WorkPackage.NAMESPACE:
				sequence_Namespace(context, (Namespace) semanticObject); 
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
			case WorkPackage.PRACTITIONER:
				sequence_Practitioner(context, (Practitioner) semanticObject); 
				return; 
			case WorkPackage.PREDICATE:
				sequence_Predicate(context, (Predicate) semanticObject); 
				return; 
			case WorkPackage.PRIMITIVE_STATE_DEFINITION:
				sequence_PrimitiveStateDefinition(context, (PrimitiveStateDefinition) semanticObject); 
				return; 
			case WorkPackage.REFERENCE_FIELD:
				sequence_ReferenceField(context, (ReferenceField) semanticObject); 
				return; 
			case WorkPackage.REFERENCE_STATE:
				sequence_ReferenceState(context, (ReferenceState) semanticObject); 
				return; 
			case WorkPackage.REFERENCE_TRANSITION:
				sequence_ReferenceTransition(context, (ReferenceTransition) semanticObject); 
				return; 
			case WorkPackage.REFERENCESPACE:
				sequence_Referencespace(context, (Referencespace) semanticObject); 
				return; 
			case WorkPackage.SET_STATEMENT:
				sequence_SetStatement(context, (SetStatement) semanticObject); 
				return; 
			case WorkPackage.SKILLS_DEFINITION:
				sequence_SkillsDefinition(context, (SkillsDefinition) semanticObject); 
				return; 
			case WorkPackage.SPACE:
				sequence_Space(context, (Space) semanticObject); 
				return; 
			case WorkPackage.STATE_DECLARATION:
				sequence_StateDeclaration(context, (StateDeclaration) semanticObject); 
				return; 
			case WorkPackage.STATE_DEFINITION:
				sequence_StateDefinition(context, (StateDefinition) semanticObject); 
				return; 
			case WorkPackage.STATE_ID:
				if (rule == grammarAccess.getStateIDRule()) {
					sequence_StateID(context, (StateID) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getBinaryExpressionRule()
						|| action == grammarAccess.getBinaryExpressionAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getTerminalBinaryExpressionRule()) {
					sequence_TerminalBinaryExpression(context, (StateID) semanticObject); 
					return; 
				}
				else break;
			case WorkPackage.STATE_INSTANCE:
				sequence_StateInstance(context, (StateInstance) semanticObject); 
				return; 
			case WorkPackage.STATE_OBJECT_DEFINITION:
				sequence_StateObjectDefinition(context, (StateObjectDefinition) semanticObject); 
				return; 
			case WorkPackage.TO_DEFINITION:
				sequence_ToDefinition(context, (ToDefinition) semanticObject); 
				return; 
			case WorkPackage.TRANSITION_DECLARATION:
				sequence_TransitionDeclaration(context, (TransitionDeclaration) semanticObject); 
				return; 
			case WorkPackage.TRANSITION_DEFINITION:
				sequence_TransitionDefinition(context, (TransitionDefinition) semanticObject); 
				return; 
			case WorkPackage.TRANSITION_ID:
				if (rule == grammarAccess.getTransitionalExpressionRule()
						|| action == grammarAccess.getTransitionalExpressionAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getTerminalTransitionalExpressionRule()) {
					sequence_TerminalTransitionalExpression(context, (TransitionID) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTransitionIDRule()) {
					sequence_TransitionID(context, (TransitionID) semanticObject); 
					return; 
				}
				else break;
			case WorkPackage.TRANSITION_INSTANCE:
				sequence_TransitionInstance(context, (TransitionInstance) semanticObject); 
				return; 
			case WorkPackage.TRANSITION_OBJECT_DEFINITION:
				sequence_TransitionObjectDefinition(context, (TransitionObjectDefinition) semanticObject); 
				return; 
			case WorkPackage.USE_DEFINITION:
				sequence_UseDefinition(context, (UseDefinition) semanticObject); 
				return; 
			case WorkPackage.USER:
				sequence_User(context, (User) semanticObject); 
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
	 *     (left=BinaryExpression_Operation_1_0 (op=AndOp | op=OrOp) right=TerminalBinaryExpression)
	 */
	protected void sequence_BinaryExpression(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompoundStateDefinition returns CompoundStateDefinition
	 *
	 * Constraint:
	 *     (object=State state=StateID compoundStateDef=WithStatesDefinition?)
	 */
	protected void sequence_CompoundStateDefinition(ISerializationContext context, CompoundStateDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainDefinition returns DomainDefinition
	 *
	 * Constraint:
	 *     (domain='domain' domainAreas+=ReferenceField*)
	 */
	protected void sequence_DomainDefinition(ISerializationContext context, DomainDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpertDefinition returns ExpertDefinition
	 *
	 * Constraint:
	 *     (
	 *         expertDef='expert' 
	 *         user=User 
	 *         domainDef=DomainDefinition? 
	 *         knowledgeDef=KnowledgeDefinition? 
	 *         skillsDef=SkillsDefinition? 
	 *         rate=INT
	 *     )
	 */
	protected void sequence_ExpertDefinition(ISerializationContext context, ExpertDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExtendsDefinition returns ExtendsDefinition
	 *
	 * Constraint:
	 *     (type=Extends namespaces+=[Space|ID]+)
	 */
	protected void sequence_ExtendsDefinition(ISerializationContext context, ExtendsDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FieldDefinition returns FieldDefinition
	 *
	 * Constraint:
	 *     (
	 *         field=Field 
	 *         space=Space 
	 *         extends=ExtendsDefinition? 
	 *         conceptualspace=Namespace? 
	 *         referencespace=Referencespace? 
	 *         instancespace=Instancespace?
	 *     )
	 */
	protected void sequence_FieldDefinition(ISerializationContext context, FieldDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FromFieldDefinition returns FromFieldDefinition
	 *
	 * Constraint:
	 *     (from=From refSpace=[Space|ID])
	 */
	protected void sequence_FromFieldDefinition(ISerializationContext context, FromFieldDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.FROM_FIELD_DEFINITION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.FROM_FIELD_DEFINITION__FROM));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.FROM_FIELD_DEFINITION__REF_SPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.FROM_FIELD_DEFINITION__REF_SPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFromFieldDefinitionAccess().getFromFromParserRuleCall_0_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getFromFieldDefinitionAccess().getRefSpaceSpaceIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.FROM_FIELD_DEFINITION__REF_SPACE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InputDefinition returns InputDefinition
	 *
	 * Constraint:
	 *     (input=Input inputState+=[StateID|ID]*)
	 */
	protected void sequence_InputDefinition(ISerializationContext context, InputDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instance returns Instance
	 *
	 * Constraint:
	 *     (
	 *         instanceDef='instance' 
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
	 *     Instancespace returns Instancespace
	 *
	 * Constraint:
	 *     (spaceType=Instances instances+=Instance*)
	 */
	protected void sequence_Instancespace(ISerializationContext context, Instancespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Instruction
	 *
	 * Constraint:
	 *     (objectType='instruction' space=[Space|ID] transition=[TransitionID|ID])
	 */
	protected void sequence_Instruction(ISerializationContext context, Instruction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.INSTRUCTION__OBJECT_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.INSTRUCTION__OBJECT_TYPE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.INSTRUCTION__SPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.INSTRUCTION__SPACE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.INSTRUCTION__TRANSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.INSTRUCTION__TRANSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstructionAccess().getObjectTypeInstructionKeyword_0_0(), semanticObject.getObjectType());
		feeder.accept(grammarAccess.getInstructionAccess().getSpaceSpaceIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.INSTRUCTION__SPACE, false));
		feeder.accept(grammarAccess.getInstructionAccess().getTransitionTransitionIDIDTerminalRuleCall_2_0_1(), semanticObject.eGet(WorkPackage.Literals.INSTRUCTION__TRANSITION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     KnowledgeDefinition returns KnowledgeDefinition
	 *
	 * Constraint:
	 *     (knowledgeDef='knowledge' knowledge+=ReferenceState*)
	 */
	protected void sequence_KnowledgeDefinition(ISerializationContext context, KnowledgeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         (fields+=FieldDefinition+ ((experts+=ExpertDefinition+ instructions+=Instruction+) | instructions+=Instruction+)) | 
	 *         (((fields+=FieldDefinition+ experts+=ExpertDefinition+) | experts+=ExpertDefinition+)? practitioners+=Practitioner+ instructions+=Instruction+) | 
	 *         (experts+=ExpertDefinition+ instructions+=Instruction+) | 
	 *         instructions+=Instruction+
	 *     )?
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns Namespace
	 *
	 * Constraint:
	 *     (spaceType=Definitions states+=StateObjectDefinition* transitions+=TransitionObjectDefinition*)
	 */
	protected void sequence_Namespace(ISerializationContext context, Namespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OutputDefinition returns OutputDefinition
	 *
	 * Constraint:
	 *     (output=Output outputState=[StateID|ID])
	 */
	protected void sequence_OutputDefinition(ISerializationContext context, OutputDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.OUTPUT_DEFINITION__OUTPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.OUTPUT_DEFINITION__OUTPUT));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.OUTPUT_DEFINITION__OUTPUT_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.OUTPUT_DEFINITION__OUTPUT_STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOutputDefinitionAccess().getOutputOutputParserRuleCall_0_0(), semanticObject.getOutput());
		feeder.accept(grammarAccess.getOutputDefinitionAccess().getOutputStateStateIDIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.OUTPUT_DEFINITION__OUTPUT_STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Practitioner returns Practitioner
	 *
	 * Constraint:
	 *     (practitionerDef='practitioner' user=User knowledgeDef=KnowledgeDefinition? skillsDef=SkillsDefinition?)
	 */
	protected void sequence_Practitioner(ISerializationContext context, Practitioner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Predicate returns Predicate
	 *     BinaryExpression returns Predicate
	 *     BinaryExpression.Operation_1_0 returns Predicate
	 *     TerminalBinaryExpression returns Predicate
	 *
	 * Constraint:
	 *     (negation?=NotOp? expression=BinaryExpression)
	 */
	protected void sequence_Predicate(ISerializationContext context, Predicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimitiveStateDefinition returns PrimitiveStateDefinition
	 *
	 * Constraint:
	 *     (object=State id=StateID)
	 */
	protected void sequence_PrimitiveStateDefinition(ISerializationContext context, PrimitiveStateDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.PRIMITIVE_STATE_DEFINITION__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.PRIMITIVE_STATE_DEFINITION__OBJECT));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.PRIMITIVE_STATE_DEFINITION__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.PRIMITIVE_STATE_DEFINITION__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimitiveStateDefinitionAccess().getObjectStateParserRuleCall_0_0(), semanticObject.getObject());
		feeder.accept(grammarAccess.getPrimitiveStateDefinitionAccess().getIdStateIDParserRuleCall_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ReferenceField returns ReferenceField
	 *
	 * Constraint:
	 *     (ref=Field space=Space)
	 */
	protected void sequence_ReferenceField(ISerializationContext context, ReferenceField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.REFERENCE_FIELD__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.REFERENCE_FIELD__REF));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.REFERENCE_FIELD__SPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.REFERENCE_FIELD__SPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReferenceFieldAccess().getRefFieldParserRuleCall_0_0(), semanticObject.getRef());
		feeder.accept(grammarAccess.getReferenceFieldAccess().getSpaceSpaceParserRuleCall_1_0(), semanticObject.getSpace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ReferenceState returns ReferenceState
	 *
	 * Constraint:
	 *     (object=State refState=[StateID|ID] from=FromFieldDefinition state=StateID? composition=WithStatesDefinition?)
	 */
	protected void sequence_ReferenceState(ISerializationContext context, ReferenceState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReferenceTransition returns ReferenceTransition
	 *
	 * Constraint:
	 *     (object=Transition refTransition=[TransitionID|ID] fromDef=FromFieldDefinition transition=TransitionID? composition=WithTransitionsDefinition?)
	 */
	protected void sequence_ReferenceTransition(ISerializationContext context, ReferenceTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Referencespace returns Referencespace
	 *
	 * Constraint:
	 *     (spaceType=References refFields+=ReferenceField* refStates+=ReferenceState* refTransition+=ReferenceTransition*)
	 */
	protected void sequence_Referencespace(ISerializationContext context, Referencespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SetStatement returns SetStatement
	 *
	 * Constraint:
	 *     (statement=Set variable=[StateID|ID] toDef=ToDefinition)
	 */
	protected void sequence_SetStatement(ISerializationContext context, SetStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.SET_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.SET_STATEMENT__STATEMENT));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.SET_STATEMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.SET_STATEMENT__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.SET_STATEMENT__TO_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.SET_STATEMENT__TO_DEF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSetStatementAccess().getStatementSetParserRuleCall_0_0(), semanticObject.getStatement());
		feeder.accept(grammarAccess.getSetStatementAccess().getVariableStateIDIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.SET_STATEMENT__VARIABLE, false));
		feeder.accept(grammarAccess.getSetStatementAccess().getToDefToDefinitionParserRuleCall_2_0(), semanticObject.getToDef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SkillsDefinition returns SkillsDefinition
	 *
	 * Constraint:
	 *     (skillsDef='skills' skills+=ReferenceTransition*)
	 */
	protected void sequence_SkillsDefinition(ISerializationContext context, SkillsDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Space returns Space
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Space(ISerializationContext context, Space semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.SPACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.SPACE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSpaceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateDeclaration returns StateDeclaration
	 *
	 * Constraint:
	 *     (objectType=State state=[StateID|ID])
	 */
	protected void sequence_StateDeclaration(ISerializationContext context, StateDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE_DECLARATION__OBJECT_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE_DECLARATION__OBJECT_TYPE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE_DECLARATION__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE_DECLARATION__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateDeclarationAccess().getObjectTypeStateParserRuleCall_0_0(), semanticObject.getObjectType());
		feeder.accept(grammarAccess.getStateDeclarationAccess().getStateStateIDIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.STATE_DECLARATION__STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateDefinition returns StateDefinition
	 *
	 * Constraint:
	 *     (object=State state=StateID withDefinition=WithStatesDefinition?)
	 */
	protected void sequence_StateDefinition(ISerializationContext context, StateDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateID returns StateID
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_StateID(ISerializationContext context, StateID semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE_ID__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateIDAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
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
	 *     StateObjectDefinition returns StateObjectDefinition
	 *
	 * Constraint:
	 *     ((type=Primitive | type=Compound) state=StateDefinition)
	 */
	protected void sequence_StateObjectDefinition(ISerializationContext context, StateObjectDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BinaryExpression returns StateID
	 *     BinaryExpression.Operation_1_0 returns StateID
	 *     TerminalBinaryExpression returns StateID
	 *
	 * Constraint:
	 *     (instance=[StateID|ID] | (list?='setOf' value=[StateID|ID]))
	 */
	protected void sequence_TerminalBinaryExpression(ISerializationContext context, StateID semanticObject) {
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
	 *     (to=To value=STRING)
	 */
	protected void sequence_ToDefinition(ISerializationContext context, ToDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TO_DEFINITION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TO_DEFINITION__TO));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TO_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TO_DEFINITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getToDefinitionAccess().getToToParserRuleCall_0_0(), semanticObject.getTo());
		feeder.accept(grammarAccess.getToDefinitionAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionDeclaration returns TransitionDeclaration
	 *
	 * Constraint:
	 *     (objectType=Transition transition=[TransitionID|ID])
	 */
	protected void sequence_TransitionDeclaration(ISerializationContext context, TransitionDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION_DECLARATION__OBJECT_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION_DECLARATION__OBJECT_TYPE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION_DECLARATION__TRANSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION_DECLARATION__TRANSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionDeclarationAccess().getObjectTypeTransitionParserRuleCall_0_0(), semanticObject.getObjectType());
		feeder.accept(grammarAccess.getTransitionDeclarationAccess().getTransitionTransitionIDIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.TRANSITION_DECLARATION__TRANSITION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionDefinition returns TransitionDefinition
	 *
	 * Constraint:
	 *     (object=Transition transition=TransitionID in=InputDefinition? out=OutputDefinition composition=WithTransitionsDefinition?)
	 */
	protected void sequence_TransitionDefinition(ISerializationContext context, TransitionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionID returns TransitionID
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TransitionID(ISerializationContext context, TransitionID semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION_ID__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionIDAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
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
	 *     TransitionObjectDefinition returns TransitionObjectDefinition
	 *
	 * Constraint:
	 *     ((type=Primitive | type=Compound) transition=TransitionDefinition)
	 */
	protected void sequence_TransitionObjectDefinition(ISerializationContext context, TransitionObjectDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (use=Use predefinedValue=[Instance|ID])
	 */
	protected void sequence_UseDefinition(ISerializationContext context, UseDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.USE_DEFINITION__USE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.USE_DEFINITION__USE));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.USE_DEFINITION__PREDEFINED_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.USE_DEFINITION__PREDEFINED_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUseDefinitionAccess().getUseUseParserRuleCall_0_0(), semanticObject.getUse());
		feeder.accept(grammarAccess.getUseDefinitionAccess().getPredefinedValueInstanceIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.USE_DEFINITION__PREDEFINED_VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     User returns User
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_User(ISerializationContext context, User semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.USER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.USER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WithStatesDefinition returns WithStatesDefinition
	 *
	 * Constraint:
	 *     (composition=With predicate=Predicate)
	 */
	protected void sequence_WithStatesDefinition(ISerializationContext context, WithStatesDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WITH_STATES_DEFINITION__COMPOSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WITH_STATES_DEFINITION__COMPOSITION));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WITH_STATES_DEFINITION__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WITH_STATES_DEFINITION__PREDICATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWithStatesDefinitionAccess().getCompositionWithParserRuleCall_0_0(), semanticObject.getComposition());
		feeder.accept(grammarAccess.getWithStatesDefinitionAccess().getPredicatePredicateParserRuleCall_2_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WithTransitionsDefinition returns WithTransitionsDefinition
	 *
	 * Constraint:
	 *     (composition=With transitions=TransitionalExpression)
	 */
	protected void sequence_WithTransitionsDefinition(ISerializationContext context, WithTransitionsDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WITH_TRANSITIONS_DEFINITION__COMPOSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WITH_TRANSITIONS_DEFINITION__COMPOSITION));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.WITH_TRANSITIONS_DEFINITION__TRANSITIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.WITH_TRANSITIONS_DEFINITION__TRANSITIONS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWithTransitionsDefinitionAccess().getCompositionWithParserRuleCall_0_0(), semanticObject.getComposition());
		feeder.accept(grammarAccess.getWithTransitionsDefinitionAccess().getTransitionsTransitionalExpressionParserRuleCall_2_0(), semanticObject.getTransitions());
		feeder.finish();
	}
	
	
}
