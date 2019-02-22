package m1ice.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import m1ice.services.SpotifyRequetorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpotifyRequetorParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(SpotifyRequetorGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCommandManager"
    // InternalSpotifyRequetor.g:53:1: entryRuleCommandManager : ruleCommandManager EOF ;
    public final void entryRuleCommandManager() throws RecognitionException {
        try {
            // InternalSpotifyRequetor.g:54:1: ( ruleCommandManager EOF )
            // InternalSpotifyRequetor.g:55:1: ruleCommandManager EOF
            {
             before(grammarAccess.getCommandManagerRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandManager();

            state._fsp--;

             after(grammarAccess.getCommandManagerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandManager"


    // $ANTLR start "ruleCommandManager"
    // InternalSpotifyRequetor.g:62:1: ruleCommandManager : ( ( rule__CommandManager__Group__0 ) ) ;
    public final void ruleCommandManager() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:66:2: ( ( ( rule__CommandManager__Group__0 ) ) )
            // InternalSpotifyRequetor.g:67:2: ( ( rule__CommandManager__Group__0 ) )
            {
            // InternalSpotifyRequetor.g:67:2: ( ( rule__CommandManager__Group__0 ) )
            // InternalSpotifyRequetor.g:68:3: ( rule__CommandManager__Group__0 )
            {
             before(grammarAccess.getCommandManagerAccess().getGroup()); 
            // InternalSpotifyRequetor.g:69:3: ( rule__CommandManager__Group__0 )
            // InternalSpotifyRequetor.g:69:4: rule__CommandManager__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandManager__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandManagerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandManager"


    // $ANTLR start "entryRuleCommand"
    // InternalSpotifyRequetor.g:78:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalSpotifyRequetor.g:79:1: ( ruleCommand EOF )
            // InternalSpotifyRequetor.g:80:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalSpotifyRequetor.g:87:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:91:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalSpotifyRequetor.g:92:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalSpotifyRequetor.g:92:2: ( ( rule__Command__Alternatives ) )
            // InternalSpotifyRequetor.g:93:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalSpotifyRequetor.g:94:3: ( rule__Command__Alternatives )
            // InternalSpotifyRequetor.g:94:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleSearch"
    // InternalSpotifyRequetor.g:103:1: entryRuleSearch : ruleSearch EOF ;
    public final void entryRuleSearch() throws RecognitionException {
        try {
            // InternalSpotifyRequetor.g:104:1: ( ruleSearch EOF )
            // InternalSpotifyRequetor.g:105:1: ruleSearch EOF
            {
             before(grammarAccess.getSearchRule()); 
            pushFollow(FOLLOW_1);
            ruleSearch();

            state._fsp--;

             after(grammarAccess.getSearchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // InternalSpotifyRequetor.g:112:1: ruleSearch : ( ( rule__Search__Group__0 ) ) ;
    public final void ruleSearch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:116:2: ( ( ( rule__Search__Group__0 ) ) )
            // InternalSpotifyRequetor.g:117:2: ( ( rule__Search__Group__0 ) )
            {
            // InternalSpotifyRequetor.g:117:2: ( ( rule__Search__Group__0 ) )
            // InternalSpotifyRequetor.g:118:3: ( rule__Search__Group__0 )
            {
             before(grammarAccess.getSearchAccess().getGroup()); 
            // InternalSpotifyRequetor.g:119:3: ( rule__Search__Group__0 )
            // InternalSpotifyRequetor.g:119:4: rule__Search__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Search__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleShow"
    // InternalSpotifyRequetor.g:128:1: entryRuleShow : ruleShow EOF ;
    public final void entryRuleShow() throws RecognitionException {
        try {
            // InternalSpotifyRequetor.g:129:1: ( ruleShow EOF )
            // InternalSpotifyRequetor.g:130:1: ruleShow EOF
            {
             before(grammarAccess.getShowRule()); 
            pushFollow(FOLLOW_1);
            ruleShow();

            state._fsp--;

             after(grammarAccess.getShowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // InternalSpotifyRequetor.g:137:1: ruleShow : ( ( rule__Show__Group__0 ) ) ;
    public final void ruleShow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:141:2: ( ( ( rule__Show__Group__0 ) ) )
            // InternalSpotifyRequetor.g:142:2: ( ( rule__Show__Group__0 ) )
            {
            // InternalSpotifyRequetor.g:142:2: ( ( rule__Show__Group__0 ) )
            // InternalSpotifyRequetor.g:143:3: ( rule__Show__Group__0 )
            {
             before(grammarAccess.getShowAccess().getGroup()); 
            // InternalSpotifyRequetor.g:144:3: ( rule__Show__Group__0 )
            // InternalSpotifyRequetor.g:144:4: rule__Show__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleEString"
    // InternalSpotifyRequetor.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSpotifyRequetor.g:154:1: ( ruleEString EOF )
            // InternalSpotifyRequetor.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSpotifyRequetor.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSpotifyRequetor.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSpotifyRequetor.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalSpotifyRequetor.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSpotifyRequetor.g:169:3: ( rule__EString__Alternatives )
            // InternalSpotifyRequetor.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleArtist"
    // InternalSpotifyRequetor.g:178:1: entryRuleArtist : ruleArtist EOF ;
    public final void entryRuleArtist() throws RecognitionException {
        try {
            // InternalSpotifyRequetor.g:179:1: ( ruleArtist EOF )
            // InternalSpotifyRequetor.g:180:1: ruleArtist EOF
            {
             before(grammarAccess.getArtistRule()); 
            pushFollow(FOLLOW_1);
            ruleArtist();

            state._fsp--;

             after(grammarAccess.getArtistRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArtist"


    // $ANTLR start "ruleArtist"
    // InternalSpotifyRequetor.g:187:1: ruleArtist : ( ( rule__Artist__Group__0 ) ) ;
    public final void ruleArtist() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:191:2: ( ( ( rule__Artist__Group__0 ) ) )
            // InternalSpotifyRequetor.g:192:2: ( ( rule__Artist__Group__0 ) )
            {
            // InternalSpotifyRequetor.g:192:2: ( ( rule__Artist__Group__0 ) )
            // InternalSpotifyRequetor.g:193:3: ( rule__Artist__Group__0 )
            {
             before(grammarAccess.getArtistAccess().getGroup()); 
            // InternalSpotifyRequetor.g:194:3: ( rule__Artist__Group__0 )
            // InternalSpotifyRequetor.g:194:4: rule__Artist__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Artist__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArtistAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArtist"


    // $ANTLR start "entryRuleAlbum"
    // InternalSpotifyRequetor.g:203:1: entryRuleAlbum : ruleAlbum EOF ;
    public final void entryRuleAlbum() throws RecognitionException {
        try {
            // InternalSpotifyRequetor.g:204:1: ( ruleAlbum EOF )
            // InternalSpotifyRequetor.g:205:1: ruleAlbum EOF
            {
             before(grammarAccess.getAlbumRule()); 
            pushFollow(FOLLOW_1);
            ruleAlbum();

            state._fsp--;

             after(grammarAccess.getAlbumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlbum"


    // $ANTLR start "ruleAlbum"
    // InternalSpotifyRequetor.g:212:1: ruleAlbum : ( ( rule__Album__Group__0 ) ) ;
    public final void ruleAlbum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:216:2: ( ( ( rule__Album__Group__0 ) ) )
            // InternalSpotifyRequetor.g:217:2: ( ( rule__Album__Group__0 ) )
            {
            // InternalSpotifyRequetor.g:217:2: ( ( rule__Album__Group__0 ) )
            // InternalSpotifyRequetor.g:218:3: ( rule__Album__Group__0 )
            {
             before(grammarAccess.getAlbumAccess().getGroup()); 
            // InternalSpotifyRequetor.g:219:3: ( rule__Album__Group__0 )
            // InternalSpotifyRequetor.g:219:4: rule__Album__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Album__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlbumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlbum"


    // $ANTLR start "entryRuleTrack"
    // InternalSpotifyRequetor.g:228:1: entryRuleTrack : ruleTrack EOF ;
    public final void entryRuleTrack() throws RecognitionException {
        try {
            // InternalSpotifyRequetor.g:229:1: ( ruleTrack EOF )
            // InternalSpotifyRequetor.g:230:1: ruleTrack EOF
            {
             before(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_1);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getTrackRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // InternalSpotifyRequetor.g:237:1: ruleTrack : ( ( rule__Track__Group__0 ) ) ;
    public final void ruleTrack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:241:2: ( ( ( rule__Track__Group__0 ) ) )
            // InternalSpotifyRequetor.g:242:2: ( ( rule__Track__Group__0 ) )
            {
            // InternalSpotifyRequetor.g:242:2: ( ( rule__Track__Group__0 ) )
            // InternalSpotifyRequetor.g:243:3: ( rule__Track__Group__0 )
            {
             before(grammarAccess.getTrackAccess().getGroup()); 
            // InternalSpotifyRequetor.g:244:3: ( rule__Track__Group__0 )
            // InternalSpotifyRequetor.g:244:4: rule__Track__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRulePlaylist"
    // InternalSpotifyRequetor.g:253:1: entryRulePlaylist : rulePlaylist EOF ;
    public final void entryRulePlaylist() throws RecognitionException {
        try {
            // InternalSpotifyRequetor.g:254:1: ( rulePlaylist EOF )
            // InternalSpotifyRequetor.g:255:1: rulePlaylist EOF
            {
             before(grammarAccess.getPlaylistRule()); 
            pushFollow(FOLLOW_1);
            rulePlaylist();

            state._fsp--;

             after(grammarAccess.getPlaylistRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlaylist"


    // $ANTLR start "rulePlaylist"
    // InternalSpotifyRequetor.g:262:1: rulePlaylist : ( ( rule__Playlist__Group__0 ) ) ;
    public final void rulePlaylist() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:266:2: ( ( ( rule__Playlist__Group__0 ) ) )
            // InternalSpotifyRequetor.g:267:2: ( ( rule__Playlist__Group__0 ) )
            {
            // InternalSpotifyRequetor.g:267:2: ( ( rule__Playlist__Group__0 ) )
            // InternalSpotifyRequetor.g:268:3: ( rule__Playlist__Group__0 )
            {
             before(grammarAccess.getPlaylistAccess().getGroup()); 
            // InternalSpotifyRequetor.g:269:3: ( rule__Playlist__Group__0 )
            // InternalSpotifyRequetor.g:269:4: rule__Playlist__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Playlist__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaylistAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlaylist"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalSpotifyRequetor.g:277:1: rule__Command__Alternatives : ( ( ruleSearch ) | ( ruleShow ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:281:1: ( ( ruleSearch ) | ( ruleShow ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpotifyRequetor.g:282:2: ( ruleSearch )
                    {
                    // InternalSpotifyRequetor.g:282:2: ( ruleSearch )
                    // InternalSpotifyRequetor.g:283:3: ruleSearch
                    {
                     before(grammarAccess.getCommandAccess().getSearchParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSearch();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getSearchParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpotifyRequetor.g:288:2: ( ruleShow )
                    {
                    // InternalSpotifyRequetor.g:288:2: ( ruleShow )
                    // InternalSpotifyRequetor.g:289:3: ruleShow
                    {
                     before(grammarAccess.getCommandAccess().getShowParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleShow();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getShowParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSpotifyRequetor.g:298:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:302:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSpotifyRequetor.g:303:2: ( RULE_STRING )
                    {
                    // InternalSpotifyRequetor.g:303:2: ( RULE_STRING )
                    // InternalSpotifyRequetor.g:304:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpotifyRequetor.g:309:2: ( RULE_ID )
                    {
                    // InternalSpotifyRequetor.g:309:2: ( RULE_ID )
                    // InternalSpotifyRequetor.g:310:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__CommandManager__Group__0"
    // InternalSpotifyRequetor.g:319:1: rule__CommandManager__Group__0 : rule__CommandManager__Group__0__Impl rule__CommandManager__Group__1 ;
    public final void rule__CommandManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:323:1: ( rule__CommandManager__Group__0__Impl rule__CommandManager__Group__1 )
            // InternalSpotifyRequetor.g:324:2: rule__CommandManager__Group__0__Impl rule__CommandManager__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CommandManager__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandManager__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandManager__Group__0"


    // $ANTLR start "rule__CommandManager__Group__0__Impl"
    // InternalSpotifyRequetor.g:331:1: rule__CommandManager__Group__0__Impl : ( () ) ;
    public final void rule__CommandManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:335:1: ( ( () ) )
            // InternalSpotifyRequetor.g:336:1: ( () )
            {
            // InternalSpotifyRequetor.g:336:1: ( () )
            // InternalSpotifyRequetor.g:337:2: ()
            {
             before(grammarAccess.getCommandManagerAccess().getCommandManagerAction_0()); 
            // InternalSpotifyRequetor.g:338:2: ()
            // InternalSpotifyRequetor.g:338:3: 
            {
            }

             after(grammarAccess.getCommandManagerAccess().getCommandManagerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandManager__Group__0__Impl"


    // $ANTLR start "rule__CommandManager__Group__1"
    // InternalSpotifyRequetor.g:346:1: rule__CommandManager__Group__1 : rule__CommandManager__Group__1__Impl ;
    public final void rule__CommandManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:350:1: ( rule__CommandManager__Group__1__Impl )
            // InternalSpotifyRequetor.g:351:2: rule__CommandManager__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandManager__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandManager__Group__1"


    // $ANTLR start "rule__CommandManager__Group__1__Impl"
    // InternalSpotifyRequetor.g:357:1: rule__CommandManager__Group__1__Impl : ( ( rule__CommandManager__CommandmanagerAssignment_1 )? ) ;
    public final void rule__CommandManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:361:1: ( ( ( rule__CommandManager__CommandmanagerAssignment_1 )? ) )
            // InternalSpotifyRequetor.g:362:1: ( ( rule__CommandManager__CommandmanagerAssignment_1 )? )
            {
            // InternalSpotifyRequetor.g:362:1: ( ( rule__CommandManager__CommandmanagerAssignment_1 )? )
            // InternalSpotifyRequetor.g:363:2: ( rule__CommandManager__CommandmanagerAssignment_1 )?
            {
             before(grammarAccess.getCommandManagerAccess().getCommandmanagerAssignment_1()); 
            // InternalSpotifyRequetor.g:364:2: ( rule__CommandManager__CommandmanagerAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpotifyRequetor.g:364:3: rule__CommandManager__CommandmanagerAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandManager__CommandmanagerAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandManagerAccess().getCommandmanagerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandManager__Group__1__Impl"


    // $ANTLR start "rule__Search__Group__0"
    // InternalSpotifyRequetor.g:373:1: rule__Search__Group__0 : rule__Search__Group__0__Impl rule__Search__Group__1 ;
    public final void rule__Search__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:377:1: ( rule__Search__Group__0__Impl rule__Search__Group__1 )
            // InternalSpotifyRequetor.g:378:2: rule__Search__Group__0__Impl rule__Search__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Search__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__0"


    // $ANTLR start "rule__Search__Group__0__Impl"
    // InternalSpotifyRequetor.g:385:1: rule__Search__Group__0__Impl : ( 'search' ) ;
    public final void rule__Search__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:389:1: ( ( 'search' ) )
            // InternalSpotifyRequetor.g:390:1: ( 'search' )
            {
            // InternalSpotifyRequetor.g:390:1: ( 'search' )
            // InternalSpotifyRequetor.g:391:2: 'search'
            {
             before(grammarAccess.getSearchAccess().getSearchKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getSearchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__0__Impl"


    // $ANTLR start "rule__Search__Group__1"
    // InternalSpotifyRequetor.g:400:1: rule__Search__Group__1 : rule__Search__Group__1__Impl ;
    public final void rule__Search__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:404:1: ( rule__Search__Group__1__Impl )
            // InternalSpotifyRequetor.g:405:2: rule__Search__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Search__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__1"


    // $ANTLR start "rule__Search__Group__1__Impl"
    // InternalSpotifyRequetor.g:411:1: rule__Search__Group__1__Impl : ( ( rule__Search__TypeAssignment_1 ) ) ;
    public final void rule__Search__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:415:1: ( ( ( rule__Search__TypeAssignment_1 ) ) )
            // InternalSpotifyRequetor.g:416:1: ( ( rule__Search__TypeAssignment_1 ) )
            {
            // InternalSpotifyRequetor.g:416:1: ( ( rule__Search__TypeAssignment_1 ) )
            // InternalSpotifyRequetor.g:417:2: ( rule__Search__TypeAssignment_1 )
            {
             before(grammarAccess.getSearchAccess().getTypeAssignment_1()); 
            // InternalSpotifyRequetor.g:418:2: ( rule__Search__TypeAssignment_1 )
            // InternalSpotifyRequetor.g:418:3: rule__Search__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Search__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__1__Impl"


    // $ANTLR start "rule__Show__Group__0"
    // InternalSpotifyRequetor.g:427:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:431:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // InternalSpotifyRequetor.g:432:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Show__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__0"


    // $ANTLR start "rule__Show__Group__0__Impl"
    // InternalSpotifyRequetor.g:439:1: rule__Show__Group__0__Impl : ( 'show' ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:443:1: ( ( 'show' ) )
            // InternalSpotifyRequetor.g:444:1: ( 'show' )
            {
            // InternalSpotifyRequetor.g:444:1: ( 'show' )
            // InternalSpotifyRequetor.g:445:2: 'show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getShowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__0__Impl"


    // $ANTLR start "rule__Show__Group__1"
    // InternalSpotifyRequetor.g:454:1: rule__Show__Group__1 : rule__Show__Group__1__Impl ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:458:1: ( rule__Show__Group__1__Impl )
            // InternalSpotifyRequetor.g:459:2: rule__Show__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__1"


    // $ANTLR start "rule__Show__Group__1__Impl"
    // InternalSpotifyRequetor.g:465:1: rule__Show__Group__1__Impl : ( ( rule__Show__TypeAssignment_1 ) ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:469:1: ( ( ( rule__Show__TypeAssignment_1 ) ) )
            // InternalSpotifyRequetor.g:470:1: ( ( rule__Show__TypeAssignment_1 ) )
            {
            // InternalSpotifyRequetor.g:470:1: ( ( rule__Show__TypeAssignment_1 ) )
            // InternalSpotifyRequetor.g:471:2: ( rule__Show__TypeAssignment_1 )
            {
             before(grammarAccess.getShowAccess().getTypeAssignment_1()); 
            // InternalSpotifyRequetor.g:472:2: ( rule__Show__TypeAssignment_1 )
            // InternalSpotifyRequetor.g:472:3: rule__Show__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Show__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__1__Impl"


    // $ANTLR start "rule__Artist__Group__0"
    // InternalSpotifyRequetor.g:481:1: rule__Artist__Group__0 : rule__Artist__Group__0__Impl rule__Artist__Group__1 ;
    public final void rule__Artist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:485:1: ( rule__Artist__Group__0__Impl rule__Artist__Group__1 )
            // InternalSpotifyRequetor.g:486:2: rule__Artist__Group__0__Impl rule__Artist__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Artist__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artist__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artist__Group__0"


    // $ANTLR start "rule__Artist__Group__0__Impl"
    // InternalSpotifyRequetor.g:493:1: rule__Artist__Group__0__Impl : ( () ) ;
    public final void rule__Artist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:497:1: ( ( () ) )
            // InternalSpotifyRequetor.g:498:1: ( () )
            {
            // InternalSpotifyRequetor.g:498:1: ( () )
            // InternalSpotifyRequetor.g:499:2: ()
            {
             before(grammarAccess.getArtistAccess().getArtistAction_0()); 
            // InternalSpotifyRequetor.g:500:2: ()
            // InternalSpotifyRequetor.g:500:3: 
            {
            }

             after(grammarAccess.getArtistAccess().getArtistAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artist__Group__0__Impl"


    // $ANTLR start "rule__Artist__Group__1"
    // InternalSpotifyRequetor.g:508:1: rule__Artist__Group__1 : rule__Artist__Group__1__Impl ;
    public final void rule__Artist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:512:1: ( rule__Artist__Group__1__Impl )
            // InternalSpotifyRequetor.g:513:2: rule__Artist__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Artist__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artist__Group__1"


    // $ANTLR start "rule__Artist__Group__1__Impl"
    // InternalSpotifyRequetor.g:519:1: rule__Artist__Group__1__Impl : ( ( rule__Artist__TargetAssignment_1 ) ) ;
    public final void rule__Artist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:523:1: ( ( ( rule__Artist__TargetAssignment_1 ) ) )
            // InternalSpotifyRequetor.g:524:1: ( ( rule__Artist__TargetAssignment_1 ) )
            {
            // InternalSpotifyRequetor.g:524:1: ( ( rule__Artist__TargetAssignment_1 ) )
            // InternalSpotifyRequetor.g:525:2: ( rule__Artist__TargetAssignment_1 )
            {
             before(grammarAccess.getArtistAccess().getTargetAssignment_1()); 
            // InternalSpotifyRequetor.g:526:2: ( rule__Artist__TargetAssignment_1 )
            // InternalSpotifyRequetor.g:526:3: rule__Artist__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Artist__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArtistAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artist__Group__1__Impl"


    // $ANTLR start "rule__Album__Group__0"
    // InternalSpotifyRequetor.g:535:1: rule__Album__Group__0 : rule__Album__Group__0__Impl rule__Album__Group__1 ;
    public final void rule__Album__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:539:1: ( rule__Album__Group__0__Impl rule__Album__Group__1 )
            // InternalSpotifyRequetor.g:540:2: rule__Album__Group__0__Impl rule__Album__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Album__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Album__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Album__Group__0"


    // $ANTLR start "rule__Album__Group__0__Impl"
    // InternalSpotifyRequetor.g:547:1: rule__Album__Group__0__Impl : ( () ) ;
    public final void rule__Album__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:551:1: ( ( () ) )
            // InternalSpotifyRequetor.g:552:1: ( () )
            {
            // InternalSpotifyRequetor.g:552:1: ( () )
            // InternalSpotifyRequetor.g:553:2: ()
            {
             before(grammarAccess.getAlbumAccess().getAlbumAction_0()); 
            // InternalSpotifyRequetor.g:554:2: ()
            // InternalSpotifyRequetor.g:554:3: 
            {
            }

             after(grammarAccess.getAlbumAccess().getAlbumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Album__Group__0__Impl"


    // $ANTLR start "rule__Album__Group__1"
    // InternalSpotifyRequetor.g:562:1: rule__Album__Group__1 : rule__Album__Group__1__Impl ;
    public final void rule__Album__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:566:1: ( rule__Album__Group__1__Impl )
            // InternalSpotifyRequetor.g:567:2: rule__Album__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Album__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Album__Group__1"


    // $ANTLR start "rule__Album__Group__1__Impl"
    // InternalSpotifyRequetor.g:573:1: rule__Album__Group__1__Impl : ( ( rule__Album__TargetAssignment_1 ) ) ;
    public final void rule__Album__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:577:1: ( ( ( rule__Album__TargetAssignment_1 ) ) )
            // InternalSpotifyRequetor.g:578:1: ( ( rule__Album__TargetAssignment_1 ) )
            {
            // InternalSpotifyRequetor.g:578:1: ( ( rule__Album__TargetAssignment_1 ) )
            // InternalSpotifyRequetor.g:579:2: ( rule__Album__TargetAssignment_1 )
            {
             before(grammarAccess.getAlbumAccess().getTargetAssignment_1()); 
            // InternalSpotifyRequetor.g:580:2: ( rule__Album__TargetAssignment_1 )
            // InternalSpotifyRequetor.g:580:3: rule__Album__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Album__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlbumAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Album__Group__1__Impl"


    // $ANTLR start "rule__Track__Group__0"
    // InternalSpotifyRequetor.g:589:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:593:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // InternalSpotifyRequetor.g:594:2: rule__Track__Group__0__Impl rule__Track__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Track__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__0"


    // $ANTLR start "rule__Track__Group__0__Impl"
    // InternalSpotifyRequetor.g:601:1: rule__Track__Group__0__Impl : ( () ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:605:1: ( ( () ) )
            // InternalSpotifyRequetor.g:606:1: ( () )
            {
            // InternalSpotifyRequetor.g:606:1: ( () )
            // InternalSpotifyRequetor.g:607:2: ()
            {
             before(grammarAccess.getTrackAccess().getTrackAction_0()); 
            // InternalSpotifyRequetor.g:608:2: ()
            // InternalSpotifyRequetor.g:608:3: 
            {
            }

             after(grammarAccess.getTrackAccess().getTrackAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__0__Impl"


    // $ANTLR start "rule__Track__Group__1"
    // InternalSpotifyRequetor.g:616:1: rule__Track__Group__1 : rule__Track__Group__1__Impl ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:620:1: ( rule__Track__Group__1__Impl )
            // InternalSpotifyRequetor.g:621:2: rule__Track__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__1"


    // $ANTLR start "rule__Track__Group__1__Impl"
    // InternalSpotifyRequetor.g:627:1: rule__Track__Group__1__Impl : ( ( rule__Track__TargetAssignment_1 ) ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:631:1: ( ( ( rule__Track__TargetAssignment_1 ) ) )
            // InternalSpotifyRequetor.g:632:1: ( ( rule__Track__TargetAssignment_1 ) )
            {
            // InternalSpotifyRequetor.g:632:1: ( ( rule__Track__TargetAssignment_1 ) )
            // InternalSpotifyRequetor.g:633:2: ( rule__Track__TargetAssignment_1 )
            {
             before(grammarAccess.getTrackAccess().getTargetAssignment_1()); 
            // InternalSpotifyRequetor.g:634:2: ( rule__Track__TargetAssignment_1 )
            // InternalSpotifyRequetor.g:634:3: rule__Track__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Track__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__1__Impl"


    // $ANTLR start "rule__Playlist__Group__0"
    // InternalSpotifyRequetor.g:643:1: rule__Playlist__Group__0 : rule__Playlist__Group__0__Impl rule__Playlist__Group__1 ;
    public final void rule__Playlist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:647:1: ( rule__Playlist__Group__0__Impl rule__Playlist__Group__1 )
            // InternalSpotifyRequetor.g:648:2: rule__Playlist__Group__0__Impl rule__Playlist__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Playlist__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Playlist__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__0"


    // $ANTLR start "rule__Playlist__Group__0__Impl"
    // InternalSpotifyRequetor.g:655:1: rule__Playlist__Group__0__Impl : ( () ) ;
    public final void rule__Playlist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:659:1: ( ( () ) )
            // InternalSpotifyRequetor.g:660:1: ( () )
            {
            // InternalSpotifyRequetor.g:660:1: ( () )
            // InternalSpotifyRequetor.g:661:2: ()
            {
             before(grammarAccess.getPlaylistAccess().getPlaylistAction_0()); 
            // InternalSpotifyRequetor.g:662:2: ()
            // InternalSpotifyRequetor.g:662:3: 
            {
            }

             after(grammarAccess.getPlaylistAccess().getPlaylistAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__0__Impl"


    // $ANTLR start "rule__Playlist__Group__1"
    // InternalSpotifyRequetor.g:670:1: rule__Playlist__Group__1 : rule__Playlist__Group__1__Impl ;
    public final void rule__Playlist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:674:1: ( rule__Playlist__Group__1__Impl )
            // InternalSpotifyRequetor.g:675:2: rule__Playlist__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Playlist__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__1"


    // $ANTLR start "rule__Playlist__Group__1__Impl"
    // InternalSpotifyRequetor.g:681:1: rule__Playlist__Group__1__Impl : ( ( rule__Playlist__TargetAssignment_1 ) ) ;
    public final void rule__Playlist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:685:1: ( ( ( rule__Playlist__TargetAssignment_1 ) ) )
            // InternalSpotifyRequetor.g:686:1: ( ( rule__Playlist__TargetAssignment_1 ) )
            {
            // InternalSpotifyRequetor.g:686:1: ( ( rule__Playlist__TargetAssignment_1 ) )
            // InternalSpotifyRequetor.g:687:2: ( rule__Playlist__TargetAssignment_1 )
            {
             before(grammarAccess.getPlaylistAccess().getTargetAssignment_1()); 
            // InternalSpotifyRequetor.g:688:2: ( rule__Playlist__TargetAssignment_1 )
            // InternalSpotifyRequetor.g:688:3: rule__Playlist__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Playlist__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaylistAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__1__Impl"


    // $ANTLR start "rule__CommandManager__CommandmanagerAssignment_1"
    // InternalSpotifyRequetor.g:697:1: rule__CommandManager__CommandmanagerAssignment_1 : ( ruleCommand ) ;
    public final void rule__CommandManager__CommandmanagerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:701:1: ( ( ruleCommand ) )
            // InternalSpotifyRequetor.g:702:2: ( ruleCommand )
            {
            // InternalSpotifyRequetor.g:702:2: ( ruleCommand )
            // InternalSpotifyRequetor.g:703:3: ruleCommand
            {
             before(grammarAccess.getCommandManagerAccess().getCommandmanagerCommandParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandManagerAccess().getCommandmanagerCommandParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandManager__CommandmanagerAssignment_1"


    // $ANTLR start "rule__Search__TypeAssignment_1"
    // InternalSpotifyRequetor.g:712:1: rule__Search__TypeAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Search__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:716:1: ( ( ( ruleEString ) ) )
            // InternalSpotifyRequetor.g:717:2: ( ( ruleEString ) )
            {
            // InternalSpotifyRequetor.g:717:2: ( ( ruleEString ) )
            // InternalSpotifyRequetor.g:718:3: ( ruleEString )
            {
             before(grammarAccess.getSearchAccess().getTypeTypeCrossReference_1_0()); 
            // InternalSpotifyRequetor.g:719:3: ( ruleEString )
            // InternalSpotifyRequetor.g:720:4: ruleEString
            {
             before(grammarAccess.getSearchAccess().getTypeTypeEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSearchAccess().getTypeTypeEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSearchAccess().getTypeTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__TypeAssignment_1"


    // $ANTLR start "rule__Show__TypeAssignment_1"
    // InternalSpotifyRequetor.g:731:1: rule__Show__TypeAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Show__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:735:1: ( ( ( ruleEString ) ) )
            // InternalSpotifyRequetor.g:736:2: ( ( ruleEString ) )
            {
            // InternalSpotifyRequetor.g:736:2: ( ( ruleEString ) )
            // InternalSpotifyRequetor.g:737:3: ( ruleEString )
            {
             before(grammarAccess.getShowAccess().getTypeTypeCrossReference_1_0()); 
            // InternalSpotifyRequetor.g:738:3: ( ruleEString )
            // InternalSpotifyRequetor.g:739:4: ruleEString
            {
             before(grammarAccess.getShowAccess().getTypeTypeEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShowAccess().getTypeTypeEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getShowAccess().getTypeTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__TypeAssignment_1"


    // $ANTLR start "rule__Artist__TargetAssignment_1"
    // InternalSpotifyRequetor.g:750:1: rule__Artist__TargetAssignment_1 : ( ruleEString ) ;
    public final void rule__Artist__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:754:1: ( ( ruleEString ) )
            // InternalSpotifyRequetor.g:755:2: ( ruleEString )
            {
            // InternalSpotifyRequetor.g:755:2: ( ruleEString )
            // InternalSpotifyRequetor.g:756:3: ruleEString
            {
             before(grammarAccess.getArtistAccess().getTargetEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArtistAccess().getTargetEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artist__TargetAssignment_1"


    // $ANTLR start "rule__Album__TargetAssignment_1"
    // InternalSpotifyRequetor.g:765:1: rule__Album__TargetAssignment_1 : ( ruleEString ) ;
    public final void rule__Album__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:769:1: ( ( ruleEString ) )
            // InternalSpotifyRequetor.g:770:2: ( ruleEString )
            {
            // InternalSpotifyRequetor.g:770:2: ( ruleEString )
            // InternalSpotifyRequetor.g:771:3: ruleEString
            {
             before(grammarAccess.getAlbumAccess().getTargetEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlbumAccess().getTargetEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Album__TargetAssignment_1"


    // $ANTLR start "rule__Track__TargetAssignment_1"
    // InternalSpotifyRequetor.g:780:1: rule__Track__TargetAssignment_1 : ( ruleEString ) ;
    public final void rule__Track__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:784:1: ( ( ruleEString ) )
            // InternalSpotifyRequetor.g:785:2: ( ruleEString )
            {
            // InternalSpotifyRequetor.g:785:2: ( ruleEString )
            // InternalSpotifyRequetor.g:786:3: ruleEString
            {
             before(grammarAccess.getTrackAccess().getTargetEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getTargetEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__TargetAssignment_1"


    // $ANTLR start "rule__Playlist__TargetAssignment_1"
    // InternalSpotifyRequetor.g:795:1: rule__Playlist__TargetAssignment_1 : ( ruleEString ) ;
    public final void rule__Playlist__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpotifyRequetor.g:799:1: ( ( ruleEString ) )
            // InternalSpotifyRequetor.g:800:2: ( ruleEString )
            {
            // InternalSpotifyRequetor.g:800:2: ( ruleEString )
            // InternalSpotifyRequetor.g:801:3: ruleEString
            {
             before(grammarAccess.getPlaylistAccess().getTargetEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlaylistAccess().getTargetEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__TargetAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});

}