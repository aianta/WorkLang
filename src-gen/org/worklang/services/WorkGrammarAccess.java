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
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFieldsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFieldsFieldDefinitionParserRuleCall_0_0 = (RuleCall)cFieldsAssignment_0.eContents().get(0);
		private final Assignment cExpertsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpertsExpertDefinitionParserRuleCall_1_0 = (RuleCall)cExpertsAssignment_1.eContents().get(0);
		private final Assignment cPractitionersAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPractitionersPractitionerParserRuleCall_2_0 = (RuleCall)cPractitionersAssignment_2.eContents().get(0);
		private final Assignment cInstructionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInstructionsInstructionParserRuleCall_3_0 = (RuleCall)cInstructionsAssignment_3.eContents().get(0);
		
		//Model:
		//	fields+=FieldDefinition*
		//	experts+=ExpertDefinition*
		//	practitioners+=Practitioner*
		//	instructions+=Instruction*;
		@Override public ParserRule getRule() { return rule; }
		
		//fields+=FieldDefinition* experts+=ExpertDefinition* practitioners+=Practitioner* instructions+=Instruction*
		public Group getGroup() { return cGroup; }
		
		//fields+=FieldDefinition*
		public Assignment getFieldsAssignment_0() { return cFieldsAssignment_0; }
		
		//FieldDefinition
		public RuleCall getFieldsFieldDefinitionParserRuleCall_0_0() { return cFieldsFieldDefinitionParserRuleCall_0_0; }
		
		//experts+=ExpertDefinition*
		public Assignment getExpertsAssignment_1() { return cExpertsAssignment_1; }
		
		//ExpertDefinition
		public RuleCall getExpertsExpertDefinitionParserRuleCall_1_0() { return cExpertsExpertDefinitionParserRuleCall_1_0; }
		
		//practitioners+=Practitioner*
		public Assignment getPractitionersAssignment_2() { return cPractitionersAssignment_2; }
		
		//Practitioner
		public RuleCall getPractitionersPractitionerParserRuleCall_2_0() { return cPractitionersPractitionerParserRuleCall_2_0; }
		
		//instructions+=Instruction*
		public Assignment getInstructionsAssignment_3() { return cInstructionsAssignment_3; }
		
		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_3_0() { return cInstructionsInstructionParserRuleCall_3_0; }
	}
	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Instruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cObjectTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cObjectTypeInstructionKeyword_0_0 = (Keyword)cObjectTypeAssignment_0.eContents().get(0);
		private final Assignment cSpaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSpaceSpaceCrossReference_1_0 = (CrossReference)cSpaceAssignment_1.eContents().get(0);
		private final RuleCall cSpaceSpaceIDTerminalRuleCall_1_0_1 = (RuleCall)cSpaceSpaceCrossReference_1_0.eContents().get(1);
		private final Assignment cTransitionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTransitionTransitionIDCrossReference_2_0 = (CrossReference)cTransitionAssignment_2.eContents().get(0);
		private final RuleCall cTransitionTransitionIDIDTerminalRuleCall_2_0_1 = (RuleCall)cTransitionTransitionIDCrossReference_2_0.eContents().get(1);
		
		///* Executable Structure
		// * Below are the grammar rules for defining execution requests for the work interpreter.
		// */ Instruction:
		//	objectType='instruction' space=[Space] transition=[TransitionID];
		@Override public ParserRule getRule() { return rule; }
		
		//objectType='instruction' space=[Space] transition=[TransitionID]
		public Group getGroup() { return cGroup; }
		
		//objectType='instruction'
		public Assignment getObjectTypeAssignment_0() { return cObjectTypeAssignment_0; }
		
		//'instruction'
		public Keyword getObjectTypeInstructionKeyword_0_0() { return cObjectTypeInstructionKeyword_0_0; }
		
		//space=[Space]
		public Assignment getSpaceAssignment_1() { return cSpaceAssignment_1; }
		
		//[Space]
		public CrossReference getSpaceSpaceCrossReference_1_0() { return cSpaceSpaceCrossReference_1_0; }
		
		//ID
		public RuleCall getSpaceSpaceIDTerminalRuleCall_1_0_1() { return cSpaceSpaceIDTerminalRuleCall_1_0_1; }
		
		//transition=[TransitionID]
		public Assignment getTransitionAssignment_2() { return cTransitionAssignment_2; }
		
		//[TransitionID]
		public CrossReference getTransitionTransitionIDCrossReference_2_0() { return cTransitionTransitionIDCrossReference_2_0; }
		
		//ID
		public RuleCall getTransitionTransitionIDIDTerminalRuleCall_2_0_1() { return cTransitionTransitionIDIDTerminalRuleCall_2_0_1; }
	}
	public class UseDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.UseDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUseAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUseUseParserRuleCall_0_0 = (RuleCall)cUseAssignment_0.eContents().get(0);
		private final Assignment cPredefinedValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPredefinedValueStateIDCrossReference_1_0 = (CrossReference)cPredefinedValueAssignment_1.eContents().get(0);
		private final RuleCall cPredefinedValueStateIDIDTerminalRuleCall_1_0_1 = (RuleCall)cPredefinedValueStateIDCrossReference_1_0.eContents().get(1);
		private final Assignment cFieldAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFieldFromFieldDefinitionParserRuleCall_2_0 = (RuleCall)cFieldAssignment_2.eContents().get(0);
		
		//UseDefinition:
		//	use=Use predefinedValue=[StateID] field=FromFieldDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//use=Use predefinedValue=[StateID] field=FromFieldDefinition
		public Group getGroup() { return cGroup; }
		
		//use=Use
		public Assignment getUseAssignment_0() { return cUseAssignment_0; }
		
		//Use
		public RuleCall getUseUseParserRuleCall_0_0() { return cUseUseParserRuleCall_0_0; }
		
		//predefinedValue=[StateID]
		public Assignment getPredefinedValueAssignment_1() { return cPredefinedValueAssignment_1; }
		
		//[StateID]
		public CrossReference getPredefinedValueStateIDCrossReference_1_0() { return cPredefinedValueStateIDCrossReference_1_0; }
		
		//ID
		public RuleCall getPredefinedValueStateIDIDTerminalRuleCall_1_0_1() { return cPredefinedValueStateIDIDTerminalRuleCall_1_0_1; }
		
		//field=FromFieldDefinition
		public Assignment getFieldAssignment_2() { return cFieldAssignment_2; }
		
		//FromFieldDefinition
		public RuleCall getFieldFromFieldDefinitionParserRuleCall_2_0() { return cFieldFromFieldDefinitionParserRuleCall_2_0; }
	}
	public class PractitionerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Practitioner");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPractitionerDefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPractitionerDefPractitionerKeyword_0_0 = (Keyword)cPractitionerDefAssignment_0.eContents().get(0);
		private final Assignment cUserAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUserUserParserRuleCall_1_0 = (RuleCall)cUserAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cKnowledgeDefAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cKnowledgeDefKnowledgeDefinitionParserRuleCall_3_0 = (RuleCall)cKnowledgeDefAssignment_3.eContents().get(0);
		private final Assignment cSkillsDefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSkillsDefSkillsDefinitionParserRuleCall_4_0 = (RuleCall)cSkillsDefAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Practitioner:
		//	practitionerDef='practitioner'
		//	user=User
		//	'{'
		//	knowledgeDef=KnowledgeDefinition?
		//	skillsDef=SkillsDefinition?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//practitionerDef='practitioner' user=User '{' knowledgeDef=KnowledgeDefinition? skillsDef=SkillsDefinition? '}'
		public Group getGroup() { return cGroup; }
		
		//practitionerDef='practitioner'
		public Assignment getPractitionerDefAssignment_0() { return cPractitionerDefAssignment_0; }
		
		//'practitioner'
		public Keyword getPractitionerDefPractitionerKeyword_0_0() { return cPractitionerDefPractitionerKeyword_0_0; }
		
		//user=User
		public Assignment getUserAssignment_1() { return cUserAssignment_1; }
		
		//User
		public RuleCall getUserUserParserRuleCall_1_0() { return cUserUserParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//knowledgeDef=KnowledgeDefinition?
		public Assignment getKnowledgeDefAssignment_3() { return cKnowledgeDefAssignment_3; }
		
		//KnowledgeDefinition
		public RuleCall getKnowledgeDefKnowledgeDefinitionParserRuleCall_3_0() { return cKnowledgeDefKnowledgeDefinitionParserRuleCall_3_0; }
		
		//skillsDef=SkillsDefinition?
		public Assignment getSkillsDefAssignment_4() { return cSkillsDefAssignment_4; }
		
		//SkillsDefinition
		public RuleCall getSkillsDefSkillsDefinitionParserRuleCall_4_0() { return cSkillsDefSkillsDefinitionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ExpertDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ExpertDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpertDefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cExpertDefExpertKeyword_0_0 = (Keyword)cExpertDefAssignment_0.eContents().get(0);
		private final Assignment cUserAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUserUserParserRuleCall_1_0 = (RuleCall)cUserAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDomainDefAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDomainDefDomainDefinitionParserRuleCall_3_0 = (RuleCall)cDomainDefAssignment_3.eContents().get(0);
		private final Assignment cKnowledgeDefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cKnowledgeDefKnowledgeDefinitionParserRuleCall_4_0 = (RuleCall)cKnowledgeDefAssignment_4.eContents().get(0);
		private final Assignment cSkillsDefAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSkillsDefSkillsDefinitionParserRuleCall_5_0 = (RuleCall)cSkillsDefAssignment_5.eContents().get(0);
		private final Keyword cHourlyRateKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cDollarSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRateAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cRateINTTerminalRuleCall_8_0 = (RuleCall)cRateAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//ExpertDefinition:
		//	expertDef='expert' user=User
		//	'{'
		//	domainDef=DomainDefinition?
		//	knowledgeDef=KnowledgeDefinition?
		//	skillsDef=SkillsDefinition?
		//	'hourlyRate'
		//	'$' rate=INT
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//expertDef='expert' user=User '{' domainDef=DomainDefinition? knowledgeDef=KnowledgeDefinition?
		//skillsDef=SkillsDefinition? 'hourlyRate' '$' rate=INT '}'
		public Group getGroup() { return cGroup; }
		
		//expertDef='expert'
		public Assignment getExpertDefAssignment_0() { return cExpertDefAssignment_0; }
		
		//'expert'
		public Keyword getExpertDefExpertKeyword_0_0() { return cExpertDefExpertKeyword_0_0; }
		
		//user=User
		public Assignment getUserAssignment_1() { return cUserAssignment_1; }
		
		//User
		public RuleCall getUserUserParserRuleCall_1_0() { return cUserUserParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//domainDef=DomainDefinition?
		public Assignment getDomainDefAssignment_3() { return cDomainDefAssignment_3; }
		
		//DomainDefinition
		public RuleCall getDomainDefDomainDefinitionParserRuleCall_3_0() { return cDomainDefDomainDefinitionParserRuleCall_3_0; }
		
		//knowledgeDef=KnowledgeDefinition?
		public Assignment getKnowledgeDefAssignment_4() { return cKnowledgeDefAssignment_4; }
		
		//KnowledgeDefinition
		public RuleCall getKnowledgeDefKnowledgeDefinitionParserRuleCall_4_0() { return cKnowledgeDefKnowledgeDefinitionParserRuleCall_4_0; }
		
		//skillsDef=SkillsDefinition?
		public Assignment getSkillsDefAssignment_5() { return cSkillsDefAssignment_5; }
		
		//SkillsDefinition
		public RuleCall getSkillsDefSkillsDefinitionParserRuleCall_5_0() { return cSkillsDefSkillsDefinitionParserRuleCall_5_0; }
		
		//'hourlyRate'
		public Keyword getHourlyRateKeyword_6() { return cHourlyRateKeyword_6; }
		
		//'$'
		public Keyword getDollarSignKeyword_7() { return cDollarSignKeyword_7; }
		
		//rate=INT
		public Assignment getRateAssignment_8() { return cRateAssignment_8; }
		
		//INT
		public RuleCall getRateINTTerminalRuleCall_8_0() { return cRateINTTerminalRuleCall_8_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class UserElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.User");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//User:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class DomainDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.DomainDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDomainAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cDomainDomainKeyword_0_0 = (Keyword)cDomainAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDomainAreasAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDomainAreasReferenceFieldParserRuleCall_2_0 = (RuleCall)cDomainAreasAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//DomainDefinition:
		//	domain='domain'
		//	'{'
		//	domainAreas+=ReferenceField*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//domain='domain' '{' domainAreas+=ReferenceField* '}'
		public Group getGroup() { return cGroup; }
		
		//domain='domain'
		public Assignment getDomainAssignment_0() { return cDomainAssignment_0; }
		
		//'domain'
		public Keyword getDomainDomainKeyword_0_0() { return cDomainDomainKeyword_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//domainAreas+=ReferenceField*
		public Assignment getDomainAreasAssignment_2() { return cDomainAreasAssignment_2; }
		
		//ReferenceField
		public RuleCall getDomainAreasReferenceFieldParserRuleCall_2_0() { return cDomainAreasReferenceFieldParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class KnowledgeDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.KnowledgeDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKnowledgeDefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cKnowledgeDefKnowledgeKeyword_0_0 = (Keyword)cKnowledgeDefAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cKnowledgeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cKnowledgeReferenceStateParserRuleCall_2_0 = (RuleCall)cKnowledgeAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//KnowledgeDefinition:
		//	knowledgeDef='knowledge' '{'
		//	knowledge+=ReferenceState*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//knowledgeDef='knowledge' '{' knowledge+=ReferenceState* '}'
		public Group getGroup() { return cGroup; }
		
		//knowledgeDef='knowledge'
		public Assignment getKnowledgeDefAssignment_0() { return cKnowledgeDefAssignment_0; }
		
		//'knowledge'
		public Keyword getKnowledgeDefKnowledgeKeyword_0_0() { return cKnowledgeDefKnowledgeKeyword_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//knowledge+=ReferenceState*
		public Assignment getKnowledgeAssignment_2() { return cKnowledgeAssignment_2; }
		
		//ReferenceState
		public RuleCall getKnowledgeReferenceStateParserRuleCall_2_0() { return cKnowledgeReferenceStateParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class SkillsDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.SkillsDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSkillsDefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cSkillsDefSkillsKeyword_0_0 = (Keyword)cSkillsDefAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSkillsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSkillsReferenceTransitionParserRuleCall_2_0 = (RuleCall)cSkillsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SkillsDefinition:
		//	skillsDef='skills' '{'
		//	skills+=ReferenceTransition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//skillsDef='skills' '{' skills+=ReferenceTransition* '}'
		public Group getGroup() { return cGroup; }
		
		//skillsDef='skills'
		public Assignment getSkillsDefAssignment_0() { return cSkillsDefAssignment_0; }
		
		//'skills'
		public Keyword getSkillsDefSkillsKeyword_0_0() { return cSkillsDefSkillsKeyword_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//skills+=ReferenceTransition*
		public Assignment getSkillsAssignment_2() { return cSkillsAssignment_2; }
		
		//ReferenceTransition
		public RuleCall getSkillsReferenceTransitionParserRuleCall_2_0() { return cSkillsReferenceTransitionParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class FieldDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.FieldDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFieldAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFieldFieldParserRuleCall_0_0 = (RuleCall)cFieldAssignment_0.eContents().get(0);
		private final Assignment cSpaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpaceSpaceParserRuleCall_1_0 = (RuleCall)cSpaceAssignment_1.eContents().get(0);
		private final Assignment cExtendsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExtendsExtendsDefinitionParserRuleCall_2_0 = (RuleCall)cExtendsAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cConceptualspaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConceptualspaceNamespaceParserRuleCall_4_0 = (RuleCall)cConceptualspaceAssignment_4.eContents().get(0);
		private final Assignment cReferencespaceAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cReferencespaceReferencespaceParserRuleCall_5_0 = (RuleCall)cReferencespaceAssignment_5.eContents().get(0);
		private final Assignment cInstancespaceAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cInstancespaceInstancespaceParserRuleCall_6_0 = (RuleCall)cInstancespaceAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//FieldDefinition:
		//	field=Field
		//	space=Space
		//	extends=ExtendsDefinition?
		//	'{'
		//	conceptualspace=Namespace?
		//	referencespace=Referencespace?
		//	instancespace=Instancespace?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//field=Field space=Space extends=ExtendsDefinition? '{' conceptualspace=Namespace? referencespace=Referencespace?
		//instancespace=Instancespace? '}'
		public Group getGroup() { return cGroup; }
		
		//field=Field
		public Assignment getFieldAssignment_0() { return cFieldAssignment_0; }
		
		//Field
		public RuleCall getFieldFieldParserRuleCall_0_0() { return cFieldFieldParserRuleCall_0_0; }
		
		//space=Space
		public Assignment getSpaceAssignment_1() { return cSpaceAssignment_1; }
		
		//Space
		public RuleCall getSpaceSpaceParserRuleCall_1_0() { return cSpaceSpaceParserRuleCall_1_0; }
		
		//extends=ExtendsDefinition?
		public Assignment getExtendsAssignment_2() { return cExtendsAssignment_2; }
		
		//ExtendsDefinition
		public RuleCall getExtendsExtendsDefinitionParserRuleCall_2_0() { return cExtendsExtendsDefinitionParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//conceptualspace=Namespace?
		public Assignment getConceptualspaceAssignment_4() { return cConceptualspaceAssignment_4; }
		
		//Namespace
		public RuleCall getConceptualspaceNamespaceParserRuleCall_4_0() { return cConceptualspaceNamespaceParserRuleCall_4_0; }
		
		//referencespace=Referencespace?
		public Assignment getReferencespaceAssignment_5() { return cReferencespaceAssignment_5; }
		
		//Referencespace
		public RuleCall getReferencespaceReferencespaceParserRuleCall_5_0() { return cReferencespaceReferencespaceParserRuleCall_5_0; }
		
		//instancespace=Instancespace?
		public Assignment getInstancespaceAssignment_6() { return cInstancespaceAssignment_6; }
		
		//Instancespace
		public RuleCall getInstancespaceInstancespaceParserRuleCall_6_0() { return cInstancespaceInstancespaceParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class SpaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Space");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Space:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class NamespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Namespace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSpaceTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSpaceTypeDefinitionsParserRuleCall_0_0 = (RuleCall)cSpaceTypeAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStatesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatesStateObjectDefinitionParserRuleCall_2_0 = (RuleCall)cStatesAssignment_2.eContents().get(0);
		private final Assignment cTransitionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTransitionsTransitionObjectDefinitionParserRuleCall_3_0 = (RuleCall)cTransitionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Namespace:
		//	spaceType=Definitions
		//	'{'
		//	states+=StateObjectDefinition*
		//	transitions+=TransitionObjectDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//spaceType=Definitions '{' states+=StateObjectDefinition* transitions+=TransitionObjectDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//spaceType=Definitions
		public Assignment getSpaceTypeAssignment_0() { return cSpaceTypeAssignment_0; }
		
		//Definitions
		public RuleCall getSpaceTypeDefinitionsParserRuleCall_0_0() { return cSpaceTypeDefinitionsParserRuleCall_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//states+=StateObjectDefinition*
		public Assignment getStatesAssignment_2() { return cStatesAssignment_2; }
		
		//StateObjectDefinition
		public RuleCall getStatesStateObjectDefinitionParserRuleCall_2_0() { return cStatesStateObjectDefinitionParserRuleCall_2_0; }
		
		//transitions+=TransitionObjectDefinition*
		public Assignment getTransitionsAssignment_3() { return cTransitionsAssignment_3; }
		
		//TransitionObjectDefinition
		public RuleCall getTransitionsTransitionObjectDefinitionParserRuleCall_3_0() { return cTransitionsTransitionObjectDefinitionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ReferencespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Referencespace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSpaceTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSpaceTypeReferencesParserRuleCall_0_0 = (RuleCall)cSpaceTypeAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRefFieldsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRefFieldsReferenceFieldParserRuleCall_2_0 = (RuleCall)cRefFieldsAssignment_2.eContents().get(0);
		private final Assignment cRefStatesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRefStatesReferenceStateParserRuleCall_3_0 = (RuleCall)cRefStatesAssignment_3.eContents().get(0);
		private final Assignment cRefTransitionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRefTransitionReferenceTransitionParserRuleCall_4_0 = (RuleCall)cRefTransitionAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Referencespace:
		//	spaceType=References
		//	'{'
		//	refFields+=ReferenceField*
		//	refStates+=ReferenceState*
		//	refTransition+=ReferenceTransition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//spaceType=References '{' refFields+=ReferenceField* refStates+=ReferenceState* refTransition+=ReferenceTransition* '}'
		public Group getGroup() { return cGroup; }
		
		//spaceType=References
		public Assignment getSpaceTypeAssignment_0() { return cSpaceTypeAssignment_0; }
		
		//References
		public RuleCall getSpaceTypeReferencesParserRuleCall_0_0() { return cSpaceTypeReferencesParserRuleCall_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//refFields+=ReferenceField*
		public Assignment getRefFieldsAssignment_2() { return cRefFieldsAssignment_2; }
		
		//ReferenceField
		public RuleCall getRefFieldsReferenceFieldParserRuleCall_2_0() { return cRefFieldsReferenceFieldParserRuleCall_2_0; }
		
		//refStates+=ReferenceState*
		public Assignment getRefStatesAssignment_3() { return cRefStatesAssignment_3; }
		
		//ReferenceState
		public RuleCall getRefStatesReferenceStateParserRuleCall_3_0() { return cRefStatesReferenceStateParserRuleCall_3_0; }
		
		//refTransition+=ReferenceTransition*
		public Assignment getRefTransitionAssignment_4() { return cRefTransitionAssignment_4; }
		
		//ReferenceTransition
		public RuleCall getRefTransitionReferenceTransitionParserRuleCall_4_0() { return cRefTransitionReferenceTransitionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class InstancespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Instancespace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSpaceTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSpaceTypeInstancesParserRuleCall_0_0 = (RuleCall)cSpaceTypeAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInstanceStatesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInstanceStatesInstanceParserRuleCall_2_0 = (RuleCall)cInstanceStatesAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Instancespace:
		//	spaceType=Instances
		//	'{'
		//	instanceStates+=Instance*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//spaceType=Instances '{' instanceStates+=Instance* '}'
		public Group getGroup() { return cGroup; }
		
		//spaceType=Instances
		public Assignment getSpaceTypeAssignment_0() { return cSpaceTypeAssignment_0; }
		
		//Instances
		public RuleCall getSpaceTypeInstancesParserRuleCall_0_0() { return cSpaceTypeInstancesParserRuleCall_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//instanceStates+=Instance*
		public Assignment getInstanceStatesAssignment_2() { return cInstanceStatesAssignment_2; }
		
		//Instance
		public RuleCall getInstanceStatesInstanceParserRuleCall_2_0() { return cInstanceStatesInstanceParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ReferenceFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ReferenceField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cRefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cRefFieldParserRuleCall_0_0 = (RuleCall)cRefAssignment_0.eContents().get(0);
		private final Assignment cSpaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpaceSpaceParserRuleCall_1_0 = (RuleCall)cSpaceAssignment_1.eContents().get(0);
		
		//ReferenceField:
		//	ref=Field
		//	space=Space;
		@Override public ParserRule getRule() { return rule; }
		
		//ref=Field space=Space
		public Group getGroup() { return cGroup; }
		
		//ref=Field
		public Assignment getRefAssignment_0() { return cRefAssignment_0; }
		
		//Field
		public RuleCall getRefFieldParserRuleCall_0_0() { return cRefFieldParserRuleCall_0_0; }
		
		//space=Space
		public Assignment getSpaceAssignment_1() { return cSpaceAssignment_1; }
		
		//Space
		public RuleCall getSpaceSpaceParserRuleCall_1_0() { return cSpaceSpaceParserRuleCall_1_0; }
	}
	public class StateObjectDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.StateObjectDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final RuleCall cTypePrimitiveParserRuleCall_0_0_0 = (RuleCall)cTypeAssignment_0_0.eContents().get(0);
		private final Assignment cTypeAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final RuleCall cTypeCompoundParserRuleCall_0_1_0 = (RuleCall)cTypeAssignment_0_1.eContents().get(0);
		private final Assignment cStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStateStateDefinitionParserRuleCall_1_0 = (RuleCall)cStateAssignment_1.eContents().get(0);
		
		//StateObjectDefinition:
		//	(type=Primitive | type=Compound) state=StateDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//(type=Primitive | type=Compound) state=StateDefinition
		public Group getGroup() { return cGroup; }
		
		//(type=Primitive | type=Compound)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//type=Primitive
		public Assignment getTypeAssignment_0_0() { return cTypeAssignment_0_0; }
		
		//Primitive
		public RuleCall getTypePrimitiveParserRuleCall_0_0_0() { return cTypePrimitiveParserRuleCall_0_0_0; }
		
		//type=Compound
		public Assignment getTypeAssignment_0_1() { return cTypeAssignment_0_1; }
		
		//Compound
		public RuleCall getTypeCompoundParserRuleCall_0_1_0() { return cTypeCompoundParserRuleCall_0_1_0; }
		
		//state=StateDefinition
		public Assignment getStateAssignment_1() { return cStateAssignment_1; }
		
		//StateDefinition
		public RuleCall getStateStateDefinitionParserRuleCall_1_0() { return cStateStateDefinitionParserRuleCall_1_0; }
	}
	public class TransitionObjectDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TransitionObjectDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final RuleCall cTypePrimitiveParserRuleCall_0_0_0 = (RuleCall)cTypeAssignment_0_0.eContents().get(0);
		private final Assignment cTypeAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final RuleCall cTypeCompoundParserRuleCall_0_1_0 = (RuleCall)cTypeAssignment_0_1.eContents().get(0);
		private final Assignment cTransitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTransitionTransitionDefinitionParserRuleCall_1_0 = (RuleCall)cTransitionAssignment_1.eContents().get(0);
		
		//TransitionObjectDefinition:
		//	(type=Primitive | type=Compound) transition=TransitionDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//(type=Primitive | type=Compound) transition=TransitionDefinition
		public Group getGroup() { return cGroup; }
		
		//(type=Primitive | type=Compound)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//type=Primitive
		public Assignment getTypeAssignment_0_0() { return cTypeAssignment_0_0; }
		
		//Primitive
		public RuleCall getTypePrimitiveParserRuleCall_0_0_0() { return cTypePrimitiveParserRuleCall_0_0_0; }
		
		//type=Compound
		public Assignment getTypeAssignment_0_1() { return cTypeAssignment_0_1; }
		
		//Compound
		public RuleCall getTypeCompoundParserRuleCall_0_1_0() { return cTypeCompoundParserRuleCall_0_1_0; }
		
		//transition=TransitionDefinition
		public Assignment getTransitionAssignment_1() { return cTransitionAssignment_1; }
		
		//TransitionDefinition
		public RuleCall getTransitionTransitionDefinitionParserRuleCall_1_0() { return cTransitionTransitionDefinitionParserRuleCall_1_0; }
	}
	public class PrimitiveStateDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.PrimitiveStateDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cObjectAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cObjectStateParserRuleCall_0_0 = (RuleCall)cObjectAssignment_0.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdStateIDParserRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		
		//PrimitiveStateDefinition:
		//	object=State id=StateID;
		@Override public ParserRule getRule() { return rule; }
		
		//object=State id=StateID
		public Group getGroup() { return cGroup; }
		
		//object=State
		public Assignment getObjectAssignment_0() { return cObjectAssignment_0; }
		
		//State
		public RuleCall getObjectStateParserRuleCall_0_0() { return cObjectStateParserRuleCall_0_0; }
		
		//id=StateID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//StateID
		public RuleCall getIdStateIDParserRuleCall_1_0() { return cIdStateIDParserRuleCall_1_0; }
	}
	public class CompoundStateDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.CompoundStateDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cObjectAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cObjectStateParserRuleCall_0_0 = (RuleCall)cObjectAssignment_0.eContents().get(0);
		private final Assignment cStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStateStateIDParserRuleCall_1_0 = (RuleCall)cStateAssignment_1.eContents().get(0);
		private final Assignment cCompoundStateDefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCompoundStateDefWithStatesDefinitionParserRuleCall_2_0 = (RuleCall)cCompoundStateDefAssignment_2.eContents().get(0);
		
		//CompoundStateDefinition:
		//	object=State state=StateID compoundStateDef=WithStatesDefinition?;
		@Override public ParserRule getRule() { return rule; }
		
		//object=State state=StateID compoundStateDef=WithStatesDefinition?
		public Group getGroup() { return cGroup; }
		
		//object=State
		public Assignment getObjectAssignment_0() { return cObjectAssignment_0; }
		
		//State
		public RuleCall getObjectStateParserRuleCall_0_0() { return cObjectStateParserRuleCall_0_0; }
		
		//state=StateID
		public Assignment getStateAssignment_1() { return cStateAssignment_1; }
		
		//StateID
		public RuleCall getStateStateIDParserRuleCall_1_0() { return cStateStateIDParserRuleCall_1_0; }
		
		//compoundStateDef=WithStatesDefinition?
		public Assignment getCompoundStateDefAssignment_2() { return cCompoundStateDefAssignment_2; }
		
		//WithStatesDefinition
		public RuleCall getCompoundStateDefWithStatesDefinitionParserRuleCall_2_0() { return cCompoundStateDefWithStatesDefinitionParserRuleCall_2_0; }
	}
	public class StateDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.StateDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cObjectAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cObjectStateParserRuleCall_0_0 = (RuleCall)cObjectAssignment_0.eContents().get(0);
		private final Assignment cStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStateStateIDParserRuleCall_1_0 = (RuleCall)cStateAssignment_1.eContents().get(0);
		private final Assignment cWithDefinitionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cWithDefinitionWithStatesDefinitionParserRuleCall_2_0 = (RuleCall)cWithDefinitionAssignment_2.eContents().get(0);
		
		//StateDefinition:
		//	object=State state=StateID withDefinition=WithStatesDefinition?;
		@Override public ParserRule getRule() { return rule; }
		
		//object=State state=StateID withDefinition=WithStatesDefinition?
		public Group getGroup() { return cGroup; }
		
		//object=State
		public Assignment getObjectAssignment_0() { return cObjectAssignment_0; }
		
		//State
		public RuleCall getObjectStateParserRuleCall_0_0() { return cObjectStateParserRuleCall_0_0; }
		
		//state=StateID
		public Assignment getStateAssignment_1() { return cStateAssignment_1; }
		
		//StateID
		public RuleCall getStateStateIDParserRuleCall_1_0() { return cStateStateIDParserRuleCall_1_0; }
		
		//withDefinition=WithStatesDefinition?
		public Assignment getWithDefinitionAssignment_2() { return cWithDefinitionAssignment_2; }
		
		//WithStatesDefinition
		public RuleCall getWithDefinitionWithStatesDefinitionParserRuleCall_2_0() { return cWithDefinitionWithStatesDefinitionParserRuleCall_2_0; }
	}
	public class StateIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.StateID");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//StateID:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class WithStatesDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.WithStatesDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCompositionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCompositionWithParserRuleCall_0_0 = (RuleCall)cCompositionAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPredicateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPredicatePredicateParserRuleCall_2_0 = (RuleCall)cPredicateAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//WithStatesDefinition:
		//	composition=With
		//	'{'
		//	predicate=Predicate
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//composition=With '{' predicate=Predicate '}'
		public Group getGroup() { return cGroup; }
		
		//composition=With
		public Assignment getCompositionAssignment_0() { return cCompositionAssignment_0; }
		
		//With
		public RuleCall getCompositionWithParserRuleCall_0_0() { return cCompositionWithParserRuleCall_0_0; }
		
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
		private final Assignment cCompositionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCompositionWithParserRuleCall_0_0 = (RuleCall)cCompositionAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTransitionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTransitionsTransitionalExpressionParserRuleCall_2_0 = (RuleCall)cTransitionsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//WithTransitionsDefinition:
		//	composition=With
		//	'{'
		//	transitions=TransitionalExpression
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//composition=With '{' transitions=TransitionalExpression '}'
		public Group getGroup() { return cGroup; }
		
		//composition=With
		public Assignment getCompositionAssignment_0() { return cCompositionAssignment_0; }
		
		//With
		public RuleCall getCompositionWithParserRuleCall_0_0() { return cCompositionWithParserRuleCall_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//transitions=TransitionalExpression
		public Assignment getTransitionsAssignment_2() { return cTransitionsAssignment_2; }
		
		//TransitionalExpression
		public RuleCall getTransitionsTransitionalExpressionParserRuleCall_2_0() { return cTransitionsTransitionalExpressionParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ReferenceStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ReferenceState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cObjectAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cObjectStateParserRuleCall_0_0 = (RuleCall)cObjectAssignment_0.eContents().get(0);
		private final Assignment cRefStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefStateStateIDCrossReference_1_0 = (CrossReference)cRefStateAssignment_1.eContents().get(0);
		private final RuleCall cRefStateStateIDIDTerminalRuleCall_1_0_1 = (RuleCall)cRefStateStateIDCrossReference_1_0.eContents().get(1);
		private final Assignment cFromAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFromFromFieldDefinitionParserRuleCall_2_0 = (RuleCall)cFromAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_3_0 = (Alternatives)cGroup_3.eContents().get(0);
		private final Keyword cCalledKeyword_3_0_0 = (Keyword)cAlternatives_3_0.eContents().get(0);
		private final Keyword cAsKeyword_3_0_1 = (Keyword)cAlternatives_3_0.eContents().get(1);
		private final Assignment cStateAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cStateStateIDParserRuleCall_3_1_0 = (RuleCall)cStateAssignment_3_1.eContents().get(0);
		private final Assignment cCompositionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCompositionWithStatesDefinitionParserRuleCall_4_0 = (RuleCall)cCompositionAssignment_4.eContents().get(0);
		
		//ReferenceState:
		//	object=State
		//	refState=[StateID] from=FromFieldDefinition (('called' | 'as') state=StateID)?
		//	composition=WithStatesDefinition?;
		@Override public ParserRule getRule() { return rule; }
		
		//object=State refState=[StateID] from=FromFieldDefinition (('called' | 'as') state=StateID)?
		//composition=WithStatesDefinition?
		public Group getGroup() { return cGroup; }
		
		//object=State
		public Assignment getObjectAssignment_0() { return cObjectAssignment_0; }
		
		//State
		public RuleCall getObjectStateParserRuleCall_0_0() { return cObjectStateParserRuleCall_0_0; }
		
		//refState=[StateID]
		public Assignment getRefStateAssignment_1() { return cRefStateAssignment_1; }
		
		//[StateID]
		public CrossReference getRefStateStateIDCrossReference_1_0() { return cRefStateStateIDCrossReference_1_0; }
		
		//ID
		public RuleCall getRefStateStateIDIDTerminalRuleCall_1_0_1() { return cRefStateStateIDIDTerminalRuleCall_1_0_1; }
		
		//from=FromFieldDefinition
		public Assignment getFromAssignment_2() { return cFromAssignment_2; }
		
		//FromFieldDefinition
		public RuleCall getFromFromFieldDefinitionParserRuleCall_2_0() { return cFromFromFieldDefinitionParserRuleCall_2_0; }
		
		//(('called' | 'as') state=StateID)?
		public Group getGroup_3() { return cGroup_3; }
		
		//('called' | 'as')
		public Alternatives getAlternatives_3_0() { return cAlternatives_3_0; }
		
		//'called'
		public Keyword getCalledKeyword_3_0_0() { return cCalledKeyword_3_0_0; }
		
		//'as'
		public Keyword getAsKeyword_3_0_1() { return cAsKeyword_3_0_1; }
		
		//state=StateID
		public Assignment getStateAssignment_3_1() { return cStateAssignment_3_1; }
		
		//StateID
		public RuleCall getStateStateIDParserRuleCall_3_1_0() { return cStateStateIDParserRuleCall_3_1_0; }
		
		//composition=WithStatesDefinition?
		public Assignment getCompositionAssignment_4() { return cCompositionAssignment_4; }
		
		//WithStatesDefinition
		public RuleCall getCompositionWithStatesDefinitionParserRuleCall_4_0() { return cCompositionWithStatesDefinitionParserRuleCall_4_0; }
	}
	public class TransitionDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TransitionDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cObjectAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cObjectTransitionParserRuleCall_0_0 = (RuleCall)cObjectAssignment_0.eContents().get(0);
		private final Assignment cTransitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTransitionTransitionIDParserRuleCall_1_0 = (RuleCall)cTransitionAssignment_1.eContents().get(0);
		private final Assignment cInAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInInputDefinitionParserRuleCall_2_0 = (RuleCall)cInAssignment_2.eContents().get(0);
		private final Assignment cOutAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOutOutputDefinitionParserRuleCall_3_0 = (RuleCall)cOutAssignment_3.eContents().get(0);
		private final Assignment cCompositionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCompositionWithTransitionsDefinitionParserRuleCall_4_0 = (RuleCall)cCompositionAssignment_4.eContents().get(0);
		
		//TransitionDefinition:
		//	object=Transition transition=TransitionID in=InputDefinition? out=OutputDefinition
		//	composition=WithTransitionsDefinition?;
		@Override public ParserRule getRule() { return rule; }
		
		//object=Transition transition=TransitionID in=InputDefinition? out=OutputDefinition
		//composition=WithTransitionsDefinition?
		public Group getGroup() { return cGroup; }
		
		//object=Transition
		public Assignment getObjectAssignment_0() { return cObjectAssignment_0; }
		
		//Transition
		public RuleCall getObjectTransitionParserRuleCall_0_0() { return cObjectTransitionParserRuleCall_0_0; }
		
		//transition=TransitionID
		public Assignment getTransitionAssignment_1() { return cTransitionAssignment_1; }
		
		//TransitionID
		public RuleCall getTransitionTransitionIDParserRuleCall_1_0() { return cTransitionTransitionIDParserRuleCall_1_0; }
		
		//in=InputDefinition?
		public Assignment getInAssignment_2() { return cInAssignment_2; }
		
		//InputDefinition
		public RuleCall getInInputDefinitionParserRuleCall_2_0() { return cInInputDefinitionParserRuleCall_2_0; }
		
		//out=OutputDefinition
		public Assignment getOutAssignment_3() { return cOutAssignment_3; }
		
		//OutputDefinition
		public RuleCall getOutOutputDefinitionParserRuleCall_3_0() { return cOutOutputDefinitionParserRuleCall_3_0; }
		
		//composition=WithTransitionsDefinition?
		public Assignment getCompositionAssignment_4() { return cCompositionAssignment_4; }
		
		//WithTransitionsDefinition
		public RuleCall getCompositionWithTransitionsDefinitionParserRuleCall_4_0() { return cCompositionWithTransitionsDefinitionParserRuleCall_4_0; }
	}
	public class TransitionIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.TransitionID");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//TransitionID:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class ReferenceTransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ReferenceTransition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cObjectAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cObjectTransitionParserRuleCall_0_0 = (RuleCall)cObjectAssignment_0.eContents().get(0);
		private final Assignment cRefTransitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefTransitionTransitionIDCrossReference_1_0 = (CrossReference)cRefTransitionAssignment_1.eContents().get(0);
		private final RuleCall cRefTransitionTransitionIDIDTerminalRuleCall_1_0_1 = (RuleCall)cRefTransitionTransitionIDCrossReference_1_0.eContents().get(1);
		private final Assignment cFromDefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFromDefFromFieldDefinitionParserRuleCall_2_0 = (RuleCall)cFromDefAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_3_0 = (Alternatives)cGroup_3.eContents().get(0);
		private final Keyword cCalledKeyword_3_0_0 = (Keyword)cAlternatives_3_0.eContents().get(0);
		private final Keyword cAsKeyword_3_0_1 = (Keyword)cAlternatives_3_0.eContents().get(1);
		private final Assignment cTransitionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTransitionTransitionIDParserRuleCall_3_1_0 = (RuleCall)cTransitionAssignment_3_1.eContents().get(0);
		private final Assignment cCompositionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCompositionWithTransitionsDefinitionParserRuleCall_4_0 = (RuleCall)cCompositionAssignment_4.eContents().get(0);
		
		//ReferenceTransition:
		//	object=Transition
		//	refTransition=[TransitionID] fromDef=FromFieldDefinition (('called' | 'as') transition=TransitionID)?
		//	composition=WithTransitionsDefinition?;
		@Override public ParserRule getRule() { return rule; }
		
		//object=Transition refTransition=[TransitionID] fromDef=FromFieldDefinition (('called' | 'as') transition=TransitionID)?
		//composition=WithTransitionsDefinition?
		public Group getGroup() { return cGroup; }
		
		//object=Transition
		public Assignment getObjectAssignment_0() { return cObjectAssignment_0; }
		
		//Transition
		public RuleCall getObjectTransitionParserRuleCall_0_0() { return cObjectTransitionParserRuleCall_0_0; }
		
		//refTransition=[TransitionID]
		public Assignment getRefTransitionAssignment_1() { return cRefTransitionAssignment_1; }
		
		//[TransitionID]
		public CrossReference getRefTransitionTransitionIDCrossReference_1_0() { return cRefTransitionTransitionIDCrossReference_1_0; }
		
		//ID
		public RuleCall getRefTransitionTransitionIDIDTerminalRuleCall_1_0_1() { return cRefTransitionTransitionIDIDTerminalRuleCall_1_0_1; }
		
		//fromDef=FromFieldDefinition
		public Assignment getFromDefAssignment_2() { return cFromDefAssignment_2; }
		
		//FromFieldDefinition
		public RuleCall getFromDefFromFieldDefinitionParserRuleCall_2_0() { return cFromDefFromFieldDefinitionParserRuleCall_2_0; }
		
		//(('called' | 'as') transition=TransitionID)?
		public Group getGroup_3() { return cGroup_3; }
		
		//('called' | 'as')
		public Alternatives getAlternatives_3_0() { return cAlternatives_3_0; }
		
		//'called'
		public Keyword getCalledKeyword_3_0_0() { return cCalledKeyword_3_0_0; }
		
		//'as'
		public Keyword getAsKeyword_3_0_1() { return cAsKeyword_3_0_1; }
		
		//transition=TransitionID
		public Assignment getTransitionAssignment_3_1() { return cTransitionAssignment_3_1; }
		
		//TransitionID
		public RuleCall getTransitionTransitionIDParserRuleCall_3_1_0() { return cTransitionTransitionIDParserRuleCall_3_1_0; }
		
		//composition=WithTransitionsDefinition?
		public Assignment getCompositionAssignment_4() { return cCompositionAssignment_4; }
		
		//WithTransitionsDefinition
		public RuleCall getCompositionWithTransitionsDefinitionParserRuleCall_4_0() { return cCompositionWithTransitionsDefinitionParserRuleCall_4_0; }
	}
	public class FromFieldDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.FromFieldDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFromAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFromFromParserRuleCall_0_0 = (RuleCall)cFromAssignment_0.eContents().get(0);
		private final Assignment cRefSpaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefSpaceSpaceCrossReference_1_0 = (CrossReference)cRefSpaceAssignment_1.eContents().get(0);
		private final RuleCall cRefSpaceSpaceIDTerminalRuleCall_1_0_1 = (RuleCall)cRefSpaceSpaceCrossReference_1_0.eContents().get(1);
		
		//FromFieldDefinition:
		//	from=From
		//	refSpace=[Space];
		@Override public ParserRule getRule() { return rule; }
		
		//from=From refSpace=[Space]
		public Group getGroup() { return cGroup; }
		
		//from=From
		public Assignment getFromAssignment_0() { return cFromAssignment_0; }
		
		//From
		public RuleCall getFromFromParserRuleCall_0_0() { return cFromFromParserRuleCall_0_0; }
		
		//refSpace=[Space]
		public Assignment getRefSpaceAssignment_1() { return cRefSpaceAssignment_1; }
		
		//[Space]
		public CrossReference getRefSpaceSpaceCrossReference_1_0() { return cRefSpaceSpaceCrossReference_1_0; }
		
		//ID
		public RuleCall getRefSpaceSpaceIDTerminalRuleCall_1_0_1() { return cRefSpaceSpaceIDTerminalRuleCall_1_0_1; }
	}
	public class InputDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.InputDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInputAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cInputInputParserRuleCall_0_0 = (RuleCall)cInputAssignment_0.eContents().get(0);
		private final Assignment cInputStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cInputStateStateIDCrossReference_1_0 = (CrossReference)cInputStateAssignment_1.eContents().get(0);
		private final RuleCall cInputStateStateIDIDTerminalRuleCall_1_0_1 = (RuleCall)cInputStateStateIDCrossReference_1_0.eContents().get(1);
		
		//InputDefinition:
		//	input=Input inputState+=[StateID]*;
		@Override public ParserRule getRule() { return rule; }
		
		//input=Input inputState+=[StateID]*
		public Group getGroup() { return cGroup; }
		
		//input=Input
		public Assignment getInputAssignment_0() { return cInputAssignment_0; }
		
		//Input
		public RuleCall getInputInputParserRuleCall_0_0() { return cInputInputParserRuleCall_0_0; }
		
		//inputState+=[StateID]*
		public Assignment getInputStateAssignment_1() { return cInputStateAssignment_1; }
		
		//[StateID]
		public CrossReference getInputStateStateIDCrossReference_1_0() { return cInputStateStateIDCrossReference_1_0; }
		
		//ID
		public RuleCall getInputStateStateIDIDTerminalRuleCall_1_0_1() { return cInputStateStateIDIDTerminalRuleCall_1_0_1; }
	}
	public class OutputDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.OutputDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOutputAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOutputOutputParserRuleCall_0_0 = (RuleCall)cOutputAssignment_0.eContents().get(0);
		private final Assignment cOutputStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cOutputStateStateIDCrossReference_1_0 = (CrossReference)cOutputStateAssignment_1.eContents().get(0);
		private final RuleCall cOutputStateStateIDIDTerminalRuleCall_1_0_1 = (RuleCall)cOutputStateStateIDCrossReference_1_0.eContents().get(1);
		
		//OutputDefinition:
		//	output=Output outputState=[StateID];
		@Override public ParserRule getRule() { return rule; }
		
		//output=Output outputState=[StateID]
		public Group getGroup() { return cGroup; }
		
		//output=Output
		public Assignment getOutputAssignment_0() { return cOutputAssignment_0; }
		
		//Output
		public RuleCall getOutputOutputParserRuleCall_0_0() { return cOutputOutputParserRuleCall_0_0; }
		
		//outputState=[StateID]
		public Assignment getOutputStateAssignment_1() { return cOutputStateAssignment_1; }
		
		//[StateID]
		public CrossReference getOutputStateStateIDCrossReference_1_0() { return cOutputStateStateIDCrossReference_1_0; }
		
		//ID
		public RuleCall getOutputStateStateIDIDTerminalRuleCall_1_0_1() { return cOutputStateStateIDIDTerminalRuleCall_1_0_1; }
	}
	public class ExtendsDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ExtendsDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeExtendsParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNamespacesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cNamespacesSpaceCrossReference_1_0 = (CrossReference)cNamespacesAssignment_1.eContents().get(0);
		private final RuleCall cNamespacesSpaceIDTerminalRuleCall_1_0_1 = (RuleCall)cNamespacesSpaceCrossReference_1_0.eContents().get(1);
		
		//ExtendsDefinition:
		//	type=Extends
		//	namespaces+=[Space]+;
		@Override public ParserRule getRule() { return rule; }
		
		//type=Extends namespaces+=[Space]+
		public Group getGroup() { return cGroup; }
		
		//type=Extends
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//Extends
		public RuleCall getTypeExtendsParserRuleCall_0_0() { return cTypeExtendsParserRuleCall_0_0; }
		
		//namespaces+=[Space]+
		public Assignment getNamespacesAssignment_1() { return cNamespacesAssignment_1; }
		
		//[Space]
		public CrossReference getNamespacesSpaceCrossReference_1_0() { return cNamespacesSpaceCrossReference_1_0; }
		
		//ID
		public RuleCall getNamespacesSpaceIDTerminalRuleCall_1_0_1() { return cNamespacesSpaceIDTerminalRuleCall_1_0_1; }
	}
	public class PrimitiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Primitive");
		private final Keyword cPrimitiveKeyword = (Keyword)rule.eContents().get(1);
		
		//Primitive:
		//	'primitive';
		@Override public ParserRule getRule() { return rule; }
		
		//'primitive'
		public Keyword getPrimitiveKeyword() { return cPrimitiveKeyword; }
	}
	public class CompoundElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Compound");
		private final Keyword cCompoundKeyword = (Keyword)rule.eContents().get(1);
		
		//Compound:
		//	'compound';
		@Override public ParserRule getRule() { return rule; }
		
		//'compound'
		public Keyword getCompoundKeyword() { return cCompoundKeyword; }
	}
	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Field");
		private final Keyword cFieldKeyword = (Keyword)rule.eContents().get(1);
		
		//Field:
		//	'field';
		@Override public ParserRule getRule() { return rule; }
		
		//'field'
		public Keyword getFieldKeyword() { return cFieldKeyword; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.State");
		private final Keyword cStateKeyword = (Keyword)rule.eContents().get(1);
		
		//State:
		//	'state';
		@Override public ParserRule getRule() { return rule; }
		
		//'state'
		public Keyword getStateKeyword() { return cStateKeyword; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Transition");
		private final Keyword cTransitionKeyword = (Keyword)rule.eContents().get(1);
		
		//Transition:
		//	'transition';
		@Override public ParserRule getRule() { return rule; }
		
		//'transition'
		public Keyword getTransitionKeyword() { return cTransitionKeyword; }
	}
	public class DefinitionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Definitions");
		private final Keyword cDefinitionsKeyword = (Keyword)rule.eContents().get(1);
		
		//Definitions:
		//	'definitions';
		@Override public ParserRule getRule() { return rule; }
		
		//'definitions'
		public Keyword getDefinitionsKeyword() { return cDefinitionsKeyword; }
	}
	public class ReferencesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.References");
		private final Keyword cReferencesKeyword = (Keyword)rule.eContents().get(1);
		
		//References:
		//	'references';
		@Override public ParserRule getRule() { return rule; }
		
		//'references'
		public Keyword getReferencesKeyword() { return cReferencesKeyword; }
	}
	public class InstancesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Instances");
		private final Keyword cInstancesKeyword = (Keyword)rule.eContents().get(1);
		
		//Instances:
		//	'instances';
		@Override public ParserRule getRule() { return rule; }
		
		//'instances'
		public Keyword getInstancesKeyword() { return cInstancesKeyword; }
	}
	public class InputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Input");
		private final Keyword cInputKeyword = (Keyword)rule.eContents().get(1);
		
		//Input:
		//	'input';
		@Override public ParserRule getRule() { return rule; }
		
		//'input'
		public Keyword getInputKeyword() { return cInputKeyword; }
	}
	public class OutputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Output");
		private final Keyword cOutputKeyword = (Keyword)rule.eContents().get(1);
		
		//Output:
		//	'output';
		@Override public ParserRule getRule() { return rule; }
		
		//'output'
		public Keyword getOutputKeyword() { return cOutputKeyword; }
	}
	public class FromElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.From");
		private final Keyword cFromKeyword = (Keyword)rule.eContents().get(1);
		
		//From:
		//	'from';
		@Override public ParserRule getRule() { return rule; }
		
		//'from'
		public Keyword getFromKeyword() { return cFromKeyword; }
	}
	public class WithElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.With");
		private final Keyword cWithKeyword = (Keyword)rule.eContents().get(1);
		
		//With:
		//	'with';
		@Override public ParserRule getRule() { return rule; }
		
		//'with'
		public Keyword getWithKeyword() { return cWithKeyword; }
	}
	public class ExtendsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Extends");
		private final Keyword cExtendsKeyword = (Keyword)rule.eContents().get(1);
		
		//Extends:
		//	'extends';
		@Override public ParserRule getRule() { return rule; }
		
		//'extends'
		public Keyword getExtendsKeyword() { return cExtendsKeyword; }
	}
	public class NotOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.NotOp");
		private final Keyword cNOTKeyword = (Keyword)rule.eContents().get(1);
		
		//NotOp:
		//	'NOT';
		@Override public ParserRule getRule() { return rule; }
		
		//'NOT'
		public Keyword getNOTKeyword() { return cNOTKeyword; }
	}
	public class AndOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.AndOp");
		private final Keyword cANDKeyword = (Keyword)rule.eContents().get(1);
		
		//AndOp:
		//	'AND';
		@Override public ParserRule getRule() { return rule; }
		
		//'AND'
		public Keyword getANDKeyword() { return cANDKeyword; }
	}
	public class OrOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.OrOp");
		private final Keyword cORKeyword = (Keyword)rule.eContents().get(1);
		
		//OrOp:
		//	'OR';
		@Override public ParserRule getRule() { return rule; }
		
		//'OR'
		public Keyword getORKeyword() { return cORKeyword; }
	}
	public class SetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Set");
		private final Keyword cSetKeyword = (Keyword)rule.eContents().get(1);
		
		//Set:
		//	'set';
		@Override public ParserRule getRule() { return rule; }
		
		//'set'
		public Keyword getSetKeyword() { return cSetKeyword; }
	}
	public class ToElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.To");
		private final Keyword cToKeyword = (Keyword)rule.eContents().get(1);
		
		//To:
		//	'to';
		@Override public ParserRule getRule() { return rule; }
		
		//'to'
		public Keyword getToKeyword() { return cToKeyword; }
	}
	public class UseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Use");
		private final Keyword cUseKeyword = (Keyword)rule.eContents().get(1);
		
		//Use:
		//	'use';
		@Override public ParserRule getRule() { return rule; }
		
		//'use'
		public Keyword getUseKeyword() { return cUseKeyword; }
	}
	public class CountElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Count");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Count:
		//	INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	public class InstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Instance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInstanceDefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cInstanceDefInstanceKeyword_0_0 = (Keyword)cInstanceDefAssignment_0.eContents().get(0);
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
		
		//Instance:
		//	instanceDef='instance' (transitionDeclaration=TransitionDeclaration | stateDeclaration=StateDeclaration) name=STRING
		//	(state=StateInstance | transition=TransitionInstance);
		@Override public ParserRule getRule() { return rule; }
		
		//instanceDef='instance' (transitionDeclaration=TransitionDeclaration | stateDeclaration=StateDeclaration) name=STRING
		//(state=StateInstance | transition=TransitionInstance)
		public Group getGroup() { return cGroup; }
		
		//instanceDef='instance'
		public Assignment getInstanceDefAssignment_0() { return cInstanceDefAssignment_0; }
		
		//'instance'
		public Keyword getInstanceDefInstanceKeyword_0_0() { return cInstanceDefInstanceKeyword_0_0; }
		
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
		private final Assignment cObjectTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cObjectTypeTransitionParserRuleCall_0_0 = (RuleCall)cObjectTypeAssignment_0.eContents().get(0);
		private final Assignment cTransitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTransitionTransitionIDParserRuleCall_1_0 = (RuleCall)cTransitionAssignment_1.eContents().get(0);
		
		//TransitionDeclaration:
		//	objectType=Transition transition=TransitionID;
		@Override public ParserRule getRule() { return rule; }
		
		//objectType=Transition transition=TransitionID
		public Group getGroup() { return cGroup; }
		
		//objectType=Transition
		public Assignment getObjectTypeAssignment_0() { return cObjectTypeAssignment_0; }
		
		//Transition
		public RuleCall getObjectTypeTransitionParserRuleCall_0_0() { return cObjectTypeTransitionParserRuleCall_0_0; }
		
		//transition=TransitionID
		public Assignment getTransitionAssignment_1() { return cTransitionAssignment_1; }
		
		//TransitionID
		public RuleCall getTransitionTransitionIDParserRuleCall_1_0() { return cTransitionTransitionIDParserRuleCall_1_0; }
	}
	public class StateDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.StateDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cObjectTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cObjectTypeStateParserRuleCall_0_0 = (RuleCall)cObjectTypeAssignment_0.eContents().get(0);
		private final Assignment cStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStateStateIDParserRuleCall_1_0 = (RuleCall)cStateAssignment_1.eContents().get(0);
		
		//StateDeclaration:
		//	objectType=State state=StateID;
		@Override public ParserRule getRule() { return rule; }
		
		//objectType=State state=StateID
		public Group getGroup() { return cGroup; }
		
		//objectType=State
		public Assignment getObjectTypeAssignment_0() { return cObjectTypeAssignment_0; }
		
		//State
		public RuleCall getObjectTypeStateParserRuleCall_0_0() { return cObjectTypeStateParserRuleCall_0_0; }
		
		//state=StateID
		public Assignment getStateAssignment_1() { return cStateAssignment_1; }
		
		//StateID
		public RuleCall getStateStateIDParserRuleCall_1_0() { return cStateStateIDParserRuleCall_1_0; }
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
	public class SetStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.SetStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStatementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cStatementSetParserRuleCall_0_0 = (RuleCall)cStatementAssignment_0.eContents().get(0);
		private final Assignment cVariableAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cVariableStateIDCrossReference_1_0 = (CrossReference)cVariableAssignment_1.eContents().get(0);
		private final RuleCall cVariableStateIDIDTerminalRuleCall_1_0_1 = (RuleCall)cVariableStateIDCrossReference_1_0.eContents().get(1);
		private final Assignment cToDefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cToDefToDefinitionParserRuleCall_2_0 = (RuleCall)cToDefAssignment_2.eContents().get(0);
		
		//SetStatement:
		//	statement=Set variable=[StateID] toDef=ToDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//statement=Set variable=[StateID] toDef=ToDefinition
		public Group getGroup() { return cGroup; }
		
		//statement=Set
		public Assignment getStatementAssignment_0() { return cStatementAssignment_0; }
		
		//Set
		public RuleCall getStatementSetParserRuleCall_0_0() { return cStatementSetParserRuleCall_0_0; }
		
		//variable=[StateID]
		public Assignment getVariableAssignment_1() { return cVariableAssignment_1; }
		
		//[StateID]
		public CrossReference getVariableStateIDCrossReference_1_0() { return cVariableStateIDCrossReference_1_0; }
		
		//ID
		public RuleCall getVariableStateIDIDTerminalRuleCall_1_0_1() { return cVariableStateIDIDTerminalRuleCall_1_0_1; }
		
		//toDef=ToDefinition
		public Assignment getToDefAssignment_2() { return cToDefAssignment_2; }
		
		//ToDefinition
		public RuleCall getToDefToDefinitionParserRuleCall_2_0() { return cToDefToDefinitionParserRuleCall_2_0; }
	}
	public class ToDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.ToDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cToAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cToToParserRuleCall_0_0 = (RuleCall)cToAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//ToDefinition:
		//	to=To value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//to=To value=STRING
		public Group getGroup() { return cGroup; }
		
		//to=To
		public Assignment getToAssignment_0() { return cToAssignment_0; }
		
		//To
		public RuleCall getToToParserRuleCall_0_0() { return cToToParserRuleCall_0_0; }
		
		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}
	public class PredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Predicate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNegationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNegationNotOpParserRuleCall_0_0 = (RuleCall)cNegationAssignment_0.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionBinaryExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		
		////State Composition Expression Rules
		//Predicate:
		//	negation?=NotOp? expression=BinaryExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//negation?=NotOp? expression=BinaryExpression
		public Group getGroup() { return cGroup; }
		
		//negation?=NotOp?
		public Assignment getNegationAssignment_0() { return cNegationAssignment_0; }
		
		//NotOp
		public RuleCall getNegationNotOpParserRuleCall_0_0() { return cNegationNotOpParserRuleCall_0_0; }
		
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
		private final RuleCall cOpAndOpParserRuleCall_1_1_0_0 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cOpOrOpParserRuleCall_1_1_0_1 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightTerminalBinaryExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//BinaryExpression:
		//	TerminalBinaryExpression ({Operation.left=current} op=(AndOp | OrOp) right=TerminalBinaryExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//TerminalBinaryExpression ({Operation.left=current} op=(AndOp | OrOp) right=TerminalBinaryExpression)*
		public Group getGroup() { return cGroup; }
		
		//TerminalBinaryExpression
		public RuleCall getTerminalBinaryExpressionParserRuleCall_0() { return cTerminalBinaryExpressionParserRuleCall_0; }
		
		//({Operation.left=current} op=(AndOp | OrOp) right=TerminalBinaryExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Operation.left=current}
		public Action getOperationLeftAction_1_0() { return cOperationLeftAction_1_0; }
		
		//op=(AndOp | OrOp)
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//(AndOp | OrOp)
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//AndOp
		public RuleCall getOpAndOpParserRuleCall_1_1_0_0() { return cOpAndOpParserRuleCall_1_1_0_0; }
		
		//OrOp
		public RuleCall getOpOrOpParserRuleCall_1_1_0_1() { return cOpOrOpParserRuleCall_1_1_0_1; }
		
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
		private final Action cStateIDAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cInstanceAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cInstanceStateIDCrossReference_1_1_0 = (CrossReference)cInstanceAssignment_1_1.eContents().get(0);
		private final RuleCall cInstanceStateIDIDTerminalRuleCall_1_1_0_1 = (RuleCall)cInstanceStateIDCrossReference_1_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cStateIDAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Assignment cListAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final Keyword cListSetOfKeyword_2_1_0_0 = (Keyword)cListAssignment_2_1_0.eContents().get(0);
		private final Assignment cValueAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final CrossReference cValueStateIDCrossReference_2_1_1_0 = (CrossReference)cValueAssignment_2_1_1.eContents().get(0);
		private final RuleCall cValueStateIDIDTerminalRuleCall_2_1_1_0_1 = (RuleCall)cValueStateIDCrossReference_2_1_1_0.eContents().get(1);
		
		//TerminalBinaryExpression BinaryExpression:
		//	'(' Predicate ')' | {StateID} instance=[StateID] | {StateID} (list?='setOf' value=[StateID]);
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Predicate ')' | {StateID} instance=[StateID] | {StateID} (list?='setOf' value=[StateID])
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' Predicate ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//Predicate
		public RuleCall getPredicateParserRuleCall_0_1() { return cPredicateParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//{StateID} instance=[StateID]
		public Group getGroup_1() { return cGroup_1; }
		
		//{StateID}
		public Action getStateIDAction_1_0() { return cStateIDAction_1_0; }
		
		//instance=[StateID]
		public Assignment getInstanceAssignment_1_1() { return cInstanceAssignment_1_1; }
		
		//[StateID]
		public CrossReference getInstanceStateIDCrossReference_1_1_0() { return cInstanceStateIDCrossReference_1_1_0; }
		
		//ID
		public RuleCall getInstanceStateIDIDTerminalRuleCall_1_1_0_1() { return cInstanceStateIDIDTerminalRuleCall_1_1_0_1; }
		
		//{StateID} (list?='setOf' value=[StateID])
		public Group getGroup_2() { return cGroup_2; }
		
		//{StateID}
		public Action getStateIDAction_2_0() { return cStateIDAction_2_0; }
		
		//(list?='setOf' value=[StateID])
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//list?='setOf'
		public Assignment getListAssignment_2_1_0() { return cListAssignment_2_1_0; }
		
		//'setOf'
		public Keyword getListSetOfKeyword_2_1_0_0() { return cListSetOfKeyword_2_1_0_0; }
		
		//value=[StateID]
		public Assignment getValueAssignment_2_1_1() { return cValueAssignment_2_1_1; }
		
		//[StateID]
		public CrossReference getValueStateIDCrossReference_2_1_1_0() { return cValueStateIDCrossReference_2_1_1_0; }
		
		//ID
		public RuleCall getValueStateIDIDTerminalRuleCall_2_1_1_0_1() { return cValueStateIDIDTerminalRuleCall_2_1_1_0_1; }
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
	private final InstructionElements pInstruction;
	private final UseDefinitionElements pUseDefinition;
	private final PractitionerElements pPractitioner;
	private final ExpertDefinitionElements pExpertDefinition;
	private final UserElements pUser;
	private final DomainDefinitionElements pDomainDefinition;
	private final KnowledgeDefinitionElements pKnowledgeDefinition;
	private final SkillsDefinitionElements pSkillsDefinition;
	private final FieldDefinitionElements pFieldDefinition;
	private final SpaceElements pSpace;
	private final NamespaceElements pNamespace;
	private final ReferencespaceElements pReferencespace;
	private final InstancespaceElements pInstancespace;
	private final ReferenceFieldElements pReferenceField;
	private final StateObjectDefinitionElements pStateObjectDefinition;
	private final TransitionObjectDefinitionElements pTransitionObjectDefinition;
	private final PrimitiveStateDefinitionElements pPrimitiveStateDefinition;
	private final CompoundStateDefinitionElements pCompoundStateDefinition;
	private final StateDefinitionElements pStateDefinition;
	private final StateIDElements pStateID;
	private final WithStatesDefinitionElements pWithStatesDefinition;
	private final WithTransitionsDefinitionElements pWithTransitionsDefinition;
	private final ReferenceStateElements pReferenceState;
	private final TransitionDefinitionElements pTransitionDefinition;
	private final TransitionIDElements pTransitionID;
	private final ReferenceTransitionElements pReferenceTransition;
	private final FromFieldDefinitionElements pFromFieldDefinition;
	private final InputDefinitionElements pInputDefinition;
	private final OutputDefinitionElements pOutputDefinition;
	private final ExtendsDefinitionElements pExtendsDefinition;
	private final PrimitiveElements pPrimitive;
	private final CompoundElements pCompound;
	private final FieldElements pField;
	private final StateElements pState;
	private final TransitionElements pTransition;
	private final DefinitionsElements pDefinitions;
	private final ReferencesElements pReferences;
	private final InstancesElements pInstances;
	private final InputElements pInput;
	private final OutputElements pOutput;
	private final FromElements pFrom;
	private final WithElements pWith;
	private final ExtendsElements pExtends;
	private final NotOpElements pNotOp;
	private final AndOpElements pAndOp;
	private final OrOpElements pOrOp;
	private final SetElements pSet;
	private final ToElements pTo;
	private final UseElements pUse;
	private final CountElements pCount;
	private final InstanceElements pInstance;
	private final TransitionDeclarationElements pTransitionDeclaration;
	private final StateDeclarationElements pStateDeclaration;
	private final TransitionInstanceElements pTransitionInstance;
	private final StateInstanceElements pStateInstance;
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
		this.pInstruction = new InstructionElements();
		this.pUseDefinition = new UseDefinitionElements();
		this.pPractitioner = new PractitionerElements();
		this.pExpertDefinition = new ExpertDefinitionElements();
		this.pUser = new UserElements();
		this.pDomainDefinition = new DomainDefinitionElements();
		this.pKnowledgeDefinition = new KnowledgeDefinitionElements();
		this.pSkillsDefinition = new SkillsDefinitionElements();
		this.pFieldDefinition = new FieldDefinitionElements();
		this.pSpace = new SpaceElements();
		this.pNamespace = new NamespaceElements();
		this.pReferencespace = new ReferencespaceElements();
		this.pInstancespace = new InstancespaceElements();
		this.pReferenceField = new ReferenceFieldElements();
		this.pStateObjectDefinition = new StateObjectDefinitionElements();
		this.pTransitionObjectDefinition = new TransitionObjectDefinitionElements();
		this.pPrimitiveStateDefinition = new PrimitiveStateDefinitionElements();
		this.pCompoundStateDefinition = new CompoundStateDefinitionElements();
		this.pStateDefinition = new StateDefinitionElements();
		this.pStateID = new StateIDElements();
		this.pWithStatesDefinition = new WithStatesDefinitionElements();
		this.pWithTransitionsDefinition = new WithTransitionsDefinitionElements();
		this.pReferenceState = new ReferenceStateElements();
		this.pTransitionDefinition = new TransitionDefinitionElements();
		this.pTransitionID = new TransitionIDElements();
		this.pReferenceTransition = new ReferenceTransitionElements();
		this.pFromFieldDefinition = new FromFieldDefinitionElements();
		this.pInputDefinition = new InputDefinitionElements();
		this.pOutputDefinition = new OutputDefinitionElements();
		this.pExtendsDefinition = new ExtendsDefinitionElements();
		this.pPrimitive = new PrimitiveElements();
		this.pCompound = new CompoundElements();
		this.pField = new FieldElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
		this.pDefinitions = new DefinitionsElements();
		this.pReferences = new ReferencesElements();
		this.pInstances = new InstancesElements();
		this.pInput = new InputElements();
		this.pOutput = new OutputElements();
		this.pFrom = new FromElements();
		this.pWith = new WithElements();
		this.pExtends = new ExtendsElements();
		this.pNotOp = new NotOpElements();
		this.pAndOp = new AndOpElements();
		this.pOrOp = new OrOpElements();
		this.pSet = new SetElements();
		this.pTo = new ToElements();
		this.pUse = new UseElements();
		this.pCount = new CountElements();
		this.pInstance = new InstanceElements();
		this.pTransitionDeclaration = new TransitionDeclarationElements();
		this.pStateDeclaration = new StateDeclarationElements();
		this.pTransitionInstance = new TransitionInstanceElements();
		this.pStateInstance = new StateInstanceElements();
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
	//	experts+=ExpertDefinition*
	//	practitioners+=Practitioner*
	//	instructions+=Instruction*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	///* Executable Structure
	// * Below are the grammar rules for defining execution requests for the work interpreter.
	// */ Instruction:
	//	objectType='instruction' space=[Space] transition=[TransitionID];
	public InstructionElements getInstructionAccess() {
		return pInstruction;
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}
	
	//UseDefinition:
	//	use=Use predefinedValue=[StateID] field=FromFieldDefinition;
	public UseDefinitionElements getUseDefinitionAccess() {
		return pUseDefinition;
	}
	
	public ParserRule getUseDefinitionRule() {
		return getUseDefinitionAccess().getRule();
	}
	
	//Practitioner:
	//	practitionerDef='practitioner'
	//	user=User
	//	'{'
	//	knowledgeDef=KnowledgeDefinition?
	//	skillsDef=SkillsDefinition?
	//	'}';
	public PractitionerElements getPractitionerAccess() {
		return pPractitioner;
	}
	
	public ParserRule getPractitionerRule() {
		return getPractitionerAccess().getRule();
	}
	
	//ExpertDefinition:
	//	expertDef='expert' user=User
	//	'{'
	//	domainDef=DomainDefinition?
	//	knowledgeDef=KnowledgeDefinition?
	//	skillsDef=SkillsDefinition?
	//	'hourlyRate'
	//	'$' rate=INT
	//	'}';
	public ExpertDefinitionElements getExpertDefinitionAccess() {
		return pExpertDefinition;
	}
	
	public ParserRule getExpertDefinitionRule() {
		return getExpertDefinitionAccess().getRule();
	}
	
	//User:
	//	name=ID;
	public UserElements getUserAccess() {
		return pUser;
	}
	
	public ParserRule getUserRule() {
		return getUserAccess().getRule();
	}
	
	//DomainDefinition:
	//	domain='domain'
	//	'{'
	//	domainAreas+=ReferenceField*
	//	'}';
	public DomainDefinitionElements getDomainDefinitionAccess() {
		return pDomainDefinition;
	}
	
	public ParserRule getDomainDefinitionRule() {
		return getDomainDefinitionAccess().getRule();
	}
	
	//KnowledgeDefinition:
	//	knowledgeDef='knowledge' '{'
	//	knowledge+=ReferenceState*
	//	'}';
	public KnowledgeDefinitionElements getKnowledgeDefinitionAccess() {
		return pKnowledgeDefinition;
	}
	
	public ParserRule getKnowledgeDefinitionRule() {
		return getKnowledgeDefinitionAccess().getRule();
	}
	
	//SkillsDefinition:
	//	skillsDef='skills' '{'
	//	skills+=ReferenceTransition*
	//	'}';
	public SkillsDefinitionElements getSkillsDefinitionAccess() {
		return pSkillsDefinition;
	}
	
	public ParserRule getSkillsDefinitionRule() {
		return getSkillsDefinitionAccess().getRule();
	}
	
	//FieldDefinition:
	//	field=Field
	//	space=Space
	//	extends=ExtendsDefinition?
	//	'{'
	//	conceptualspace=Namespace?
	//	referencespace=Referencespace?
	//	instancespace=Instancespace?
	//	'}';
	public FieldDefinitionElements getFieldDefinitionAccess() {
		return pFieldDefinition;
	}
	
	public ParserRule getFieldDefinitionRule() {
		return getFieldDefinitionAccess().getRule();
	}
	
	//Space:
	//	name=ID;
	public SpaceElements getSpaceAccess() {
		return pSpace;
	}
	
	public ParserRule getSpaceRule() {
		return getSpaceAccess().getRule();
	}
	
	//Namespace:
	//	spaceType=Definitions
	//	'{'
	//	states+=StateObjectDefinition*
	//	transitions+=TransitionObjectDefinition*
	//	'}';
	public NamespaceElements getNamespaceAccess() {
		return pNamespace;
	}
	
	public ParserRule getNamespaceRule() {
		return getNamespaceAccess().getRule();
	}
	
	//Referencespace:
	//	spaceType=References
	//	'{'
	//	refFields+=ReferenceField*
	//	refStates+=ReferenceState*
	//	refTransition+=ReferenceTransition*
	//	'}';
	public ReferencespaceElements getReferencespaceAccess() {
		return pReferencespace;
	}
	
	public ParserRule getReferencespaceRule() {
		return getReferencespaceAccess().getRule();
	}
	
	//Instancespace:
	//	spaceType=Instances
	//	'{'
	//	instanceStates+=Instance*
	//	'}';
	public InstancespaceElements getInstancespaceAccess() {
		return pInstancespace;
	}
	
	public ParserRule getInstancespaceRule() {
		return getInstancespaceAccess().getRule();
	}
	
	//ReferenceField:
	//	ref=Field
	//	space=Space;
	public ReferenceFieldElements getReferenceFieldAccess() {
		return pReferenceField;
	}
	
	public ParserRule getReferenceFieldRule() {
		return getReferenceFieldAccess().getRule();
	}
	
	//StateObjectDefinition:
	//	(type=Primitive | type=Compound) state=StateDefinition;
	public StateObjectDefinitionElements getStateObjectDefinitionAccess() {
		return pStateObjectDefinition;
	}
	
	public ParserRule getStateObjectDefinitionRule() {
		return getStateObjectDefinitionAccess().getRule();
	}
	
	//TransitionObjectDefinition:
	//	(type=Primitive | type=Compound) transition=TransitionDefinition;
	public TransitionObjectDefinitionElements getTransitionObjectDefinitionAccess() {
		return pTransitionObjectDefinition;
	}
	
	public ParserRule getTransitionObjectDefinitionRule() {
		return getTransitionObjectDefinitionAccess().getRule();
	}
	
	//PrimitiveStateDefinition:
	//	object=State id=StateID;
	public PrimitiveStateDefinitionElements getPrimitiveStateDefinitionAccess() {
		return pPrimitiveStateDefinition;
	}
	
	public ParserRule getPrimitiveStateDefinitionRule() {
		return getPrimitiveStateDefinitionAccess().getRule();
	}
	
	//CompoundStateDefinition:
	//	object=State state=StateID compoundStateDef=WithStatesDefinition?;
	public CompoundStateDefinitionElements getCompoundStateDefinitionAccess() {
		return pCompoundStateDefinition;
	}
	
	public ParserRule getCompoundStateDefinitionRule() {
		return getCompoundStateDefinitionAccess().getRule();
	}
	
	//StateDefinition:
	//	object=State state=StateID withDefinition=WithStatesDefinition?;
	public StateDefinitionElements getStateDefinitionAccess() {
		return pStateDefinition;
	}
	
	public ParserRule getStateDefinitionRule() {
		return getStateDefinitionAccess().getRule();
	}
	
	//StateID:
	//	name=ID;
	public StateIDElements getStateIDAccess() {
		return pStateID;
	}
	
	public ParserRule getStateIDRule() {
		return getStateIDAccess().getRule();
	}
	
	//WithStatesDefinition:
	//	composition=With
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
	//	composition=With
	//	'{'
	//	transitions=TransitionalExpression
	//	'}';
	public WithTransitionsDefinitionElements getWithTransitionsDefinitionAccess() {
		return pWithTransitionsDefinition;
	}
	
	public ParserRule getWithTransitionsDefinitionRule() {
		return getWithTransitionsDefinitionAccess().getRule();
	}
	
	//ReferenceState:
	//	object=State
	//	refState=[StateID] from=FromFieldDefinition (('called' | 'as') state=StateID)?
	//	composition=WithStatesDefinition?;
	public ReferenceStateElements getReferenceStateAccess() {
		return pReferenceState;
	}
	
	public ParserRule getReferenceStateRule() {
		return getReferenceStateAccess().getRule();
	}
	
	//TransitionDefinition:
	//	object=Transition transition=TransitionID in=InputDefinition? out=OutputDefinition
	//	composition=WithTransitionsDefinition?;
	public TransitionDefinitionElements getTransitionDefinitionAccess() {
		return pTransitionDefinition;
	}
	
	public ParserRule getTransitionDefinitionRule() {
		return getTransitionDefinitionAccess().getRule();
	}
	
	//TransitionID:
	//	name=ID;
	public TransitionIDElements getTransitionIDAccess() {
		return pTransitionID;
	}
	
	public ParserRule getTransitionIDRule() {
		return getTransitionIDAccess().getRule();
	}
	
	//ReferenceTransition:
	//	object=Transition
	//	refTransition=[TransitionID] fromDef=FromFieldDefinition (('called' | 'as') transition=TransitionID)?
	//	composition=WithTransitionsDefinition?;
	public ReferenceTransitionElements getReferenceTransitionAccess() {
		return pReferenceTransition;
	}
	
	public ParserRule getReferenceTransitionRule() {
		return getReferenceTransitionAccess().getRule();
	}
	
	//FromFieldDefinition:
	//	from=From
	//	refSpace=[Space];
	public FromFieldDefinitionElements getFromFieldDefinitionAccess() {
		return pFromFieldDefinition;
	}
	
	public ParserRule getFromFieldDefinitionRule() {
		return getFromFieldDefinitionAccess().getRule();
	}
	
	//InputDefinition:
	//	input=Input inputState+=[StateID]*;
	public InputDefinitionElements getInputDefinitionAccess() {
		return pInputDefinition;
	}
	
	public ParserRule getInputDefinitionRule() {
		return getInputDefinitionAccess().getRule();
	}
	
	//OutputDefinition:
	//	output=Output outputState=[StateID];
	public OutputDefinitionElements getOutputDefinitionAccess() {
		return pOutputDefinition;
	}
	
	public ParserRule getOutputDefinitionRule() {
		return getOutputDefinitionAccess().getRule();
	}
	
	//ExtendsDefinition:
	//	type=Extends
	//	namespaces+=[Space]+;
	public ExtendsDefinitionElements getExtendsDefinitionAccess() {
		return pExtendsDefinition;
	}
	
	public ParserRule getExtendsDefinitionRule() {
		return getExtendsDefinitionAccess().getRule();
	}
	
	//Primitive:
	//	'primitive';
	public PrimitiveElements getPrimitiveAccess() {
		return pPrimitive;
	}
	
	public ParserRule getPrimitiveRule() {
		return getPrimitiveAccess().getRule();
	}
	
	//Compound:
	//	'compound';
	public CompoundElements getCompoundAccess() {
		return pCompound;
	}
	
	public ParserRule getCompoundRule() {
		return getCompoundAccess().getRule();
	}
	
	//Field:
	//	'field';
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}
	
	//State:
	//	'state';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition:
	//	'transition';
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//Definitions:
	//	'definitions';
	public DefinitionsElements getDefinitionsAccess() {
		return pDefinitions;
	}
	
	public ParserRule getDefinitionsRule() {
		return getDefinitionsAccess().getRule();
	}
	
	//References:
	//	'references';
	public ReferencesElements getReferencesAccess() {
		return pReferences;
	}
	
	public ParserRule getReferencesRule() {
		return getReferencesAccess().getRule();
	}
	
	//Instances:
	//	'instances';
	public InstancesElements getInstancesAccess() {
		return pInstances;
	}
	
	public ParserRule getInstancesRule() {
		return getInstancesAccess().getRule();
	}
	
	//Input:
	//	'input';
	public InputElements getInputAccess() {
		return pInput;
	}
	
	public ParserRule getInputRule() {
		return getInputAccess().getRule();
	}
	
	//Output:
	//	'output';
	public OutputElements getOutputAccess() {
		return pOutput;
	}
	
	public ParserRule getOutputRule() {
		return getOutputAccess().getRule();
	}
	
	//From:
	//	'from';
	public FromElements getFromAccess() {
		return pFrom;
	}
	
	public ParserRule getFromRule() {
		return getFromAccess().getRule();
	}
	
	//With:
	//	'with';
	public WithElements getWithAccess() {
		return pWith;
	}
	
	public ParserRule getWithRule() {
		return getWithAccess().getRule();
	}
	
	//Extends:
	//	'extends';
	public ExtendsElements getExtendsAccess() {
		return pExtends;
	}
	
	public ParserRule getExtendsRule() {
		return getExtendsAccess().getRule();
	}
	
	//NotOp:
	//	'NOT';
	public NotOpElements getNotOpAccess() {
		return pNotOp;
	}
	
	public ParserRule getNotOpRule() {
		return getNotOpAccess().getRule();
	}
	
	//AndOp:
	//	'AND';
	public AndOpElements getAndOpAccess() {
		return pAndOp;
	}
	
	public ParserRule getAndOpRule() {
		return getAndOpAccess().getRule();
	}
	
	//OrOp:
	//	'OR';
	public OrOpElements getOrOpAccess() {
		return pOrOp;
	}
	
	public ParserRule getOrOpRule() {
		return getOrOpAccess().getRule();
	}
	
	//Set:
	//	'set';
	public SetElements getSetAccess() {
		return pSet;
	}
	
	public ParserRule getSetRule() {
		return getSetAccess().getRule();
	}
	
	//To:
	//	'to';
	public ToElements getToAccess() {
		return pTo;
	}
	
	public ParserRule getToRule() {
		return getToAccess().getRule();
	}
	
	//Use:
	//	'use';
	public UseElements getUseAccess() {
		return pUse;
	}
	
	public ParserRule getUseRule() {
		return getUseAccess().getRule();
	}
	
	//Count:
	//	INT;
	public CountElements getCountAccess() {
		return pCount;
	}
	
	public ParserRule getCountRule() {
		return getCountAccess().getRule();
	}
	
	//Instance:
	//	instanceDef='instance' (transitionDeclaration=TransitionDeclaration | stateDeclaration=StateDeclaration) name=STRING
	//	(state=StateInstance | transition=TransitionInstance);
	public InstanceElements getInstanceAccess() {
		return pInstance;
	}
	
	public ParserRule getInstanceRule() {
		return getInstanceAccess().getRule();
	}
	
	//TransitionDeclaration:
	//	objectType=Transition transition=TransitionID;
	public TransitionDeclarationElements getTransitionDeclarationAccess() {
		return pTransitionDeclaration;
	}
	
	public ParserRule getTransitionDeclarationRule() {
		return getTransitionDeclarationAccess().getRule();
	}
	
	//StateDeclaration:
	//	objectType=State state=StateID;
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
	
	//SetStatement:
	//	statement=Set variable=[StateID] toDef=ToDefinition;
	public SetStatementElements getSetStatementAccess() {
		return pSetStatement;
	}
	
	public ParserRule getSetStatementRule() {
		return getSetStatementAccess().getRule();
	}
	
	//ToDefinition:
	//	to=To value=STRING;
	public ToDefinitionElements getToDefinitionAccess() {
		return pToDefinition;
	}
	
	public ParserRule getToDefinitionRule() {
		return getToDefinitionAccess().getRule();
	}
	
	////State Composition Expression Rules
	//Predicate:
	//	negation?=NotOp? expression=BinaryExpression;
	public PredicateElements getPredicateAccess() {
		return pPredicate;
	}
	
	public ParserRule getPredicateRule() {
		return getPredicateAccess().getRule();
	}
	
	//BinaryExpression:
	//	TerminalBinaryExpression ({Operation.left=current} op=(AndOp | OrOp) right=TerminalBinaryExpression)*;
	public BinaryExpressionElements getBinaryExpressionAccess() {
		return pBinaryExpression;
	}
	
	public ParserRule getBinaryExpressionRule() {
		return getBinaryExpressionAccess().getRule();
	}
	
	//TerminalBinaryExpression BinaryExpression:
	//	'(' Predicate ')' | {StateID} instance=[StateID] | {StateID} (list?='setOf' value=[StateID]);
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
