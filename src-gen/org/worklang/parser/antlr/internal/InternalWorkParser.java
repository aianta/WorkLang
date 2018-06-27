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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'field'", "'{'", "'}'", "'mappings'", "'state'", "'from'", "'to'", "'transition'", "'definitions'", "'primitive'", "'compound'", "'references'", "'instances'", "'with'", "'input'", "'output'", "'instance'", "'use'", "'set'", "'NOT'", "'AND'", "'OR'", "'('", "')'", "'setOf'", "'START'", "'WITH'", "';'", "'IF'", "'='", "'ELSE'", "'WHILE'", "'THEN'", "'.'", "'OUTPUT'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
        	return "Model";
       	}

       	@Override
       	protected WorkGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalWork.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalWork.g:77:46: (iv_ruleModel= ruleModel EOF )
            // InternalWork.g:78:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalWork.g:84:1: ruleModel returns [EObject current=null] : ( (lv_fields_0_0= ruleFieldDefinition ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_fields_0_0 = null;



        	enterRule();

        try {
            // InternalWork.g:90:2: ( ( (lv_fields_0_0= ruleFieldDefinition ) )* )
            // InternalWork.g:91:2: ( (lv_fields_0_0= ruleFieldDefinition ) )*
            {
            // InternalWork.g:91:2: ( (lv_fields_0_0= ruleFieldDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWork.g:92:3: (lv_fields_0_0= ruleFieldDefinition )
            	    {
            	    // InternalWork.g:92:3: (lv_fields_0_0= ruleFieldDefinition )
            	    // InternalWork.g:93:4: lv_fields_0_0= ruleFieldDefinition
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getFieldsFieldDefinitionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_fields_0_0=ruleFieldDefinition();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"fields",
            	    					lv_fields_0_0,
            	    					"org.worklang.Work.FieldDefinition");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFieldDefinition"
    // InternalWork.g:113:1: entryRuleFieldDefinition returns [EObject current=null] : iv_ruleFieldDefinition= ruleFieldDefinition EOF ;
    public final EObject entryRuleFieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDefinition = null;


        try {
            // InternalWork.g:113:56: (iv_ruleFieldDefinition= ruleFieldDefinition EOF )
            // InternalWork.g:114:2: iv_ruleFieldDefinition= ruleFieldDefinition EOF
            {
             newCompositeNode(grammarAccess.getFieldDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldDefinition=ruleFieldDefinition();

            state._fsp--;

             current =iv_ruleFieldDefinition; 
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
    // $ANTLR end "entryRuleFieldDefinition"


    // $ANTLR start "ruleFieldDefinition"
    // InternalWork.g:120:1: ruleFieldDefinition returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )? ( (lv_referenceSpace_4_0= ruleReferenceSpace ) )? ( (lv_mapSpace_5_0= ruleMapSpace ) )? ( (lv_instanceSpace_6_0= ruleInstanceSpace ) )? otherlv_7= '}' ) ;
    public final EObject ruleFieldDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_definitionSpace_3_0 = null;

        EObject lv_referenceSpace_4_0 = null;

        EObject lv_mapSpace_5_0 = null;

        EObject lv_instanceSpace_6_0 = null;



        	enterRule();

        try {
            // InternalWork.g:126:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )? ( (lv_referenceSpace_4_0= ruleReferenceSpace ) )? ( (lv_mapSpace_5_0= ruleMapSpace ) )? ( (lv_instanceSpace_6_0= ruleInstanceSpace ) )? otherlv_7= '}' ) )
            // InternalWork.g:127:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )? ( (lv_referenceSpace_4_0= ruleReferenceSpace ) )? ( (lv_mapSpace_5_0= ruleMapSpace ) )? ( (lv_instanceSpace_6_0= ruleInstanceSpace ) )? otherlv_7= '}' )
            {
            // InternalWork.g:127:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )? ( (lv_referenceSpace_4_0= ruleReferenceSpace ) )? ( (lv_mapSpace_5_0= ruleMapSpace ) )? ( (lv_instanceSpace_6_0= ruleInstanceSpace ) )? otherlv_7= '}' )
            // InternalWork.g:128:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )? ( (lv_referenceSpace_4_0= ruleReferenceSpace ) )? ( (lv_mapSpace_5_0= ruleMapSpace ) )? ( (lv_instanceSpace_6_0= ruleInstanceSpace ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldDefinitionAccess().getFieldKeyword_0());
            		
            // InternalWork.g:132:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWork.g:133:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWork.g:133:4: (lv_name_1_0= RULE_ID )
            // InternalWork.g:134:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:154:3: ( (lv_definitionSpace_3_0= ruleDefinitionSpace ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalWork.g:155:4: (lv_definitionSpace_3_0= ruleDefinitionSpace )
                    {
                    // InternalWork.g:155:4: (lv_definitionSpace_3_0= ruleDefinitionSpace )
                    // InternalWork.g:156:5: lv_definitionSpace_3_0= ruleDefinitionSpace
                    {

                    					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getDefinitionSpaceDefinitionSpaceParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_definitionSpace_3_0=ruleDefinitionSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
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

            // InternalWork.g:173:3: ( (lv_referenceSpace_4_0= ruleReferenceSpace ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalWork.g:174:4: (lv_referenceSpace_4_0= ruleReferenceSpace )
                    {
                    // InternalWork.g:174:4: (lv_referenceSpace_4_0= ruleReferenceSpace )
                    // InternalWork.g:175:5: lv_referenceSpace_4_0= ruleReferenceSpace
                    {

                    					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getReferenceSpaceReferenceSpaceParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_referenceSpace_4_0=ruleReferenceSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"referenceSpace",
                    						lv_referenceSpace_4_0,
                    						"org.worklang.Work.ReferenceSpace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:192:3: ( (lv_mapSpace_5_0= ruleMapSpace ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWork.g:193:4: (lv_mapSpace_5_0= ruleMapSpace )
                    {
                    // InternalWork.g:193:4: (lv_mapSpace_5_0= ruleMapSpace )
                    // InternalWork.g:194:5: lv_mapSpace_5_0= ruleMapSpace
                    {

                    					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getMapSpaceMapSpaceParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_mapSpace_5_0=ruleMapSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"mapSpace",
                    						lv_mapSpace_5_0,
                    						"org.worklang.Work.MapSpace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:211:3: ( (lv_instanceSpace_6_0= ruleInstanceSpace ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWork.g:212:4: (lv_instanceSpace_6_0= ruleInstanceSpace )
                    {
                    // InternalWork.g:212:4: (lv_instanceSpace_6_0= ruleInstanceSpace )
                    // InternalWork.g:213:5: lv_instanceSpace_6_0= ruleInstanceSpace
                    {

                    					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getInstanceSpaceInstanceSpaceParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_instanceSpace_6_0=ruleInstanceSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"instanceSpace",
                    						lv_instanceSpace_6_0,
                    						"org.worklang.Work.InstanceSpace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFieldDefinitionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFieldDefinition"


    // $ANTLR start "entryRuleMapSpace"
    // InternalWork.g:238:1: entryRuleMapSpace returns [EObject current=null] : iv_ruleMapSpace= ruleMapSpace EOF ;
    public final EObject entryRuleMapSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapSpace = null;


        try {
            // InternalWork.g:238:49: (iv_ruleMapSpace= ruleMapSpace EOF )
            // InternalWork.g:239:2: iv_ruleMapSpace= ruleMapSpace EOF
            {
             newCompositeNode(grammarAccess.getMapSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapSpace=ruleMapSpace();

            state._fsp--;

             current =iv_ruleMapSpace; 
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
    // $ANTLR end "entryRuleMapSpace"


    // $ANTLR start "ruleMapSpace"
    // InternalWork.g:245:1: ruleMapSpace returns [EObject current=null] : ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappedStates_3_0= ruleStateMapping ) )* ( (lv_mappedTransitions_4_0= ruleTransitionMapping ) )* otherlv_5= '}' ) ;
    public final EObject ruleMapSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_mappedStates_3_0 = null;

        EObject lv_mappedTransitions_4_0 = null;



        	enterRule();

        try {
            // InternalWork.g:251:2: ( ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappedStates_3_0= ruleStateMapping ) )* ( (lv_mappedTransitions_4_0= ruleTransitionMapping ) )* otherlv_5= '}' ) )
            // InternalWork.g:252:2: ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappedStates_3_0= ruleStateMapping ) )* ( (lv_mappedTransitions_4_0= ruleTransitionMapping ) )* otherlv_5= '}' )
            {
            // InternalWork.g:252:2: ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappedStates_3_0= ruleStateMapping ) )* ( (lv_mappedTransitions_4_0= ruleTransitionMapping ) )* otherlv_5= '}' )
            // InternalWork.g:253:3: () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappedStates_3_0= ruleStateMapping ) )* ( (lv_mappedTransitions_4_0= ruleTransitionMapping ) )* otherlv_5= '}'
            {
            // InternalWork.g:253:3: ()
            // InternalWork.g:254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapSpaceAccess().getMapSpaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMapSpaceAccess().getMappingsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMapSpaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:268:3: ( (lv_mappedStates_3_0= ruleStateMapping ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWork.g:269:4: (lv_mappedStates_3_0= ruleStateMapping )
            	    {
            	    // InternalWork.g:269:4: (lv_mappedStates_3_0= ruleStateMapping )
            	    // InternalWork.g:270:5: lv_mappedStates_3_0= ruleStateMapping
            	    {

            	    					newCompositeNode(grammarAccess.getMapSpaceAccess().getMappedStatesStateMappingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_mappedStates_3_0=ruleStateMapping();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMapSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mappedStates",
            	    						lv_mappedStates_3_0,
            	    						"org.worklang.Work.StateMapping");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalWork.g:287:3: ( (lv_mappedTransitions_4_0= ruleTransitionMapping ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWork.g:288:4: (lv_mappedTransitions_4_0= ruleTransitionMapping )
            	    {
            	    // InternalWork.g:288:4: (lv_mappedTransitions_4_0= ruleTransitionMapping )
            	    // InternalWork.g:289:5: lv_mappedTransitions_4_0= ruleTransitionMapping
            	    {

            	    					newCompositeNode(grammarAccess.getMapSpaceAccess().getMappedTransitionsTransitionMappingParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_mappedTransitions_4_0=ruleTransitionMapping();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMapSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mappedTransitions",
            	    						lv_mappedTransitions_4_0,
            	    						"org.worklang.Work.TransitionMapping");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMapSpaceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMapSpace"


    // $ANTLR start "entryRuleStateMapping"
    // InternalWork.g:314:1: entryRuleStateMapping returns [EObject current=null] : iv_ruleStateMapping= ruleStateMapping EOF ;
    public final EObject entryRuleStateMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMapping = null;


        try {
            // InternalWork.g:314:53: (iv_ruleStateMapping= ruleStateMapping EOF )
            // InternalWork.g:315:2: iv_ruleStateMapping= ruleStateMapping EOF
            {
             newCompositeNode(grammarAccess.getStateMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMapping=ruleStateMapping();

            state._fsp--;

             current =iv_ruleStateMapping; 
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
    // $ANTLR end "entryRuleStateMapping"


    // $ANTLR start "ruleStateMapping"
    // InternalWork.g:321:1: ruleStateMapping returns [EObject current=null] : (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleStateMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalWork.g:327:2: ( (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalWork.g:328:2: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalWork.g:328:2: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalWork.g:329:3: otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateMappingAccess().getStateKeyword_0());
            		
            // InternalWork.g:333:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:334:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:334:4: (otherlv_1= RULE_ID )
            // InternalWork.g:335:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMappingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getStateMappingAccess().getForeignStateStateDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStateMappingAccess().getFromKeyword_2());
            		
            // InternalWork.g:350:3: ( (otherlv_3= RULE_ID ) )
            // InternalWork.g:351:4: (otherlv_3= RULE_ID )
            {
            // InternalWork.g:351:4: (otherlv_3= RULE_ID )
            // InternalWork.g:352:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMappingRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_3, grammarAccess.getStateMappingAccess().getFieldFieldDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getStateMappingAccess().getToKeyword_4());
            		
            // InternalWork.g:367:3: ( (otherlv_5= RULE_ID ) )
            // InternalWork.g:368:4: (otherlv_5= RULE_ID )
            {
            // InternalWork.g:368:4: (otherlv_5= RULE_ID )
            // InternalWork.g:369:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMappingRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getStateMappingAccess().getLocalStateStateDefinitionCrossReference_5_0());
            				

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
    // $ANTLR end "ruleStateMapping"


    // $ANTLR start "entryRuleTransitionMapping"
    // InternalWork.g:384:1: entryRuleTransitionMapping returns [EObject current=null] : iv_ruleTransitionMapping= ruleTransitionMapping EOF ;
    public final EObject entryRuleTransitionMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionMapping = null;


        try {
            // InternalWork.g:384:58: (iv_ruleTransitionMapping= ruleTransitionMapping EOF )
            // InternalWork.g:385:2: iv_ruleTransitionMapping= ruleTransitionMapping EOF
            {
             newCompositeNode(grammarAccess.getTransitionMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionMapping=ruleTransitionMapping();

            state._fsp--;

             current =iv_ruleTransitionMapping; 
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
    // $ANTLR end "entryRuleTransitionMapping"


    // $ANTLR start "ruleTransitionMapping"
    // InternalWork.g:391:1: ruleTransitionMapping returns [EObject current=null] : (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleTransitionMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalWork.g:397:2: ( (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalWork.g:398:2: (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalWork.g:398:2: (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalWork.g:399:3: otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionMappingAccess().getTransitionKeyword_0());
            		
            // InternalWork.g:403:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:404:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:404:4: (otherlv_1= RULE_ID )
            // InternalWork.g:405:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionMappingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getTransitionMappingAccess().getForeignTransitionTransitionDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionMappingAccess().getFromKeyword_2());
            		
            // InternalWork.g:420:3: ( (otherlv_3= RULE_ID ) )
            // InternalWork.g:421:4: (otherlv_3= RULE_ID )
            {
            // InternalWork.g:421:4: (otherlv_3= RULE_ID )
            // InternalWork.g:422:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionMappingRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionMappingAccess().getFieldFieldDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionMappingAccess().getToKeyword_4());
            		
            // InternalWork.g:437:3: ( (otherlv_5= RULE_ID ) )
            // InternalWork.g:438:4: (otherlv_5= RULE_ID )
            {
            // InternalWork.g:438:4: (otherlv_5= RULE_ID )
            // InternalWork.g:439:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionMappingRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getTransitionMappingAccess().getLocalTransitionTransitionDefinitionCrossReference_5_0());
            				

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
    // $ANTLR end "ruleTransitionMapping"


    // $ANTLR start "entryRuleDefinitionSpace"
    // InternalWork.g:454:1: entryRuleDefinitionSpace returns [EObject current=null] : iv_ruleDefinitionSpace= ruleDefinitionSpace EOF ;
    public final EObject entryRuleDefinitionSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionSpace = null;


        try {
            // InternalWork.g:454:56: (iv_ruleDefinitionSpace= ruleDefinitionSpace EOF )
            // InternalWork.g:455:2: iv_ruleDefinitionSpace= ruleDefinitionSpace EOF
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
    // InternalWork.g:461:1: ruleDefinitionSpace returns [EObject current=null] : ( () otherlv_1= 'definitions' otherlv_2= '{' ( (lv_states_3_0= ruleStateDefinition ) )* ( (lv_transitions_4_0= ruleTransitionDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleDefinitionSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_states_3_0 = null;

        EObject lv_transitions_4_0 = null;



        	enterRule();

        try {
            // InternalWork.g:467:2: ( ( () otherlv_1= 'definitions' otherlv_2= '{' ( (lv_states_3_0= ruleStateDefinition ) )* ( (lv_transitions_4_0= ruleTransitionDefinition ) )* otherlv_5= '}' ) )
            // InternalWork.g:468:2: ( () otherlv_1= 'definitions' otherlv_2= '{' ( (lv_states_3_0= ruleStateDefinition ) )* ( (lv_transitions_4_0= ruleTransitionDefinition ) )* otherlv_5= '}' )
            {
            // InternalWork.g:468:2: ( () otherlv_1= 'definitions' otherlv_2= '{' ( (lv_states_3_0= ruleStateDefinition ) )* ( (lv_transitions_4_0= ruleTransitionDefinition ) )* otherlv_5= '}' )
            // InternalWork.g:469:3: () otherlv_1= 'definitions' otherlv_2= '{' ( (lv_states_3_0= ruleStateDefinition ) )* ( (lv_transitions_4_0= ruleTransitionDefinition ) )* otherlv_5= '}'
            {
            // InternalWork.g:469:3: ()
            // InternalWork.g:470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefinitionSpaceAccess().getDefinitionSpaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionSpaceAccess().getDefinitionsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionSpaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:484:3: ( (lv_states_3_0= ruleStateDefinition ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==15) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==21) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==15) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalWork.g:485:4: (lv_states_3_0= ruleStateDefinition )
            	    {
            	    // InternalWork.g:485:4: (lv_states_3_0= ruleStateDefinition )
            	    // InternalWork.g:486:5: lv_states_3_0= ruleStateDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getDefinitionSpaceAccess().getStatesStateDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_states_3_0=ruleStateDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDefinitionSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_3_0,
            	    						"org.worklang.Work.StateDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalWork.g:503:3: ( (lv_transitions_4_0= ruleTransitionDefinition ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=20 && LA9_0<=21)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWork.g:504:4: (lv_transitions_4_0= ruleTransitionDefinition )
            	    {
            	    // InternalWork.g:504:4: (lv_transitions_4_0= ruleTransitionDefinition )
            	    // InternalWork.g:505:5: lv_transitions_4_0= ruleTransitionDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getDefinitionSpaceAccess().getTransitionsTransitionDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_transitions_4_0=ruleTransitionDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDefinitionSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_4_0,
            	    						"org.worklang.Work.TransitionDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "entryRuleStateDefinition"
    // InternalWork.g:530:1: entryRuleStateDefinition returns [EObject current=null] : iv_ruleStateDefinition= ruleStateDefinition EOF ;
    public final EObject entryRuleStateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDefinition = null;


        try {
            // InternalWork.g:530:56: (iv_ruleStateDefinition= ruleStateDefinition EOF )
            // InternalWork.g:531:2: iv_ruleStateDefinition= ruleStateDefinition EOF
            {
             newCompositeNode(grammarAccess.getStateDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateDefinition=ruleStateDefinition();

            state._fsp--;

             current =iv_ruleStateDefinition; 
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
    // $ANTLR end "entryRuleStateDefinition"


    // $ANTLR start "ruleStateDefinition"
    // InternalWork.g:537:1: ruleStateDefinition returns [EObject current=null] : (this_PrimitiveStateDefinition_0= rulePrimitiveStateDefinition | this_CompoundStateDefinition_1= ruleCompoundStateDefinition ) ;
    public final EObject ruleStateDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveStateDefinition_0 = null;

        EObject this_CompoundStateDefinition_1 = null;



        	enterRule();

        try {
            // InternalWork.g:543:2: ( (this_PrimitiveStateDefinition_0= rulePrimitiveStateDefinition | this_CompoundStateDefinition_1= ruleCompoundStateDefinition ) )
            // InternalWork.g:544:2: (this_PrimitiveStateDefinition_0= rulePrimitiveStateDefinition | this_CompoundStateDefinition_1= ruleCompoundStateDefinition )
            {
            // InternalWork.g:544:2: (this_PrimitiveStateDefinition_0= rulePrimitiveStateDefinition | this_CompoundStateDefinition_1= ruleCompoundStateDefinition )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalWork.g:545:3: this_PrimitiveStateDefinition_0= rulePrimitiveStateDefinition
                    {

                    			newCompositeNode(grammarAccess.getStateDefinitionAccess().getPrimitiveStateDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveStateDefinition_0=rulePrimitiveStateDefinition();

                    state._fsp--;


                    			current = this_PrimitiveStateDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWork.g:554:3: this_CompoundStateDefinition_1= ruleCompoundStateDefinition
                    {

                    			newCompositeNode(grammarAccess.getStateDefinitionAccess().getCompoundStateDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundStateDefinition_1=ruleCompoundStateDefinition();

                    state._fsp--;


                    			current = this_CompoundStateDefinition_1;
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
    // $ANTLR end "ruleStateDefinition"


    // $ANTLR start "entryRulePrimitiveStateDefinition"
    // InternalWork.g:566:1: entryRulePrimitiveStateDefinition returns [EObject current=null] : iv_rulePrimitiveStateDefinition= rulePrimitiveStateDefinition EOF ;
    public final EObject entryRulePrimitiveStateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveStateDefinition = null;


        try {
            // InternalWork.g:566:65: (iv_rulePrimitiveStateDefinition= rulePrimitiveStateDefinition EOF )
            // InternalWork.g:567:2: iv_rulePrimitiveStateDefinition= rulePrimitiveStateDefinition EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveStateDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveStateDefinition=rulePrimitiveStateDefinition();

            state._fsp--;

             current =iv_rulePrimitiveStateDefinition; 
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
    // $ANTLR end "entryRulePrimitiveStateDefinition"


    // $ANTLR start "rulePrimitiveStateDefinition"
    // InternalWork.g:573:1: rulePrimitiveStateDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'primitive' ) ) otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitiveStateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalWork.g:579:2: ( ( ( (lv_type_0_0= 'primitive' ) ) otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalWork.g:580:2: ( ( (lv_type_0_0= 'primitive' ) ) otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalWork.g:580:2: ( ( (lv_type_0_0= 'primitive' ) ) otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalWork.g:581:3: ( (lv_type_0_0= 'primitive' ) ) otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalWork.g:581:3: ( (lv_type_0_0= 'primitive' ) )
            // InternalWork.g:582:4: (lv_type_0_0= 'primitive' )
            {
            // InternalWork.g:582:4: (lv_type_0_0= 'primitive' )
            // InternalWork.g:583:5: lv_type_0_0= 'primitive'
            {
            lv_type_0_0=(Token)match(input,20,FOLLOW_16); 

            					newLeafNode(lv_type_0_0, grammarAccess.getPrimitiveStateDefinitionAccess().getTypePrimitiveKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveStateDefinitionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "primitive");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimitiveStateDefinitionAccess().getStateKeyword_1());
            		
            // InternalWork.g:599:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalWork.g:600:4: (lv_name_2_0= RULE_ID )
            {
            // InternalWork.g:600:4: (lv_name_2_0= RULE_ID )
            // InternalWork.g:601:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPrimitiveStateDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveStateDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "rulePrimitiveStateDefinition"


    // $ANTLR start "entryRuleCompoundStateDefinition"
    // InternalWork.g:621:1: entryRuleCompoundStateDefinition returns [EObject current=null] : iv_ruleCompoundStateDefinition= ruleCompoundStateDefinition EOF ;
    public final EObject entryRuleCompoundStateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundStateDefinition = null;


        try {
            // InternalWork.g:621:64: (iv_ruleCompoundStateDefinition= ruleCompoundStateDefinition EOF )
            // InternalWork.g:622:2: iv_ruleCompoundStateDefinition= ruleCompoundStateDefinition EOF
            {
             newCompositeNode(grammarAccess.getCompoundStateDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundStateDefinition=ruleCompoundStateDefinition();

            state._fsp--;

             current =iv_ruleCompoundStateDefinition; 
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
    // $ANTLR end "entryRuleCompoundStateDefinition"


    // $ANTLR start "ruleCompoundStateDefinition"
    // InternalWork.g:628:1: ruleCompoundStateDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'compound' ) ) otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ( (lv_composition_3_0= ruleWithStatesDefinition ) ) ) ;
    public final EObject ruleCompoundStateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_composition_3_0 = null;



        	enterRule();

        try {
            // InternalWork.g:634:2: ( ( ( (lv_type_0_0= 'compound' ) ) otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ( (lv_composition_3_0= ruleWithStatesDefinition ) ) ) )
            // InternalWork.g:635:2: ( ( (lv_type_0_0= 'compound' ) ) otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ( (lv_composition_3_0= ruleWithStatesDefinition ) ) )
            {
            // InternalWork.g:635:2: ( ( (lv_type_0_0= 'compound' ) ) otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ( (lv_composition_3_0= ruleWithStatesDefinition ) ) )
            // InternalWork.g:636:3: ( (lv_type_0_0= 'compound' ) ) otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ( (lv_composition_3_0= ruleWithStatesDefinition ) )
            {
            // InternalWork.g:636:3: ( (lv_type_0_0= 'compound' ) )
            // InternalWork.g:637:4: (lv_type_0_0= 'compound' )
            {
            // InternalWork.g:637:4: (lv_type_0_0= 'compound' )
            // InternalWork.g:638:5: lv_type_0_0= 'compound'
            {
            lv_type_0_0=(Token)match(input,21,FOLLOW_16); 

            					newLeafNode(lv_type_0_0, grammarAccess.getCompoundStateDefinitionAccess().getTypeCompoundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompoundStateDefinitionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "compound");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundStateDefinitionAccess().getStateKeyword_1());
            		
            // InternalWork.g:654:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalWork.g:655:4: (lv_name_2_0= RULE_ID )
            {
            // InternalWork.g:655:4: (lv_name_2_0= RULE_ID )
            // InternalWork.g:656:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCompoundStateDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompoundStateDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWork.g:672:3: ( (lv_composition_3_0= ruleWithStatesDefinition ) )
            // InternalWork.g:673:4: (lv_composition_3_0= ruleWithStatesDefinition )
            {
            // InternalWork.g:673:4: (lv_composition_3_0= ruleWithStatesDefinition )
            // InternalWork.g:674:5: lv_composition_3_0= ruleWithStatesDefinition
            {

            					newCompositeNode(grammarAccess.getCompoundStateDefinitionAccess().getCompositionWithStatesDefinitionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_composition_3_0=ruleWithStatesDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundStateDefinitionRule());
            					}
            					set(
            						current,
            						"composition",
            						lv_composition_3_0,
            						"org.worklang.Work.WithStatesDefinition");
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
    // $ANTLR end "ruleCompoundStateDefinition"


    // $ANTLR start "entryRuleTransitionDefinition"
    // InternalWork.g:695:1: entryRuleTransitionDefinition returns [EObject current=null] : iv_ruleTransitionDefinition= ruleTransitionDefinition EOF ;
    public final EObject entryRuleTransitionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDefinition = null;


        try {
            // InternalWork.g:695:61: (iv_ruleTransitionDefinition= ruleTransitionDefinition EOF )
            // InternalWork.g:696:2: iv_ruleTransitionDefinition= ruleTransitionDefinition EOF
            {
             newCompositeNode(grammarAccess.getTransitionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionDefinition=ruleTransitionDefinition();

            state._fsp--;

             current =iv_ruleTransitionDefinition; 
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
    // $ANTLR end "entryRuleTransitionDefinition"


    // $ANTLR start "ruleTransitionDefinition"
    // InternalWork.g:702:1: ruleTransitionDefinition returns [EObject current=null] : (this_PrimitiveTransitionDefinition_0= rulePrimitiveTransitionDefinition | this_CompoundTransitionDefinition_1= ruleCompoundTransitionDefinition ) ;
    public final EObject ruleTransitionDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTransitionDefinition_0 = null;

        EObject this_CompoundTransitionDefinition_1 = null;



        	enterRule();

        try {
            // InternalWork.g:708:2: ( (this_PrimitiveTransitionDefinition_0= rulePrimitiveTransitionDefinition | this_CompoundTransitionDefinition_1= ruleCompoundTransitionDefinition ) )
            // InternalWork.g:709:2: (this_PrimitiveTransitionDefinition_0= rulePrimitiveTransitionDefinition | this_CompoundTransitionDefinition_1= ruleCompoundTransitionDefinition )
            {
            // InternalWork.g:709:2: (this_PrimitiveTransitionDefinition_0= rulePrimitiveTransitionDefinition | this_CompoundTransitionDefinition_1= ruleCompoundTransitionDefinition )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalWork.g:710:3: this_PrimitiveTransitionDefinition_0= rulePrimitiveTransitionDefinition
                    {

                    			newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getPrimitiveTransitionDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTransitionDefinition_0=rulePrimitiveTransitionDefinition();

                    state._fsp--;


                    			current = this_PrimitiveTransitionDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWork.g:719:3: this_CompoundTransitionDefinition_1= ruleCompoundTransitionDefinition
                    {

                    			newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getCompoundTransitionDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundTransitionDefinition_1=ruleCompoundTransitionDefinition();

                    state._fsp--;


                    			current = this_CompoundTransitionDefinition_1;
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
    // $ANTLR end "ruleTransitionDefinition"


    // $ANTLR start "entryRulePrimitiveTransitionDefinition"
    // InternalWork.g:731:1: entryRulePrimitiveTransitionDefinition returns [EObject current=null] : iv_rulePrimitiveTransitionDefinition= rulePrimitiveTransitionDefinition EOF ;
    public final EObject entryRulePrimitiveTransitionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTransitionDefinition = null;


        try {
            // InternalWork.g:731:70: (iv_rulePrimitiveTransitionDefinition= rulePrimitiveTransitionDefinition EOF )
            // InternalWork.g:732:2: iv_rulePrimitiveTransitionDefinition= rulePrimitiveTransitionDefinition EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTransitionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTransitionDefinition=rulePrimitiveTransitionDefinition();

            state._fsp--;

             current =iv_rulePrimitiveTransitionDefinition; 
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
    // $ANTLR end "entryRulePrimitiveTransitionDefinition"


    // $ANTLR start "rulePrimitiveTransitionDefinition"
    // InternalWork.g:738:1: rulePrimitiveTransitionDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'primitive' ) ) otherlv_1= 'transition' ( (lv_name_2_0= RULE_ID ) ) ( (lv_in_3_0= ruleInputDefinition ) )? ( (lv_out_4_0= ruleOutputDefinition ) ) ) ;
    public final EObject rulePrimitiveTransitionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_in_3_0 = null;

        EObject lv_out_4_0 = null;



        	enterRule();

        try {
            // InternalWork.g:744:2: ( ( ( (lv_type_0_0= 'primitive' ) ) otherlv_1= 'transition' ( (lv_name_2_0= RULE_ID ) ) ( (lv_in_3_0= ruleInputDefinition ) )? ( (lv_out_4_0= ruleOutputDefinition ) ) ) )
            // InternalWork.g:745:2: ( ( (lv_type_0_0= 'primitive' ) ) otherlv_1= 'transition' ( (lv_name_2_0= RULE_ID ) ) ( (lv_in_3_0= ruleInputDefinition ) )? ( (lv_out_4_0= ruleOutputDefinition ) ) )
            {
            // InternalWork.g:745:2: ( ( (lv_type_0_0= 'primitive' ) ) otherlv_1= 'transition' ( (lv_name_2_0= RULE_ID ) ) ( (lv_in_3_0= ruleInputDefinition ) )? ( (lv_out_4_0= ruleOutputDefinition ) ) )
            // InternalWork.g:746:3: ( (lv_type_0_0= 'primitive' ) ) otherlv_1= 'transition' ( (lv_name_2_0= RULE_ID ) ) ( (lv_in_3_0= ruleInputDefinition ) )? ( (lv_out_4_0= ruleOutputDefinition ) )
            {
            // InternalWork.g:746:3: ( (lv_type_0_0= 'primitive' ) )
            // InternalWork.g:747:4: (lv_type_0_0= 'primitive' )
            {
            // InternalWork.g:747:4: (lv_type_0_0= 'primitive' )
            // InternalWork.g:748:5: lv_type_0_0= 'primitive'
            {
            lv_type_0_0=(Token)match(input,20,FOLLOW_18); 

            					newLeafNode(lv_type_0_0, grammarAccess.getPrimitiveTransitionDefinitionAccess().getTypePrimitiveKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveTransitionDefinitionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "primitive");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimitiveTransitionDefinitionAccess().getTransitionKeyword_1());
            		
            // InternalWork.g:764:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalWork.g:765:4: (lv_name_2_0= RULE_ID )
            {
            // InternalWork.g:765:4: (lv_name_2_0= RULE_ID )
            // InternalWork.g:766:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPrimitiveTransitionDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveTransitionDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWork.g:782:3: ( (lv_in_3_0= ruleInputDefinition ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalWork.g:783:4: (lv_in_3_0= ruleInputDefinition )
                    {
                    // InternalWork.g:783:4: (lv_in_3_0= ruleInputDefinition )
                    // InternalWork.g:784:5: lv_in_3_0= ruleInputDefinition
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveTransitionDefinitionAccess().getInInputDefinitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_in_3_0=ruleInputDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveTransitionDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"in",
                    						lv_in_3_0,
                    						"org.worklang.Work.InputDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:801:3: ( (lv_out_4_0= ruleOutputDefinition ) )
            // InternalWork.g:802:4: (lv_out_4_0= ruleOutputDefinition )
            {
            // InternalWork.g:802:4: (lv_out_4_0= ruleOutputDefinition )
            // InternalWork.g:803:5: lv_out_4_0= ruleOutputDefinition
            {

            					newCompositeNode(grammarAccess.getPrimitiveTransitionDefinitionAccess().getOutOutputDefinitionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_out_4_0=ruleOutputDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveTransitionDefinitionRule());
            					}
            					set(
            						current,
            						"out",
            						lv_out_4_0,
            						"org.worklang.Work.OutputDefinition");
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
    // $ANTLR end "rulePrimitiveTransitionDefinition"


    // $ANTLR start "entryRuleCompoundTransitionDefinition"
    // InternalWork.g:824:1: entryRuleCompoundTransitionDefinition returns [EObject current=null] : iv_ruleCompoundTransitionDefinition= ruleCompoundTransitionDefinition EOF ;
    public final EObject entryRuleCompoundTransitionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundTransitionDefinition = null;


        try {
            // InternalWork.g:824:69: (iv_ruleCompoundTransitionDefinition= ruleCompoundTransitionDefinition EOF )
            // InternalWork.g:825:2: iv_ruleCompoundTransitionDefinition= ruleCompoundTransitionDefinition EOF
            {
             newCompositeNode(grammarAccess.getCompoundTransitionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundTransitionDefinition=ruleCompoundTransitionDefinition();

            state._fsp--;

             current =iv_ruleCompoundTransitionDefinition; 
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
    // $ANTLR end "entryRuleCompoundTransitionDefinition"


    // $ANTLR start "ruleCompoundTransitionDefinition"
    // InternalWork.g:831:1: ruleCompoundTransitionDefinition returns [EObject current=null] : ( ( (lv_type_0_0= 'compound' ) ) otherlv_1= 'transition' ( (lv_name_2_0= RULE_ID ) ) ( (lv_in_3_0= ruleInputDefinition ) )? ( (lv_out_4_0= ruleOutputDefinition ) ) ( (lv_composition_5_0= ruleTransitionComposition ) ) ) ;
    public final EObject ruleCompoundTransitionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_in_3_0 = null;

        EObject lv_out_4_0 = null;

        EObject lv_composition_5_0 = null;



        	enterRule();

        try {
            // InternalWork.g:837:2: ( ( ( (lv_type_0_0= 'compound' ) ) otherlv_1= 'transition' ( (lv_name_2_0= RULE_ID ) ) ( (lv_in_3_0= ruleInputDefinition ) )? ( (lv_out_4_0= ruleOutputDefinition ) ) ( (lv_composition_5_0= ruleTransitionComposition ) ) ) )
            // InternalWork.g:838:2: ( ( (lv_type_0_0= 'compound' ) ) otherlv_1= 'transition' ( (lv_name_2_0= RULE_ID ) ) ( (lv_in_3_0= ruleInputDefinition ) )? ( (lv_out_4_0= ruleOutputDefinition ) ) ( (lv_composition_5_0= ruleTransitionComposition ) ) )
            {
            // InternalWork.g:838:2: ( ( (lv_type_0_0= 'compound' ) ) otherlv_1= 'transition' ( (lv_name_2_0= RULE_ID ) ) ( (lv_in_3_0= ruleInputDefinition ) )? ( (lv_out_4_0= ruleOutputDefinition ) ) ( (lv_composition_5_0= ruleTransitionComposition ) ) )
            // InternalWork.g:839:3: ( (lv_type_0_0= 'compound' ) ) otherlv_1= 'transition' ( (lv_name_2_0= RULE_ID ) ) ( (lv_in_3_0= ruleInputDefinition ) )? ( (lv_out_4_0= ruleOutputDefinition ) ) ( (lv_composition_5_0= ruleTransitionComposition ) )
            {
            // InternalWork.g:839:3: ( (lv_type_0_0= 'compound' ) )
            // InternalWork.g:840:4: (lv_type_0_0= 'compound' )
            {
            // InternalWork.g:840:4: (lv_type_0_0= 'compound' )
            // InternalWork.g:841:5: lv_type_0_0= 'compound'
            {
            lv_type_0_0=(Token)match(input,21,FOLLOW_18); 

            					newLeafNode(lv_type_0_0, grammarAccess.getCompoundTransitionDefinitionAccess().getTypeCompoundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompoundTransitionDefinitionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "compound");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundTransitionDefinitionAccess().getTransitionKeyword_1());
            		
            // InternalWork.g:857:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalWork.g:858:4: (lv_name_2_0= RULE_ID )
            {
            // InternalWork.g:858:4: (lv_name_2_0= RULE_ID )
            // InternalWork.g:859:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCompoundTransitionDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompoundTransitionDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWork.g:875:3: ( (lv_in_3_0= ruleInputDefinition ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalWork.g:876:4: (lv_in_3_0= ruleInputDefinition )
                    {
                    // InternalWork.g:876:4: (lv_in_3_0= ruleInputDefinition )
                    // InternalWork.g:877:5: lv_in_3_0= ruleInputDefinition
                    {

                    					newCompositeNode(grammarAccess.getCompoundTransitionDefinitionAccess().getInInputDefinitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_in_3_0=ruleInputDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompoundTransitionDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"in",
                    						lv_in_3_0,
                    						"org.worklang.Work.InputDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:894:3: ( (lv_out_4_0= ruleOutputDefinition ) )
            // InternalWork.g:895:4: (lv_out_4_0= ruleOutputDefinition )
            {
            // InternalWork.g:895:4: (lv_out_4_0= ruleOutputDefinition )
            // InternalWork.g:896:5: lv_out_4_0= ruleOutputDefinition
            {

            					newCompositeNode(grammarAccess.getCompoundTransitionDefinitionAccess().getOutOutputDefinitionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_out_4_0=ruleOutputDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundTransitionDefinitionRule());
            					}
            					set(
            						current,
            						"out",
            						lv_out_4_0,
            						"org.worklang.Work.OutputDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:913:3: ( (lv_composition_5_0= ruleTransitionComposition ) )
            // InternalWork.g:914:4: (lv_composition_5_0= ruleTransitionComposition )
            {
            // InternalWork.g:914:4: (lv_composition_5_0= ruleTransitionComposition )
            // InternalWork.g:915:5: lv_composition_5_0= ruleTransitionComposition
            {

            					newCompositeNode(grammarAccess.getCompoundTransitionDefinitionAccess().getCompositionTransitionCompositionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_composition_5_0=ruleTransitionComposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundTransitionDefinitionRule());
            					}
            					set(
            						current,
            						"composition",
            						lv_composition_5_0,
            						"org.worklang.Work.TransitionComposition");
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
    // $ANTLR end "ruleCompoundTransitionDefinition"


    // $ANTLR start "entryRuleReferenceSpace"
    // InternalWork.g:936:1: entryRuleReferenceSpace returns [EObject current=null] : iv_ruleReferenceSpace= ruleReferenceSpace EOF ;
    public final EObject entryRuleReferenceSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceSpace = null;


        try {
            // InternalWork.g:936:55: (iv_ruleReferenceSpace= ruleReferenceSpace EOF )
            // InternalWork.g:937:2: iv_ruleReferenceSpace= ruleReferenceSpace EOF
            {
             newCompositeNode(grammarAccess.getReferenceSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceSpace=ruleReferenceSpace();

            state._fsp--;

             current =iv_ruleReferenceSpace; 
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
    // $ANTLR end "entryRuleReferenceSpace"


    // $ANTLR start "ruleReferenceSpace"
    // InternalWork.g:943:1: ruleReferenceSpace returns [EObject current=null] : ( () otherlv_1= 'references' otherlv_2= '{' ( (lv_refStates_3_0= ruleReferenceState ) )* ( (lv_refTransitions_4_0= ruleReferenceTransition ) )* otherlv_5= '}' ) ;
    public final EObject ruleReferenceSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_refStates_3_0 = null;

        EObject lv_refTransitions_4_0 = null;



        	enterRule();

        try {
            // InternalWork.g:949:2: ( ( () otherlv_1= 'references' otherlv_2= '{' ( (lv_refStates_3_0= ruleReferenceState ) )* ( (lv_refTransitions_4_0= ruleReferenceTransition ) )* otherlv_5= '}' ) )
            // InternalWork.g:950:2: ( () otherlv_1= 'references' otherlv_2= '{' ( (lv_refStates_3_0= ruleReferenceState ) )* ( (lv_refTransitions_4_0= ruleReferenceTransition ) )* otherlv_5= '}' )
            {
            // InternalWork.g:950:2: ( () otherlv_1= 'references' otherlv_2= '{' ( (lv_refStates_3_0= ruleReferenceState ) )* ( (lv_refTransitions_4_0= ruleReferenceTransition ) )* otherlv_5= '}' )
            // InternalWork.g:951:3: () otherlv_1= 'references' otherlv_2= '{' ( (lv_refStates_3_0= ruleReferenceState ) )* ( (lv_refTransitions_4_0= ruleReferenceTransition ) )* otherlv_5= '}'
            {
            // InternalWork.g:951:3: ()
            // InternalWork.g:952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceSpaceAccess().getReferenceSpaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceSpaceAccess().getReferencesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceSpaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:966:3: ( (lv_refStates_3_0= ruleReferenceState ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalWork.g:967:4: (lv_refStates_3_0= ruleReferenceState )
            	    {
            	    // InternalWork.g:967:4: (lv_refStates_3_0= ruleReferenceState )
            	    // InternalWork.g:968:5: lv_refStates_3_0= ruleReferenceState
            	    {

            	    					newCompositeNode(grammarAccess.getReferenceSpaceAccess().getRefStatesReferenceStateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_refStates_3_0=ruleReferenceState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferenceSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refStates",
            	    						lv_refStates_3_0,
            	    						"org.worklang.Work.ReferenceState");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalWork.g:985:3: ( (lv_refTransitions_4_0= ruleReferenceTransition ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalWork.g:986:4: (lv_refTransitions_4_0= ruleReferenceTransition )
            	    {
            	    // InternalWork.g:986:4: (lv_refTransitions_4_0= ruleReferenceTransition )
            	    // InternalWork.g:987:5: lv_refTransitions_4_0= ruleReferenceTransition
            	    {

            	    					newCompositeNode(grammarAccess.getReferenceSpaceAccess().getRefTransitionsReferenceTransitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_refTransitions_4_0=ruleReferenceTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferenceSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refTransitions",
            	    						lv_refTransitions_4_0,
            	    						"org.worklang.Work.ReferenceTransition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceSpaceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleReferenceSpace"


    // $ANTLR start "entryRuleReferenceTransition"
    // InternalWork.g:1012:1: entryRuleReferenceTransition returns [EObject current=null] : iv_ruleReferenceTransition= ruleReferenceTransition EOF ;
    public final EObject entryRuleReferenceTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTransition = null;


        try {
            // InternalWork.g:1012:60: (iv_ruleReferenceTransition= ruleReferenceTransition EOF )
            // InternalWork.g:1013:2: iv_ruleReferenceTransition= ruleReferenceTransition EOF
            {
             newCompositeNode(grammarAccess.getReferenceTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceTransition=ruleReferenceTransition();

            state._fsp--;

             current =iv_ruleReferenceTransition; 
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
    // $ANTLR end "entryRuleReferenceTransition"


    // $ANTLR start "ruleReferenceTransition"
    // InternalWork.g:1019:1: ruleReferenceTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleReferenceTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalWork.g:1025:2: ( (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalWork.g:1026:2: (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalWork.g:1026:2: (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )
            // InternalWork.g:1027:3: otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceTransitionAccess().getTransitionKeyword_0());
            		
            // InternalWork.g:1031:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:1032:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:1032:4: (otherlv_1= RULE_ID )
            // InternalWork.g:1033:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceTransitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getReferenceTransitionAccess().getRefTransitionTransitionDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceTransitionAccess().getFromKeyword_2());
            		
            // InternalWork.g:1048:3: ( (otherlv_3= RULE_ID ) )
            // InternalWork.g:1049:4: (otherlv_3= RULE_ID )
            {
            // InternalWork.g:1049:4: (otherlv_3= RULE_ID )
            // InternalWork.g:1050:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getReferenceTransitionAccess().getForeignFieldFieldDefinitionCrossReference_3_0());
            				

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
    // $ANTLR end "ruleReferenceTransition"


    // $ANTLR start "entryRuleReferenceState"
    // InternalWork.g:1065:1: entryRuleReferenceState returns [EObject current=null] : iv_ruleReferenceState= ruleReferenceState EOF ;
    public final EObject entryRuleReferenceState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceState = null;


        try {
            // InternalWork.g:1065:55: (iv_ruleReferenceState= ruleReferenceState EOF )
            // InternalWork.g:1066:2: iv_ruleReferenceState= ruleReferenceState EOF
            {
             newCompositeNode(grammarAccess.getReferenceStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceState=ruleReferenceState();

            state._fsp--;

             current =iv_ruleReferenceState; 
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
    // $ANTLR end "entryRuleReferenceState"


    // $ANTLR start "ruleReferenceState"
    // InternalWork.g:1072:1: ruleReferenceState returns [EObject current=null] : (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleReferenceState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalWork.g:1078:2: ( (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalWork.g:1079:2: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalWork.g:1079:2: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )
            // InternalWork.g:1080:3: otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceStateAccess().getStateKeyword_0());
            		
            // InternalWork.g:1084:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:1085:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:1085:4: (otherlv_1= RULE_ID )
            // InternalWork.g:1086:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceStateRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getReferenceStateAccess().getRefStateStateDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceStateAccess().getFromKeyword_2());
            		
            // InternalWork.g:1101:3: ( (otherlv_3= RULE_ID ) )
            // InternalWork.g:1102:4: (otherlv_3= RULE_ID )
            {
            // InternalWork.g:1102:4: (otherlv_3= RULE_ID )
            // InternalWork.g:1103:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceStateRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getReferenceStateAccess().getForeignFieldFieldDefinitionCrossReference_3_0());
            				

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
    // $ANTLR end "ruleReferenceState"


    // $ANTLR start "entryRuleInstanceSpace"
    // InternalWork.g:1118:1: entryRuleInstanceSpace returns [EObject current=null] : iv_ruleInstanceSpace= ruleInstanceSpace EOF ;
    public final EObject entryRuleInstanceSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpace = null;


        try {
            // InternalWork.g:1118:54: (iv_ruleInstanceSpace= ruleInstanceSpace EOF )
            // InternalWork.g:1119:2: iv_ruleInstanceSpace= ruleInstanceSpace EOF
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
    // InternalWork.g:1125:1: ruleInstanceSpace returns [EObject current=null] : ( () otherlv_1= 'instances' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= '}' ) ;
    public final EObject ruleInstanceSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_instances_3_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1131:2: ( ( () otherlv_1= 'instances' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= '}' ) )
            // InternalWork.g:1132:2: ( () otherlv_1= 'instances' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= '}' )
            {
            // InternalWork.g:1132:2: ( () otherlv_1= 'instances' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= '}' )
            // InternalWork.g:1133:3: () otherlv_1= 'instances' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= '}'
            {
            // InternalWork.g:1133:3: ()
            // InternalWork.g:1134:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstanceSpaceAccess().getInstanceSpaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceSpaceAccess().getInstancesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getInstanceSpaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:1148:3: ( (lv_instances_3_0= ruleInstance ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalWork.g:1149:4: (lv_instances_3_0= ruleInstance )
            	    {
            	    // InternalWork.g:1149:4: (lv_instances_3_0= ruleInstance )
            	    // InternalWork.g:1150:5: lv_instances_3_0= ruleInstance
            	    {

            	    					newCompositeNode(grammarAccess.getInstanceSpaceAccess().getInstancesInstanceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop16;
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


    // $ANTLR start "entryRuleWithStatesDefinition"
    // InternalWork.g:1175:1: entryRuleWithStatesDefinition returns [EObject current=null] : iv_ruleWithStatesDefinition= ruleWithStatesDefinition EOF ;
    public final EObject entryRuleWithStatesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithStatesDefinition = null;


        try {
            // InternalWork.g:1175:61: (iv_ruleWithStatesDefinition= ruleWithStatesDefinition EOF )
            // InternalWork.g:1176:2: iv_ruleWithStatesDefinition= ruleWithStatesDefinition EOF
            {
             newCompositeNode(grammarAccess.getWithStatesDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWithStatesDefinition=ruleWithStatesDefinition();

            state._fsp--;

             current =iv_ruleWithStatesDefinition; 
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
    // $ANTLR end "entryRuleWithStatesDefinition"


    // $ANTLR start "ruleWithStatesDefinition"
    // InternalWork.g:1182:1: ruleWithStatesDefinition returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= '{' ( (lv_predicate_2_0= rulePredicate ) ) otherlv_3= '}' ) ;
    public final EObject ruleWithStatesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1188:2: ( (otherlv_0= 'with' otherlv_1= '{' ( (lv_predicate_2_0= rulePredicate ) ) otherlv_3= '}' ) )
            // InternalWork.g:1189:2: (otherlv_0= 'with' otherlv_1= '{' ( (lv_predicate_2_0= rulePredicate ) ) otherlv_3= '}' )
            {
            // InternalWork.g:1189:2: (otherlv_0= 'with' otherlv_1= '{' ( (lv_predicate_2_0= rulePredicate ) ) otherlv_3= '}' )
            // InternalWork.g:1190:3: otherlv_0= 'with' otherlv_1= '{' ( (lv_predicate_2_0= rulePredicate ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWithStatesDefinitionAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getWithStatesDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWork.g:1198:3: ( (lv_predicate_2_0= rulePredicate ) )
            // InternalWork.g:1199:4: (lv_predicate_2_0= rulePredicate )
            {
            // InternalWork.g:1199:4: (lv_predicate_2_0= rulePredicate )
            // InternalWork.g:1200:5: lv_predicate_2_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getWithStatesDefinitionAccess().getPredicatePredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_predicate_2_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithStatesDefinitionRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"org.worklang.Work.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getWithStatesDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleWithStatesDefinition"


    // $ANTLR start "entryRuleInputDefinition"
    // InternalWork.g:1225:1: entryRuleInputDefinition returns [EObject current=null] : iv_ruleInputDefinition= ruleInputDefinition EOF ;
    public final EObject entryRuleInputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDefinition = null;


        try {
            // InternalWork.g:1225:56: (iv_ruleInputDefinition= ruleInputDefinition EOF )
            // InternalWork.g:1226:2: iv_ruleInputDefinition= ruleInputDefinition EOF
            {
             newCompositeNode(grammarAccess.getInputDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputDefinition=ruleInputDefinition();

            state._fsp--;

             current =iv_ruleInputDefinition; 
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
    // $ANTLR end "entryRuleInputDefinition"


    // $ANTLR start "ruleInputDefinition"
    // InternalWork.g:1232:1: ruleInputDefinition returns [EObject current=null] : ( () otherlv_1= 'input' ( (otherlv_2= RULE_ID ) )* ) ;
    public final EObject ruleInputDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalWork.g:1238:2: ( ( () otherlv_1= 'input' ( (otherlv_2= RULE_ID ) )* ) )
            // InternalWork.g:1239:2: ( () otherlv_1= 'input' ( (otherlv_2= RULE_ID ) )* )
            {
            // InternalWork.g:1239:2: ( () otherlv_1= 'input' ( (otherlv_2= RULE_ID ) )* )
            // InternalWork.g:1240:3: () otherlv_1= 'input' ( (otherlv_2= RULE_ID ) )*
            {
            // InternalWork.g:1240:3: ()
            // InternalWork.g:1241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputDefinitionAccess().getInputDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getInputDefinitionAccess().getInputKeyword_1());
            		
            // InternalWork.g:1251:3: ( (otherlv_2= RULE_ID ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalWork.g:1252:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalWork.g:1252:4: (otherlv_2= RULE_ID )
            	    // InternalWork.g:1253:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getInputDefinitionRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    					newLeafNode(otherlv_2, grammarAccess.getInputDefinitionAccess().getInputStateStateDefinitionCrossReference_2_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
    // $ANTLR end "ruleInputDefinition"


    // $ANTLR start "entryRuleOutputDefinition"
    // InternalWork.g:1268:1: entryRuleOutputDefinition returns [EObject current=null] : iv_ruleOutputDefinition= ruleOutputDefinition EOF ;
    public final EObject entryRuleOutputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDefinition = null;


        try {
            // InternalWork.g:1268:57: (iv_ruleOutputDefinition= ruleOutputDefinition EOF )
            // InternalWork.g:1269:2: iv_ruleOutputDefinition= ruleOutputDefinition EOF
            {
             newCompositeNode(grammarAccess.getOutputDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputDefinition=ruleOutputDefinition();

            state._fsp--;

             current =iv_ruleOutputDefinition; 
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
    // $ANTLR end "entryRuleOutputDefinition"


    // $ANTLR start "ruleOutputDefinition"
    // InternalWork.g:1275:1: ruleOutputDefinition returns [EObject current=null] : (otherlv_0= 'output' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleOutputDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalWork.g:1281:2: ( (otherlv_0= 'output' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalWork.g:1282:2: (otherlv_0= 'output' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalWork.g:1282:2: (otherlv_0= 'output' ( (otherlv_1= RULE_ID ) ) )
            // InternalWork.g:1283:3: otherlv_0= 'output' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputDefinitionAccess().getOutputKeyword_0());
            		
            // InternalWork.g:1287:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:1288:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:1288:4: (otherlv_1= RULE_ID )
            // InternalWork.g:1289:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputDefinitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getOutputDefinitionAccess().getOutputStateStateDefinitionCrossReference_1_0());
            				

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
    // $ANTLR end "ruleOutputDefinition"


    // $ANTLR start "entryRuleInstance"
    // InternalWork.g:1304:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalWork.g:1304:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalWork.g:1305:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalWork.g:1311:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'instance' ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) | ( (lv_compoundTransition_6_0= ruleCompoundTransitionInstance ) ) ) ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_3_0=null;
        EObject lv_transitionDeclaration_1_0 = null;

        EObject lv_stateDeclaration_2_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_transition_5_0 = null;

        EObject lv_compoundTransition_6_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1317:2: ( (otherlv_0= 'instance' ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) | ( (lv_compoundTransition_6_0= ruleCompoundTransitionInstance ) ) ) ) )
            // InternalWork.g:1318:2: (otherlv_0= 'instance' ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) | ( (lv_compoundTransition_6_0= ruleCompoundTransitionInstance ) ) ) )
            {
            // InternalWork.g:1318:2: (otherlv_0= 'instance' ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) | ( (lv_compoundTransition_6_0= ruleCompoundTransitionInstance ) ) ) )
            // InternalWork.g:1319:3: otherlv_0= 'instance' ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) | ( (lv_compoundTransition_6_0= ruleCompoundTransitionInstance ) ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
            		
            // InternalWork.g:1323:3: ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            else if ( (LA18_0==15) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalWork.g:1324:4: ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) )
                    {
                    // InternalWork.g:1324:4: ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) )
                    // InternalWork.g:1325:5: (lv_transitionDeclaration_1_0= ruleTransitionDeclaration )
                    {
                    // InternalWork.g:1325:5: (lv_transitionDeclaration_1_0= ruleTransitionDeclaration )
                    // InternalWork.g:1326:6: lv_transitionDeclaration_1_0= ruleTransitionDeclaration
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getTransitionDeclarationTransitionDeclarationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_transitionDeclaration_1_0=ruleTransitionDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceRule());
                    						}
                    						set(
                    							current,
                    							"transitionDeclaration",
                    							lv_transitionDeclaration_1_0,
                    							"org.worklang.Work.TransitionDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWork.g:1344:4: ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) )
                    {
                    // InternalWork.g:1344:4: ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) )
                    // InternalWork.g:1345:5: (lv_stateDeclaration_2_0= ruleStateDeclaration )
                    {
                    // InternalWork.g:1345:5: (lv_stateDeclaration_2_0= ruleStateDeclaration )
                    // InternalWork.g:1346:6: lv_stateDeclaration_2_0= ruleStateDeclaration
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getStateDeclarationStateDeclarationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_stateDeclaration_2_0=ruleStateDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceRule());
                    						}
                    						set(
                    							current,
                    							"stateDeclaration",
                    							lv_stateDeclaration_2_0,
                    							"org.worklang.Work.StateDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWork.g:1364:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalWork.g:1365:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalWork.g:1365:4: (lv_name_3_0= RULE_STRING )
            // InternalWork.g:1366:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_3_0, grammarAccess.getInstanceAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalWork.g:1382:3: ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) | ( (lv_compoundTransition_6_0= ruleCompoundTransitionInstance ) ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==36) ) {
                    alt19=3;
                }
                else if ( ((LA19_1>=27 && LA19_1<=29)) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==RULE_STRING) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalWork.g:1383:4: ( (lv_state_4_0= ruleStateInstance ) )
                    {
                    // InternalWork.g:1383:4: ( (lv_state_4_0= ruleStateInstance ) )
                    // InternalWork.g:1384:5: (lv_state_4_0= ruleStateInstance )
                    {
                    // InternalWork.g:1384:5: (lv_state_4_0= ruleStateInstance )
                    // InternalWork.g:1385:6: lv_state_4_0= ruleStateInstance
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getStateStateInstanceParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_state_4_0=ruleStateInstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_4_0,
                    							"org.worklang.Work.StateInstance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWork.g:1403:4: ( (lv_transition_5_0= ruleTransitionInstance ) )
                    {
                    // InternalWork.g:1403:4: ( (lv_transition_5_0= ruleTransitionInstance ) )
                    // InternalWork.g:1404:5: (lv_transition_5_0= ruleTransitionInstance )
                    {
                    // InternalWork.g:1404:5: (lv_transition_5_0= ruleTransitionInstance )
                    // InternalWork.g:1405:6: lv_transition_5_0= ruleTransitionInstance
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getTransitionTransitionInstanceParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_transition_5_0=ruleTransitionInstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceRule());
                    						}
                    						set(
                    							current,
                    							"transition",
                    							lv_transition_5_0,
                    							"org.worklang.Work.TransitionInstance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWork.g:1423:4: ( (lv_compoundTransition_6_0= ruleCompoundTransitionInstance ) )
                    {
                    // InternalWork.g:1423:4: ( (lv_compoundTransition_6_0= ruleCompoundTransitionInstance ) )
                    // InternalWork.g:1424:5: (lv_compoundTransition_6_0= ruleCompoundTransitionInstance )
                    {
                    // InternalWork.g:1424:5: (lv_compoundTransition_6_0= ruleCompoundTransitionInstance )
                    // InternalWork.g:1425:6: lv_compoundTransition_6_0= ruleCompoundTransitionInstance
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getCompoundTransitionCompoundTransitionInstanceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_compoundTransition_6_0=ruleCompoundTransitionInstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceRule());
                    						}
                    						set(
                    							current,
                    							"compoundTransition",
                    							lv_compoundTransition_6_0,
                    							"org.worklang.Work.CompoundTransitionInstance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleTransitionDeclaration"
    // InternalWork.g:1447:1: entryRuleTransitionDeclaration returns [EObject current=null] : iv_ruleTransitionDeclaration= ruleTransitionDeclaration EOF ;
    public final EObject entryRuleTransitionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDeclaration = null;


        try {
            // InternalWork.g:1447:62: (iv_ruleTransitionDeclaration= ruleTransitionDeclaration EOF )
            // InternalWork.g:1448:2: iv_ruleTransitionDeclaration= ruleTransitionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTransitionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionDeclaration=ruleTransitionDeclaration();

            state._fsp--;

             current =iv_ruleTransitionDeclaration; 
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
    // $ANTLR end "entryRuleTransitionDeclaration"


    // $ANTLR start "ruleTransitionDeclaration"
    // InternalWork.g:1454:1: ruleTransitionDeclaration returns [EObject current=null] : (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleTransitionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalWork.g:1460:2: ( (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalWork.g:1461:2: (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalWork.g:1461:2: (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) )
            // InternalWork.g:1462:3: otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionDeclarationAccess().getTransitionKeyword_0());
            		
            // InternalWork.g:1466:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:1467:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:1467:4: (otherlv_1= RULE_ID )
            // InternalWork.g:1468:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionDeclarationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getTransitionDeclarationAccess().getTransitionTransitionDefinitionCrossReference_1_0());
            				

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
    // $ANTLR end "ruleTransitionDeclaration"


    // $ANTLR start "entryRuleStateDeclaration"
    // InternalWork.g:1483:1: entryRuleStateDeclaration returns [EObject current=null] : iv_ruleStateDeclaration= ruleStateDeclaration EOF ;
    public final EObject entryRuleStateDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDeclaration = null;


        try {
            // InternalWork.g:1483:57: (iv_ruleStateDeclaration= ruleStateDeclaration EOF )
            // InternalWork.g:1484:2: iv_ruleStateDeclaration= ruleStateDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStateDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateDeclaration=ruleStateDeclaration();

            state._fsp--;

             current =iv_ruleStateDeclaration; 
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
    // $ANTLR end "entryRuleStateDeclaration"


    // $ANTLR start "ruleStateDeclaration"
    // InternalWork.g:1490:1: ruleStateDeclaration returns [EObject current=null] : (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleStateDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalWork.g:1496:2: ( (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalWork.g:1497:2: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalWork.g:1497:2: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) )
            // InternalWork.g:1498:3: otherlv_0= 'state' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateDeclarationAccess().getStateKeyword_0());
            		
            // InternalWork.g:1502:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:1503:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:1503:4: (otherlv_1= RULE_ID )
            // InternalWork.g:1504:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateDeclarationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getStateDeclarationAccess().getStateStateDefinitionCrossReference_1_0());
            				

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
    // $ANTLR end "ruleStateDeclaration"


    // $ANTLR start "entryRuleTransitionInstance"
    // InternalWork.g:1519:1: entryRuleTransitionInstance returns [EObject current=null] : iv_ruleTransitionInstance= ruleTransitionInstance EOF ;
    public final EObject entryRuleTransitionInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionInstance = null;


        try {
            // InternalWork.g:1519:59: (iv_ruleTransitionInstance= ruleTransitionInstance EOF )
            // InternalWork.g:1520:2: iv_ruleTransitionInstance= ruleTransitionInstance EOF
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
    // InternalWork.g:1526:1: ruleTransitionInstance returns [EObject current=null] : ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleTransitionInstance() throws RecognitionException {
        EObject current = null;

        Token lv_host_0_0=null;
        Token lv_port_1_0=null;
        Token lv_path_2_0=null;


        	enterRule();

        try {
            // InternalWork.g:1532:2: ( ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? ) )
            // InternalWork.g:1533:2: ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? )
            {
            // InternalWork.g:1533:2: ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? )
            // InternalWork.g:1534:3: ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )?
            {
            // InternalWork.g:1534:3: ( (lv_host_0_0= RULE_STRING ) )
            // InternalWork.g:1535:4: (lv_host_0_0= RULE_STRING )
            {
            // InternalWork.g:1535:4: (lv_host_0_0= RULE_STRING )
            // InternalWork.g:1536:5: lv_host_0_0= RULE_STRING
            {
            lv_host_0_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            // InternalWork.g:1552:3: ( (lv_port_1_0= RULE_INT ) )
            // InternalWork.g:1553:4: (lv_port_1_0= RULE_INT )
            {
            // InternalWork.g:1553:4: (lv_port_1_0= RULE_INT )
            // InternalWork.g:1554:5: lv_port_1_0= RULE_INT
            {
            lv_port_1_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            // InternalWork.g:1570:3: ( (lv_path_2_0= RULE_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalWork.g:1571:4: (lv_path_2_0= RULE_STRING )
                    {
                    // InternalWork.g:1571:4: (lv_path_2_0= RULE_STRING )
                    // InternalWork.g:1572:5: lv_path_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleStateInstance"
    // InternalWork.g:1592:1: entryRuleStateInstance returns [EObject current=null] : iv_ruleStateInstance= ruleStateInstance EOF ;
    public final EObject entryRuleStateInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateInstance = null;


        try {
            // InternalWork.g:1592:54: (iv_ruleStateInstance= ruleStateInstance EOF )
            // InternalWork.g:1593:2: iv_ruleStateInstance= ruleStateInstance EOF
            {
             newCompositeNode(grammarAccess.getStateInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateInstance=ruleStateInstance();

            state._fsp--;

             current =iv_ruleStateInstance; 
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
    // $ANTLR end "entryRuleStateInstance"


    // $ANTLR start "ruleStateInstance"
    // InternalWork.g:1599:1: ruleStateInstance returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+ otherlv_2= '}' ) ;
    public final EObject ruleStateInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_members_1_1 = null;

        EObject lv_members_1_2 = null;

        EObject lv_members_1_3 = null;



        	enterRule();

        try {
            // InternalWork.g:1605:2: ( (otherlv_0= '{' ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+ otherlv_2= '}' ) )
            // InternalWork.g:1606:2: (otherlv_0= '{' ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+ otherlv_2= '}' )
            {
            // InternalWork.g:1606:2: (otherlv_0= '{' ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+ otherlv_2= '}' )
            // InternalWork.g:1607:3: otherlv_0= '{' ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getStateInstanceAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalWork.g:1611:3: ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=27 && LA22_0<=29)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalWork.g:1612:4: ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) )
            	    {
            	    // InternalWork.g:1612:4: ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) )
            	    // InternalWork.g:1613:5: (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance )
            	    {
            	    // InternalWork.g:1613:5: (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // InternalWork.g:1614:6: lv_members_1_1= ruleSetStatement
            	            {

            	            						newCompositeNode(grammarAccess.getStateInstanceAccess().getMembersSetStatementParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_29);
            	            lv_members_1_1=ruleSetStatement();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStateInstanceRule());
            	            						}
            	            						add(
            	            							current,
            	            							"members",
            	            							lv_members_1_1,
            	            							"org.worklang.Work.SetStatement");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalWork.g:1630:6: lv_members_1_2= ruleUseDefinition
            	            {

            	            						newCompositeNode(grammarAccess.getStateInstanceAccess().getMembersUseDefinitionParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_29);
            	            lv_members_1_2=ruleUseDefinition();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStateInstanceRule());
            	            						}
            	            						add(
            	            							current,
            	            							"members",
            	            							lv_members_1_2,
            	            							"org.worklang.Work.UseDefinition");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalWork.g:1646:6: lv_members_1_3= ruleInstance
            	            {

            	            						newCompositeNode(grammarAccess.getStateInstanceAccess().getMembersInstanceParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_29);
            	            lv_members_1_3=ruleInstance();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStateInstanceRule());
            	            						}
            	            						add(
            	            							current,
            	            							"members",
            	            							lv_members_1_3,
            	            							"org.worklang.Work.Instance");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStateInstanceAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleStateInstance"


    // $ANTLR start "entryRuleUseDefinition"
    // InternalWork.g:1672:1: entryRuleUseDefinition returns [EObject current=null] : iv_ruleUseDefinition= ruleUseDefinition EOF ;
    public final EObject entryRuleUseDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseDefinition = null;


        try {
            // InternalWork.g:1672:54: (iv_ruleUseDefinition= ruleUseDefinition EOF )
            // InternalWork.g:1673:2: iv_ruleUseDefinition= ruleUseDefinition EOF
            {
             newCompositeNode(grammarAccess.getUseDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseDefinition=ruleUseDefinition();

            state._fsp--;

             current =iv_ruleUseDefinition; 
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
    // $ANTLR end "entryRuleUseDefinition"


    // $ANTLR start "ruleUseDefinition"
    // InternalWork.g:1679:1: ruleUseDefinition returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleUseDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalWork.g:1685:2: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalWork.g:1686:2: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalWork.g:1686:2: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) )
            // InternalWork.g:1687:3: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUseDefinitionAccess().getUseKeyword_0());
            		
            // InternalWork.g:1691:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:1692:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:1692:4: (otherlv_1= RULE_ID )
            // InternalWork.g:1693:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseDefinitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getUseDefinitionAccess().getPredefinedValueInstanceCrossReference_1_0());
            				

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
    // $ANTLR end "ruleUseDefinition"


    // $ANTLR start "entryRuleSetStatement"
    // InternalWork.g:1708:1: entryRuleSetStatement returns [EObject current=null] : iv_ruleSetStatement= ruleSetStatement EOF ;
    public final EObject entryRuleSetStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetStatement = null;


        try {
            // InternalWork.g:1708:53: (iv_ruleSetStatement= ruleSetStatement EOF )
            // InternalWork.g:1709:2: iv_ruleSetStatement= ruleSetStatement EOF
            {
             newCompositeNode(grammarAccess.getSetStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetStatement=ruleSetStatement();

            state._fsp--;

             current =iv_ruleSetStatement; 
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
    // $ANTLR end "entryRuleSetStatement"


    // $ANTLR start "ruleSetStatement"
    // InternalWork.g:1715:1: ruleSetStatement returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_toDef_2_0= ruleToDefinition ) ) ) ;
    public final EObject ruleSetStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_toDef_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1721:2: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_toDef_2_0= ruleToDefinition ) ) ) )
            // InternalWork.g:1722:2: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_toDef_2_0= ruleToDefinition ) ) )
            {
            // InternalWork.g:1722:2: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_toDef_2_0= ruleToDefinition ) ) )
            // InternalWork.g:1723:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_toDef_2_0= ruleToDefinition ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSetStatementAccess().getSetKeyword_0());
            		
            // InternalWork.g:1727:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:1728:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:1728:4: (otherlv_1= RULE_ID )
            // InternalWork.g:1729:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getSetStatementAccess().getVariableStateDefinitionCrossReference_1_0());
            				

            }


            }

            // InternalWork.g:1740:3: ( (lv_toDef_2_0= ruleToDefinition ) )
            // InternalWork.g:1741:4: (lv_toDef_2_0= ruleToDefinition )
            {
            // InternalWork.g:1741:4: (lv_toDef_2_0= ruleToDefinition )
            // InternalWork.g:1742:5: lv_toDef_2_0= ruleToDefinition
            {

            					newCompositeNode(grammarAccess.getSetStatementAccess().getToDefToDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_toDef_2_0=ruleToDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetStatementRule());
            					}
            					set(
            						current,
            						"toDef",
            						lv_toDef_2_0,
            						"org.worklang.Work.ToDefinition");
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
    // $ANTLR end "ruleSetStatement"


    // $ANTLR start "entryRuleToDefinition"
    // InternalWork.g:1763:1: entryRuleToDefinition returns [EObject current=null] : iv_ruleToDefinition= ruleToDefinition EOF ;
    public final EObject entryRuleToDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToDefinition = null;


        try {
            // InternalWork.g:1763:53: (iv_ruleToDefinition= ruleToDefinition EOF )
            // InternalWork.g:1764:2: iv_ruleToDefinition= ruleToDefinition EOF
            {
             newCompositeNode(grammarAccess.getToDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToDefinition=ruleToDefinition();

            state._fsp--;

             current =iv_ruleToDefinition; 
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
    // $ANTLR end "entryRuleToDefinition"


    // $ANTLR start "ruleToDefinition"
    // InternalWork.g:1770:1: ruleToDefinition returns [EObject current=null] : (otherlv_0= 'to' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleToDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalWork.g:1776:2: ( (otherlv_0= 'to' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalWork.g:1777:2: (otherlv_0= 'to' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalWork.g:1777:2: (otherlv_0= 'to' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalWork.g:1778:3: otherlv_0= 'to' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getToDefinitionAccess().getToKeyword_0());
            		
            // InternalWork.g:1782:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalWork.g:1783:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalWork.g:1783:4: (lv_value_1_0= RULE_STRING )
            // InternalWork.g:1784:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getToDefinitionAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "ruleToDefinition"


    // $ANTLR start "entryRulePredicate"
    // InternalWork.g:1804:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalWork.g:1804:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalWork.g:1805:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalWork.g:1811:1: rulePredicate returns [EObject current=null] : ( ( (lv_negation_0_0= 'NOT' ) )? ( (lv_expression_1_0= ruleBinaryExpression ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token lv_negation_0_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1817:2: ( ( ( (lv_negation_0_0= 'NOT' ) )? ( (lv_expression_1_0= ruleBinaryExpression ) ) ) )
            // InternalWork.g:1818:2: ( ( (lv_negation_0_0= 'NOT' ) )? ( (lv_expression_1_0= ruleBinaryExpression ) ) )
            {
            // InternalWork.g:1818:2: ( ( (lv_negation_0_0= 'NOT' ) )? ( (lv_expression_1_0= ruleBinaryExpression ) ) )
            // InternalWork.g:1819:3: ( (lv_negation_0_0= 'NOT' ) )? ( (lv_expression_1_0= ruleBinaryExpression ) )
            {
            // InternalWork.g:1819:3: ( (lv_negation_0_0= 'NOT' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalWork.g:1820:4: (lv_negation_0_0= 'NOT' )
                    {
                    // InternalWork.g:1820:4: (lv_negation_0_0= 'NOT' )
                    // InternalWork.g:1821:5: lv_negation_0_0= 'NOT'
                    {
                    lv_negation_0_0=(Token)match(input,30,FOLLOW_21); 

                    					newLeafNode(lv_negation_0_0, grammarAccess.getPredicateAccess().getNegationNOTKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPredicateRule());
                    					}
                    					setWithLastConsumed(current, "negation", true, "NOT");
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:1833:3: ( (lv_expression_1_0= ruleBinaryExpression ) )
            // InternalWork.g:1834:4: (lv_expression_1_0= ruleBinaryExpression )
            {
            // InternalWork.g:1834:4: (lv_expression_1_0= ruleBinaryExpression )
            // InternalWork.g:1835:5: lv_expression_1_0= ruleBinaryExpression
            {

            					newCompositeNode(grammarAccess.getPredicateAccess().getExpressionBinaryExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleBinaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.worklang.Work.BinaryExpression");
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalWork.g:1856:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalWork.g:1856:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalWork.g:1857:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
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
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalWork.g:1863:1: ruleBinaryExpression returns [EObject current=null] : (this_TerminalBinaryExpression_0= ruleTerminalBinaryExpression ( () ( ( (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )* ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_TerminalBinaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1869:2: ( (this_TerminalBinaryExpression_0= ruleTerminalBinaryExpression ( () ( ( (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )* ) )
            // InternalWork.g:1870:2: (this_TerminalBinaryExpression_0= ruleTerminalBinaryExpression ( () ( ( (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )* )
            {
            // InternalWork.g:1870:2: (this_TerminalBinaryExpression_0= ruleTerminalBinaryExpression ( () ( ( (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )* )
            // InternalWork.g:1871:3: this_TerminalBinaryExpression_0= ruleTerminalBinaryExpression ( () ( ( (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getTerminalBinaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_TerminalBinaryExpression_0=ruleTerminalBinaryExpression();

            state._fsp--;


            			current = this_TerminalBinaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalWork.g:1879:3: ( () ( ( (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=31 && LA25_0<=32)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalWork.g:1880:4: () ( ( (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) )
            	    {
            	    // InternalWork.g:1880:4: ()
            	    // InternalWork.g:1881:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBinaryExpressionAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalWork.g:1887:4: ( ( (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' ) ) )
            	    // InternalWork.g:1888:5: ( (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' ) )
            	    {
            	    // InternalWork.g:1888:5: ( (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' ) )
            	    // InternalWork.g:1889:6: (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' )
            	    {
            	    // InternalWork.g:1889:6: (lv_op_2_1= 'AND' | lv_op_2_2= 'OR' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==31) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==32) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalWork.g:1890:7: lv_op_2_1= 'AND'
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_21); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getBinaryExpressionAccess().getOpANDKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getBinaryExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalWork.g:1901:7: lv_op_2_2= 'OR'
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_21); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getBinaryExpressionAccess().getOpORKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getBinaryExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalWork.g:1914:4: ( (lv_right_3_0= ruleTerminalBinaryExpression ) )
            	    // InternalWork.g:1915:5: (lv_right_3_0= ruleTerminalBinaryExpression )
            	    {
            	    // InternalWork.g:1915:5: (lv_right_3_0= ruleTerminalBinaryExpression )
            	    // InternalWork.g:1916:6: lv_right_3_0= ruleTerminalBinaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightTerminalBinaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleTerminalBinaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.worklang.Work.TerminalBinaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleTerminalBinaryExpression"
    // InternalWork.g:1938:1: entryRuleTerminalBinaryExpression returns [EObject current=null] : iv_ruleTerminalBinaryExpression= ruleTerminalBinaryExpression EOF ;
    public final EObject entryRuleTerminalBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalBinaryExpression = null;


        try {
            // InternalWork.g:1938:65: (iv_ruleTerminalBinaryExpression= ruleTerminalBinaryExpression EOF )
            // InternalWork.g:1939:2: iv_ruleTerminalBinaryExpression= ruleTerminalBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalBinaryExpression=ruleTerminalBinaryExpression();

            state._fsp--;

             current =iv_ruleTerminalBinaryExpression; 
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
    // $ANTLR end "entryRuleTerminalBinaryExpression"


    // $ANTLR start "ruleTerminalBinaryExpression"
    // InternalWork.g:1945:1: ruleTerminalBinaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) | ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) ) ) ;
    public final EObject ruleTerminalBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_list_6_0=null;
        Token otherlv_7=null;
        EObject this_Predicate_1 = null;



        	enterRule();

        try {
            // InternalWork.g:1951:2: ( ( (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) | ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) ) ) )
            // InternalWork.g:1952:2: ( (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) | ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) ) )
            {
            // InternalWork.g:1952:2: ( (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) | ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                alt26=2;
                }
                break;
            case 35:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalWork.g:1953:3: (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' )
                    {
                    // InternalWork.g:1953:3: (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' )
                    // InternalWork.g:1954:4: otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getTerminalBinaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalBinaryExpressionAccess().getPredicateParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_31);
                    this_Predicate_1=rulePredicate();

                    state._fsp--;


                    				current = this_Predicate_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTerminalBinaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWork.g:1972:3: ( () ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalWork.g:1972:3: ( () ( (otherlv_4= RULE_ID ) ) )
                    // InternalWork.g:1973:4: () ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalWork.g:1973:4: ()
                    // InternalWork.g:1974:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalBinaryExpressionAccess().getStateDefinitionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalWork.g:1980:4: ( (otherlv_4= RULE_ID ) )
                    // InternalWork.g:1981:5: (otherlv_4= RULE_ID )
                    {
                    // InternalWork.g:1981:5: (otherlv_4= RULE_ID )
                    // InternalWork.g:1982:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalBinaryExpressionRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getTerminalBinaryExpressionAccess().getInstanceStateDefinitionCrossReference_1_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWork.g:1995:3: ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) )
                    {
                    // InternalWork.g:1995:3: ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) )
                    // InternalWork.g:1996:4: () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalWork.g:1996:4: ()
                    // InternalWork.g:1997:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalBinaryExpressionAccess().getStateDefinitionAction_2_0(),
                    						current);
                    				

                    }

                    // InternalWork.g:2003:4: ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) )
                    // InternalWork.g:2004:5: ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalWork.g:2004:5: ( (lv_list_6_0= 'setOf' ) )
                    // InternalWork.g:2005:6: (lv_list_6_0= 'setOf' )
                    {
                    // InternalWork.g:2005:6: (lv_list_6_0= 'setOf' )
                    // InternalWork.g:2006:7: lv_list_6_0= 'setOf'
                    {
                    lv_list_6_0=(Token)match(input,35,FOLLOW_4); 

                    							newLeafNode(lv_list_6_0, grammarAccess.getTerminalBinaryExpressionAccess().getListSetOfKeyword_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTerminalBinaryExpressionRule());
                    							}
                    							setWithLastConsumed(current, "list", true, "setOf");
                    						

                    }


                    }

                    // InternalWork.g:2018:5: ( (otherlv_7= RULE_ID ) )
                    // InternalWork.g:2019:6: (otherlv_7= RULE_ID )
                    {
                    // InternalWork.g:2019:6: (otherlv_7= RULE_ID )
                    // InternalWork.g:2020:7: otherlv_7= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTerminalBinaryExpressionRule());
                    							}
                    						
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_7, grammarAccess.getTerminalBinaryExpressionAccess().getValueStateDefinitionCrossReference_2_1_1_0());
                    						

                    }


                    }


                    }


                    }


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
    // $ANTLR end "ruleTerminalBinaryExpression"


    // $ANTLR start "entryRuleTransitionComposition"
    // InternalWork.g:2037:1: entryRuleTransitionComposition returns [EObject current=null] : iv_ruleTransitionComposition= ruleTransitionComposition EOF ;
    public final EObject entryRuleTransitionComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionComposition = null;


        try {
            // InternalWork.g:2037:62: (iv_ruleTransitionComposition= ruleTransitionComposition EOF )
            // InternalWork.g:2038:2: iv_ruleTransitionComposition= ruleTransitionComposition EOF
            {
             newCompositeNode(grammarAccess.getTransitionCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionComposition=ruleTransitionComposition();

            state._fsp--;

             current =iv_ruleTransitionComposition; 
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
    // $ANTLR end "entryRuleTransitionComposition"


    // $ANTLR start "ruleTransitionComposition"
    // InternalWork.g:2044:1: ruleTransitionComposition returns [EObject current=null] : (otherlv_0= '{' ( (lv_body_1_0= ruleTransitionCompositionBody ) ) otherlv_2= '}' ) ;
    public final EObject ruleTransitionComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2050:2: ( (otherlv_0= '{' ( (lv_body_1_0= ruleTransitionCompositionBody ) ) otherlv_2= '}' ) )
            // InternalWork.g:2051:2: (otherlv_0= '{' ( (lv_body_1_0= ruleTransitionCompositionBody ) ) otherlv_2= '}' )
            {
            // InternalWork.g:2051:2: (otherlv_0= '{' ( (lv_body_1_0= ruleTransitionCompositionBody ) ) otherlv_2= '}' )
            // InternalWork.g:2052:3: otherlv_0= '{' ( (lv_body_1_0= ruleTransitionCompositionBody ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionCompositionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalWork.g:2056:3: ( (lv_body_1_0= ruleTransitionCompositionBody ) )
            // InternalWork.g:2057:4: (lv_body_1_0= ruleTransitionCompositionBody )
            {
            // InternalWork.g:2057:4: (lv_body_1_0= ruleTransitionCompositionBody )
            // InternalWork.g:2058:5: lv_body_1_0= ruleTransitionCompositionBody
            {

            					newCompositeNode(grammarAccess.getTransitionCompositionAccess().getBodyTransitionCompositionBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_body_1_0=ruleTransitionCompositionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionCompositionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.worklang.Work.TransitionCompositionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionCompositionAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleTransitionComposition"


    // $ANTLR start "entryRuleTransitionCompositionBody"
    // InternalWork.g:2083:1: entryRuleTransitionCompositionBody returns [EObject current=null] : iv_ruleTransitionCompositionBody= ruleTransitionCompositionBody EOF ;
    public final EObject entryRuleTransitionCompositionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionCompositionBody = null;


        try {
            // InternalWork.g:2083:66: (iv_ruleTransitionCompositionBody= ruleTransitionCompositionBody EOF )
            // InternalWork.g:2084:2: iv_ruleTransitionCompositionBody= ruleTransitionCompositionBody EOF
            {
             newCompositeNode(grammarAccess.getTransitionCompositionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionCompositionBody=ruleTransitionCompositionBody();

            state._fsp--;

             current =iv_ruleTransitionCompositionBody; 
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
    // $ANTLR end "entryRuleTransitionCompositionBody"


    // $ANTLR start "ruleTransitionCompositionBody"
    // InternalWork.g:2090:1: ruleTransitionCompositionBody returns [EObject current=null] : (otherlv_0= 'START' (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '{' ( (lv_expression_6_0= ruleInstructionExpression ) ) otherlv_7= '}' ) ;
    public final EObject ruleTransitionCompositionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2096:2: ( (otherlv_0= 'START' (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '{' ( (lv_expression_6_0= ruleInstructionExpression ) ) otherlv_7= '}' ) )
            // InternalWork.g:2097:2: (otherlv_0= 'START' (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '{' ( (lv_expression_6_0= ruleInstructionExpression ) ) otherlv_7= '}' )
            {
            // InternalWork.g:2097:2: (otherlv_0= 'START' (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '{' ( (lv_expression_6_0= ruleInstructionExpression ) ) otherlv_7= '}' )
            // InternalWork.g:2098:3: otherlv_0= 'START' (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '{' ( (lv_expression_6_0= ruleInstructionExpression ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionCompositionBodyAccess().getSTARTKeyword_0());
            		
            // InternalWork.g:2102:3: (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalWork.g:2103:4: otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransitionCompositionBodyAccess().getWITHKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionCompositionBodyAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalWork.g:2111:4: ( (otherlv_3= RULE_ID ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalWork.g:2112:5: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalWork.g:2112:5: (otherlv_3= RULE_ID )
                    	    // InternalWork.g:2113:6: otherlv_3= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTransitionCompositionBodyRule());
                    	    						}
                    	    					
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getTransitionCompositionBodyAccess().getStartingInputsStateDefinitionCrossReference_1_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    otherlv_4=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionCompositionBodyAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionCompositionBodyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:2133:3: ( (lv_expression_6_0= ruleInstructionExpression ) )
            // InternalWork.g:2134:4: (lv_expression_6_0= ruleInstructionExpression )
            {
            // InternalWork.g:2134:4: (lv_expression_6_0= ruleInstructionExpression )
            // InternalWork.g:2135:5: lv_expression_6_0= ruleInstructionExpression
            {

            					newCompositeNode(grammarAccess.getTransitionCompositionBodyAccess().getExpressionInstructionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_expression_6_0=ruleInstructionExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionCompositionBodyRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"org.worklang.Work.InstructionExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionCompositionBodyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTransitionCompositionBody"


    // $ANTLR start "entryRuleInstructionExpression"
    // InternalWork.g:2160:1: entryRuleInstructionExpression returns [EObject current=null] : iv_ruleInstructionExpression= ruleInstructionExpression EOF ;
    public final EObject entryRuleInstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionExpression = null;


        try {
            // InternalWork.g:2160:62: (iv_ruleInstructionExpression= ruleInstructionExpression EOF )
            // InternalWork.g:2161:2: iv_ruleInstructionExpression= ruleInstructionExpression EOF
            {
             newCompositeNode(grammarAccess.getInstructionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructionExpression=ruleInstructionExpression();

            state._fsp--;

             current =iv_ruleInstructionExpression; 
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
    // $ANTLR end "entryRuleInstructionExpression"


    // $ANTLR start "ruleInstructionExpression"
    // InternalWork.g:2167:1: ruleInstructionExpression returns [EObject current=null] : (this_TerminalInstruction_0= ruleTerminalInstruction ( () ( (lv_computeNext_2_0= ruleTerminalInstruction ) ) )* ) ;
    public final EObject ruleInstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalInstruction_0 = null;

        EObject lv_computeNext_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2173:2: ( (this_TerminalInstruction_0= ruleTerminalInstruction ( () ( (lv_computeNext_2_0= ruleTerminalInstruction ) ) )* ) )
            // InternalWork.g:2174:2: (this_TerminalInstruction_0= ruleTerminalInstruction ( () ( (lv_computeNext_2_0= ruleTerminalInstruction ) ) )* )
            {
            // InternalWork.g:2174:2: (this_TerminalInstruction_0= ruleTerminalInstruction ( () ( (lv_computeNext_2_0= ruleTerminalInstruction ) ) )* )
            // InternalWork.g:2175:3: this_TerminalInstruction_0= ruleTerminalInstruction ( () ( (lv_computeNext_2_0= ruleTerminalInstruction ) ) )*
            {

            			newCompositeNode(grammarAccess.getInstructionExpressionAccess().getTerminalInstructionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_TerminalInstruction_0=ruleTerminalInstruction();

            state._fsp--;


            			current = this_TerminalInstruction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalWork.g:2183:3: ( () ( (lv_computeNext_2_0= ruleTerminalInstruction ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=38 && LA29_0<=39)||(LA29_0>=42 && LA29_0<=43)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalWork.g:2184:4: () ( (lv_computeNext_2_0= ruleTerminalInstruction ) )
            	    {
            	    // InternalWork.g:2184:4: ()
            	    // InternalWork.g:2185:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInstructionExpressionAccess().getExecutionResultComputeFirstAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalWork.g:2191:4: ( (lv_computeNext_2_0= ruleTerminalInstruction ) )
            	    // InternalWork.g:2192:5: (lv_computeNext_2_0= ruleTerminalInstruction )
            	    {
            	    // InternalWork.g:2192:5: (lv_computeNext_2_0= ruleTerminalInstruction )
            	    // InternalWork.g:2193:6: lv_computeNext_2_0= ruleTerminalInstruction
            	    {

            	    						newCompositeNode(grammarAccess.getInstructionExpressionAccess().getComputeNextTerminalInstructionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_computeNext_2_0=ruleTerminalInstruction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInstructionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"computeNext",
            	    							lv_computeNext_2_0,
            	    							"org.worklang.Work.TerminalInstruction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


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
    // $ANTLR end "ruleInstructionExpression"


    // $ANTLR start "entryRuleTerminalInstruction"
    // InternalWork.g:2215:1: entryRuleTerminalInstruction returns [EObject current=null] : iv_ruleTerminalInstruction= ruleTerminalInstruction EOF ;
    public final EObject entryRuleTerminalInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalInstruction = null;


        try {
            // InternalWork.g:2215:60: (iv_ruleTerminalInstruction= ruleTerminalInstruction EOF )
            // InternalWork.g:2216:2: iv_ruleTerminalInstruction= ruleTerminalInstruction EOF
            {
             newCompositeNode(grammarAccess.getTerminalInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalInstruction=ruleTerminalInstruction();

            state._fsp--;

             current =iv_ruleTerminalInstruction; 
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
    // $ANTLR end "entryRuleTerminalInstruction"


    // $ANTLR start "ruleTerminalInstruction"
    // InternalWork.g:2222:1: ruleTerminalInstruction returns [EObject current=null] : (this_IfInstruction_0= ruleIfInstruction | this_WhileInstruction_1= ruleWhileInstruction | this_SimpleInstruction_2= ruleSimpleInstruction | otherlv_3= ';' ) ;
    public final EObject ruleTerminalInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_IfInstruction_0 = null;

        EObject this_WhileInstruction_1 = null;

        EObject this_SimpleInstruction_2 = null;



        	enterRule();

        try {
            // InternalWork.g:2228:2: ( (this_IfInstruction_0= ruleIfInstruction | this_WhileInstruction_1= ruleWhileInstruction | this_SimpleInstruction_2= ruleSimpleInstruction | otherlv_3= ';' ) )
            // InternalWork.g:2229:2: (this_IfInstruction_0= ruleIfInstruction | this_WhileInstruction_1= ruleWhileInstruction | this_SimpleInstruction_2= ruleSimpleInstruction | otherlv_3= ';' )
            {
            // InternalWork.g:2229:2: (this_IfInstruction_0= ruleIfInstruction | this_WhileInstruction_1= ruleWhileInstruction | this_SimpleInstruction_2= ruleSimpleInstruction | otherlv_3= ';' )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt30=1;
                }
                break;
            case 42:
                {
                alt30=2;
                }
                break;
            case 43:
                {
                alt30=3;
                }
                break;
            case 38:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalWork.g:2230:3: this_IfInstruction_0= ruleIfInstruction
                    {

                    			newCompositeNode(grammarAccess.getTerminalInstructionAccess().getIfInstructionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfInstruction_0=ruleIfInstruction();

                    state._fsp--;


                    			current = this_IfInstruction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWork.g:2239:3: this_WhileInstruction_1= ruleWhileInstruction
                    {

                    			newCompositeNode(grammarAccess.getTerminalInstructionAccess().getWhileInstructionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileInstruction_1=ruleWhileInstruction();

                    state._fsp--;


                    			current = this_WhileInstruction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWork.g:2248:3: this_SimpleInstruction_2= ruleSimpleInstruction
                    {

                    			newCompositeNode(grammarAccess.getTerminalInstructionAccess().getSimpleInstructionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleInstruction_2=ruleSimpleInstruction();

                    state._fsp--;


                    			current = this_SimpleInstruction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalWork.g:2257:3: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getTerminalInstructionAccess().getSemicolonKeyword_3());
                    		

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
    // $ANTLR end "ruleTerminalInstruction"


    // $ANTLR start "entryRuleIfInstruction"
    // InternalWork.g:2265:1: entryRuleIfInstruction returns [EObject current=null] : iv_ruleIfInstruction= ruleIfInstruction EOF ;
    public final EObject entryRuleIfInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfInstruction = null;


        try {
            // InternalWork.g:2265:54: (iv_ruleIfInstruction= ruleIfInstruction EOF )
            // InternalWork.g:2266:2: iv_ruleIfInstruction= ruleIfInstruction EOF
            {
             newCompositeNode(grammarAccess.getIfInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfInstruction=ruleIfInstruction();

            state._fsp--;

             current =iv_ruleIfInstruction; 
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
    // $ANTLR end "entryRuleIfInstruction"


    // $ANTLR start "ruleIfInstruction"
    // InternalWork.g:2272:1: ruleIfInstruction returns [EObject current=null] : (otherlv_0= 'IF' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toComputeIfTrue_7_0= ruleInstructionExpression ) ) otherlv_8= '}' (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstructionExpression ) ) otherlv_12= '}' )? ) ;
    public final EObject ruleIfInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_testKey_2_0 = null;

        EObject lv_testValue_4_0 = null;

        EObject lv_toComputeIfTrue_7_0 = null;

        EObject lv_toComputeIfFalse_11_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2278:2: ( (otherlv_0= 'IF' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toComputeIfTrue_7_0= ruleInstructionExpression ) ) otherlv_8= '}' (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstructionExpression ) ) otherlv_12= '}' )? ) )
            // InternalWork.g:2279:2: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toComputeIfTrue_7_0= ruleInstructionExpression ) ) otherlv_8= '}' (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstructionExpression ) ) otherlv_12= '}' )? )
            {
            // InternalWork.g:2279:2: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toComputeIfTrue_7_0= ruleInstructionExpression ) ) otherlv_8= '}' (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstructionExpression ) ) otherlv_12= '}' )? )
            // InternalWork.g:2280:3: otherlv_0= 'IF' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toComputeIfTrue_7_0= ruleInstructionExpression ) ) otherlv_8= '}' (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstructionExpression ) ) otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getIfInstructionAccess().getIFKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getIfInstructionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalWork.g:2288:3: ( (lv_testKey_2_0= ruleResolvableValue ) )
            // InternalWork.g:2289:4: (lv_testKey_2_0= ruleResolvableValue )
            {
            // InternalWork.g:2289:4: (lv_testKey_2_0= ruleResolvableValue )
            // InternalWork.g:2290:5: lv_testKey_2_0= ruleResolvableValue
            {

            					newCompositeNode(grammarAccess.getIfInstructionAccess().getTestKeyResolvableValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_testKey_2_0=ruleResolvableValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfInstructionRule());
            					}
            					set(
            						current,
            						"testKey",
            						lv_testKey_2_0,
            						"org.worklang.Work.ResolvableValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getIfInstructionAccess().getEqualsSignKeyword_3());
            		
            // InternalWork.g:2311:3: ( (lv_testValue_4_0= ruleTestValue ) )
            // InternalWork.g:2312:4: (lv_testValue_4_0= ruleTestValue )
            {
            // InternalWork.g:2312:4: (lv_testValue_4_0= ruleTestValue )
            // InternalWork.g:2313:5: lv_testValue_4_0= ruleTestValue
            {

            					newCompositeNode(grammarAccess.getIfInstructionAccess().getTestValueTestValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_testValue_4_0=ruleTestValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfInstructionRule());
            					}
            					set(
            						current,
            						"testValue",
            						lv_testValue_4_0,
            						"org.worklang.Work.TestValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getIfInstructionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getIfInstructionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalWork.g:2338:3: ( (lv_toComputeIfTrue_7_0= ruleInstructionExpression ) )
            // InternalWork.g:2339:4: (lv_toComputeIfTrue_7_0= ruleInstructionExpression )
            {
            // InternalWork.g:2339:4: (lv_toComputeIfTrue_7_0= ruleInstructionExpression )
            // InternalWork.g:2340:5: lv_toComputeIfTrue_7_0= ruleInstructionExpression
            {

            					newCompositeNode(grammarAccess.getIfInstructionAccess().getToComputeIfTrueInstructionExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_toComputeIfTrue_7_0=ruleInstructionExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfInstructionRule());
            					}
            					set(
            						current,
            						"toComputeIfTrue",
            						lv_toComputeIfTrue_7_0,
            						"org.worklang.Work.InstructionExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_41); 

            			newLeafNode(otherlv_8, grammarAccess.getIfInstructionAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalWork.g:2361:3: (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstructionExpression ) ) otherlv_12= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalWork.g:2362:4: otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstructionExpression ) ) otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfInstructionAccess().getELSEKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfInstructionAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalWork.g:2370:4: ( (lv_toComputeIfFalse_11_0= ruleInstructionExpression ) )
                    // InternalWork.g:2371:5: (lv_toComputeIfFalse_11_0= ruleInstructionExpression )
                    {
                    // InternalWork.g:2371:5: (lv_toComputeIfFalse_11_0= ruleInstructionExpression )
                    // InternalWork.g:2372:6: lv_toComputeIfFalse_11_0= ruleInstructionExpression
                    {

                    						newCompositeNode(grammarAccess.getIfInstructionAccess().getToComputeIfFalseInstructionExpressionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_toComputeIfFalse_11_0=ruleInstructionExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfInstructionRule());
                    						}
                    						set(
                    							current,
                    							"toComputeIfFalse",
                    							lv_toComputeIfFalse_11_0,
                    							"org.worklang.Work.InstructionExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getIfInstructionAccess().getRightCurlyBracketKeyword_9_3());
                    			

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
    // $ANTLR end "ruleIfInstruction"


    // $ANTLR start "entryRuleWhileInstruction"
    // InternalWork.g:2398:1: entryRuleWhileInstruction returns [EObject current=null] : iv_ruleWhileInstruction= ruleWhileInstruction EOF ;
    public final EObject entryRuleWhileInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileInstruction = null;


        try {
            // InternalWork.g:2398:57: (iv_ruleWhileInstruction= ruleWhileInstruction EOF )
            // InternalWork.g:2399:2: iv_ruleWhileInstruction= ruleWhileInstruction EOF
            {
             newCompositeNode(grammarAccess.getWhileInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileInstruction=ruleWhileInstruction();

            state._fsp--;

             current =iv_ruleWhileInstruction; 
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
    // $ANTLR end "entryRuleWhileInstruction"


    // $ANTLR start "ruleWhileInstruction"
    // InternalWork.g:2405:1: ruleWhileInstruction returns [EObject current=null] : (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toCompute_7_0= ruleInstructionExpression ) ) otherlv_8= '}' ) ;
    public final EObject ruleWhileInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_testKey_2_0 = null;

        EObject lv_testValue_4_0 = null;

        EObject lv_toCompute_7_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2411:2: ( (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toCompute_7_0= ruleInstructionExpression ) ) otherlv_8= '}' ) )
            // InternalWork.g:2412:2: (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toCompute_7_0= ruleInstructionExpression ) ) otherlv_8= '}' )
            {
            // InternalWork.g:2412:2: (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toCompute_7_0= ruleInstructionExpression ) ) otherlv_8= '}' )
            // InternalWork.g:2413:3: otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toCompute_7_0= ruleInstructionExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileInstructionAccess().getWHILEKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileInstructionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalWork.g:2421:3: ( (lv_testKey_2_0= ruleResolvableValue ) )
            // InternalWork.g:2422:4: (lv_testKey_2_0= ruleResolvableValue )
            {
            // InternalWork.g:2422:4: (lv_testKey_2_0= ruleResolvableValue )
            // InternalWork.g:2423:5: lv_testKey_2_0= ruleResolvableValue
            {

            					newCompositeNode(grammarAccess.getWhileInstructionAccess().getTestKeyResolvableValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_testKey_2_0=ruleResolvableValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileInstructionRule());
            					}
            					set(
            						current,
            						"testKey",
            						lv_testKey_2_0,
            						"org.worklang.Work.ResolvableValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileInstructionAccess().getEqualsSignKeyword_3());
            		
            // InternalWork.g:2444:3: ( (lv_testValue_4_0= ruleTestValue ) )
            // InternalWork.g:2445:4: (lv_testValue_4_0= ruleTestValue )
            {
            // InternalWork.g:2445:4: (lv_testValue_4_0= ruleTestValue )
            // InternalWork.g:2446:5: lv_testValue_4_0= ruleTestValue
            {

            					newCompositeNode(grammarAccess.getWhileInstructionAccess().getTestValueTestValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_testValue_4_0=ruleTestValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileInstructionRule());
            					}
            					set(
            						current,
            						"testValue",
            						lv_testValue_4_0,
            						"org.worklang.Work.TestValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getWhileInstructionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getWhileInstructionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalWork.g:2471:3: ( (lv_toCompute_7_0= ruleInstructionExpression ) )
            // InternalWork.g:2472:4: (lv_toCompute_7_0= ruleInstructionExpression )
            {
            // InternalWork.g:2472:4: (lv_toCompute_7_0= ruleInstructionExpression )
            // InternalWork.g:2473:5: lv_toCompute_7_0= ruleInstructionExpression
            {

            					newCompositeNode(grammarAccess.getWhileInstructionAccess().getToComputeInstructionExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_toCompute_7_0=ruleInstructionExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileInstructionRule());
            					}
            					set(
            						current,
            						"toCompute",
            						lv_toCompute_7_0,
            						"org.worklang.Work.InstructionExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWhileInstructionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleWhileInstruction"


    // $ANTLR start "entryRuleSimpleInstruction"
    // InternalWork.g:2498:1: entryRuleSimpleInstruction returns [EObject current=null] : iv_ruleSimpleInstruction= ruleSimpleInstruction EOF ;
    public final EObject entryRuleSimpleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleInstruction = null;


        try {
            // InternalWork.g:2498:58: (iv_ruleSimpleInstruction= ruleSimpleInstruction EOF )
            // InternalWork.g:2499:2: iv_ruleSimpleInstruction= ruleSimpleInstruction EOF
            {
             newCompositeNode(grammarAccess.getSimpleInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleInstruction=ruleSimpleInstruction();

            state._fsp--;

             current =iv_ruleSimpleInstruction; 
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
    // $ANTLR end "entryRuleSimpleInstruction"


    // $ANTLR start "ruleSimpleInstruction"
    // InternalWork.g:2505:1: ruleSimpleInstruction returns [EObject current=null] : (otherlv_0= 'THEN' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSimpleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalWork.g:2511:2: ( (otherlv_0= 'THEN' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalWork.g:2512:2: (otherlv_0= 'THEN' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalWork.g:2512:2: (otherlv_0= 'THEN' ( (otherlv_1= RULE_ID ) ) )
            // InternalWork.g:2513:3: otherlv_0= 'THEN' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleInstructionAccess().getTHENKeyword_0());
            		
            // InternalWork.g:2517:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:2518:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:2518:4: (otherlv_1= RULE_ID )
            // InternalWork.g:2519:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleInstructionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSimpleInstructionAccess().getToExecuteTransitionDefinitionCrossReference_1_0());
            				

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
    // $ANTLR end "ruleSimpleInstruction"


    // $ANTLR start "entryRuleCompoundTransitionInstance"
    // InternalWork.g:2534:1: entryRuleCompoundTransitionInstance returns [EObject current=null] : iv_ruleCompoundTransitionInstance= ruleCompoundTransitionInstance EOF ;
    public final EObject entryRuleCompoundTransitionInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundTransitionInstance = null;


        try {
            // InternalWork.g:2534:67: (iv_ruleCompoundTransitionInstance= ruleCompoundTransitionInstance EOF )
            // InternalWork.g:2535:2: iv_ruleCompoundTransitionInstance= ruleCompoundTransitionInstance EOF
            {
             newCompositeNode(grammarAccess.getCompoundTransitionInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundTransitionInstance=ruleCompoundTransitionInstance();

            state._fsp--;

             current =iv_ruleCompoundTransitionInstance; 
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
    // $ANTLR end "entryRuleCompoundTransitionInstance"


    // $ANTLR start "ruleCompoundTransitionInstance"
    // InternalWork.g:2541:1: ruleCompoundTransitionInstance returns [EObject current=null] : (otherlv_0= '{' ( (lv_body_1_0= ruleCompoundTransitionInstanceBody ) ) otherlv_2= '}' ) ;
    public final EObject ruleCompoundTransitionInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2547:2: ( (otherlv_0= '{' ( (lv_body_1_0= ruleCompoundTransitionInstanceBody ) ) otherlv_2= '}' ) )
            // InternalWork.g:2548:2: (otherlv_0= '{' ( (lv_body_1_0= ruleCompoundTransitionInstanceBody ) ) otherlv_2= '}' )
            {
            // InternalWork.g:2548:2: (otherlv_0= '{' ( (lv_body_1_0= ruleCompoundTransitionInstanceBody ) ) otherlv_2= '}' )
            // InternalWork.g:2549:3: otherlv_0= '{' ( (lv_body_1_0= ruleCompoundTransitionInstanceBody ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundTransitionInstanceAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalWork.g:2553:3: ( (lv_body_1_0= ruleCompoundTransitionInstanceBody ) )
            // InternalWork.g:2554:4: (lv_body_1_0= ruleCompoundTransitionInstanceBody )
            {
            // InternalWork.g:2554:4: (lv_body_1_0= ruleCompoundTransitionInstanceBody )
            // InternalWork.g:2555:5: lv_body_1_0= ruleCompoundTransitionInstanceBody
            {

            					newCompositeNode(grammarAccess.getCompoundTransitionInstanceAccess().getBodyCompoundTransitionInstanceBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_body_1_0=ruleCompoundTransitionInstanceBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundTransitionInstanceRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.worklang.Work.CompoundTransitionInstanceBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCompoundTransitionInstanceAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleCompoundTransitionInstance"


    // $ANTLR start "entryRuleCompoundTransitionInstanceBody"
    // InternalWork.g:2580:1: entryRuleCompoundTransitionInstanceBody returns [EObject current=null] : iv_ruleCompoundTransitionInstanceBody= ruleCompoundTransitionInstanceBody EOF ;
    public final EObject entryRuleCompoundTransitionInstanceBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundTransitionInstanceBody = null;


        try {
            // InternalWork.g:2580:71: (iv_ruleCompoundTransitionInstanceBody= ruleCompoundTransitionInstanceBody EOF )
            // InternalWork.g:2581:2: iv_ruleCompoundTransitionInstanceBody= ruleCompoundTransitionInstanceBody EOF
            {
             newCompositeNode(grammarAccess.getCompoundTransitionInstanceBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundTransitionInstanceBody=ruleCompoundTransitionInstanceBody();

            state._fsp--;

             current =iv_ruleCompoundTransitionInstanceBody; 
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
    // $ANTLR end "entryRuleCompoundTransitionInstanceBody"


    // $ANTLR start "ruleCompoundTransitionInstanceBody"
    // InternalWork.g:2587:1: ruleCompoundTransitionInstanceBody returns [EObject current=null] : (otherlv_0= 'START' (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '{' ( (lv_expression_6_0= ruleInstanceInstructionExpression ) ) otherlv_7= '}' ) ;
    public final EObject ruleCompoundTransitionInstanceBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2593:2: ( (otherlv_0= 'START' (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '{' ( (lv_expression_6_0= ruleInstanceInstructionExpression ) ) otherlv_7= '}' ) )
            // InternalWork.g:2594:2: (otherlv_0= 'START' (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '{' ( (lv_expression_6_0= ruleInstanceInstructionExpression ) ) otherlv_7= '}' )
            {
            // InternalWork.g:2594:2: (otherlv_0= 'START' (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '{' ( (lv_expression_6_0= ruleInstanceInstructionExpression ) ) otherlv_7= '}' )
            // InternalWork.g:2595:3: otherlv_0= 'START' (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '{' ( (lv_expression_6_0= ruleInstanceInstructionExpression ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundTransitionInstanceBodyAccess().getSTARTKeyword_0());
            		
            // InternalWork.g:2599:3: (otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalWork.g:2600:4: otherlv_1= 'WITH' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getCompoundTransitionInstanceBodyAccess().getWITHKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompoundTransitionInstanceBodyAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalWork.g:2608:4: ( (otherlv_3= RULE_ID ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ID) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalWork.g:2609:5: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalWork.g:2609:5: (otherlv_3= RULE_ID )
                    	    // InternalWork.g:2610:6: otherlv_3= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getCompoundTransitionInstanceBodyRule());
                    	    						}
                    	    					
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getCompoundTransitionInstanceBodyAccess().getStartingInputsInstanceCrossReference_1_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    otherlv_4=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompoundTransitionInstanceBodyAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getCompoundTransitionInstanceBodyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:2630:3: ( (lv_expression_6_0= ruleInstanceInstructionExpression ) )
            // InternalWork.g:2631:4: (lv_expression_6_0= ruleInstanceInstructionExpression )
            {
            // InternalWork.g:2631:4: (lv_expression_6_0= ruleInstanceInstructionExpression )
            // InternalWork.g:2632:5: lv_expression_6_0= ruleInstanceInstructionExpression
            {

            					newCompositeNode(grammarAccess.getCompoundTransitionInstanceBodyAccess().getExpressionInstanceInstructionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_expression_6_0=ruleInstanceInstructionExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundTransitionInstanceBodyRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"org.worklang.Work.InstanceInstructionExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCompoundTransitionInstanceBodyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCompoundTransitionInstanceBody"


    // $ANTLR start "entryRuleInstanceInstructionExpression"
    // InternalWork.g:2657:1: entryRuleInstanceInstructionExpression returns [EObject current=null] : iv_ruleInstanceInstructionExpression= ruleInstanceInstructionExpression EOF ;
    public final EObject entryRuleInstanceInstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceInstructionExpression = null;


        try {
            // InternalWork.g:2657:70: (iv_ruleInstanceInstructionExpression= ruleInstanceInstructionExpression EOF )
            // InternalWork.g:2658:2: iv_ruleInstanceInstructionExpression= ruleInstanceInstructionExpression EOF
            {
             newCompositeNode(grammarAccess.getInstanceInstructionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceInstructionExpression=ruleInstanceInstructionExpression();

            state._fsp--;

             current =iv_ruleInstanceInstructionExpression; 
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
    // $ANTLR end "entryRuleInstanceInstructionExpression"


    // $ANTLR start "ruleInstanceInstructionExpression"
    // InternalWork.g:2664:1: ruleInstanceInstructionExpression returns [EObject current=null] : (this_TerminalInstanceInstruction_0= ruleTerminalInstanceInstruction ( () ( (lv_computeNext_2_0= ruleTerminalInstanceInstruction ) ) )* ) ;
    public final EObject ruleInstanceInstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalInstanceInstruction_0 = null;

        EObject lv_computeNext_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2670:2: ( (this_TerminalInstanceInstruction_0= ruleTerminalInstanceInstruction ( () ( (lv_computeNext_2_0= ruleTerminalInstanceInstruction ) ) )* ) )
            // InternalWork.g:2671:2: (this_TerminalInstanceInstruction_0= ruleTerminalInstanceInstruction ( () ( (lv_computeNext_2_0= ruleTerminalInstanceInstruction ) ) )* )
            {
            // InternalWork.g:2671:2: (this_TerminalInstanceInstruction_0= ruleTerminalInstanceInstruction ( () ( (lv_computeNext_2_0= ruleTerminalInstanceInstruction ) ) )* )
            // InternalWork.g:2672:3: this_TerminalInstanceInstruction_0= ruleTerminalInstanceInstruction ( () ( (lv_computeNext_2_0= ruleTerminalInstanceInstruction ) ) )*
            {

            			newCompositeNode(grammarAccess.getInstanceInstructionExpressionAccess().getTerminalInstanceInstructionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_TerminalInstanceInstruction_0=ruleTerminalInstanceInstruction();

            state._fsp--;


            			current = this_TerminalInstanceInstruction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalWork.g:2680:3: ( () ( (lv_computeNext_2_0= ruleTerminalInstanceInstruction ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=38 && LA34_0<=39)||(LA34_0>=42 && LA34_0<=43)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalWork.g:2681:4: () ( (lv_computeNext_2_0= ruleTerminalInstanceInstruction ) )
            	    {
            	    // InternalWork.g:2681:4: ()
            	    // InternalWork.g:2682:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInstanceInstructionExpressionAccess().getExecutionResultComputeFirstAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalWork.g:2688:4: ( (lv_computeNext_2_0= ruleTerminalInstanceInstruction ) )
            	    // InternalWork.g:2689:5: (lv_computeNext_2_0= ruleTerminalInstanceInstruction )
            	    {
            	    // InternalWork.g:2689:5: (lv_computeNext_2_0= ruleTerminalInstanceInstruction )
            	    // InternalWork.g:2690:6: lv_computeNext_2_0= ruleTerminalInstanceInstruction
            	    {

            	    						newCompositeNode(grammarAccess.getInstanceInstructionExpressionAccess().getComputeNextTerminalInstanceInstructionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_computeNext_2_0=ruleTerminalInstanceInstruction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInstanceInstructionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"computeNext",
            	    							lv_computeNext_2_0,
            	    							"org.worklang.Work.TerminalInstanceInstruction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


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
    // $ANTLR end "ruleInstanceInstructionExpression"


    // $ANTLR start "entryRuleTerminalInstanceInstruction"
    // InternalWork.g:2712:1: entryRuleTerminalInstanceInstruction returns [EObject current=null] : iv_ruleTerminalInstanceInstruction= ruleTerminalInstanceInstruction EOF ;
    public final EObject entryRuleTerminalInstanceInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalInstanceInstruction = null;


        try {
            // InternalWork.g:2712:68: (iv_ruleTerminalInstanceInstruction= ruleTerminalInstanceInstruction EOF )
            // InternalWork.g:2713:2: iv_ruleTerminalInstanceInstruction= ruleTerminalInstanceInstruction EOF
            {
             newCompositeNode(grammarAccess.getTerminalInstanceInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalInstanceInstruction=ruleTerminalInstanceInstruction();

            state._fsp--;

             current =iv_ruleTerminalInstanceInstruction; 
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
    // $ANTLR end "entryRuleTerminalInstanceInstruction"


    // $ANTLR start "ruleTerminalInstanceInstruction"
    // InternalWork.g:2719:1: ruleTerminalInstanceInstruction returns [EObject current=null] : (this_IfInstanceInstruction_0= ruleIfInstanceInstruction | this_WhileInstanceInstruction_1= ruleWhileInstanceInstruction | this_SimpleInstanceInstruction_2= ruleSimpleInstanceInstruction | otherlv_3= ';' ) ;
    public final EObject ruleTerminalInstanceInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_IfInstanceInstruction_0 = null;

        EObject this_WhileInstanceInstruction_1 = null;

        EObject this_SimpleInstanceInstruction_2 = null;



        	enterRule();

        try {
            // InternalWork.g:2725:2: ( (this_IfInstanceInstruction_0= ruleIfInstanceInstruction | this_WhileInstanceInstruction_1= ruleWhileInstanceInstruction | this_SimpleInstanceInstruction_2= ruleSimpleInstanceInstruction | otherlv_3= ';' ) )
            // InternalWork.g:2726:2: (this_IfInstanceInstruction_0= ruleIfInstanceInstruction | this_WhileInstanceInstruction_1= ruleWhileInstanceInstruction | this_SimpleInstanceInstruction_2= ruleSimpleInstanceInstruction | otherlv_3= ';' )
            {
            // InternalWork.g:2726:2: (this_IfInstanceInstruction_0= ruleIfInstanceInstruction | this_WhileInstanceInstruction_1= ruleWhileInstanceInstruction | this_SimpleInstanceInstruction_2= ruleSimpleInstanceInstruction | otherlv_3= ';' )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt35=1;
                }
                break;
            case 42:
                {
                alt35=2;
                }
                break;
            case 43:
                {
                alt35=3;
                }
                break;
            case 38:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalWork.g:2727:3: this_IfInstanceInstruction_0= ruleIfInstanceInstruction
                    {

                    			newCompositeNode(grammarAccess.getTerminalInstanceInstructionAccess().getIfInstanceInstructionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfInstanceInstruction_0=ruleIfInstanceInstruction();

                    state._fsp--;


                    			current = this_IfInstanceInstruction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWork.g:2736:3: this_WhileInstanceInstruction_1= ruleWhileInstanceInstruction
                    {

                    			newCompositeNode(grammarAccess.getTerminalInstanceInstructionAccess().getWhileInstanceInstructionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileInstanceInstruction_1=ruleWhileInstanceInstruction();

                    state._fsp--;


                    			current = this_WhileInstanceInstruction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWork.g:2745:3: this_SimpleInstanceInstruction_2= ruleSimpleInstanceInstruction
                    {

                    			newCompositeNode(grammarAccess.getTerminalInstanceInstructionAccess().getSimpleInstanceInstructionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleInstanceInstruction_2=ruleSimpleInstanceInstruction();

                    state._fsp--;


                    			current = this_SimpleInstanceInstruction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalWork.g:2754:3: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getTerminalInstanceInstructionAccess().getSemicolonKeyword_3());
                    		

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
    // $ANTLR end "ruleTerminalInstanceInstruction"


    // $ANTLR start "entryRuleSimpleInstanceInstruction"
    // InternalWork.g:2762:1: entryRuleSimpleInstanceInstruction returns [EObject current=null] : iv_ruleSimpleInstanceInstruction= ruleSimpleInstanceInstruction EOF ;
    public final EObject entryRuleSimpleInstanceInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleInstanceInstruction = null;


        try {
            // InternalWork.g:2762:66: (iv_ruleSimpleInstanceInstruction= ruleSimpleInstanceInstruction EOF )
            // InternalWork.g:2763:2: iv_ruleSimpleInstanceInstruction= ruleSimpleInstanceInstruction EOF
            {
             newCompositeNode(grammarAccess.getSimpleInstanceInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleInstanceInstruction=ruleSimpleInstanceInstruction();

            state._fsp--;

             current =iv_ruleSimpleInstanceInstruction; 
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
    // $ANTLR end "entryRuleSimpleInstanceInstruction"


    // $ANTLR start "ruleSimpleInstanceInstruction"
    // InternalWork.g:2769:1: ruleSimpleInstanceInstruction returns [EObject current=null] : (otherlv_0= 'THEN' ( (otherlv_1= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleInstanceInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalWork.g:2775:2: ( (otherlv_0= 'THEN' ( (otherlv_1= RULE_STRING ) ) ) )
            // InternalWork.g:2776:2: (otherlv_0= 'THEN' ( (otherlv_1= RULE_STRING ) ) )
            {
            // InternalWork.g:2776:2: (otherlv_0= 'THEN' ( (otherlv_1= RULE_STRING ) ) )
            // InternalWork.g:2777:3: otherlv_0= 'THEN' ( (otherlv_1= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleInstanceInstructionAccess().getTHENKeyword_0());
            		
            // InternalWork.g:2781:3: ( (otherlv_1= RULE_STRING ) )
            // InternalWork.g:2782:4: (otherlv_1= RULE_STRING )
            {
            // InternalWork.g:2782:4: (otherlv_1= RULE_STRING )
            // InternalWork.g:2783:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleInstanceInstructionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSimpleInstanceInstructionAccess().getToExecuteInstanceCrossReference_1_0());
            				

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
    // $ANTLR end "ruleSimpleInstanceInstruction"


    // $ANTLR start "entryRuleIfInstanceInstruction"
    // InternalWork.g:2798:1: entryRuleIfInstanceInstruction returns [EObject current=null] : iv_ruleIfInstanceInstruction= ruleIfInstanceInstruction EOF ;
    public final EObject entryRuleIfInstanceInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfInstanceInstruction = null;


        try {
            // InternalWork.g:2798:62: (iv_ruleIfInstanceInstruction= ruleIfInstanceInstruction EOF )
            // InternalWork.g:2799:2: iv_ruleIfInstanceInstruction= ruleIfInstanceInstruction EOF
            {
             newCompositeNode(grammarAccess.getIfInstanceInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfInstanceInstruction=ruleIfInstanceInstruction();

            state._fsp--;

             current =iv_ruleIfInstanceInstruction; 
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
    // $ANTLR end "entryRuleIfInstanceInstruction"


    // $ANTLR start "ruleIfInstanceInstruction"
    // InternalWork.g:2805:1: ruleIfInstanceInstruction returns [EObject current=null] : (otherlv_0= 'IF' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toComputeIfTrue_7_0= ruleInstanceInstructionExpression ) ) otherlv_8= '}' (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstanceInstructionExpression ) ) otherlv_12= '}' )? ) ;
    public final EObject ruleIfInstanceInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_testKey_2_0 = null;

        EObject lv_testValue_4_0 = null;

        EObject lv_toComputeIfTrue_7_0 = null;

        EObject lv_toComputeIfFalse_11_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2811:2: ( (otherlv_0= 'IF' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toComputeIfTrue_7_0= ruleInstanceInstructionExpression ) ) otherlv_8= '}' (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstanceInstructionExpression ) ) otherlv_12= '}' )? ) )
            // InternalWork.g:2812:2: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toComputeIfTrue_7_0= ruleInstanceInstructionExpression ) ) otherlv_8= '}' (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstanceInstructionExpression ) ) otherlv_12= '}' )? )
            {
            // InternalWork.g:2812:2: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toComputeIfTrue_7_0= ruleInstanceInstructionExpression ) ) otherlv_8= '}' (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstanceInstructionExpression ) ) otherlv_12= '}' )? )
            // InternalWork.g:2813:3: otherlv_0= 'IF' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toComputeIfTrue_7_0= ruleInstanceInstructionExpression ) ) otherlv_8= '}' (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstanceInstructionExpression ) ) otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getIfInstanceInstructionAccess().getIFKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getIfInstanceInstructionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalWork.g:2821:3: ( (lv_testKey_2_0= ruleResolvableValue ) )
            // InternalWork.g:2822:4: (lv_testKey_2_0= ruleResolvableValue )
            {
            // InternalWork.g:2822:4: (lv_testKey_2_0= ruleResolvableValue )
            // InternalWork.g:2823:5: lv_testKey_2_0= ruleResolvableValue
            {

            					newCompositeNode(grammarAccess.getIfInstanceInstructionAccess().getTestKeyResolvableValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_testKey_2_0=ruleResolvableValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfInstanceInstructionRule());
            					}
            					set(
            						current,
            						"testKey",
            						lv_testKey_2_0,
            						"org.worklang.Work.ResolvableValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getIfInstanceInstructionAccess().getEqualsSignKeyword_3());
            		
            // InternalWork.g:2844:3: ( (lv_testValue_4_0= ruleTestValue ) )
            // InternalWork.g:2845:4: (lv_testValue_4_0= ruleTestValue )
            {
            // InternalWork.g:2845:4: (lv_testValue_4_0= ruleTestValue )
            // InternalWork.g:2846:5: lv_testValue_4_0= ruleTestValue
            {

            					newCompositeNode(grammarAccess.getIfInstanceInstructionAccess().getTestValueTestValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_testValue_4_0=ruleTestValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfInstanceInstructionRule());
            					}
            					set(
            						current,
            						"testValue",
            						lv_testValue_4_0,
            						"org.worklang.Work.TestValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getIfInstanceInstructionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getIfInstanceInstructionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalWork.g:2871:3: ( (lv_toComputeIfTrue_7_0= ruleInstanceInstructionExpression ) )
            // InternalWork.g:2872:4: (lv_toComputeIfTrue_7_0= ruleInstanceInstructionExpression )
            {
            // InternalWork.g:2872:4: (lv_toComputeIfTrue_7_0= ruleInstanceInstructionExpression )
            // InternalWork.g:2873:5: lv_toComputeIfTrue_7_0= ruleInstanceInstructionExpression
            {

            					newCompositeNode(grammarAccess.getIfInstanceInstructionAccess().getToComputeIfTrueInstanceInstructionExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_toComputeIfTrue_7_0=ruleInstanceInstructionExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfInstanceInstructionRule());
            					}
            					set(
            						current,
            						"toComputeIfTrue",
            						lv_toComputeIfTrue_7_0,
            						"org.worklang.Work.InstanceInstructionExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_41); 

            			newLeafNode(otherlv_8, grammarAccess.getIfInstanceInstructionAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalWork.g:2894:3: (otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstanceInstructionExpression ) ) otherlv_12= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalWork.g:2895:4: otherlv_9= 'ELSE' otherlv_10= '{' ( (lv_toComputeIfFalse_11_0= ruleInstanceInstructionExpression ) ) otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfInstanceInstructionAccess().getELSEKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfInstanceInstructionAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalWork.g:2903:4: ( (lv_toComputeIfFalse_11_0= ruleInstanceInstructionExpression ) )
                    // InternalWork.g:2904:5: (lv_toComputeIfFalse_11_0= ruleInstanceInstructionExpression )
                    {
                    // InternalWork.g:2904:5: (lv_toComputeIfFalse_11_0= ruleInstanceInstructionExpression )
                    // InternalWork.g:2905:6: lv_toComputeIfFalse_11_0= ruleInstanceInstructionExpression
                    {

                    						newCompositeNode(grammarAccess.getIfInstanceInstructionAccess().getToComputeIfFalseInstanceInstructionExpressionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_toComputeIfFalse_11_0=ruleInstanceInstructionExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfInstanceInstructionRule());
                    						}
                    						set(
                    							current,
                    							"toComputeIfFalse",
                    							lv_toComputeIfFalse_11_0,
                    							"org.worklang.Work.InstanceInstructionExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getIfInstanceInstructionAccess().getRightCurlyBracketKeyword_9_3());
                    			

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
    // $ANTLR end "ruleIfInstanceInstruction"


    // $ANTLR start "entryRuleWhileInstanceInstruction"
    // InternalWork.g:2931:1: entryRuleWhileInstanceInstruction returns [EObject current=null] : iv_ruleWhileInstanceInstruction= ruleWhileInstanceInstruction EOF ;
    public final EObject entryRuleWhileInstanceInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileInstanceInstruction = null;


        try {
            // InternalWork.g:2931:65: (iv_ruleWhileInstanceInstruction= ruleWhileInstanceInstruction EOF )
            // InternalWork.g:2932:2: iv_ruleWhileInstanceInstruction= ruleWhileInstanceInstruction EOF
            {
             newCompositeNode(grammarAccess.getWhileInstanceInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileInstanceInstruction=ruleWhileInstanceInstruction();

            state._fsp--;

             current =iv_ruleWhileInstanceInstruction; 
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
    // $ANTLR end "entryRuleWhileInstanceInstruction"


    // $ANTLR start "ruleWhileInstanceInstruction"
    // InternalWork.g:2938:1: ruleWhileInstanceInstruction returns [EObject current=null] : (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toCompute_7_0= ruleInstanceInstructionExpression ) ) otherlv_8= '}' ) ;
    public final EObject ruleWhileInstanceInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_testKey_2_0 = null;

        EObject lv_testValue_4_0 = null;

        EObject lv_toCompute_7_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2944:2: ( (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toCompute_7_0= ruleInstanceInstructionExpression ) ) otherlv_8= '}' ) )
            // InternalWork.g:2945:2: (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toCompute_7_0= ruleInstanceInstructionExpression ) ) otherlv_8= '}' )
            {
            // InternalWork.g:2945:2: (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toCompute_7_0= ruleInstanceInstructionExpression ) ) otherlv_8= '}' )
            // InternalWork.g:2946:3: otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_testKey_2_0= ruleResolvableValue ) ) otherlv_3= '=' ( (lv_testValue_4_0= ruleTestValue ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_toCompute_7_0= ruleInstanceInstructionExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileInstanceInstructionAccess().getWHILEKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileInstanceInstructionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalWork.g:2954:3: ( (lv_testKey_2_0= ruleResolvableValue ) )
            // InternalWork.g:2955:4: (lv_testKey_2_0= ruleResolvableValue )
            {
            // InternalWork.g:2955:4: (lv_testKey_2_0= ruleResolvableValue )
            // InternalWork.g:2956:5: lv_testKey_2_0= ruleResolvableValue
            {

            					newCompositeNode(grammarAccess.getWhileInstanceInstructionAccess().getTestKeyResolvableValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_testKey_2_0=ruleResolvableValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileInstanceInstructionRule());
            					}
            					set(
            						current,
            						"testKey",
            						lv_testKey_2_0,
            						"org.worklang.Work.ResolvableValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileInstanceInstructionAccess().getEqualsSignKeyword_3());
            		
            // InternalWork.g:2977:3: ( (lv_testValue_4_0= ruleTestValue ) )
            // InternalWork.g:2978:4: (lv_testValue_4_0= ruleTestValue )
            {
            // InternalWork.g:2978:4: (lv_testValue_4_0= ruleTestValue )
            // InternalWork.g:2979:5: lv_testValue_4_0= ruleTestValue
            {

            					newCompositeNode(grammarAccess.getWhileInstanceInstructionAccess().getTestValueTestValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_testValue_4_0=ruleTestValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileInstanceInstructionRule());
            					}
            					set(
            						current,
            						"testValue",
            						lv_testValue_4_0,
            						"org.worklang.Work.TestValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getWhileInstanceInstructionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getWhileInstanceInstructionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalWork.g:3004:3: ( (lv_toCompute_7_0= ruleInstanceInstructionExpression ) )
            // InternalWork.g:3005:4: (lv_toCompute_7_0= ruleInstanceInstructionExpression )
            {
            // InternalWork.g:3005:4: (lv_toCompute_7_0= ruleInstanceInstructionExpression )
            // InternalWork.g:3006:5: lv_toCompute_7_0= ruleInstanceInstructionExpression
            {

            					newCompositeNode(grammarAccess.getWhileInstanceInstructionAccess().getToComputeInstanceInstructionExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_toCompute_7_0=ruleInstanceInstructionExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileInstanceInstructionRule());
            					}
            					set(
            						current,
            						"toCompute",
            						lv_toCompute_7_0,
            						"org.worklang.Work.InstanceInstructionExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWhileInstanceInstructionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleWhileInstanceInstruction"


    // $ANTLR start "entryRuleTestValue"
    // InternalWork.g:3031:1: entryRuleTestValue returns [EObject current=null] : iv_ruleTestValue= ruleTestValue EOF ;
    public final EObject entryRuleTestValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestValue = null;


        try {
            // InternalWork.g:3031:50: (iv_ruleTestValue= ruleTestValue EOF )
            // InternalWork.g:3032:2: iv_ruleTestValue= ruleTestValue EOF
            {
             newCompositeNode(grammarAccess.getTestValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestValue=ruleTestValue();

            state._fsp--;

             current =iv_ruleTestValue; 
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
    // $ANTLR end "entryRuleTestValue"


    // $ANTLR start "ruleTestValue"
    // InternalWork.g:3038:1: ruleTestValue returns [EObject current=null] : (this_LiteralValue_0= ruleLiteralValue | this_ResolvableValue_1= ruleResolvableValue ) ;
    public final EObject ruleTestValue() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValue_0 = null;

        EObject this_ResolvableValue_1 = null;



        	enterRule();

        try {
            // InternalWork.g:3044:2: ( (this_LiteralValue_0= ruleLiteralValue | this_ResolvableValue_1= ruleResolvableValue ) )
            // InternalWork.g:3045:2: (this_LiteralValue_0= ruleLiteralValue | this_ResolvableValue_1= ruleResolvableValue )
            {
            // InternalWork.g:3045:2: (this_LiteralValue_0= ruleLiteralValue | this_ResolvableValue_1= ruleResolvableValue )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID||LA37_0==45) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalWork.g:3046:3: this_LiteralValue_0= ruleLiteralValue
                    {

                    			newCompositeNode(grammarAccess.getTestValueAccess().getLiteralValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralValue_0=ruleLiteralValue();

                    state._fsp--;


                    			current = this_LiteralValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWork.g:3055:3: this_ResolvableValue_1= ruleResolvableValue
                    {

                    			newCompositeNode(grammarAccess.getTestValueAccess().getResolvableValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ResolvableValue_1=ruleResolvableValue();

                    state._fsp--;


                    			current = this_ResolvableValue_1;
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
    // $ANTLR end "ruleTestValue"


    // $ANTLR start "entryRuleLiteralValue"
    // InternalWork.g:3067:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalWork.g:3067:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalWork.g:3068:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
             newCompositeNode(grammarAccess.getLiteralValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;

             current =iv_ruleLiteralValue; 
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
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // InternalWork.g:3074:1: ruleLiteralValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalWork.g:3080:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalWork.g:3081:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalWork.g:3081:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalWork.g:3082:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalWork.g:3082:3: (lv_value_0_0= RULE_STRING )
            // InternalWork.g:3083:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getLiteralValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLiteralValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
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
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleResolvableValue"
    // InternalWork.g:3102:1: entryRuleResolvableValue returns [EObject current=null] : iv_ruleResolvableValue= ruleResolvableValue EOF ;
    public final EObject entryRuleResolvableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResolvableValue = null;


        try {
            // InternalWork.g:3102:56: (iv_ruleResolvableValue= ruleResolvableValue EOF )
            // InternalWork.g:3103:2: iv_ruleResolvableValue= ruleResolvableValue EOF
            {
             newCompositeNode(grammarAccess.getResolvableValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResolvableValue=ruleResolvableValue();

            state._fsp--;

             current =iv_ruleResolvableValue; 
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
    // $ANTLR end "entryRuleResolvableValue"


    // $ANTLR start "ruleResolvableValue"
    // InternalWork.g:3109:1: ruleResolvableValue returns [EObject current=null] : (this_ResolvableInstanceValue_0= ruleResolvableInstanceValue | this_ResolvableTransitionOutputValue_1= ruleResolvableTransitionOutputValue ) ;
    public final EObject ruleResolvableValue() throws RecognitionException {
        EObject current = null;

        EObject this_ResolvableInstanceValue_0 = null;

        EObject this_ResolvableTransitionOutputValue_1 = null;



        	enterRule();

        try {
            // InternalWork.g:3115:2: ( (this_ResolvableInstanceValue_0= ruleResolvableInstanceValue | this_ResolvableTransitionOutputValue_1= ruleResolvableTransitionOutputValue ) )
            // InternalWork.g:3116:2: (this_ResolvableInstanceValue_0= ruleResolvableInstanceValue | this_ResolvableTransitionOutputValue_1= ruleResolvableTransitionOutputValue )
            {
            // InternalWork.g:3116:2: (this_ResolvableInstanceValue_0= ruleResolvableInstanceValue | this_ResolvableTransitionOutputValue_1= ruleResolvableTransitionOutputValue )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==45) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalWork.g:3117:3: this_ResolvableInstanceValue_0= ruleResolvableInstanceValue
                    {

                    			newCompositeNode(grammarAccess.getResolvableValueAccess().getResolvableInstanceValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ResolvableInstanceValue_0=ruleResolvableInstanceValue();

                    state._fsp--;


                    			current = this_ResolvableInstanceValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWork.g:3126:3: this_ResolvableTransitionOutputValue_1= ruleResolvableTransitionOutputValue
                    {

                    			newCompositeNode(grammarAccess.getResolvableValueAccess().getResolvableTransitionOutputValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ResolvableTransitionOutputValue_1=ruleResolvableTransitionOutputValue();

                    state._fsp--;


                    			current = this_ResolvableTransitionOutputValue_1;
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
    // $ANTLR end "ruleResolvableValue"


    // $ANTLR start "entryRuleResolvableInstanceValue"
    // InternalWork.g:3138:1: entryRuleResolvableInstanceValue returns [EObject current=null] : iv_ruleResolvableInstanceValue= ruleResolvableInstanceValue EOF ;
    public final EObject entryRuleResolvableInstanceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResolvableInstanceValue = null;


        try {
            // InternalWork.g:3138:64: (iv_ruleResolvableInstanceValue= ruleResolvableInstanceValue EOF )
            // InternalWork.g:3139:2: iv_ruleResolvableInstanceValue= ruleResolvableInstanceValue EOF
            {
             newCompositeNode(grammarAccess.getResolvableInstanceValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResolvableInstanceValue=ruleResolvableInstanceValue();

            state._fsp--;

             current =iv_ruleResolvableInstanceValue; 
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
    // $ANTLR end "entryRuleResolvableInstanceValue"


    // $ANTLR start "ruleResolvableInstanceValue"
    // InternalWork.g:3145:1: ruleResolvableInstanceValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleResolvableInstanceValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalWork.g:3151:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalWork.g:3152:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalWork.g:3152:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalWork.g:3153:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalWork.g:3153:3: ( (otherlv_0= RULE_ID ) )
            // InternalWork.g:3154:4: (otherlv_0= RULE_ID )
            {
            // InternalWork.g:3154:4: (otherlv_0= RULE_ID )
            // InternalWork.g:3155:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResolvableInstanceValueRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(otherlv_0, grammarAccess.getResolvableInstanceValueAccess().getInstanceInstanceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getResolvableInstanceValueAccess().getFullStopKeyword_1());
            		
            // InternalWork.g:3170:3: ( (otherlv_2= RULE_ID ) )
            // InternalWork.g:3171:4: (otherlv_2= RULE_ID )
            {
            // InternalWork.g:3171:4: (otherlv_2= RULE_ID )
            // InternalWork.g:3172:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResolvableInstanceValueRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getResolvableInstanceValueAccess().getKeyStateDefinitionCrossReference_2_0());
            				

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
    // $ANTLR end "ruleResolvableInstanceValue"


    // $ANTLR start "entryRuleResolvableTransitionOutputValue"
    // InternalWork.g:3187:1: entryRuleResolvableTransitionOutputValue returns [EObject current=null] : iv_ruleResolvableTransitionOutputValue= ruleResolvableTransitionOutputValue EOF ;
    public final EObject entryRuleResolvableTransitionOutputValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResolvableTransitionOutputValue = null;


        try {
            // InternalWork.g:3187:72: (iv_ruleResolvableTransitionOutputValue= ruleResolvableTransitionOutputValue EOF )
            // InternalWork.g:3188:2: iv_ruleResolvableTransitionOutputValue= ruleResolvableTransitionOutputValue EOF
            {
             newCompositeNode(grammarAccess.getResolvableTransitionOutputValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResolvableTransitionOutputValue=ruleResolvableTransitionOutputValue();

            state._fsp--;

             current =iv_ruleResolvableTransitionOutputValue; 
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
    // $ANTLR end "entryRuleResolvableTransitionOutputValue"


    // $ANTLR start "ruleResolvableTransitionOutputValue"
    // InternalWork.g:3194:1: ruleResolvableTransitionOutputValue returns [EObject current=null] : (otherlv_0= 'OUTPUT' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleResolvableTransitionOutputValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalWork.g:3200:2: ( (otherlv_0= 'OUTPUT' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalWork.g:3201:2: (otherlv_0= 'OUTPUT' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalWork.g:3201:2: (otherlv_0= 'OUTPUT' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            // InternalWork.g:3202:3: otherlv_0= 'OUTPUT' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getResolvableTransitionOutputValueAccess().getOUTPUTKeyword_0());
            		
            // InternalWork.g:3206:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:3207:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:3207:4: (otherlv_1= RULE_ID )
            // InternalWork.g:3208:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResolvableTransitionOutputValueRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(otherlv_1, grammarAccess.getResolvableTransitionOutputValueAccess().getStateStateDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getResolvableTransitionOutputValueAccess().getFullStopKeyword_2());
            		
            // InternalWork.g:3223:3: ( (otherlv_3= RULE_ID ) )
            // InternalWork.g:3224:4: (otherlv_3= RULE_ID )
            {
            // InternalWork.g:3224:4: (otherlv_3= RULE_ID )
            // InternalWork.g:3225:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResolvableTransitionOutputValueRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getResolvableTransitionOutputValueAccess().getKeyStateDefinitionCrossReference_3_0());
            				

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
    // $ANTLR end "ruleResolvableTransitionOutputValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C86000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000C06000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000806000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000004A000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000A40000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000038002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000CC000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000CC000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});

}