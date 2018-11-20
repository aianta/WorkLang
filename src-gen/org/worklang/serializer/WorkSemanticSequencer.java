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
import org.worklang.work.DefinitionSpace;
import org.worklang.work.Domain;
import org.worklang.work.Instance;
import org.worklang.work.InstanceSpace;
import org.worklang.work.State;
import org.worklang.work.Transition;
import org.worklang.work.TransitionInstance;
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
			case WorkPackage.DEFINITION_SPACE:
				sequence_DefinitionSpace(context, (DefinitionSpace) semanticObject); 
				return; 
			case WorkPackage.DOMAIN:
				sequence_Domain(context, (Domain) semanticObject); 
				return; 
			case WorkPackage.INSTANCE:
				sequence_Instance(context, (Instance) semanticObject); 
				return; 
			case WorkPackage.INSTANCE_SPACE:
				sequence_InstanceSpace(context, (InstanceSpace) semanticObject); 
				return; 
			case WorkPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case WorkPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case WorkPackage.TRANSITION_INSTANCE:
				sequence_TransitionInstance(context, (TransitionInstance) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DefinitionSpace returns DefinitionSpace
	 *
	 * Constraint:
	 *     (states+=State* transitions+=Transition*)
	 */
	protected void sequence_DefinitionSpace(ISerializationContext context, DefinitionSpace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Domain returns Domain
	 *
	 * Constraint:
	 *     (name=ID definitionSpace=DefinitionSpace? instanceSpace=InstanceSpace?)
	 */
	protected void sequence_Domain(ISerializationContext context, Domain semanticObject) {
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
	 *     (conceptualTransition=[Transition|ID] name=STRING transition=TransitionInstance)
	 */
	protected void sequence_Instance(ISerializationContext context, Instance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.INSTANCE__CONCEPTUAL_TRANSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.INSTANCE__CONCEPTUAL_TRANSITION));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.INSTANCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.INSTANCE__NAME));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.INSTANCE__TRANSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.INSTANCE__TRANSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstanceAccess().getConceptualTransitionTransitionIDTerminalRuleCall_0_0_1(), semanticObject.eGet(WorkPackage.Literals.INSTANCE__CONCEPTUAL_TRANSITION, false));
		feeder.accept(grammarAccess.getInstanceAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInstanceAccess().getTransitionTransitionInstanceParserRuleCall_3_0(), semanticObject.getTransition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.STATE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
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
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (name=ID input=[State|ID] output=[State|ID])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION__NAME));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION__INPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION__INPUT));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.TRANSITION__OUTPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.TRANSITION__OUTPUT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTransitionAccess().getInputStateIDTerminalRuleCall_3_0_1(), semanticObject.eGet(WorkPackage.Literals.TRANSITION__INPUT, false));
		feeder.accept(grammarAccess.getTransitionAccess().getOutputStateIDTerminalRuleCall_5_0_1(), semanticObject.eGet(WorkPackage.Literals.TRANSITION__OUTPUT, false));
		feeder.finish();
	}
	
	
}
