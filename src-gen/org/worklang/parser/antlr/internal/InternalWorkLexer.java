package org.worklang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWorkLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_COLLECTION_ELEMENT_NAME=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalWorkLexer() {;} 
    public InternalWorkLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWorkLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalWork.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:11:7: ( 'field' )
            // InternalWork.g:11:9: 'field'
            {
            match("field"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:12:7: ( '{' )
            // InternalWork.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:13:7: ( '}' )
            // InternalWork.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:14:7: ( 'mappings' )
            // InternalWork.g:14:9: 'mappings'
            {
            match("mappings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:15:7: ( 'state' )
            // InternalWork.g:15:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:16:7: ( 'from' )
            // InternalWork.g:16:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:17:7: ( 'to' )
            // InternalWork.g:17:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:18:7: ( 'transition' )
            // InternalWork.g:18:9: 'transition'
            {
            match("transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:19:7: ( 'definitions' )
            // InternalWork.g:19:9: 'definitions'
            {
            match("definitions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:20:7: ( 'primitive' )
            // InternalWork.g:20:9: 'primitive'
            {
            match("primitive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:21:7: ( 'compound' )
            // InternalWork.g:21:9: 'compound'
            {
            match("compound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:22:7: ( 'references' )
            // InternalWork.g:22:9: 'references'
            {
            match("references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:23:7: ( 'instances' )
            // InternalWork.g:23:9: 'instances'
            {
            match("instances"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:24:7: ( 'with' )
            // InternalWork.g:24:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:25:7: ( 'input' )
            // InternalWork.g:25:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:26:7: ( 'output' )
            // InternalWork.g:26:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:27:7: ( 'instance' )
            // InternalWork.g:27:9: 'instance'
            {
            match("instance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:28:7: ( 'collectionElement' )
            // InternalWork.g:28:9: 'collectionElement'
            {
            match("collectionElement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:29:7: ( 'hasCollectionSupport' )
            // InternalWork.g:29:9: 'hasCollectionSupport'
            {
            match("hasCollectionSupport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:30:7: ( '[' )
            // InternalWork.g:30:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:31:7: ( ']' )
            // InternalWork.g:31:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:32:7: ( 'use' )
            // InternalWork.g:32:9: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:33:7: ( 'set' )
            // InternalWork.g:33:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:34:7: ( 'NOT' )
            // InternalWork.g:34:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:35:7: ( 'AND' )
            // InternalWork.g:35:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:36:7: ( 'OR' )
            // InternalWork.g:36:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:37:7: ( '(' )
            // InternalWork.g:37:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:38:7: ( ')' )
            // InternalWork.g:38:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:39:7: ( 'collectionOf' )
            // InternalWork.g:39:9: 'collectionOf'
            {
            match("collectionOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:40:7: ( 'START' )
            // InternalWork.g:40:9: 'START'
            {
            match("START"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:41:7: ( 'WITH' )
            // InternalWork.g:41:9: 'WITH'
            {
            match("WITH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:42:7: ( ';' )
            // InternalWork.g:42:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:43:7: ( 'IF' )
            // InternalWork.g:43:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:44:7: ( '=' )
            // InternalWork.g:44:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:45:7: ( 'ELSE' )
            // InternalWork.g:45:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:46:7: ( 'WHILE' )
            // InternalWork.g:46:9: 'WHILE'
            {
            match("WHILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:47:7: ( 'THEN' )
            // InternalWork.g:47:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:48:7: ( '.' )
            // InternalWork.g:48:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:49:7: ( 'OUTPUT' )
            // InternalWork.g:49:9: 'OUTPUT'
            {
            match("OUTPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_COLLECTION_ELEMENT_NAME"
    public final void mRULE_COLLECTION_ELEMENT_NAME() throws RecognitionException {
        try {
            int _type = RULE_COLLECTION_ELEMENT_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:3370:30: ( '#' RULE_ID '#' RULE_INT '#' ( RULE_ID )? )
            // InternalWork.g:3370:32: '#' RULE_ID '#' RULE_INT '#' ( RULE_ID )?
            {
            match('#'); 
            mRULE_ID(); 
            match('#'); 
            mRULE_INT(); 
            match('#'); 
            // InternalWork.g:3370:61: ( RULE_ID )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='^' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='z')) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalWork.g:3370:61: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLLECTION_ELEMENT_NAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:3372:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalWork.g:3372:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalWork.g:3372:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalWork.g:3372:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalWork.g:3372:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWork.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:3374:10: ( ( '0' .. '9' )+ )
            // InternalWork.g:3374:12: ( '0' .. '9' )+
            {
            // InternalWork.g:3374:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWork.g:3374:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:3376:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalWork.g:3376:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalWork.g:3376:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalWork.g:3376:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalWork.g:3376:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalWork.g:3376:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWork.g:3376:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalWork.g:3376:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalWork.g:3376:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalWork.g:3376:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWork.g:3376:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:3378:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalWork.g:3378:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalWork.g:3378:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWork.g:3378:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:3380:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalWork.g:3380:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalWork.g:3380:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWork.g:3380:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalWork.g:3380:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWork.g:3380:41: ( '\\r' )? '\\n'
                    {
                    // InternalWork.g:3380:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalWork.g:3380:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:3382:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalWork.g:3382:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalWork.g:3382:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWork.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWork.g:3384:16: ( . )
            // InternalWork.g:3384:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalWork.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_COLLECTION_ELEMENT_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=47;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalWork.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalWork.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalWork.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalWork.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalWork.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalWork.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalWork.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalWork.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalWork.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalWork.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalWork.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalWork.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalWork.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalWork.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalWork.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalWork.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalWork.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalWork.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalWork.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalWork.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalWork.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalWork.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalWork.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalWork.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalWork.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalWork.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalWork.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalWork.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalWork.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalWork.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalWork.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalWork.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalWork.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalWork.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalWork.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalWork.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalWork.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalWork.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalWork.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalWork.g:1:244: RULE_COLLECTION_ELEMENT_NAME
                {
                mRULE_COLLECTION_ELEMENT_NAME(); 

                }
                break;
            case 41 :
                // InternalWork.g:1:273: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // InternalWork.g:1:281: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 43 :
                // InternalWork.g:1:290: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 44 :
                // InternalWork.g:1:302: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 45 :
                // InternalWork.g:1:318: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // InternalWork.g:1:334: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 47 :
                // InternalWork.g:1:342: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\52\2\uffff\13\52\2\uffff\4\52\2\uffff\2\52\1\uffff\1\52\1\uffff\2\52\1\uffff\2\47\2\uffff\3\47\2\uffff\2\52\3\uffff\3\52\1\127\11\52\2\uffff\3\52\1\146\1\52\2\uffff\3\52\1\uffff\1\153\1\uffff\2\52\7\uffff\4\52\1\162\1\uffff\13\52\1\176\1\177\1\u0080\1\uffff\4\52\1\uffff\3\52\1\u0088\2\52\1\uffff\10\52\1\u0093\2\52\3\uffff\2\52\1\u0098\1\52\1\u009a\1\u009b\1\u009c\1\uffff\1\52\1\u009e\7\52\1\u00a6\1\uffff\3\52\1\u00aa\1\uffff\1\u00ab\3\uffff\1\52\1\uffff\7\52\1\uffff\1\u00b4\1\52\1\u00b6\2\uffff\10\52\1\uffff\1\52\1\uffff\1\u00c0\3\52\1\u00c4\2\52\1\u00c8\1\52\1\uffff\2\52\1\u00cc\1\uffff\2\52\1\u00cf\1\uffff\1\52\1\u00d1\1\52\1\uffff\1\52\1\u00d5\1\uffff\1\52\1\uffff\1\u00d7\2\52\1\uffff\1\52\1\uffff\1\52\1\u00dc\2\52\1\uffff\7\52\1\u00e6\1\52\1\uffff\2\52\1\u00ea\1\uffff";
    static final String DFA13_eofS =
        "\u00eb\uffff";
    static final String DFA13_minS =
        "\1\0\1\151\2\uffff\1\141\1\145\1\157\1\145\1\162\1\157\1\145\1\156\1\151\1\165\1\141\2\uffff\1\163\1\117\1\116\1\122\2\uffff\1\124\1\110\1\uffff\1\106\1\uffff\1\114\1\110\1\uffff\2\101\2\uffff\2\0\1\52\2\uffff\1\145\1\157\3\uffff\1\160\1\141\1\164\1\60\1\141\1\146\1\151\1\154\1\146\1\160\2\164\1\163\2\uffff\1\145\1\124\1\104\1\60\1\124\2\uffff\1\101\1\124\1\111\1\uffff\1\60\1\uffff\1\123\1\105\7\uffff\1\154\1\155\1\160\1\164\1\60\1\uffff\1\156\1\151\1\155\1\160\1\154\1\145\1\164\1\165\1\150\1\160\1\103\3\60\1\uffff\1\120\1\122\1\110\1\114\1\uffff\1\105\1\116\1\144\1\60\1\151\1\145\1\uffff\1\163\1\156\1\151\1\157\1\145\1\162\1\141\1\164\1\60\1\165\1\157\3\uffff\1\125\1\124\1\60\1\105\3\60\1\uffff\1\156\1\60\2\151\1\164\1\165\1\143\1\145\1\156\1\60\1\uffff\1\164\1\154\1\124\1\60\1\uffff\1\60\3\uffff\1\147\1\uffff\2\164\1\151\1\156\1\164\1\156\1\143\1\uffff\1\60\1\154\1\60\2\uffff\1\163\2\151\1\166\1\144\1\151\1\143\1\145\1\uffff\1\145\1\uffff\1\60\2\157\1\145\1\60\1\157\1\145\1\60\1\143\1\uffff\2\156\1\60\1\uffff\1\156\1\163\1\60\1\uffff\1\164\1\60\1\163\1\uffff\1\105\1\60\1\uffff\1\151\1\uffff\1\60\1\154\1\146\1\uffff\1\157\1\uffff\1\145\1\60\1\156\1\155\1\uffff\1\123\1\145\1\165\1\156\1\160\1\164\1\160\1\60\1\157\1\uffff\1\162\1\164\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\162\2\uffff\1\141\1\164\1\162\1\145\1\162\1\157\1\145\1\156\1\151\1\165\1\141\2\uffff\1\163\1\117\1\116\1\125\2\uffff\1\124\1\111\1\uffff\1\106\1\uffff\1\114\1\110\1\uffff\2\172\2\uffff\2\uffff\1\57\2\uffff\1\145\1\157\3\uffff\1\160\1\141\1\164\1\172\1\141\1\146\1\151\1\155\1\146\1\163\2\164\1\163\2\uffff\1\145\1\124\1\104\1\172\1\124\2\uffff\1\101\1\124\1\111\1\uffff\1\172\1\uffff\1\123\1\105\7\uffff\1\154\1\155\1\160\1\164\1\172\1\uffff\1\156\1\151\1\155\1\160\1\154\1\145\1\164\1\165\1\150\1\160\1\103\3\172\1\uffff\1\120\1\122\1\110\1\114\1\uffff\1\105\1\116\1\144\1\172\1\151\1\145\1\uffff\1\163\1\156\1\151\1\157\1\145\1\162\1\141\1\164\1\172\1\165\1\157\3\uffff\1\125\1\124\1\172\1\105\3\172\1\uffff\1\156\1\172\2\151\1\164\1\165\1\143\1\145\1\156\1\172\1\uffff\1\164\1\154\1\124\1\172\1\uffff\1\172\3\uffff\1\147\1\uffff\2\164\1\151\1\156\1\164\1\156\1\143\1\uffff\1\172\1\154\1\172\2\uffff\1\163\2\151\1\166\1\144\1\151\1\143\1\145\1\uffff\1\145\1\uffff\1\172\2\157\1\145\1\172\1\157\1\145\1\172\1\143\1\uffff\2\156\1\172\1\uffff\1\156\1\163\1\172\1\uffff\1\164\1\172\1\163\1\uffff\1\117\1\172\1\uffff\1\151\1\uffff\1\172\1\154\1\146\1\uffff\1\157\1\uffff\1\145\1\172\1\156\1\155\1\uffff\1\123\1\145\1\165\1\156\1\160\1\164\1\160\1\172\1\157\1\uffff\1\162\1\164\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\13\uffff\1\24\1\25\4\uffff\1\33\1\34\2\uffff\1\40\1\uffff\1\42\2\uffff\1\46\2\uffff\1\51\1\52\3\uffff\1\56\1\57\2\uffff\1\51\1\2\1\3\15\uffff\1\24\1\25\5\uffff\1\33\1\34\3\uffff\1\40\1\uffff\1\42\2\uffff\1\46\1\50\1\52\1\53\1\54\1\55\1\56\5\uffff\1\7\16\uffff\1\32\4\uffff\1\41\6\uffff\1\27\13\uffff\1\26\1\30\1\31\7\uffff\1\6\12\uffff\1\16\4\uffff\1\37\1\uffff\1\43\1\45\1\1\1\uffff\1\5\7\uffff\1\17\3\uffff\1\36\1\44\10\uffff\1\20\1\uffff\1\47\11\uffff\1\4\3\uffff\1\13\3\uffff\1\21\3\uffff\1\12\2\uffff\1\15\1\uffff\1\10\3\uffff\1\14\1\uffff\1\11\4\uffff\1\35\11\uffff\1\22\3\uffff\1\23";
    static final String DFA13_specialS =
        "\1\0\42\uffff\1\1\1\2\u00c6\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\47\1\43\1\37\3\47\1\44\1\25\1\26\4\47\1\36\1\45\12\42\1\47\1\31\1\47\1\33\3\47\1\23\3\41\1\34\3\41\1\32\4\41\1\22\1\24\3\41\1\27\1\35\2\41\1\30\3\41\1\17\1\47\1\20\1\40\1\41\1\47\2\41\1\11\1\7\1\41\1\1\1\41\1\16\1\13\3\41\1\4\1\41\1\15\1\10\1\41\1\12\1\5\1\6\1\21\1\41\1\14\3\41\1\2\1\47\1\3\uff82\47",
            "\1\50\10\uffff\1\51",
            "",
            "",
            "\1\55",
            "\1\57\16\uffff\1\56",
            "\1\60\2\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77\2\uffff\1\100",
            "",
            "",
            "\1\103",
            "\1\105\1\104",
            "",
            "\1\107",
            "",
            "\1\111",
            "\1\112",
            "",
            "\32\114\3\uffff\2\114\1\uffff\32\114",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\0\116",
            "\0\116",
            "\1\117\4\uffff\1\120",
            "",
            "",
            "\1\122",
            "\1\123",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\134\1\133",
            "\1\135",
            "\1\137\2\uffff\1\136",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\147",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\154",
            "\1\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0099",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u009d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c5",
            "\1\u00c6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u00c7\7\52",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00d0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d2",
            "",
            "\1\u00d3\11\uffff\1\u00d4",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00d6",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "",
            "\1\u00db",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_COLLECTION_ELEMENT_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='f') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='}') ) {s = 3;}

                        else if ( (LA13_0=='m') ) {s = 4;}

                        else if ( (LA13_0=='s') ) {s = 5;}

                        else if ( (LA13_0=='t') ) {s = 6;}

                        else if ( (LA13_0=='d') ) {s = 7;}

                        else if ( (LA13_0=='p') ) {s = 8;}

                        else if ( (LA13_0=='c') ) {s = 9;}

                        else if ( (LA13_0=='r') ) {s = 10;}

                        else if ( (LA13_0=='i') ) {s = 11;}

                        else if ( (LA13_0=='w') ) {s = 12;}

                        else if ( (LA13_0=='o') ) {s = 13;}

                        else if ( (LA13_0=='h') ) {s = 14;}

                        else if ( (LA13_0=='[') ) {s = 15;}

                        else if ( (LA13_0==']') ) {s = 16;}

                        else if ( (LA13_0=='u') ) {s = 17;}

                        else if ( (LA13_0=='N') ) {s = 18;}

                        else if ( (LA13_0=='A') ) {s = 19;}

                        else if ( (LA13_0=='O') ) {s = 20;}

                        else if ( (LA13_0=='(') ) {s = 21;}

                        else if ( (LA13_0==')') ) {s = 22;}

                        else if ( (LA13_0=='S') ) {s = 23;}

                        else if ( (LA13_0=='W') ) {s = 24;}

                        else if ( (LA13_0==';') ) {s = 25;}

                        else if ( (LA13_0=='I') ) {s = 26;}

                        else if ( (LA13_0=='=') ) {s = 27;}

                        else if ( (LA13_0=='E') ) {s = 28;}

                        else if ( (LA13_0=='T') ) {s = 29;}

                        else if ( (LA13_0=='.') ) {s = 30;}

                        else if ( (LA13_0=='#') ) {s = 31;}

                        else if ( (LA13_0=='^') ) {s = 32;}

                        else if ( ((LA13_0>='B' && LA13_0<='D')||(LA13_0>='F' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='M')||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='V')||(LA13_0>='X' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='b')||LA13_0=='e'||LA13_0=='g'||(LA13_0>='j' && LA13_0<='l')||LA13_0=='n'||LA13_0=='q'||LA13_0=='v'||(LA13_0>='x' && LA13_0<='z')) ) {s = 33;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 34;}

                        else if ( (LA13_0=='\"') ) {s = 35;}

                        else if ( (LA13_0=='\'') ) {s = 36;}

                        else if ( (LA13_0=='/') ) {s = 37;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 38;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='-')||LA13_0==':'||LA13_0=='<'||(LA13_0>='>' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_35 = input.LA(1);

                        s = -1;
                        if ( ((LA13_35>='\u0000' && LA13_35<='\uFFFF')) ) {s = 78;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_36 = input.LA(1);

                        s = -1;
                        if ( ((LA13_36>='\u0000' && LA13_36<='\uFFFF')) ) {s = 78;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}