package m1ice.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import m1ice.services.SpotifyRequetorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpotifyRequetorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'search'", "'show'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSpotifyRequetorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpotifyRequetorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpotifyRequetorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpotifyRequetor.g"; }



     	private SpotifyRequetorGrammarAccess grammarAccess;

        public InternalSpotifyRequetorParser(TokenStream input, SpotifyRequetorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CommandManager";
       	}

       	@Override
       	protected SpotifyRequetorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCommandManager"
    // InternalSpotifyRequetor.g:64:1: entryRuleCommandManager returns [EObject current=null] : iv_ruleCommandManager= ruleCommandManager EOF ;
    public final EObject entryRuleCommandManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandManager = null;


        try {
            // InternalSpotifyRequetor.g:64:55: (iv_ruleCommandManager= ruleCommandManager EOF )
            // InternalSpotifyRequetor.g:65:2: iv_ruleCommandManager= ruleCommandManager EOF
            {
             newCompositeNode(grammarAccess.getCommandManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandManager=ruleCommandManager();

            state._fsp--;

             current =iv_ruleCommandManager; 
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
    // $ANTLR end "entryRuleCommandManager"


    // $ANTLR start "ruleCommandManager"
    // InternalSpotifyRequetor.g:71:1: ruleCommandManager returns [EObject current=null] : ( () ( (lv_commandmanager_1_0= ruleCommand ) )? ) ;
    public final EObject ruleCommandManager() throws RecognitionException {
        EObject current = null;

        EObject lv_commandmanager_1_0 = null;



        	enterRule();

        try {
            // InternalSpotifyRequetor.g:77:2: ( ( () ( (lv_commandmanager_1_0= ruleCommand ) )? ) )
            // InternalSpotifyRequetor.g:78:2: ( () ( (lv_commandmanager_1_0= ruleCommand ) )? )
            {
            // InternalSpotifyRequetor.g:78:2: ( () ( (lv_commandmanager_1_0= ruleCommand ) )? )
            // InternalSpotifyRequetor.g:79:3: () ( (lv_commandmanager_1_0= ruleCommand ) )?
            {
            // InternalSpotifyRequetor.g:79:3: ()
            // InternalSpotifyRequetor.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandManagerAccess().getCommandManagerAction_0(),
            					current);
            			

            }

            // InternalSpotifyRequetor.g:86:3: ( (lv_commandmanager_1_0= ruleCommand ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpotifyRequetor.g:87:4: (lv_commandmanager_1_0= ruleCommand )
                    {
                    // InternalSpotifyRequetor.g:87:4: (lv_commandmanager_1_0= ruleCommand )
                    // InternalSpotifyRequetor.g:88:5: lv_commandmanager_1_0= ruleCommand
                    {

                    					newCompositeNode(grammarAccess.getCommandManagerAccess().getCommandmanagerCommandParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_commandmanager_1_0=ruleCommand();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandManagerRule());
                    					}
                    					set(
                    						current,
                    						"commandmanager",
                    						lv_commandmanager_1_0,
                    						"m1ice.SpotifyRequetor.Command");
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
    // $ANTLR end "ruleCommandManager"


    // $ANTLR start "entryRuleCommand"
    // InternalSpotifyRequetor.g:109:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalSpotifyRequetor.g:109:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalSpotifyRequetor.g:110:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalSpotifyRequetor.g:116:1: ruleCommand returns [EObject current=null] : (this_Search_0= ruleSearch | this_Show_1= ruleShow ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Search_0 = null;

        EObject this_Show_1 = null;



        	enterRule();

        try {
            // InternalSpotifyRequetor.g:122:2: ( (this_Search_0= ruleSearch | this_Show_1= ruleShow ) )
            // InternalSpotifyRequetor.g:123:2: (this_Search_0= ruleSearch | this_Show_1= ruleShow )
            {
            // InternalSpotifyRequetor.g:123:2: (this_Search_0= ruleSearch | this_Show_1= ruleShow )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSpotifyRequetor.g:124:3: this_Search_0= ruleSearch
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSearchParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Search_0=ruleSearch();

                    state._fsp--;


                    			current = this_Search_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSpotifyRequetor.g:133:3: this_Show_1= ruleShow
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getShowParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Show_1=ruleShow();

                    state._fsp--;


                    			current = this_Show_1;
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleSearch"
    // InternalSpotifyRequetor.g:145:1: entryRuleSearch returns [EObject current=null] : iv_ruleSearch= ruleSearch EOF ;
    public final EObject entryRuleSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearch = null;


        try {
            // InternalSpotifyRequetor.g:145:47: (iv_ruleSearch= ruleSearch EOF )
            // InternalSpotifyRequetor.g:146:2: iv_ruleSearch= ruleSearch EOF
            {
             newCompositeNode(grammarAccess.getSearchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSearch=ruleSearch();

            state._fsp--;

             current =iv_ruleSearch; 
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
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // InternalSpotifyRequetor.g:152:1: ruleSearch returns [EObject current=null] : (otherlv_0= 'search' ( ( ruleEString ) ) ) ;
    public final EObject ruleSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSpotifyRequetor.g:158:2: ( (otherlv_0= 'search' ( ( ruleEString ) ) ) )
            // InternalSpotifyRequetor.g:159:2: (otherlv_0= 'search' ( ( ruleEString ) ) )
            {
            // InternalSpotifyRequetor.g:159:2: (otherlv_0= 'search' ( ( ruleEString ) ) )
            // InternalSpotifyRequetor.g:160:3: otherlv_0= 'search' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSearchAccess().getSearchKeyword_0());
            		
            // InternalSpotifyRequetor.g:164:3: ( ( ruleEString ) )
            // InternalSpotifyRequetor.g:165:4: ( ruleEString )
            {
            // InternalSpotifyRequetor.g:165:4: ( ruleEString )
            // InternalSpotifyRequetor.g:166:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSearchRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSearchAccess().getTypeTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleShow"
    // InternalSpotifyRequetor.g:184:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // InternalSpotifyRequetor.g:184:45: (iv_ruleShow= ruleShow EOF )
            // InternalSpotifyRequetor.g:185:2: iv_ruleShow= ruleShow EOF
            {
             newCompositeNode(grammarAccess.getShowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShow=ruleShow();

            state._fsp--;

             current =iv_ruleShow; 
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
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // InternalSpotifyRequetor.g:191:1: ruleShow returns [EObject current=null] : (otherlv_0= 'show' ( ( ruleEString ) ) ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSpotifyRequetor.g:197:2: ( (otherlv_0= 'show' ( ( ruleEString ) ) ) )
            // InternalSpotifyRequetor.g:198:2: (otherlv_0= 'show' ( ( ruleEString ) ) )
            {
            // InternalSpotifyRequetor.g:198:2: (otherlv_0= 'show' ( ( ruleEString ) ) )
            // InternalSpotifyRequetor.g:199:3: otherlv_0= 'show' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getShowAccess().getShowKeyword_0());
            		
            // InternalSpotifyRequetor.g:203:3: ( ( ruleEString ) )
            // InternalSpotifyRequetor.g:204:4: ( ruleEString )
            {
            // InternalSpotifyRequetor.g:204:4: ( ruleEString )
            // InternalSpotifyRequetor.g:205:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getShowAccess().getTypeTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleEString"
    // InternalSpotifyRequetor.g:223:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSpotifyRequetor.g:223:47: (iv_ruleEString= ruleEString EOF )
            // InternalSpotifyRequetor.g:224:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSpotifyRequetor.g:230:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSpotifyRequetor.g:236:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSpotifyRequetor.g:237:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSpotifyRequetor.g:237:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpotifyRequetor.g:238:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSpotifyRequetor.g:246:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleArtist"
    // InternalSpotifyRequetor.g:257:1: entryRuleArtist returns [EObject current=null] : iv_ruleArtist= ruleArtist EOF ;
    public final EObject entryRuleArtist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtist = null;


        try {
            // InternalSpotifyRequetor.g:257:47: (iv_ruleArtist= ruleArtist EOF )
            // InternalSpotifyRequetor.g:258:2: iv_ruleArtist= ruleArtist EOF
            {
             newCompositeNode(grammarAccess.getArtistRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtist=ruleArtist();

            state._fsp--;

             current =iv_ruleArtist; 
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
    // $ANTLR end "entryRuleArtist"


    // $ANTLR start "ruleArtist"
    // InternalSpotifyRequetor.g:264:1: ruleArtist returns [EObject current=null] : ( () ( (lv_target_1_0= ruleEString ) ) ) ;
    public final EObject ruleArtist() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalSpotifyRequetor.g:270:2: ( ( () ( (lv_target_1_0= ruleEString ) ) ) )
            // InternalSpotifyRequetor.g:271:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            {
            // InternalSpotifyRequetor.g:271:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            // InternalSpotifyRequetor.g:272:3: () ( (lv_target_1_0= ruleEString ) )
            {
            // InternalSpotifyRequetor.g:272:3: ()
            // InternalSpotifyRequetor.g:273:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtistAccess().getArtistAction_0(),
            					current);
            			

            }

            // InternalSpotifyRequetor.g:279:3: ( (lv_target_1_0= ruleEString ) )
            // InternalSpotifyRequetor.g:280:4: (lv_target_1_0= ruleEString )
            {
            // InternalSpotifyRequetor.g:280:4: (lv_target_1_0= ruleEString )
            // InternalSpotifyRequetor.g:281:5: lv_target_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getArtistAccess().getTargetEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtistRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_1_0,
            						"m1ice.SpotifyRequetor.EString");
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
    // $ANTLR end "ruleArtist"


    // $ANTLR start "entryRuleAlbum"
    // InternalSpotifyRequetor.g:302:1: entryRuleAlbum returns [EObject current=null] : iv_ruleAlbum= ruleAlbum EOF ;
    public final EObject entryRuleAlbum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbum = null;


        try {
            // InternalSpotifyRequetor.g:302:46: (iv_ruleAlbum= ruleAlbum EOF )
            // InternalSpotifyRequetor.g:303:2: iv_ruleAlbum= ruleAlbum EOF
            {
             newCompositeNode(grammarAccess.getAlbumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlbum=ruleAlbum();

            state._fsp--;

             current =iv_ruleAlbum; 
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
    // $ANTLR end "entryRuleAlbum"


    // $ANTLR start "ruleAlbum"
    // InternalSpotifyRequetor.g:309:1: ruleAlbum returns [EObject current=null] : ( () ( (lv_target_1_0= ruleEString ) ) ) ;
    public final EObject ruleAlbum() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalSpotifyRequetor.g:315:2: ( ( () ( (lv_target_1_0= ruleEString ) ) ) )
            // InternalSpotifyRequetor.g:316:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            {
            // InternalSpotifyRequetor.g:316:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            // InternalSpotifyRequetor.g:317:3: () ( (lv_target_1_0= ruleEString ) )
            {
            // InternalSpotifyRequetor.g:317:3: ()
            // InternalSpotifyRequetor.g:318:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlbumAccess().getAlbumAction_0(),
            					current);
            			

            }

            // InternalSpotifyRequetor.g:324:3: ( (lv_target_1_0= ruleEString ) )
            // InternalSpotifyRequetor.g:325:4: (lv_target_1_0= ruleEString )
            {
            // InternalSpotifyRequetor.g:325:4: (lv_target_1_0= ruleEString )
            // InternalSpotifyRequetor.g:326:5: lv_target_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlbumAccess().getTargetEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlbumRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_1_0,
            						"m1ice.SpotifyRequetor.EString");
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
    // $ANTLR end "ruleAlbum"


    // $ANTLR start "entryRuleTrack"
    // InternalSpotifyRequetor.g:347:1: entryRuleTrack returns [EObject current=null] : iv_ruleTrack= ruleTrack EOF ;
    public final EObject entryRuleTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrack = null;


        try {
            // InternalSpotifyRequetor.g:347:46: (iv_ruleTrack= ruleTrack EOF )
            // InternalSpotifyRequetor.g:348:2: iv_ruleTrack= ruleTrack EOF
            {
             newCompositeNode(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrack=ruleTrack();

            state._fsp--;

             current =iv_ruleTrack; 
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
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // InternalSpotifyRequetor.g:354:1: ruleTrack returns [EObject current=null] : ( () ( (lv_target_1_0= ruleEString ) ) ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalSpotifyRequetor.g:360:2: ( ( () ( (lv_target_1_0= ruleEString ) ) ) )
            // InternalSpotifyRequetor.g:361:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            {
            // InternalSpotifyRequetor.g:361:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            // InternalSpotifyRequetor.g:362:3: () ( (lv_target_1_0= ruleEString ) )
            {
            // InternalSpotifyRequetor.g:362:3: ()
            // InternalSpotifyRequetor.g:363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrackAccess().getTrackAction_0(),
            					current);
            			

            }

            // InternalSpotifyRequetor.g:369:3: ( (lv_target_1_0= ruleEString ) )
            // InternalSpotifyRequetor.g:370:4: (lv_target_1_0= ruleEString )
            {
            // InternalSpotifyRequetor.g:370:4: (lv_target_1_0= ruleEString )
            // InternalSpotifyRequetor.g:371:5: lv_target_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTrackAccess().getTargetEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrackRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_1_0,
            						"m1ice.SpotifyRequetor.EString");
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
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRulePlaylist"
    // InternalSpotifyRequetor.g:392:1: entryRulePlaylist returns [EObject current=null] : iv_rulePlaylist= rulePlaylist EOF ;
    public final EObject entryRulePlaylist() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaylist = null;


        try {
            // InternalSpotifyRequetor.g:392:49: (iv_rulePlaylist= rulePlaylist EOF )
            // InternalSpotifyRequetor.g:393:2: iv_rulePlaylist= rulePlaylist EOF
            {
             newCompositeNode(grammarAccess.getPlaylistRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlaylist=rulePlaylist();

            state._fsp--;

             current =iv_rulePlaylist; 
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
    // $ANTLR end "entryRulePlaylist"


    // $ANTLR start "rulePlaylist"
    // InternalSpotifyRequetor.g:399:1: rulePlaylist returns [EObject current=null] : ( () ( (lv_target_1_0= ruleEString ) ) ) ;
    public final EObject rulePlaylist() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalSpotifyRequetor.g:405:2: ( ( () ( (lv_target_1_0= ruleEString ) ) ) )
            // InternalSpotifyRequetor.g:406:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            {
            // InternalSpotifyRequetor.g:406:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            // InternalSpotifyRequetor.g:407:3: () ( (lv_target_1_0= ruleEString ) )
            {
            // InternalSpotifyRequetor.g:407:3: ()
            // InternalSpotifyRequetor.g:408:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlaylistAccess().getPlaylistAction_0(),
            					current);
            			

            }

            // InternalSpotifyRequetor.g:414:3: ( (lv_target_1_0= ruleEString ) )
            // InternalSpotifyRequetor.g:415:4: (lv_target_1_0= ruleEString )
            {
            // InternalSpotifyRequetor.g:415:4: (lv_target_1_0= ruleEString )
            // InternalSpotifyRequetor.g:416:5: lv_target_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlaylistAccess().getTargetEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlaylistRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_1_0,
            						"m1ice.SpotifyRequetor.EString");
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
    // $ANTLR end "rulePlaylist"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});

}