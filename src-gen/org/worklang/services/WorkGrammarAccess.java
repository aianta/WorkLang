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
	
	public class DomainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Domain");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDomainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefinitionSpaceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefinitionSpaceDefinitionSpaceParserRuleCall_3_0 = (RuleCall)cDefinitionSpaceAssignment_3.eContents().get(0);
		private final Assignment cInstanceSpaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInstanceSpaceInstanceSpaceParserRuleCall_4_0 = (RuleCall)cInstanceSpaceAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Domain:
		//	'domain'
		//	name=ID
		//	'{'
		//	definitionSpace=DefinitionSpace?
		//	instanceSpace=InstanceSpace?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'domain' name=ID '{' definitionSpace=DefinitionSpace? instanceSpace=InstanceSpace? '}'
		public Group getGroup() { return cGroup; }
		
		//'domain'
		public Keyword getDomainKeyword_0() { return cDomainKeyword_0; }
		
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
		
		//instanceSpace=InstanceSpace?
		public Assignment getInstanceSpaceAssignment_4() { return cInstanceSpaceAssignment_4; }
		
		//InstanceSpace
		public RuleCall getInstanceSpaceInstanceSpaceParserRuleCall_4_0() { return cInstanceSpaceInstanceSpaceParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//State:
		//	'state' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'state' name=ID
		public Group getGroup() { return cGroup; }
		
		//'state'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cInputKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInputAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cInputStateCrossReference_3_0 = (CrossReference)cInputAssignment_3.eContents().get(0);
		private final RuleCall cInputStateIDTerminalRuleCall_3_0_1 = (RuleCall)cInputStateCrossReference_3_0.eContents().get(1);
		private final Keyword cOutputKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cOutputAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cOutputStateCrossReference_5_0 = (CrossReference)cOutputAssignment_5.eContents().get(0);
		private final RuleCall cOutputStateIDTerminalRuleCall_5_0_1 = (RuleCall)cOutputStateCrossReference_5_0.eContents().get(1);
		
		//Transition:
		//	'transition' name=ID 'input' input=[State] 'output' output=[State];
		@Override public ParserRule getRule() { return rule; }
		
		//'transition' name=ID 'input' input=[State] 'output' output=[State]
		public Group getGroup() { return cGroup; }
		
		//'transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'input'
		public Keyword getInputKeyword_2() { return cInputKeyword_2; }
		
		//input=[State]
		public Assignment getInputAssignment_3() { return cInputAssignment_3; }
		
		//[State]
		public CrossReference getInputStateCrossReference_3_0() { return cInputStateCrossReference_3_0; }
		
		//ID
		public RuleCall getInputStateIDTerminalRuleCall_3_0_1() { return cInputStateIDTerminalRuleCall_3_0_1; }
		
		//'output'
		public Keyword getOutputKeyword_4() { return cOutputKeyword_4; }
		
		//output=[State]
		public Assignment getOutputAssignment_5() { return cOutputAssignment_5; }
		
		//[State]
		public CrossReference getOutputStateCrossReference_5_0() { return cOutputStateCrossReference_5_0; }
		
		//ID
		public RuleCall getOutputStateIDTerminalRuleCall_5_0_1() { return cOutputStateIDTerminalRuleCall_5_0_1; }
	}
	public class DefinitionSpaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.DefinitionSpace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDefinitionSpaceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDefinitionsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStatesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStatesStateParserRuleCall_3_0 = (RuleCall)cStatesAssignment_3.eContents().get(0);
		private final Assignment cTransitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransitionsTransitionParserRuleCall_4_0 = (RuleCall)cTransitionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DefinitionSpace:
		//	{DefinitionSpace} 'definitions'
		//	'{'
		//	states+=State*
		//	transitions+=Transition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{DefinitionSpace} 'definitions' '{' states+=State* transitions+=Transition* '}'
		public Group getGroup() { return cGroup; }
		
		//{DefinitionSpace}
		public Action getDefinitionSpaceAction_0() { return cDefinitionSpaceAction_0; }
		
		//'definitions'
		public Keyword getDefinitionsKeyword_1() { return cDefinitionsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//states+=State*
		public Assignment getStatesAssignment_3() { return cStatesAssignment_3; }
		
		//State
		public RuleCall getStatesStateParserRuleCall_3_0() { return cStatesStateParserRuleCall_3_0; }
		
		//transitions+=Transition*
		public Assignment getTransitionsAssignment_4() { return cTransitionsAssignment_4; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_4_0() { return cTransitionsTransitionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
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
	public class InstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.worklang.Work.Instance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConceptualTransitionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cConceptualTransitionTransitionCrossReference_0_0 = (CrossReference)cConceptualTransitionAssignment_0.eContents().get(0);
		private final RuleCall cConceptualTransitionTransitionIDTerminalRuleCall_0_0_1 = (RuleCall)cConceptualTransitionTransitionCrossReference_0_0.eContents().get(1);
		private final Keyword cInstanceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cTransitionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTransitionTransitionInstanceParserRuleCall_3_0 = (RuleCall)cTransitionAssignment_3.eContents().get(0);
		
		//Instance:
		//	conceptualTransition=[Transition]
		//	'instance'
		//	name=STRING
		//	transition=TransitionInstance;
		@Override public ParserRule getRule() { return rule; }
		
		//conceptualTransition=[Transition] 'instance' name=STRING transition=TransitionInstance
		public Group getGroup() { return cGroup; }
		
		//conceptualTransition=[Transition]
		public Assignment getConceptualTransitionAssignment_0() { return cConceptualTransitionAssignment_0; }
		
		//[Transition]
		public CrossReference getConceptualTransitionTransitionCrossReference_0_0() { return cConceptualTransitionTransitionCrossReference_0_0; }
		
		//ID
		public RuleCall getConceptualTransitionTransitionIDTerminalRuleCall_0_0_1() { return cConceptualTransitionTransitionIDTerminalRuleCall_0_0_1; }
		
		//'instance'
		public Keyword getInstanceKeyword_1() { return cInstanceKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//transition=TransitionInstance
		public Assignment getTransitionAssignment_3() { return cTransitionAssignment_3; }
		
		//TransitionInstance
		public RuleCall getTransitionTransitionInstanceParserRuleCall_3_0() { return cTransitionTransitionInstanceParserRuleCall_3_0; }
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
	
	
	private final DomainElements pDomain;
	private final StateElements pState;
	private final TransitionElements pTransition;
	private final DefinitionSpaceElements pDefinitionSpace;
	private final InstanceSpaceElements pInstanceSpace;
	private final InstanceElements pInstance;
	private final TransitionInstanceElements pTransitionInstance;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public WorkGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDomain = new DomainElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
		this.pDefinitionSpace = new DefinitionSpaceElements();
		this.pInstanceSpace = new InstanceSpaceElements();
		this.pInstance = new InstanceElements();
		this.pTransitionInstance = new TransitionInstanceElements();
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

	
	//Domain:
	//	'domain'
	//	name=ID
	//	'{'
	//	definitionSpace=DefinitionSpace?
	//	instanceSpace=InstanceSpace?
	//	'}';
	public DomainElements getDomainAccess() {
		return pDomain;
	}
	
	public ParserRule getDomainRule() {
		return getDomainAccess().getRule();
	}
	
	//State:
	//	'state' name=ID;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition:
	//	'transition' name=ID 'input' input=[State] 'output' output=[State];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//DefinitionSpace:
	//	{DefinitionSpace} 'definitions'
	//	'{'
	//	states+=State*
	//	transitions+=Transition*
	//	'}';
	public DefinitionSpaceElements getDefinitionSpaceAccess() {
		return pDefinitionSpace;
	}
	
	public ParserRule getDefinitionSpaceRule() {
		return getDefinitionSpaceAccess().getRule();
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
	
	//Instance:
	//	conceptualTransition=[Transition]
	//	'instance'
	//	name=STRING
	//	transition=TransitionInstance;
	public InstanceElements getInstanceAccess() {
		return pInstance;
	}
	
	public ParserRule getInstanceRule() {
		return getInstanceAccess().getRule();
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
