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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWorkParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'{'", "'}'", "'state'", "'transition'", "'input'", "'output'", "'definitions'", "'instances'", "'instance'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalWorkParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWorkParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWorkParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWork.g"; }



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




    // $ANTLR start "entryRuleDomain"
    // InternalWork.g:77:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalWork.g:77:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalWork.g:78:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalWork.g:84:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )? ( (lv_instanceSpace_4_0= ruleInstanceSpace ) )? otherlv_5= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_definitionSpace_3_0 = null;

        EObject lv_instanceSpace_4_0 = null;



        	enterRule();

        try {
            // InternalWork.g:90:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )? ( (lv_instanceSpace_4_0= ruleInstanceSpace ) )? otherlv_5= '}' ) )
            // InternalWork.g:91:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )? ( (lv_instanceSpace_4_0= ruleInstanceSpace ) )? otherlv_5= '}' )
            {
            // InternalWork.g:91:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )? ( (lv_instanceSpace_4_0= ruleInstanceSpace ) )? otherlv_5= '}' )
            // InternalWork.g:92:3: otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )? ( (lv_instanceSpace_4_0= ruleInstanceSpace ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalWork.g:96:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWork.g:97:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWork.g:97:4: (lv_name_1_0= RULE_ID )
            // InternalWork.g:98:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:118:3: ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalWork.g:119:4: (lv_definitionSpace_3_0= ruleDefinitionSpace )
                    {
                    // InternalWork.g:119:4: (lv_definitionSpace_3_0= ruleDefinitionSpace )
                    // InternalWork.g:120:5: lv_definitionSpace_3_0= ruleDefinitionSpace
                    {

                    					newCompositeNode(grammarAccess.getDomainAccess().getDefinitionSpaceDefinitionSpaceParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_definitionSpace_3_0=ruleDefinitionSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDomainRule());
                    					}
                    					set(
                    						current,
                    						"definitionSpace",
                    						lv_definitionSpace_3_0,
                    						"org.worklang.Work.DefinitionSpace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:137:3: ( (lv_instanceSpace_4_0= ruleInstanceSpace ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalWork.g:138:4: (lv_instanceSpace_4_0= ruleInstanceSpace )
                    {
                    // InternalWork.g:138:4: (lv_instanceSpace_4_0= ruleInstanceSpace )
                    // InternalWork.g:139:5: lv_instanceSpace_4_0= ruleInstanceSpace
                    {

                    					newCompositeNode(grammarAccess.getDomainAccess().getInstanceSpaceInstanceSpaceParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_instanceSpace_4_0=ruleInstanceSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDomainRule());
                    					}
                    					set(
                    						current,
                    						"instanceSpace",
                    						lv_instanceSpace_4_0,
                    						"org.worklang.Work.InstanceSpace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleState"
    // InternalWork.g:164:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalWork.g:164:46: (iv_ruleState= ruleState EOF )
            // InternalWork.g:165:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalWork.g:171:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWork.g:177:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWork.g:178:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWork.g:178:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWork.g:179:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalWork.g:183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWork.g:184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWork.g:184:4: (lv_name_1_0= RULE_ID )
            // InternalWork.g:185:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalWork.g:205:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalWork.g:205:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalWork.g:206:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalWork.g:212:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'input' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'output' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalWork.g:218:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'input' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'output' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalWork.g:219:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'input' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'output' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalWork.g:219:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'input' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'output' ( (otherlv_5= RULE_ID ) ) )
            // InternalWork.g:220:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'input' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'output' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalWork.g:224:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWork.g:225:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWork.g:225:4: (lv_name_1_0= RULE_ID )
            // InternalWork.g:226:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getInputKeyword_2());
            		
            // InternalWork.g:246:3: ( (otherlv_3= RULE_ID ) )
            // InternalWork.g:247:4: (otherlv_3= RULE_ID )
            {
            // InternalWork.g:247:4: (otherlv_3= RULE_ID )
            // InternalWork.g:248:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getInputStateCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getOutputKeyword_4());
            		
            // InternalWork.g:263:3: ( (otherlv_5= RULE_ID ) )
            // InternalWork.g:264:4: (otherlv_5= RULE_ID )
            {
            // InternalWork.g:264:4: (otherlv_5= RULE_ID )
            // InternalWork.g:265:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getOutputStateCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleDefinitionSpace"
    // InternalWork.g:280:1: entryRuleDefinitionSpace returns [EObject current=null] : iv_ruleDefinitionSpace= ruleDefinitionSpace EOF ;
    public final EObject entryRuleDefinitionSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionSpace = null;


        try {
            // InternalWork.g:280:56: (iv_ruleDefinitionSpace= ruleDefinitionSpace EOF )
            // InternalWork.g:281:2: iv_ruleDefinitionSpace= ruleDefinitionSpace EOF
            {
             newCompositeNode(grammarAccess.getDefinitionSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionSpace=ruleDefinitionSpace();

            state._fsp--;

             current =iv_ruleDefinitionSpace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitionSpace"


    // $ANTLR start "ruleDefinitionSpace"
    // InternalWork.g:287:1: ruleDefinitionSpace returns [EObject current=null] : ( () otherlv_1= 'definitions' otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* ( (lv_transitions_4_0= ruleTransition ) )* otherlv_5= '}' ) ;
    public final EObject ruleDefinitionSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_states_3_0 = null;

        EObject lv_transitions_4_0 = null;



        	enterRule();

        try {
            // InternalWork.g:293:2: ( ( () otherlv_1= 'definitions' otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* ( (lv_transitions_4_0= ruleTransition ) )* otherlv_5= '}' ) )
            // InternalWork.g:294:2: ( () otherlv_1= 'definitions' otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* ( (lv_transitions_4_0= ruleTransition ) )* otherlv_5= '}' )
            {
            // InternalWork.g:294:2: ( () otherlv_1= 'definitions' otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* ( (lv_transitions_4_0= ruleTransition ) )* otherlv_5= '}' )
            // InternalWork.g:295:3: () otherlv_1= 'definitions' otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* ( (lv_transitions_4_0= ruleTransition ) )* otherlv_5= '}'
            {
            // InternalWork.g:295:3: ()
            // InternalWork.g:296:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefinitionSpaceAccess().getDefinitionSpaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionSpaceAccess().getDefinitionsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionSpaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:310:3: ( (lv_states_3_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWork.g:311:4: (lv_states_3_0= ruleState )
            	    {
            	    // InternalWork.g:311:4: (lv_states_3_0= ruleState )
            	    // InternalWork.g:312:5: lv_states_3_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getDefinitionSpaceAccess().getStatesStateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_states_3_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDefinitionSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_3_0,
            	    						"org.worklang.Work.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalWork.g:329:3: ( (lv_transitions_4_0= ruleTransition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWork.g:330:4: (lv_transitions_4_0= ruleTransition )
            	    {
            	    // InternalWork.g:330:4: (lv_transitions_4_0= ruleTransition )
            	    // InternalWork.g:331:5: lv_transitions_4_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getDefinitionSpaceAccess().getTransitionsTransitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_transitions_4_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDefinitionSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_4_0,
            	    						"org.worklang.Work.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDefinitionSpaceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinitionSpace"


    // $ANTLR start "entryRuleInstanceSpace"
    // InternalWork.g:356:1: entryRuleInstanceSpace returns [EObject current=null] : iv_ruleInstanceSpace= ruleInstanceSpace EOF ;
    public final EObject entryRuleInstanceSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpace = null;


        try {
            // InternalWork.g:356:54: (iv_ruleInstanceSpace= ruleInstanceSpace EOF )
            // InternalWork.g:357:2: iv_ruleInstanceSpace= ruleInstanceSpace EOF
            {
             newCompositeNode(grammarAccess.getInstanceSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceSpace=ruleInstanceSpace();

            state._fsp--;

             current =iv_ruleInstanceSpace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceSpace"


    // $ANTLR start "ruleInstanceSpace"
    // InternalWork.g:363:1: ruleInstanceSpace returns [EObject current=null] : ( () otherlv_1= 'instances' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= '}' ) ;
    public final EObject ruleInstanceSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_instances_3_0 = null;



        	enterRule();

        try {
            // InternalWork.g:369:2: ( ( () otherlv_1= 'instances' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= '}' ) )
            // InternalWork.g:370:2: ( () otherlv_1= 'instances' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= '}' )
            {
            // InternalWork.g:370:2: ( () otherlv_1= 'instances' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= '}' )
            // InternalWork.g:371:3: () otherlv_1= 'instances' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= '}'
            {
            // InternalWork.g:371:3: ()
            // InternalWork.g:372:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstanceSpaceAccess().getInstanceSpaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceSpaceAccess().getInstancesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getInstanceSpaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:386:3: ( (lv_instances_3_0= ruleInstance ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWork.g:387:4: (lv_instances_3_0= ruleInstance )
            	    {
            	    // InternalWork.g:387:4: (lv_instances_3_0= ruleInstance )
            	    // InternalWork.g:388:5: lv_instances_3_0= ruleInstance
            	    {

            	    					newCompositeNode(grammarAccess.getInstanceSpaceAccess().getInstancesInstanceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_instances_3_0=ruleInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstanceSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instances",
            	    						lv_instances_3_0,
            	    						"org.worklang.Work.Instance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInstanceSpaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceSpace"


    // $ANTLR start "entryRuleInstance"
    // InternalWork.g:413:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalWork.g:413:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalWork.g:414:2: iv_ruleInstance= ruleInstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;

             current =iv_ruleInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalWork.g:420:1: ruleInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'instance' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_transition_3_0= ruleTransitionInstance ) ) ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_transition_3_0 = null;



        	enterRule();

        try {
            // InternalWork.g:426:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'instance' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_transition_3_0= ruleTransitionInstance ) ) ) )
            // InternalWork.g:427:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'instance' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_transition_3_0= ruleTransitionInstance ) ) )
            {
            // InternalWork.g:427:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'instance' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_transition_3_0= ruleTransitionInstance ) ) )
            // InternalWork.g:428:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'instance' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_transition_3_0= ruleTransitionInstance ) )
            {
            // InternalWork.g:428:3: ( (otherlv_0= RULE_ID ) )
            // InternalWork.g:429:4: (otherlv_0= RULE_ID )
            {
            // InternalWork.g:429:4: (otherlv_0= RULE_ID )
            // InternalWork.g:430:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getConceptualTransitionTransitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getInstanceKeyword_1());
            		
            // InternalWork.g:445:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalWork.g:446:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalWork.g:446:4: (lv_name_2_0= RULE_STRING )
            // InternalWork.g:447:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInstanceAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalWork.g:463:3: ( (lv_transition_3_0= ruleTransitionInstance ) )
            // InternalWork.g:464:4: (lv_transition_3_0= ruleTransitionInstance )
            {
            // InternalWork.g:464:4: (lv_transition_3_0= ruleTransitionInstance )
            // InternalWork.g:465:5: lv_transition_3_0= ruleTransitionInstance
            {

            					newCompositeNode(grammarAccess.getInstanceAccess().getTransitionTransitionInstanceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_transition_3_0=ruleTransitionInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstanceRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_3_0,
            						"org.worklang.Work.TransitionInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleTransitionInstance"
    // InternalWork.g:486:1: entryRuleTransitionInstance returns [EObject current=null] : iv_ruleTransitionInstance= ruleTransitionInstance EOF ;
    public final EObject entryRuleTransitionInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionInstance = null;


        try {
            // InternalWork.g:486:59: (iv_ruleTransitionInstance= ruleTransitionInstance EOF )
            // InternalWork.g:487:2: iv_ruleTransitionInstance= ruleTransitionInstance EOF
            {
             newCompositeNode(grammarAccess.getTransitionInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionInstance=ruleTransitionInstance();

            state._fsp--;

             current =iv_ruleTransitionInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionInstance"


    // $ANTLR start "ruleTransitionInstance"
    // InternalWork.g:493:1: ruleTransitionInstance returns [EObject current=null] : ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleTransitionInstance() throws RecognitionException {
        EObject current = null;

        Token lv_host_0_0=null;
        Token lv_port_1_0=null;
        Token lv_path_2_0=null;


        	enterRule();

        try {
            // InternalWork.g:499:2: ( ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? ) )
            // InternalWork.g:500:2: ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? )
            {
            // InternalWork.g:500:2: ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? )
            // InternalWork.g:501:3: ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )?
            {
            // InternalWork.g:501:3: ( (lv_host_0_0= RULE_STRING ) )
            // InternalWork.g:502:4: (lv_host_0_0= RULE_STRING )
            {
            // InternalWork.g:502:4: (lv_host_0_0= RULE_STRING )
            // InternalWork.g:503:5: lv_host_0_0= RULE_STRING
            {
            lv_host_0_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_host_0_0, grammarAccess.getTransitionInstanceAccess().getHostSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"host",
            						lv_host_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalWork.g:519:3: ( (lv_port_1_0= RULE_INT ) )
            // InternalWork.g:520:4: (lv_port_1_0= RULE_INT )
            {
            // InternalWork.g:520:4: (lv_port_1_0= RULE_INT )
            // InternalWork.g:521:5: lv_port_1_0= RULE_INT
            {
            lv_port_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_port_1_0, grammarAccess.getTransitionInstanceAccess().getPortINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalWork.g:537:3: ( (lv_path_2_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWork.g:538:4: (lv_path_2_0= RULE_STRING )
                    {
                    // InternalWork.g:538:4: (lv_path_2_0= RULE_STRING )
                    // InternalWork.g:539:5: lv_path_2_0= RULE_STRING
                    {
                    lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_path_2_0, grammarAccess.getTransitionInstanceAccess().getPathSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTransitionInstanceRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"path",
                    						lv_path_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionInstance"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});

}