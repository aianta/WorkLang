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
grammar InternalWork;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.worklang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.worklang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.worklang.services.WorkGrammarAccess;

}

@parser::members {

 	private WorkGrammarAccess grammarAccess;

    public InternalWorkParser(TokenStream input, WorkGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected WorkGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getFieldsFieldDefinitionParserRuleCall_0_0());
				}
				lv_fields_0_0=ruleFieldDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"fields",
						lv_fields_0_0,
						"org.worklang.Work.FieldDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getExpertsExpertDefinitionParserRuleCall_1_0());
				}
				lv_experts_1_0=ruleExpertDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"experts",
						lv_experts_1_0,
						"org.worklang.Work.ExpertDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getPractitionersPractitionerParserRuleCall_2_0());
				}
				lv_practitioners_2_0=rulePractitioner
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"practitioners",
						lv_practitioners_2_0,
						"org.worklang.Work.Practitioner");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getInstructionsInstructionParserRuleCall_3_0());
				}
				lv_instructions_3_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_3_0,
						"org.worklang.Work.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_objectType_0_0='instruction'
				{
					newLeafNode(lv_objectType_0_0, grammarAccess.getInstructionAccess().getObjectTypeInstructionKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstructionRule());
					}
					setWithLastConsumed($current, "objectType", lv_objectType_0_0, "instruction");
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstructionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getInstructionAccess().getSpaceSpaceCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstructionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getInstructionAccess().getTransitionTransitionIDCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleUseDefinition
entryRuleUseDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUseDefinitionRule()); }
	iv_ruleUseDefinition=ruleUseDefinition
	{ $current=$iv_ruleUseDefinition.current; }
	EOF;

// Rule UseDefinition
ruleUseDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getUseDefinitionAccess().getUseUseParserRuleCall_0_0());
				}
				lv_use_0_0=ruleUse
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseDefinitionRule());
					}
					set(
						$current,
						"use",
						lv_use_0_0,
						"org.worklang.Work.Use");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUseDefinitionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getUseDefinitionAccess().getPredefinedValueStateIDCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getUseDefinitionAccess().getFieldFromFieldDefinitionParserRuleCall_2_0());
				}
				lv_field_2_0=ruleFromFieldDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseDefinitionRule());
					}
					set(
						$current,
						"field",
						lv_field_2_0,
						"org.worklang.Work.FromFieldDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePractitioner
entryRulePractitioner returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPractitionerRule()); }
	iv_rulePractitioner=rulePractitioner
	{ $current=$iv_rulePractitioner.current; }
	EOF;

// Rule Practitioner
rulePractitioner returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_practitionerDef_0_0='practitioner'
				{
					newLeafNode(lv_practitionerDef_0_0, grammarAccess.getPractitionerAccess().getPractitionerDefPractitionerKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPractitionerRule());
					}
					setWithLastConsumed($current, "practitionerDef", lv_practitionerDef_0_0, "practitioner");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPractitionerAccess().getUserUserParserRuleCall_1_0());
				}
				lv_user_1_0=ruleUser
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPractitionerRule());
					}
					set(
						$current,
						"user",
						lv_user_1_0,
						"org.worklang.Work.User");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPractitionerAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPractitionerAccess().getKnowledgeDefKnowledgeDefinitionParserRuleCall_3_0());
				}
				lv_knowledgeDef_3_0=ruleKnowledgeDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPractitionerRule());
					}
					set(
						$current,
						"knowledgeDef",
						lv_knowledgeDef_3_0,
						"org.worklang.Work.KnowledgeDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getPractitionerAccess().getSkillsDefSkillsDefinitionParserRuleCall_4_0());
				}
				lv_skillsDef_4_0=ruleSkillsDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPractitionerRule());
					}
					set(
						$current,
						"skillsDef",
						lv_skillsDef_4_0,
						"org.worklang.Work.SkillsDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getPractitionerAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleExpertDefinition
entryRuleExpertDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpertDefinitionRule()); }
	iv_ruleExpertDefinition=ruleExpertDefinition
	{ $current=$iv_ruleExpertDefinition.current; }
	EOF;

// Rule ExpertDefinition
ruleExpertDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_expertDef_0_0='expert'
				{
					newLeafNode(lv_expertDef_0_0, grammarAccess.getExpertDefinitionAccess().getExpertDefExpertKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExpertDefinitionRule());
					}
					setWithLastConsumed($current, "expertDef", lv_expertDef_0_0, "expert");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExpertDefinitionAccess().getUserUserParserRuleCall_1_0());
				}
				lv_user_1_0=ruleUser
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpertDefinitionRule());
					}
					set(
						$current,
						"user",
						lv_user_1_0,
						"org.worklang.Work.User");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getExpertDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExpertDefinitionAccess().getDomainDefDomainDefinitionParserRuleCall_3_0());
				}
				lv_domainDef_3_0=ruleDomainDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpertDefinitionRule());
					}
					set(
						$current,
						"domainDef",
						lv_domainDef_3_0,
						"org.worklang.Work.DomainDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getExpertDefinitionAccess().getKnowledgeDefKnowledgeDefinitionParserRuleCall_4_0());
				}
				lv_knowledgeDef_4_0=ruleKnowledgeDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpertDefinitionRule());
					}
					set(
						$current,
						"knowledgeDef",
						lv_knowledgeDef_4_0,
						"org.worklang.Work.KnowledgeDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getExpertDefinitionAccess().getSkillsDefSkillsDefinitionParserRuleCall_5_0());
				}
				lv_skillsDef_5_0=ruleSkillsDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpertDefinitionRule());
					}
					set(
						$current,
						"skillsDef",
						lv_skillsDef_5_0,
						"org.worklang.Work.SkillsDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_6='hourlyRate'
		{
			newLeafNode(otherlv_6, grammarAccess.getExpertDefinitionAccess().getHourlyRateKeyword_6());
		}
		otherlv_7='$'
		{
			newLeafNode(otherlv_7, grammarAccess.getExpertDefinitionAccess().getDollarSignKeyword_7());
		}
		(
			(
				lv_rate_8_0=RULE_INT
				{
					newLeafNode(lv_rate_8_0, grammarAccess.getExpertDefinitionAccess().getRateINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExpertDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"rate",
						lv_rate_8_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getExpertDefinitionAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleUser
entryRuleUser returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUserRule()); }
	iv_ruleUser=ruleUser
	{ $current=$iv_ruleUser.current; }
	EOF;

// Rule User
ruleUser returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getUserRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleDomainDefinition
entryRuleDomainDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainDefinitionRule()); }
	iv_ruleDomainDefinition=ruleDomainDefinition
	{ $current=$iv_ruleDomainDefinition.current; }
	EOF;

// Rule DomainDefinition
ruleDomainDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_domain_0_0='domain'
				{
					newLeafNode(lv_domain_0_0, grammarAccess.getDomainDefinitionAccess().getDomainDomainKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDomainDefinitionRule());
					}
					setWithLastConsumed($current, "domain", lv_domain_0_0, "domain");
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDomainDefinitionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainDefinitionAccess().getDomainAreasReferenceFieldParserRuleCall_2_0());
				}
				lv_domainAreas_2_0=ruleReferenceField
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainDefinitionRule());
					}
					add(
						$current,
						"domainAreas",
						lv_domainAreas_2_0,
						"org.worklang.Work.ReferenceField");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getDomainDefinitionAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleKnowledgeDefinition
entryRuleKnowledgeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKnowledgeDefinitionRule()); }
	iv_ruleKnowledgeDefinition=ruleKnowledgeDefinition
	{ $current=$iv_ruleKnowledgeDefinition.current; }
	EOF;

// Rule KnowledgeDefinition
ruleKnowledgeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_knowledgeDef_0_0='knowledge'
				{
					newLeafNode(lv_knowledgeDef_0_0, grammarAccess.getKnowledgeDefinitionAccess().getKnowledgeDefKnowledgeKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKnowledgeDefinitionRule());
					}
					setWithLastConsumed($current, "knowledgeDef", lv_knowledgeDef_0_0, "knowledge");
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getKnowledgeDefinitionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getKnowledgeDefinitionAccess().getKnowledgeReferenceStateParserRuleCall_2_0());
				}
				lv_knowledge_2_0=ruleReferenceState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKnowledgeDefinitionRule());
					}
					add(
						$current,
						"knowledge",
						lv_knowledge_2_0,
						"org.worklang.Work.ReferenceState");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getKnowledgeDefinitionAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleSkillsDefinition
entryRuleSkillsDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSkillsDefinitionRule()); }
	iv_ruleSkillsDefinition=ruleSkillsDefinition
	{ $current=$iv_ruleSkillsDefinition.current; }
	EOF;

// Rule SkillsDefinition
ruleSkillsDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_skillsDef_0_0='skills'
				{
					newLeafNode(lv_skillsDef_0_0, grammarAccess.getSkillsDefinitionAccess().getSkillsDefSkillsKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSkillsDefinitionRule());
					}
					setWithLastConsumed($current, "skillsDef", lv_skillsDef_0_0, "skills");
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getSkillsDefinitionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSkillsDefinitionAccess().getSkillsReferenceTransitionParserRuleCall_2_0());
				}
				lv_skills_2_0=ruleReferenceTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSkillsDefinitionRule());
					}
					add(
						$current,
						"skills",
						lv_skills_2_0,
						"org.worklang.Work.ReferenceTransition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getSkillsDefinitionAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleFieldDefinition
entryRuleFieldDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldDefinitionRule()); }
	iv_ruleFieldDefinition=ruleFieldDefinition
	{ $current=$iv_ruleFieldDefinition.current; }
	EOF;

// Rule FieldDefinition
ruleFieldDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getFieldFieldParserRuleCall_0_0());
				}
				lv_field_0_0=ruleField
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
					}
					set(
						$current,
						"field",
						lv_field_0_0,
						"org.worklang.Work.Field");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getSpaceSpaceParserRuleCall_1_0());
				}
				lv_space_1_0=ruleSpace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
					}
					set(
						$current,
						"space",
						lv_space_1_0,
						"org.worklang.Work.Space");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getExtendsExtendsDefinitionParserRuleCall_2_0());
				}
				lv_extends_2_0=ruleExtendsDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
					}
					set(
						$current,
						"extends",
						lv_extends_2_0,
						"org.worklang.Work.ExtendsDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getFieldDefinitionAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getConceptualspaceNamespaceParserRuleCall_4_0());
				}
				lv_conceptualspace_4_0=ruleNamespace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
					}
					set(
						$current,
						"conceptualspace",
						lv_conceptualspace_4_0,
						"org.worklang.Work.Namespace");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getReferencespaceReferencespaceParserRuleCall_5_0());
				}
				lv_referencespace_5_0=ruleReferencespace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
					}
					set(
						$current,
						"referencespace",
						lv_referencespace_5_0,
						"org.worklang.Work.Referencespace");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getInstancespaceInstancespaceParserRuleCall_6_0());
				}
				lv_instancespace_6_0=ruleInstancespace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
					}
					set(
						$current,
						"instancespace",
						lv_instancespace_6_0,
						"org.worklang.Work.Instancespace");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getFieldDefinitionAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleSpace
entryRuleSpace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpaceRule()); }
	iv_ruleSpace=ruleSpace
	{ $current=$iv_ruleSpace.current; }
	EOF;

// Rule Space
ruleSpace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getSpaceAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSpaceRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleNamespace
entryRuleNamespace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamespaceRule()); }
	iv_ruleNamespace=ruleNamespace
	{ $current=$iv_ruleNamespace.current; }
	EOF;

// Rule Namespace
ruleNamespace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getSpaceTypeDefinitionsParserRuleCall_0_0());
				}
				lv_spaceType_0_0=ruleDefinitions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					set(
						$current,
						"spaceType",
						lv_spaceType_0_0,
						"org.worklang.Work.Definitions");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getStatesStateObjectDefinitionParserRuleCall_2_0());
				}
				lv_states_2_0=ruleStateObjectDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					add(
						$current,
						"states",
						lv_states_2_0,
						"org.worklang.Work.StateObjectDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getTransitionsTransitionObjectDefinitionParserRuleCall_3_0());
				}
				lv_transitions_3_0=ruleTransitionObjectDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					add(
						$current,
						"transitions",
						lv_transitions_3_0,
						"org.worklang.Work.TransitionObjectDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleReferencespace
entryRuleReferencespace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferencespaceRule()); }
	iv_ruleReferencespace=ruleReferencespace
	{ $current=$iv_ruleReferencespace.current; }
	EOF;

// Rule Referencespace
ruleReferencespace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getReferencespaceAccess().getSpaceTypeReferencesParserRuleCall_0_0());
				}
				lv_spaceType_0_0=ruleReferences
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferencespaceRule());
					}
					set(
						$current,
						"spaceType",
						lv_spaceType_0_0,
						"org.worklang.Work.References");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getReferencespaceAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReferencespaceAccess().getRefFieldsReferenceFieldParserRuleCall_2_0());
				}
				lv_refFields_2_0=ruleReferenceField
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferencespaceRule());
					}
					add(
						$current,
						"refFields",
						lv_refFields_2_0,
						"org.worklang.Work.ReferenceField");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getReferencespaceAccess().getRefStatesReferenceStateParserRuleCall_3_0());
				}
				lv_refStates_3_0=ruleReferenceState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferencespaceRule());
					}
					add(
						$current,
						"refStates",
						lv_refStates_3_0,
						"org.worklang.Work.ReferenceState");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getReferencespaceAccess().getRefTransitionReferenceTransitionParserRuleCall_4_0());
				}
				lv_refTransition_4_0=ruleReferenceTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferencespaceRule());
					}
					add(
						$current,
						"refTransition",
						lv_refTransition_4_0,
						"org.worklang.Work.ReferenceTransition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getReferencespaceAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleInstancespace
entryRuleInstancespace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstancespaceRule()); }
	iv_ruleInstancespace=ruleInstancespace
	{ $current=$iv_ruleInstancespace.current; }
	EOF;

// Rule Instancespace
ruleInstancespace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getInstancespaceAccess().getSpaceTypeInstancesParserRuleCall_0_0());
				}
				lv_spaceType_0_0=ruleInstances
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstancespaceRule());
					}
					set(
						$current,
						"spaceType",
						lv_spaceType_0_0,
						"org.worklang.Work.Instances");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getInstancespaceAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInstancespaceAccess().getInstanceStatesInstanceParserRuleCall_2_0());
				}
				lv_instanceStates_2_0=ruleInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstancespaceRule());
					}
					add(
						$current,
						"instanceStates",
						lv_instanceStates_2_0,
						"org.worklang.Work.Instance");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getInstancespaceAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleReferenceField
entryRuleReferenceField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferenceFieldRule()); }
	iv_ruleReferenceField=ruleReferenceField
	{ $current=$iv_ruleReferenceField.current; }
	EOF;

// Rule ReferenceField
ruleReferenceField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceFieldAccess().getRefFieldParserRuleCall_0_0());
				}
				lv_ref_0_0=ruleField
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceFieldRule());
					}
					set(
						$current,
						"ref",
						lv_ref_0_0,
						"org.worklang.Work.Field");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceFieldAccess().getSpaceSpaceParserRuleCall_1_0());
				}
				lv_space_1_0=ruleSpace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceFieldRule());
					}
					set(
						$current,
						"space",
						lv_space_1_0,
						"org.worklang.Work.Space");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStateObjectDefinition
entryRuleStateObjectDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateObjectDefinitionRule()); }
	iv_ruleStateObjectDefinition=ruleStateObjectDefinition
	{ $current=$iv_ruleStateObjectDefinition.current; }
	EOF;

// Rule StateObjectDefinition
ruleStateObjectDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStateObjectDefinitionAccess().getTypePrimitiveParserRuleCall_0_0_0());
					}
					lv_type_0_0=rulePrimitive
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateObjectDefinitionRule());
						}
						set(
							$current,
							"type",
							lv_type_0_0,
							"org.worklang.Work.Primitive");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getStateObjectDefinitionAccess().getTypeCompoundParserRuleCall_0_1_0());
					}
					lv_type_1_0=ruleCompound
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateObjectDefinitionRule());
						}
						set(
							$current,
							"type",
							lv_type_1_0,
							"org.worklang.Work.Compound");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateObjectDefinitionAccess().getStateStateDefinitionParserRuleCall_1_0());
				}
				lv_state_2_0=ruleStateDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateObjectDefinitionRule());
					}
					set(
						$current,
						"state",
						lv_state_2_0,
						"org.worklang.Work.StateDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTransitionObjectDefinition
entryRuleTransitionObjectDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionObjectDefinitionRule()); }
	iv_ruleTransitionObjectDefinition=ruleTransitionObjectDefinition
	{ $current=$iv_ruleTransitionObjectDefinition.current; }
	EOF;

// Rule TransitionObjectDefinition
ruleTransitionObjectDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionObjectDefinitionAccess().getTypePrimitiveParserRuleCall_0_0_0());
					}
					lv_type_0_0=rulePrimitive
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionObjectDefinitionRule());
						}
						set(
							$current,
							"type",
							lv_type_0_0,
							"org.worklang.Work.Primitive");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionObjectDefinitionAccess().getTypeCompoundParserRuleCall_0_1_0());
					}
					lv_type_1_0=ruleCompound
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionObjectDefinitionRule());
						}
						set(
							$current,
							"type",
							lv_type_1_0,
							"org.worklang.Work.Compound");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionObjectDefinitionAccess().getTransitionTransitionDefinitionParserRuleCall_1_0());
				}
				lv_transition_2_0=ruleTransitionDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionObjectDefinitionRule());
					}
					set(
						$current,
						"transition",
						lv_transition_2_0,
						"org.worklang.Work.TransitionDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStateDefinition
entryRuleStateDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateDefinitionRule()); }
	iv_ruleStateDefinition=ruleStateDefinition
	{ $current=$iv_ruleStateDefinition.current; }
	EOF;

// Rule StateDefinition
ruleStateDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStateDefinitionAccess().getObjectStateParserRuleCall_0_0());
				}
				lv_object_0_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateDefinitionRule());
					}
					set(
						$current,
						"object",
						lv_object_0_0,
						"org.worklang.Work.State");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateDefinitionAccess().getStateStateIDParserRuleCall_1_0());
				}
				lv_state_1_0=ruleStateID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateDefinitionRule());
					}
					set(
						$current,
						"state",
						lv_state_1_0,
						"org.worklang.Work.StateID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateDefinitionAccess().getWithDefinitionWithStatesDefinitionParserRuleCall_2_0());
				}
				lv_withDefinition_2_0=ruleWithStatesDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateDefinitionRule());
					}
					set(
						$current,
						"withDefinition",
						lv_withDefinition_2_0,
						"org.worklang.Work.WithStatesDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleStateID
entryRuleStateID returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateIDRule()); }
	iv_ruleStateID=ruleStateID
	{ $current=$iv_ruleStateID.current; }
	EOF;

// Rule StateID
ruleStateID returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getStateIDAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStateIDRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleWithStatesDefinition
entryRuleWithStatesDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWithStatesDefinitionRule()); }
	iv_ruleWithStatesDefinition=ruleWithStatesDefinition
	{ $current=$iv_ruleWithStatesDefinition.current; }
	EOF;

// Rule WithStatesDefinition
ruleWithStatesDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getWithStatesDefinitionAccess().getCompositionWithParserRuleCall_0_0());
				}
				lv_composition_0_0=ruleWith
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWithStatesDefinitionRule());
					}
					set(
						$current,
						"composition",
						lv_composition_0_0,
						"org.worklang.Work.With");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getWithStatesDefinitionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWithStatesDefinitionAccess().getPredicatePredicateParserRuleCall_2_0());
				}
				lv_predicate_2_0=rulePredicate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWithStatesDefinitionRule());
					}
					set(
						$current,
						"predicate",
						lv_predicate_2_0,
						"org.worklang.Work.Predicate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getWithStatesDefinitionAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleWithTransitionsDefinition
entryRuleWithTransitionsDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWithTransitionsDefinitionRule()); }
	iv_ruleWithTransitionsDefinition=ruleWithTransitionsDefinition
	{ $current=$iv_ruleWithTransitionsDefinition.current; }
	EOF;

// Rule WithTransitionsDefinition
ruleWithTransitionsDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getWithTransitionsDefinitionAccess().getCompositionWithParserRuleCall_0_0());
				}
				lv_composition_0_0=ruleWith
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWithTransitionsDefinitionRule());
					}
					set(
						$current,
						"composition",
						lv_composition_0_0,
						"org.worklang.Work.With");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getWithTransitionsDefinitionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWithTransitionsDefinitionAccess().getTransitionsTransitionalExpressionParserRuleCall_2_0());
				}
				lv_transitions_2_0=ruleTransitionalExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWithTransitionsDefinitionRule());
					}
					set(
						$current,
						"transitions",
						lv_transitions_2_0,
						"org.worklang.Work.TransitionalExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getWithTransitionsDefinitionAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleReferenceState
entryRuleReferenceState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferenceStateRule()); }
	iv_ruleReferenceState=ruleReferenceState
	{ $current=$iv_ruleReferenceState.current; }
	EOF;

// Rule ReferenceState
ruleReferenceState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceStateAccess().getObjectStateParserRuleCall_0_0());
				}
				lv_object_0_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceStateRule());
					}
					set(
						$current,
						"object",
						lv_object_0_0,
						"org.worklang.Work.State");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceStateRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getReferenceStateAccess().getRefStateStateIDCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceStateAccess().getFromFromFieldDefinitionParserRuleCall_2_0());
				}
				lv_from_2_0=ruleFromFieldDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceStateRule());
					}
					set(
						$current,
						"from",
						lv_from_2_0,
						"org.worklang.Work.FromFieldDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_3='called'
				{
					newLeafNode(otherlv_3, grammarAccess.getReferenceStateAccess().getCalledKeyword_3_0_0());
				}
				    |
				otherlv_4='as'
				{
					newLeafNode(otherlv_4, grammarAccess.getReferenceStateAccess().getAsKeyword_3_0_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getReferenceStateAccess().getStateStateIDParserRuleCall_3_1_0());
					}
					lv_state_5_0=ruleStateID
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getReferenceStateRule());
						}
						set(
							$current,
							"state",
							lv_state_5_0,
							"org.worklang.Work.StateID");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceStateAccess().getCompositionWithStatesDefinitionParserRuleCall_4_0());
				}
				lv_composition_6_0=ruleWithStatesDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceStateRule());
					}
					set(
						$current,
						"composition",
						lv_composition_6_0,
						"org.worklang.Work.WithStatesDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleTransitionDefinition
entryRuleTransitionDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionDefinitionRule()); }
	iv_ruleTransitionDefinition=ruleTransitionDefinition
	{ $current=$iv_ruleTransitionDefinition.current; }
	EOF;

// Rule TransitionDefinition
ruleTransitionDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getObjectTransitionParserRuleCall_0_0());
				}
				lv_object_0_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionDefinitionRule());
					}
					set(
						$current,
						"object",
						lv_object_0_0,
						"org.worklang.Work.Transition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getTransitionTransitionIDParserRuleCall_1_0());
				}
				lv_transition_1_0=ruleTransitionID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionDefinitionRule());
					}
					set(
						$current,
						"transition",
						lv_transition_1_0,
						"org.worklang.Work.TransitionID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getInInputDefinitionParserRuleCall_2_0());
				}
				lv_in_2_0=ruleInputDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionDefinitionRule());
					}
					set(
						$current,
						"in",
						lv_in_2_0,
						"org.worklang.Work.InputDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getOutOutputDefinitionParserRuleCall_3_0());
				}
				lv_out_3_0=ruleOutputDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionDefinitionRule());
					}
					set(
						$current,
						"out",
						lv_out_3_0,
						"org.worklang.Work.OutputDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getCompositionWithTransitionsDefinitionParserRuleCall_4_0());
				}
				lv_composition_4_0=ruleWithTransitionsDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionDefinitionRule());
					}
					set(
						$current,
						"composition",
						lv_composition_4_0,
						"org.worklang.Work.WithTransitionsDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleTransitionID
entryRuleTransitionID returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionIDRule()); }
	iv_ruleTransitionID=ruleTransitionID
	{ $current=$iv_ruleTransitionID.current; }
	EOF;

// Rule TransitionID
ruleTransitionID returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getTransitionIDAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTransitionIDRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleReferenceTransition
entryRuleReferenceTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferenceTransitionRule()); }
	iv_ruleReferenceTransition=ruleReferenceTransition
	{ $current=$iv_ruleReferenceTransition.current; }
	EOF;

// Rule ReferenceTransition
ruleReferenceTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceTransitionAccess().getObjectTransitionParserRuleCall_0_0());
				}
				lv_object_0_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceTransitionRule());
					}
					set(
						$current,
						"object",
						lv_object_0_0,
						"org.worklang.Work.Transition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceTransitionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getReferenceTransitionAccess().getRefTransitionTransitionIDCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceTransitionAccess().getFromDefFromFieldDefinitionParserRuleCall_2_0());
				}
				lv_fromDef_2_0=ruleFromFieldDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceTransitionRule());
					}
					set(
						$current,
						"fromDef",
						lv_fromDef_2_0,
						"org.worklang.Work.FromFieldDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_3='called'
				{
					newLeafNode(otherlv_3, grammarAccess.getReferenceTransitionAccess().getCalledKeyword_3_0_0());
				}
				    |
				otherlv_4='as'
				{
					newLeafNode(otherlv_4, grammarAccess.getReferenceTransitionAccess().getAsKeyword_3_0_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getReferenceTransitionAccess().getTransitionTransitionIDParserRuleCall_3_1_0());
					}
					lv_transition_5_0=ruleTransitionID
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getReferenceTransitionRule());
						}
						set(
							$current,
							"transition",
							lv_transition_5_0,
							"org.worklang.Work.TransitionID");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceTransitionAccess().getCompositionWithTransitionsDefinitionParserRuleCall_4_0());
				}
				lv_composition_6_0=ruleWithTransitionsDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceTransitionRule());
					}
					set(
						$current,
						"composition",
						lv_composition_6_0,
						"org.worklang.Work.WithTransitionsDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleFromFieldDefinition
entryRuleFromFieldDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFromFieldDefinitionRule()); }
	iv_ruleFromFieldDefinition=ruleFromFieldDefinition
	{ $current=$iv_ruleFromFieldDefinition.current; }
	EOF;

// Rule FromFieldDefinition
ruleFromFieldDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFromFieldDefinitionAccess().getFromFromParserRuleCall_0_0());
				}
				lv_from_0_0=ruleFrom
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFromFieldDefinitionRule());
					}
					set(
						$current,
						"from",
						lv_from_0_0,
						"org.worklang.Work.From");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFromFieldDefinitionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getFromFieldDefinitionAccess().getRefSpaceSpaceCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleInputDefinition
entryRuleInputDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputDefinitionRule()); }
	iv_ruleInputDefinition=ruleInputDefinition
	{ $current=$iv_ruleInputDefinition.current; }
	EOF;

// Rule InputDefinition
ruleInputDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getInputDefinitionAccess().getInputInputParserRuleCall_0_0());
				}
				lv_input_0_0=ruleInput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInputDefinitionRule());
					}
					set(
						$current,
						"input",
						lv_input_0_0,
						"org.worklang.Work.Input");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputDefinitionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getInputDefinitionAccess().getInputStateStateIDCrossReference_1_0());
				}
			)
		)*
	)
;

// Entry rule entryRuleOutputDefinition
entryRuleOutputDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputDefinitionRule()); }
	iv_ruleOutputDefinition=ruleOutputDefinition
	{ $current=$iv_ruleOutputDefinition.current; }
	EOF;

// Rule OutputDefinition
ruleOutputDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getOutputDefinitionAccess().getOutputOutputParserRuleCall_0_0());
				}
				lv_output_0_0=ruleOutput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutputDefinitionRule());
					}
					set(
						$current,
						"output",
						lv_output_0_0,
						"org.worklang.Work.Output");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputDefinitionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getOutputDefinitionAccess().getOutputStateStateIDCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleExtendsDefinition
entryRuleExtendsDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtendsDefinitionRule()); }
	iv_ruleExtendsDefinition=ruleExtendsDefinition
	{ $current=$iv_ruleExtendsDefinition.current; }
	EOF;

// Rule ExtendsDefinition
ruleExtendsDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExtendsDefinitionAccess().getTypeExtendsParserRuleCall_0_0());
				}
				lv_type_0_0=ruleExtends
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExtendsDefinitionRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"org.worklang.Work.Extends");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExtendsDefinitionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getExtendsDefinitionAccess().getNamespacesSpaceCrossReference_1_0());
				}
			)
		)+
	)
;

// Entry rule entryRulePrimitive
entryRulePrimitive returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveRule()); }
	iv_rulePrimitive=rulePrimitive
	{ $current=$iv_rulePrimitive.current.getText(); }
	EOF;

// Rule Primitive
rulePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='primitive'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getPrimitiveAccess().getPrimitiveKeyword());
	}
;

// Entry rule entryRuleCompound
entryRuleCompound returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCompoundRule()); }
	iv_ruleCompound=ruleCompound
	{ $current=$iv_ruleCompound.current.getText(); }
	EOF;

// Rule Compound
ruleCompound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='compound'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getCompoundAccess().getCompoundKeyword());
	}
;

// Entry rule entryRuleField
entryRuleField returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	iv_ruleField=ruleField
	{ $current=$iv_ruleField.current.getText(); }
	EOF;

// Rule Field
ruleField returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='field'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getFieldAccess().getFieldKeyword());
	}
;

// Entry rule entryRuleState
entryRuleState returns [String current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current.getText(); }
	EOF;

// Rule State
ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='state'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getStateAccess().getStateKeyword());
	}
;

// Entry rule entryRuleTransition
entryRuleTransition returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current.getText(); }
	EOF;

// Rule Transition
ruleTransition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='transition'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getTransitionAccess().getTransitionKeyword());
	}
;

// Entry rule entryRuleDefinitions
entryRuleDefinitions returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionsRule()); }
	iv_ruleDefinitions=ruleDefinitions
	{ $current=$iv_ruleDefinitions.current.getText(); }
	EOF;

// Rule Definitions
ruleDefinitions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='definitions'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getDefinitionsAccess().getDefinitionsKeyword());
	}
;

// Entry rule entryRuleReferences
entryRuleReferences returns [String current=null]:
	{ newCompositeNode(grammarAccess.getReferencesRule()); }
	iv_ruleReferences=ruleReferences
	{ $current=$iv_ruleReferences.current.getText(); }
	EOF;

// Rule References
ruleReferences returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='references'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getReferencesAccess().getReferencesKeyword());
	}
;

// Entry rule entryRuleInstances
entryRuleInstances returns [String current=null]:
	{ newCompositeNode(grammarAccess.getInstancesRule()); }
	iv_ruleInstances=ruleInstances
	{ $current=$iv_ruleInstances.current.getText(); }
	EOF;

// Rule Instances
ruleInstances returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='instances'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getInstancesAccess().getInstancesKeyword());
	}
;

// Entry rule entryRuleInput
entryRuleInput returns [String current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current.getText(); }
	EOF;

// Rule Input
ruleInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='input'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getInputAccess().getInputKeyword());
	}
;

// Entry rule entryRuleOutput
entryRuleOutput returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current.getText(); }
	EOF;

// Rule Output
ruleOutput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='output'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getOutputAccess().getOutputKeyword());
	}
;

// Entry rule entryRuleFrom
entryRuleFrom returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFromRule()); }
	iv_ruleFrom=ruleFrom
	{ $current=$iv_ruleFrom.current.getText(); }
	EOF;

// Rule From
ruleFrom returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='from'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getFromAccess().getFromKeyword());
	}
;

// Entry rule entryRuleWith
entryRuleWith returns [String current=null]:
	{ newCompositeNode(grammarAccess.getWithRule()); }
	iv_ruleWith=ruleWith
	{ $current=$iv_ruleWith.current.getText(); }
	EOF;

// Rule With
ruleWith returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='with'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getWithAccess().getWithKeyword());
	}
;

// Entry rule entryRuleExtends
entryRuleExtends returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExtendsRule()); }
	iv_ruleExtends=ruleExtends
	{ $current=$iv_ruleExtends.current.getText(); }
	EOF;

// Rule Extends
ruleExtends returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='extends'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getExtendsAccess().getExtendsKeyword());
	}
;

// Entry rule entryRuleNotOp
entryRuleNotOp returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNotOpRule()); }
	iv_ruleNotOp=ruleNotOp
	{ $current=$iv_ruleNotOp.current.getText(); }
	EOF;

// Rule NotOp
ruleNotOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='NOT'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getNotOpAccess().getNOTKeyword());
	}
;

// Entry rule entryRuleAndOp
entryRuleAndOp returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAndOpRule()); }
	iv_ruleAndOp=ruleAndOp
	{ $current=$iv_ruleAndOp.current.getText(); }
	EOF;

// Rule AndOp
ruleAndOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='AND'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getAndOpAccess().getANDKeyword());
	}
;

// Entry rule entryRuleOrOp
entryRuleOrOp returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOrOpRule()); }
	iv_ruleOrOp=ruleOrOp
	{ $current=$iv_ruleOrOp.current.getText(); }
	EOF;

// Rule OrOp
ruleOrOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='OR'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getOrOpAccess().getORKeyword());
	}
;

// Entry rule entryRuleSet
entryRuleSet returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSetRule()); }
	iv_ruleSet=ruleSet
	{ $current=$iv_ruleSet.current.getText(); }
	EOF;

// Rule Set
ruleSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='set'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getSetAccess().getSetKeyword());
	}
;

// Entry rule entryRuleTo
entryRuleTo returns [String current=null]:
	{ newCompositeNode(grammarAccess.getToRule()); }
	iv_ruleTo=ruleTo
	{ $current=$iv_ruleTo.current.getText(); }
	EOF;

// Rule To
ruleTo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='to'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getToAccess().getToKeyword());
	}
;

// Entry rule entryRuleUse
entryRuleUse returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUseRule()); }
	iv_ruleUse=ruleUse
	{ $current=$iv_ruleUse.current.getText(); }
	EOF;

// Rule Use
ruleUse returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='use'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getUseAccess().getUseKeyword());
	}
;

// Entry rule entryRuleInstance
entryRuleInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceRule()); }
	iv_ruleInstance=ruleInstance
	{ $current=$iv_ruleInstance.current; }
	EOF;

// Rule Instance
ruleInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_instanceDef_0_0='instance'
				{
					newLeafNode(lv_instanceDef_0_0, grammarAccess.getInstanceAccess().getInstanceDefInstanceKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceRule());
					}
					setWithLastConsumed($current, "instanceDef", lv_instanceDef_0_0, "instance");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getInstanceAccess().getTransitionDeclarationTransitionDeclarationParserRuleCall_1_0_0());
					}
					lv_transitionDeclaration_1_0=ruleTransitionDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstanceRule());
						}
						set(
							$current,
							"transitionDeclaration",
							lv_transitionDeclaration_1_0,
							"org.worklang.Work.TransitionDeclaration");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getInstanceAccess().getStateDeclarationStateDeclarationParserRuleCall_1_1_0());
					}
					lv_stateDeclaration_2_0=ruleStateDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstanceRule());
						}
						set(
							$current,
							"stateDeclaration",
							lv_stateDeclaration_2_0,
							"org.worklang.Work.StateDeclaration");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				lv_name_3_0=RULE_STRING
				{
					newLeafNode(lv_name_3_0, grammarAccess.getInstanceAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getInstanceAccess().getStateStateInstanceParserRuleCall_3_0_0());
					}
					lv_state_4_0=ruleStateInstance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstanceRule());
						}
						set(
							$current,
							"state",
							lv_state_4_0,
							"org.worklang.Work.StateInstance");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getInstanceAccess().getTransitionTransitionInstanceParserRuleCall_3_1_0());
					}
					lv_transition_5_0=ruleTransitionInstance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstanceRule());
						}
						set(
							$current,
							"transition",
							lv_transition_5_0,
							"org.worklang.Work.TransitionInstance");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleTransitionDeclaration
entryRuleTransitionDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionDeclarationRule()); }
	iv_ruleTransitionDeclaration=ruleTransitionDeclaration
	{ $current=$iv_ruleTransitionDeclaration.current; }
	EOF;

// Rule TransitionDeclaration
ruleTransitionDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionDeclarationAccess().getObjectTypeTransitionParserRuleCall_0_0());
				}
				lv_objectType_0_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionDeclarationRule());
					}
					set(
						$current,
						"objectType",
						lv_objectType_0_0,
						"org.worklang.Work.Transition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionDeclarationAccess().getTransitionTransitionIDParserRuleCall_1_0());
				}
				lv_transition_1_0=ruleTransitionID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionDeclarationRule());
					}
					set(
						$current,
						"transition",
						lv_transition_1_0,
						"org.worklang.Work.TransitionID");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStateDeclaration
entryRuleStateDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateDeclarationRule()); }
	iv_ruleStateDeclaration=ruleStateDeclaration
	{ $current=$iv_ruleStateDeclaration.current; }
	EOF;

// Rule StateDeclaration
ruleStateDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStateDeclarationAccess().getObjectTypeStateParserRuleCall_0_0());
				}
				lv_objectType_0_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateDeclarationRule());
					}
					set(
						$current,
						"objectType",
						lv_objectType_0_0,
						"org.worklang.Work.State");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateDeclarationAccess().getStateStateIDParserRuleCall_1_0());
				}
				lv_state_1_0=ruleStateID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateDeclarationRule());
					}
					set(
						$current,
						"state",
						lv_state_1_0,
						"org.worklang.Work.StateID");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTransitionInstance
entryRuleTransitionInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionInstanceRule()); }
	iv_ruleTransitionInstance=ruleTransitionInstance
	{ $current=$iv_ruleTransitionInstance.current; }
	EOF;

// Rule TransitionInstance
ruleTransitionInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_host_0_0=RULE_STRING
				{
					newLeafNode(lv_host_0_0, grammarAccess.getTransitionInstanceAccess().getHostSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"host",
						lv_host_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_port_1_0=RULE_INT
				{
					newLeafNode(lv_port_1_0, grammarAccess.getTransitionInstanceAccess().getPortINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"port",
						lv_port_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_path_2_0=RULE_STRING
				{
					newLeafNode(lv_path_2_0, grammarAccess.getTransitionInstanceAccess().getPathSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
	)
;

// Entry rule entryRuleStateInstance
entryRuleStateInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateInstanceRule()); }
	iv_ruleStateInstance=ruleStateInstance
	{ $current=$iv_ruleStateInstance.current; }
	EOF;

// Rule StateInstance
ruleStateInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateInstanceAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStateInstanceAccess().getMembersSetStatementParserRuleCall_1_0_0());
					}
					lv_members_1_1=ruleSetStatement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateInstanceRule());
						}
						add(
							$current,
							"members",
							lv_members_1_1,
							"org.worklang.Work.SetStatement");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getStateInstanceAccess().getMembersUseDefinitionParserRuleCall_1_0_1());
					}
					lv_members_1_2=ruleUseDefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateInstanceRule());
						}
						add(
							$current,
							"members",
							lv_members_1_2,
							"org.worklang.Work.UseDefinition");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getStateInstanceAccess().getMembersInstanceParserRuleCall_1_0_2());
					}
					lv_members_1_3=ruleInstance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateInstanceRule());
						}
						add(
							$current,
							"members",
							lv_members_1_3,
							"org.worklang.Work.Instance");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getStateInstanceAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleSetStatement
entryRuleSetStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSetStatementRule()); }
	iv_ruleSetStatement=ruleSetStatement
	{ $current=$iv_ruleSetStatement.current; }
	EOF;

// Rule SetStatement
ruleSetStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSetStatementAccess().getStatementSetParserRuleCall_0_0());
				}
				lv_statement_0_0=ruleSet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSetStatementRule());
					}
					set(
						$current,
						"statement",
						lv_statement_0_0,
						"org.worklang.Work.Set");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSetStatementRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getSetStatementAccess().getVariableStateIDCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSetStatementAccess().getToDefToDefinitionParserRuleCall_2_0());
				}
				lv_toDef_2_0=ruleToDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSetStatementRule());
					}
					set(
						$current,
						"toDef",
						lv_toDef_2_0,
						"org.worklang.Work.ToDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleToDefinition
entryRuleToDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getToDefinitionRule()); }
	iv_ruleToDefinition=ruleToDefinition
	{ $current=$iv_ruleToDefinition.current; }
	EOF;

// Rule ToDefinition
ruleToDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getToDefinitionAccess().getToToParserRuleCall_0_0());
				}
				lv_to_0_0=ruleTo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getToDefinitionRule());
					}
					set(
						$current,
						"to",
						lv_to_0_0,
						"org.worklang.Work.To");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getToDefinitionAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getToDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRulePredicate
entryRulePredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPredicateRule()); }
	iv_rulePredicate=rulePredicate
	{ $current=$iv_rulePredicate.current; }
	EOF;

// Rule Predicate
rulePredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPredicateAccess().getNegationNotOpParserRuleCall_0_0());
				}
				lv_negation_0_0=ruleNotOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPredicateRule());
					}
					set(
						$current,
						"negation",
						true,
						"org.worklang.Work.NotOp");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getPredicateAccess().getExpressionBinaryExpressionParserRuleCall_1_0());
				}
				lv_expression_1_0=ruleBinaryExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPredicateRule());
					}
					set(
						$current,
						"expression",
						lv_expression_1_0,
						"org.worklang.Work.BinaryExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBinaryExpression
entryRuleBinaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBinaryExpressionRule()); }
	iv_ruleBinaryExpression=ruleBinaryExpression
	{ $current=$iv_ruleBinaryExpression.current; }
	EOF;

// Rule BinaryExpression
ruleBinaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getTerminalBinaryExpressionParserRuleCall_0());
		}
		this_TerminalBinaryExpression_0=ruleTerminalBinaryExpression
		{
			$current = $this_TerminalBinaryExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getBinaryExpressionAccess().getOperationLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpAndOpParserRuleCall_1_1_0_0());
						}
						lv_op_2_1=ruleAndOp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
							}
							set(
								$current,
								"op",
								lv_op_2_1,
								"org.worklang.Work.AndOp");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpOrOpParserRuleCall_1_1_0_1());
						}
						lv_op_2_2=ruleOrOp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
							}
							set(
								$current,
								"op",
								lv_op_2_2,
								"org.worklang.Work.OrOp");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightTerminalBinaryExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleTerminalBinaryExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.worklang.Work.TerminalBinaryExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTerminalBinaryExpression
entryRuleTerminalBinaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalBinaryExpressionRule()); }
	iv_ruleTerminalBinaryExpression=ruleTerminalBinaryExpression
	{ $current=$iv_ruleTerminalBinaryExpression.current; }
	EOF;

// Rule TerminalBinaryExpression
ruleTerminalBinaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getTerminalBinaryExpressionAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getTerminalBinaryExpressionAccess().getPredicateParserRuleCall_0_1());
			}
			this_Predicate_1=rulePredicate
			{
				$current = $this_Predicate_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getTerminalBinaryExpressionAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalBinaryExpressionAccess().getStateIDAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalBinaryExpressionRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getTerminalBinaryExpressionAccess().getInstanceStateIDCrossReference_1_1_0());
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalBinaryExpressionAccess().getStateIDAction_2_0(),
						$current);
				}
			)
			(
				(
					(
						lv_list_6_0='setOf'
						{
							newLeafNode(lv_list_6_0, grammarAccess.getTerminalBinaryExpressionAccess().getListSetOfKeyword_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTerminalBinaryExpressionRule());
							}
							setWithLastConsumed($current, "list", true, "setOf");
						}
					)
				)
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTerminalBinaryExpressionRule());
							}
						}
						otherlv_7=RULE_ID
						{
							newLeafNode(otherlv_7, grammarAccess.getTerminalBinaryExpressionAccess().getValueStateIDCrossReference_2_1_1_0());
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleTransitionalExpression
entryRuleTransitionalExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionalExpressionRule()); }
	iv_ruleTransitionalExpression=ruleTransitionalExpression
	{ $current=$iv_ruleTransitionalExpression.current; }
	EOF;

// Rule TransitionalExpression
ruleTransitionalExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTransitionalExpressionAccess().getTerminalTransitionalExpressionParserRuleCall_0());
		}
		this_TerminalTransitionalExpression_0=ruleTerminalTransitionalExpression
		{
			$current = $this_TerminalTransitionalExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getTransitionalExpressionAccess().getOperationLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_op_2_0='THEN'
					{
						newLeafNode(lv_op_2_0, grammarAccess.getTransitionalExpressionAccess().getOpTHENKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionalExpressionRule());
						}
						setWithLastConsumed($current, "op", lv_op_2_0, "THEN");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionalExpressionAccess().getRightTerminalTransitionalExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleTerminalTransitionalExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionalExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.worklang.Work.TerminalTransitionalExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTerminalTransitionalExpression
entryRuleTerminalTransitionalExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalTransitionalExpressionRule()); }
	iv_ruleTerminalTransitionalExpression=ruleTerminalTransitionalExpression
	{ $current=$iv_ruleTerminalTransitionalExpression.current; }
	EOF;

// Rule TerminalTransitionalExpression
ruleTerminalTransitionalExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getTerminalTransitionalExpressionAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getTerminalTransitionalExpressionAccess().getTransitionalExpressionParserRuleCall_0_1());
			}
			this_TransitionalExpression_1=ruleTransitionalExpression
			{
				$current = $this_TransitionalExpression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getTerminalTransitionalExpressionAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalTransitionalExpressionAccess().getTransitionIDAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalTransitionalExpressionRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getTerminalTransitionalExpressionAccess().getValueTransitionIDCrossReference_1_1_0());
					}
				)
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
