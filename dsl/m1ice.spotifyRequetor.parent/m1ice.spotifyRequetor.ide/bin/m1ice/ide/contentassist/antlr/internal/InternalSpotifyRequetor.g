/*
 * generated by Xtext 2.12.0
 */
grammar InternalSpotifyRequetor;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package m1ice.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleCommandManager
entryRuleCommandManager
:
{ before(grammarAccess.getCommandManagerRule()); }
	 ruleCommandManager
{ after(grammarAccess.getCommandManagerRule()); } 
	 EOF 
;

// Rule CommandManager
ruleCommandManager 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommandManagerAccess().getGroup()); }
		(rule__CommandManager__Group__0)
		{ after(grammarAccess.getCommandManagerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommand
entryRuleCommand
:
{ before(grammarAccess.getCommandRule()); }
	 ruleCommand
{ after(grammarAccess.getCommandRule()); } 
	 EOF 
;

// Rule Command
ruleCommand 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommandAccess().getAlternatives()); }
		(rule__Command__Alternatives)
		{ after(grammarAccess.getCommandAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSearch
entryRuleSearch
:
{ before(grammarAccess.getSearchRule()); }
	 ruleSearch
{ after(grammarAccess.getSearchRule()); } 
	 EOF 
;

// Rule Search
ruleSearch 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSearchAccess().getGroup()); }
		(rule__Search__Group__0)
		{ after(grammarAccess.getSearchAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleShow
entryRuleShow
:
{ before(grammarAccess.getShowRule()); }
	 ruleShow
{ after(grammarAccess.getShowRule()); } 
	 EOF 
;

// Rule Show
ruleShow 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getShowAccess().getGroup()); }
		(rule__Show__Group__0)
		{ after(grammarAccess.getShowAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArtist
entryRuleArtist
:
{ before(grammarAccess.getArtistRule()); }
	 ruleArtist
{ after(grammarAccess.getArtistRule()); } 
	 EOF 
;

// Rule Artist
ruleArtist 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArtistAccess().getGroup()); }
		(rule__Artist__Group__0)
		{ after(grammarAccess.getArtistAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAlbum
entryRuleAlbum
:
{ before(grammarAccess.getAlbumRule()); }
	 ruleAlbum
{ after(grammarAccess.getAlbumRule()); } 
	 EOF 
;

// Rule Album
ruleAlbum 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAlbumAccess().getGroup()); }
		(rule__Album__Group__0)
		{ after(grammarAccess.getAlbumAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTrack
entryRuleTrack
:
{ before(grammarAccess.getTrackRule()); }
	 ruleTrack
{ after(grammarAccess.getTrackRule()); } 
	 EOF 
;

// Rule Track
ruleTrack 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTrackAccess().getGroup()); }
		(rule__Track__Group__0)
		{ after(grammarAccess.getTrackAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlaylist
entryRulePlaylist
:
{ before(grammarAccess.getPlaylistRule()); }
	 rulePlaylist
{ after(grammarAccess.getPlaylistRule()); } 
	 EOF 
;

// Rule Playlist
rulePlaylist 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlaylistAccess().getGroup()); }
		(rule__Playlist__Group__0)
		{ after(grammarAccess.getPlaylistAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommandAccess().getSearchParserRuleCall_0()); }
		ruleSearch
		{ after(grammarAccess.getCommandAccess().getSearchParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getCommandAccess().getShowParserRuleCall_1()); }
		ruleShow
		{ after(grammarAccess.getCommandAccess().getShowParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommandManager__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommandManager__Group__0__Impl
	rule__CommandManager__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CommandManager__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommandManagerAccess().getCommandManagerAction_0()); }
	()
	{ after(grammarAccess.getCommandManagerAccess().getCommandManagerAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommandManager__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommandManager__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CommandManager__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommandManagerAccess().getCommandmanagerAssignment_1()); }
	(rule__CommandManager__CommandmanagerAssignment_1)?
	{ after(grammarAccess.getCommandManagerAccess().getCommandmanagerAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Search__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Search__Group__0__Impl
	rule__Search__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSearchAccess().getSearchKeyword_0()); }
	'search'
	{ after(grammarAccess.getSearchAccess().getSearchKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Search__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSearchAccess().getTypeAssignment_1()); }
	(rule__Search__TypeAssignment_1)
	{ after(grammarAccess.getSearchAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Show__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Show__Group__0__Impl
	rule__Show__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Show__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getShowAccess().getShowKeyword_0()); }
	'show'
	{ after(grammarAccess.getShowAccess().getShowKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Show__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Show__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Show__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getShowAccess().getTypeAssignment_1()); }
	(rule__Show__TypeAssignment_1)
	{ after(grammarAccess.getShowAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Artist__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Artist__Group__0__Impl
	rule__Artist__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Artist__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArtistAccess().getArtistAction_0()); }
	()
	{ after(grammarAccess.getArtistAccess().getArtistAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Artist__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Artist__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Artist__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArtistAccess().getTargetAssignment_1()); }
	(rule__Artist__TargetAssignment_1)
	{ after(grammarAccess.getArtistAccess().getTargetAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Album__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Album__Group__0__Impl
	rule__Album__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Album__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlbumAccess().getAlbumAction_0()); }
	()
	{ after(grammarAccess.getAlbumAccess().getAlbumAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Album__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Album__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Album__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlbumAccess().getTargetAssignment_1()); }
	(rule__Album__TargetAssignment_1)
	{ after(grammarAccess.getAlbumAccess().getTargetAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Track__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Track__Group__0__Impl
	rule__Track__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Track__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrackAccess().getTrackAction_0()); }
	()
	{ after(grammarAccess.getTrackAccess().getTrackAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Track__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Track__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Track__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrackAccess().getTargetAssignment_1()); }
	(rule__Track__TargetAssignment_1)
	{ after(grammarAccess.getTrackAccess().getTargetAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Playlist__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Playlist__Group__0__Impl
	rule__Playlist__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Playlist__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlaylistAccess().getPlaylistAction_0()); }
	()
	{ after(grammarAccess.getPlaylistAccess().getPlaylistAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Playlist__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Playlist__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Playlist__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlaylistAccess().getTargetAssignment_1()); }
	(rule__Playlist__TargetAssignment_1)
	{ after(grammarAccess.getPlaylistAccess().getTargetAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CommandManager__CommandmanagerAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommandManagerAccess().getCommandmanagerCommandParserRuleCall_1_0()); }
		ruleCommand
		{ after(grammarAccess.getCommandManagerAccess().getCommandmanagerCommandParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSearchAccess().getTypeTypeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getSearchAccess().getTypeTypeEStringParserRuleCall_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getSearchAccess().getTypeTypeEStringParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getSearchAccess().getTypeTypeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Show__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getShowAccess().getTypeTypeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getShowAccess().getTypeTypeEStringParserRuleCall_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getShowAccess().getTypeTypeEStringParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getShowAccess().getTypeTypeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Artist__TargetAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArtistAccess().getTargetEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getArtistAccess().getTargetEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Album__TargetAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlbumAccess().getTargetEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getAlbumAccess().getTargetEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Track__TargetAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrackAccess().getTargetEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getTrackAccess().getTargetEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Playlist__TargetAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlaylistAccess().getTargetEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getPlaylistAccess().getTargetEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
