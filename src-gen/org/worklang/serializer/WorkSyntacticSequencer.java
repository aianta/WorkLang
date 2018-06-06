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
package org.worklang.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.worklang.services.WorkGrammarAccess;

@SuppressWarnings("all")
public class WorkSyntacticSequencer extends AbstractSyntacticSequencer {

	protected WorkGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ReferenceState_AsKeyword_3_0_1_or_CalledKeyword_3_0_0;
	protected AbstractElementAlias match_ReferenceTransition_AsKeyword_3_0_1_or_CalledKeyword_3_0_0;
	protected AbstractElementAlias match_TerminalTransitionalExpression_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_TerminalTransitionalExpression_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (WorkGrammarAccess) access;
		match_ReferenceState_AsKeyword_3_0_1_or_CalledKeyword_3_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getReferenceStateAccess().getAsKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getReferenceStateAccess().getCalledKeyword_3_0_0()));
		match_ReferenceTransition_AsKeyword_3_0_1_or_CalledKeyword_3_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getReferenceTransitionAccess().getAsKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getReferenceTransitionAccess().getCalledKeyword_3_0_0()));
		match_TerminalTransitionalExpression_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getTerminalTransitionalExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_TerminalTransitionalExpression_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getTerminalTransitionalExpressionAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getNotOpRule())
			return getNotOpToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * NotOp:
	 * 	'NOT'
	 * ;
	 */
	protected String getNotOpToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "NOT";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ReferenceState_AsKeyword_3_0_1_or_CalledKeyword_3_0_0.equals(syntax))
				emit_ReferenceState_AsKeyword_3_0_1_or_CalledKeyword_3_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ReferenceTransition_AsKeyword_3_0_1_or_CalledKeyword_3_0_0.equals(syntax))
				emit_ReferenceTransition_AsKeyword_3_0_1_or_CalledKeyword_3_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TerminalTransitionalExpression_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_TerminalTransitionalExpression_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TerminalTransitionalExpression_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_TerminalTransitionalExpression_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'called' | 'as'
	 *
	 * This ambiguous syntax occurs at:
	 *     from=FromFieldDefinition (ambiguity) state=StateID
	 */
	protected void emit_ReferenceState_AsKeyword_3_0_1_or_CalledKeyword_3_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'called' | 'as'
	 *
	 * This ambiguous syntax occurs at:
	 *     fromDef=FromFieldDefinition (ambiguity) transition=TransitionID
	 */
	protected void emit_ReferenceTransition_AsKeyword_3_0_1_or_CalledKeyword_3_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) value=[TransitionID|ID]
	 *     (rule start) (ambiguity) {Operation.left=}
	 */
	protected void emit_TerminalTransitionalExpression_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Operation.left=}
	 */
	protected void emit_TerminalTransitionalExpression_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
