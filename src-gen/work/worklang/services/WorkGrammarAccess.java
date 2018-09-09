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
package work.worklang.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
	
	public class WorkStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "work.worklang.Work.WorkStatement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cActionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMetaActionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//WorkStatement:
		//	Action | MetaAction;
		@Override public ParserRule getRule() { return rule; }
		
		//Action | MetaAction
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Action
		public RuleCall getActionParserRuleCall_0() { return cActionParserRuleCall_0; }
		
		//MetaAction
		public RuleCall getMetaActionParserRuleCall_1() { return cMetaActionParserRuleCall_1; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "work.worklang.Work.Action");
		private final RuleCall cMatchParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Action:
		//	Match;
		@Override public ParserRule getRule() { return rule; }
		
		//Match
		public RuleCall getMatchParserRuleCall() { return cMatchParserRuleCall; }
	}
	public class MatchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "work.worklang.Work.Match");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMatchKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDomainAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDomainElementCrossReference_1_0 = (CrossReference)cDomainAssignment_1.eContents().get(0);
		private final RuleCall cDomainElementIDTerminalRuleCall_1_0_1 = (RuleCall)cDomainElementCrossReference_1_0.eContents().get(1);
		private final Keyword cWithKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRangeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRangeElementCrossReference_3_0 = (CrossReference)cRangeAssignment_3.eContents().get(0);
		private final RuleCall cRangeElementIDTerminalRuleCall_3_0_1 = (RuleCall)cRangeElementCrossReference_3_0.eContents().get(1);
		
		//Match:
		//	'match' domain=[Element] 'with' range=[Element];
		@Override public ParserRule getRule() { return rule; }
		
		//'match' domain=[Element] 'with' range=[Element]
		public Group getGroup() { return cGroup; }
		
		//'match'
		public Keyword getMatchKeyword_0() { return cMatchKeyword_0; }
		
		//domain=[Element]
		public Assignment getDomainAssignment_1() { return cDomainAssignment_1; }
		
		//[Element]
		public CrossReference getDomainElementCrossReference_1_0() { return cDomainElementCrossReference_1_0; }
		
		//ID
		public RuleCall getDomainElementIDTerminalRuleCall_1_0_1() { return cDomainElementIDTerminalRuleCall_1_0_1; }
		
		//'with'
		public Keyword getWithKeyword_2() { return cWithKeyword_2; }
		
		//range=[Element]
		public Assignment getRangeAssignment_3() { return cRangeAssignment_3; }
		
		//[Element]
		public CrossReference getRangeElementCrossReference_3_0() { return cRangeElementCrossReference_3_0; }
		
		//ID
		public RuleCall getRangeElementIDTerminalRuleCall_3_0_1() { return cRangeElementIDTerminalRuleCall_3_0_1; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "work.worklang.Work.Element");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cSourceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSourcePointParserRuleCall_1_0 = (RuleCall)cSourceAssignment_1.eContents().get(0);
		
		//Element:
		//	name=STRING
		//	source=Point;
		@Override public ParserRule getRule() { return rule; }
		
		//name=STRING source=Point
		public Group getGroup() { return cGroup; }
		
		//name=STRING
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0_0() { return cNameSTRINGTerminalRuleCall_0_0; }
		
		//source=Point
		public Assignment getSourceAssignment_1() { return cSourceAssignment_1; }
		
		//Point
		public RuleCall getSourcePointParserRuleCall_1_0() { return cSourcePointParserRuleCall_1_0; }
	}
	public class PointElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "work.worklang.Work.Point");
		private final Assignment cFilepathAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFilepathSTRINGTerminalRuleCall_0 = (RuleCall)cFilepathAssignment.eContents().get(0);
		
		//Point:
		//	filepath=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//filepath=STRING
		public Assignment getFilepathAssignment() { return cFilepathAssignment; }
		
		//STRING
		public RuleCall getFilepathSTRINGTerminalRuleCall_0() { return cFilepathSTRINGTerminalRuleCall_0; }
	}
	public class MetaActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "work.worklang.Work.MetaAction");
		private final RuleCall cAddParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MetaAction:
		//	Add;
		@Override public ParserRule getRule() { return rule; }
		
		//Add
		public RuleCall getAddParserRuleCall() { return cAddParserRuleCall; }
	}
	public class AddElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "work.worklang.Work.Add");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAddKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFilepathAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFilepathSTRINGTerminalRuleCall_1_0 = (RuleCall)cFilepathAssignment_1.eContents().get(0);
		
		//Add:
		//	'add' filepath=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'add' filepath=STRING
		public Group getGroup() { return cGroup; }
		
		//'add'
		public Keyword getAddKeyword_0() { return cAddKeyword_0; }
		
		//filepath=STRING
		public Assignment getFilepathAssignment_1() { return cFilepathAssignment_1; }
		
		//STRING
		public RuleCall getFilepathSTRINGTerminalRuleCall_1_0() { return cFilepathSTRINGTerminalRuleCall_1_0; }
	}
	
	
	private final WorkStatementElements pWorkStatement;
	private final ActionElements pAction;
	private final MatchElements pMatch;
	private final ElementElements pElement;
	private final PointElements pPoint;
	private final MetaActionElements pMetaAction;
	private final AddElements pAdd;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public WorkGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pWorkStatement = new WorkStatementElements();
		this.pAction = new ActionElements();
		this.pMatch = new MatchElements();
		this.pElement = new ElementElements();
		this.pPoint = new PointElements();
		this.pMetaAction = new MetaActionElements();
		this.pAdd = new AddElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("work.worklang.Work".equals(grammar.getName())) {
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

	
	//WorkStatement:
	//	Action | MetaAction;
	public WorkStatementElements getWorkStatementAccess() {
		return pWorkStatement;
	}
	
	public ParserRule getWorkStatementRule() {
		return getWorkStatementAccess().getRule();
	}
	
	//Action:
	//	Match;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//Match:
	//	'match' domain=[Element] 'with' range=[Element];
	public MatchElements getMatchAccess() {
		return pMatch;
	}
	
	public ParserRule getMatchRule() {
		return getMatchAccess().getRule();
	}
	
	//Element:
	//	name=STRING
	//	source=Point;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//Point:
	//	filepath=STRING;
	public PointElements getPointAccess() {
		return pPoint;
	}
	
	public ParserRule getPointRule() {
		return getPointAccess().getRule();
	}
	
	//MetaAction:
	//	Add;
	public MetaActionElements getMetaActionAccess() {
		return pMetaAction;
	}
	
	public ParserRule getMetaActionRule() {
		return getMetaActionAccess().getRule();
	}
	
	//Add:
	//	'add' filepath=STRING;
	public AddElements getAddAccess() {
		return pAdd;
	}
	
	public ParserRule getAddRule() {
		return getAddAccess().getRule();
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
