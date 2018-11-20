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
    	return "Domain";
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

// Entry rule entryRuleDomain
entryRuleDomain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainRule()); }
	iv_ruleDomain=ruleDomain
	{ $current=$iv_ruleDomain.current; }
	EOF;

// Rule Domain
ruleDomain returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='domain'
		{
			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDomainRule());
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
			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainAccess().getDefinitionSpaceDefinitionSpaceParserRuleCall_3_0());
				}
				lv_definitionSpace_3_0=ruleDefinitionSpace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainRule());
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
					newCompositeNode(grammarAccess.getDomainAccess().getInstanceSpaceInstanceSpaceParserRuleCall_4_0());
				}
				lv_instanceSpace_4_0=ruleInstanceSpace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainRule());
					}
					set(
						$current,
						"instanceSpace",
						lv_instanceSpace_4_0,
						"org.worklang.Work.InstanceSpace");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='state'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='input'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getInputKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getInputStateCrossReference_3_0());
				}
			)
		)
		otherlv_4='output'
		{
			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getOutputKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getOutputStateCrossReference_5_0());
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
					newCompositeNode(grammarAccess.getDefinitionSpaceAccess().getStatesStateParserRuleCall_3_0());
				}
				lv_states_3_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionSpaceRule());
					}
					add(
						$current,
						"states",
						lv_states_3_0,
						"org.worklang.Work.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionSpaceAccess().getTransitionsTransitionParserRuleCall_4_0());
				}
				lv_transitions_4_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionSpaceRule());
					}
					add(
						$current,
						"transitions",
						lv_transitions_4_0,
						"org.worklang.Work.Transition");
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
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getConceptualTransitionTransitionCrossReference_0_0());
				}
			)
		)
		otherlv_1='instance'
		{
			newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getInstanceKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getInstanceAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInstanceAccess().getTransitionTransitionInstanceParserRuleCall_3_0());
				}
				lv_transition_3_0=ruleTransitionInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstanceRule());
					}
					set(
						$current,
						"transition",
						lv_transition_3_0,
						"org.worklang.Work.TransitionInstance");
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

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
