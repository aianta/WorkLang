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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'instruction'", "'practitioner'", "'{'", "'}'", "'expert'", "'hourlyRate'", "'$'", "'domain'", "'knowledge'", "'skills'", "'called'", "'as'", "'primitive'", "'compound'", "'field'", "'state'", "'transition'", "'definitions'", "'references'", "'instances'", "'input'", "'output'", "'from'", "'with'", "'extends'", "'NOT'", "'AND'", "'OR'", "'set'", "'to'", "'use'", "'instance'", "'('", "')'", "'setOf'", "'THEN'"
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
    public static final int T__46=46;
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
    // InternalWork.g:84:1: ruleModel returns [EObject current=null] : ( ( (lv_fields_0_0= ruleFieldDefinition ) )* ( (lv_experts_1_0= ruleExpertDefinition ) )* ( (lv_practitioners_2_0= rulePractitioner ) )* ( (lv_instructions_3_0= ruleInstruction ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_fields_0_0 = null;

        EObject lv_experts_1_0 = null;

        EObject lv_practitioners_2_0 = null;

        EObject lv_instructions_3_0 = null;



        	enterRule();

        try {
            // InternalWork.g:90:2: ( ( ( (lv_fields_0_0= ruleFieldDefinition ) )* ( (lv_experts_1_0= ruleExpertDefinition ) )* ( (lv_practitioners_2_0= rulePractitioner ) )* ( (lv_instructions_3_0= ruleInstruction ) )* ) )
            // InternalWork.g:91:2: ( ( (lv_fields_0_0= ruleFieldDefinition ) )* ( (lv_experts_1_0= ruleExpertDefinition ) )* ( (lv_practitioners_2_0= rulePractitioner ) )* ( (lv_instructions_3_0= ruleInstruction ) )* )
            {
            // InternalWork.g:91:2: ( ( (lv_fields_0_0= ruleFieldDefinition ) )* ( (lv_experts_1_0= ruleExpertDefinition ) )* ( (lv_practitioners_2_0= rulePractitioner ) )* ( (lv_instructions_3_0= ruleInstruction ) )* )
            // InternalWork.g:92:3: ( (lv_fields_0_0= ruleFieldDefinition ) )* ( (lv_experts_1_0= ruleExpertDefinition ) )* ( (lv_practitioners_2_0= rulePractitioner ) )* ( (lv_instructions_3_0= ruleInstruction ) )*
            {
            // InternalWork.g:92:3: ( (lv_fields_0_0= ruleFieldDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWork.g:93:4: (lv_fields_0_0= ruleFieldDefinition )
            	    {
            	    // InternalWork.g:93:4: (lv_fields_0_0= ruleFieldDefinition )
            	    // InternalWork.g:94:5: lv_fields_0_0= ruleFieldDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFieldsFieldDefinitionParserRuleCall_0_0());
            	    				
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

            // InternalWork.g:111:3: ( (lv_experts_1_0= ruleExpertDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWork.g:112:4: (lv_experts_1_0= ruleExpertDefinition )
            	    {
            	    // InternalWork.g:112:4: (lv_experts_1_0= ruleExpertDefinition )
            	    // InternalWork.g:113:5: lv_experts_1_0= ruleExpertDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getExpertsExpertDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_experts_1_0=ruleExpertDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"experts",
            	    						lv_experts_1_0,
            	    						"org.worklang.Work.ExpertDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalWork.g:130:3: ( (lv_practitioners_2_0= rulePractitioner ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWork.g:131:4: (lv_practitioners_2_0= rulePractitioner )
            	    {
            	    // InternalWork.g:131:4: (lv_practitioners_2_0= rulePractitioner )
            	    // InternalWork.g:132:5: lv_practitioners_2_0= rulePractitioner
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPractitionersPractitionerParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_practitioners_2_0=rulePractitioner();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"practitioners",
            	    						lv_practitioners_2_0,
            	    						"org.worklang.Work.Practitioner");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalWork.g:149:3: ( (lv_instructions_3_0= ruleInstruction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWork.g:150:4: (lv_instructions_3_0= ruleInstruction )
            	    {
            	    // InternalWork.g:150:4: (lv_instructions_3_0= ruleInstruction )
            	    // InternalWork.g:151:5: lv_instructions_3_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getInstructionsInstructionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_instructions_3_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_3_0,
            	    						"org.worklang.Work.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInstruction"
    // InternalWork.g:172:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalWork.g:172:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalWork.g:173:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalWork.g:179:1: ruleInstruction returns [EObject current=null] : ( ( (lv_objectType_0_0= 'instruction' ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_objectType_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalWork.g:185:2: ( ( ( (lv_objectType_0_0= 'instruction' ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalWork.g:186:2: ( ( (lv_objectType_0_0= 'instruction' ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalWork.g:186:2: ( ( (lv_objectType_0_0= 'instruction' ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalWork.g:187:3: ( (lv_objectType_0_0= 'instruction' ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalWork.g:187:3: ( (lv_objectType_0_0= 'instruction' ) )
            // InternalWork.g:188:4: (lv_objectType_0_0= 'instruction' )
            {
            // InternalWork.g:188:4: (lv_objectType_0_0= 'instruction' )
            // InternalWork.g:189:5: lv_objectType_0_0= 'instruction'
            {
            lv_objectType_0_0=(Token)match(input,11,FOLLOW_7); 

            					newLeafNode(lv_objectType_0_0, grammarAccess.getInstructionAccess().getObjectTypeInstructionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstructionRule());
            					}
            					setWithLastConsumed(current, "objectType", lv_objectType_0_0, "instruction");
            				

            }


            }

            // InternalWork.g:201:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:202:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:202:4: (otherlv_1= RULE_ID )
            // InternalWork.g:203:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstructionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getInstructionAccess().getSpaceSpaceCrossReference_1_0());
            				

            }


            }

            // InternalWork.g:214:3: ( (otherlv_2= RULE_ID ) )
            // InternalWork.g:215:4: (otherlv_2= RULE_ID )
            {
            // InternalWork.g:215:4: (otherlv_2= RULE_ID )
            // InternalWork.g:216:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstructionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getInstructionAccess().getTransitionTransitionIDCrossReference_2_0());
            				

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleUseDefinition"
    // InternalWork.g:231:1: entryRuleUseDefinition returns [EObject current=null] : iv_ruleUseDefinition= ruleUseDefinition EOF ;
    public final EObject entryRuleUseDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseDefinition = null;


        try {
            // InternalWork.g:231:54: (iv_ruleUseDefinition= ruleUseDefinition EOF )
            // InternalWork.g:232:2: iv_ruleUseDefinition= ruleUseDefinition EOF
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
    // InternalWork.g:238:1: ruleUseDefinition returns [EObject current=null] : ( ( (lv_use_0_0= ruleUse ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_field_2_0= ruleFromFieldDefinition ) ) ) ;
    public final EObject ruleUseDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_use_0_0 = null;

        EObject lv_field_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:244:2: ( ( ( (lv_use_0_0= ruleUse ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_field_2_0= ruleFromFieldDefinition ) ) ) )
            // InternalWork.g:245:2: ( ( (lv_use_0_0= ruleUse ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_field_2_0= ruleFromFieldDefinition ) ) )
            {
            // InternalWork.g:245:2: ( ( (lv_use_0_0= ruleUse ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_field_2_0= ruleFromFieldDefinition ) ) )
            // InternalWork.g:246:3: ( (lv_use_0_0= ruleUse ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_field_2_0= ruleFromFieldDefinition ) )
            {
            // InternalWork.g:246:3: ( (lv_use_0_0= ruleUse ) )
            // InternalWork.g:247:4: (lv_use_0_0= ruleUse )
            {
            // InternalWork.g:247:4: (lv_use_0_0= ruleUse )
            // InternalWork.g:248:5: lv_use_0_0= ruleUse
            {

            					newCompositeNode(grammarAccess.getUseDefinitionAccess().getUseUseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_use_0_0=ruleUse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseDefinitionRule());
            					}
            					set(
            						current,
            						"use",
            						lv_use_0_0,
            						"org.worklang.Work.Use");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:265:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:266:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:266:4: (otherlv_1= RULE_ID )
            // InternalWork.g:267:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseDefinitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getUseDefinitionAccess().getPredefinedValueStateIDCrossReference_1_0());
            				

            }


            }

            // InternalWork.g:278:3: ( (lv_field_2_0= ruleFromFieldDefinition ) )
            // InternalWork.g:279:4: (lv_field_2_0= ruleFromFieldDefinition )
            {
            // InternalWork.g:279:4: (lv_field_2_0= ruleFromFieldDefinition )
            // InternalWork.g:280:5: lv_field_2_0= ruleFromFieldDefinition
            {

            					newCompositeNode(grammarAccess.getUseDefinitionAccess().getFieldFromFieldDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_field_2_0=ruleFromFieldDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseDefinitionRule());
            					}
            					set(
            						current,
            						"field",
            						lv_field_2_0,
            						"org.worklang.Work.FromFieldDefinition");
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
    // $ANTLR end "ruleUseDefinition"


    // $ANTLR start "entryRulePractitioner"
    // InternalWork.g:301:1: entryRulePractitioner returns [EObject current=null] : iv_rulePractitioner= rulePractitioner EOF ;
    public final EObject entryRulePractitioner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePractitioner = null;


        try {
            // InternalWork.g:301:53: (iv_rulePractitioner= rulePractitioner EOF )
            // InternalWork.g:302:2: iv_rulePractitioner= rulePractitioner EOF
            {
             newCompositeNode(grammarAccess.getPractitionerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePractitioner=rulePractitioner();

            state._fsp--;

             current =iv_rulePractitioner; 
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
    // $ANTLR end "entryRulePractitioner"


    // $ANTLR start "rulePractitioner"
    // InternalWork.g:308:1: rulePractitioner returns [EObject current=null] : ( ( (lv_practitionerDef_0_0= 'practitioner' ) ) ( (lv_user_1_0= ruleUser ) ) otherlv_2= '{' ( (lv_knowledgeDef_3_0= ruleKnowledgeDefinition ) )? ( (lv_skillsDef_4_0= ruleSkillsDefinition ) )? otherlv_5= '}' ) ;
    public final EObject rulePractitioner() throws RecognitionException {
        EObject current = null;

        Token lv_practitionerDef_0_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_user_1_0 = null;

        EObject lv_knowledgeDef_3_0 = null;

        EObject lv_skillsDef_4_0 = null;



        	enterRule();

        try {
            // InternalWork.g:314:2: ( ( ( (lv_practitionerDef_0_0= 'practitioner' ) ) ( (lv_user_1_0= ruleUser ) ) otherlv_2= '{' ( (lv_knowledgeDef_3_0= ruleKnowledgeDefinition ) )? ( (lv_skillsDef_4_0= ruleSkillsDefinition ) )? otherlv_5= '}' ) )
            // InternalWork.g:315:2: ( ( (lv_practitionerDef_0_0= 'practitioner' ) ) ( (lv_user_1_0= ruleUser ) ) otherlv_2= '{' ( (lv_knowledgeDef_3_0= ruleKnowledgeDefinition ) )? ( (lv_skillsDef_4_0= ruleSkillsDefinition ) )? otherlv_5= '}' )
            {
            // InternalWork.g:315:2: ( ( (lv_practitionerDef_0_0= 'practitioner' ) ) ( (lv_user_1_0= ruleUser ) ) otherlv_2= '{' ( (lv_knowledgeDef_3_0= ruleKnowledgeDefinition ) )? ( (lv_skillsDef_4_0= ruleSkillsDefinition ) )? otherlv_5= '}' )
            // InternalWork.g:316:3: ( (lv_practitionerDef_0_0= 'practitioner' ) ) ( (lv_user_1_0= ruleUser ) ) otherlv_2= '{' ( (lv_knowledgeDef_3_0= ruleKnowledgeDefinition ) )? ( (lv_skillsDef_4_0= ruleSkillsDefinition ) )? otherlv_5= '}'
            {
            // InternalWork.g:316:3: ( (lv_practitionerDef_0_0= 'practitioner' ) )
            // InternalWork.g:317:4: (lv_practitionerDef_0_0= 'practitioner' )
            {
            // InternalWork.g:317:4: (lv_practitionerDef_0_0= 'practitioner' )
            // InternalWork.g:318:5: lv_practitionerDef_0_0= 'practitioner'
            {
            lv_practitionerDef_0_0=(Token)match(input,12,FOLLOW_7); 

            					newLeafNode(lv_practitionerDef_0_0, grammarAccess.getPractitionerAccess().getPractitionerDefPractitionerKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPractitionerRule());
            					}
            					setWithLastConsumed(current, "practitionerDef", lv_practitionerDef_0_0, "practitioner");
            				

            }


            }

            // InternalWork.g:330:3: ( (lv_user_1_0= ruleUser ) )
            // InternalWork.g:331:4: (lv_user_1_0= ruleUser )
            {
            // InternalWork.g:331:4: (lv_user_1_0= ruleUser )
            // InternalWork.g:332:5: lv_user_1_0= ruleUser
            {

            					newCompositeNode(grammarAccess.getPractitionerAccess().getUserUserParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_user_1_0=ruleUser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPractitionerRule());
            					}
            					set(
            						current,
            						"user",
            						lv_user_1_0,
            						"org.worklang.Work.User");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPractitionerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:353:3: ( (lv_knowledgeDef_3_0= ruleKnowledgeDefinition ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWork.g:354:4: (lv_knowledgeDef_3_0= ruleKnowledgeDefinition )
                    {
                    // InternalWork.g:354:4: (lv_knowledgeDef_3_0= ruleKnowledgeDefinition )
                    // InternalWork.g:355:5: lv_knowledgeDef_3_0= ruleKnowledgeDefinition
                    {

                    					newCompositeNode(grammarAccess.getPractitionerAccess().getKnowledgeDefKnowledgeDefinitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_knowledgeDef_3_0=ruleKnowledgeDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPractitionerRule());
                    					}
                    					set(
                    						current,
                    						"knowledgeDef",
                    						lv_knowledgeDef_3_0,
                    						"org.worklang.Work.KnowledgeDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:372:3: ( (lv_skillsDef_4_0= ruleSkillsDefinition ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWork.g:373:4: (lv_skillsDef_4_0= ruleSkillsDefinition )
                    {
                    // InternalWork.g:373:4: (lv_skillsDef_4_0= ruleSkillsDefinition )
                    // InternalWork.g:374:5: lv_skillsDef_4_0= ruleSkillsDefinition
                    {

                    					newCompositeNode(grammarAccess.getPractitionerAccess().getSkillsDefSkillsDefinitionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_skillsDef_4_0=ruleSkillsDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPractitionerRule());
                    					}
                    					set(
                    						current,
                    						"skillsDef",
                    						lv_skillsDef_4_0,
                    						"org.worklang.Work.SkillsDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPractitionerAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePractitioner"


    // $ANTLR start "entryRuleExpertDefinition"
    // InternalWork.g:399:1: entryRuleExpertDefinition returns [EObject current=null] : iv_ruleExpertDefinition= ruleExpertDefinition EOF ;
    public final EObject entryRuleExpertDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpertDefinition = null;


        try {
            // InternalWork.g:399:57: (iv_ruleExpertDefinition= ruleExpertDefinition EOF )
            // InternalWork.g:400:2: iv_ruleExpertDefinition= ruleExpertDefinition EOF
            {
             newCompositeNode(grammarAccess.getExpertDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpertDefinition=ruleExpertDefinition();

            state._fsp--;

             current =iv_ruleExpertDefinition; 
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
    // $ANTLR end "entryRuleExpertDefinition"


    // $ANTLR start "ruleExpertDefinition"
    // InternalWork.g:406:1: ruleExpertDefinition returns [EObject current=null] : ( ( (lv_expertDef_0_0= 'expert' ) ) ( (lv_user_1_0= ruleUser ) ) otherlv_2= '{' ( (lv_domainDef_3_0= ruleDomainDefinition ) )? ( (lv_knowledgeDef_4_0= ruleKnowledgeDefinition ) )? ( (lv_skillsDef_5_0= ruleSkillsDefinition ) )? otherlv_6= 'hourlyRate' otherlv_7= '$' ( (lv_rate_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
    public final EObject ruleExpertDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_expertDef_0_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_rate_8_0=null;
        Token otherlv_9=null;
        EObject lv_user_1_0 = null;

        EObject lv_domainDef_3_0 = null;

        EObject lv_knowledgeDef_4_0 = null;

        EObject lv_skillsDef_5_0 = null;



        	enterRule();

        try {
            // InternalWork.g:412:2: ( ( ( (lv_expertDef_0_0= 'expert' ) ) ( (lv_user_1_0= ruleUser ) ) otherlv_2= '{' ( (lv_domainDef_3_0= ruleDomainDefinition ) )? ( (lv_knowledgeDef_4_0= ruleKnowledgeDefinition ) )? ( (lv_skillsDef_5_0= ruleSkillsDefinition ) )? otherlv_6= 'hourlyRate' otherlv_7= '$' ( (lv_rate_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalWork.g:413:2: ( ( (lv_expertDef_0_0= 'expert' ) ) ( (lv_user_1_0= ruleUser ) ) otherlv_2= '{' ( (lv_domainDef_3_0= ruleDomainDefinition ) )? ( (lv_knowledgeDef_4_0= ruleKnowledgeDefinition ) )? ( (lv_skillsDef_5_0= ruleSkillsDefinition ) )? otherlv_6= 'hourlyRate' otherlv_7= '$' ( (lv_rate_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalWork.g:413:2: ( ( (lv_expertDef_0_0= 'expert' ) ) ( (lv_user_1_0= ruleUser ) ) otherlv_2= '{' ( (lv_domainDef_3_0= ruleDomainDefinition ) )? ( (lv_knowledgeDef_4_0= ruleKnowledgeDefinition ) )? ( (lv_skillsDef_5_0= ruleSkillsDefinition ) )? otherlv_6= 'hourlyRate' otherlv_7= '$' ( (lv_rate_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalWork.g:414:3: ( (lv_expertDef_0_0= 'expert' ) ) ( (lv_user_1_0= ruleUser ) ) otherlv_2= '{' ( (lv_domainDef_3_0= ruleDomainDefinition ) )? ( (lv_knowledgeDef_4_0= ruleKnowledgeDefinition ) )? ( (lv_skillsDef_5_0= ruleSkillsDefinition ) )? otherlv_6= 'hourlyRate' otherlv_7= '$' ( (lv_rate_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            // InternalWork.g:414:3: ( (lv_expertDef_0_0= 'expert' ) )
            // InternalWork.g:415:4: (lv_expertDef_0_0= 'expert' )
            {
            // InternalWork.g:415:4: (lv_expertDef_0_0= 'expert' )
            // InternalWork.g:416:5: lv_expertDef_0_0= 'expert'
            {
            lv_expertDef_0_0=(Token)match(input,15,FOLLOW_7); 

            					newLeafNode(lv_expertDef_0_0, grammarAccess.getExpertDefinitionAccess().getExpertDefExpertKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpertDefinitionRule());
            					}
            					setWithLastConsumed(current, "expertDef", lv_expertDef_0_0, "expert");
            				

            }


            }

            // InternalWork.g:428:3: ( (lv_user_1_0= ruleUser ) )
            // InternalWork.g:429:4: (lv_user_1_0= ruleUser )
            {
            // InternalWork.g:429:4: (lv_user_1_0= ruleUser )
            // InternalWork.g:430:5: lv_user_1_0= ruleUser
            {

            					newCompositeNode(grammarAccess.getExpertDefinitionAccess().getUserUserParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_user_1_0=ruleUser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpertDefinitionRule());
            					}
            					set(
            						current,
            						"user",
            						lv_user_1_0,
            						"org.worklang.Work.User");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getExpertDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWork.g:451:3: ( (lv_domainDef_3_0= ruleDomainDefinition ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalWork.g:452:4: (lv_domainDef_3_0= ruleDomainDefinition )
                    {
                    // InternalWork.g:452:4: (lv_domainDef_3_0= ruleDomainDefinition )
                    // InternalWork.g:453:5: lv_domainDef_3_0= ruleDomainDefinition
                    {

                    					newCompositeNode(grammarAccess.getExpertDefinitionAccess().getDomainDefDomainDefinitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_domainDef_3_0=ruleDomainDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpertDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"domainDef",
                    						lv_domainDef_3_0,
                    						"org.worklang.Work.DomainDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:470:3: ( (lv_knowledgeDef_4_0= ruleKnowledgeDefinition ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalWork.g:471:4: (lv_knowledgeDef_4_0= ruleKnowledgeDefinition )
                    {
                    // InternalWork.g:471:4: (lv_knowledgeDef_4_0= ruleKnowledgeDefinition )
                    // InternalWork.g:472:5: lv_knowledgeDef_4_0= ruleKnowledgeDefinition
                    {

                    					newCompositeNode(grammarAccess.getExpertDefinitionAccess().getKnowledgeDefKnowledgeDefinitionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_knowledgeDef_4_0=ruleKnowledgeDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpertDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"knowledgeDef",
                    						lv_knowledgeDef_4_0,
                    						"org.worklang.Work.KnowledgeDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:489:3: ( (lv_skillsDef_5_0= ruleSkillsDefinition ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalWork.g:490:4: (lv_skillsDef_5_0= ruleSkillsDefinition )
                    {
                    // InternalWork.g:490:4: (lv_skillsDef_5_0= ruleSkillsDefinition )
                    // InternalWork.g:491:5: lv_skillsDef_5_0= ruleSkillsDefinition
                    {

                    					newCompositeNode(grammarAccess.getExpertDefinitionAccess().getSkillsDefSkillsDefinitionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_skillsDef_5_0=ruleSkillsDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpertDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"skillsDef",
                    						lv_skillsDef_5_0,
                    						"org.worklang.Work.SkillsDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getExpertDefinitionAccess().getHourlyRateKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getExpertDefinitionAccess().getDollarSignKeyword_7());
            		
            // InternalWork.g:516:3: ( (lv_rate_8_0= RULE_INT ) )
            // InternalWork.g:517:4: (lv_rate_8_0= RULE_INT )
            {
            // InternalWork.g:517:4: (lv_rate_8_0= RULE_INT )
            // InternalWork.g:518:5: lv_rate_8_0= RULE_INT
            {
            lv_rate_8_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_rate_8_0, grammarAccess.getExpertDefinitionAccess().getRateINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpertDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rate",
            						lv_rate_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getExpertDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleExpertDefinition"


    // $ANTLR start "entryRuleUser"
    // InternalWork.g:542:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalWork.g:542:45: (iv_ruleUser= ruleUser EOF )
            // InternalWork.g:543:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalWork.g:549:1: ruleUser returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalWork.g:555:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalWork.g:556:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalWork.g:556:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalWork.g:557:3: (lv_name_0_0= RULE_ID )
            {
            // InternalWork.g:557:3: (lv_name_0_0= RULE_ID )
            // InternalWork.g:558:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUserRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleDomainDefinition"
    // InternalWork.g:577:1: entryRuleDomainDefinition returns [EObject current=null] : iv_ruleDomainDefinition= ruleDomainDefinition EOF ;
    public final EObject entryRuleDomainDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainDefinition = null;


        try {
            // InternalWork.g:577:57: (iv_ruleDomainDefinition= ruleDomainDefinition EOF )
            // InternalWork.g:578:2: iv_ruleDomainDefinition= ruleDomainDefinition EOF
            {
             newCompositeNode(grammarAccess.getDomainDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainDefinition=ruleDomainDefinition();

            state._fsp--;

             current =iv_ruleDomainDefinition; 
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
    // $ANTLR end "entryRuleDomainDefinition"


    // $ANTLR start "ruleDomainDefinition"
    // InternalWork.g:584:1: ruleDomainDefinition returns [EObject current=null] : ( ( (lv_domain_0_0= 'domain' ) ) otherlv_1= '{' ( (lv_domainAreas_2_0= ruleReferenceField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDomainDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_domain_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domainAreas_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:590:2: ( ( ( (lv_domain_0_0= 'domain' ) ) otherlv_1= '{' ( (lv_domainAreas_2_0= ruleReferenceField ) )* otherlv_3= '}' ) )
            // InternalWork.g:591:2: ( ( (lv_domain_0_0= 'domain' ) ) otherlv_1= '{' ( (lv_domainAreas_2_0= ruleReferenceField ) )* otherlv_3= '}' )
            {
            // InternalWork.g:591:2: ( ( (lv_domain_0_0= 'domain' ) ) otherlv_1= '{' ( (lv_domainAreas_2_0= ruleReferenceField ) )* otherlv_3= '}' )
            // InternalWork.g:592:3: ( (lv_domain_0_0= 'domain' ) ) otherlv_1= '{' ( (lv_domainAreas_2_0= ruleReferenceField ) )* otherlv_3= '}'
            {
            // InternalWork.g:592:3: ( (lv_domain_0_0= 'domain' ) )
            // InternalWork.g:593:4: (lv_domain_0_0= 'domain' )
            {
            // InternalWork.g:593:4: (lv_domain_0_0= 'domain' )
            // InternalWork.g:594:5: lv_domain_0_0= 'domain'
            {
            lv_domain_0_0=(Token)match(input,18,FOLLOW_9); 

            					newLeafNode(lv_domain_0_0, grammarAccess.getDomainDefinitionAccess().getDomainDomainKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainDefinitionRule());
            					}
            					setWithLastConsumed(current, "domain", lv_domain_0_0, "domain");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWork.g:610:3: ( (lv_domainAreas_2_0= ruleReferenceField ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWork.g:611:4: (lv_domainAreas_2_0= ruleReferenceField )
            	    {
            	    // InternalWork.g:611:4: (lv_domainAreas_2_0= ruleReferenceField )
            	    // InternalWork.g:612:5: lv_domainAreas_2_0= ruleReferenceField
            	    {

            	    					newCompositeNode(grammarAccess.getDomainDefinitionAccess().getDomainAreasReferenceFieldParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_domainAreas_2_0=ruleReferenceField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"domainAreas",
            	    						lv_domainAreas_2_0,
            	    						"org.worklang.Work.ReferenceField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleDomainDefinition"


    // $ANTLR start "entryRuleKnowledgeDefinition"
    // InternalWork.g:637:1: entryRuleKnowledgeDefinition returns [EObject current=null] : iv_ruleKnowledgeDefinition= ruleKnowledgeDefinition EOF ;
    public final EObject entryRuleKnowledgeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeDefinition = null;


        try {
            // InternalWork.g:637:60: (iv_ruleKnowledgeDefinition= ruleKnowledgeDefinition EOF )
            // InternalWork.g:638:2: iv_ruleKnowledgeDefinition= ruleKnowledgeDefinition EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeDefinition=ruleKnowledgeDefinition();

            state._fsp--;

             current =iv_ruleKnowledgeDefinition; 
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
    // $ANTLR end "entryRuleKnowledgeDefinition"


    // $ANTLR start "ruleKnowledgeDefinition"
    // InternalWork.g:644:1: ruleKnowledgeDefinition returns [EObject current=null] : ( ( (lv_knowledgeDef_0_0= 'knowledge' ) ) otherlv_1= '{' ( (lv_knowledge_2_0= ruleReferenceState ) )* otherlv_3= '}' ) ;
    public final EObject ruleKnowledgeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_knowledgeDef_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_knowledge_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:650:2: ( ( ( (lv_knowledgeDef_0_0= 'knowledge' ) ) otherlv_1= '{' ( (lv_knowledge_2_0= ruleReferenceState ) )* otherlv_3= '}' ) )
            // InternalWork.g:651:2: ( ( (lv_knowledgeDef_0_0= 'knowledge' ) ) otherlv_1= '{' ( (lv_knowledge_2_0= ruleReferenceState ) )* otherlv_3= '}' )
            {
            // InternalWork.g:651:2: ( ( (lv_knowledgeDef_0_0= 'knowledge' ) ) otherlv_1= '{' ( (lv_knowledge_2_0= ruleReferenceState ) )* otherlv_3= '}' )
            // InternalWork.g:652:3: ( (lv_knowledgeDef_0_0= 'knowledge' ) ) otherlv_1= '{' ( (lv_knowledge_2_0= ruleReferenceState ) )* otherlv_3= '}'
            {
            // InternalWork.g:652:3: ( (lv_knowledgeDef_0_0= 'knowledge' ) )
            // InternalWork.g:653:4: (lv_knowledgeDef_0_0= 'knowledge' )
            {
            // InternalWork.g:653:4: (lv_knowledgeDef_0_0= 'knowledge' )
            // InternalWork.g:654:5: lv_knowledgeDef_0_0= 'knowledge'
            {
            lv_knowledgeDef_0_0=(Token)match(input,19,FOLLOW_9); 

            					newLeafNode(lv_knowledgeDef_0_0, grammarAccess.getKnowledgeDefinitionAccess().getKnowledgeDefKnowledgeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKnowledgeDefinitionRule());
            					}
            					setWithLastConsumed(current, "knowledgeDef", lv_knowledgeDef_0_0, "knowledge");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getKnowledgeDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWork.g:670:3: ( (lv_knowledge_2_0= ruleReferenceState ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWork.g:671:4: (lv_knowledge_2_0= ruleReferenceState )
            	    {
            	    // InternalWork.g:671:4: (lv_knowledge_2_0= ruleReferenceState )
            	    // InternalWork.g:672:5: lv_knowledge_2_0= ruleReferenceState
            	    {

            	    					newCompositeNode(grammarAccess.getKnowledgeDefinitionAccess().getKnowledgeReferenceStateParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_knowledge_2_0=ruleReferenceState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getKnowledgeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"knowledge",
            	    						lv_knowledge_2_0,
            	    						"org.worklang.Work.ReferenceState");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getKnowledgeDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleKnowledgeDefinition"


    // $ANTLR start "entryRuleSkillsDefinition"
    // InternalWork.g:697:1: entryRuleSkillsDefinition returns [EObject current=null] : iv_ruleSkillsDefinition= ruleSkillsDefinition EOF ;
    public final EObject entryRuleSkillsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillsDefinition = null;


        try {
            // InternalWork.g:697:57: (iv_ruleSkillsDefinition= ruleSkillsDefinition EOF )
            // InternalWork.g:698:2: iv_ruleSkillsDefinition= ruleSkillsDefinition EOF
            {
             newCompositeNode(grammarAccess.getSkillsDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillsDefinition=ruleSkillsDefinition();

            state._fsp--;

             current =iv_ruleSkillsDefinition; 
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
    // $ANTLR end "entryRuleSkillsDefinition"


    // $ANTLR start "ruleSkillsDefinition"
    // InternalWork.g:704:1: ruleSkillsDefinition returns [EObject current=null] : ( ( (lv_skillsDef_0_0= 'skills' ) ) otherlv_1= '{' ( (lv_skills_2_0= ruleReferenceTransition ) )* otherlv_3= '}' ) ;
    public final EObject ruleSkillsDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_skillsDef_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_skills_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:710:2: ( ( ( (lv_skillsDef_0_0= 'skills' ) ) otherlv_1= '{' ( (lv_skills_2_0= ruleReferenceTransition ) )* otherlv_3= '}' ) )
            // InternalWork.g:711:2: ( ( (lv_skillsDef_0_0= 'skills' ) ) otherlv_1= '{' ( (lv_skills_2_0= ruleReferenceTransition ) )* otherlv_3= '}' )
            {
            // InternalWork.g:711:2: ( ( (lv_skillsDef_0_0= 'skills' ) ) otherlv_1= '{' ( (lv_skills_2_0= ruleReferenceTransition ) )* otherlv_3= '}' )
            // InternalWork.g:712:3: ( (lv_skillsDef_0_0= 'skills' ) ) otherlv_1= '{' ( (lv_skills_2_0= ruleReferenceTransition ) )* otherlv_3= '}'
            {
            // InternalWork.g:712:3: ( (lv_skillsDef_0_0= 'skills' ) )
            // InternalWork.g:713:4: (lv_skillsDef_0_0= 'skills' )
            {
            // InternalWork.g:713:4: (lv_skillsDef_0_0= 'skills' )
            // InternalWork.g:714:5: lv_skillsDef_0_0= 'skills'
            {
            lv_skillsDef_0_0=(Token)match(input,20,FOLLOW_9); 

            					newLeafNode(lv_skillsDef_0_0, grammarAccess.getSkillsDefinitionAccess().getSkillsDefSkillsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillsDefinitionRule());
            					}
            					setWithLastConsumed(current, "skillsDef", lv_skillsDef_0_0, "skills");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSkillsDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWork.g:730:3: ( (lv_skills_2_0= ruleReferenceTransition ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWork.g:731:4: (lv_skills_2_0= ruleReferenceTransition )
            	    {
            	    // InternalWork.g:731:4: (lv_skills_2_0= ruleReferenceTransition )
            	    // InternalWork.g:732:5: lv_skills_2_0= ruleReferenceTransition
            	    {

            	    					newCompositeNode(grammarAccess.getSkillsDefinitionAccess().getSkillsReferenceTransitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_skills_2_0=ruleReferenceTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillsDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"skills",
            	    						lv_skills_2_0,
            	    						"org.worklang.Work.ReferenceTransition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSkillsDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSkillsDefinition"


    // $ANTLR start "entryRuleFieldDefinition"
    // InternalWork.g:757:1: entryRuleFieldDefinition returns [EObject current=null] : iv_ruleFieldDefinition= ruleFieldDefinition EOF ;
    public final EObject entryRuleFieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDefinition = null;


        try {
            // InternalWork.g:757:56: (iv_ruleFieldDefinition= ruleFieldDefinition EOF )
            // InternalWork.g:758:2: iv_ruleFieldDefinition= ruleFieldDefinition EOF
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
    // InternalWork.g:764:1: ruleFieldDefinition returns [EObject current=null] : ( ( (lv_field_0_0= ruleField ) ) ( (lv_space_1_0= ruleSpace ) ) ( (lv_extends_2_0= ruleExtendsDefinition ) )? otherlv_3= '{' ( (lv_conceptualspace_4_0= ruleNamespace ) )? ( (lv_referencespace_5_0= ruleReferencespace ) )? ( (lv_instancespace_6_0= ruleInstancespace ) )? otherlv_7= '}' ) ;
    public final EObject ruleFieldDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_field_0_0 = null;

        EObject lv_space_1_0 = null;

        EObject lv_extends_2_0 = null;

        EObject lv_conceptualspace_4_0 = null;

        EObject lv_referencespace_5_0 = null;

        EObject lv_instancespace_6_0 = null;



        	enterRule();

        try {
            // InternalWork.g:770:2: ( ( ( (lv_field_0_0= ruleField ) ) ( (lv_space_1_0= ruleSpace ) ) ( (lv_extends_2_0= ruleExtendsDefinition ) )? otherlv_3= '{' ( (lv_conceptualspace_4_0= ruleNamespace ) )? ( (lv_referencespace_5_0= ruleReferencespace ) )? ( (lv_instancespace_6_0= ruleInstancespace ) )? otherlv_7= '}' ) )
            // InternalWork.g:771:2: ( ( (lv_field_0_0= ruleField ) ) ( (lv_space_1_0= ruleSpace ) ) ( (lv_extends_2_0= ruleExtendsDefinition ) )? otherlv_3= '{' ( (lv_conceptualspace_4_0= ruleNamespace ) )? ( (lv_referencespace_5_0= ruleReferencespace ) )? ( (lv_instancespace_6_0= ruleInstancespace ) )? otherlv_7= '}' )
            {
            // InternalWork.g:771:2: ( ( (lv_field_0_0= ruleField ) ) ( (lv_space_1_0= ruleSpace ) ) ( (lv_extends_2_0= ruleExtendsDefinition ) )? otherlv_3= '{' ( (lv_conceptualspace_4_0= ruleNamespace ) )? ( (lv_referencespace_5_0= ruleReferencespace ) )? ( (lv_instancespace_6_0= ruleInstancespace ) )? otherlv_7= '}' )
            // InternalWork.g:772:3: ( (lv_field_0_0= ruleField ) ) ( (lv_space_1_0= ruleSpace ) ) ( (lv_extends_2_0= ruleExtendsDefinition ) )? otherlv_3= '{' ( (lv_conceptualspace_4_0= ruleNamespace ) )? ( (lv_referencespace_5_0= ruleReferencespace ) )? ( (lv_instancespace_6_0= ruleInstancespace ) )? otherlv_7= '}'
            {
            // InternalWork.g:772:3: ( (lv_field_0_0= ruleField ) )
            // InternalWork.g:773:4: (lv_field_0_0= ruleField )
            {
            // InternalWork.g:773:4: (lv_field_0_0= ruleField )
            // InternalWork.g:774:5: lv_field_0_0= ruleField
            {

            					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getFieldFieldParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_field_0_0=ruleField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
            					}
            					set(
            						current,
            						"field",
            						lv_field_0_0,
            						"org.worklang.Work.Field");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:791:3: ( (lv_space_1_0= ruleSpace ) )
            // InternalWork.g:792:4: (lv_space_1_0= ruleSpace )
            {
            // InternalWork.g:792:4: (lv_space_1_0= ruleSpace )
            // InternalWork.g:793:5: lv_space_1_0= ruleSpace
            {

            					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getSpaceSpaceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_space_1_0=ruleSpace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
            					}
            					set(
            						current,
            						"space",
            						lv_space_1_0,
            						"org.worklang.Work.Space");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:810:3: ( (lv_extends_2_0= ruleExtendsDefinition ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalWork.g:811:4: (lv_extends_2_0= ruleExtendsDefinition )
                    {
                    // InternalWork.g:811:4: (lv_extends_2_0= ruleExtendsDefinition )
                    // InternalWork.g:812:5: lv_extends_2_0= ruleExtendsDefinition
                    {

                    					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getExtendsExtendsDefinitionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_extends_2_0=ruleExtendsDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"extends",
                    						lv_extends_2_0,
                    						"org.worklang.Work.ExtendsDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalWork.g:833:3: ( (lv_conceptualspace_4_0= ruleNamespace ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalWork.g:834:4: (lv_conceptualspace_4_0= ruleNamespace )
                    {
                    // InternalWork.g:834:4: (lv_conceptualspace_4_0= ruleNamespace )
                    // InternalWork.g:835:5: lv_conceptualspace_4_0= ruleNamespace
                    {

                    					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getConceptualspaceNamespaceParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_conceptualspace_4_0=ruleNamespace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"conceptualspace",
                    						lv_conceptualspace_4_0,
                    						"org.worklang.Work.Namespace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:852:3: ( (lv_referencespace_5_0= ruleReferencespace ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalWork.g:853:4: (lv_referencespace_5_0= ruleReferencespace )
                    {
                    // InternalWork.g:853:4: (lv_referencespace_5_0= ruleReferencespace )
                    // InternalWork.g:854:5: lv_referencespace_5_0= ruleReferencespace
                    {

                    					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getReferencespaceReferencespaceParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_referencespace_5_0=ruleReferencespace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"referencespace",
                    						lv_referencespace_5_0,
                    						"org.worklang.Work.Referencespace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:871:3: ( (lv_instancespace_6_0= ruleInstancespace ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalWork.g:872:4: (lv_instancespace_6_0= ruleInstancespace )
                    {
                    // InternalWork.g:872:4: (lv_instancespace_6_0= ruleInstancespace )
                    // InternalWork.g:873:5: lv_instancespace_6_0= ruleInstancespace
                    {

                    					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getInstancespaceInstancespaceParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_instancespace_6_0=ruleInstancespace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"instancespace",
                    						lv_instancespace_6_0,
                    						"org.worklang.Work.Instancespace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSpace"
    // InternalWork.g:898:1: entryRuleSpace returns [EObject current=null] : iv_ruleSpace= ruleSpace EOF ;
    public final EObject entryRuleSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpace = null;


        try {
            // InternalWork.g:898:46: (iv_ruleSpace= ruleSpace EOF )
            // InternalWork.g:899:2: iv_ruleSpace= ruleSpace EOF
            {
             newCompositeNode(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpace=ruleSpace();

            state._fsp--;

             current =iv_ruleSpace; 
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
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalWork.g:905:1: ruleSpace returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSpace() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalWork.g:911:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalWork.g:912:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalWork.g:912:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalWork.g:913:3: (lv_name_0_0= RULE_ID )
            {
            // InternalWork.g:913:3: (lv_name_0_0= RULE_ID )
            // InternalWork.g:914:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSpaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSpaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleNamespace"
    // InternalWork.g:933:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalWork.g:933:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalWork.g:934:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalWork.g:940:1: ruleNamespace returns [EObject current=null] : ( ( (lv_spaceType_0_0= ruleDefinitions ) ) otherlv_1= '{' ( (lv_states_2_0= ruleStateObjectDefinition ) )* ( (lv_transitions_3_0= ruleTransitionObjectDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_spaceType_0_0 = null;

        EObject lv_states_2_0 = null;

        EObject lv_transitions_3_0 = null;



        	enterRule();

        try {
            // InternalWork.g:946:2: ( ( ( (lv_spaceType_0_0= ruleDefinitions ) ) otherlv_1= '{' ( (lv_states_2_0= ruleStateObjectDefinition ) )* ( (lv_transitions_3_0= ruleTransitionObjectDefinition ) )* otherlv_4= '}' ) )
            // InternalWork.g:947:2: ( ( (lv_spaceType_0_0= ruleDefinitions ) ) otherlv_1= '{' ( (lv_states_2_0= ruleStateObjectDefinition ) )* ( (lv_transitions_3_0= ruleTransitionObjectDefinition ) )* otherlv_4= '}' )
            {
            // InternalWork.g:947:2: ( ( (lv_spaceType_0_0= ruleDefinitions ) ) otherlv_1= '{' ( (lv_states_2_0= ruleStateObjectDefinition ) )* ( (lv_transitions_3_0= ruleTransitionObjectDefinition ) )* otherlv_4= '}' )
            // InternalWork.g:948:3: ( (lv_spaceType_0_0= ruleDefinitions ) ) otherlv_1= '{' ( (lv_states_2_0= ruleStateObjectDefinition ) )* ( (lv_transitions_3_0= ruleTransitionObjectDefinition ) )* otherlv_4= '}'
            {
            // InternalWork.g:948:3: ( (lv_spaceType_0_0= ruleDefinitions ) )
            // InternalWork.g:949:4: (lv_spaceType_0_0= ruleDefinitions )
            {
            // InternalWork.g:949:4: (lv_spaceType_0_0= ruleDefinitions )
            // InternalWork.g:950:5: lv_spaceType_0_0= ruleDefinitions
            {

            					newCompositeNode(grammarAccess.getNamespaceAccess().getSpaceTypeDefinitionsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_spaceType_0_0=ruleDefinitions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            					}
            					set(
            						current,
            						"spaceType",
            						lv_spaceType_0_0,
            						"org.worklang.Work.Definitions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWork.g:971:3: ( (lv_states_2_0= ruleStateObjectDefinition ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==26) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==24) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==26) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalWork.g:972:4: (lv_states_2_0= ruleStateObjectDefinition )
            	    {
            	    // InternalWork.g:972:4: (lv_states_2_0= ruleStateObjectDefinition )
            	    // InternalWork.g:973:5: lv_states_2_0= ruleStateObjectDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getNamespaceAccess().getStatesStateObjectDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_states_2_0=ruleStateObjectDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_2_0,
            	    						"org.worklang.Work.StateObjectDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalWork.g:990:3: ( (lv_transitions_3_0= ruleTransitionObjectDefinition ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=23 && LA18_0<=24)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalWork.g:991:4: (lv_transitions_3_0= ruleTransitionObjectDefinition )
            	    {
            	    // InternalWork.g:991:4: (lv_transitions_3_0= ruleTransitionObjectDefinition )
            	    // InternalWork.g:992:5: lv_transitions_3_0= ruleTransitionObjectDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getNamespaceAccess().getTransitionsTransitionObjectDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_transitions_3_0=ruleTransitionObjectDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_3_0,
            	    						"org.worklang.Work.TransitionObjectDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleReferencespace"
    // InternalWork.g:1017:1: entryRuleReferencespace returns [EObject current=null] : iv_ruleReferencespace= ruleReferencespace EOF ;
    public final EObject entryRuleReferencespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencespace = null;


        try {
            // InternalWork.g:1017:55: (iv_ruleReferencespace= ruleReferencespace EOF )
            // InternalWork.g:1018:2: iv_ruleReferencespace= ruleReferencespace EOF
            {
             newCompositeNode(grammarAccess.getReferencespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferencespace=ruleReferencespace();

            state._fsp--;

             current =iv_ruleReferencespace; 
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
    // $ANTLR end "entryRuleReferencespace"


    // $ANTLR start "ruleReferencespace"
    // InternalWork.g:1024:1: ruleReferencespace returns [EObject current=null] : ( ( (lv_spaceType_0_0= ruleReferences ) ) otherlv_1= '{' ( (lv_refFields_2_0= ruleReferenceField ) )* ( (lv_refStates_3_0= ruleReferenceState ) )* ( (lv_refTransition_4_0= ruleReferenceTransition ) )* otherlv_5= '}' ) ;
    public final EObject ruleReferencespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_spaceType_0_0 = null;

        EObject lv_refFields_2_0 = null;

        EObject lv_refStates_3_0 = null;

        EObject lv_refTransition_4_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1030:2: ( ( ( (lv_spaceType_0_0= ruleReferences ) ) otherlv_1= '{' ( (lv_refFields_2_0= ruleReferenceField ) )* ( (lv_refStates_3_0= ruleReferenceState ) )* ( (lv_refTransition_4_0= ruleReferenceTransition ) )* otherlv_5= '}' ) )
            // InternalWork.g:1031:2: ( ( (lv_spaceType_0_0= ruleReferences ) ) otherlv_1= '{' ( (lv_refFields_2_0= ruleReferenceField ) )* ( (lv_refStates_3_0= ruleReferenceState ) )* ( (lv_refTransition_4_0= ruleReferenceTransition ) )* otherlv_5= '}' )
            {
            // InternalWork.g:1031:2: ( ( (lv_spaceType_0_0= ruleReferences ) ) otherlv_1= '{' ( (lv_refFields_2_0= ruleReferenceField ) )* ( (lv_refStates_3_0= ruleReferenceState ) )* ( (lv_refTransition_4_0= ruleReferenceTransition ) )* otherlv_5= '}' )
            // InternalWork.g:1032:3: ( (lv_spaceType_0_0= ruleReferences ) ) otherlv_1= '{' ( (lv_refFields_2_0= ruleReferenceField ) )* ( (lv_refStates_3_0= ruleReferenceState ) )* ( (lv_refTransition_4_0= ruleReferenceTransition ) )* otherlv_5= '}'
            {
            // InternalWork.g:1032:3: ( (lv_spaceType_0_0= ruleReferences ) )
            // InternalWork.g:1033:4: (lv_spaceType_0_0= ruleReferences )
            {
            // InternalWork.g:1033:4: (lv_spaceType_0_0= ruleReferences )
            // InternalWork.g:1034:5: lv_spaceType_0_0= ruleReferences
            {

            					newCompositeNode(grammarAccess.getReferencespaceAccess().getSpaceTypeReferencesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_spaceType_0_0=ruleReferences();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferencespaceRule());
            					}
            					set(
            						current,
            						"spaceType",
            						lv_spaceType_0_0,
            						"org.worklang.Work.References");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getReferencespaceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWork.g:1055:3: ( (lv_refFields_2_0= ruleReferenceField ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalWork.g:1056:4: (lv_refFields_2_0= ruleReferenceField )
            	    {
            	    // InternalWork.g:1056:4: (lv_refFields_2_0= ruleReferenceField )
            	    // InternalWork.g:1057:5: lv_refFields_2_0= ruleReferenceField
            	    {

            	    					newCompositeNode(grammarAccess.getReferencespaceAccess().getRefFieldsReferenceFieldParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_refFields_2_0=ruleReferenceField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferencespaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refFields",
            	    						lv_refFields_2_0,
            	    						"org.worklang.Work.ReferenceField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalWork.g:1074:3: ( (lv_refStates_3_0= ruleReferenceState ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalWork.g:1075:4: (lv_refStates_3_0= ruleReferenceState )
            	    {
            	    // InternalWork.g:1075:4: (lv_refStates_3_0= ruleReferenceState )
            	    // InternalWork.g:1076:5: lv_refStates_3_0= ruleReferenceState
            	    {

            	    					newCompositeNode(grammarAccess.getReferencespaceAccess().getRefStatesReferenceStateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_refStates_3_0=ruleReferenceState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferencespaceRule());
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
            	    break loop20;
                }
            } while (true);

            // InternalWork.g:1093:3: ( (lv_refTransition_4_0= ruleReferenceTransition ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalWork.g:1094:4: (lv_refTransition_4_0= ruleReferenceTransition )
            	    {
            	    // InternalWork.g:1094:4: (lv_refTransition_4_0= ruleReferenceTransition )
            	    // InternalWork.g:1095:5: lv_refTransition_4_0= ruleReferenceTransition
            	    {

            	    					newCompositeNode(grammarAccess.getReferencespaceAccess().getRefTransitionReferenceTransitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_refTransition_4_0=ruleReferenceTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferencespaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refTransition",
            	    						lv_refTransition_4_0,
            	    						"org.worklang.Work.ReferenceTransition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReferencespaceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleReferencespace"


    // $ANTLR start "entryRuleInstancespace"
    // InternalWork.g:1120:1: entryRuleInstancespace returns [EObject current=null] : iv_ruleInstancespace= ruleInstancespace EOF ;
    public final EObject entryRuleInstancespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstancespace = null;


        try {
            // InternalWork.g:1120:54: (iv_ruleInstancespace= ruleInstancespace EOF )
            // InternalWork.g:1121:2: iv_ruleInstancespace= ruleInstancespace EOF
            {
             newCompositeNode(grammarAccess.getInstancespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstancespace=ruleInstancespace();

            state._fsp--;

             current =iv_ruleInstancespace; 
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
    // $ANTLR end "entryRuleInstancespace"


    // $ANTLR start "ruleInstancespace"
    // InternalWork.g:1127:1: ruleInstancespace returns [EObject current=null] : ( ( (lv_spaceType_0_0= ruleInstances ) ) otherlv_1= '{' ( (lv_instanceStates_2_0= ruleInstance ) )* otherlv_3= '}' ) ;
    public final EObject ruleInstancespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_spaceType_0_0 = null;

        EObject lv_instanceStates_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1133:2: ( ( ( (lv_spaceType_0_0= ruleInstances ) ) otherlv_1= '{' ( (lv_instanceStates_2_0= ruleInstance ) )* otherlv_3= '}' ) )
            // InternalWork.g:1134:2: ( ( (lv_spaceType_0_0= ruleInstances ) ) otherlv_1= '{' ( (lv_instanceStates_2_0= ruleInstance ) )* otherlv_3= '}' )
            {
            // InternalWork.g:1134:2: ( ( (lv_spaceType_0_0= ruleInstances ) ) otherlv_1= '{' ( (lv_instanceStates_2_0= ruleInstance ) )* otherlv_3= '}' )
            // InternalWork.g:1135:3: ( (lv_spaceType_0_0= ruleInstances ) ) otherlv_1= '{' ( (lv_instanceStates_2_0= ruleInstance ) )* otherlv_3= '}'
            {
            // InternalWork.g:1135:3: ( (lv_spaceType_0_0= ruleInstances ) )
            // InternalWork.g:1136:4: (lv_spaceType_0_0= ruleInstances )
            {
            // InternalWork.g:1136:4: (lv_spaceType_0_0= ruleInstances )
            // InternalWork.g:1137:5: lv_spaceType_0_0= ruleInstances
            {

            					newCompositeNode(grammarAccess.getInstancespaceAccess().getSpaceTypeInstancesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_spaceType_0_0=ruleInstances();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstancespaceRule());
            					}
            					set(
            						current,
            						"spaceType",
            						lv_spaceType_0_0,
            						"org.worklang.Work.Instances");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getInstancespaceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWork.g:1158:3: ( (lv_instanceStates_2_0= ruleInstance ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalWork.g:1159:4: (lv_instanceStates_2_0= ruleInstance )
            	    {
            	    // InternalWork.g:1159:4: (lv_instanceStates_2_0= ruleInstance )
            	    // InternalWork.g:1160:5: lv_instanceStates_2_0= ruleInstance
            	    {

            	    					newCompositeNode(grammarAccess.getInstancespaceAccess().getInstanceStatesInstanceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_instanceStates_2_0=ruleInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstancespaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instanceStates",
            	    						lv_instanceStates_2_0,
            	    						"org.worklang.Work.Instance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInstancespaceAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleInstancespace"


    // $ANTLR start "entryRuleReferenceField"
    // InternalWork.g:1185:1: entryRuleReferenceField returns [EObject current=null] : iv_ruleReferenceField= ruleReferenceField EOF ;
    public final EObject entryRuleReferenceField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceField = null;


        try {
            // InternalWork.g:1185:55: (iv_ruleReferenceField= ruleReferenceField EOF )
            // InternalWork.g:1186:2: iv_ruleReferenceField= ruleReferenceField EOF
            {
             newCompositeNode(grammarAccess.getReferenceFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceField=ruleReferenceField();

            state._fsp--;

             current =iv_ruleReferenceField; 
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
    // $ANTLR end "entryRuleReferenceField"


    // $ANTLR start "ruleReferenceField"
    // InternalWork.g:1192:1: ruleReferenceField returns [EObject current=null] : ( ( (lv_ref_0_0= ruleField ) ) ( (lv_space_1_0= ruleSpace ) ) ) ;
    public final EObject ruleReferenceField() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ref_0_0 = null;

        EObject lv_space_1_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1198:2: ( ( ( (lv_ref_0_0= ruleField ) ) ( (lv_space_1_0= ruleSpace ) ) ) )
            // InternalWork.g:1199:2: ( ( (lv_ref_0_0= ruleField ) ) ( (lv_space_1_0= ruleSpace ) ) )
            {
            // InternalWork.g:1199:2: ( ( (lv_ref_0_0= ruleField ) ) ( (lv_space_1_0= ruleSpace ) ) )
            // InternalWork.g:1200:3: ( (lv_ref_0_0= ruleField ) ) ( (lv_space_1_0= ruleSpace ) )
            {
            // InternalWork.g:1200:3: ( (lv_ref_0_0= ruleField ) )
            // InternalWork.g:1201:4: (lv_ref_0_0= ruleField )
            {
            // InternalWork.g:1201:4: (lv_ref_0_0= ruleField )
            // InternalWork.g:1202:5: lv_ref_0_0= ruleField
            {

            					newCompositeNode(grammarAccess.getReferenceFieldAccess().getRefFieldParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_ref_0_0=ruleField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceFieldRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_0_0,
            						"org.worklang.Work.Field");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:1219:3: ( (lv_space_1_0= ruleSpace ) )
            // InternalWork.g:1220:4: (lv_space_1_0= ruleSpace )
            {
            // InternalWork.g:1220:4: (lv_space_1_0= ruleSpace )
            // InternalWork.g:1221:5: lv_space_1_0= ruleSpace
            {

            					newCompositeNode(grammarAccess.getReferenceFieldAccess().getSpaceSpaceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_space_1_0=ruleSpace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceFieldRule());
            					}
            					set(
            						current,
            						"space",
            						lv_space_1_0,
            						"org.worklang.Work.Space");
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
    // $ANTLR end "ruleReferenceField"


    // $ANTLR start "entryRuleStateObjectDefinition"
    // InternalWork.g:1242:1: entryRuleStateObjectDefinition returns [EObject current=null] : iv_ruleStateObjectDefinition= ruleStateObjectDefinition EOF ;
    public final EObject entryRuleStateObjectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateObjectDefinition = null;


        try {
            // InternalWork.g:1242:62: (iv_ruleStateObjectDefinition= ruleStateObjectDefinition EOF )
            // InternalWork.g:1243:2: iv_ruleStateObjectDefinition= ruleStateObjectDefinition EOF
            {
             newCompositeNode(grammarAccess.getStateObjectDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateObjectDefinition=ruleStateObjectDefinition();

            state._fsp--;

             current =iv_ruleStateObjectDefinition; 
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
    // $ANTLR end "entryRuleStateObjectDefinition"


    // $ANTLR start "ruleStateObjectDefinition"
    // InternalWork.g:1249:1: ruleStateObjectDefinition returns [EObject current=null] : ( ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) ) ( (lv_state_2_0= ruleStateDefinition ) ) ) ;
    public final EObject ruleStateObjectDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_state_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1255:2: ( ( ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) ) ( (lv_state_2_0= ruleStateDefinition ) ) ) )
            // InternalWork.g:1256:2: ( ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) ) ( (lv_state_2_0= ruleStateDefinition ) ) )
            {
            // InternalWork.g:1256:2: ( ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) ) ( (lv_state_2_0= ruleStateDefinition ) ) )
            // InternalWork.g:1257:3: ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) ) ( (lv_state_2_0= ruleStateDefinition ) )
            {
            // InternalWork.g:1257:3: ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            else if ( (LA23_0==24) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalWork.g:1258:4: ( (lv_type_0_0= rulePrimitive ) )
                    {
                    // InternalWork.g:1258:4: ( (lv_type_0_0= rulePrimitive ) )
                    // InternalWork.g:1259:5: (lv_type_0_0= rulePrimitive )
                    {
                    // InternalWork.g:1259:5: (lv_type_0_0= rulePrimitive )
                    // InternalWork.g:1260:6: lv_type_0_0= rulePrimitive
                    {

                    						newCompositeNode(grammarAccess.getStateObjectDefinitionAccess().getTypePrimitiveParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_type_0_0=rulePrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateObjectDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_0,
                    							"org.worklang.Work.Primitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWork.g:1278:4: ( (lv_type_1_0= ruleCompound ) )
                    {
                    // InternalWork.g:1278:4: ( (lv_type_1_0= ruleCompound ) )
                    // InternalWork.g:1279:5: (lv_type_1_0= ruleCompound )
                    {
                    // InternalWork.g:1279:5: (lv_type_1_0= ruleCompound )
                    // InternalWork.g:1280:6: lv_type_1_0= ruleCompound
                    {

                    						newCompositeNode(grammarAccess.getStateObjectDefinitionAccess().getTypeCompoundParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_type_1_0=ruleCompound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateObjectDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"org.worklang.Work.Compound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWork.g:1298:3: ( (lv_state_2_0= ruleStateDefinition ) )
            // InternalWork.g:1299:4: (lv_state_2_0= ruleStateDefinition )
            {
            // InternalWork.g:1299:4: (lv_state_2_0= ruleStateDefinition )
            // InternalWork.g:1300:5: lv_state_2_0= ruleStateDefinition
            {

            					newCompositeNode(grammarAccess.getStateObjectDefinitionAccess().getStateStateDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_2_0=ruleStateDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateObjectDefinitionRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_2_0,
            						"org.worklang.Work.StateDefinition");
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
    // $ANTLR end "ruleStateObjectDefinition"


    // $ANTLR start "entryRuleTransitionObjectDefinition"
    // InternalWork.g:1321:1: entryRuleTransitionObjectDefinition returns [EObject current=null] : iv_ruleTransitionObjectDefinition= ruleTransitionObjectDefinition EOF ;
    public final EObject entryRuleTransitionObjectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionObjectDefinition = null;


        try {
            // InternalWork.g:1321:67: (iv_ruleTransitionObjectDefinition= ruleTransitionObjectDefinition EOF )
            // InternalWork.g:1322:2: iv_ruleTransitionObjectDefinition= ruleTransitionObjectDefinition EOF
            {
             newCompositeNode(grammarAccess.getTransitionObjectDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionObjectDefinition=ruleTransitionObjectDefinition();

            state._fsp--;

             current =iv_ruleTransitionObjectDefinition; 
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
    // $ANTLR end "entryRuleTransitionObjectDefinition"


    // $ANTLR start "ruleTransitionObjectDefinition"
    // InternalWork.g:1328:1: ruleTransitionObjectDefinition returns [EObject current=null] : ( ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) ) ( (lv_transition_2_0= ruleTransitionDefinition ) ) ) ;
    public final EObject ruleTransitionObjectDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_transition_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1334:2: ( ( ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) ) ( (lv_transition_2_0= ruleTransitionDefinition ) ) ) )
            // InternalWork.g:1335:2: ( ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) ) ( (lv_transition_2_0= ruleTransitionDefinition ) ) )
            {
            // InternalWork.g:1335:2: ( ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) ) ( (lv_transition_2_0= ruleTransitionDefinition ) ) )
            // InternalWork.g:1336:3: ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) ) ( (lv_transition_2_0= ruleTransitionDefinition ) )
            {
            // InternalWork.g:1336:3: ( ( (lv_type_0_0= rulePrimitive ) ) | ( (lv_type_1_0= ruleCompound ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            else if ( (LA24_0==24) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalWork.g:1337:4: ( (lv_type_0_0= rulePrimitive ) )
                    {
                    // InternalWork.g:1337:4: ( (lv_type_0_0= rulePrimitive ) )
                    // InternalWork.g:1338:5: (lv_type_0_0= rulePrimitive )
                    {
                    // InternalWork.g:1338:5: (lv_type_0_0= rulePrimitive )
                    // InternalWork.g:1339:6: lv_type_0_0= rulePrimitive
                    {

                    						newCompositeNode(grammarAccess.getTransitionObjectDefinitionAccess().getTypePrimitiveParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_type_0_0=rulePrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionObjectDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_0,
                    							"org.worklang.Work.Primitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWork.g:1357:4: ( (lv_type_1_0= ruleCompound ) )
                    {
                    // InternalWork.g:1357:4: ( (lv_type_1_0= ruleCompound ) )
                    // InternalWork.g:1358:5: (lv_type_1_0= ruleCompound )
                    {
                    // InternalWork.g:1358:5: (lv_type_1_0= ruleCompound )
                    // InternalWork.g:1359:6: lv_type_1_0= ruleCompound
                    {

                    						newCompositeNode(grammarAccess.getTransitionObjectDefinitionAccess().getTypeCompoundParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_type_1_0=ruleCompound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionObjectDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"org.worklang.Work.Compound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWork.g:1377:3: ( (lv_transition_2_0= ruleTransitionDefinition ) )
            // InternalWork.g:1378:4: (lv_transition_2_0= ruleTransitionDefinition )
            {
            // InternalWork.g:1378:4: (lv_transition_2_0= ruleTransitionDefinition )
            // InternalWork.g:1379:5: lv_transition_2_0= ruleTransitionDefinition
            {

            					newCompositeNode(grammarAccess.getTransitionObjectDefinitionAccess().getTransitionTransitionDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_transition_2_0=ruleTransitionDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionObjectDefinitionRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_2_0,
            						"org.worklang.Work.TransitionDefinition");
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
    // $ANTLR end "ruleTransitionObjectDefinition"


    // $ANTLR start "entryRuleStateDefinition"
    // InternalWork.g:1400:1: entryRuleStateDefinition returns [EObject current=null] : iv_ruleStateDefinition= ruleStateDefinition EOF ;
    public final EObject entryRuleStateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDefinition = null;


        try {
            // InternalWork.g:1400:56: (iv_ruleStateDefinition= ruleStateDefinition EOF )
            // InternalWork.g:1401:2: iv_ruleStateDefinition= ruleStateDefinition EOF
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
    // InternalWork.g:1407:1: ruleStateDefinition returns [EObject current=null] : ( ( (lv_object_0_0= ruleState ) ) ( (lv_state_1_0= ruleStateID ) ) ( (lv_withDefinition_2_0= ruleWithStatesDefinition ) )? ) ;
    public final EObject ruleStateDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_object_0_0 = null;

        EObject lv_state_1_0 = null;

        EObject lv_withDefinition_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1413:2: ( ( ( (lv_object_0_0= ruleState ) ) ( (lv_state_1_0= ruleStateID ) ) ( (lv_withDefinition_2_0= ruleWithStatesDefinition ) )? ) )
            // InternalWork.g:1414:2: ( ( (lv_object_0_0= ruleState ) ) ( (lv_state_1_0= ruleStateID ) ) ( (lv_withDefinition_2_0= ruleWithStatesDefinition ) )? )
            {
            // InternalWork.g:1414:2: ( ( (lv_object_0_0= ruleState ) ) ( (lv_state_1_0= ruleStateID ) ) ( (lv_withDefinition_2_0= ruleWithStatesDefinition ) )? )
            // InternalWork.g:1415:3: ( (lv_object_0_0= ruleState ) ) ( (lv_state_1_0= ruleStateID ) ) ( (lv_withDefinition_2_0= ruleWithStatesDefinition ) )?
            {
            // InternalWork.g:1415:3: ( (lv_object_0_0= ruleState ) )
            // InternalWork.g:1416:4: (lv_object_0_0= ruleState )
            {
            // InternalWork.g:1416:4: (lv_object_0_0= ruleState )
            // InternalWork.g:1417:5: lv_object_0_0= ruleState
            {

            					newCompositeNode(grammarAccess.getStateDefinitionAccess().getObjectStateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_object_0_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateDefinitionRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_0_0,
            						"org.worklang.Work.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:1434:3: ( (lv_state_1_0= ruleStateID ) )
            // InternalWork.g:1435:4: (lv_state_1_0= ruleStateID )
            {
            // InternalWork.g:1435:4: (lv_state_1_0= ruleStateID )
            // InternalWork.g:1436:5: lv_state_1_0= ruleStateID
            {

            					newCompositeNode(grammarAccess.getStateDefinitionAccess().getStateStateIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_state_1_0=ruleStateID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateDefinitionRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_1_0,
            						"org.worklang.Work.StateID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:1453:3: ( (lv_withDefinition_2_0= ruleWithStatesDefinition ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalWork.g:1454:4: (lv_withDefinition_2_0= ruleWithStatesDefinition )
                    {
                    // InternalWork.g:1454:4: (lv_withDefinition_2_0= ruleWithStatesDefinition )
                    // InternalWork.g:1455:5: lv_withDefinition_2_0= ruleWithStatesDefinition
                    {

                    					newCompositeNode(grammarAccess.getStateDefinitionAccess().getWithDefinitionWithStatesDefinitionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_withDefinition_2_0=ruleWithStatesDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStateDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"withDefinition",
                    						lv_withDefinition_2_0,
                    						"org.worklang.Work.WithStatesDefinition");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleStateDefinition"


    // $ANTLR start "entryRuleStateID"
    // InternalWork.g:1476:1: entryRuleStateID returns [EObject current=null] : iv_ruleStateID= ruleStateID EOF ;
    public final EObject entryRuleStateID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateID = null;


        try {
            // InternalWork.g:1476:48: (iv_ruleStateID= ruleStateID EOF )
            // InternalWork.g:1477:2: iv_ruleStateID= ruleStateID EOF
            {
             newCompositeNode(grammarAccess.getStateIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateID=ruleStateID();

            state._fsp--;

             current =iv_ruleStateID; 
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
    // $ANTLR end "entryRuleStateID"


    // $ANTLR start "ruleStateID"
    // InternalWork.g:1483:1: ruleStateID returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStateID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalWork.g:1489:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalWork.g:1490:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalWork.g:1490:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalWork.g:1491:3: (lv_name_0_0= RULE_ID )
            {
            // InternalWork.g:1491:3: (lv_name_0_0= RULE_ID )
            // InternalWork.g:1492:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStateIDAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStateIDRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleStateID"


    // $ANTLR start "entryRuleWithStatesDefinition"
    // InternalWork.g:1511:1: entryRuleWithStatesDefinition returns [EObject current=null] : iv_ruleWithStatesDefinition= ruleWithStatesDefinition EOF ;
    public final EObject entryRuleWithStatesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithStatesDefinition = null;


        try {
            // InternalWork.g:1511:61: (iv_ruleWithStatesDefinition= ruleWithStatesDefinition EOF )
            // InternalWork.g:1512:2: iv_ruleWithStatesDefinition= ruleWithStatesDefinition EOF
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
    // InternalWork.g:1518:1: ruleWithStatesDefinition returns [EObject current=null] : ( ( (lv_composition_0_0= ruleWith ) ) otherlv_1= '{' ( (lv_predicate_2_0= rulePredicate ) ) otherlv_3= '}' ) ;
    public final EObject ruleWithStatesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_composition_0_0 = null;

        EObject lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1524:2: ( ( ( (lv_composition_0_0= ruleWith ) ) otherlv_1= '{' ( (lv_predicate_2_0= rulePredicate ) ) otherlv_3= '}' ) )
            // InternalWork.g:1525:2: ( ( (lv_composition_0_0= ruleWith ) ) otherlv_1= '{' ( (lv_predicate_2_0= rulePredicate ) ) otherlv_3= '}' )
            {
            // InternalWork.g:1525:2: ( ( (lv_composition_0_0= ruleWith ) ) otherlv_1= '{' ( (lv_predicate_2_0= rulePredicate ) ) otherlv_3= '}' )
            // InternalWork.g:1526:3: ( (lv_composition_0_0= ruleWith ) ) otherlv_1= '{' ( (lv_predicate_2_0= rulePredicate ) ) otherlv_3= '}'
            {
            // InternalWork.g:1526:3: ( (lv_composition_0_0= ruleWith ) )
            // InternalWork.g:1527:4: (lv_composition_0_0= ruleWith )
            {
            // InternalWork.g:1527:4: (lv_composition_0_0= ruleWith )
            // InternalWork.g:1528:5: lv_composition_0_0= ruleWith
            {

            					newCompositeNode(grammarAccess.getWithStatesDefinitionAccess().getCompositionWithParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_composition_0_0=ruleWith();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithStatesDefinitionRule());
            					}
            					set(
            						current,
            						"composition",
            						lv_composition_0_0,
            						"org.worklang.Work.With");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getWithStatesDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWork.g:1549:3: ( (lv_predicate_2_0= rulePredicate ) )
            // InternalWork.g:1550:4: (lv_predicate_2_0= rulePredicate )
            {
            // InternalWork.g:1550:4: (lv_predicate_2_0= rulePredicate )
            // InternalWork.g:1551:5: lv_predicate_2_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getWithStatesDefinitionAccess().getPredicatePredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleWithTransitionsDefinition"
    // InternalWork.g:1576:1: entryRuleWithTransitionsDefinition returns [EObject current=null] : iv_ruleWithTransitionsDefinition= ruleWithTransitionsDefinition EOF ;
    public final EObject entryRuleWithTransitionsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithTransitionsDefinition = null;


        try {
            // InternalWork.g:1576:66: (iv_ruleWithTransitionsDefinition= ruleWithTransitionsDefinition EOF )
            // InternalWork.g:1577:2: iv_ruleWithTransitionsDefinition= ruleWithTransitionsDefinition EOF
            {
             newCompositeNode(grammarAccess.getWithTransitionsDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWithTransitionsDefinition=ruleWithTransitionsDefinition();

            state._fsp--;

             current =iv_ruleWithTransitionsDefinition; 
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
    // $ANTLR end "entryRuleWithTransitionsDefinition"


    // $ANTLR start "ruleWithTransitionsDefinition"
    // InternalWork.g:1583:1: ruleWithTransitionsDefinition returns [EObject current=null] : ( ( (lv_composition_0_0= ruleWith ) ) otherlv_1= '{' ( (lv_transitions_2_0= ruleTransitionalExpression ) ) otherlv_3= '}' ) ;
    public final EObject ruleWithTransitionsDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_composition_0_0 = null;

        EObject lv_transitions_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1589:2: ( ( ( (lv_composition_0_0= ruleWith ) ) otherlv_1= '{' ( (lv_transitions_2_0= ruleTransitionalExpression ) ) otherlv_3= '}' ) )
            // InternalWork.g:1590:2: ( ( (lv_composition_0_0= ruleWith ) ) otherlv_1= '{' ( (lv_transitions_2_0= ruleTransitionalExpression ) ) otherlv_3= '}' )
            {
            // InternalWork.g:1590:2: ( ( (lv_composition_0_0= ruleWith ) ) otherlv_1= '{' ( (lv_transitions_2_0= ruleTransitionalExpression ) ) otherlv_3= '}' )
            // InternalWork.g:1591:3: ( (lv_composition_0_0= ruleWith ) ) otherlv_1= '{' ( (lv_transitions_2_0= ruleTransitionalExpression ) ) otherlv_3= '}'
            {
            // InternalWork.g:1591:3: ( (lv_composition_0_0= ruleWith ) )
            // InternalWork.g:1592:4: (lv_composition_0_0= ruleWith )
            {
            // InternalWork.g:1592:4: (lv_composition_0_0= ruleWith )
            // InternalWork.g:1593:5: lv_composition_0_0= ruleWith
            {

            					newCompositeNode(grammarAccess.getWithTransitionsDefinitionAccess().getCompositionWithParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_composition_0_0=ruleWith();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithTransitionsDefinitionRule());
            					}
            					set(
            						current,
            						"composition",
            						lv_composition_0_0,
            						"org.worklang.Work.With");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getWithTransitionsDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWork.g:1614:3: ( (lv_transitions_2_0= ruleTransitionalExpression ) )
            // InternalWork.g:1615:4: (lv_transitions_2_0= ruleTransitionalExpression )
            {
            // InternalWork.g:1615:4: (lv_transitions_2_0= ruleTransitionalExpression )
            // InternalWork.g:1616:5: lv_transitions_2_0= ruleTransitionalExpression
            {

            					newCompositeNode(grammarAccess.getWithTransitionsDefinitionAccess().getTransitionsTransitionalExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_transitions_2_0=ruleTransitionalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithTransitionsDefinitionRule());
            					}
            					set(
            						current,
            						"transitions",
            						lv_transitions_2_0,
            						"org.worklang.Work.TransitionalExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getWithTransitionsDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleWithTransitionsDefinition"


    // $ANTLR start "entryRuleReferenceState"
    // InternalWork.g:1641:1: entryRuleReferenceState returns [EObject current=null] : iv_ruleReferenceState= ruleReferenceState EOF ;
    public final EObject entryRuleReferenceState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceState = null;


        try {
            // InternalWork.g:1641:55: (iv_ruleReferenceState= ruleReferenceState EOF )
            // InternalWork.g:1642:2: iv_ruleReferenceState= ruleReferenceState EOF
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
    // InternalWork.g:1648:1: ruleReferenceState returns [EObject current=null] : ( ( (lv_object_0_0= ruleState ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_from_2_0= ruleFromFieldDefinition ) ) ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_state_5_0= ruleStateID ) ) )? ( (lv_composition_6_0= ruleWithStatesDefinition ) )? ) ;
    public final EObject ruleReferenceState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_object_0_0 = null;

        EObject lv_from_2_0 = null;

        EObject lv_state_5_0 = null;

        EObject lv_composition_6_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1654:2: ( ( ( (lv_object_0_0= ruleState ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_from_2_0= ruleFromFieldDefinition ) ) ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_state_5_0= ruleStateID ) ) )? ( (lv_composition_6_0= ruleWithStatesDefinition ) )? ) )
            // InternalWork.g:1655:2: ( ( (lv_object_0_0= ruleState ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_from_2_0= ruleFromFieldDefinition ) ) ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_state_5_0= ruleStateID ) ) )? ( (lv_composition_6_0= ruleWithStatesDefinition ) )? )
            {
            // InternalWork.g:1655:2: ( ( (lv_object_0_0= ruleState ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_from_2_0= ruleFromFieldDefinition ) ) ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_state_5_0= ruleStateID ) ) )? ( (lv_composition_6_0= ruleWithStatesDefinition ) )? )
            // InternalWork.g:1656:3: ( (lv_object_0_0= ruleState ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_from_2_0= ruleFromFieldDefinition ) ) ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_state_5_0= ruleStateID ) ) )? ( (lv_composition_6_0= ruleWithStatesDefinition ) )?
            {
            // InternalWork.g:1656:3: ( (lv_object_0_0= ruleState ) )
            // InternalWork.g:1657:4: (lv_object_0_0= ruleState )
            {
            // InternalWork.g:1657:4: (lv_object_0_0= ruleState )
            // InternalWork.g:1658:5: lv_object_0_0= ruleState
            {

            					newCompositeNode(grammarAccess.getReferenceStateAccess().getObjectStateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_object_0_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceStateRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_0_0,
            						"org.worklang.Work.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:1675:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:1676:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:1676:4: (otherlv_1= RULE_ID )
            // InternalWork.g:1677:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceStateRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getReferenceStateAccess().getRefStateStateIDCrossReference_1_0());
            				

            }


            }

            // InternalWork.g:1688:3: ( (lv_from_2_0= ruleFromFieldDefinition ) )
            // InternalWork.g:1689:4: (lv_from_2_0= ruleFromFieldDefinition )
            {
            // InternalWork.g:1689:4: (lv_from_2_0= ruleFromFieldDefinition )
            // InternalWork.g:1690:5: lv_from_2_0= ruleFromFieldDefinition
            {

            					newCompositeNode(grammarAccess.getReferenceStateAccess().getFromFromFieldDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_from_2_0=ruleFromFieldDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceStateRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_2_0,
            						"org.worklang.Work.FromFieldDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:1707:3: ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_state_5_0= ruleStateID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=21 && LA27_0<=22)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalWork.g:1708:4: (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_state_5_0= ruleStateID ) )
                    {
                    // InternalWork.g:1708:4: (otherlv_3= 'called' | otherlv_4= 'as' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==21) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==22) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalWork.g:1709:5: otherlv_3= 'called'
                            {
                            otherlv_3=(Token)match(input,21,FOLLOW_7); 

                            					newLeafNode(otherlv_3, grammarAccess.getReferenceStateAccess().getCalledKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalWork.g:1714:5: otherlv_4= 'as'
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_7); 

                            					newLeafNode(otherlv_4, grammarAccess.getReferenceStateAccess().getAsKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalWork.g:1719:4: ( (lv_state_5_0= ruleStateID ) )
                    // InternalWork.g:1720:5: (lv_state_5_0= ruleStateID )
                    {
                    // InternalWork.g:1720:5: (lv_state_5_0= ruleStateID )
                    // InternalWork.g:1721:6: lv_state_5_0= ruleStateID
                    {

                    						newCompositeNode(grammarAccess.getReferenceStateAccess().getStateStateIDParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_state_5_0=ruleStateID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceStateRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_5_0,
                    							"org.worklang.Work.StateID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWork.g:1739:3: ( (lv_composition_6_0= ruleWithStatesDefinition ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalWork.g:1740:4: (lv_composition_6_0= ruleWithStatesDefinition )
                    {
                    // InternalWork.g:1740:4: (lv_composition_6_0= ruleWithStatesDefinition )
                    // InternalWork.g:1741:5: lv_composition_6_0= ruleWithStatesDefinition
                    {

                    					newCompositeNode(grammarAccess.getReferenceStateAccess().getCompositionWithStatesDefinitionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_composition_6_0=ruleWithStatesDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReferenceStateRule());
                    					}
                    					set(
                    						current,
                    						"composition",
                    						lv_composition_6_0,
                    						"org.worklang.Work.WithStatesDefinition");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleReferenceState"


    // $ANTLR start "entryRuleTransitionDefinition"
    // InternalWork.g:1762:1: entryRuleTransitionDefinition returns [EObject current=null] : iv_ruleTransitionDefinition= ruleTransitionDefinition EOF ;
    public final EObject entryRuleTransitionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDefinition = null;


        try {
            // InternalWork.g:1762:61: (iv_ruleTransitionDefinition= ruleTransitionDefinition EOF )
            // InternalWork.g:1763:2: iv_ruleTransitionDefinition= ruleTransitionDefinition EOF
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
    // InternalWork.g:1769:1: ruleTransitionDefinition returns [EObject current=null] : ( ( (lv_object_0_0= ruleTransition ) ) ( (lv_transition_1_0= ruleTransitionID ) ) ( (lv_in_2_0= ruleInputDefinition ) )? ( (lv_out_3_0= ruleOutputDefinition ) ) ( (lv_composition_4_0= ruleWithTransitionsDefinition ) )? ) ;
    public final EObject ruleTransitionDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_object_0_0 = null;

        EObject lv_transition_1_0 = null;

        EObject lv_in_2_0 = null;

        EObject lv_out_3_0 = null;

        EObject lv_composition_4_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1775:2: ( ( ( (lv_object_0_0= ruleTransition ) ) ( (lv_transition_1_0= ruleTransitionID ) ) ( (lv_in_2_0= ruleInputDefinition ) )? ( (lv_out_3_0= ruleOutputDefinition ) ) ( (lv_composition_4_0= ruleWithTransitionsDefinition ) )? ) )
            // InternalWork.g:1776:2: ( ( (lv_object_0_0= ruleTransition ) ) ( (lv_transition_1_0= ruleTransitionID ) ) ( (lv_in_2_0= ruleInputDefinition ) )? ( (lv_out_3_0= ruleOutputDefinition ) ) ( (lv_composition_4_0= ruleWithTransitionsDefinition ) )? )
            {
            // InternalWork.g:1776:2: ( ( (lv_object_0_0= ruleTransition ) ) ( (lv_transition_1_0= ruleTransitionID ) ) ( (lv_in_2_0= ruleInputDefinition ) )? ( (lv_out_3_0= ruleOutputDefinition ) ) ( (lv_composition_4_0= ruleWithTransitionsDefinition ) )? )
            // InternalWork.g:1777:3: ( (lv_object_0_0= ruleTransition ) ) ( (lv_transition_1_0= ruleTransitionID ) ) ( (lv_in_2_0= ruleInputDefinition ) )? ( (lv_out_3_0= ruleOutputDefinition ) ) ( (lv_composition_4_0= ruleWithTransitionsDefinition ) )?
            {
            // InternalWork.g:1777:3: ( (lv_object_0_0= ruleTransition ) )
            // InternalWork.g:1778:4: (lv_object_0_0= ruleTransition )
            {
            // InternalWork.g:1778:4: (lv_object_0_0= ruleTransition )
            // InternalWork.g:1779:5: lv_object_0_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getObjectTransitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_object_0_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionDefinitionRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_0_0,
            						"org.worklang.Work.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:1796:3: ( (lv_transition_1_0= ruleTransitionID ) )
            // InternalWork.g:1797:4: (lv_transition_1_0= ruleTransitionID )
            {
            // InternalWork.g:1797:4: (lv_transition_1_0= ruleTransitionID )
            // InternalWork.g:1798:5: lv_transition_1_0= ruleTransitionID
            {

            					newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getTransitionTransitionIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
            lv_transition_1_0=ruleTransitionID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionDefinitionRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_1_0,
            						"org.worklang.Work.TransitionID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:1815:3: ( (lv_in_2_0= ruleInputDefinition ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalWork.g:1816:4: (lv_in_2_0= ruleInputDefinition )
                    {
                    // InternalWork.g:1816:4: (lv_in_2_0= ruleInputDefinition )
                    // InternalWork.g:1817:5: lv_in_2_0= ruleInputDefinition
                    {

                    					newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getInInputDefinitionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_37);
                    lv_in_2_0=ruleInputDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransitionDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"in",
                    						lv_in_2_0,
                    						"org.worklang.Work.InputDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:1834:3: ( (lv_out_3_0= ruleOutputDefinition ) )
            // InternalWork.g:1835:4: (lv_out_3_0= ruleOutputDefinition )
            {
            // InternalWork.g:1835:4: (lv_out_3_0= ruleOutputDefinition )
            // InternalWork.g:1836:5: lv_out_3_0= ruleOutputDefinition
            {

            					newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getOutOutputDefinitionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
            lv_out_3_0=ruleOutputDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionDefinitionRule());
            					}
            					set(
            						current,
            						"out",
            						lv_out_3_0,
            						"org.worklang.Work.OutputDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:1853:3: ( (lv_composition_4_0= ruleWithTransitionsDefinition ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalWork.g:1854:4: (lv_composition_4_0= ruleWithTransitionsDefinition )
                    {
                    // InternalWork.g:1854:4: (lv_composition_4_0= ruleWithTransitionsDefinition )
                    // InternalWork.g:1855:5: lv_composition_4_0= ruleWithTransitionsDefinition
                    {

                    					newCompositeNode(grammarAccess.getTransitionDefinitionAccess().getCompositionWithTransitionsDefinitionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_composition_4_0=ruleWithTransitionsDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransitionDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"composition",
                    						lv_composition_4_0,
                    						"org.worklang.Work.WithTransitionsDefinition");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleTransitionDefinition"


    // $ANTLR start "entryRuleTransitionID"
    // InternalWork.g:1876:1: entryRuleTransitionID returns [EObject current=null] : iv_ruleTransitionID= ruleTransitionID EOF ;
    public final EObject entryRuleTransitionID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionID = null;


        try {
            // InternalWork.g:1876:53: (iv_ruleTransitionID= ruleTransitionID EOF )
            // InternalWork.g:1877:2: iv_ruleTransitionID= ruleTransitionID EOF
            {
             newCompositeNode(grammarAccess.getTransitionIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionID=ruleTransitionID();

            state._fsp--;

             current =iv_ruleTransitionID; 
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
    // $ANTLR end "entryRuleTransitionID"


    // $ANTLR start "ruleTransitionID"
    // InternalWork.g:1883:1: ruleTransitionID returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTransitionID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalWork.g:1889:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalWork.g:1890:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalWork.g:1890:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalWork.g:1891:3: (lv_name_0_0= RULE_ID )
            {
            // InternalWork.g:1891:3: (lv_name_0_0= RULE_ID )
            // InternalWork.g:1892:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTransitionIDAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTransitionIDRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleTransitionID"


    // $ANTLR start "entryRuleReferenceTransition"
    // InternalWork.g:1911:1: entryRuleReferenceTransition returns [EObject current=null] : iv_ruleReferenceTransition= ruleReferenceTransition EOF ;
    public final EObject entryRuleReferenceTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTransition = null;


        try {
            // InternalWork.g:1911:60: (iv_ruleReferenceTransition= ruleReferenceTransition EOF )
            // InternalWork.g:1912:2: iv_ruleReferenceTransition= ruleReferenceTransition EOF
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
    // InternalWork.g:1918:1: ruleReferenceTransition returns [EObject current=null] : ( ( (lv_object_0_0= ruleTransition ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_fromDef_2_0= ruleFromFieldDefinition ) ) ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_transition_5_0= ruleTransitionID ) ) )? ( (lv_composition_6_0= ruleWithTransitionsDefinition ) )? ) ;
    public final EObject ruleReferenceTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_object_0_0 = null;

        EObject lv_fromDef_2_0 = null;

        EObject lv_transition_5_0 = null;

        EObject lv_composition_6_0 = null;



        	enterRule();

        try {
            // InternalWork.g:1924:2: ( ( ( (lv_object_0_0= ruleTransition ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_fromDef_2_0= ruleFromFieldDefinition ) ) ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_transition_5_0= ruleTransitionID ) ) )? ( (lv_composition_6_0= ruleWithTransitionsDefinition ) )? ) )
            // InternalWork.g:1925:2: ( ( (lv_object_0_0= ruleTransition ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_fromDef_2_0= ruleFromFieldDefinition ) ) ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_transition_5_0= ruleTransitionID ) ) )? ( (lv_composition_6_0= ruleWithTransitionsDefinition ) )? )
            {
            // InternalWork.g:1925:2: ( ( (lv_object_0_0= ruleTransition ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_fromDef_2_0= ruleFromFieldDefinition ) ) ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_transition_5_0= ruleTransitionID ) ) )? ( (lv_composition_6_0= ruleWithTransitionsDefinition ) )? )
            // InternalWork.g:1926:3: ( (lv_object_0_0= ruleTransition ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_fromDef_2_0= ruleFromFieldDefinition ) ) ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_transition_5_0= ruleTransitionID ) ) )? ( (lv_composition_6_0= ruleWithTransitionsDefinition ) )?
            {
            // InternalWork.g:1926:3: ( (lv_object_0_0= ruleTransition ) )
            // InternalWork.g:1927:4: (lv_object_0_0= ruleTransition )
            {
            // InternalWork.g:1927:4: (lv_object_0_0= ruleTransition )
            // InternalWork.g:1928:5: lv_object_0_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getReferenceTransitionAccess().getObjectTransitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_object_0_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceTransitionRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_0_0,
            						"org.worklang.Work.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:1945:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:1946:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:1946:4: (otherlv_1= RULE_ID )
            // InternalWork.g:1947:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceTransitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getReferenceTransitionAccess().getRefTransitionTransitionIDCrossReference_1_0());
            				

            }


            }

            // InternalWork.g:1958:3: ( (lv_fromDef_2_0= ruleFromFieldDefinition ) )
            // InternalWork.g:1959:4: (lv_fromDef_2_0= ruleFromFieldDefinition )
            {
            // InternalWork.g:1959:4: (lv_fromDef_2_0= ruleFromFieldDefinition )
            // InternalWork.g:1960:5: lv_fromDef_2_0= ruleFromFieldDefinition
            {

            					newCompositeNode(grammarAccess.getReferenceTransitionAccess().getFromDefFromFieldDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_fromDef_2_0=ruleFromFieldDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceTransitionRule());
            					}
            					set(
            						current,
            						"fromDef",
            						lv_fromDef_2_0,
            						"org.worklang.Work.FromFieldDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:1977:3: ( (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_transition_5_0= ruleTransitionID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=21 && LA32_0<=22)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalWork.g:1978:4: (otherlv_3= 'called' | otherlv_4= 'as' ) ( (lv_transition_5_0= ruleTransitionID ) )
                    {
                    // InternalWork.g:1978:4: (otherlv_3= 'called' | otherlv_4= 'as' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==21) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==22) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalWork.g:1979:5: otherlv_3= 'called'
                            {
                            otherlv_3=(Token)match(input,21,FOLLOW_7); 

                            					newLeafNode(otherlv_3, grammarAccess.getReferenceTransitionAccess().getCalledKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalWork.g:1984:5: otherlv_4= 'as'
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_7); 

                            					newLeafNode(otherlv_4, grammarAccess.getReferenceTransitionAccess().getAsKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalWork.g:1989:4: ( (lv_transition_5_0= ruleTransitionID ) )
                    // InternalWork.g:1990:5: (lv_transition_5_0= ruleTransitionID )
                    {
                    // InternalWork.g:1990:5: (lv_transition_5_0= ruleTransitionID )
                    // InternalWork.g:1991:6: lv_transition_5_0= ruleTransitionID
                    {

                    						newCompositeNode(grammarAccess.getReferenceTransitionAccess().getTransitionTransitionIDParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_transition_5_0=ruleTransitionID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceTransitionRule());
                    						}
                    						set(
                    							current,
                    							"transition",
                    							lv_transition_5_0,
                    							"org.worklang.Work.TransitionID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWork.g:2009:3: ( (lv_composition_6_0= ruleWithTransitionsDefinition ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalWork.g:2010:4: (lv_composition_6_0= ruleWithTransitionsDefinition )
                    {
                    // InternalWork.g:2010:4: (lv_composition_6_0= ruleWithTransitionsDefinition )
                    // InternalWork.g:2011:5: lv_composition_6_0= ruleWithTransitionsDefinition
                    {

                    					newCompositeNode(grammarAccess.getReferenceTransitionAccess().getCompositionWithTransitionsDefinitionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_composition_6_0=ruleWithTransitionsDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReferenceTransitionRule());
                    					}
                    					set(
                    						current,
                    						"composition",
                    						lv_composition_6_0,
                    						"org.worklang.Work.WithTransitionsDefinition");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleReferenceTransition"


    // $ANTLR start "entryRuleFromFieldDefinition"
    // InternalWork.g:2032:1: entryRuleFromFieldDefinition returns [EObject current=null] : iv_ruleFromFieldDefinition= ruleFromFieldDefinition EOF ;
    public final EObject entryRuleFromFieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromFieldDefinition = null;


        try {
            // InternalWork.g:2032:60: (iv_ruleFromFieldDefinition= ruleFromFieldDefinition EOF )
            // InternalWork.g:2033:2: iv_ruleFromFieldDefinition= ruleFromFieldDefinition EOF
            {
             newCompositeNode(grammarAccess.getFromFieldDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFromFieldDefinition=ruleFromFieldDefinition();

            state._fsp--;

             current =iv_ruleFromFieldDefinition; 
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
    // $ANTLR end "entryRuleFromFieldDefinition"


    // $ANTLR start "ruleFromFieldDefinition"
    // InternalWork.g:2039:1: ruleFromFieldDefinition returns [EObject current=null] : ( ( (lv_from_0_0= ruleFrom ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleFromFieldDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_from_0_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2045:2: ( ( ( (lv_from_0_0= ruleFrom ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalWork.g:2046:2: ( ( (lv_from_0_0= ruleFrom ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalWork.g:2046:2: ( ( (lv_from_0_0= ruleFrom ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalWork.g:2047:3: ( (lv_from_0_0= ruleFrom ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalWork.g:2047:3: ( (lv_from_0_0= ruleFrom ) )
            // InternalWork.g:2048:4: (lv_from_0_0= ruleFrom )
            {
            // InternalWork.g:2048:4: (lv_from_0_0= ruleFrom )
            // InternalWork.g:2049:5: lv_from_0_0= ruleFrom
            {

            					newCompositeNode(grammarAccess.getFromFieldDefinitionAccess().getFromFromParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_from_0_0=ruleFrom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFromFieldDefinitionRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_0_0,
            						"org.worklang.Work.From");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:2066:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:2067:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:2067:4: (otherlv_1= RULE_ID )
            // InternalWork.g:2068:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFromFieldDefinitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getFromFieldDefinitionAccess().getRefSpaceSpaceCrossReference_1_0());
            				

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
    // $ANTLR end "ruleFromFieldDefinition"


    // $ANTLR start "entryRuleInputDefinition"
    // InternalWork.g:2083:1: entryRuleInputDefinition returns [EObject current=null] : iv_ruleInputDefinition= ruleInputDefinition EOF ;
    public final EObject entryRuleInputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDefinition = null;


        try {
            // InternalWork.g:2083:56: (iv_ruleInputDefinition= ruleInputDefinition EOF )
            // InternalWork.g:2084:2: iv_ruleInputDefinition= ruleInputDefinition EOF
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
    // InternalWork.g:2090:1: ruleInputDefinition returns [EObject current=null] : ( ( (lv_input_0_0= ruleInput ) ) ( (otherlv_1= RULE_ID ) )* ) ;
    public final EObject ruleInputDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_input_0_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2096:2: ( ( ( (lv_input_0_0= ruleInput ) ) ( (otherlv_1= RULE_ID ) )* ) )
            // InternalWork.g:2097:2: ( ( (lv_input_0_0= ruleInput ) ) ( (otherlv_1= RULE_ID ) )* )
            {
            // InternalWork.g:2097:2: ( ( (lv_input_0_0= ruleInput ) ) ( (otherlv_1= RULE_ID ) )* )
            // InternalWork.g:2098:3: ( (lv_input_0_0= ruleInput ) ) ( (otherlv_1= RULE_ID ) )*
            {
            // InternalWork.g:2098:3: ( (lv_input_0_0= ruleInput ) )
            // InternalWork.g:2099:4: (lv_input_0_0= ruleInput )
            {
            // InternalWork.g:2099:4: (lv_input_0_0= ruleInput )
            // InternalWork.g:2100:5: lv_input_0_0= ruleInput
            {

            					newCompositeNode(grammarAccess.getInputDefinitionAccess().getInputInputParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_input_0_0=ruleInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputDefinitionRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"org.worklang.Work.Input");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:2117:3: ( (otherlv_1= RULE_ID ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalWork.g:2118:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalWork.g:2118:4: (otherlv_1= RULE_ID )
            	    // InternalWork.g:2119:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getInputDefinitionRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    					newLeafNode(otherlv_1, grammarAccess.getInputDefinitionAccess().getInputStateStateIDCrossReference_1_0());
            	    				

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
    // $ANTLR end "ruleInputDefinition"


    // $ANTLR start "entryRuleOutputDefinition"
    // InternalWork.g:2134:1: entryRuleOutputDefinition returns [EObject current=null] : iv_ruleOutputDefinition= ruleOutputDefinition EOF ;
    public final EObject entryRuleOutputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDefinition = null;


        try {
            // InternalWork.g:2134:57: (iv_ruleOutputDefinition= ruleOutputDefinition EOF )
            // InternalWork.g:2135:2: iv_ruleOutputDefinition= ruleOutputDefinition EOF
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
    // InternalWork.g:2141:1: ruleOutputDefinition returns [EObject current=null] : ( ( (lv_output_0_0= ruleOutput ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleOutputDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_output_0_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2147:2: ( ( ( (lv_output_0_0= ruleOutput ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalWork.g:2148:2: ( ( (lv_output_0_0= ruleOutput ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalWork.g:2148:2: ( ( (lv_output_0_0= ruleOutput ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalWork.g:2149:3: ( (lv_output_0_0= ruleOutput ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalWork.g:2149:3: ( (lv_output_0_0= ruleOutput ) )
            // InternalWork.g:2150:4: (lv_output_0_0= ruleOutput )
            {
            // InternalWork.g:2150:4: (lv_output_0_0= ruleOutput )
            // InternalWork.g:2151:5: lv_output_0_0= ruleOutput
            {

            					newCompositeNode(grammarAccess.getOutputDefinitionAccess().getOutputOutputParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_output_0_0=ruleOutput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputDefinitionRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_0_0,
            						"org.worklang.Work.Output");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:2168:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:2169:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:2169:4: (otherlv_1= RULE_ID )
            // InternalWork.g:2170:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputDefinitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getOutputDefinitionAccess().getOutputStateStateIDCrossReference_1_0());
            				

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


    // $ANTLR start "entryRuleExtendsDefinition"
    // InternalWork.g:2185:1: entryRuleExtendsDefinition returns [EObject current=null] : iv_ruleExtendsDefinition= ruleExtendsDefinition EOF ;
    public final EObject entryRuleExtendsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsDefinition = null;


        try {
            // InternalWork.g:2185:58: (iv_ruleExtendsDefinition= ruleExtendsDefinition EOF )
            // InternalWork.g:2186:2: iv_ruleExtendsDefinition= ruleExtendsDefinition EOF
            {
             newCompositeNode(grammarAccess.getExtendsDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtendsDefinition=ruleExtendsDefinition();

            state._fsp--;

             current =iv_ruleExtendsDefinition; 
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
    // $ANTLR end "entryRuleExtendsDefinition"


    // $ANTLR start "ruleExtendsDefinition"
    // InternalWork.g:2192:1: ruleExtendsDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleExtends ) ) ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleExtendsDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2198:2: ( ( ( (lv_type_0_0= ruleExtends ) ) ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalWork.g:2199:2: ( ( (lv_type_0_0= ruleExtends ) ) ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalWork.g:2199:2: ( ( (lv_type_0_0= ruleExtends ) ) ( (otherlv_1= RULE_ID ) )+ )
            // InternalWork.g:2200:3: ( (lv_type_0_0= ruleExtends ) ) ( (otherlv_1= RULE_ID ) )+
            {
            // InternalWork.g:2200:3: ( (lv_type_0_0= ruleExtends ) )
            // InternalWork.g:2201:4: (lv_type_0_0= ruleExtends )
            {
            // InternalWork.g:2201:4: (lv_type_0_0= ruleExtends )
            // InternalWork.g:2202:5: lv_type_0_0= ruleExtends
            {

            					newCompositeNode(grammarAccess.getExtendsDefinitionAccess().getTypeExtendsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_0_0=ruleExtends();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtendsDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.worklang.Work.Extends");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:2219:3: ( (otherlv_1= RULE_ID ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalWork.g:2220:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalWork.g:2220:4: (otherlv_1= RULE_ID )
            	    // InternalWork.g:2221:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getExtendsDefinitionRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    					newLeafNode(otherlv_1, grammarAccess.getExtendsDefinitionAccess().getNamespacesSpaceCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
    // $ANTLR end "ruleExtendsDefinition"


    // $ANTLR start "entryRulePrimitive"
    // InternalWork.g:2236:1: entryRulePrimitive returns [String current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final String entryRulePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitive = null;


        try {
            // InternalWork.g:2236:49: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalWork.g:2237:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive.getText(); 
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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalWork.g:2243:1: rulePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'primitive' ;
    public final AntlrDatatypeRuleToken rulePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2249:2: (kw= 'primitive' )
            // InternalWork.g:2250:2: kw= 'primitive'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPrimitiveAccess().getPrimitiveKeyword());
            	

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleCompound"
    // InternalWork.g:2258:1: entryRuleCompound returns [String current=null] : iv_ruleCompound= ruleCompound EOF ;
    public final String entryRuleCompound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompound = null;


        try {
            // InternalWork.g:2258:48: (iv_ruleCompound= ruleCompound EOF )
            // InternalWork.g:2259:2: iv_ruleCompound= ruleCompound EOF
            {
             newCompositeNode(grammarAccess.getCompoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompound=ruleCompound();

            state._fsp--;

             current =iv_ruleCompound.getText(); 
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
    // $ANTLR end "entryRuleCompound"


    // $ANTLR start "ruleCompound"
    // InternalWork.g:2265:1: ruleCompound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'compound' ;
    public final AntlrDatatypeRuleToken ruleCompound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2271:2: (kw= 'compound' )
            // InternalWork.g:2272:2: kw= 'compound'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCompoundAccess().getCompoundKeyword());
            	

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
    // $ANTLR end "ruleCompound"


    // $ANTLR start "entryRuleField"
    // InternalWork.g:2280:1: entryRuleField returns [String current=null] : iv_ruleField= ruleField EOF ;
    public final String entryRuleField() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleField = null;


        try {
            // InternalWork.g:2280:45: (iv_ruleField= ruleField EOF )
            // InternalWork.g:2281:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField.getText(); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalWork.g:2287:1: ruleField returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'field' ;
    public final AntlrDatatypeRuleToken ruleField() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2293:2: (kw= 'field' )
            // InternalWork.g:2294:2: kw= 'field'
            {
            kw=(Token)match(input,25,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFieldAccess().getFieldKeyword());
            	

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleState"
    // InternalWork.g:2302:1: entryRuleState returns [String current=null] : iv_ruleState= ruleState EOF ;
    public final String entryRuleState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState = null;


        try {
            // InternalWork.g:2302:45: (iv_ruleState= ruleState EOF )
            // InternalWork.g:2303:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState.getText(); 
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
    // InternalWork.g:2309:1: ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'state' ;
    public final AntlrDatatypeRuleToken ruleState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2315:2: (kw= 'state' )
            // InternalWork.g:2316:2: kw= 'state'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getStateAccess().getStateKeyword());
            	

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
    // InternalWork.g:2324:1: entryRuleTransition returns [String current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final String entryRuleTransition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTransition = null;


        try {
            // InternalWork.g:2324:50: (iv_ruleTransition= ruleTransition EOF )
            // InternalWork.g:2325:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition.getText(); 
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
    // InternalWork.g:2331:1: ruleTransition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'transition' ;
    public final AntlrDatatypeRuleToken ruleTransition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2337:2: (kw= 'transition' )
            // InternalWork.g:2338:2: kw= 'transition'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTransitionAccess().getTransitionKeyword());
            	

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


    // $ANTLR start "entryRuleDefinitions"
    // InternalWork.g:2346:1: entryRuleDefinitions returns [String current=null] : iv_ruleDefinitions= ruleDefinitions EOF ;
    public final String entryRuleDefinitions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefinitions = null;


        try {
            // InternalWork.g:2346:51: (iv_ruleDefinitions= ruleDefinitions EOF )
            // InternalWork.g:2347:2: iv_ruleDefinitions= ruleDefinitions EOF
            {
             newCompositeNode(grammarAccess.getDefinitionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitions=ruleDefinitions();

            state._fsp--;

             current =iv_ruleDefinitions.getText(); 
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
    // $ANTLR end "entryRuleDefinitions"


    // $ANTLR start "ruleDefinitions"
    // InternalWork.g:2353:1: ruleDefinitions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'definitions' ;
    public final AntlrDatatypeRuleToken ruleDefinitions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2359:2: (kw= 'definitions' )
            // InternalWork.g:2360:2: kw= 'definitions'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDefinitionsAccess().getDefinitionsKeyword());
            	

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
    // $ANTLR end "ruleDefinitions"


    // $ANTLR start "entryRuleReferences"
    // InternalWork.g:2368:1: entryRuleReferences returns [String current=null] : iv_ruleReferences= ruleReferences EOF ;
    public final String entryRuleReferences() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReferences = null;


        try {
            // InternalWork.g:2368:50: (iv_ruleReferences= ruleReferences EOF )
            // InternalWork.g:2369:2: iv_ruleReferences= ruleReferences EOF
            {
             newCompositeNode(grammarAccess.getReferencesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferences=ruleReferences();

            state._fsp--;

             current =iv_ruleReferences.getText(); 
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
    // $ANTLR end "entryRuleReferences"


    // $ANTLR start "ruleReferences"
    // InternalWork.g:2375:1: ruleReferences returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'references' ;
    public final AntlrDatatypeRuleToken ruleReferences() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2381:2: (kw= 'references' )
            // InternalWork.g:2382:2: kw= 'references'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getReferencesAccess().getReferencesKeyword());
            	

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
    // $ANTLR end "ruleReferences"


    // $ANTLR start "entryRuleInstances"
    // InternalWork.g:2390:1: entryRuleInstances returns [String current=null] : iv_ruleInstances= ruleInstances EOF ;
    public final String entryRuleInstances() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInstances = null;


        try {
            // InternalWork.g:2390:49: (iv_ruleInstances= ruleInstances EOF )
            // InternalWork.g:2391:2: iv_ruleInstances= ruleInstances EOF
            {
             newCompositeNode(grammarAccess.getInstancesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstances=ruleInstances();

            state._fsp--;

             current =iv_ruleInstances.getText(); 
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
    // $ANTLR end "entryRuleInstances"


    // $ANTLR start "ruleInstances"
    // InternalWork.g:2397:1: ruleInstances returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'instances' ;
    public final AntlrDatatypeRuleToken ruleInstances() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2403:2: (kw= 'instances' )
            // InternalWork.g:2404:2: kw= 'instances'
            {
            kw=(Token)match(input,30,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInstancesAccess().getInstancesKeyword());
            	

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
    // $ANTLR end "ruleInstances"


    // $ANTLR start "entryRuleInput"
    // InternalWork.g:2412:1: entryRuleInput returns [String current=null] : iv_ruleInput= ruleInput EOF ;
    public final String entryRuleInput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInput = null;


        try {
            // InternalWork.g:2412:45: (iv_ruleInput= ruleInput EOF )
            // InternalWork.g:2413:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput.getText(); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalWork.g:2419:1: ruleInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'input' ;
    public final AntlrDatatypeRuleToken ruleInput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2425:2: (kw= 'input' )
            // InternalWork.g:2426:2: kw= 'input'
            {
            kw=(Token)match(input,31,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInputAccess().getInputKeyword());
            	

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalWork.g:2434:1: entryRuleOutput returns [String current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final String entryRuleOutput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOutput = null;


        try {
            // InternalWork.g:2434:46: (iv_ruleOutput= ruleOutput EOF )
            // InternalWork.g:2435:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput.getText(); 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalWork.g:2441:1: ruleOutput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'output' ;
    public final AntlrDatatypeRuleToken ruleOutput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2447:2: (kw= 'output' )
            // InternalWork.g:2448:2: kw= 'output'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOutputAccess().getOutputKeyword());
            	

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleFrom"
    // InternalWork.g:2456:1: entryRuleFrom returns [String current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final String entryRuleFrom() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFrom = null;


        try {
            // InternalWork.g:2456:44: (iv_ruleFrom= ruleFrom EOF )
            // InternalWork.g:2457:2: iv_ruleFrom= ruleFrom EOF
            {
             newCompositeNode(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrom=ruleFrom();

            state._fsp--;

             current =iv_ruleFrom.getText(); 
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
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // InternalWork.g:2463:1: ruleFrom returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'from' ;
    public final AntlrDatatypeRuleToken ruleFrom() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2469:2: (kw= 'from' )
            // InternalWork.g:2470:2: kw= 'from'
            {
            kw=(Token)match(input,33,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFromAccess().getFromKeyword());
            	

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
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleWith"
    // InternalWork.g:2478:1: entryRuleWith returns [String current=null] : iv_ruleWith= ruleWith EOF ;
    public final String entryRuleWith() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWith = null;


        try {
            // InternalWork.g:2478:44: (iv_ruleWith= ruleWith EOF )
            // InternalWork.g:2479:2: iv_ruleWith= ruleWith EOF
            {
             newCompositeNode(grammarAccess.getWithRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWith=ruleWith();

            state._fsp--;

             current =iv_ruleWith.getText(); 
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
    // $ANTLR end "entryRuleWith"


    // $ANTLR start "ruleWith"
    // InternalWork.g:2485:1: ruleWith returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'with' ;
    public final AntlrDatatypeRuleToken ruleWith() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2491:2: (kw= 'with' )
            // InternalWork.g:2492:2: kw= 'with'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getWithAccess().getWithKeyword());
            	

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
    // $ANTLR end "ruleWith"


    // $ANTLR start "entryRuleExtends"
    // InternalWork.g:2500:1: entryRuleExtends returns [String current=null] : iv_ruleExtends= ruleExtends EOF ;
    public final String entryRuleExtends() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtends = null;


        try {
            // InternalWork.g:2500:47: (iv_ruleExtends= ruleExtends EOF )
            // InternalWork.g:2501:2: iv_ruleExtends= ruleExtends EOF
            {
             newCompositeNode(grammarAccess.getExtendsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtends=ruleExtends();

            state._fsp--;

             current =iv_ruleExtends.getText(); 
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
    // $ANTLR end "entryRuleExtends"


    // $ANTLR start "ruleExtends"
    // InternalWork.g:2507:1: ruleExtends returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'extends' ;
    public final AntlrDatatypeRuleToken ruleExtends() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2513:2: (kw= 'extends' )
            // InternalWork.g:2514:2: kw= 'extends'
            {
            kw=(Token)match(input,35,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getExtendsAccess().getExtendsKeyword());
            	

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
    // $ANTLR end "ruleExtends"


    // $ANTLR start "entryRuleNotOp"
    // InternalWork.g:2522:1: entryRuleNotOp returns [String current=null] : iv_ruleNotOp= ruleNotOp EOF ;
    public final String entryRuleNotOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotOp = null;


        try {
            // InternalWork.g:2522:45: (iv_ruleNotOp= ruleNotOp EOF )
            // InternalWork.g:2523:2: iv_ruleNotOp= ruleNotOp EOF
            {
             newCompositeNode(grammarAccess.getNotOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotOp=ruleNotOp();

            state._fsp--;

             current =iv_ruleNotOp.getText(); 
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
    // $ANTLR end "entryRuleNotOp"


    // $ANTLR start "ruleNotOp"
    // InternalWork.g:2529:1: ruleNotOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NOT' ;
    public final AntlrDatatypeRuleToken ruleNotOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2535:2: (kw= 'NOT' )
            // InternalWork.g:2536:2: kw= 'NOT'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNotOpAccess().getNOTKeyword());
            	

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
    // $ANTLR end "ruleNotOp"


    // $ANTLR start "entryRuleAndOp"
    // InternalWork.g:2544:1: entryRuleAndOp returns [String current=null] : iv_ruleAndOp= ruleAndOp EOF ;
    public final String entryRuleAndOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOp = null;


        try {
            // InternalWork.g:2544:45: (iv_ruleAndOp= ruleAndOp EOF )
            // InternalWork.g:2545:2: iv_ruleAndOp= ruleAndOp EOF
            {
             newCompositeNode(grammarAccess.getAndOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndOp=ruleAndOp();

            state._fsp--;

             current =iv_ruleAndOp.getText(); 
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
    // $ANTLR end "entryRuleAndOp"


    // $ANTLR start "ruleAndOp"
    // InternalWork.g:2551:1: ruleAndOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AND' ;
    public final AntlrDatatypeRuleToken ruleAndOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2557:2: (kw= 'AND' )
            // InternalWork.g:2558:2: kw= 'AND'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAndOpAccess().getANDKeyword());
            	

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
    // $ANTLR end "ruleAndOp"


    // $ANTLR start "entryRuleOrOp"
    // InternalWork.g:2566:1: entryRuleOrOp returns [String current=null] : iv_ruleOrOp= ruleOrOp EOF ;
    public final String entryRuleOrOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOp = null;


        try {
            // InternalWork.g:2566:44: (iv_ruleOrOp= ruleOrOp EOF )
            // InternalWork.g:2567:2: iv_ruleOrOp= ruleOrOp EOF
            {
             newCompositeNode(grammarAccess.getOrOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrOp=ruleOrOp();

            state._fsp--;

             current =iv_ruleOrOp.getText(); 
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
    // $ANTLR end "entryRuleOrOp"


    // $ANTLR start "ruleOrOp"
    // InternalWork.g:2573:1: ruleOrOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'OR' ;
    public final AntlrDatatypeRuleToken ruleOrOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2579:2: (kw= 'OR' )
            // InternalWork.g:2580:2: kw= 'OR'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOrOpAccess().getORKeyword());
            	

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
    // $ANTLR end "ruleOrOp"


    // $ANTLR start "entryRuleSet"
    // InternalWork.g:2588:1: entryRuleSet returns [String current=null] : iv_ruleSet= ruleSet EOF ;
    public final String entryRuleSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSet = null;


        try {
            // InternalWork.g:2588:43: (iv_ruleSet= ruleSet EOF )
            // InternalWork.g:2589:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet.getText(); 
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
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalWork.g:2595:1: ruleSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'set' ;
    public final AntlrDatatypeRuleToken ruleSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2601:2: (kw= 'set' )
            // InternalWork.g:2602:2: kw= 'set'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSetAccess().getSetKeyword());
            	

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
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleTo"
    // InternalWork.g:2610:1: entryRuleTo returns [String current=null] : iv_ruleTo= ruleTo EOF ;
    public final String entryRuleTo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTo = null;


        try {
            // InternalWork.g:2610:42: (iv_ruleTo= ruleTo EOF )
            // InternalWork.g:2611:2: iv_ruleTo= ruleTo EOF
            {
             newCompositeNode(grammarAccess.getToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTo=ruleTo();

            state._fsp--;

             current =iv_ruleTo.getText(); 
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
    // $ANTLR end "entryRuleTo"


    // $ANTLR start "ruleTo"
    // InternalWork.g:2617:1: ruleTo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'to' ;
    public final AntlrDatatypeRuleToken ruleTo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2623:2: (kw= 'to' )
            // InternalWork.g:2624:2: kw= 'to'
            {
            kw=(Token)match(input,40,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getToAccess().getToKeyword());
            	

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
    // $ANTLR end "ruleTo"


    // $ANTLR start "entryRuleUse"
    // InternalWork.g:2632:1: entryRuleUse returns [String current=null] : iv_ruleUse= ruleUse EOF ;
    public final String entryRuleUse() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUse = null;


        try {
            // InternalWork.g:2632:43: (iv_ruleUse= ruleUse EOF )
            // InternalWork.g:2633:2: iv_ruleUse= ruleUse EOF
            {
             newCompositeNode(grammarAccess.getUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUse=ruleUse();

            state._fsp--;

             current =iv_ruleUse.getText(); 
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
    // $ANTLR end "entryRuleUse"


    // $ANTLR start "ruleUse"
    // InternalWork.g:2639:1: ruleUse returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'use' ;
    public final AntlrDatatypeRuleToken ruleUse() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWork.g:2645:2: (kw= 'use' )
            // InternalWork.g:2646:2: kw= 'use'
            {
            kw=(Token)match(input,41,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUseAccess().getUseKeyword());
            	

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
    // $ANTLR end "ruleUse"


    // $ANTLR start "entryRuleInstance"
    // InternalWork.g:2654:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalWork.g:2654:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalWork.g:2655:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalWork.g:2661:1: ruleInstance returns [EObject current=null] : ( ( (lv_instanceDef_0_0= 'instance' ) ) ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) ) ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token lv_instanceDef_0_0=null;
        Token lv_name_3_0=null;
        EObject lv_transitionDeclaration_1_0 = null;

        EObject lv_stateDeclaration_2_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_transition_5_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2667:2: ( ( ( (lv_instanceDef_0_0= 'instance' ) ) ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) ) ) )
            // InternalWork.g:2668:2: ( ( (lv_instanceDef_0_0= 'instance' ) ) ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) ) )
            {
            // InternalWork.g:2668:2: ( ( (lv_instanceDef_0_0= 'instance' ) ) ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) ) )
            // InternalWork.g:2669:3: ( (lv_instanceDef_0_0= 'instance' ) ) ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) )
            {
            // InternalWork.g:2669:3: ( (lv_instanceDef_0_0= 'instance' ) )
            // InternalWork.g:2670:4: (lv_instanceDef_0_0= 'instance' )
            {
            // InternalWork.g:2670:4: (lv_instanceDef_0_0= 'instance' )
            // InternalWork.g:2671:5: lv_instanceDef_0_0= 'instance'
            {
            lv_instanceDef_0_0=(Token)match(input,42,FOLLOW_39); 

            					newLeafNode(lv_instanceDef_0_0, grammarAccess.getInstanceAccess().getInstanceDefInstanceKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            					setWithLastConsumed(current, "instanceDef", lv_instanceDef_0_0, "instance");
            				

            }


            }

            // InternalWork.g:2683:3: ( ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) ) | ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            else if ( (LA36_0==26) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalWork.g:2684:4: ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) )
                    {
                    // InternalWork.g:2684:4: ( (lv_transitionDeclaration_1_0= ruleTransitionDeclaration ) )
                    // InternalWork.g:2685:5: (lv_transitionDeclaration_1_0= ruleTransitionDeclaration )
                    {
                    // InternalWork.g:2685:5: (lv_transitionDeclaration_1_0= ruleTransitionDeclaration )
                    // InternalWork.g:2686:6: lv_transitionDeclaration_1_0= ruleTransitionDeclaration
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getTransitionDeclarationTransitionDeclarationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_40);
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
                    // InternalWork.g:2704:4: ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) )
                    {
                    // InternalWork.g:2704:4: ( (lv_stateDeclaration_2_0= ruleStateDeclaration ) )
                    // InternalWork.g:2705:5: (lv_stateDeclaration_2_0= ruleStateDeclaration )
                    {
                    // InternalWork.g:2705:5: (lv_stateDeclaration_2_0= ruleStateDeclaration )
                    // InternalWork.g:2706:6: lv_stateDeclaration_2_0= ruleStateDeclaration
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getStateDeclarationStateDeclarationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            // InternalWork.g:2724:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalWork.g:2725:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalWork.g:2725:4: (lv_name_3_0= RULE_STRING )
            // InternalWork.g:2726:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalWork.g:2742:3: ( ( (lv_state_4_0= ruleStateInstance ) ) | ( (lv_transition_5_0= ruleTransitionInstance ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_STRING) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalWork.g:2743:4: ( (lv_state_4_0= ruleStateInstance ) )
                    {
                    // InternalWork.g:2743:4: ( (lv_state_4_0= ruleStateInstance ) )
                    // InternalWork.g:2744:5: (lv_state_4_0= ruleStateInstance )
                    {
                    // InternalWork.g:2744:5: (lv_state_4_0= ruleStateInstance )
                    // InternalWork.g:2745:6: lv_state_4_0= ruleStateInstance
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
                    // InternalWork.g:2763:4: ( (lv_transition_5_0= ruleTransitionInstance ) )
                    {
                    // InternalWork.g:2763:4: ( (lv_transition_5_0= ruleTransitionInstance ) )
                    // InternalWork.g:2764:5: (lv_transition_5_0= ruleTransitionInstance )
                    {
                    // InternalWork.g:2764:5: (lv_transition_5_0= ruleTransitionInstance )
                    // InternalWork.g:2765:6: lv_transition_5_0= ruleTransitionInstance
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
    // InternalWork.g:2787:1: entryRuleTransitionDeclaration returns [EObject current=null] : iv_ruleTransitionDeclaration= ruleTransitionDeclaration EOF ;
    public final EObject entryRuleTransitionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDeclaration = null;


        try {
            // InternalWork.g:2787:62: (iv_ruleTransitionDeclaration= ruleTransitionDeclaration EOF )
            // InternalWork.g:2788:2: iv_ruleTransitionDeclaration= ruleTransitionDeclaration EOF
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
    // InternalWork.g:2794:1: ruleTransitionDeclaration returns [EObject current=null] : ( ( (lv_objectType_0_0= ruleTransition ) ) ( (lv_transition_1_0= ruleTransitionID ) ) ) ;
    public final EObject ruleTransitionDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_objectType_0_0 = null;

        EObject lv_transition_1_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2800:2: ( ( ( (lv_objectType_0_0= ruleTransition ) ) ( (lv_transition_1_0= ruleTransitionID ) ) ) )
            // InternalWork.g:2801:2: ( ( (lv_objectType_0_0= ruleTransition ) ) ( (lv_transition_1_0= ruleTransitionID ) ) )
            {
            // InternalWork.g:2801:2: ( ( (lv_objectType_0_0= ruleTransition ) ) ( (lv_transition_1_0= ruleTransitionID ) ) )
            // InternalWork.g:2802:3: ( (lv_objectType_0_0= ruleTransition ) ) ( (lv_transition_1_0= ruleTransitionID ) )
            {
            // InternalWork.g:2802:3: ( (lv_objectType_0_0= ruleTransition ) )
            // InternalWork.g:2803:4: (lv_objectType_0_0= ruleTransition )
            {
            // InternalWork.g:2803:4: (lv_objectType_0_0= ruleTransition )
            // InternalWork.g:2804:5: lv_objectType_0_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getTransitionDeclarationAccess().getObjectTypeTransitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_objectType_0_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionDeclarationRule());
            					}
            					set(
            						current,
            						"objectType",
            						lv_objectType_0_0,
            						"org.worklang.Work.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:2821:3: ( (lv_transition_1_0= ruleTransitionID ) )
            // InternalWork.g:2822:4: (lv_transition_1_0= ruleTransitionID )
            {
            // InternalWork.g:2822:4: (lv_transition_1_0= ruleTransitionID )
            // InternalWork.g:2823:5: lv_transition_1_0= ruleTransitionID
            {

            					newCompositeNode(grammarAccess.getTransitionDeclarationAccess().getTransitionTransitionIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_transition_1_0=ruleTransitionID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionDeclarationRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_1_0,
            						"org.worklang.Work.TransitionID");
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
    // $ANTLR end "ruleTransitionDeclaration"


    // $ANTLR start "entryRuleStateDeclaration"
    // InternalWork.g:2844:1: entryRuleStateDeclaration returns [EObject current=null] : iv_ruleStateDeclaration= ruleStateDeclaration EOF ;
    public final EObject entryRuleStateDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDeclaration = null;


        try {
            // InternalWork.g:2844:57: (iv_ruleStateDeclaration= ruleStateDeclaration EOF )
            // InternalWork.g:2845:2: iv_ruleStateDeclaration= ruleStateDeclaration EOF
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
    // InternalWork.g:2851:1: ruleStateDeclaration returns [EObject current=null] : ( ( (lv_objectType_0_0= ruleState ) ) ( (lv_state_1_0= ruleStateID ) ) ) ;
    public final EObject ruleStateDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_objectType_0_0 = null;

        EObject lv_state_1_0 = null;



        	enterRule();

        try {
            // InternalWork.g:2857:2: ( ( ( (lv_objectType_0_0= ruleState ) ) ( (lv_state_1_0= ruleStateID ) ) ) )
            // InternalWork.g:2858:2: ( ( (lv_objectType_0_0= ruleState ) ) ( (lv_state_1_0= ruleStateID ) ) )
            {
            // InternalWork.g:2858:2: ( ( (lv_objectType_0_0= ruleState ) ) ( (lv_state_1_0= ruleStateID ) ) )
            // InternalWork.g:2859:3: ( (lv_objectType_0_0= ruleState ) ) ( (lv_state_1_0= ruleStateID ) )
            {
            // InternalWork.g:2859:3: ( (lv_objectType_0_0= ruleState ) )
            // InternalWork.g:2860:4: (lv_objectType_0_0= ruleState )
            {
            // InternalWork.g:2860:4: (lv_objectType_0_0= ruleState )
            // InternalWork.g:2861:5: lv_objectType_0_0= ruleState
            {

            					newCompositeNode(grammarAccess.getStateDeclarationAccess().getObjectTypeStateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_objectType_0_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateDeclarationRule());
            					}
            					set(
            						current,
            						"objectType",
            						lv_objectType_0_0,
            						"org.worklang.Work.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:2878:3: ( (lv_state_1_0= ruleStateID ) )
            // InternalWork.g:2879:4: (lv_state_1_0= ruleStateID )
            {
            // InternalWork.g:2879:4: (lv_state_1_0= ruleStateID )
            // InternalWork.g:2880:5: lv_state_1_0= ruleStateID
            {

            					newCompositeNode(grammarAccess.getStateDeclarationAccess().getStateStateIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_1_0=ruleStateID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateDeclarationRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_1_0,
            						"org.worklang.Work.StateID");
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
    // $ANTLR end "ruleStateDeclaration"


    // $ANTLR start "entryRuleTransitionInstance"
    // InternalWork.g:2901:1: entryRuleTransitionInstance returns [EObject current=null] : iv_ruleTransitionInstance= ruleTransitionInstance EOF ;
    public final EObject entryRuleTransitionInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionInstance = null;


        try {
            // InternalWork.g:2901:59: (iv_ruleTransitionInstance= ruleTransitionInstance EOF )
            // InternalWork.g:2902:2: iv_ruleTransitionInstance= ruleTransitionInstance EOF
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
    // InternalWork.g:2908:1: ruleTransitionInstance returns [EObject current=null] : ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleTransitionInstance() throws RecognitionException {
        EObject current = null;

        Token lv_host_0_0=null;
        Token lv_port_1_0=null;
        Token lv_path_2_0=null;


        	enterRule();

        try {
            // InternalWork.g:2914:2: ( ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? ) )
            // InternalWork.g:2915:2: ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? )
            {
            // InternalWork.g:2915:2: ( ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )? )
            // InternalWork.g:2916:3: ( (lv_host_0_0= RULE_STRING ) ) ( (lv_port_1_0= RULE_INT ) ) ( (lv_path_2_0= RULE_STRING ) )?
            {
            // InternalWork.g:2916:3: ( (lv_host_0_0= RULE_STRING ) )
            // InternalWork.g:2917:4: (lv_host_0_0= RULE_STRING )
            {
            // InternalWork.g:2917:4: (lv_host_0_0= RULE_STRING )
            // InternalWork.g:2918:5: lv_host_0_0= RULE_STRING
            {
            lv_host_0_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

            // InternalWork.g:2934:3: ( (lv_port_1_0= RULE_INT ) )
            // InternalWork.g:2935:4: (lv_port_1_0= RULE_INT )
            {
            // InternalWork.g:2935:4: (lv_port_1_0= RULE_INT )
            // InternalWork.g:2936:5: lv_port_1_0= RULE_INT
            {
            lv_port_1_0=(Token)match(input,RULE_INT,FOLLOW_42); 

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

            // InternalWork.g:2952:3: ( (lv_path_2_0= RULE_STRING ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalWork.g:2953:4: (lv_path_2_0= RULE_STRING )
                    {
                    // InternalWork.g:2953:4: (lv_path_2_0= RULE_STRING )
                    // InternalWork.g:2954:5: lv_path_2_0= RULE_STRING
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
    // InternalWork.g:2974:1: entryRuleStateInstance returns [EObject current=null] : iv_ruleStateInstance= ruleStateInstance EOF ;
    public final EObject entryRuleStateInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateInstance = null;


        try {
            // InternalWork.g:2974:54: (iv_ruleStateInstance= ruleStateInstance EOF )
            // InternalWork.g:2975:2: iv_ruleStateInstance= ruleStateInstance EOF
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
    // InternalWork.g:2981:1: ruleStateInstance returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+ otherlv_2= '}' ) ;
    public final EObject ruleStateInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_members_1_1 = null;

        EObject lv_members_1_2 = null;

        EObject lv_members_1_3 = null;



        	enterRule();

        try {
            // InternalWork.g:2987:2: ( (otherlv_0= '{' ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+ otherlv_2= '}' ) )
            // InternalWork.g:2988:2: (otherlv_0= '{' ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+ otherlv_2= '}' )
            {
            // InternalWork.g:2988:2: (otherlv_0= '{' ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+ otherlv_2= '}' )
            // InternalWork.g:2989:3: otherlv_0= '{' ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getStateInstanceAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalWork.g:2993:3: ( ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==39||(LA40_0>=41 && LA40_0<=42)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalWork.g:2994:4: ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) )
            	    {
            	    // InternalWork.g:2994:4: ( (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance ) )
            	    // InternalWork.g:2995:5: (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance )
            	    {
            	    // InternalWork.g:2995:5: (lv_members_1_1= ruleSetStatement | lv_members_1_2= ruleUseDefinition | lv_members_1_3= ruleInstance )
            	    int alt39=3;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // InternalWork.g:2996:6: lv_members_1_1= ruleSetStatement
            	            {

            	            						newCompositeNode(grammarAccess.getStateInstanceAccess().getMembersSetStatementParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_44);
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
            	            // InternalWork.g:3012:6: lv_members_1_2= ruleUseDefinition
            	            {

            	            						newCompositeNode(grammarAccess.getStateInstanceAccess().getMembersUseDefinitionParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_44);
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
            	            // InternalWork.g:3028:6: lv_members_1_3= ruleInstance
            	            {

            	            						newCompositeNode(grammarAccess.getStateInstanceAccess().getMembersInstanceParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_44);
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
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSetStatement"
    // InternalWork.g:3054:1: entryRuleSetStatement returns [EObject current=null] : iv_ruleSetStatement= ruleSetStatement EOF ;
    public final EObject entryRuleSetStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetStatement = null;


        try {
            // InternalWork.g:3054:53: (iv_ruleSetStatement= ruleSetStatement EOF )
            // InternalWork.g:3055:2: iv_ruleSetStatement= ruleSetStatement EOF
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
    // InternalWork.g:3061:1: ruleSetStatement returns [EObject current=null] : ( ( (lv_statement_0_0= ruleSet ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_toDef_2_0= ruleToDefinition ) ) ) ;
    public final EObject ruleSetStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_statement_0_0 = null;

        EObject lv_toDef_2_0 = null;



        	enterRule();

        try {
            // InternalWork.g:3067:2: ( ( ( (lv_statement_0_0= ruleSet ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_toDef_2_0= ruleToDefinition ) ) ) )
            // InternalWork.g:3068:2: ( ( (lv_statement_0_0= ruleSet ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_toDef_2_0= ruleToDefinition ) ) )
            {
            // InternalWork.g:3068:2: ( ( (lv_statement_0_0= ruleSet ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_toDef_2_0= ruleToDefinition ) ) )
            // InternalWork.g:3069:3: ( (lv_statement_0_0= ruleSet ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_toDef_2_0= ruleToDefinition ) )
            {
            // InternalWork.g:3069:3: ( (lv_statement_0_0= ruleSet ) )
            // InternalWork.g:3070:4: (lv_statement_0_0= ruleSet )
            {
            // InternalWork.g:3070:4: (lv_statement_0_0= ruleSet )
            // InternalWork.g:3071:5: lv_statement_0_0= ruleSet
            {

            					newCompositeNode(grammarAccess.getSetStatementAccess().getStatementSetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_statement_0_0=ruleSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetStatementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_0_0,
            						"org.worklang.Work.Set");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:3088:3: ( (otherlv_1= RULE_ID ) )
            // InternalWork.g:3089:4: (otherlv_1= RULE_ID )
            {
            // InternalWork.g:3089:4: (otherlv_1= RULE_ID )
            // InternalWork.g:3090:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(otherlv_1, grammarAccess.getSetStatementAccess().getVariableStateIDCrossReference_1_0());
            				

            }


            }

            // InternalWork.g:3101:3: ( (lv_toDef_2_0= ruleToDefinition ) )
            // InternalWork.g:3102:4: (lv_toDef_2_0= ruleToDefinition )
            {
            // InternalWork.g:3102:4: (lv_toDef_2_0= ruleToDefinition )
            // InternalWork.g:3103:5: lv_toDef_2_0= ruleToDefinition
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
    // InternalWork.g:3124:1: entryRuleToDefinition returns [EObject current=null] : iv_ruleToDefinition= ruleToDefinition EOF ;
    public final EObject entryRuleToDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToDefinition = null;


        try {
            // InternalWork.g:3124:53: (iv_ruleToDefinition= ruleToDefinition EOF )
            // InternalWork.g:3125:2: iv_ruleToDefinition= ruleToDefinition EOF
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
    // InternalWork.g:3131:1: ruleToDefinition returns [EObject current=null] : ( ( (lv_to_0_0= ruleTo ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleToDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_to_0_0 = null;



        	enterRule();

        try {
            // InternalWork.g:3137:2: ( ( ( (lv_to_0_0= ruleTo ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalWork.g:3138:2: ( ( (lv_to_0_0= ruleTo ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalWork.g:3138:2: ( ( (lv_to_0_0= ruleTo ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalWork.g:3139:3: ( (lv_to_0_0= ruleTo ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalWork.g:3139:3: ( (lv_to_0_0= ruleTo ) )
            // InternalWork.g:3140:4: (lv_to_0_0= ruleTo )
            {
            // InternalWork.g:3140:4: (lv_to_0_0= ruleTo )
            // InternalWork.g:3141:5: lv_to_0_0= ruleTo
            {

            					newCompositeNode(grammarAccess.getToDefinitionAccess().getToToParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_to_0_0=ruleTo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getToDefinitionRule());
            					}
            					set(
            						current,
            						"to",
            						lv_to_0_0,
            						"org.worklang.Work.To");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWork.g:3158:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalWork.g:3159:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalWork.g:3159:4: (lv_value_1_0= RULE_STRING )
            // InternalWork.g:3160:5: lv_value_1_0= RULE_STRING
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
    // InternalWork.g:3180:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalWork.g:3180:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalWork.g:3181:2: iv_rulePredicate= rulePredicate EOF
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
    // InternalWork.g:3187:1: rulePredicate returns [EObject current=null] : ( ( (lv_negation_0_0= ruleNotOp ) )? ( (lv_expression_1_0= ruleBinaryExpression ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_negation_0_0 = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalWork.g:3193:2: ( ( ( (lv_negation_0_0= ruleNotOp ) )? ( (lv_expression_1_0= ruleBinaryExpression ) ) ) )
            // InternalWork.g:3194:2: ( ( (lv_negation_0_0= ruleNotOp ) )? ( (lv_expression_1_0= ruleBinaryExpression ) ) )
            {
            // InternalWork.g:3194:2: ( ( (lv_negation_0_0= ruleNotOp ) )? ( (lv_expression_1_0= ruleBinaryExpression ) ) )
            // InternalWork.g:3195:3: ( (lv_negation_0_0= ruleNotOp ) )? ( (lv_expression_1_0= ruleBinaryExpression ) )
            {
            // InternalWork.g:3195:3: ( (lv_negation_0_0= ruleNotOp ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalWork.g:3196:4: (lv_negation_0_0= ruleNotOp )
                    {
                    // InternalWork.g:3196:4: (lv_negation_0_0= ruleNotOp )
                    // InternalWork.g:3197:5: lv_negation_0_0= ruleNotOp
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNegationNotOpParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_negation_0_0=ruleNotOp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredicateRule());
                    					}
                    					set(
                    						current,
                    						"negation",
                    						true,
                    						"org.worklang.Work.NotOp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWork.g:3214:3: ( (lv_expression_1_0= ruleBinaryExpression ) )
            // InternalWork.g:3215:4: (lv_expression_1_0= ruleBinaryExpression )
            {
            // InternalWork.g:3215:4: (lv_expression_1_0= ruleBinaryExpression )
            // InternalWork.g:3216:5: lv_expression_1_0= ruleBinaryExpression
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
    // InternalWork.g:3237:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalWork.g:3237:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalWork.g:3238:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalWork.g:3244:1: ruleBinaryExpression returns [EObject current=null] : (this_TerminalBinaryExpression_0= ruleTerminalBinaryExpression ( () ( ( (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )* ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalBinaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_1 = null;

        AntlrDatatypeRuleToken lv_op_2_2 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalWork.g:3250:2: ( (this_TerminalBinaryExpression_0= ruleTerminalBinaryExpression ( () ( ( (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )* ) )
            // InternalWork.g:3251:2: (this_TerminalBinaryExpression_0= ruleTerminalBinaryExpression ( () ( ( (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )* )
            {
            // InternalWork.g:3251:2: (this_TerminalBinaryExpression_0= ruleTerminalBinaryExpression ( () ( ( (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )* )
            // InternalWork.g:3252:3: this_TerminalBinaryExpression_0= ruleTerminalBinaryExpression ( () ( ( (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getTerminalBinaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_TerminalBinaryExpression_0=ruleTerminalBinaryExpression();

            state._fsp--;


            			current = this_TerminalBinaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalWork.g:3260:3: ( () ( ( (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=37 && LA43_0<=38)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalWork.g:3261:4: () ( ( (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp ) ) ) ( (lv_right_3_0= ruleTerminalBinaryExpression ) )
            	    {
            	    // InternalWork.g:3261:4: ()
            	    // InternalWork.g:3262:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBinaryExpressionAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalWork.g:3268:4: ( ( (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp ) ) )
            	    // InternalWork.g:3269:5: ( (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp ) )
            	    {
            	    // InternalWork.g:3269:5: ( (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp ) )
            	    // InternalWork.g:3270:6: (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp )
            	    {
            	    // InternalWork.g:3270:6: (lv_op_2_1= ruleAndOp | lv_op_2_2= ruleOrOp )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==37) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==38) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalWork.g:3271:7: lv_op_2_1= ruleAndOp
            	            {

            	            							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpAndOpParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_34);
            	            lv_op_2_1=ruleAndOp();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            	            							}
            	            							set(
            	            								current,
            	            								"op",
            	            								lv_op_2_1,
            	            								"org.worklang.Work.AndOp");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalWork.g:3287:7: lv_op_2_2= ruleOrOp
            	            {

            	            							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpOrOpParserRuleCall_1_1_0_1());
            	            						
            	            pushFollow(FOLLOW_34);
            	            lv_op_2_2=ruleOrOp();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            	            							}
            	            							set(
            	            								current,
            	            								"op",
            	            								lv_op_2_2,
            	            								"org.worklang.Work.OrOp");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalWork.g:3305:4: ( (lv_right_3_0= ruleTerminalBinaryExpression ) )
            	    // InternalWork.g:3306:5: (lv_right_3_0= ruleTerminalBinaryExpression )
            	    {
            	    // InternalWork.g:3306:5: (lv_right_3_0= ruleTerminalBinaryExpression )
            	    // InternalWork.g:3307:6: lv_right_3_0= ruleTerminalBinaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightTerminalBinaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_46);
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
            	    break loop43;
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
    // InternalWork.g:3329:1: entryRuleTerminalBinaryExpression returns [EObject current=null] : iv_ruleTerminalBinaryExpression= ruleTerminalBinaryExpression EOF ;
    public final EObject entryRuleTerminalBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalBinaryExpression = null;


        try {
            // InternalWork.g:3329:65: (iv_ruleTerminalBinaryExpression= ruleTerminalBinaryExpression EOF )
            // InternalWork.g:3330:2: iv_ruleTerminalBinaryExpression= ruleTerminalBinaryExpression EOF
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
    // InternalWork.g:3336:1: ruleTerminalBinaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) | ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) ) ) ;
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
            // InternalWork.g:3342:2: ( ( (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) | ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) ) ) )
            // InternalWork.g:3343:2: ( (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) | ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) ) )
            {
            // InternalWork.g:3343:2: ( (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) | ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt44=1;
                }
                break;
            case RULE_ID:
                {
                alt44=2;
                }
                break;
            case 45:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalWork.g:3344:3: (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' )
                    {
                    // InternalWork.g:3344:3: (otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')' )
                    // InternalWork.g:3345:4: otherlv_0= '(' this_Predicate_1= rulePredicate otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_0, grammarAccess.getTerminalBinaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalBinaryExpressionAccess().getPredicateParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_47);
                    this_Predicate_1=rulePredicate();

                    state._fsp--;


                    				current = this_Predicate_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTerminalBinaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWork.g:3363:3: ( () ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalWork.g:3363:3: ( () ( (otherlv_4= RULE_ID ) ) )
                    // InternalWork.g:3364:4: () ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalWork.g:3364:4: ()
                    // InternalWork.g:3365:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalBinaryExpressionAccess().getStateIDAction_1_0(),
                    						current);
                    				

                    }

                    // InternalWork.g:3371:4: ( (otherlv_4= RULE_ID ) )
                    // InternalWork.g:3372:5: (otherlv_4= RULE_ID )
                    {
                    // InternalWork.g:3372:5: (otherlv_4= RULE_ID )
                    // InternalWork.g:3373:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalBinaryExpressionRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getTerminalBinaryExpressionAccess().getInstanceStateIDCrossReference_1_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWork.g:3386:3: ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) )
                    {
                    // InternalWork.g:3386:3: ( () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) ) )
                    // InternalWork.g:3387:4: () ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalWork.g:3387:4: ()
                    // InternalWork.g:3388:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalBinaryExpressionAccess().getStateIDAction_2_0(),
                    						current);
                    				

                    }

                    // InternalWork.g:3394:4: ( ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) ) )
                    // InternalWork.g:3395:5: ( (lv_list_6_0= 'setOf' ) ) ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalWork.g:3395:5: ( (lv_list_6_0= 'setOf' ) )
                    // InternalWork.g:3396:6: (lv_list_6_0= 'setOf' )
                    {
                    // InternalWork.g:3396:6: (lv_list_6_0= 'setOf' )
                    // InternalWork.g:3397:7: lv_list_6_0= 'setOf'
                    {
                    lv_list_6_0=(Token)match(input,45,FOLLOW_7); 

                    							newLeafNode(lv_list_6_0, grammarAccess.getTerminalBinaryExpressionAccess().getListSetOfKeyword_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTerminalBinaryExpressionRule());
                    							}
                    							setWithLastConsumed(current, "list", true, "setOf");
                    						

                    }


                    }

                    // InternalWork.g:3409:5: ( (otherlv_7= RULE_ID ) )
                    // InternalWork.g:3410:6: (otherlv_7= RULE_ID )
                    {
                    // InternalWork.g:3410:6: (otherlv_7= RULE_ID )
                    // InternalWork.g:3411:7: otherlv_7= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTerminalBinaryExpressionRule());
                    							}
                    						
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_7, grammarAccess.getTerminalBinaryExpressionAccess().getValueStateIDCrossReference_2_1_1_0());
                    						

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


    // $ANTLR start "entryRuleTransitionalExpression"
    // InternalWork.g:3428:1: entryRuleTransitionalExpression returns [EObject current=null] : iv_ruleTransitionalExpression= ruleTransitionalExpression EOF ;
    public final EObject entryRuleTransitionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionalExpression = null;


        try {
            // InternalWork.g:3428:63: (iv_ruleTransitionalExpression= ruleTransitionalExpression EOF )
            // InternalWork.g:3429:2: iv_ruleTransitionalExpression= ruleTransitionalExpression EOF
            {
             newCompositeNode(grammarAccess.getTransitionalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionalExpression=ruleTransitionalExpression();

            state._fsp--;

             current =iv_ruleTransitionalExpression; 
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
    // $ANTLR end "entryRuleTransitionalExpression"


    // $ANTLR start "ruleTransitionalExpression"
    // InternalWork.g:3435:1: ruleTransitionalExpression returns [EObject current=null] : (this_TerminalTransitionalExpression_0= ruleTerminalTransitionalExpression ( () ( (lv_op_2_0= 'THEN' ) ) ( (lv_right_3_0= ruleTerminalTransitionalExpression ) ) )* ) ;
    public final EObject ruleTransitionalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TerminalTransitionalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalWork.g:3441:2: ( (this_TerminalTransitionalExpression_0= ruleTerminalTransitionalExpression ( () ( (lv_op_2_0= 'THEN' ) ) ( (lv_right_3_0= ruleTerminalTransitionalExpression ) ) )* ) )
            // InternalWork.g:3442:2: (this_TerminalTransitionalExpression_0= ruleTerminalTransitionalExpression ( () ( (lv_op_2_0= 'THEN' ) ) ( (lv_right_3_0= ruleTerminalTransitionalExpression ) ) )* )
            {
            // InternalWork.g:3442:2: (this_TerminalTransitionalExpression_0= ruleTerminalTransitionalExpression ( () ( (lv_op_2_0= 'THEN' ) ) ( (lv_right_3_0= ruleTerminalTransitionalExpression ) ) )* )
            // InternalWork.g:3443:3: this_TerminalTransitionalExpression_0= ruleTerminalTransitionalExpression ( () ( (lv_op_2_0= 'THEN' ) ) ( (lv_right_3_0= ruleTerminalTransitionalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getTransitionalExpressionAccess().getTerminalTransitionalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_TerminalTransitionalExpression_0=ruleTerminalTransitionalExpression();

            state._fsp--;


            			current = this_TerminalTransitionalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalWork.g:3451:3: ( () ( (lv_op_2_0= 'THEN' ) ) ( (lv_right_3_0= ruleTerminalTransitionalExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==46) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalWork.g:3452:4: () ( (lv_op_2_0= 'THEN' ) ) ( (lv_right_3_0= ruleTerminalTransitionalExpression ) )
            	    {
            	    // InternalWork.g:3452:4: ()
            	    // InternalWork.g:3453:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTransitionalExpressionAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalWork.g:3459:4: ( (lv_op_2_0= 'THEN' ) )
            	    // InternalWork.g:3460:5: (lv_op_2_0= 'THEN' )
            	    {
            	    // InternalWork.g:3460:5: (lv_op_2_0= 'THEN' )
            	    // InternalWork.g:3461:6: lv_op_2_0= 'THEN'
            	    {
            	    lv_op_2_0=(Token)match(input,46,FOLLOW_35); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getTransitionalExpressionAccess().getOpTHENKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionalExpressionRule());
            	    						}
            	    						setWithLastConsumed(current, "op", lv_op_2_0, "THEN");
            	    					

            	    }


            	    }

            	    // InternalWork.g:3473:4: ( (lv_right_3_0= ruleTerminalTransitionalExpression ) )
            	    // InternalWork.g:3474:5: (lv_right_3_0= ruleTerminalTransitionalExpression )
            	    {
            	    // InternalWork.g:3474:5: (lv_right_3_0= ruleTerminalTransitionalExpression )
            	    // InternalWork.g:3475:6: lv_right_3_0= ruleTerminalTransitionalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getTransitionalExpressionAccess().getRightTerminalTransitionalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_right_3_0=ruleTerminalTransitionalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransitionalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.worklang.Work.TerminalTransitionalExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "ruleTransitionalExpression"


    // $ANTLR start "entryRuleTerminalTransitionalExpression"
    // InternalWork.g:3497:1: entryRuleTerminalTransitionalExpression returns [EObject current=null] : iv_ruleTerminalTransitionalExpression= ruleTerminalTransitionalExpression EOF ;
    public final EObject entryRuleTerminalTransitionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalTransitionalExpression = null;


        try {
            // InternalWork.g:3497:71: (iv_ruleTerminalTransitionalExpression= ruleTerminalTransitionalExpression EOF )
            // InternalWork.g:3498:2: iv_ruleTerminalTransitionalExpression= ruleTerminalTransitionalExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalTransitionalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalTransitionalExpression=ruleTerminalTransitionalExpression();

            state._fsp--;

             current =iv_ruleTerminalTransitionalExpression; 
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
    // $ANTLR end "entryRuleTerminalTransitionalExpression"


    // $ANTLR start "ruleTerminalTransitionalExpression"
    // InternalWork.g:3504:1: ruleTerminalTransitionalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_TransitionalExpression_1= ruleTransitionalExpression otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleTerminalTransitionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_TransitionalExpression_1 = null;



        	enterRule();

        try {
            // InternalWork.g:3510:2: ( ( (otherlv_0= '(' this_TransitionalExpression_1= ruleTransitionalExpression otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalWork.g:3511:2: ( (otherlv_0= '(' this_TransitionalExpression_1= ruleTransitionalExpression otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalWork.g:3511:2: ( (otherlv_0= '(' this_TransitionalExpression_1= ruleTransitionalExpression otherlv_2= ')' ) | ( () ( (otherlv_4= RULE_ID ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==43) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalWork.g:3512:3: (otherlv_0= '(' this_TransitionalExpression_1= ruleTransitionalExpression otherlv_2= ')' )
                    {
                    // InternalWork.g:3512:3: (otherlv_0= '(' this_TransitionalExpression_1= ruleTransitionalExpression otherlv_2= ')' )
                    // InternalWork.g:3513:4: otherlv_0= '(' this_TransitionalExpression_1= ruleTransitionalExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_35); 

                    				newLeafNode(otherlv_0, grammarAccess.getTerminalTransitionalExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalTransitionalExpressionAccess().getTransitionalExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_47);
                    this_TransitionalExpression_1=ruleTransitionalExpression();

                    state._fsp--;


                    				current = this_TransitionalExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTerminalTransitionalExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWork.g:3531:3: ( () ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalWork.g:3531:3: ( () ( (otherlv_4= RULE_ID ) ) )
                    // InternalWork.g:3532:4: () ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalWork.g:3532:4: ()
                    // InternalWork.g:3533:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalTransitionalExpressionAccess().getTransitionIDAction_1_0(),
                    						current);
                    				

                    }

                    // InternalWork.g:3539:4: ( (otherlv_4= RULE_ID ) )
                    // InternalWork.g:3540:5: (otherlv_4= RULE_ID )
                    {
                    // InternalWork.g:3540:5: (otherlv_4= RULE_ID )
                    // InternalWork.g:3541:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalTransitionalExpressionRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getTerminalTransitionalExpressionAccess().getValueTransitionIDCrossReference_1_1_0());
                    					

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
    // $ANTLR end "ruleTerminalTransitionalExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002009802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000200D810L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002009810L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000070004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001804000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000E00D810L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000C004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000281000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400600002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000068000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000068000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000002L});

}