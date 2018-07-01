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
			{
				newCompositeNode(grammarAccess.getModelAccess().getFieldsFieldDefinitionParserRuleCall_0());
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
		otherlv_0='field'
		{
			newLeafNode(otherlv_0, grammarAccess.getFieldDefinitionAccess().getFieldKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFieldDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getFieldDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getDefinitionSpaceDefinitionSpaceParserRuleCall_3_0());
				}
				lv_definitionSpace_3_0=ruleDefinitionSpace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
					}
					set(
						$current,
						"definitionSpace",
						lv_definitionSpace_3_0,
						"org.worklang.Work.DefinitionSpace");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getReferenceSpaceReferenceSpaceParserRuleCall_4_0());
				}
				lv_referenceSpace_4_0=ruleReferenceSpace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
					}
					set(
						$current,
						"referenceSpace",
						lv_referenceSpace_4_0,
						"org.worklang.Work.ReferenceSpace");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getMapSpaceMapSpaceParserRuleCall_5_0());
				}
				lv_mapSpace_5_0=ruleMapSpace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
					}
					set(
						$current,
						"mapSpace",
						lv_mapSpace_5_0,
						"org.worklang.Work.MapSpace");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getInstanceSpaceInstanceSpaceParserRuleCall_6_0());
				}
				lv_instanceSpace_6_0=ruleInstanceSpace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
					}
					set(
						$current,
						"instanceSpace",
						lv_instanceSpace_6_0,
						"org.worklang.Work.InstanceSpace");
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

// Entry rule entryRuleMapSpace
entryRuleMapSpace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMapSpaceRule()); }
	iv_ruleMapSpace=ruleMapSpace
	{ $current=$iv_ruleMapSpace.current; }
	EOF;

// Rule MapSpace
ruleMapSpace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMapSpaceAccess().getMapSpaceAction_0(),
					$current);
			}
		)
		otherlv_1='mappings'
		{
			newLeafNode(otherlv_1, grammarAccess.getMapSpaceAccess().getMappingsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getMapSpaceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMapSpaceAccess().getMappedStatesStateMappingParserRuleCall_3_0());
				}
				lv_mappedStates_3_0=ruleStateMapping
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMapSpaceRule());
					}
					add(
						$current,
						"mappedStates",
						lv_mappedStates_3_0,
						"org.worklang.Work.StateMapping");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getMapSpaceAccess().getMappedTransitionsTransitionMappingParserRuleCall_4_0());
				}
				lv_mappedTransitions_4_0=ruleTransitionMapping
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMapSpaceRule());
					}
					add(
						$current,
						"mappedTransitions",
						lv_mappedTransitions_4_0,
						"org.worklang.Work.TransitionMapping");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getMapSpaceAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleStateMapping
entryRuleStateMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateMappingRule()); }
	iv_ruleStateMapping=ruleStateMapping
	{ $current=$iv_ruleStateMapping.current; }
	EOF;

// Rule StateMapping
ruleStateMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='state'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateMappingAccess().getStateKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMappingRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getStateMappingAccess().getForeignStateStateDefinitionCrossReference_1_0());
				}
			)
		)
		otherlv_2='from'
		{
			newLeafNode(otherlv_2, grammarAccess.getStateMappingAccess().getFromKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMappingRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getStateMappingAccess().getFieldFieldDefinitionCrossReference_3_0());
				}
			)
		)
		otherlv_4='to'
		{
			newLeafNode(otherlv_4, grammarAccess.getStateMappingAccess().getToKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMappingRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getStateMappingAccess().getLocalStateStateDefinitionCrossReference_5_0());
				}
			)
		)
	)
;

// Entry rule entryRuleTransitionMapping
entryRuleTransitionMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionMappingRule()); }
	iv_ruleTransitionMapping=ruleTransitionMapping
	{ $current=$iv_ruleTransitionMapping.current; }
	EOF;

// Rule TransitionMapping
ruleTransitionMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionMappingAccess().getTransitionKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionMappingRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getTransitionMappingAccess().getForeignTransitionTransitionDefinitionCrossReference_1_0());
				}
			)
		)
		otherlv_2='from'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionMappingAccess().getFromKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionMappingRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getTransitionMappingAccess().getFieldFieldDefinitionCrossReference_3_0());
				}
			)
		)
		otherlv_4='to'
		{
			newLeafNode(otherlv_4, grammarAccess.getTransitionMappingAccess().getToKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionMappingRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getTransitionMappingAccess().getLocalTransitionTransitionDefinitionCrossReference_5_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDefinitionSpace
entryRuleDefinitionSpace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionSpaceRule()); }
	iv_ruleDefinitionSpace=ruleDefinitionSpace
	{ $current=$iv_ruleDefinitionSpace.current; }
	EOF;

// Rule DefinitionSpace
ruleDefinitionSpace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDefinitionSpaceAccess().getDefinitionSpaceAction_0(),
					$current);
			}
		)
		otherlv_1='definitions'
		{
			newLeafNode(otherlv_1, grammarAccess.getDefinitionSpaceAccess().getDefinitionsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDefinitionSpaceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionSpaceAccess().getStatesStateDefinitionParserRuleCall_3_0());
				}
				lv_states_3_0=ruleStateDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionSpaceRule());
					}
					add(
						$current,
						"states",
						lv_states_3_0,
						"org.worklang.Work.StateDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionSpaceAccess().getTransitionsTransitionDefinitionParserRuleCall_4_0());
				}
				lv_transitions_4_0=ruleTransitionDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionSpaceRule());
					}
					add(
						$current,
						"transitions",
						lv_transitions_4_0,
						"org.worklang.Work.TransitionDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getDefinitionSpaceAccess().getRightCurlyBracketKeyword_5());
		}
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
		{
			newCompositeNode(grammarAccess.getStateDefinitionAccess().getPrimitiveStateDefinitionParserRuleCall_0());
		}
		this_PrimitiveStateDefinition_0=rulePrimitiveStateDefinition
		{
			$current = $this_PrimitiveStateDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStateDefinitionAccess().getCompoundStateDefinitionParserRuleCall_1());
		}
		this_CompoundStateDefinition_1=ruleCompoundStateDefinition
		{
			$current = $this_CompoundStateDefinition_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrimitiveStateDefinition
entryRulePrimitiveStateDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveStateDefinitionRule()); }
	iv_rulePrimitiveStateDefinition=rulePrimitiveStateDefinition
	{ $current=$iv_rulePrimitiveStateDefinition.current; }
	EOF;

// Rule PrimitiveStateDefinition
rulePrimitiveStateDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='primitive'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getPrimitiveStateDefinitionAccess().getTypePrimitiveKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveStateDefinitionRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "primitive");
				}
			)
		)
		otherlv_1='state'
		{
			newLeafNode(otherlv_1, grammarAccess.getPrimitiveStateDefinitionAccess().getStateKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPrimitiveStateDefinitionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveStateDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleCompoundStateDefinition
entryRuleCompoundStateDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompoundStateDefinitionRule()); }
	iv_ruleCompoundStateDefinition=ruleCompoundStateDefinition
	{ $current=$iv_ruleCompoundStateDefinition.current; }
	EOF;

// Rule CompoundStateDefinition
ruleCompoundStateDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='compound'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getCompoundStateDefinitionAccess().getTypeCompoundKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompoundStateDefinitionRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "compound");
				}
			)
		)
		otherlv_1='state'
		{
			newLeafNode(otherlv_1, grammarAccess.getCompoundStateDefinitionAccess().getStateKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getCompoundStateDefinitionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompoundStateDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompoundStateDefinitionAccess().getCompositionWithStatesDefinitionParserRuleCall_3_0());
				}
				lv_composition_3_0=ruleWithStatesDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompoundStateDefinitionRule());
					}
					set(
						$current,
						"composition",
						lv_composition_3_0,
						"org.worklang.Work.WithStatesDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
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
		{
			newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getPrimitiveTransitionDefinitionParserRuleCall_0());
		}
		this_PrimitiveTransitionDefinition_0=rulePrimitiveTransitionDefinition
		{
			$current = $this_PrimitiveTransitionDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getCompoundTransitionDefinitionParserRuleCall_1());
		}
		this_CompoundTransitionDefinition_1=ruleCompoundTransitionDefinition
		{
			$current = $this_CompoundTransitionDefinition_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrimitiveTransitionDefinition
entryRulePrimitiveTransitionDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveTransitionDefinitionRule()); }
	iv_rulePrimitiveTransitionDefinition=rulePrimitiveTransitionDefinition
	{ $current=$iv_rulePrimitiveTransitionDefinition.current; }
	EOF;

// Rule PrimitiveTransitionDefinition
rulePrimitiveTransitionDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='primitive'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getPrimitiveTransitionDefinitionAccess().getTypePrimitiveKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveTransitionDefinitionRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "primitive");
				}
			)
		)
		otherlv_1='transition'
		{
			newLeafNode(otherlv_1, grammarAccess.getPrimitiveTransitionDefinitionAccess().getTransitionKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPrimitiveTransitionDefinitionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveTransitionDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPrimitiveTransitionDefinitionAccess().getInInputDefinitionParserRuleCall_3_0());
				}
				lv_in_3_0=ruleInputDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrimitiveTransitionDefinitionRule());
					}
					set(
						$current,
						"in",
						lv_in_3_0,
						"org.worklang.Work.InputDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getPrimitiveTransitionDefinitionAccess().getOutOutputDefinitionParserRuleCall_4_0());
				}
				lv_out_4_0=ruleOutputDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrimitiveTransitionDefinitionRule());
					}
					set(
						$current,
						"out",
						lv_out_4_0,
						"org.worklang.Work.OutputDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCompoundTransitionDefinition
entryRuleCompoundTransitionDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompoundTransitionDefinitionRule()); }
	iv_ruleCompoundTransitionDefinition=ruleCompoundTransitionDefinition
	{ $current=$iv_ruleCompoundTransitionDefinition.current; }
	EOF;

// Rule CompoundTransitionDefinition
ruleCompoundTransitionDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='compound'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getCompoundTransitionDefinitionAccess().getTypeCompoundKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompoundTransitionDefinitionRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "compound");
				}
			)
		)
		otherlv_1='transition'
		{
			newLeafNode(otherlv_1, grammarAccess.getCompoundTransitionDefinitionAccess().getTransitionKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getCompoundTransitionDefinitionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompoundTransitionDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompoundTransitionDefinitionAccess().getInInputDefinitionParserRuleCall_3_0());
				}
				lv_in_3_0=ruleInputDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompoundTransitionDefinitionRule());
					}
					set(
						$current,
						"in",
						lv_in_3_0,
						"org.worklang.Work.InputDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getCompoundTransitionDefinitionAccess().getOutOutputDefinitionParserRuleCall_4_0());
				}
				lv_out_4_0=ruleOutputDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompoundTransitionDefinitionRule());
					}
					set(
						$current,
						"out",
						lv_out_4_0,
						"org.worklang.Work.OutputDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompoundTransitionDefinitionAccess().getCompositionTransitionCompositionParserRuleCall_5_0());
				}
				lv_composition_5_0=ruleTransitionComposition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompoundTransitionDefinitionRule());
					}
					set(
						$current,
						"composition",
						lv_composition_5_0,
						"org.worklang.Work.TransitionComposition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleReferenceSpace
entryRuleReferenceSpace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferenceSpaceRule()); }
	iv_ruleReferenceSpace=ruleReferenceSpace
	{ $current=$iv_ruleReferenceSpace.current; }
	EOF;

// Rule ReferenceSpace
ruleReferenceSpace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getReferenceSpaceAccess().getReferenceSpaceAction_0(),
					$current);
			}
		)
		otherlv_1='references'
		{
			newLeafNode(otherlv_1, grammarAccess.getReferenceSpaceAccess().getReferencesKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getReferenceSpaceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceSpaceAccess().getRefStatesReferenceStateParserRuleCall_3_0());
				}
				lv_refStates_3_0=ruleReferenceState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceSpaceRule());
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
					newCompositeNode(grammarAccess.getReferenceSpaceAccess().getRefTransitionsReferenceTransitionParserRuleCall_4_0());
				}
				lv_refTransitions_4_0=ruleReferenceTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceSpaceRule());
					}
					add(
						$current,
						"refTransitions",
						lv_refTransitions_4_0,
						"org.worklang.Work.ReferenceTransition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getReferenceSpaceAccess().getRightCurlyBracketKeyword_5());
		}
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
		otherlv_0='transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getReferenceTransitionAccess().getTransitionKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceTransitionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getReferenceTransitionAccess().getRefTransitionTransitionDefinitionCrossReference_1_0());
				}
			)
		)
		otherlv_2='from'
		{
			newLeafNode(otherlv_2, grammarAccess.getReferenceTransitionAccess().getFromKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceTransitionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getReferenceTransitionAccess().getForeignFieldFieldDefinitionCrossReference_3_0());
				}
			)
		)
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
		otherlv_0='state'
		{
			newLeafNode(otherlv_0, grammarAccess.getReferenceStateAccess().getStateKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceStateRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getReferenceStateAccess().getRefStateStateDefinitionCrossReference_1_0());
				}
			)
		)
		otherlv_2='from'
		{
			newLeafNode(otherlv_2, grammarAccess.getReferenceStateAccess().getFromKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceStateRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getReferenceStateAccess().getForeignFieldFieldDefinitionCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleInstanceSpace
entryRuleInstanceSpace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceSpaceRule()); }
	iv_ruleInstanceSpace=ruleInstanceSpace
	{ $current=$iv_ruleInstanceSpace.current; }
	EOF;

// Rule InstanceSpace
ruleInstanceSpace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInstanceSpaceAccess().getInstanceSpaceAction_0(),
					$current);
			}
		)
		otherlv_1='instances'
		{
			newLeafNode(otherlv_1, grammarAccess.getInstanceSpaceAccess().getInstancesKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getInstanceSpaceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInstanceSpaceAccess().getInstancesInstanceParserRuleCall_3_0());
				}
				lv_instances_3_0=ruleInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstanceSpaceRule());
					}
					add(
						$current,
						"instances",
						lv_instances_3_0,
						"org.worklang.Work.Instance");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getInstanceSpaceAccess().getRightCurlyBracketKeyword_4());
		}
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
		otherlv_0='with'
		{
			newLeafNode(otherlv_0, grammarAccess.getWithStatesDefinitionAccess().getWithKeyword_0());
		}
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
			{
				$current = forceCreateModelElement(
					grammarAccess.getInputDefinitionAccess().getInputDefinitionAction_0(),
					$current);
			}
		)
		otherlv_1='input'
		{
			newLeafNode(otherlv_1, grammarAccess.getInputDefinitionAccess().getInputKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputDefinitionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getInputDefinitionAccess().getInputStateStateDefinitionCrossReference_2_0());
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
		otherlv_0='output'
		{
			newLeafNode(otherlv_0, grammarAccess.getOutputDefinitionAccess().getOutputKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputDefinitionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getOutputDefinitionAccess().getOutputStateStateDefinitionCrossReference_1_0());
				}
			)
		)
	)
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
		otherlv_0='instance'
		{
			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
		}
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
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getInstanceAccess().getCompoundTransitionCompoundTransitionInstanceParserRuleCall_3_2_0());
					}
					lv_compoundTransition_6_0=ruleCompoundTransitionInstance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstanceRule());
						}
						set(
							$current,
							"compoundTransition",
							lv_compoundTransition_6_0,
							"org.worklang.Work.CompoundTransitionInstance");
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
		otherlv_0='transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionDeclarationAccess().getTransitionKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionDeclarationRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getTransitionDeclarationAccess().getTransitionTransitionDefinitionCrossReference_1_0());
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
		otherlv_0='state'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateDeclarationAccess().getStateKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateDeclarationRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getStateDeclarationAccess().getStateStateDefinitionCrossReference_1_0());
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
		otherlv_0='use'
		{
			newLeafNode(otherlv_0, grammarAccess.getUseDefinitionAccess().getUseKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUseDefinitionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getUseDefinitionAccess().getPredefinedValueInstanceCrossReference_1_0());
				}
			)
		)
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
		otherlv_0='set'
		{
			newLeafNode(otherlv_0, grammarAccess.getSetStatementAccess().getSetKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSetStatementRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getSetStatementAccess().getVariableStateDefinitionCrossReference_1_0());
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
		otherlv_0='to'
		{
			newLeafNode(otherlv_0, grammarAccess.getToDefinitionAccess().getToKeyword_0());
		}
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
				lv_negation_0_0='NOT'
				{
					newLeafNode(lv_negation_0_0, grammarAccess.getPredicateAccess().getNegationNOTKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPredicateRule());
					}
					setWithLastConsumed($current, "negation", true, "NOT");
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
						lv_op_2_1='AND'
						{
							newLeafNode(lv_op_2_1, grammarAccess.getBinaryExpressionAccess().getOpANDKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBinaryExpressionRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_1, null);
						}
						    |
						lv_op_2_2='OR'
						{
							newLeafNode(lv_op_2_2, grammarAccess.getBinaryExpressionAccess().getOpORKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBinaryExpressionRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_2, null);
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
						grammarAccess.getTerminalBinaryExpressionAccess().getStateDefinitionAction_1_0(),
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
						newLeafNode(otherlv_4, grammarAccess.getTerminalBinaryExpressionAccess().getInstanceStateDefinitionCrossReference_1_1_0());
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalBinaryExpressionAccess().getStateDefinitionAction_2_0(),
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
							newLeafNode(otherlv_7, grammarAccess.getTerminalBinaryExpressionAccess().getValueStateDefinitionCrossReference_2_1_1_0());
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleTransitionComposition
entryRuleTransitionComposition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionCompositionRule()); }
	iv_ruleTransitionComposition=ruleTransitionComposition
	{ $current=$iv_ruleTransitionComposition.current; }
	EOF;

// Rule TransitionComposition
ruleTransitionComposition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionCompositionAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionCompositionAccess().getBodyTransitionCompositionBodyParserRuleCall_1_0());
				}
				lv_body_1_0=ruleTransitionCompositionBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionCompositionRule());
					}
					set(
						$current,
						"body",
						lv_body_1_0,
						"org.worklang.Work.TransitionCompositionBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionCompositionAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleTransitionCompositionBody
entryRuleTransitionCompositionBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionCompositionBodyRule()); }
	iv_ruleTransitionCompositionBody=ruleTransitionCompositionBody
	{ $current=$iv_ruleTransitionCompositionBody.current; }
	EOF;

// Rule TransitionCompositionBody
ruleTransitionCompositionBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='START'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionCompositionBodyAccess().getSTARTKeyword_0());
		}
		(
			otherlv_1='WITH'
			{
				newLeafNode(otherlv_1, grammarAccess.getTransitionCompositionBodyAccess().getWITHKeyword_1_0());
			}
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getTransitionCompositionBodyAccess().getLeftParenthesisKeyword_1_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionCompositionBodyRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getTransitionCompositionBodyAccess().getStartingInputsStateDefinitionCrossReference_1_2_0());
					}
				)
			)+
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getTransitionCompositionBodyAccess().getRightParenthesisKeyword_1_3());
			}
		)?
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getTransitionCompositionBodyAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionCompositionBodyAccess().getExpressionInstructionExpressionParserRuleCall_3_0());
				}
				lv_expression_6_0=ruleInstructionExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionCompositionBodyRule());
					}
					set(
						$current,
						"expression",
						lv_expression_6_0,
						"org.worklang.Work.InstructionExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getTransitionCompositionBodyAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleInstructionExpression
entryRuleInstructionExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionExpressionRule()); }
	iv_ruleInstructionExpression=ruleInstructionExpression
	{ $current=$iv_ruleInstructionExpression.current; }
	EOF;

// Rule InstructionExpression
ruleInstructionExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInstructionExpressionAccess().getTerminalInstructionParserRuleCall_0());
		}
		this_TerminalInstruction_0=ruleTerminalInstruction
		{
			$current = $this_TerminalInstruction_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getInstructionExpressionAccess().getExecutionResultComputeFirstAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getInstructionExpressionAccess().getComputeNextTerminalInstructionParserRuleCall_1_1_0());
					}
					lv_computeNext_2_0=ruleTerminalInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstructionExpressionRule());
						}
						set(
							$current,
							"computeNext",
							lv_computeNext_2_0,
							"org.worklang.Work.TerminalInstruction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTerminalInstruction
entryRuleTerminalInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalInstructionRule()); }
	iv_ruleTerminalInstruction=ruleTerminalInstruction
	{ $current=$iv_ruleTerminalInstruction.current; }
	EOF;

// Rule TerminalInstruction
ruleTerminalInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTerminalInstructionAccess().getIfInstructionParserRuleCall_0());
		}
		this_IfInstruction_0=ruleIfInstruction
		{
			$current = $this_IfInstruction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminalInstructionAccess().getWhileInstructionParserRuleCall_1());
		}
		this_WhileInstruction_1=ruleWhileInstruction
		{
			$current = $this_WhileInstruction_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminalInstructionAccess().getSimpleInstructionParserRuleCall_2());
		}
		this_SimpleInstruction_2=ruleSimpleInstruction
		{
			$current = $this_SimpleInstruction_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getTerminalInstructionAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleIfInstruction
entryRuleIfInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfInstructionRule()); }
	iv_ruleIfInstruction=ruleIfInstruction
	{ $current=$iv_ruleIfInstruction.current; }
	EOF;

// Rule IfInstruction
ruleIfInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='IF'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfInstructionAccess().getIFKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getIfInstructionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfInstructionAccess().getTestKeyResolvableValueParserRuleCall_2_0());
				}
				lv_testKey_2_0=ruleResolvableValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfInstructionRule());
					}
					set(
						$current,
						"testKey",
						lv_testKey_2_0,
						"org.worklang.Work.ResolvableValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getIfInstructionAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfInstructionAccess().getTestValueTestValueParserRuleCall_4_0());
				}
				lv_testValue_4_0=ruleTestValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfInstructionRule());
					}
					set(
						$current,
						"testValue",
						lv_testValue_4_0,
						"org.worklang.Work.TestValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getIfInstructionAccess().getRightParenthesisKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getIfInstructionAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfInstructionAccess().getToComputeIfTrueInstructionExpressionParserRuleCall_7_0());
				}
				lv_toComputeIfTrue_7_0=ruleInstructionExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfInstructionRule());
					}
					set(
						$current,
						"toComputeIfTrue",
						lv_toComputeIfTrue_7_0,
						"org.worklang.Work.InstructionExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getIfInstructionAccess().getRightCurlyBracketKeyword_8());
		}
		(
			otherlv_9='ELSE'
			{
				newLeafNode(otherlv_9, grammarAccess.getIfInstructionAccess().getELSEKeyword_9_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getIfInstructionAccess().getLeftCurlyBracketKeyword_9_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfInstructionAccess().getToComputeIfFalseInstructionExpressionParserRuleCall_9_2_0());
					}
					lv_toComputeIfFalse_11_0=ruleInstructionExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfInstructionRule());
						}
						set(
							$current,
							"toComputeIfFalse",
							lv_toComputeIfFalse_11_0,
							"org.worklang.Work.InstructionExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getIfInstructionAccess().getRightCurlyBracketKeyword_9_3());
			}
		)?
	)
;

// Entry rule entryRuleWhileInstruction
entryRuleWhileInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhileInstructionRule()); }
	iv_ruleWhileInstruction=ruleWhileInstruction
	{ $current=$iv_ruleWhileInstruction.current; }
	EOF;

// Rule WhileInstruction
ruleWhileInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='WHILE'
		{
			newLeafNode(otherlv_0, grammarAccess.getWhileInstructionAccess().getWHILEKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getWhileInstructionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileInstructionAccess().getTestKeyResolvableValueParserRuleCall_2_0());
				}
				lv_testKey_2_0=ruleResolvableValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileInstructionRule());
					}
					set(
						$current,
						"testKey",
						lv_testKey_2_0,
						"org.worklang.Work.ResolvableValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getWhileInstructionAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileInstructionAccess().getTestValueTestValueParserRuleCall_4_0());
				}
				lv_testValue_4_0=ruleTestValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileInstructionRule());
					}
					set(
						$current,
						"testValue",
						lv_testValue_4_0,
						"org.worklang.Work.TestValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getWhileInstructionAccess().getRightParenthesisKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getWhileInstructionAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileInstructionAccess().getToComputeInstructionExpressionParserRuleCall_7_0());
				}
				lv_toCompute_7_0=ruleInstructionExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileInstructionRule());
					}
					set(
						$current,
						"toCompute",
						lv_toCompute_7_0,
						"org.worklang.Work.InstructionExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getWhileInstructionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleSimpleInstruction
entryRuleSimpleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleInstructionRule()); }
	iv_ruleSimpleInstruction=ruleSimpleInstruction
	{ $current=$iv_ruleSimpleInstruction.current; }
	EOF;

// Rule SimpleInstruction
ruleSimpleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='THEN'
		{
			newLeafNode(otherlv_0, grammarAccess.getSimpleInstructionAccess().getTHENKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleInstructionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getSimpleInstructionAccess().getToExecuteTransitionDefinitionCrossReference_1_0());
				}
			)
		)+
	)
;

// Entry rule entryRuleCompoundTransitionInstance
entryRuleCompoundTransitionInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompoundTransitionInstanceRule()); }
	iv_ruleCompoundTransitionInstance=ruleCompoundTransitionInstance
	{ $current=$iv_ruleCompoundTransitionInstance.current; }
	EOF;

// Rule CompoundTransitionInstance
ruleCompoundTransitionInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompoundTransitionInstanceAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompoundTransitionInstanceAccess().getBodyCompoundTransitionInstanceBodyParserRuleCall_1_0());
				}
				lv_body_1_0=ruleCompoundTransitionInstanceBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompoundTransitionInstanceRule());
					}
					set(
						$current,
						"body",
						lv_body_1_0,
						"org.worklang.Work.CompoundTransitionInstanceBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getCompoundTransitionInstanceAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleCompoundTransitionInstanceBody
entryRuleCompoundTransitionInstanceBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompoundTransitionInstanceBodyRule()); }
	iv_ruleCompoundTransitionInstanceBody=ruleCompoundTransitionInstanceBody
	{ $current=$iv_ruleCompoundTransitionInstanceBody.current; }
	EOF;

// Rule CompoundTransitionInstanceBody
ruleCompoundTransitionInstanceBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='START'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompoundTransitionInstanceBodyAccess().getSTARTKeyword_0());
		}
		(
			otherlv_1='WITH'
			{
				newLeafNode(otherlv_1, grammarAccess.getCompoundTransitionInstanceBodyAccess().getWITHKeyword_1_0());
			}
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getCompoundTransitionInstanceBodyAccess().getLeftParenthesisKeyword_1_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCompoundTransitionInstanceBodyRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getCompoundTransitionInstanceBodyAccess().getStartingInputsInstanceCrossReference_1_2_0());
					}
				)
			)+
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getCompoundTransitionInstanceBodyAccess().getRightParenthesisKeyword_1_3());
			}
		)?
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getCompoundTransitionInstanceBodyAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompoundTransitionInstanceBodyAccess().getExpressionInstanceInstructionExpressionParserRuleCall_3_0());
				}
				lv_expression_6_0=ruleInstanceInstructionExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompoundTransitionInstanceBodyRule());
					}
					set(
						$current,
						"expression",
						lv_expression_6_0,
						"org.worklang.Work.InstanceInstructionExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getCompoundTransitionInstanceBodyAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleInstanceInstructionExpression
entryRuleInstanceInstructionExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceInstructionExpressionRule()); }
	iv_ruleInstanceInstructionExpression=ruleInstanceInstructionExpression
	{ $current=$iv_ruleInstanceInstructionExpression.current; }
	EOF;

// Rule InstanceInstructionExpression
ruleInstanceInstructionExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInstanceInstructionExpressionAccess().getTerminalInstanceInstructionParserRuleCall_0());
		}
		this_TerminalInstanceInstruction_0=ruleTerminalInstanceInstruction
		{
			$current = $this_TerminalInstanceInstruction_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getInstanceInstructionExpressionAccess().getExecutionResultComputeFirstAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getInstanceInstructionExpressionAccess().getComputeNextTerminalInstanceInstructionParserRuleCall_1_1_0());
					}
					lv_computeNext_2_0=ruleTerminalInstanceInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstanceInstructionExpressionRule());
						}
						set(
							$current,
							"computeNext",
							lv_computeNext_2_0,
							"org.worklang.Work.TerminalInstanceInstruction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTerminalInstanceInstruction
entryRuleTerminalInstanceInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalInstanceInstructionRule()); }
	iv_ruleTerminalInstanceInstruction=ruleTerminalInstanceInstruction
	{ $current=$iv_ruleTerminalInstanceInstruction.current; }
	EOF;

// Rule TerminalInstanceInstruction
ruleTerminalInstanceInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTerminalInstanceInstructionAccess().getIfInstanceInstructionParserRuleCall_0());
		}
		this_IfInstanceInstruction_0=ruleIfInstanceInstruction
		{
			$current = $this_IfInstanceInstruction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminalInstanceInstructionAccess().getWhileInstanceInstructionParserRuleCall_1());
		}
		this_WhileInstanceInstruction_1=ruleWhileInstanceInstruction
		{
			$current = $this_WhileInstanceInstruction_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminalInstanceInstructionAccess().getSimpleInstanceInstructionParserRuleCall_2());
		}
		this_SimpleInstanceInstruction_2=ruleSimpleInstanceInstruction
		{
			$current = $this_SimpleInstanceInstruction_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getTerminalInstanceInstructionAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleSimpleInstanceInstruction
entryRuleSimpleInstanceInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleInstanceInstructionRule()); }
	iv_ruleSimpleInstanceInstruction=ruleSimpleInstanceInstruction
	{ $current=$iv_ruleSimpleInstanceInstruction.current; }
	EOF;

// Rule SimpleInstanceInstruction
ruleSimpleInstanceInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='THEN'
		{
			newLeafNode(otherlv_0, grammarAccess.getSimpleInstanceInstructionAccess().getTHENKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleInstanceInstructionRule());
					}
				}
				otherlv_1=RULE_STRING
				{
					newLeafNode(otherlv_1, grammarAccess.getSimpleInstanceInstructionAccess().getToExecuteInstanceCrossReference_1_0());
				}
			)
		)+
	)
;

// Entry rule entryRuleIfInstanceInstruction
entryRuleIfInstanceInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfInstanceInstructionRule()); }
	iv_ruleIfInstanceInstruction=ruleIfInstanceInstruction
	{ $current=$iv_ruleIfInstanceInstruction.current; }
	EOF;

// Rule IfInstanceInstruction
ruleIfInstanceInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='IF'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfInstanceInstructionAccess().getIFKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getIfInstanceInstructionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfInstanceInstructionAccess().getTestKeyResolvableValueParserRuleCall_2_0());
				}
				lv_testKey_2_0=ruleResolvableValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfInstanceInstructionRule());
					}
					set(
						$current,
						"testKey",
						lv_testKey_2_0,
						"org.worklang.Work.ResolvableValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getIfInstanceInstructionAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfInstanceInstructionAccess().getTestValueTestValueParserRuleCall_4_0());
				}
				lv_testValue_4_0=ruleTestValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfInstanceInstructionRule());
					}
					set(
						$current,
						"testValue",
						lv_testValue_4_0,
						"org.worklang.Work.TestValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getIfInstanceInstructionAccess().getRightParenthesisKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getIfInstanceInstructionAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfInstanceInstructionAccess().getToComputeIfTrueInstanceInstructionExpressionParserRuleCall_7_0());
				}
				lv_toComputeIfTrue_7_0=ruleInstanceInstructionExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfInstanceInstructionRule());
					}
					set(
						$current,
						"toComputeIfTrue",
						lv_toComputeIfTrue_7_0,
						"org.worklang.Work.InstanceInstructionExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getIfInstanceInstructionAccess().getRightCurlyBracketKeyword_8());
		}
		(
			otherlv_9='ELSE'
			{
				newLeafNode(otherlv_9, grammarAccess.getIfInstanceInstructionAccess().getELSEKeyword_9_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getIfInstanceInstructionAccess().getLeftCurlyBracketKeyword_9_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfInstanceInstructionAccess().getToComputeIfFalseInstanceInstructionExpressionParserRuleCall_9_2_0());
					}
					lv_toComputeIfFalse_11_0=ruleInstanceInstructionExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfInstanceInstructionRule());
						}
						set(
							$current,
							"toComputeIfFalse",
							lv_toComputeIfFalse_11_0,
							"org.worklang.Work.InstanceInstructionExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getIfInstanceInstructionAccess().getRightCurlyBracketKeyword_9_3());
			}
		)?
	)
;

// Entry rule entryRuleWhileInstanceInstruction
entryRuleWhileInstanceInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhileInstanceInstructionRule()); }
	iv_ruleWhileInstanceInstruction=ruleWhileInstanceInstruction
	{ $current=$iv_ruleWhileInstanceInstruction.current; }
	EOF;

// Rule WhileInstanceInstruction
ruleWhileInstanceInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='WHILE'
		{
			newLeafNode(otherlv_0, grammarAccess.getWhileInstanceInstructionAccess().getWHILEKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getWhileInstanceInstructionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileInstanceInstructionAccess().getTestKeyResolvableValueParserRuleCall_2_0());
				}
				lv_testKey_2_0=ruleResolvableValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileInstanceInstructionRule());
					}
					set(
						$current,
						"testKey",
						lv_testKey_2_0,
						"org.worklang.Work.ResolvableValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getWhileInstanceInstructionAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileInstanceInstructionAccess().getTestValueTestValueParserRuleCall_4_0());
				}
				lv_testValue_4_0=ruleTestValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileInstanceInstructionRule());
					}
					set(
						$current,
						"testValue",
						lv_testValue_4_0,
						"org.worklang.Work.TestValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getWhileInstanceInstructionAccess().getRightParenthesisKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getWhileInstanceInstructionAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileInstanceInstructionAccess().getToComputeInstanceInstructionExpressionParserRuleCall_7_0());
				}
				lv_toCompute_7_0=ruleInstanceInstructionExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileInstanceInstructionRule());
					}
					set(
						$current,
						"toCompute",
						lv_toCompute_7_0,
						"org.worklang.Work.InstanceInstructionExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getWhileInstanceInstructionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleTestValue
entryRuleTestValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestValueRule()); }
	iv_ruleTestValue=ruleTestValue
	{ $current=$iv_ruleTestValue.current; }
	EOF;

// Rule TestValue
ruleTestValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTestValueAccess().getLiteralValueParserRuleCall_0());
		}
		this_LiteralValue_0=ruleLiteralValue
		{
			$current = $this_LiteralValue_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTestValueAccess().getResolvableValueParserRuleCall_1());
		}
		this_ResolvableValue_1=ruleResolvableValue
		{
			$current = $this_ResolvableValue_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLiteralValue
entryRuleLiteralValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralValueRule()); }
	iv_ruleLiteralValue=ruleLiteralValue
	{ $current=$iv_ruleLiteralValue.current; }
	EOF;

// Rule LiteralValue
ruleLiteralValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING
			{
				newLeafNode(lv_value_0_0, grammarAccess.getLiteralValueAccess().getValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLiteralValueRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleResolvableValue
entryRuleResolvableValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResolvableValueRule()); }
	iv_ruleResolvableValue=ruleResolvableValue
	{ $current=$iv_ruleResolvableValue.current; }
	EOF;

// Rule ResolvableValue
ruleResolvableValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getResolvableValueAccess().getResolvableInstanceValueParserRuleCall_0());
		}
		this_ResolvableInstanceValue_0=ruleResolvableInstanceValue
		{
			$current = $this_ResolvableInstanceValue_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getResolvableValueAccess().getResolvableTransitionOutputValueParserRuleCall_1());
		}
		this_ResolvableTransitionOutputValue_1=ruleResolvableTransitionOutputValue
		{
			$current = $this_ResolvableTransitionOutputValue_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleResolvableInstanceValue
entryRuleResolvableInstanceValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResolvableInstanceValueRule()); }
	iv_ruleResolvableInstanceValue=ruleResolvableInstanceValue
	{ $current=$iv_ruleResolvableInstanceValue.current; }
	EOF;

// Rule ResolvableInstanceValue
ruleResolvableInstanceValue returns [EObject current=null]
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
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResolvableInstanceValueRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getResolvableInstanceValueAccess().getInstanceInstanceCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getResolvableInstanceValueAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResolvableInstanceValueRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getResolvableInstanceValueAccess().getKeyStateDefinitionCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleResolvableTransitionOutputValue
entryRuleResolvableTransitionOutputValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResolvableTransitionOutputValueRule()); }
	iv_ruleResolvableTransitionOutputValue=ruleResolvableTransitionOutputValue
	{ $current=$iv_ruleResolvableTransitionOutputValue.current; }
	EOF;

// Rule ResolvableTransitionOutputValue
ruleResolvableTransitionOutputValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='OUTPUT'
		{
			newLeafNode(otherlv_0, grammarAccess.getResolvableTransitionOutputValueAccess().getOUTPUTKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResolvableTransitionOutputValueRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getResolvableTransitionOutputValueAccess().getStateStateDefinitionCrossReference_1_0());
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getResolvableTransitionOutputValueAccess().getFullStopKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResolvableTransitionOutputValueRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getResolvableTransitionOutputValueAccess().getKeyStateDefinitionCrossReference_3_0());
				}
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
