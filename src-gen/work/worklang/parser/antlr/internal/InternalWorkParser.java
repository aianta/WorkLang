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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWorkParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'match'", "'with'", "'add'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

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
        	return "WorkStatement";
       	}

       	@Override
       	protected WorkGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWorkStatement"
    // InternalWork.g:77:1: entryRuleWorkStatement returns [EObject current=null] : iv_ruleWorkStatement= ruleWorkStatement EOF ;
    public final EObject entryRuleWorkStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkStatement = null;


        try {
            // InternalWork.g:77:54: (iv_ruleWorkStatement= ruleWorkStatement EOF )
            // InternalWork.g:78:2: iv_ruleWorkStatement= ruleWorkStatement EOF
            {
             newCompositeNode(grammarAccess.getWorkStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkStatement=ruleWorkStatement();

            state._fsp--;

             current =iv_ruleWorkStatement; 
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
    // $ANTLR end "entryRuleWorkStatement"


    // $ANTLR start "ruleWorkStatement"
    // InternalWork.g:84:1: ruleWorkStatement returns [EObject current=null] : (this_Action_0= ruleAction | this_MetaAction_1= ruleMetaAction ) ;
    public final EObject ruleWorkStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Action_0 = null;

        EObject this_MetaAction_1 = null;



        	enterRule();

        try {
            // InternalWork.g:90:2: ( (this_Action_0= ruleAction | this_MetaAction_1= ruleMetaAction ) )
            // InternalWork.g:91:2: (this_Action_0= ruleAction | this_MetaAction_1= ruleMetaAction )
            {
            // InternalWork.g:91:2: (this_Action_0= ruleAction | this_MetaAction_1= ruleMetaAction )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalWork.g:92:3: this_Action_0= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getWorkStatementAccess().getActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_0=ruleAction();

                    state._fsp--;


                    			current = this_Action_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWork.g:101:3: this_MetaAction_1= ruleMetaAction
                    {

                    			newCompositeNode(grammarAccess.getWorkStatementAccess().getMetaActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MetaAction_1=ruleMetaAction();

                    state._fsp--;


                    			current = this_MetaAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleWorkStatement"


    // $ANTLR start "entryRuleAction"
    // InternalWork.g:113:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalWork.g:113:47: (iv_ruleAction= ruleAction EOF )
            // InternalWork.g:114:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalWork.g:120:1: ruleAction returns [EObject current=null] : this_Match_0= ruleMatch ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Match_0 = null;



        	enterRule();

        try {
            // InternalWork.g:126:2: (this_Match_0= ruleMatch )
            // InternalWork.g:127:2: this_Match_0= ruleMatch
            {

            		newCompositeNode(grammarAccess.getActionAccess().getMatchParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Match_0=ruleMatch();

            state._fsp--;


            		current = this_Match_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleMatch"
    // InternalWork.g:138:1: entryRuleMatch returns [EObject current=null] : iv_ruleMatch= ruleMatch EOF ;
    public final EObject entryRuleMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatch = null;


        try {
            // InternalWork.g:138:46: (iv_ruleMatch= ruleMatch EOF )
            // InternalWork.g:139:2: iv_ruleMatch= ruleMatch EOF
            {
             newCompositeNode(grammarAccess.getMatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatch=ruleMatch();

            state._fsp--;

             current =iv_ruleMatch; 
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
    // $ANTLR end "entryRuleMatch"


    // $ANTLR start "ruleMatch"
    // InternalWork.g:145:1: ruleMatch returns [EObject current=null] : (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalWork.g:151:2: ( (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalWork.g:152:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalWork.g:152:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) )
            // InternalWork.g:153:3: otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchAccess().getMatchKeyword_0());
            		
            // InternalWork.g:157:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:158:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:158:4: (otherlv_1= RULE_ID )
            // InternalWork.g:159:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getMatchAccess().getDomainElementCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchAccess().getWithKeyword_2());
            		
            // InternalWork.g:174:3: ( (otherlv_3= RULE_ID ) )
            // InternalWork.g:175:4: (otherlv_3= RULE_ID )
            {
            // InternalWork.g:175:4: (otherlv_3= RULE_ID )
            // InternalWork.g:176:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getMatchAccess().getRangeElementCrossReference_3_0());
            				

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
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRulePoint"
    // InternalWork.g:191:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalWork.g:191:46: (iv_rulePoint= rulePoint EOF )
            // InternalWork.g:192:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalWork.g:198:1: rulePoint returns [EObject current=null] : ( (lv_filepath_0_0= RULE_STRING ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token lv_filepath_0_0=null;


        	enterRule();

        try {
            // InternalWork.g:204:2: ( ( (lv_filepath_0_0= RULE_STRING ) ) )
            // InternalWork.g:205:2: ( (lv_filepath_0_0= RULE_STRING ) )
            {
            // InternalWork.g:205:2: ( (lv_filepath_0_0= RULE_STRING ) )
            // InternalWork.g:206:3: (lv_filepath_0_0= RULE_STRING )
            {
            // InternalWork.g:206:3: (lv_filepath_0_0= RULE_STRING )
            // InternalWork.g:207:4: lv_filepath_0_0= RULE_STRING
            {
            lv_filepath_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_filepath_0_0, grammarAccess.getPointAccess().getFilepathSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPointRule());
            				}
            				setWithLastConsumed(
            					current,
            					"filepath",
            					lv_filepath_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleMetaAction"
    // InternalWork.g:226:1: entryRuleMetaAction returns [EObject current=null] : iv_ruleMetaAction= ruleMetaAction EOF ;
    public final EObject entryRuleMetaAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaAction = null;


        try {
            // InternalWork.g:226:51: (iv_ruleMetaAction= ruleMetaAction EOF )
            // InternalWork.g:227:2: iv_ruleMetaAction= ruleMetaAction EOF
            {
             newCompositeNode(grammarAccess.getMetaActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaAction=ruleMetaAction();

            state._fsp--;

             current =iv_ruleMetaAction; 
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
    // $ANTLR end "entryRuleMetaAction"


    // $ANTLR start "ruleMetaAction"
    // InternalWork.g:233:1: ruleMetaAction returns [EObject current=null] : this_Add_0= ruleAdd ;
    public final EObject ruleMetaAction() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;



        	enterRule();

        try {
            // InternalWork.g:239:2: (this_Add_0= ruleAdd )
            // InternalWork.g:240:2: this_Add_0= ruleAdd
            {

            		newCompositeNode(grammarAccess.getMetaActionAccess().getAddParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Add_0=ruleAdd();

            state._fsp--;


            		current = this_Add_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleMetaAction"


    // $ANTLR start "entryRuleAdd"
    // InternalWork.g:251:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalWork.g:251:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalWork.g:252:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalWork.g:258:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'add' ( (lv_filepath_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filepath_1_0=null;


        	enterRule();

        try {
            // InternalWork.g:264:2: ( (otherlv_0= 'add' ( (lv_filepath_1_0= RULE_STRING ) ) ) )
            // InternalWork.g:265:2: (otherlv_0= 'add' ( (lv_filepath_1_0= RULE_STRING ) ) )
            {
            // InternalWork.g:265:2: (otherlv_0= 'add' ( (lv_filepath_1_0= RULE_STRING ) ) )
            // InternalWork.g:266:3: otherlv_0= 'add' ( (lv_filepath_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
            		
            // InternalWork.g:270:3: ( (lv_filepath_1_0= RULE_STRING ) )
            // InternalWork.g:271:4: (lv_filepath_1_0= RULE_STRING )
            {
            // InternalWork.g:271:4: (lv_filepath_1_0= RULE_STRING )
            // InternalWork.g:272:5: lv_filepath_1_0= RULE_STRING
            {
            lv_filepath_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_filepath_1_0, grammarAccess.getAddAccess().getFilepathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filepath",
            						lv_filepath_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAdd"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});

}