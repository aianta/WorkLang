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
package work.worklang.serializer;

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
import work.worklang.services.WorkGrammarAccess;
import work.worklang.work.Add;
import work.worklang.work.Element;
import work.worklang.work.Match;
import work.worklang.work.Point;
import work.worklang.work.WorkPackage;

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
			case WorkPackage.ADD:
				sequence_Add(context, (Add) semanticObject); 
				return; 
			case WorkPackage.ELEMENT:
				sequence_Element(context, (Element) semanticObject); 
				return; 
			case WorkPackage.MATCH:
				sequence_Match(context, (Match) semanticObject); 
				return; 
			case WorkPackage.POINT:
				sequence_Point(context, (Point) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     WorkStatement returns Add
	 *     MetaAction returns Add
	 *     Add returns Add
	 *
	 * Constraint:
	 *     filepath=STRING
	 */
	protected void sequence_Add(ISerializationContext context, Add semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.ADD__FILEPATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.ADD__FILEPATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddAccess().getFilepathSTRINGTerminalRuleCall_1_0(), semanticObject.getFilepath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Element
	 *
	 * Constraint:
	 *     (name=STRING source=Point)
	 */
	protected void sequence_Element(ISerializationContext context, Element semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.ELEMENT__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.ELEMENT__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementAccess().getNameSTRINGTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getElementAccess().getSourcePointParserRuleCall_1_0(), semanticObject.getSource());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WorkStatement returns Match
	 *     Action returns Match
	 *     Match returns Match
	 *
	 * Constraint:
	 *     (domain=[Element|ID] range=[Element|ID])
	 */
	protected void sequence_Match(ISerializationContext context, Match semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.MATCH__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.MATCH__DOMAIN));
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.MATCH__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.MATCH__RANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMatchAccess().getDomainElementIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WorkPackage.Literals.MATCH__DOMAIN, false));
		feeder.accept(grammarAccess.getMatchAccess().getRangeElementIDTerminalRuleCall_3_0_1(), semanticObject.eGet(WorkPackage.Literals.MATCH__RANGE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Point
	 *
	 * Constraint:
	 *     filepath=STRING
	 */
	protected void sequence_Point(ISerializationContext context, Point semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkPackage.Literals.POINT__FILEPATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkPackage.Literals.POINT__FILEPATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPointAccess().getFilepathSTRINGTerminalRuleCall_0(), semanticObject.getFilepath());
		feeder.finish();
	}
	
	
}
