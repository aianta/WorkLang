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
package work.worklang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package work.worklang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import work.worklang.services.WorkGrammarAccess;

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
    	return "WorkStatement";
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

// Entry rule entryRuleWorkStatement
entryRuleWorkStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkStatementRule()); }
	iv_ruleWorkStatement=ruleWorkStatement
	{ $current=$iv_ruleWorkStatement.current; }
	EOF;

// Rule WorkStatement
ruleWorkStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getWorkStatementAccess().getActionParserRuleCall_0());
		}
		this_Action_0=ruleAction
		{
			$current = $this_Action_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getWorkStatementAccess().getMetaActionParserRuleCall_1());
		}
		this_MetaAction_1=ruleMetaAction
		{
			$current = $this_MetaAction_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getActionAccess().getMatchParserRuleCall());
	}
	this_Match_0=ruleMatch
	{
		$current = $this_Match_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleMatch
entryRuleMatch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMatchRule()); }
	iv_ruleMatch=ruleMatch
	{ $current=$iv_ruleMatch.current; }
	EOF;

// Rule Match
ruleMatch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='match'
		{
			newLeafNode(otherlv_0, grammarAccess.getMatchAccess().getMatchKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMatchRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getMatchAccess().getDomainElementCrossReference_1_0());
				}
			)
		)
		otherlv_2='with'
		{
			newLeafNode(otherlv_2, grammarAccess.getMatchAccess().getWithKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMatchRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getMatchAccess().getRangeElementCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRulePoint
entryRulePoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPointRule()); }
	iv_rulePoint=rulePoint
	{ $current=$iv_rulePoint.current; }
	EOF;

// Rule Point
rulePoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_filepath_0_0=RULE_STRING
			{
				newLeafNode(lv_filepath_0_0, grammarAccess.getPointAccess().getFilepathSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPointRule());
				}
				setWithLastConsumed(
					$current,
					"filepath",
					lv_filepath_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleMetaAction
entryRuleMetaAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMetaActionRule()); }
	iv_ruleMetaAction=ruleMetaAction
	{ $current=$iv_ruleMetaAction.current; }
	EOF;

// Rule MetaAction
ruleMetaAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getMetaActionAccess().getAddParserRuleCall());
	}
	this_Add_0=ruleAdd
	{
		$current = $this_Add_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleAdd
entryRuleAdd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddRule()); }
	iv_ruleAdd=ruleAdd
	{ $current=$iv_ruleAdd.current; }
	EOF;

// Rule Add
ruleAdd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
		}
		(
			(
				lv_filepath_1_0=RULE_STRING
				{
					newLeafNode(lv_filepath_1_0, grammarAccess.getAddAccess().getFilepathSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"filepath",
						lv_filepath_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
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
