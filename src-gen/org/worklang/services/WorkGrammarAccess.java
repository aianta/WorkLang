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
		//	fields+=FieldDefinition*;
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
		private final CrossReference cForeignTransitionTransitionDefinitionCrossReference_1_0 = (CrossReference)cForeignTransitionAssignment_1.eContents().get(0);
		private final RuleCall cForeignTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cForeignTransitionTransitionDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFieldFieldDefinitionCrossReference_3_0 = (CrossReference)cFieldAssignment_3.eContents().get(0);
		private final RuleCall cFieldFieldDefinitionIDTerminalRuleCall_3_0_1 = (RuleCall)cFieldFieldDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cLocalTransitionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cLocalTransitionTransitionDefinitionCrossReference_5_0 = (CrossReference)cLocalTransitionAssignment_5.eContents().get(0);
		private final RuleCall cLocalTransitionTransitionDefinitionIDTerminalRuleCall_5_0_1 = (RuleCall)cLocalTransitionTransitionDefinitionCrossReference_5_0.eContents().get(1);
		
		//TransitionMapping:
		//	'transition' foreignTransition=[TransitionDefinition] 'from' field=[FieldDefinition] 'to'
		//	localTransition=[TransitionDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//'transition' foreignTransition=[TransitionDefinition] 'from' field=[FieldDefinition] 'to'
		//localTransition=[TransitionDefinition]
		public Group getGroup() { return cGroup; }
		
		//'transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//foreignTransition=[TransitionDefinition]
		public Assignment getForeignTransitionAssignment_1() { return cForeignTransitionAssignment_1; }
		
		//[TransitionDefinition]
		public CrossReference getForeignTransitionTransitionDefinitionCrossReference_1_0() { return cForeignTransitionTransitionDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getForeignTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1() { return cForeignTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1; }
		
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
		
		//localTransition=[TransitionDefinition]
		public Assignment getLocalTransitionAssignment_5() { return cLocalTransitionAssignment_5; }
		
		//[TransitionDefinition]
		public CrossReference getLocalTransitionTransitionDefinitionCrossReference_5_0() { return cLocalTransitionTransitionDefinitionCrossReference_5_0; }
		
		//ID
		public RuleCall getLocalTransitionTransitionDefinitionIDTerminalRuleCall_5_0_1() { return cLocalTransitionTransitionDefinitionIDTerminalRuleCall_5_0_1; }
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
		private final RuleCall cCompositionTransitionCompositionParserRuleCall_5_0 = (RuleCall)cCompositionAssignment_5.eContents().get(0);
		
		//CompoundTransitionDefinition:
		//	type='compound'
		//	'transition'
		//	name=ID
		//	in=InputDefinition?
		//	out=OutputDefinition
		//	composition=TransitionComposition;
		@Override public ParserRule getRule() { return rule; }
		
		//type='compound' 'transition' name=ID in=InputDefinition? out=OutputDefinition composition=TransitionComposition
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
		
		//composition=TransitionComposition
		public Assignment getCompositionAssignment_5() { return cCompositionAssignment_5; }
		
		//TransitionComposition
		public RuleCall getCompositionTransitionCompositionParserRuleCall_5_0() { return cCompositionTransitionCompositionParserRuleCall_5_0; }
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
	public class InputDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.InputDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInputDefinitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cINPUTKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInputStateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cInputStateStateDefinitionCrossReference_2_0 = (CrossReference)cInputStateAssignment_2.eContents().get(0);
		private final RuleCall cInputStateStateDefinitionIDTerminalRuleCall_2_0_1 = (RuleCall)cInputStateStateDefinitionCrossReference_2_0.eContents().get(1);
		
		//InputDefinition:
		//	{InputDefinition} 'INPUT' inputState+=[StateDefinition]*;
		@Override public ParserRule getRule() { return rule; }
		
		//{InputDefinition} 'INPUT' inputState+=[StateDefinition]*
		public Group getGroup() { return cGroup; }
		
		//{InputDefinition}
		public Action getInputDefinitionAction_0() { return cInputDefinitionAction_0; }
		
		//'INPUT'
		public Keyword getINPUTKeyword_1() { return cINPUTKeyword_1; }
		
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
		private final Keyword cOUTPUTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOutputStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cOutputStateStateDefinitionCrossReference_1_0 = (CrossReference)cOutputStateAssignment_1.eContents().get(0);
		private final RuleCall cOutputStateStateDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cOutputStateStateDefinitionCrossReference_1_0.eContents().get(1);
		
		//OutputDefinition:
		//	'OUTPUT' outputState=[StateDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//'OUTPUT' outputState=[StateDefinition]
		public Group getGroup() { return cGroup; }
		
		//'OUTPUT'
		public Keyword getOUTPUTKeyword_0() { return cOUTPUTKeyword_0; }
		
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
		private final Assignment cIsCollectionElementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cIsCollectionElementCollectionElementKeyword_2_0 = (Keyword)cIsCollectionElementAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_3_0_0 = (RuleCall)cNameAssignment_3_0.eContents().get(0);
		private final Assignment cNameAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cNameCOLLECTION_ELEMENT_NAMETerminalRuleCall_3_1_0 = (RuleCall)cNameAssignment_3_1.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cStateAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cStateStateInstanceParserRuleCall_4_0_0 = (RuleCall)cStateAssignment_4_0.eContents().get(0);
		private final Assignment cTransitionAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cTransitionTransitionInstanceParserRuleCall_4_1_0 = (RuleCall)cTransitionAssignment_4_1.eContents().get(0);
		private final Assignment cCompoundTransitionAssignment_4_2 = (Assignment)cAlternatives_4.eContents().get(2);
		private final RuleCall cCompoundTransitionCompoundTransitionInstanceParserRuleCall_4_2_0 = (RuleCall)cCompoundTransitionAssignment_4_2.eContents().get(0);
		private final Assignment cCollectionAssignment_4_3 = (Assignment)cAlternatives_4.eContents().get(3);
		private final RuleCall cCollectionCollectionInstanceParserRuleCall_4_3_0 = (RuleCall)cCollectionAssignment_4_3.eContents().get(0);
		
		//Instance:
		//	'instance' (transitionDeclaration=TransitionDeclaration | stateDeclaration=StateDeclaration)
		//	isCollectionElement?='collectionElement'? (name=STRING | name=COLLECTION_ELEMENT_NAME) (state=StateInstance |
		//	transition=TransitionInstance | compoundTransition=CompoundTransitionInstance | collection=CollectionInstance);
		@Override public ParserRule getRule() { return rule; }
		
		//'instance' (transitionDeclaration=TransitionDeclaration | stateDeclaration=StateDeclaration)
		//isCollectionElement?='collectionElement'? (name=STRING | name=COLLECTION_ELEMENT_NAME) (state=StateInstance |
		//transition=TransitionInstance | compoundTransition=CompoundTransitionInstance | collection=CollectionInstance)
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
		
		//isCollectionElement?='collectionElement'?
		public Assignment getIsCollectionElementAssignment_2() { return cIsCollectionElementAssignment_2; }
		
		//'collectionElement'
		public Keyword getIsCollectionElementCollectionElementKeyword_2_0() { return cIsCollectionElementCollectionElementKeyword_2_0; }
		
		//(name=STRING | name=COLLECTION_ELEMENT_NAME)
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//name=STRING
		public Assignment getNameAssignment_3_0() { return cNameAssignment_3_0; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_3_0_0() { return cNameSTRINGTerminalRuleCall_3_0_0; }
		
		//name=COLLECTION_ELEMENT_NAME
		public Assignment getNameAssignment_3_1() { return cNameAssignment_3_1; }
		
		//COLLECTION_ELEMENT_NAME
		public RuleCall getNameCOLLECTION_ELEMENT_NAMETerminalRuleCall_3_1_0() { return cNameCOLLECTION_ELEMENT_NAMETerminalRuleCall_3_1_0; }
		
		//(state=StateInstance | transition=TransitionInstance | compoundTransition=CompoundTransitionInstance |
		//collection=CollectionInstance)
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//state=StateInstance
		public Assignment getStateAssignment_4_0() { return cStateAssignment_4_0; }
		
		//StateInstance
		public RuleCall getStateStateInstanceParserRuleCall_4_0_0() { return cStateStateInstanceParserRuleCall_4_0_0; }
		
		//transition=TransitionInstance
		public Assignment getTransitionAssignment_4_1() { return cTransitionAssignment_4_1; }
		
		//TransitionInstance
		public RuleCall getTransitionTransitionInstanceParserRuleCall_4_1_0() { return cTransitionTransitionInstanceParserRuleCall_4_1_0; }
		
		//compoundTransition=CompoundTransitionInstance
		public Assignment getCompoundTransitionAssignment_4_2() { return cCompoundTransitionAssignment_4_2; }
		
		//CompoundTransitionInstance
		public RuleCall getCompoundTransitionCompoundTransitionInstanceParserRuleCall_4_2_0() { return cCompoundTransitionCompoundTransitionInstanceParserRuleCall_4_2_0; }
		
		//collection=CollectionInstance
		public Assignment getCollectionAssignment_4_3() { return cCollectionAssignment_4_3; }
		
		//CollectionInstance
		public RuleCall getCollectionCollectionInstanceParserRuleCall_4_3_0() { return cCollectionCollectionInstanceParserRuleCall_4_3_0; }
	}
	public class TransitionDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TransitionDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTransitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTransitionTransitionDefinitionCrossReference_1_0 = (CrossReference)cTransitionAssignment_1.eContents().get(0);
		private final RuleCall cTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cTransitionTransitionDefinitionCrossReference_1_0.eContents().get(1);
		
		//TransitionDeclaration:
		//	'transition' transition=[TransitionDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//'transition' transition=[TransitionDefinition]
		public Group getGroup() { return cGroup; }
		
		//'transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//transition=[TransitionDefinition]
		public Assignment getTransitionAssignment_1() { return cTransitionAssignment_1; }
		
		//[TransitionDefinition]
		public CrossReference getTransitionTransitionDefinitionCrossReference_1_0() { return cTransitionTransitionDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1() { return cTransitionTransitionDefinitionIDTerminalRuleCall_1_0_1; }
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
		private final Assignment cSupportCollectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cSupportCollectionsHasCollectionSupportKeyword_3_0 = (Keyword)cSupportCollectionsAssignment_3.eContents().get(0);
		private final Assignment cBlindAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Keyword cBlindBlindKeyword_4_0 = (Keyword)cBlindAssignment_4.eContents().get(0);
		
		//TransitionInstance:
		//	host=STRING
		//	port=INT?
		//	path=STRING?
		//	supportCollections?='hasCollectionSupport'?
		//	blind?='blind'?;
		@Override public ParserRule getRule() { return rule; }
		
		//host=STRING port=INT? path=STRING? supportCollections?='hasCollectionSupport'? blind?='blind'?
		public Group getGroup() { return cGroup; }
		
		//host=STRING
		public Assignment getHostAssignment_0() { return cHostAssignment_0; }
		
		//STRING
		public RuleCall getHostSTRINGTerminalRuleCall_0_0() { return cHostSTRINGTerminalRuleCall_0_0; }
		
		//port=INT?
		public Assignment getPortAssignment_1() { return cPortAssignment_1; }
		
		//INT
		public RuleCall getPortINTTerminalRuleCall_1_0() { return cPortINTTerminalRuleCall_1_0; }
		
		//path=STRING?
		public Assignment getPathAssignment_2() { return cPathAssignment_2; }
		
		//STRING
		public RuleCall getPathSTRINGTerminalRuleCall_2_0() { return cPathSTRINGTerminalRuleCall_2_0; }
		
		//supportCollections?='hasCollectionSupport'?
		public Assignment getSupportCollectionsAssignment_3() { return cSupportCollectionsAssignment_3; }
		
		//'hasCollectionSupport'
		public Keyword getSupportCollectionsHasCollectionSupportKeyword_3_0() { return cSupportCollectionsHasCollectionSupportKeyword_3_0; }
		
		//blind?='blind'?
		public Assignment getBlindAssignment_4() { return cBlindAssignment_4; }
		
		//'blind'
		public Keyword getBlindBlindKeyword_4_0() { return cBlindBlindKeyword_4_0; }
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
	public class CollectionInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.CollectionInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCollectionInstanceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cElementsInstanceCrossReference_2_0 = (CrossReference)cElementsAssignment_2.eContents().get(0);
		private final RuleCall cElementsInstanceCOLLECTION_ELEMENT_NAMETerminalRuleCall_2_0_1 = (RuleCall)cElementsInstanceCrossReference_2_0.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//CollectionInstance:
		//	{CollectionInstance} '['
		//	elements+=[Instance|COLLECTION_ELEMENT_NAME]*
		//	']';
		@Override public ParserRule getRule() { return rule; }
		
		//{CollectionInstance} '[' elements+=[Instance|COLLECTION_ELEMENT_NAME]* ']'
		public Group getGroup() { return cGroup; }
		
		//{CollectionInstance}
		public Action getCollectionInstanceAction_0() { return cCollectionInstanceAction_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//elements+=[Instance|COLLECTION_ELEMENT_NAME]*
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }
		
		//[Instance|COLLECTION_ELEMENT_NAME]
		public CrossReference getElementsInstanceCrossReference_2_0() { return cElementsInstanceCrossReference_2_0; }
		
		//COLLECTION_ELEMENT_NAME
		public RuleCall getElementsInstanceCOLLECTION_ELEMENT_NAMETerminalRuleCall_2_0_1() { return cElementsInstanceCOLLECTION_ELEMENT_NAMETerminalRuleCall_2_0_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class UseDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.UseDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cUseKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cPredefinedValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cPredefinedValueInstanceCrossReference_0_1_0 = (CrossReference)cPredefinedValueAssignment_0_1.eContents().get(0);
		private final RuleCall cPredefinedValueInstanceSTRINGTerminalRuleCall_0_1_0_1 = (RuleCall)cPredefinedValueInstanceCrossReference_0_1_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cUseKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cPredefinedValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cPredefinedValueInstanceCrossReference_1_1_0 = (CrossReference)cPredefinedValueAssignment_1_1.eContents().get(0);
		private final RuleCall cPredefinedValueInstanceCOLLECTION_ELEMENT_NAMETerminalRuleCall_1_1_0_1 = (RuleCall)cPredefinedValueInstanceCrossReference_1_1_0.eContents().get(1);
		
		//UseDefinition:
		//	'use' predefinedValue=[Instance|STRING] | 'use' predefinedValue=[Instance|COLLECTION_ELEMENT_NAME];
		@Override public ParserRule getRule() { return rule; }
		
		//'use' predefinedValue=[Instance|STRING] | 'use' predefinedValue=[Instance|COLLECTION_ELEMENT_NAME]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'use' predefinedValue=[Instance|STRING]
		public Group getGroup_0() { return cGroup_0; }
		
		//'use'
		public Keyword getUseKeyword_0_0() { return cUseKeyword_0_0; }
		
		//predefinedValue=[Instance|STRING]
		public Assignment getPredefinedValueAssignment_0_1() { return cPredefinedValueAssignment_0_1; }
		
		//[Instance|STRING]
		public CrossReference getPredefinedValueInstanceCrossReference_0_1_0() { return cPredefinedValueInstanceCrossReference_0_1_0; }
		
		//STRING
		public RuleCall getPredefinedValueInstanceSTRINGTerminalRuleCall_0_1_0_1() { return cPredefinedValueInstanceSTRINGTerminalRuleCall_0_1_0_1; }
		
		//'use' predefinedValue=[Instance|COLLECTION_ELEMENT_NAME]
		public Group getGroup_1() { return cGroup_1; }
		
		//'use'
		public Keyword getUseKeyword_1_0() { return cUseKeyword_1_0; }
		
		//predefinedValue=[Instance|COLLECTION_ELEMENT_NAME]
		public Assignment getPredefinedValueAssignment_1_1() { return cPredefinedValueAssignment_1_1; }
		
		//[Instance|COLLECTION_ELEMENT_NAME]
		public CrossReference getPredefinedValueInstanceCrossReference_1_1_0() { return cPredefinedValueInstanceCrossReference_1_1_0; }
		
		//COLLECTION_ELEMENT_NAME
		public RuleCall getPredefinedValueInstanceCOLLECTION_ELEMENT_NAMETerminalRuleCall_1_1_0_1() { return cPredefinedValueInstanceCOLLECTION_ELEMENT_NAMETerminalRuleCall_1_1_0_1; }
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
		private final Keyword cListCollectionOfKeyword_2_1_0_0 = (Keyword)cListAssignment_2_1_0.eContents().get(0);
		private final Assignment cInstanceAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final CrossReference cInstanceStateDefinitionCrossReference_2_1_1_0 = (CrossReference)cInstanceAssignment_2_1_1.eContents().get(0);
		private final RuleCall cInstanceStateDefinitionIDTerminalRuleCall_2_1_1_0_1 = (RuleCall)cInstanceStateDefinitionCrossReference_2_1_1_0.eContents().get(1);
		
		//TerminalBinaryExpression BinaryExpression:
		//	'(' Predicate ')' | {StateDefinition} instance=[StateDefinition] | {StateDefinition} (list?='collectionOf'
		//	instance=[StateDefinition]);
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Predicate ')' | {StateDefinition} instance=[StateDefinition] | {StateDefinition} (list?='collectionOf'
		//instance=[StateDefinition])
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
		
		//{StateDefinition} (list?='collectionOf' instance=[StateDefinition])
		public Group getGroup_2() { return cGroup_2; }
		
		//{StateDefinition}
		public Action getStateDefinitionAction_2_0() { return cStateDefinitionAction_2_0; }
		
		//(list?='collectionOf' instance=[StateDefinition])
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//list?='collectionOf'
		public Assignment getListAssignment_2_1_0() { return cListAssignment_2_1_0; }
		
		//'collectionOf'
		public Keyword getListCollectionOfKeyword_2_1_0_0() { return cListCollectionOfKeyword_2_1_0_0; }
		
		//instance=[StateDefinition]
		public Assignment getInstanceAssignment_2_1_1() { return cInstanceAssignment_2_1_1; }
		
		//[StateDefinition]
		public CrossReference getInstanceStateDefinitionCrossReference_2_1_1_0() { return cInstanceStateDefinitionCrossReference_2_1_1_0; }
		
		//ID
		public RuleCall getInstanceStateDefinitionIDTerminalRuleCall_2_1_1_0_1() { return cInstanceStateDefinitionIDTerminalRuleCall_2_1_1_0_1; }
	}
	public class TransitionCompositionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TransitionComposition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyTransitionCompositionBodyParserRuleCall_1_0 = (RuleCall)cBodyAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//TransitionComposition:
		//	'{'
		//	body=TransitionCompositionBody
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' body=TransitionCompositionBody '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//body=TransitionCompositionBody
		public Assignment getBodyAssignment_1() { return cBodyAssignment_1; }
		
		//TransitionCompositionBody
		public RuleCall getBodyTransitionCompositionBodyParserRuleCall_1_0() { return cBodyTransitionCompositionBodyParserRuleCall_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class TransitionCompositionBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TransitionCompositionBody");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSTARTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cWITHKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cStartingInputsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final CrossReference cStartingInputsStateDefinitionCrossReference_1_2_0 = (CrossReference)cStartingInputsAssignment_1_2.eContents().get(0);
		private final RuleCall cStartingInputsStateDefinitionIDTerminalRuleCall_1_2_0_1 = (RuleCall)cStartingInputsStateDefinitionCrossReference_1_2_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionInstructionExpressionParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//TransitionCompositionBody:
		//	'START' ('WITH' '(' startingInputs+=[StateDefinition]+ ')')?
		//	'{'
		//	expression=InstructionExpression
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'START' ('WITH' '(' startingInputs+=[StateDefinition]+ ')')? '{' expression=InstructionExpression '}'
		public Group getGroup() { return cGroup; }
		
		//'START'
		public Keyword getSTARTKeyword_0() { return cSTARTKeyword_0; }
		
		//('WITH' '(' startingInputs+=[StateDefinition]+ ')')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'WITH'
		public Keyword getWITHKeyword_1_0() { return cWITHKeyword_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }
		
		//startingInputs+=[StateDefinition]+
		public Assignment getStartingInputsAssignment_1_2() { return cStartingInputsAssignment_1_2; }
		
		//[StateDefinition]
		public CrossReference getStartingInputsStateDefinitionCrossReference_1_2_0() { return cStartingInputsStateDefinitionCrossReference_1_2_0; }
		
		//ID
		public RuleCall getStartingInputsStateDefinitionIDTerminalRuleCall_1_2_0_1() { return cStartingInputsStateDefinitionIDTerminalRuleCall_1_2_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//expression=InstructionExpression
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }
		
		//InstructionExpression
		public RuleCall getExpressionInstructionExpressionParserRuleCall_3_0() { return cExpressionInstructionExpressionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class InstructionExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.InstructionExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTerminalInstructionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cExecutionResultComputeFirstAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cComputeNextAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cComputeNextTerminalInstructionParserRuleCall_1_1_0 = (RuleCall)cComputeNextAssignment_1_1.eContents().get(0);
		
		//InstructionExpression:
		//	TerminalInstruction ({ExecutionResult.computeFirst=current} computeNext=TerminalInstruction)*;
		@Override public ParserRule getRule() { return rule; }
		
		//TerminalInstruction ({ExecutionResult.computeFirst=current} computeNext=TerminalInstruction)*
		public Group getGroup() { return cGroup; }
		
		//TerminalInstruction
		public RuleCall getTerminalInstructionParserRuleCall_0() { return cTerminalInstructionParserRuleCall_0; }
		
		//({ExecutionResult.computeFirst=current} computeNext=TerminalInstruction)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ExecutionResult.computeFirst=current}
		public Action getExecutionResultComputeFirstAction_1_0() { return cExecutionResultComputeFirstAction_1_0; }
		
		//computeNext=TerminalInstruction
		public Assignment getComputeNextAssignment_1_1() { return cComputeNextAssignment_1_1; }
		
		//TerminalInstruction
		public RuleCall getComputeNextTerminalInstructionParserRuleCall_1_1_0() { return cComputeNextTerminalInstructionParserRuleCall_1_1_0; }
	}
	public class TerminalInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TerminalInstruction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIfInstructionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWhileInstructionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSimpleInstructionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//TerminalInstruction InstructionExpression:
		//	IfInstruction | WhileInstruction | SimpleInstruction |
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//IfInstruction | WhileInstruction | SimpleInstruction | ';'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//IfInstruction
		public RuleCall getIfInstructionParserRuleCall_0() { return cIfInstructionParserRuleCall_0; }
		
		//WhileInstruction
		public RuleCall getWhileInstructionParserRuleCall_1() { return cWhileInstructionParserRuleCall_1; }
		
		//SimpleInstruction
		public RuleCall getSimpleInstructionParserRuleCall_2() { return cSimpleInstructionParserRuleCall_2; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class IfInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.IfInstruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIFKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTestKeyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTestKeyResolvableValueParserRuleCall_2_0 = (RuleCall)cTestKeyAssignment_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTestValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTestValueTestValueParserRuleCall_4_0 = (RuleCall)cTestValueAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cToComputeIfTrueAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cToComputeIfTrueInstructionExpressionParserRuleCall_7_0 = (RuleCall)cToComputeIfTrueAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cELSEKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cToComputeIfFalseAssignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final RuleCall cToComputeIfFalseInstructionExpressionParserRuleCall_9_2_0 = (RuleCall)cToComputeIfFalseAssignment_9_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		
		//IfInstruction:
		//	'IF' '(' testKey=ResolvableValue '=' testValue=TestValue ')'
		//	'{'
		//	toComputeIfTrue=InstructionExpression
		//	'}' ('ELSE' '{'
		//	toComputeIfFalse=InstructionExpression
		//	'}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'IF' '(' testKey=ResolvableValue '=' testValue=TestValue ')' '{' toComputeIfTrue=InstructionExpression '}' ('ELSE' '{'
		//toComputeIfFalse=InstructionExpression '}')?
		public Group getGroup() { return cGroup; }
		
		//'IF'
		public Keyword getIFKeyword_0() { return cIFKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//testKey=ResolvableValue
		public Assignment getTestKeyAssignment_2() { return cTestKeyAssignment_2; }
		
		//ResolvableValue
		public RuleCall getTestKeyResolvableValueParserRuleCall_2_0() { return cTestKeyResolvableValueParserRuleCall_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//testValue=TestValue
		public Assignment getTestValueAssignment_4() { return cTestValueAssignment_4; }
		
		//TestValue
		public RuleCall getTestValueTestValueParserRuleCall_4_0() { return cTestValueTestValueParserRuleCall_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//toComputeIfTrue=InstructionExpression
		public Assignment getToComputeIfTrueAssignment_7() { return cToComputeIfTrueAssignment_7; }
		
		//InstructionExpression
		public RuleCall getToComputeIfTrueInstructionExpressionParserRuleCall_7_0() { return cToComputeIfTrueInstructionExpressionParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
		
		//('ELSE' '{' toComputeIfFalse=InstructionExpression '}')?
		public Group getGroup_9() { return cGroup_9; }
		
		//'ELSE'
		public Keyword getELSEKeyword_9_0() { return cELSEKeyword_9_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_9_1() { return cLeftCurlyBracketKeyword_9_1; }
		
		//toComputeIfFalse=InstructionExpression
		public Assignment getToComputeIfFalseAssignment_9_2() { return cToComputeIfFalseAssignment_9_2; }
		
		//InstructionExpression
		public RuleCall getToComputeIfFalseInstructionExpressionParserRuleCall_9_2_0() { return cToComputeIfFalseInstructionExpressionParserRuleCall_9_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9_3() { return cRightCurlyBracketKeyword_9_3; }
	}
	public class WhileInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.WhileInstruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWHILEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTestKeyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTestKeyResolvableValueParserRuleCall_2_0 = (RuleCall)cTestKeyAssignment_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTestValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTestValueTestValueParserRuleCall_4_0 = (RuleCall)cTestValueAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cToComputeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cToComputeInstructionExpressionParserRuleCall_7_0 = (RuleCall)cToComputeAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//WhileInstruction:
		//	'WHILE' '(' testKey=ResolvableValue '=' testValue=TestValue ')'
		//	'{'
		//	toCompute=InstructionExpression
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'WHILE' '(' testKey=ResolvableValue '=' testValue=TestValue ')' '{' toCompute=InstructionExpression '}'
		public Group getGroup() { return cGroup; }
		
		//'WHILE'
		public Keyword getWHILEKeyword_0() { return cWHILEKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//testKey=ResolvableValue
		public Assignment getTestKeyAssignment_2() { return cTestKeyAssignment_2; }
		
		//ResolvableValue
		public RuleCall getTestKeyResolvableValueParserRuleCall_2_0() { return cTestKeyResolvableValueParserRuleCall_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//testValue=TestValue
		public Assignment getTestValueAssignment_4() { return cTestValueAssignment_4; }
		
		//TestValue
		public RuleCall getTestValueTestValueParserRuleCall_4_0() { return cTestValueTestValueParserRuleCall_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//toCompute=InstructionExpression
		public Assignment getToComputeAssignment_7() { return cToComputeAssignment_7; }
		
		//InstructionExpression
		public RuleCall getToComputeInstructionExpressionParserRuleCall_7_0() { return cToComputeInstructionExpressionParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class SimpleInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.SimpleInstruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTHENKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cToExecuteAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cToExecuteTransitionDefinitionCrossReference_1_0 = (CrossReference)cToExecuteAssignment_1.eContents().get(0);
		private final RuleCall cToExecuteTransitionDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cToExecuteTransitionDefinitionCrossReference_1_0.eContents().get(1);
		
		//SimpleInstruction:
		//	'THEN' toExecute+=[TransitionDefinition]+;
		@Override public ParserRule getRule() { return rule; }
		
		//'THEN' toExecute+=[TransitionDefinition]+
		public Group getGroup() { return cGroup; }
		
		//'THEN'
		public Keyword getTHENKeyword_0() { return cTHENKeyword_0; }
		
		//toExecute+=[TransitionDefinition]+
		public Assignment getToExecuteAssignment_1() { return cToExecuteAssignment_1; }
		
		//[TransitionDefinition]
		public CrossReference getToExecuteTransitionDefinitionCrossReference_1_0() { return cToExecuteTransitionDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getToExecuteTransitionDefinitionIDTerminalRuleCall_1_0_1() { return cToExecuteTransitionDefinitionIDTerminalRuleCall_1_0_1; }
	}
	public class CompoundTransitionInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.CompoundTransitionInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyCompoundTransitionInstanceBodyParserRuleCall_1_0 = (RuleCall)cBodyAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//CompoundTransitionInstance:
		//	'{'
		//	body=CompoundTransitionInstanceBody
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' body=CompoundTransitionInstanceBody '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//body=CompoundTransitionInstanceBody
		public Assignment getBodyAssignment_1() { return cBodyAssignment_1; }
		
		//CompoundTransitionInstanceBody
		public RuleCall getBodyCompoundTransitionInstanceBodyParserRuleCall_1_0() { return cBodyCompoundTransitionInstanceBodyParserRuleCall_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class CompoundTransitionInstanceBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.CompoundTransitionInstanceBody");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSTARTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cWITHKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cStartingInputsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final CrossReference cStartingInputsInstanceCrossReference_1_2_0 = (CrossReference)cStartingInputsAssignment_1_2.eContents().get(0);
		private final RuleCall cStartingInputsInstanceIDTerminalRuleCall_1_2_0_1 = (RuleCall)cStartingInputsInstanceCrossReference_1_2_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionInstanceInstructionExpressionParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CompoundTransitionInstanceBody:
		//	'START' ('WITH' '(' startingInputs+=[Instance]+ ')')?
		//	'{'
		//	expression=InstanceInstructionExpression
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'START' ('WITH' '(' startingInputs+=[Instance]+ ')')? '{' expression=InstanceInstructionExpression '}'
		public Group getGroup() { return cGroup; }
		
		//'START'
		public Keyword getSTARTKeyword_0() { return cSTARTKeyword_0; }
		
		//('WITH' '(' startingInputs+=[Instance]+ ')')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'WITH'
		public Keyword getWITHKeyword_1_0() { return cWITHKeyword_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }
		
		//startingInputs+=[Instance]+
		public Assignment getStartingInputsAssignment_1_2() { return cStartingInputsAssignment_1_2; }
		
		//[Instance]
		public CrossReference getStartingInputsInstanceCrossReference_1_2_0() { return cStartingInputsInstanceCrossReference_1_2_0; }
		
		//ID
		public RuleCall getStartingInputsInstanceIDTerminalRuleCall_1_2_0_1() { return cStartingInputsInstanceIDTerminalRuleCall_1_2_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//expression=InstanceInstructionExpression
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }
		
		//InstanceInstructionExpression
		public RuleCall getExpressionInstanceInstructionExpressionParserRuleCall_3_0() { return cExpressionInstanceInstructionExpressionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class InstanceInstructionExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.InstanceInstructionExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTerminalInstanceInstructionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cExecutionResultComputeFirstAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cComputeNextAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cComputeNextTerminalInstanceInstructionParserRuleCall_1_1_0 = (RuleCall)cComputeNextAssignment_1_1.eContents().get(0);
		
		//InstanceInstructionExpression:
		//	TerminalInstanceInstruction ({ExecutionResult.computeFirst=current} computeNext=TerminalInstanceInstruction)*;
		@Override public ParserRule getRule() { return rule; }
		
		//TerminalInstanceInstruction ({ExecutionResult.computeFirst=current} computeNext=TerminalInstanceInstruction)*
		public Group getGroup() { return cGroup; }
		
		//TerminalInstanceInstruction
		public RuleCall getTerminalInstanceInstructionParserRuleCall_0() { return cTerminalInstanceInstructionParserRuleCall_0; }
		
		//({ExecutionResult.computeFirst=current} computeNext=TerminalInstanceInstruction)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ExecutionResult.computeFirst=current}
		public Action getExecutionResultComputeFirstAction_1_0() { return cExecutionResultComputeFirstAction_1_0; }
		
		//computeNext=TerminalInstanceInstruction
		public Assignment getComputeNextAssignment_1_1() { return cComputeNextAssignment_1_1; }
		
		//TerminalInstanceInstruction
		public RuleCall getComputeNextTerminalInstanceInstructionParserRuleCall_1_1_0() { return cComputeNextTerminalInstanceInstructionParserRuleCall_1_1_0; }
	}
	public class TerminalInstanceInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TerminalInstanceInstruction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIfInstanceInstructionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWhileInstanceInstructionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSimpleInstanceInstructionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//TerminalInstanceInstruction InstanceInstructionExpression:
		//	IfInstanceInstruction | WhileInstanceInstruction | SimpleInstanceInstruction |
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		////'('InstructionExpression')' |
		//IfInstanceInstruction | WhileInstanceInstruction | SimpleInstanceInstruction | ';'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		////'('InstructionExpression')' |
		//IfInstanceInstruction
		public RuleCall getIfInstanceInstructionParserRuleCall_0() { return cIfInstanceInstructionParserRuleCall_0; }
		
		//WhileInstanceInstruction
		public RuleCall getWhileInstanceInstructionParserRuleCall_1() { return cWhileInstanceInstructionParserRuleCall_1; }
		
		//SimpleInstanceInstruction
		public RuleCall getSimpleInstanceInstructionParserRuleCall_2() { return cSimpleInstanceInstructionParserRuleCall_2; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class SimpleInstanceInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.SimpleInstanceInstruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTHENKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cToExecuteAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cToExecuteInstanceCrossReference_1_0 = (CrossReference)cToExecuteAssignment_1.eContents().get(0);
		private final RuleCall cToExecuteInstanceSTRINGTerminalRuleCall_1_0_1 = (RuleCall)cToExecuteInstanceCrossReference_1_0.eContents().get(1);
		
		//SimpleInstanceInstruction:
		//	'THEN' toExecute+=[Instance|STRING]+;
		@Override public ParserRule getRule() { return rule; }
		
		//'THEN' toExecute+=[Instance|STRING]+
		public Group getGroup() { return cGroup; }
		
		//'THEN'
		public Keyword getTHENKeyword_0() { return cTHENKeyword_0; }
		
		//toExecute+=[Instance|STRING]+
		public Assignment getToExecuteAssignment_1() { return cToExecuteAssignment_1; }
		
		//[Instance|STRING]
		public CrossReference getToExecuteInstanceCrossReference_1_0() { return cToExecuteInstanceCrossReference_1_0; }
		
		//STRING
		public RuleCall getToExecuteInstanceSTRINGTerminalRuleCall_1_0_1() { return cToExecuteInstanceSTRINGTerminalRuleCall_1_0_1; }
	}
	public class IfInstanceInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.IfInstanceInstruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIFKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTestKeyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTestKeyResolvableValueParserRuleCall_2_0 = (RuleCall)cTestKeyAssignment_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTestValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTestValueTestValueParserRuleCall_4_0 = (RuleCall)cTestValueAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cToComputeIfTrueAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cToComputeIfTrueInstanceInstructionExpressionParserRuleCall_7_0 = (RuleCall)cToComputeIfTrueAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cELSEKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cToComputeIfFalseAssignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final RuleCall cToComputeIfFalseInstanceInstructionExpressionParserRuleCall_9_2_0 = (RuleCall)cToComputeIfFalseAssignment_9_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		
		//IfInstanceInstruction:
		//	'IF' '(' testKey=ResolvableValue '=' testValue=TestValue ')'
		//	'{'
		//	toComputeIfTrue=InstanceInstructionExpression
		//	'}' ('ELSE' '{'
		//	toComputeIfFalse=InstanceInstructionExpression
		//	'}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'IF' '(' testKey=ResolvableValue '=' testValue=TestValue ')' '{' toComputeIfTrue=InstanceInstructionExpression '}'
		//('ELSE' '{' toComputeIfFalse=InstanceInstructionExpression '}')?
		public Group getGroup() { return cGroup; }
		
		//'IF'
		public Keyword getIFKeyword_0() { return cIFKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//testKey=ResolvableValue
		public Assignment getTestKeyAssignment_2() { return cTestKeyAssignment_2; }
		
		//ResolvableValue
		public RuleCall getTestKeyResolvableValueParserRuleCall_2_0() { return cTestKeyResolvableValueParserRuleCall_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//testValue=TestValue
		public Assignment getTestValueAssignment_4() { return cTestValueAssignment_4; }
		
		//TestValue
		public RuleCall getTestValueTestValueParserRuleCall_4_0() { return cTestValueTestValueParserRuleCall_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//toComputeIfTrue=InstanceInstructionExpression
		public Assignment getToComputeIfTrueAssignment_7() { return cToComputeIfTrueAssignment_7; }
		
		//InstanceInstructionExpression
		public RuleCall getToComputeIfTrueInstanceInstructionExpressionParserRuleCall_7_0() { return cToComputeIfTrueInstanceInstructionExpressionParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
		
		//('ELSE' '{' toComputeIfFalse=InstanceInstructionExpression '}')?
		public Group getGroup_9() { return cGroup_9; }
		
		//'ELSE'
		public Keyword getELSEKeyword_9_0() { return cELSEKeyword_9_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_9_1() { return cLeftCurlyBracketKeyword_9_1; }
		
		//toComputeIfFalse=InstanceInstructionExpression
		public Assignment getToComputeIfFalseAssignment_9_2() { return cToComputeIfFalseAssignment_9_2; }
		
		//InstanceInstructionExpression
		public RuleCall getToComputeIfFalseInstanceInstructionExpressionParserRuleCall_9_2_0() { return cToComputeIfFalseInstanceInstructionExpressionParserRuleCall_9_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9_3() { return cRightCurlyBracketKeyword_9_3; }
	}
	public class WhileInstanceInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.WhileInstanceInstruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWHILEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTestKeyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTestKeyResolvableValueParserRuleCall_2_0 = (RuleCall)cTestKeyAssignment_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTestValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTestValueTestValueParserRuleCall_4_0 = (RuleCall)cTestValueAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cToComputeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cToComputeInstanceInstructionExpressionParserRuleCall_7_0 = (RuleCall)cToComputeAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//WhileInstanceInstruction:
		//	'WHILE' '(' testKey=ResolvableValue '=' testValue=TestValue ')'
		//	'{'
		//	toCompute=InstanceInstructionExpression
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'WHILE' '(' testKey=ResolvableValue '=' testValue=TestValue ')' '{' toCompute=InstanceInstructionExpression '}'
		public Group getGroup() { return cGroup; }
		
		//'WHILE'
		public Keyword getWHILEKeyword_0() { return cWHILEKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//testKey=ResolvableValue
		public Assignment getTestKeyAssignment_2() { return cTestKeyAssignment_2; }
		
		//ResolvableValue
		public RuleCall getTestKeyResolvableValueParserRuleCall_2_0() { return cTestKeyResolvableValueParserRuleCall_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//testValue=TestValue
		public Assignment getTestValueAssignment_4() { return cTestValueAssignment_4; }
		
		//TestValue
		public RuleCall getTestValueTestValueParserRuleCall_4_0() { return cTestValueTestValueParserRuleCall_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//toCompute=InstanceInstructionExpression
		public Assignment getToComputeAssignment_7() { return cToComputeAssignment_7; }
		
		//InstanceInstructionExpression
		public RuleCall getToComputeInstanceInstructionExpressionParserRuleCall_7_0() { return cToComputeInstanceInstructionExpressionParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class TestValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TestValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLiteralValueParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cResolvableValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TestValue:
		//	LiteralValue | ResolvableValue;
		@Override public ParserRule getRule() { return rule; }
		
		//LiteralValue | ResolvableValue
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LiteralValue
		public RuleCall getLiteralValueParserRuleCall_0() { return cLiteralValueParserRuleCall_0; }
		
		//ResolvableValue
		public RuleCall getResolvableValueParserRuleCall_1() { return cResolvableValueParserRuleCall_1; }
	}
	public class LiteralValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.LiteralValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//LiteralValue:
		//	value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}
	public class ResolvableValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ResolvableValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cResolvableInstanceValueParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cResolvableTransitionOutputValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ResolvableValue:
		//	ResolvableInstanceValue | ResolvableTransitionOutputValue;
		@Override public ParserRule getRule() { return rule; }
		
		//ResolvableInstanceValue | ResolvableTransitionOutputValue
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ResolvableInstanceValue
		public RuleCall getResolvableInstanceValueParserRuleCall_0() { return cResolvableInstanceValueParserRuleCall_0; }
		
		//ResolvableTransitionOutputValue
		public RuleCall getResolvableTransitionOutputValueParserRuleCall_1() { return cResolvableTransitionOutputValueParserRuleCall_1; }
	}
	public class ResolvableInstanceValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ResolvableInstanceValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInstanceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cInstanceInstanceCrossReference_0_0 = (CrossReference)cInstanceAssignment_0.eContents().get(0);
		private final RuleCall cInstanceInstanceIDTerminalRuleCall_0_0_1 = (RuleCall)cInstanceInstanceCrossReference_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cKeyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cKeyStateDefinitionCrossReference_2_0 = (CrossReference)cKeyAssignment_2.eContents().get(0);
		private final RuleCall cKeyStateDefinitionIDTerminalRuleCall_2_0_1 = (RuleCall)cKeyStateDefinitionCrossReference_2_0.eContents().get(1);
		
		//ResolvableInstanceValue:
		//	instance=[Instance] '.' key=[StateDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//instance=[Instance] '.' key=[StateDefinition]
		public Group getGroup() { return cGroup; }
		
		//instance=[Instance]
		public Assignment getInstanceAssignment_0() { return cInstanceAssignment_0; }
		
		//[Instance]
		public CrossReference getInstanceInstanceCrossReference_0_0() { return cInstanceInstanceCrossReference_0_0; }
		
		//ID
		public RuleCall getInstanceInstanceIDTerminalRuleCall_0_0_1() { return cInstanceInstanceIDTerminalRuleCall_0_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//key=[StateDefinition]
		public Assignment getKeyAssignment_2() { return cKeyAssignment_2; }
		
		//[StateDefinition]
		public CrossReference getKeyStateDefinitionCrossReference_2_0() { return cKeyStateDefinitionCrossReference_2_0; }
		
		//ID
		public RuleCall getKeyStateDefinitionIDTerminalRuleCall_2_0_1() { return cKeyStateDefinitionIDTerminalRuleCall_2_0_1; }
	}
	public class ResolvableTransitionOutputValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ResolvableTransitionOutputValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOUTPUTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cStateStateDefinitionCrossReference_1_0 = (CrossReference)cStateAssignment_1.eContents().get(0);
		private final RuleCall cStateStateDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cStateStateDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cKeyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cKeyStateDefinitionCrossReference_3_0 = (CrossReference)cKeyAssignment_3.eContents().get(0);
		private final RuleCall cKeyStateDefinitionIDTerminalRuleCall_3_0_1 = (RuleCall)cKeyStateDefinitionCrossReference_3_0.eContents().get(1);
		
		//ResolvableTransitionOutputValue:
		//	'OUTPUT' state=[StateDefinition] '.' key=[StateDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//'OUTPUT' state=[StateDefinition] '.' key=[StateDefinition]
		public Group getGroup() { return cGroup; }
		
		//'OUTPUT'
		public Keyword getOUTPUTKeyword_0() { return cOUTPUTKeyword_0; }
		
		//state=[StateDefinition]
		public Assignment getStateAssignment_1() { return cStateAssignment_1; }
		
		//[StateDefinition]
		public CrossReference getStateStateDefinitionCrossReference_1_0() { return cStateStateDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getStateStateDefinitionIDTerminalRuleCall_1_0_1() { return cStateStateDefinitionIDTerminalRuleCall_1_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//key=[StateDefinition]
		public Assignment getKeyAssignment_3() { return cKeyAssignment_3; }
		
		//[StateDefinition]
		public CrossReference getKeyStateDefinitionCrossReference_3_0() { return cKeyStateDefinitionCrossReference_3_0; }
		
		//ID
		public RuleCall getKeyStateDefinitionIDTerminalRuleCall_3_0_1() { return cKeyStateDefinitionIDTerminalRuleCall_3_0_1; }
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
	private final InputDefinitionElements pInputDefinition;
	private final OutputDefinitionElements pOutputDefinition;
	private final InstanceElements pInstance;
	private final TransitionDeclarationElements pTransitionDeclaration;
	private final StateDeclarationElements pStateDeclaration;
	private final TransitionInstanceElements pTransitionInstance;
	private final StateInstanceElements pStateInstance;
	private final CollectionInstanceElements pCollectionInstance;
	private final TerminalRule tCOLLECTION_ELEMENT_NAME;
	private final UseDefinitionElements pUseDefinition;
	private final SetStatementElements pSetStatement;
	private final ToDefinitionElements pToDefinition;
	private final PredicateElements pPredicate;
	private final BinaryExpressionElements pBinaryExpression;
	private final TerminalBinaryExpressionElements pTerminalBinaryExpression;
	private final TransitionCompositionElements pTransitionComposition;
	private final TransitionCompositionBodyElements pTransitionCompositionBody;
	private final InstructionExpressionElements pInstructionExpression;
	private final TerminalInstructionElements pTerminalInstruction;
	private final IfInstructionElements pIfInstruction;
	private final WhileInstructionElements pWhileInstruction;
	private final SimpleInstructionElements pSimpleInstruction;
	private final CompoundTransitionInstanceElements pCompoundTransitionInstance;
	private final CompoundTransitionInstanceBodyElements pCompoundTransitionInstanceBody;
	private final InstanceInstructionExpressionElements pInstanceInstructionExpression;
	private final TerminalInstanceInstructionElements pTerminalInstanceInstruction;
	private final SimpleInstanceInstructionElements pSimpleInstanceInstruction;
	private final IfInstanceInstructionElements pIfInstanceInstruction;
	private final WhileInstanceInstructionElements pWhileInstanceInstruction;
	private final TestValueElements pTestValue;
	private final LiteralValueElements pLiteralValue;
	private final ResolvableValueElements pResolvableValue;
	private final ResolvableInstanceValueElements pResolvableInstanceValue;
	private final ResolvableTransitionOutputValueElements pResolvableTransitionOutputValue;
	
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
		this.pInputDefinition = new InputDefinitionElements();
		this.pOutputDefinition = new OutputDefinitionElements();
		this.pInstance = new InstanceElements();
		this.pTransitionDeclaration = new TransitionDeclarationElements();
		this.pStateDeclaration = new StateDeclarationElements();
		this.pTransitionInstance = new TransitionInstanceElements();
		this.pStateInstance = new StateInstanceElements();
		this.pCollectionInstance = new CollectionInstanceElements();
		this.tCOLLECTION_ELEMENT_NAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.COLLECTION_ELEMENT_NAME");
		this.pUseDefinition = new UseDefinitionElements();
		this.pSetStatement = new SetStatementElements();
		this.pToDefinition = new ToDefinitionElements();
		this.pPredicate = new PredicateElements();
		this.pBinaryExpression = new BinaryExpressionElements();
		this.pTerminalBinaryExpression = new TerminalBinaryExpressionElements();
		this.pTransitionComposition = new TransitionCompositionElements();
		this.pTransitionCompositionBody = new TransitionCompositionBodyElements();
		this.pInstructionExpression = new InstructionExpressionElements();
		this.pTerminalInstruction = new TerminalInstructionElements();
		this.pIfInstruction = new IfInstructionElements();
		this.pWhileInstruction = new WhileInstructionElements();
		this.pSimpleInstruction = new SimpleInstructionElements();
		this.pCompoundTransitionInstance = new CompoundTransitionInstanceElements();
		this.pCompoundTransitionInstanceBody = new CompoundTransitionInstanceBodyElements();
		this.pInstanceInstructionExpression = new InstanceInstructionExpressionElements();
		this.pTerminalInstanceInstruction = new TerminalInstanceInstructionElements();
		this.pSimpleInstanceInstruction = new SimpleInstanceInstructionElements();
		this.pIfInstanceInstruction = new IfInstanceInstructionElements();
		this.pWhileInstanceInstruction = new WhileInstanceInstructionElements();
		this.pTestValue = new TestValueElements();
		this.pLiteralValue = new LiteralValueElements();
		this.pResolvableValue = new ResolvableValueElements();
		this.pResolvableInstanceValue = new ResolvableInstanceValueElements();
		this.pResolvableTransitionOutputValue = new ResolvableTransitionOutputValueElements();
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
	//	fields+=FieldDefinition*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
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
	//	'transition' foreignTransition=[TransitionDefinition] 'from' field=[FieldDefinition] 'to'
	//	localTransition=[TransitionDefinition];
	public TransitionMappingElements getTransitionMappingAccess() {
		return pTransitionMapping;
	}
	
	public ParserRule getTransitionMappingRule() {
		return getTransitionMappingAccess().getRule();
	}
	
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
	//	composition=TransitionComposition;
	public CompoundTransitionDefinitionElements getCompoundTransitionDefinitionAccess() {
		return pCompoundTransitionDefinition;
	}
	
	public ParserRule getCompoundTransitionDefinitionRule() {
		return getCompoundTransitionDefinitionAccess().getRule();
	}
	
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
	
	//InputDefinition:
	//	{InputDefinition} 'INPUT' inputState+=[StateDefinition]*;
	public InputDefinitionElements getInputDefinitionAccess() {
		return pInputDefinition;
	}
	
	public ParserRule getInputDefinitionRule() {
		return getInputDefinitionAccess().getRule();
	}
	
	//OutputDefinition:
	//	'OUTPUT' outputState=[StateDefinition];
	public OutputDefinitionElements getOutputDefinitionAccess() {
		return pOutputDefinition;
	}
	
	public ParserRule getOutputDefinitionRule() {
		return getOutputDefinitionAccess().getRule();
	}
	
	//Instance:
	//	'instance' (transitionDeclaration=TransitionDeclaration | stateDeclaration=StateDeclaration)
	//	isCollectionElement?='collectionElement'? (name=STRING | name=COLLECTION_ELEMENT_NAME) (state=StateInstance |
	//	transition=TransitionInstance | compoundTransition=CompoundTransitionInstance | collection=CollectionInstance);
	public InstanceElements getInstanceAccess() {
		return pInstance;
	}
	
	public ParserRule getInstanceRule() {
		return getInstanceAccess().getRule();
	}
	
	//TransitionDeclaration:
	//	'transition' transition=[TransitionDefinition];
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
	//	port=INT?
	//	path=STRING?
	//	supportCollections?='hasCollectionSupport'?
	//	blind?='blind'?;
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
	
	//CollectionInstance:
	//	{CollectionInstance} '['
	//	elements+=[Instance|COLLECTION_ELEMENT_NAME]*
	//	']';
	public CollectionInstanceElements getCollectionInstanceAccess() {
		return pCollectionInstance;
	}
	
	public ParserRule getCollectionInstanceRule() {
		return getCollectionInstanceAccess().getRule();
	}
	
	//terminal COLLECTION_ELEMENT_NAME:
	//	'#' ID '#' INT '#' ID?;
	public TerminalRule getCOLLECTION_ELEMENT_NAMERule() {
		return tCOLLECTION_ELEMENT_NAME;
	}
	
	//UseDefinition:
	//	'use' predefinedValue=[Instance|STRING] | 'use' predefinedValue=[Instance|COLLECTION_ELEMENT_NAME];
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
	//	'(' Predicate ')' | {StateDefinition} instance=[StateDefinition] | {StateDefinition} (list?='collectionOf'
	//	instance=[StateDefinition]);
	public TerminalBinaryExpressionElements getTerminalBinaryExpressionAccess() {
		return pTerminalBinaryExpression;
	}
	
	public ParserRule getTerminalBinaryExpressionRule() {
		return getTerminalBinaryExpressionAccess().getRule();
	}
	
	//TransitionComposition:
	//	'{'
	//	body=TransitionCompositionBody
	//	'}';
	public TransitionCompositionElements getTransitionCompositionAccess() {
		return pTransitionComposition;
	}
	
	public ParserRule getTransitionCompositionRule() {
		return getTransitionCompositionAccess().getRule();
	}
	
	//TransitionCompositionBody:
	//	'START' ('WITH' '(' startingInputs+=[StateDefinition]+ ')')?
	//	'{'
	//	expression=InstructionExpression
	//	'}';
	public TransitionCompositionBodyElements getTransitionCompositionBodyAccess() {
		return pTransitionCompositionBody;
	}
	
	public ParserRule getTransitionCompositionBodyRule() {
		return getTransitionCompositionBodyAccess().getRule();
	}
	
	//InstructionExpression:
	//	TerminalInstruction ({ExecutionResult.computeFirst=current} computeNext=TerminalInstruction)*;
	public InstructionExpressionElements getInstructionExpressionAccess() {
		return pInstructionExpression;
	}
	
	public ParserRule getInstructionExpressionRule() {
		return getInstructionExpressionAccess().getRule();
	}
	
	//TerminalInstruction InstructionExpression:
	//	IfInstruction | WhileInstruction | SimpleInstruction |
	//	';';
	public TerminalInstructionElements getTerminalInstructionAccess() {
		return pTerminalInstruction;
	}
	
	public ParserRule getTerminalInstructionRule() {
		return getTerminalInstructionAccess().getRule();
	}
	
	//IfInstruction:
	//	'IF' '(' testKey=ResolvableValue '=' testValue=TestValue ')'
	//	'{'
	//	toComputeIfTrue=InstructionExpression
	//	'}' ('ELSE' '{'
	//	toComputeIfFalse=InstructionExpression
	//	'}')?;
	public IfInstructionElements getIfInstructionAccess() {
		return pIfInstruction;
	}
	
	public ParserRule getIfInstructionRule() {
		return getIfInstructionAccess().getRule();
	}
	
	//WhileInstruction:
	//	'WHILE' '(' testKey=ResolvableValue '=' testValue=TestValue ')'
	//	'{'
	//	toCompute=InstructionExpression
	//	'}';
	public WhileInstructionElements getWhileInstructionAccess() {
		return pWhileInstruction;
	}
	
	public ParserRule getWhileInstructionRule() {
		return getWhileInstructionAccess().getRule();
	}
	
	//SimpleInstruction:
	//	'THEN' toExecute+=[TransitionDefinition]+;
	public SimpleInstructionElements getSimpleInstructionAccess() {
		return pSimpleInstruction;
	}
	
	public ParserRule getSimpleInstructionRule() {
		return getSimpleInstructionAccess().getRule();
	}
	
	//CompoundTransitionInstance:
	//	'{'
	//	body=CompoundTransitionInstanceBody
	//	'}';
	public CompoundTransitionInstanceElements getCompoundTransitionInstanceAccess() {
		return pCompoundTransitionInstance;
	}
	
	public ParserRule getCompoundTransitionInstanceRule() {
		return getCompoundTransitionInstanceAccess().getRule();
	}
	
	//CompoundTransitionInstanceBody:
	//	'START' ('WITH' '(' startingInputs+=[Instance]+ ')')?
	//	'{'
	//	expression=InstanceInstructionExpression
	//	'}';
	public CompoundTransitionInstanceBodyElements getCompoundTransitionInstanceBodyAccess() {
		return pCompoundTransitionInstanceBody;
	}
	
	public ParserRule getCompoundTransitionInstanceBodyRule() {
		return getCompoundTransitionInstanceBodyAccess().getRule();
	}
	
	//InstanceInstructionExpression:
	//	TerminalInstanceInstruction ({ExecutionResult.computeFirst=current} computeNext=TerminalInstanceInstruction)*;
	public InstanceInstructionExpressionElements getInstanceInstructionExpressionAccess() {
		return pInstanceInstructionExpression;
	}
	
	public ParserRule getInstanceInstructionExpressionRule() {
		return getInstanceInstructionExpressionAccess().getRule();
	}
	
	//TerminalInstanceInstruction InstanceInstructionExpression:
	//	IfInstanceInstruction | WhileInstanceInstruction | SimpleInstanceInstruction |
	//	';';
	public TerminalInstanceInstructionElements getTerminalInstanceInstructionAccess() {
		return pTerminalInstanceInstruction;
	}
	
	public ParserRule getTerminalInstanceInstructionRule() {
		return getTerminalInstanceInstructionAccess().getRule();
	}
	
	//SimpleInstanceInstruction:
	//	'THEN' toExecute+=[Instance|STRING]+;
	public SimpleInstanceInstructionElements getSimpleInstanceInstructionAccess() {
		return pSimpleInstanceInstruction;
	}
	
	public ParserRule getSimpleInstanceInstructionRule() {
		return getSimpleInstanceInstructionAccess().getRule();
	}
	
	//IfInstanceInstruction:
	//	'IF' '(' testKey=ResolvableValue '=' testValue=TestValue ')'
	//	'{'
	//	toComputeIfTrue=InstanceInstructionExpression
	//	'}' ('ELSE' '{'
	//	toComputeIfFalse=InstanceInstructionExpression
	//	'}')?;
	public IfInstanceInstructionElements getIfInstanceInstructionAccess() {
		return pIfInstanceInstruction;
	}
	
	public ParserRule getIfInstanceInstructionRule() {
		return getIfInstanceInstructionAccess().getRule();
	}
	
	//WhileInstanceInstruction:
	//	'WHILE' '(' testKey=ResolvableValue '=' testValue=TestValue ')'
	//	'{'
	//	toCompute=InstanceInstructionExpression
	//	'}';
	public WhileInstanceInstructionElements getWhileInstanceInstructionAccess() {
		return pWhileInstanceInstruction;
	}
	
	public ParserRule getWhileInstanceInstructionRule() {
		return getWhileInstanceInstructionAccess().getRule();
	}
	
	//TestValue:
	//	LiteralValue | ResolvableValue;
	public TestValueElements getTestValueAccess() {
		return pTestValue;
	}
	
	public ParserRule getTestValueRule() {
		return getTestValueAccess().getRule();
	}
	
	//LiteralValue:
	//	value=STRING;
	public LiteralValueElements getLiteralValueAccess() {
		return pLiteralValue;
	}
	
	public ParserRule getLiteralValueRule() {
		return getLiteralValueAccess().getRule();
	}
	
	//ResolvableValue:
	//	ResolvableInstanceValue | ResolvableTransitionOutputValue;
	public ResolvableValueElements getResolvableValueAccess() {
		return pResolvableValue;
	}
	
	public ParserRule getResolvableValueRule() {
		return getResolvableValueAccess().getRule();
	}
	
	//ResolvableInstanceValue:
	//	instance=[Instance] '.' key=[StateDefinition];
	public ResolvableInstanceValueElements getResolvableInstanceValueAccess() {
		return pResolvableInstanceValue;
	}
	
	public ParserRule getResolvableInstanceValueRule() {
		return getResolvableInstanceValueAccess().getRule();
	}
	
	//ResolvableTransitionOutputValue:
	//	'OUTPUT' state=[StateDefinition] '.' key=[StateDefinition];
	public ResolvableTransitionOutputValueElements getResolvableTransitionOutputValueAccess() {
		return pResolvableTransitionOutputValue;
	}
	
	public ParserRule getResolvableTransitionOutputValueRule() {
		return getResolvableTransitionOutputValueAccess().getRule();
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
