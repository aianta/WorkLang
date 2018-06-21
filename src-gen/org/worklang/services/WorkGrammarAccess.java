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
package org.worklang.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class WorkGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Model");
		private final Assignment cFieldsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFieldsFieldDefinitionParserRuleCall_0 = (RuleCall)cFieldsAssignment.eContents().get(0);
		
		//Model:
		//	fields+=FieldDefinition*
		//	//experts += ExpertDefinition*
		//	//practitioners += Practitioner*
		//	//instructions += Instruction*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//fields+=FieldDefinition*
		public Assignment getFieldsAssignment() { return cFieldsAssignment; }
		
		//FieldDefinition
		public RuleCall getFieldsFieldDefinitionParserRuleCall_0() { return cFieldsFieldDefinitionParserRuleCall_0; }
	}
	public class FieldDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.FieldDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefinitionSpaceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefinitionSpaceDefinitionSpaceParserRuleCall_3_0 = (RuleCall)cDefinitionSpaceAssignment_3.eContents().get(0);
		private final Assignment cReferenceSpaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReferenceSpaceReferenceSpaceParserRuleCall_4_0 = (RuleCall)cReferenceSpaceAssignment_4.eContents().get(0);
		private final Assignment cMapSpaceAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cMapSpaceMapSpaceParserRuleCall_5_0 = (RuleCall)cMapSpaceAssignment_5.eContents().get(0);
		private final Assignment cInstanceSpaceAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cInstanceSpaceInstanceSpaceParserRuleCall_6_0 = (RuleCall)cInstanceSpaceAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		///* Executable Structure
		// * Below are the grammar rules for defining execution requests for the work interpreter.
		// */ //Instruction:
		////	objectType = 'instruction' space = [Space] transition = [TransitionID]
		////;
		////Practitioner:
		////	practitionerDef = 'practitioner'
		////	user = User
		////	'{'
		////	knowledgeDef = KnowledgeDefinition?
		////	skillsDef = SkillsDefinition?
		////	'}'
		////;
		////ExpertDefinition:
		////	expertDef = 'expert' user = User
		////	'{'
		////	domainDef = DomainDefinition?
		////	knowledgeDef = KnowledgeDefinition?
		////	skillsDef = SkillsDefinition?
		////	'hourlyRate'
		////	'$' rate =  INT
		////	'}'
		////;
		////User:
		////	name = ID
		////;
		////DomainDefinition:
		////	domain = 'domain'
		////	'{'
		////		domainAreas += ReferenceField*
		////	'}'
		////;
		////KnowledgeDefinition:
		////	knowledgeDef = 'knowledge''{'
		////		knowledge += ReferenceState*
		////	'}'
		////;
		////SkillsDefinition:
		////	skillsDef = 'skills''{'
		////		skills += ReferenceTransition*
		////	'}'
		////;
		////FieldDefinition:
		////	field = Field
		////	space = Space
		////	extends=(ExtendsDefinition)? 
		////	'{'
		////	(conceptualspace = Namespace)?
		////	(referencespace = Referencespace)?
		////	(mappedspace = Mapspace)?
		////	(instancespace = Instancespace)?
		////	'}'	
		////;
		//FieldDefinition:
		//	'field'
		//	name=ID
		//	'{'
		//	definitionSpace=DefinitionSpace?
		//	referenceSpace=ReferenceSpace?
		//	mapSpace=MapSpace?
		//	instanceSpace=InstanceSpace?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'field' name=ID '{' definitionSpace=DefinitionSpace? referenceSpace=ReferenceSpace? mapSpace=MapSpace?
		//instanceSpace=InstanceSpace? '}'
		public Group getGroup() { return cGroup; }
		
		//'field'
		public Keyword getFieldKeyword_0() { return cFieldKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//definitionSpace=DefinitionSpace?
		public Assignment getDefinitionSpaceAssignment_3() { return cDefinitionSpaceAssignment_3; }
		
		//DefinitionSpace
		public RuleCall getDefinitionSpaceDefinitionSpaceParserRuleCall_3_0() { return cDefinitionSpaceDefinitionSpaceParserRuleCall_3_0; }
		
		//referenceSpace=ReferenceSpace?
		public Assignment getReferenceSpaceAssignment_4() { return cReferenceSpaceAssignment_4; }
		
		//ReferenceSpace
		public RuleCall getReferenceSpaceReferenceSpaceParserRuleCall_4_0() { return cReferenceSpaceReferenceSpaceParserRuleCall_4_0; }
		
		//mapSpace=MapSpace?
		public Assignment getMapSpaceAssignment_5() { return cMapSpaceAssignment_5; }
		
		//MapSpace
		public RuleCall getMapSpaceMapSpaceParserRuleCall_5_0() { return cMapSpaceMapSpaceParserRuleCall_5_0; }
		
		//instanceSpace=InstanceSpace?
		public Assignment getInstanceSpaceAssignment_6() { return cInstanceSpaceAssignment_6; }
		
		//InstanceSpace
		public RuleCall getInstanceSpaceInstanceSpaceParserRuleCall_6_0() { return cInstanceSpaceInstanceSpaceParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class MapSpaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.MapSpace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMapSpaceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMappingsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cMappedStatesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMappedStatesStateMappingParserRuleCall_3_0 = (RuleCall)cMappedStatesAssignment_3.eContents().get(0);
		private final Assignment cMappedTransitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMappedTransitionsTransitionMappingParserRuleCall_4_0 = (RuleCall)cMappedTransitionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		////Space:
		////	name = ID
		////;
		//MapSpace:
		//	{MapSpace} 'mappings' '{'
		//	mappedStates+=StateMapping*
		//	mappedTransitions+=TransitionMapping*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{MapSpace} 'mappings' '{' mappedStates+=StateMapping* mappedTransitions+=TransitionMapping* '}'
		public Group getGroup() { return cGroup; }
		
		//{MapSpace}
		public Action getMapSpaceAction_0() { return cMapSpaceAction_0; }
		
		//'mappings'
		public Keyword getMappingsKeyword_1() { return cMappingsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//mappedStates+=StateMapping*
		public Assignment getMappedStatesAssignment_3() { return cMappedStatesAssignment_3; }
		
		//StateMapping
		public RuleCall getMappedStatesStateMappingParserRuleCall_3_0() { return cMappedStatesStateMappingParserRuleCall_3_0; }
		
		//mappedTransitions+=TransitionMapping*
		public Assignment getMappedTransitionsAssignment_4() { return cMappedTransitionsAssignment_4; }
		
		//TransitionMapping
		public RuleCall getMappedTransitionsTransitionMappingParserRuleCall_4_0() { return cMappedTransitionsTransitionMappingParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class StateMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.StateMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cForeignStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cForeignStateStateDefinitionCrossReference_1_0 = (CrossReference)cForeignStateAssignment_1.eContents().get(0);
		private final RuleCall cForeignStateStateDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cForeignStateStateDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFieldFieldDefinitionCrossReference_3_0 = (CrossReference)cFieldAssignment_3.eContents().get(0);
		private final RuleCall cFieldFieldDefinitionIDTerminalRuleCall_3_0_1 = (RuleCall)cFieldFieldDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cLocalStateAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cLocalStateStateDefinitionCrossReference_5_0 = (CrossReference)cLocalStateAssignment_5.eContents().get(0);
		private final RuleCall cLocalStateStateDefinitionIDTerminalRuleCall_5_0_1 = (RuleCall)cLocalStateStateDefinitionCrossReference_5_0.eContents().get(1);
		
		//StateMapping:
		//	'state' foreignState=[StateDefinition] 'from' field=[FieldDefinition] 'to' localState=[StateDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//'state' foreignState=[StateDefinition] 'from' field=[FieldDefinition] 'to' localState=[StateDefinition]
		public Group getGroup() { return cGroup; }
		
		//'state'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//foreignState=[StateDefinition]
		public Assignment getForeignStateAssignment_1() { return cForeignStateAssignment_1; }
		
		//[StateDefinition]
		public CrossReference getForeignStateStateDefinitionCrossReference_1_0() { return cForeignStateStateDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getForeignStateStateDefinitionIDTerminalRuleCall_1_0_1() { return cForeignStateStateDefinitionIDTerminalRuleCall_1_0_1; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//field=[FieldDefinition]
		public Assignment getFieldAssignment_3() { return cFieldAssignment_3; }
		
		//[FieldDefinition]
		public CrossReference getFieldFieldDefinitionCrossReference_3_0() { return cFieldFieldDefinitionCrossReference_3_0; }
		
		//ID
		public RuleCall getFieldFieldDefinitionIDTerminalRuleCall_3_0_1() { return cFieldFieldDefinitionIDTerminalRuleCall_3_0_1; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//localState=[StateDefinition]
		public Assignment getLocalStateAssignment_5() { return cLocalStateAssignment_5; }
		
		//[StateDefinition]
		public CrossReference getLocalStateStateDefinitionCrossReference_5_0() { return cLocalStateStateDefinitionCrossReference_5_0; }
		
		//ID
		public RuleCall getLocalStateStateDefinitionIDTerminalRuleCall_5_0_1() { return cLocalStateStateDefinitionIDTerminalRuleCall_5_0_1; }
	}
	public class TransitionMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TransitionMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cForeignTransitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cForeignTransitionTransitionIDCrossReference_1_0 = (CrossReference)cForeignTransitionAssignment_1.eContents().get(0);
		private final RuleCall cForeignTransitionTransitionIDIDTerminalRuleCall_1_0_1 = (RuleCall)cForeignTransitionTransitionIDCrossReference_1_0.eContents().get(1);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFieldFieldDefinitionCrossReference_3_0 = (CrossReference)cFieldAssignment_3.eContents().get(0);
		private final RuleCall cFieldFieldDefinitionIDTerminalRuleCall_3_0_1 = (RuleCall)cFieldFieldDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cLocalTransitionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cLocalTransitionTransitionIDCrossReference_5_0 = (CrossReference)cLocalTransitionAssignment_5.eContents().get(0);
		private final RuleCall cLocalTransitionTransitionIDIDTerminalRuleCall_5_0_1 = (RuleCall)cLocalTransitionTransitionIDCrossReference_5_0.eContents().get(1);
		
		//TransitionMapping:
		//	'transition' foreignTransition=[TransitionID] 'from' field=[FieldDefinition] 'to' localTransition=[TransitionID];
		@Override public ParserRule getRule() { return rule; }
		
		//'transition' foreignTransition=[TransitionID] 'from' field=[FieldDefinition] 'to' localTransition=[TransitionID]
		public Group getGroup() { return cGroup; }
		
		//'transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//foreignTransition=[TransitionID]
		public Assignment getForeignTransitionAssignment_1() { return cForeignTransitionAssignment_1; }
		
		//[TransitionID]
		public CrossReference getForeignTransitionTransitionIDCrossReference_1_0() { return cForeignTransitionTransitionIDCrossReference_1_0; }
		
		//ID
		public RuleCall getForeignTransitionTransitionIDIDTerminalRuleCall_1_0_1() { return cForeignTransitionTransitionIDIDTerminalRuleCall_1_0_1; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//field=[FieldDefinition]
		public Assignment getFieldAssignment_3() { return cFieldAssignment_3; }
		
		//[FieldDefinition]
		public CrossReference getFieldFieldDefinitionCrossReference_3_0() { return cFieldFieldDefinitionCrossReference_3_0; }
		
		//ID
		public RuleCall getFieldFieldDefinitionIDTerminalRuleCall_3_0_1() { return cFieldFieldDefinitionIDTerminalRuleCall_3_0_1; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//localTransition=[TransitionID]
		public Assignment getLocalTransitionAssignment_5() { return cLocalTransitionAssignment_5; }
		
		//[TransitionID]
		public CrossReference getLocalTransitionTransitionIDCrossReference_5_0() { return cLocalTransitionTransitionIDCrossReference_5_0; }
		
		//ID
		public RuleCall getLocalTransitionTransitionIDIDTerminalRuleCall_5_0_1() { return cLocalTransitionTransitionIDIDTerminalRuleCall_5_0_1; }
	}
	public class DefinitionSpaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.DefinitionSpace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDefinitionSpaceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDefinitionsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStatesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStatesStateDefinitionParserRuleCall_3_0 = (RuleCall)cStatesAssignment_3.eContents().get(0);
		private final Assignment cTransitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransitionsTransitionDefinitionParserRuleCall_4_0 = (RuleCall)cTransitionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		////Namespace:
		////	spaceType = Definitions
		////	'{'
		////	states += StateObjectDefinition*
		////	transitions += TransitionObjectDefinition*
		////	'}'
		////;
		//DefinitionSpace:
		//	{DefinitionSpace} 'definitions'
		//	'{'
		//	states+=StateDefinition*
		//	transitions+=TransitionDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{DefinitionSpace} 'definitions' '{' states+=StateDefinition* transitions+=TransitionDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//{DefinitionSpace}
		public Action getDefinitionSpaceAction_0() { return cDefinitionSpaceAction_0; }
		
		//'definitions'
		public Keyword getDefinitionsKeyword_1() { return cDefinitionsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//states+=StateDefinition*
		public Assignment getStatesAssignment_3() { return cStatesAssignment_3; }
		
		//StateDefinition
		public RuleCall getStatesStateDefinitionParserRuleCall_3_0() { return cStatesStateDefinitionParserRuleCall_3_0; }
		
		//transitions+=TransitionDefinition*
		public Assignment getTransitionsAssignment_4() { return cTransitionsAssignment_4; }
		
		//TransitionDefinition
		public RuleCall getTransitionsTransitionDefinitionParserRuleCall_4_0() { return cTransitionsTransitionDefinitionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class StateDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.StateDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPrimitiveStateDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCompoundStateDefinitionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//StateDefinition:
		//	PrimitiveStateDefinition | CompoundStateDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//PrimitiveStateDefinition | CompoundStateDefinition
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PrimitiveStateDefinition
		public RuleCall getPrimitiveStateDefinitionParserRuleCall_0() { return cPrimitiveStateDefinitionParserRuleCall_0; }
		
		//CompoundStateDefinition
		public RuleCall getCompoundStateDefinitionParserRuleCall_1() { return cCompoundStateDefinitionParserRuleCall_1; }
	}
	public class PrimitiveStateDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.PrimitiveStateDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cTypePrimitiveKeyword_0_0 = (Keyword)cTypeAssignment_0.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//PrimitiveStateDefinition:
		//	type='primitive'
		//	'state'
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//type='primitive' 'state' name=ID
		public Group getGroup() { return cGroup; }
		
		//type='primitive'
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//'primitive'
		public Keyword getTypePrimitiveKeyword_0_0() { return cTypePrimitiveKeyword_0_0; }
		
		//'state'
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class CompoundStateDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.CompoundStateDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cTypeCompoundKeyword_0_0 = (Keyword)cTypeAssignment_0.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cCompositionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCompositionWithStatesDefinitionParserRuleCall_3_0 = (RuleCall)cCompositionAssignment_3.eContents().get(0);
		
		//CompoundStateDefinition:
		//	type='compound'
		//	'state'
		//	name=ID
		//	composition=WithStatesDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//type='compound' 'state' name=ID composition=WithStatesDefinition
		public Group getGroup() { return cGroup; }
		
		//type='compound'
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//'compound'
		public Keyword getTypeCompoundKeyword_0_0() { return cTypeCompoundKeyword_0_0; }
		
		//'state'
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//composition=WithStatesDefinition
		public Assignment getCompositionAssignment_3() { return cCompositionAssignment_3; }
		
		//WithStatesDefinition
		public RuleCall getCompositionWithStatesDefinitionParserRuleCall_3_0() { return cCompositionWithStatesDefinitionParserRuleCall_3_0; }
	}
	public class TransitionDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TransitionDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPrimitiveTransitionDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCompoundTransitionDefinitionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TransitionDefinition:
		//	PrimitiveTransitionDefinition | CompoundTransitionDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//PrimitiveTransitionDefinition | CompoundTransitionDefinition
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PrimitiveTransitionDefinition
		public RuleCall getPrimitiveTransitionDefinitionParserRuleCall_0() { return cPrimitiveTransitionDefinitionParserRuleCall_0; }
		
		//CompoundTransitionDefinition
		public RuleCall getCompoundTransitionDefinitionParserRuleCall_1() { return cCompoundTransitionDefinitionParserRuleCall_1; }
	}
	public class PrimitiveTransitionDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.PrimitiveTransitionDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cTypePrimitiveKeyword_0_0 = (Keyword)cTypeAssignment_0.eContents().get(0);
		private final Keyword cTransitionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cInAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInInputDefinitionParserRuleCall_3_0 = (RuleCall)cInAssignment_3.eContents().get(0);
		private final Assignment cOutAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOutOutputDefinitionParserRuleCall_4_0 = (RuleCall)cOutAssignment_4.eContents().get(0);
		
		//PrimitiveTransitionDefinition:
		//	type='primitive'
		//	'transition'
		//	name=ID
		//	in=InputDefinition?
		//	out=OutputDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//type='primitive' 'transition' name=ID in=InputDefinition? out=OutputDefinition
		public Group getGroup() { return cGroup; }
		
		//type='primitive'
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//'primitive'
		public Keyword getTypePrimitiveKeyword_0_0() { return cTypePrimitiveKeyword_0_0; }
		
		//'transition'
		public Keyword getTransitionKeyword_1() { return cTransitionKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//in=InputDefinition?
		public Assignment getInAssignment_3() { return cInAssignment_3; }
		
		//InputDefinition
		public RuleCall getInInputDefinitionParserRuleCall_3_0() { return cInInputDefinitionParserRuleCall_3_0; }
		
		//out=OutputDefinition
		public Assignment getOutAssignment_4() { return cOutAssignment_4; }
		
		//OutputDefinition
		public RuleCall getOutOutputDefinitionParserRuleCall_4_0() { return cOutOutputDefinitionParserRuleCall_4_0; }
	}
	public class CompoundTransitionDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.CompoundTransitionDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cTypeCompoundKeyword_0_0 = (Keyword)cTypeAssignment_0.eContents().get(0);
		private final Keyword cTransitionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cInAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInInputDefinitionParserRuleCall_3_0 = (RuleCall)cInAssignment_3.eContents().get(0);
		private final Assignment cOutAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOutOutputDefinitionParserRuleCall_4_0 = (RuleCall)cOutAssignment_4.eContents().get(0);
		private final Assignment cCompositionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCompositionWithTransitionsDefinitionParserRuleCall_5_0 = (RuleCall)cCompositionAssignment_5.eContents().get(0);
		
		//CompoundTransitionDefinition:
		//	type='compound'
		//	'transition'
		//	name=ID
		//	in=InputDefinition?
		//	out=OutputDefinition
		//	composition=WithTransitionsDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//type='compound' 'transition' name=ID in=InputDefinition? out=OutputDefinition composition=WithTransitionsDefinition
		public Group getGroup() { return cGroup; }
		
		//type='compound'
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//'compound'
		public Keyword getTypeCompoundKeyword_0_0() { return cTypeCompoundKeyword_0_0; }
		
		//'transition'
		public Keyword getTransitionKeyword_1() { return cTransitionKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//in=InputDefinition?
		public Assignment getInAssignment_3() { return cInAssignment_3; }
		
		//InputDefinition
		public RuleCall getInInputDefinitionParserRuleCall_3_0() { return cInInputDefinitionParserRuleCall_3_0; }
		
		//out=OutputDefinition
		public Assignment getOutAssignment_4() { return cOutAssignment_4; }
		
		//OutputDefinition
		public RuleCall getOutOutputDefinitionParserRuleCall_4_0() { return cOutOutputDefinitionParserRuleCall_4_0; }
		
		//composition=WithTransitionsDefinition
		public Assignment getCompositionAssignment_5() { return cCompositionAssignment_5; }
		
		//WithTransitionsDefinition
		public RuleCall getCompositionWithTransitionsDefinitionParserRuleCall_5_0() { return cCompositionWithTransitionsDefinitionParserRuleCall_5_0; }
	}
	public class ReferenceSpaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ReferenceSpace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cReferenceSpaceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReferencesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRefStatesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRefStatesReferenceStateParserRuleCall_3_0 = (RuleCall)cRefStatesAssignment_3.eContents().get(0);
		private final Assignment cRefTransitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRefTransitionsReferenceTransitionParserRuleCall_4_0 = (RuleCall)cRefTransitionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		////TransitionDefinition:
		////	object = Transition transition = TransitionID (in = InputDefinition)? out = OutputDefinition (composition = WithTransitionsDefinition)?
		////;
		////Referencespace:
		////	spaceType = References
		////	'{'
		////	refFields += ReferenceField*
		////	refStates += ReferenceState*
		////	refTransition += ReferenceTransition*
		////	'}'
		////;
		//ReferenceSpace:
		//	{ReferenceSpace} 'references'
		//	'{'
		//	refStates+=ReferenceState*
		//	refTransitions+=ReferenceTransition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{ReferenceSpace} 'references' '{' refStates+=ReferenceState* refTransitions+=ReferenceTransition* '}'
		public Group getGroup() { return cGroup; }
		
		//{ReferenceSpace}
		public Action getReferenceSpaceAction_0() { return cReferenceSpaceAction_0; }
		
		//'references'
		public Keyword getReferencesKeyword_1() { return cReferencesKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//refStates+=ReferenceState*
		public Assignment getRefStatesAssignment_3() { return cRefStatesAssignment_3; }
		
		//ReferenceState
		public RuleCall getRefStatesReferenceStateParserRuleCall_3_0() { return cRefStatesReferenceStateParserRuleCall_3_0; }
		
		//refTransitions+=ReferenceTransition*
		public Assignment getRefTransitionsAssignment_4() { return cRefTransitionsAssignment_4; }
		
		//ReferenceTransition
		public RuleCall getRefTransitionsReferenceTransitionParserRuleCall_4_0() { return cRefTransitionsReferenceTransitionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ReferenceTransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ReferenceTransition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRefTransitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefTransitionTransitionDefinitionCrossReference_1_0 = (CrossReference)cRefTransitionAssignment_1.eContents().get(0);
		private final RuleCall cRefTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cRefTransitionTransitionDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cForeignFieldAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cForeignFieldFieldDefinitionCrossReference_3_0 = (CrossReference)cForeignFieldAssignment_3.eContents().get(0);
		private final RuleCall cForeignFieldFieldDefinitionIDTerminalRuleCall_3_0_1 = (RuleCall)cForeignFieldFieldDefinitionCrossReference_3_0.eContents().get(1);
		
		//ReferenceTransition:
		//	'transition'
		//	refTransition=[TransitionDefinition]
		//	'from'
		//	foreignField=[FieldDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//'transition' refTransition=[TransitionDefinition] 'from' foreignField=[FieldDefinition]
		public Group getGroup() { return cGroup; }
		
		//'transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//refTransition=[TransitionDefinition]
		public Assignment getRefTransitionAssignment_1() { return cRefTransitionAssignment_1; }
		
		//[TransitionDefinition]
		public CrossReference getRefTransitionTransitionDefinitionCrossReference_1_0() { return cRefTransitionTransitionDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getRefTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1() { return cRefTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//foreignField=[FieldDefinition]
		public Assignment getForeignFieldAssignment_3() { return cForeignFieldAssignment_3; }
		
		//[FieldDefinition]
		public CrossReference getForeignFieldFieldDefinitionCrossReference_3_0() { return cForeignFieldFieldDefinitionCrossReference_3_0; }
		
		//ID
		public RuleCall getForeignFieldFieldDefinitionIDTerminalRuleCall_3_0_1() { return cForeignFieldFieldDefinitionIDTerminalRuleCall_3_0_1; }
	}
	public class ReferenceStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ReferenceState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRefStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefStateStateDefinitionCrossReference_1_0 = (CrossReference)cRefStateAssignment_1.eContents().get(0);
		private final RuleCall cRefStateStateDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cRefStateStateDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cForeignFieldAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cForeignFieldFieldDefinitionCrossReference_3_0 = (CrossReference)cForeignFieldAssignment_3.eContents().get(0);
		private final RuleCall cForeignFieldFieldDefinitionIDTerminalRuleCall_3_0_1 = (RuleCall)cForeignFieldFieldDefinitionCrossReference_3_0.eContents().get(1);
		
		//ReferenceState:
		//	'state'
		//	refState=[StateDefinition]
		//	'from'
		//	foreignField=[FieldDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//'state' refState=[StateDefinition] 'from' foreignField=[FieldDefinition]
		public Group getGroup() { return cGroup; }
		
		//'state'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//refState=[StateDefinition]
		public Assignment getRefStateAssignment_1() { return cRefStateAssignment_1; }
		
		//[StateDefinition]
		public CrossReference getRefStateStateDefinitionCrossReference_1_0() { return cRefStateStateDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getRefStateStateDefinitionIDTerminalRuleCall_1_0_1() { return cRefStateStateDefinitionIDTerminalRuleCall_1_0_1; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//foreignField=[FieldDefinition]
		public Assignment getForeignFieldAssignment_3() { return cForeignFieldAssignment_3; }
		
		//[FieldDefinition]
		public CrossReference getForeignFieldFieldDefinitionCrossReference_3_0() { return cForeignFieldFieldDefinitionCrossReference_3_0; }
		
		//ID
		public RuleCall getForeignFieldFieldDefinitionIDTerminalRuleCall_3_0_1() { return cForeignFieldFieldDefinitionIDTerminalRuleCall_3_0_1; }
	}
	public class InstanceSpaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.InstanceSpace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInstanceSpaceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInstancesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInstancesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInstancesInstanceParserRuleCall_3_0 = (RuleCall)cInstancesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		////
		////Instancespace:
		////	spaceType  = Instances
		////	'{'
		////		instances += Instance*
		////	'}'
		////;
		//InstanceSpace:
		//	{InstanceSpace} 'instances'
		//	'{'
		//	instances+=Instance*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{InstanceSpace} 'instances' '{' instances+=Instance* '}'
		public Group getGroup() { return cGroup; }
		
		//{InstanceSpace}
		public Action getInstanceSpaceAction_0() { return cInstanceSpaceAction_0; }
		
		//'instances'
		public Keyword getInstancesKeyword_1() { return cInstancesKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//instances+=Instance*
		public Assignment getInstancesAssignment_3() { return cInstancesAssignment_3; }
		
		//Instance
		public RuleCall getInstancesInstanceParserRuleCall_3_0() { return cInstancesInstanceParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class WithStatesDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.WithStatesDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWithKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPredicateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPredicatePredicateParserRuleCall_2_0 = (RuleCall)cPredicateAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		////ReferenceField:
		////	ref = Field 
		////	space = Space
		////;
		////StateObjectDefinition:
		////	(type = Primitive| type = Compound)
		////	state = StateDefinition 
		////;
		////
		////TransitionObjectDefinition:
		////	(type = Primitive| type = Compound)
		////	transition = TransitionDefinition
		////;
		////PrimitiveStateDefinition:
		////	object = State id = StateID 
		////;
		////
		////CompoundStateDefinition:
		////	object = State state = StateID (compoundStateDef= WithStatesDefinition)?
		////;
		////StateDefinition:
		////	object = State state = StateID (withDefinition= WithStatesDefinition)?
		////;
		////StateID:
		////	 name = ID
		////;
		//WithStatesDefinition:
		//	'with'
		//	'{'
		//	predicate=Predicate
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'with' '{' predicate=Predicate '}'
		public Group getGroup() { return cGroup; }
		
		//'with'
		public Keyword getWithKeyword_0() { return cWithKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//predicate=Predicate
		public Assignment getPredicateAssignment_2() { return cPredicateAssignment_2; }
		
		//Predicate
		public RuleCall getPredicatePredicateParserRuleCall_2_0() { return cPredicatePredicateParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class WithTransitionsDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.WithTransitionsDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWithKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTransitionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTransitionsTransitionalExpressionParserRuleCall_2_0 = (RuleCall)cTransitionsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//WithTransitionsDefinition:
		//	'with'
		//	'{'
		//	transitions=TransitionalExpression
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'with' '{' transitions=TransitionalExpression '}'
		public Group getGroup() { return cGroup; }
		
		//'with'
		public Keyword getWithKeyword_0() { return cWithKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//transitions=TransitionalExpression
		public Assignment getTransitionsAssignment_2() { return cTransitionsAssignment_2; }
		
		//TransitionalExpression
		public RuleCall getTransitionsTransitionalExpressionParserRuleCall_2_0() { return cTransitionsTransitionalExpressionParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class InputDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.InputDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInputDefinitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInputKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInputStateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cInputStateStateDefinitionCrossReference_2_0 = (CrossReference)cInputStateAssignment_2.eContents().get(0);
		private final RuleCall cInputStateStateDefinitionIDTerminalRuleCall_2_0_1 = (RuleCall)cInputStateStateDefinitionCrossReference_2_0.eContents().get(1);
		
		////TransitionID:
		////	name = ID
		////;
		////FromFieldDefinition:
		////	from = From
		////	refSpace = [Space]
		////;
		//InputDefinition:
		//	{InputDefinition} 'input' inputState+=[StateDefinition]*;
		@Override public ParserRule getRule() { return rule; }
		
		//{InputDefinition} 'input' inputState+=[StateDefinition]*
		public Group getGroup() { return cGroup; }
		
		//{InputDefinition}
		public Action getInputDefinitionAction_0() { return cInputDefinitionAction_0; }
		
		//'input'
		public Keyword getInputKeyword_1() { return cInputKeyword_1; }
		
		//inputState+=[StateDefinition]*
		public Assignment getInputStateAssignment_2() { return cInputStateAssignment_2; }
		
		//[StateDefinition]
		public CrossReference getInputStateStateDefinitionCrossReference_2_0() { return cInputStateStateDefinitionCrossReference_2_0; }
		
		//ID
		public RuleCall getInputStateStateDefinitionIDTerminalRuleCall_2_0_1() { return cInputStateStateDefinitionIDTerminalRuleCall_2_0_1; }
	}
	public class OutputDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.OutputDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutputKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOutputStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cOutputStateStateDefinitionCrossReference_1_0 = (CrossReference)cOutputStateAssignment_1.eContents().get(0);
		private final RuleCall cOutputStateStateDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cOutputStateStateDefinitionCrossReference_1_0.eContents().get(1);
		
		//OutputDefinition:
		//	'output' outputState=[StateDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//'output' outputState=[StateDefinition]
		public Group getGroup() { return cGroup; }
		
		//'output'
		public Keyword getOutputKeyword_0() { return cOutputKeyword_0; }
		
		//outputState=[StateDefinition]
		public Assignment getOutputStateAssignment_1() { return cOutputStateAssignment_1; }
		
		//[StateDefinition]
		public CrossReference getOutputStateStateDefinitionCrossReference_1_0() { return cOutputStateStateDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getOutputStateStateDefinitionIDTerminalRuleCall_1_0_1() { return cOutputStateStateDefinitionIDTerminalRuleCall_1_0_1; }
	}
	public class InstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Instance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cTransitionDeclarationAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cTransitionDeclarationTransitionDeclarationParserRuleCall_1_0_0 = (RuleCall)cTransitionDeclarationAssignment_1_0.eContents().get(0);
		private final Assignment cStateDeclarationAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cStateDeclarationStateDeclarationParserRuleCall_1_1_0 = (RuleCall)cStateDeclarationAssignment_1_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cStateAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cStateStateInstanceParserRuleCall_3_0_0 = (RuleCall)cStateAssignment_3_0.eContents().get(0);
		private final Assignment cTransitionAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cTransitionTransitionInstanceParserRuleCall_3_1_0 = (RuleCall)cTransitionAssignment_3_1.eContents().get(0);
		
		////ExtendsDefinition:
		////	type = Extends
		////	namespaces += [Space]+	
		////;
		////
		////
		////Primitive:
		////	'primitive' 
		////;
		////
		////Compound:
		////	'compound'
		////;
		////
		////Field:
		////	'field'
		////;
		////
		////State:
		////	'state'
		////;
		////
		////
		////Transition:
		////	'transition'
		////;
		////
		////Definitions:
		////	'definitions'
		////;
		////
		////References:
		////	'references'
		////;
		////
		////Instances:
		////	'instances'
		////;
		////
		////Input:
		////	'input'
		////;
		////
		////Output:
		////	'output'
		////;
		////
		////From:
		////	'from'
		////;
		////
		////With:
		////	'with'
		////;
		////
		////Extends:
		////	'extends'
		////;
		////
		////NotOp:
		////	'NOT'
		////;
		////
		////AndOp:
		////	'AND'
		////;
		////
		////OrOp:
		////	'OR'
		////;
		////
		////Set:
		////	'set'
		////;
		////
		////To:
		////	'to'
		////;
		////
		////Use:
		////	'use'
		////;
		////
		////
		////Count:
		////	INT
		////;
		//Instance:
		//	'instance' (transitionDeclaration=TransitionDeclaration | stateDeclaration=StateDeclaration) name=STRING
		//	(state=StateInstance | transition=TransitionInstance);
		@Override public ParserRule getRule() { return rule; }
		
		//'instance' (transitionDeclaration=TransitionDeclaration | stateDeclaration=StateDeclaration) name=STRING
		//(state=StateInstance | transition=TransitionInstance)
		public Group getGroup() { return cGroup; }
		
		//'instance'
		public Keyword getInstanceKeyword_0() { return cInstanceKeyword_0; }
		
		//(transitionDeclaration=TransitionDeclaration | stateDeclaration=StateDeclaration)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//transitionDeclaration=TransitionDeclaration
		public Assignment getTransitionDeclarationAssignment_1_0() { return cTransitionDeclarationAssignment_1_0; }
		
		//TransitionDeclaration
		public RuleCall getTransitionDeclarationTransitionDeclarationParserRuleCall_1_0_0() { return cTransitionDeclarationTransitionDeclarationParserRuleCall_1_0_0; }
		
		//stateDeclaration=StateDeclaration
		public Assignment getStateDeclarationAssignment_1_1() { return cStateDeclarationAssignment_1_1; }
		
		//StateDeclaration
		public RuleCall getStateDeclarationStateDeclarationParserRuleCall_1_1_0() { return cStateDeclarationStateDeclarationParserRuleCall_1_1_0; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//(state=StateInstance | transition=TransitionInstance)
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//state=StateInstance
		public Assignment getStateAssignment_3_0() { return cStateAssignment_3_0; }
		
		//StateInstance
		public RuleCall getStateStateInstanceParserRuleCall_3_0_0() { return cStateStateInstanceParserRuleCall_3_0_0; }
		
		//transition=TransitionInstance
		public Assignment getTransitionAssignment_3_1() { return cTransitionAssignment_3_1; }
		
		//TransitionInstance
		public RuleCall getTransitionTransitionInstanceParserRuleCall_3_1_0() { return cTransitionTransitionInstanceParserRuleCall_3_1_0; }
	}
	public class TransitionDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TransitionDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTransitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTransitionTransitionIDCrossReference_1_0 = (CrossReference)cTransitionAssignment_1.eContents().get(0);
		private final RuleCall cTransitionTransitionIDIDTerminalRuleCall_1_0_1 = (RuleCall)cTransitionTransitionIDCrossReference_1_0.eContents().get(1);
		
		//TransitionDeclaration:
		//	'transition' transition=[TransitionID];
		@Override public ParserRule getRule() { return rule; }
		
		//'transition' transition=[TransitionID]
		public Group getGroup() { return cGroup; }
		
		//'transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//transition=[TransitionID]
		public Assignment getTransitionAssignment_1() { return cTransitionAssignment_1; }
		
		//[TransitionID]
		public CrossReference getTransitionTransitionIDCrossReference_1_0() { return cTransitionTransitionIDCrossReference_1_0; }
		
		//ID
		public RuleCall getTransitionTransitionIDIDTerminalRuleCall_1_0_1() { return cTransitionTransitionIDIDTerminalRuleCall_1_0_1; }
	}
	public class StateDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.StateDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cStateStateDefinitionCrossReference_1_0 = (CrossReference)cStateAssignment_1.eContents().get(0);
		private final RuleCall cStateStateDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cStateStateDefinitionCrossReference_1_0.eContents().get(1);
		
		//StateDeclaration:
		//	'state' state=[StateDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//'state' state=[StateDefinition]
		public Group getGroup() { return cGroup; }
		
		//'state'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//state=[StateDefinition]
		public Assignment getStateAssignment_1() { return cStateAssignment_1; }
		
		//[StateDefinition]
		public CrossReference getStateStateDefinitionCrossReference_1_0() { return cStateStateDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getStateStateDefinitionIDTerminalRuleCall_1_0_1() { return cStateStateDefinitionIDTerminalRuleCall_1_0_1; }
	}
	public class TransitionInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TransitionInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cHostAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cHostSTRINGTerminalRuleCall_0_0 = (RuleCall)cHostAssignment_0.eContents().get(0);
		private final Assignment cPortAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPortINTTerminalRuleCall_1_0 = (RuleCall)cPortAssignment_1.eContents().get(0);
		private final Assignment cPathAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPathSTRINGTerminalRuleCall_2_0 = (RuleCall)cPathAssignment_2.eContents().get(0);
		
		//TransitionInstance:
		//	host=STRING
		//	port=INT
		//	path=STRING?;
		@Override public ParserRule getRule() { return rule; }
		
		//host=STRING port=INT path=STRING?
		public Group getGroup() { return cGroup; }
		
		//host=STRING
		public Assignment getHostAssignment_0() { return cHostAssignment_0; }
		
		//STRING
		public RuleCall getHostSTRINGTerminalRuleCall_0_0() { return cHostSTRINGTerminalRuleCall_0_0; }
		
		//port=INT
		public Assignment getPortAssignment_1() { return cPortAssignment_1; }
		
		//INT
		public RuleCall getPortINTTerminalRuleCall_1_0() { return cPortINTTerminalRuleCall_1_0; }
		
		//path=STRING?
		public Assignment getPathAssignment_2() { return cPathAssignment_2; }
		
		//STRING
		public RuleCall getPathSTRINGTerminalRuleCall_2_0() { return cPathSTRINGTerminalRuleCall_2_0; }
	}
	public class StateInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.StateInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMembersAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cMembersAlternatives_1_0 = (Alternatives)cMembersAssignment_1.eContents().get(0);
		private final RuleCall cMembersSetStatementParserRuleCall_1_0_0 = (RuleCall)cMembersAlternatives_1_0.eContents().get(0);
		private final RuleCall cMembersUseDefinitionParserRuleCall_1_0_1 = (RuleCall)cMembersAlternatives_1_0.eContents().get(1);
		private final RuleCall cMembersInstanceParserRuleCall_1_0_2 = (RuleCall)cMembersAlternatives_1_0.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//StateInstance:
		//	'{'
		//	members+=(SetStatement | UseDefinition | Instance)+
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' members+=(SetStatement | UseDefinition | Instance)+ '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//members+=(SetStatement | UseDefinition | Instance)+
		public Assignment getMembersAssignment_1() { return cMembersAssignment_1; }
		
		//(SetStatement | UseDefinition | Instance)
		public Alternatives getMembersAlternatives_1_0() { return cMembersAlternatives_1_0; }
		
		//SetStatement
		public RuleCall getMembersSetStatementParserRuleCall_1_0_0() { return cMembersSetStatementParserRuleCall_1_0_0; }
		
		//UseDefinition
		public RuleCall getMembersUseDefinitionParserRuleCall_1_0_1() { return cMembersUseDefinitionParserRuleCall_1_0_1; }
		
		//Instance
		public RuleCall getMembersInstanceParserRuleCall_1_0_2() { return cMembersInstanceParserRuleCall_1_0_2; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class UseDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.UseDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPredefinedValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPredefinedValueInstanceCrossReference_1_0 = (CrossReference)cPredefinedValueAssignment_1.eContents().get(0);
		private final RuleCall cPredefinedValueInstanceIDTerminalRuleCall_1_0_1 = (RuleCall)cPredefinedValueInstanceCrossReference_1_0.eContents().get(1);
		
		//UseDefinition:
		//	'use' predefinedValue=[Instance];
		@Override public ParserRule getRule() { return rule; }
		
		//'use' predefinedValue=[Instance]
		public Group getGroup() { return cGroup; }
		
		//'use'
		public Keyword getUseKeyword_0() { return cUseKeyword_0; }
		
		//predefinedValue=[Instance]
		public Assignment getPredefinedValueAssignment_1() { return cPredefinedValueAssignment_1; }
		
		//[Instance]
		public CrossReference getPredefinedValueInstanceCrossReference_1_0() { return cPredefinedValueInstanceCrossReference_1_0; }
		
		//ID
		public RuleCall getPredefinedValueInstanceIDTerminalRuleCall_1_0_1() { return cPredefinedValueInstanceIDTerminalRuleCall_1_0_1; }
	}
	public class SetStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.SetStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVariableAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cVariableStateDefinitionCrossReference_1_0 = (CrossReference)cVariableAssignment_1.eContents().get(0);
		private final RuleCall cVariableStateDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cVariableStateDefinitionCrossReference_1_0.eContents().get(1);
		private final Assignment cToDefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cToDefToDefinitionParserRuleCall_2_0 = (RuleCall)cToDefAssignment_2.eContents().get(0);
		
		//SetStatement:
		//	'set' variable=[StateDefinition] toDef=ToDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//'set' variable=[StateDefinition] toDef=ToDefinition
		public Group getGroup() { return cGroup; }
		
		//'set'
		public Keyword getSetKeyword_0() { return cSetKeyword_0; }
		
		//variable=[StateDefinition]
		public Assignment getVariableAssignment_1() { return cVariableAssignment_1; }
		
		//[StateDefinition]
		public CrossReference getVariableStateDefinitionCrossReference_1_0() { return cVariableStateDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getVariableStateDefinitionIDTerminalRuleCall_1_0_1() { return cVariableStateDefinitionIDTerminalRuleCall_1_0_1; }
		
		//toDef=ToDefinition
		public Assignment getToDefAssignment_2() { return cToDefAssignment_2; }
		
		//ToDefinition
		public RuleCall getToDefToDefinitionParserRuleCall_2_0() { return cToDefToDefinitionParserRuleCall_2_0; }
	}
	public class ToDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ToDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cToKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//ToDefinition:
		//	'to' value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'to' value=STRING
		public Group getGroup() { return cGroup; }
		
		//'to'
		public Keyword getToKeyword_0() { return cToKeyword_0; }
		
		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}
	public class PredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Predicate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNegationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNegationNOTKeyword_0_0 = (Keyword)cNegationAssignment_0.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionBinaryExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		
		////State Composition Expression Rules
		//Predicate:
		//	negation?='NOT'? expression=BinaryExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//negation?='NOT'? expression=BinaryExpression
		public Group getGroup() { return cGroup; }
		
		//negation?='NOT'?
		public Assignment getNegationAssignment_0() { return cNegationAssignment_0; }
		
		//'NOT'
		public Keyword getNegationNOTKeyword_0_0() { return cNegationNOTKeyword_0_0; }
		
		//expression=BinaryExpression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }
		
		//BinaryExpression
		public RuleCall getExpressionBinaryExpressionParserRuleCall_1_0() { return cExpressionBinaryExpressionParserRuleCall_1_0; }
	}
	public class BinaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.BinaryExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTerminalBinaryExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOperationLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final Keyword cOpANDKeyword_1_1_0_0 = (Keyword)cOpAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOpORKeyword_1_1_0_1 = (Keyword)cOpAlternatives_1_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightTerminalBinaryExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//BinaryExpression:
		//	TerminalBinaryExpression ({Operation.left=current} op=('AND' | 'OR') right=TerminalBinaryExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//TerminalBinaryExpression ({Operation.left=current} op=('AND' | 'OR') right=TerminalBinaryExpression)*
		public Group getGroup() { return cGroup; }
		
		//TerminalBinaryExpression
		public RuleCall getTerminalBinaryExpressionParserRuleCall_0() { return cTerminalBinaryExpressionParserRuleCall_0; }
		
		//({Operation.left=current} op=('AND' | 'OR') right=TerminalBinaryExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Operation.left=current}
		public Action getOperationLeftAction_1_0() { return cOperationLeftAction_1_0; }
		
		//op=('AND' | 'OR')
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//('AND' | 'OR')
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//'AND'
		public Keyword getOpANDKeyword_1_1_0_0() { return cOpANDKeyword_1_1_0_0; }
		
		//'OR'
		public Keyword getOpORKeyword_1_1_0_1() { return cOpORKeyword_1_1_0_1; }
		
		//right=TerminalBinaryExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//TerminalBinaryExpression
		public RuleCall getRightTerminalBinaryExpressionParserRuleCall_1_2_0() { return cRightTerminalBinaryExpressionParserRuleCall_1_2_0; }
	}
	public class TerminalBinaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TerminalBinaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cPredicateParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cStateDefinitionAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cInstanceAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cInstanceStateDefinitionCrossReference_1_1_0 = (CrossReference)cInstanceAssignment_1_1.eContents().get(0);
		private final RuleCall cInstanceStateDefinitionIDTerminalRuleCall_1_1_0_1 = (RuleCall)cInstanceStateDefinitionCrossReference_1_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cStateDefinitionAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Assignment cListAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final Keyword cListSetOfKeyword_2_1_0_0 = (Keyword)cListAssignment_2_1_0.eContents().get(0);
		private final Assignment cValueAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final CrossReference cValueStateDefinitionCrossReference_2_1_1_0 = (CrossReference)cValueAssignment_2_1_1.eContents().get(0);
		private final RuleCall cValueStateDefinitionIDTerminalRuleCall_2_1_1_0_1 = (RuleCall)cValueStateDefinitionCrossReference_2_1_1_0.eContents().get(1);
		
		//TerminalBinaryExpression BinaryExpression:
		//	'(' Predicate ')' | {StateDefinition} instance=[StateDefinition] | {StateDefinition} (list?='setOf'
		//	value=[StateDefinition]);
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Predicate ')' | {StateDefinition} instance=[StateDefinition] | {StateDefinition} (list?='setOf'
		//value=[StateDefinition])
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' Predicate ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//Predicate
		public RuleCall getPredicateParserRuleCall_0_1() { return cPredicateParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//{StateDefinition} instance=[StateDefinition]
		public Group getGroup_1() { return cGroup_1; }
		
		//{StateDefinition}
		public Action getStateDefinitionAction_1_0() { return cStateDefinitionAction_1_0; }
		
		//instance=[StateDefinition]
		public Assignment getInstanceAssignment_1_1() { return cInstanceAssignment_1_1; }
		
		//[StateDefinition]
		public CrossReference getInstanceStateDefinitionCrossReference_1_1_0() { return cInstanceStateDefinitionCrossReference_1_1_0; }
		
		//ID
		public RuleCall getInstanceStateDefinitionIDTerminalRuleCall_1_1_0_1() { return cInstanceStateDefinitionIDTerminalRuleCall_1_1_0_1; }
		
		//{StateDefinition} (list?='setOf' value=[StateDefinition])
		public Group getGroup_2() { return cGroup_2; }
		
		//{StateDefinition}
		public Action getStateDefinitionAction_2_0() { return cStateDefinitionAction_2_0; }
		
		//(list?='setOf' value=[StateDefinition])
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//list?='setOf'
		public Assignment getListAssignment_2_1_0() { return cListAssignment_2_1_0; }
		
		//'setOf'
		public Keyword getListSetOfKeyword_2_1_0_0() { return cListSetOfKeyword_2_1_0_0; }
		
		//value=[StateDefinition]
		public Assignment getValueAssignment_2_1_1() { return cValueAssignment_2_1_1; }
		
		//[StateDefinition]
		public CrossReference getValueStateDefinitionCrossReference_2_1_1_0() { return cValueStateDefinitionCrossReference_2_1_1_0; }
		
		//ID
		public RuleCall getValueStateDefinitionIDTerminalRuleCall_2_1_1_0_1() { return cValueStateDefinitionIDTerminalRuleCall_2_1_1_0_1; }
	}
	public class TransitionalExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TransitionalExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTerminalTransitionalExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOperationLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cOpTHENKeyword_1_1_0 = (Keyword)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightTerminalTransitionalExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////Transition Composition Expression Rules
		//TransitionalExpression:
		//	TerminalTransitionalExpression ({Operation.left=current} op='THEN' right=TerminalTransitionalExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//TerminalTransitionalExpression ({Operation.left=current} op='THEN' right=TerminalTransitionalExpression)*
		public Group getGroup() { return cGroup; }
		
		//TerminalTransitionalExpression
		public RuleCall getTerminalTransitionalExpressionParserRuleCall_0() { return cTerminalTransitionalExpressionParserRuleCall_0; }
		
		//({Operation.left=current} op='THEN' right=TerminalTransitionalExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Operation.left=current}
		public Action getOperationLeftAction_1_0() { return cOperationLeftAction_1_0; }
		
		//op='THEN'
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//'THEN'
		public Keyword getOpTHENKeyword_1_1_0() { return cOpTHENKeyword_1_1_0; }
		
		//right=TerminalTransitionalExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//TerminalTransitionalExpression
		public RuleCall getRightTerminalTransitionalExpressionParserRuleCall_1_2_0() { return cRightTerminalTransitionalExpressionParserRuleCall_1_2_0; }
	}
	public class TerminalTransitionalExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TerminalTransitionalExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cTransitionalExpressionParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cTransitionIDAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cValueTransitionIDCrossReference_1_1_0 = (CrossReference)cValueAssignment_1_1.eContents().get(0);
		private final RuleCall cValueTransitionIDIDTerminalRuleCall_1_1_0_1 = (RuleCall)cValueTransitionIDCrossReference_1_1_0.eContents().get(1);
		
		//TerminalTransitionalExpression TransitionalExpression:
		//	'(' TransitionalExpression ')' | {TransitionID} value=[TransitionID];
		@Override public ParserRule getRule() { return rule; }
		
		//'(' TransitionalExpression ')' | {TransitionID} value=[TransitionID]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' TransitionalExpression ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//TransitionalExpression
		public RuleCall getTransitionalExpressionParserRuleCall_0_1() { return cTransitionalExpressionParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//{TransitionID} value=[TransitionID]
		public Group getGroup_1() { return cGroup_1; }
		
		//{TransitionID}
		public Action getTransitionIDAction_1_0() { return cTransitionIDAction_1_0; }
		
		//value=[TransitionID]
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//[TransitionID]
		public CrossReference getValueTransitionIDCrossReference_1_1_0() { return cValueTransitionIDCrossReference_1_1_0; }
		
		//ID
		public RuleCall getValueTransitionIDIDTerminalRuleCall_1_1_0_1() { return cValueTransitionIDIDTerminalRuleCall_1_1_0_1; }
	}
	
	
	private final ModelElements pModel;
	private final FieldDefinitionElements pFieldDefinition;
	private final MapSpaceElements pMapSpace;
	private final StateMappingElements pStateMapping;
	private final TransitionMappingElements pTransitionMapping;
	private final DefinitionSpaceElements pDefinitionSpace;
	private final StateDefinitionElements pStateDefinition;
	private final PrimitiveStateDefinitionElements pPrimitiveStateDefinition;
	private final CompoundStateDefinitionElements pCompoundStateDefinition;
	private final TransitionDefinitionElements pTransitionDefinition;
	private final PrimitiveTransitionDefinitionElements pPrimitiveTransitionDefinition;
	private final CompoundTransitionDefinitionElements pCompoundTransitionDefinition;
	private final ReferenceSpaceElements pReferenceSpace;
	private final ReferenceTransitionElements pReferenceTransition;
	private final ReferenceStateElements pReferenceState;
	private final InstanceSpaceElements pInstanceSpace;
	private final WithStatesDefinitionElements pWithStatesDefinition;
	private final WithTransitionsDefinitionElements pWithTransitionsDefinition;
	private final InputDefinitionElements pInputDefinition;
	private final OutputDefinitionElements pOutputDefinition;
	private final InstanceElements pInstance;
	private final TransitionDeclarationElements pTransitionDeclaration;
	private final StateDeclarationElements pStateDeclaration;
	private final TransitionInstanceElements pTransitionInstance;
	private final StateInstanceElements pStateInstance;
	private final UseDefinitionElements pUseDefinition;
	private final SetStatementElements pSetStatement;
	private final ToDefinitionElements pToDefinition;
	private final PredicateElements pPredicate;
	private final BinaryExpressionElements pBinaryExpression;
	private final TerminalBinaryExpressionElements pTerminalBinaryExpression;
	private final TransitionalExpressionElements pTransitionalExpression;
	private final TerminalTransitionalExpressionElements pTerminalTransitionalExpression;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public WorkGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pFieldDefinition = new FieldDefinitionElements();
		this.pMapSpace = new MapSpaceElements();
		this.pStateMapping = new StateMappingElements();
		this.pTransitionMapping = new TransitionMappingElements();
		this.pDefinitionSpace = new DefinitionSpaceElements();
		this.pStateDefinition = new StateDefinitionElements();
		this.pPrimitiveStateDefinition = new PrimitiveStateDefinitionElements();
		this.pCompoundStateDefinition = new CompoundStateDefinitionElements();
		this.pTransitionDefinition = new TransitionDefinitionElements();
		this.pPrimitiveTransitionDefinition = new PrimitiveTransitionDefinitionElements();
		this.pCompoundTransitionDefinition = new CompoundTransitionDefinitionElements();
		this.pReferenceSpace = new ReferenceSpaceElements();
		this.pReferenceTransition = new ReferenceTransitionElements();
		this.pReferenceState = new ReferenceStateElements();
		this.pInstanceSpace = new InstanceSpaceElements();
		this.pWithStatesDefinition = new WithStatesDefinitionElements();
		this.pWithTransitionsDefinition = new WithTransitionsDefinitionElements();
		this.pInputDefinition = new InputDefinitionElements();
		this.pOutputDefinition = new OutputDefinitionElements();
		this.pInstance = new InstanceElements();
		this.pTransitionDeclaration = new TransitionDeclarationElements();
		this.pStateDeclaration = new StateDeclarationElements();
		this.pTransitionInstance = new TransitionInstanceElements();
		this.pStateInstance = new StateInstanceElements();
		this.pUseDefinition = new UseDefinitionElements();
		this.pSetStatement = new SetStatementElements();
		this.pToDefinition = new ToDefinitionElements();
		this.pPredicate = new PredicateElements();
		this.pBinaryExpression = new BinaryExpressionElements();
		this.pTerminalBinaryExpression = new TerminalBinaryExpressionElements();
		this.pTransitionalExpression = new TransitionalExpressionElements();
		this.pTerminalTransitionalExpression = new TerminalTransitionalExpressionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.worklang.Work".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	fields+=FieldDefinition*
	//	//experts += ExpertDefinition*
	//	//practitioners += Practitioner*
	//	//instructions += Instruction*
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	///* Executable Structure
	// * Below are the grammar rules for defining execution requests for the work interpreter.
	// */ //Instruction:
	////	objectType = 'instruction' space = [Space] transition = [TransitionID]
	////;
	////Practitioner:
	////	practitionerDef = 'practitioner'
	////	user = User
	////	'{'
	////	knowledgeDef = KnowledgeDefinition?
	////	skillsDef = SkillsDefinition?
	////	'}'
	////;
	////ExpertDefinition:
	////	expertDef = 'expert' user = User
	////	'{'
	////	domainDef = DomainDefinition?
	////	knowledgeDef = KnowledgeDefinition?
	////	skillsDef = SkillsDefinition?
	////	'hourlyRate'
	////	'$' rate =  INT
	////	'}'
	////;
	////User:
	////	name = ID
	////;
	////DomainDefinition:
	////	domain = 'domain'
	////	'{'
	////		domainAreas += ReferenceField*
	////	'}'
	////;
	////KnowledgeDefinition:
	////	knowledgeDef = 'knowledge''{'
	////		knowledge += ReferenceState*
	////	'}'
	////;
	////SkillsDefinition:
	////	skillsDef = 'skills''{'
	////		skills += ReferenceTransition*
	////	'}'
	////;
	////FieldDefinition:
	////	field = Field
	////	space = Space
	////	extends=(ExtendsDefinition)? 
	////	'{'
	////	(conceptualspace = Namespace)?
	////	(referencespace = Referencespace)?
	////	(mappedspace = Mapspace)?
	////	(instancespace = Instancespace)?
	////	'}'	
	////;
	//FieldDefinition:
	//	'field'
	//	name=ID
	//	'{'
	//	definitionSpace=DefinitionSpace?
	//	referenceSpace=ReferenceSpace?
	//	mapSpace=MapSpace?
	//	instanceSpace=InstanceSpace?
	//	'}';
	public FieldDefinitionElements getFieldDefinitionAccess() {
		return pFieldDefinition;
	}
	
	public ParserRule getFieldDefinitionRule() {
		return getFieldDefinitionAccess().getRule();
	}
	
	////Space:
	////	name = ID
	////;
	//MapSpace:
	//	{MapSpace} 'mappings' '{'
	//	mappedStates+=StateMapping*
	//	mappedTransitions+=TransitionMapping*
	//	'}';
	public MapSpaceElements getMapSpaceAccess() {
		return pMapSpace;
	}
	
	public ParserRule getMapSpaceRule() {
		return getMapSpaceAccess().getRule();
	}
	
	//StateMapping:
	//	'state' foreignState=[StateDefinition] 'from' field=[FieldDefinition] 'to' localState=[StateDefinition];
	public StateMappingElements getStateMappingAccess() {
		return pStateMapping;
	}
	
	public ParserRule getStateMappingRule() {
		return getStateMappingAccess().getRule();
	}
	
	//TransitionMapping:
	//	'transition' foreignTransition=[TransitionID] 'from' field=[FieldDefinition] 'to' localTransition=[TransitionID];
	public TransitionMappingElements getTransitionMappingAccess() {
		return pTransitionMapping;
	}
	
	public ParserRule getTransitionMappingRule() {
		return getTransitionMappingAccess().getRule();
	}
	
	////Namespace:
	////	spaceType = Definitions
	////	'{'
	////	states += StateObjectDefinition*
	////	transitions += TransitionObjectDefinition*
	////	'}'
	////;
	//DefinitionSpace:
	//	{DefinitionSpace} 'definitions'
	//	'{'
	//	states+=StateDefinition*
	//	transitions+=TransitionDefinition*
	//	'}';
	public DefinitionSpaceElements getDefinitionSpaceAccess() {
		return pDefinitionSpace;
	}
	
	public ParserRule getDefinitionSpaceRule() {
		return getDefinitionSpaceAccess().getRule();
	}
	
	//StateDefinition:
	//	PrimitiveStateDefinition | CompoundStateDefinition;
	public StateDefinitionElements getStateDefinitionAccess() {
		return pStateDefinition;
	}
	
	public ParserRule getStateDefinitionRule() {
		return getStateDefinitionAccess().getRule();
	}
	
	//PrimitiveStateDefinition:
	//	type='primitive'
	//	'state'
	//	name=ID;
	public PrimitiveStateDefinitionElements getPrimitiveStateDefinitionAccess() {
		return pPrimitiveStateDefinition;
	}
	
	public ParserRule getPrimitiveStateDefinitionRule() {
		return getPrimitiveStateDefinitionAccess().getRule();
	}
	
	//CompoundStateDefinition:
	//	type='compound'
	//	'state'
	//	name=ID
	//	composition=WithStatesDefinition;
	public CompoundStateDefinitionElements getCompoundStateDefinitionAccess() {
		return pCompoundStateDefinition;
	}
	
	public ParserRule getCompoundStateDefinitionRule() {
		return getCompoundStateDefinitionAccess().getRule();
	}
	
	//TransitionDefinition:
	//	PrimitiveTransitionDefinition | CompoundTransitionDefinition;
	public TransitionDefinitionElements getTransitionDefinitionAccess() {
		return pTransitionDefinition;
	}
	
	public ParserRule getTransitionDefinitionRule() {
		return getTransitionDefinitionAccess().getRule();
	}
	
	//PrimitiveTransitionDefinition:
	//	type='primitive'
	//	'transition'
	//	name=ID
	//	in=InputDefinition?
	//	out=OutputDefinition;
	public PrimitiveTransitionDefinitionElements getPrimitiveTransitionDefinitionAccess() {
		return pPrimitiveTransitionDefinition;
	}
	
	public ParserRule getPrimitiveTransitionDefinitionRule() {
		return getPrimitiveTransitionDefinitionAccess().getRule();
	}
	
	//CompoundTransitionDefinition:
	//	type='compound'
	//	'transition'
	//	name=ID
	//	in=InputDefinition?
	//	out=OutputDefinition
	//	composition=WithTransitionsDefinition;
	public CompoundTransitionDefinitionElements getCompoundTransitionDefinitionAccess() {
		return pCompoundTransitionDefinition;
	}
	
	public ParserRule getCompoundTransitionDefinitionRule() {
		return getCompoundTransitionDefinitionAccess().getRule();
	}
	
	////TransitionDefinition:
	////	object = Transition transition = TransitionID (in = InputDefinition)? out = OutputDefinition (composition = WithTransitionsDefinition)?
	////;
	////Referencespace:
	////	spaceType = References
	////	'{'
	////	refFields += ReferenceField*
	////	refStates += ReferenceState*
	////	refTransition += ReferenceTransition*
	////	'}'
	////;
	//ReferenceSpace:
	//	{ReferenceSpace} 'references'
	//	'{'
	//	refStates+=ReferenceState*
	//	refTransitions+=ReferenceTransition*
	//	'}';
	public ReferenceSpaceElements getReferenceSpaceAccess() {
		return pReferenceSpace;
	}
	
	public ParserRule getReferenceSpaceRule() {
		return getReferenceSpaceAccess().getRule();
	}
	
	//ReferenceTransition:
	//	'transition'
	//	refTransition=[TransitionDefinition]
	//	'from'
	//	foreignField=[FieldDefinition];
	public ReferenceTransitionElements getReferenceTransitionAccess() {
		return pReferenceTransition;
	}
	
	public ParserRule getReferenceTransitionRule() {
		return getReferenceTransitionAccess().getRule();
	}
	
	//ReferenceState:
	//	'state'
	//	refState=[StateDefinition]
	//	'from'
	//	foreignField=[FieldDefinition];
	public ReferenceStateElements getReferenceStateAccess() {
		return pReferenceState;
	}
	
	public ParserRule getReferenceStateRule() {
		return getReferenceStateAccess().getRule();
	}
	
	////
	////Instancespace:
	////	spaceType  = Instances
	////	'{'
	////		instances += Instance*
	////	'}'
	////;
	//InstanceSpace:
	//	{InstanceSpace} 'instances'
	//	'{'
	//	instances+=Instance*
	//	'}';
	public InstanceSpaceElements getInstanceSpaceAccess() {
		return pInstanceSpace;
	}
	
	public ParserRule getInstanceSpaceRule() {
		return getInstanceSpaceAccess().getRule();
	}
	
	////ReferenceField:
	////	ref = Field 
	////	space = Space
	////;
	////StateObjectDefinition:
	////	(type = Primitive| type = Compound)
	////	state = StateDefinition 
	////;
	////
	////TransitionObjectDefinition:
	////	(type = Primitive| type = Compound)
	////	transition = TransitionDefinition
	////;
	////PrimitiveStateDefinition:
	////	object = State id = StateID 
	////;
	////
	////CompoundStateDefinition:
	////	object = State state = StateID (compoundStateDef= WithStatesDefinition)?
	////;
	////StateDefinition:
	////	object = State state = StateID (withDefinition= WithStatesDefinition)?
	////;
	////StateID:
	////	 name = ID
	////;
	//WithStatesDefinition:
	//	'with'
	//	'{'
	//	predicate=Predicate
	//	'}';
	public WithStatesDefinitionElements getWithStatesDefinitionAccess() {
		return pWithStatesDefinition;
	}
	
	public ParserRule getWithStatesDefinitionRule() {
		return getWithStatesDefinitionAccess().getRule();
	}
	
	//WithTransitionsDefinition:
	//	'with'
	//	'{'
	//	transitions=TransitionalExpression
	//	'}';
	public WithTransitionsDefinitionElements getWithTransitionsDefinitionAccess() {
		return pWithTransitionsDefinition;
	}
	
	public ParserRule getWithTransitionsDefinitionRule() {
		return getWithTransitionsDefinitionAccess().getRule();
	}
	
	////TransitionID:
	////	name = ID
	////;
	////FromFieldDefinition:
	////	from = From
	////	refSpace = [Space]
	////;
	//InputDefinition:
	//	{InputDefinition} 'input' inputState+=[StateDefinition]*;
	public InputDefinitionElements getInputDefinitionAccess() {
		return pInputDefinition;
	}
	
	public ParserRule getInputDefinitionRule() {
		return getInputDefinitionAccess().getRule();
	}
	
	//OutputDefinition:
	//	'output' outputState=[StateDefinition];
	public OutputDefinitionElements getOutputDefinitionAccess() {
		return pOutputDefinition;
	}
	
	public ParserRule getOutputDefinitionRule() {
		return getOutputDefinitionAccess().getRule();
	}
	
	////ExtendsDefinition:
	////	type = Extends
	////	namespaces += [Space]+	
	////;
	////
	////
	////Primitive:
	////	'primitive' 
	////;
	////
	////Compound:
	////	'compound'
	////;
	////
	////Field:
	////	'field'
	////;
	////
	////State:
	////	'state'
	////;
	////
	////
	////Transition:
	////	'transition'
	////;
	////
	////Definitions:
	////	'definitions'
	////;
	////
	////References:
	////	'references'
	////;
	////
	////Instances:
	////	'instances'
	////;
	////
	////Input:
	////	'input'
	////;
	////
	////Output:
	////	'output'
	////;
	////
	////From:
	////	'from'
	////;
	////
	////With:
	////	'with'
	////;
	////
	////Extends:
	////	'extends'
	////;
	////
	////NotOp:
	////	'NOT'
	////;
	////
	////AndOp:
	////	'AND'
	////;
	////
	////OrOp:
	////	'OR'
	////;
	////
	////Set:
	////	'set'
	////;
	////
	////To:
	////	'to'
	////;
	////
	////Use:
	////	'use'
	////;
	////
	////
	////Count:
	////	INT
	////;
	//Instance:
	//	'instance' (transitionDeclaration=TransitionDeclaration | stateDeclaration=StateDeclaration) name=STRING
	//	(state=StateInstance | transition=TransitionInstance);
	public InstanceElements getInstanceAccess() {
		return pInstance;
	}
	
	public ParserRule getInstanceRule() {
		return getInstanceAccess().getRule();
	}
	
	//TransitionDeclaration:
	//	'transition' transition=[TransitionID];
	public TransitionDeclarationElements getTransitionDeclarationAccess() {
		return pTransitionDeclaration;
	}
	
	public ParserRule getTransitionDeclarationRule() {
		return getTransitionDeclarationAccess().getRule();
	}
	
	//StateDeclaration:
	//	'state' state=[StateDefinition];
	public StateDeclarationElements getStateDeclarationAccess() {
		return pStateDeclaration;
	}
	
	public ParserRule getStateDeclarationRule() {
		return getStateDeclarationAccess().getRule();
	}
	
	//TransitionInstance:
	//	host=STRING
	//	port=INT
	//	path=STRING?;
	public TransitionInstanceElements getTransitionInstanceAccess() {
		return pTransitionInstance;
	}
	
	public ParserRule getTransitionInstanceRule() {
		return getTransitionInstanceAccess().getRule();
	}
	
	//StateInstance:
	//	'{'
	//	members+=(SetStatement | UseDefinition | Instance)+
	//	'}';
	public StateInstanceElements getStateInstanceAccess() {
		return pStateInstance;
	}
	
	public ParserRule getStateInstanceRule() {
		return getStateInstanceAccess().getRule();
	}
	
	//UseDefinition:
	//	'use' predefinedValue=[Instance];
	public UseDefinitionElements getUseDefinitionAccess() {
		return pUseDefinition;
	}
	
	public ParserRule getUseDefinitionRule() {
		return getUseDefinitionAccess().getRule();
	}
	
	//SetStatement:
	//	'set' variable=[StateDefinition] toDef=ToDefinition;
	public SetStatementElements getSetStatementAccess() {
		return pSetStatement;
	}
	
	public ParserRule getSetStatementRule() {
		return getSetStatementAccess().getRule();
	}
	
	//ToDefinition:
	//	'to' value=STRING;
	public ToDefinitionElements getToDefinitionAccess() {
		return pToDefinition;
	}
	
	public ParserRule getToDefinitionRule() {
		return getToDefinitionAccess().getRule();
	}
	
	////State Composition Expression Rules
	//Predicate:
	//	negation?='NOT'? expression=BinaryExpression;
	public PredicateElements getPredicateAccess() {
		return pPredicate;
	}
	
	public ParserRule getPredicateRule() {
		return getPredicateAccess().getRule();
	}
	
	//BinaryExpression:
	//	TerminalBinaryExpression ({Operation.left=current} op=('AND' | 'OR') right=TerminalBinaryExpression)*;
	public BinaryExpressionElements getBinaryExpressionAccess() {
		return pBinaryExpression;
	}
	
	public ParserRule getBinaryExpressionRule() {
		return getBinaryExpressionAccess().getRule();
	}
	
	//TerminalBinaryExpression BinaryExpression:
	//	'(' Predicate ')' | {StateDefinition} instance=[StateDefinition] | {StateDefinition} (list?='setOf'
	//	value=[StateDefinition]);
	public TerminalBinaryExpressionElements getTerminalBinaryExpressionAccess() {
		return pTerminalBinaryExpression;
	}
	
	public ParserRule getTerminalBinaryExpressionRule() {
		return getTerminalBinaryExpressionAccess().getRule();
	}
	
	////Transition Composition Expression Rules
	//TransitionalExpression:
	//	TerminalTransitionalExpression ({Operation.left=current} op='THEN' right=TerminalTransitionalExpression)*;
	public TransitionalExpressionElements getTransitionalExpressionAccess() {
		return pTransitionalExpression;
	}
	
	public ParserRule getTransitionalExpressionRule() {
		return getTransitionalExpressionAccess().getRule();
	}
	
	//TerminalTransitionalExpression TransitionalExpression:
	//	'(' TransitionalExpression ')' | {TransitionID} value=[TransitionID];
	public TerminalTransitionalExpressionElements getTerminalTransitionalExpressionAccess() {
		return pTerminalTransitionalExpression;
	}
	
	public ParserRule getTerminalTransitionalExpressionRule() {
		return getTerminalTransitionalExpressionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
