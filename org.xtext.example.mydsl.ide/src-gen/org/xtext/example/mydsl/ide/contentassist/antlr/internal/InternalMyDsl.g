/*
 * generated by Xtext 2.32.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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

// Entry rule entryRuleRdP
entryRuleRdP
:
{ before(grammarAccess.getRdPRule()); }
	 ruleRdP
{ after(grammarAccess.getRdPRule()); } 
	 EOF 
;

// Rule RdP
ruleRdP 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRdPAccess().getGroup()); }
		(rule__RdP__Group__0)
		{ after(grammarAccess.getRdPAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArco
entryRuleArco
:
{ before(grammarAccess.getArcoRule()); }
	 ruleArco
{ after(grammarAccess.getArcoRule()); } 
	 EOF 
;

// Rule Arco
ruleArco 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArcoAccess().getAlternatives()); }
		(rule__Arco__Alternatives)
		{ after(grammarAccess.getArcoAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransicion
entryRuleTransicion
:
{ before(grammarAccess.getTransicionRule()); }
	 ruleTransicion
{ after(grammarAccess.getTransicionRule()); } 
	 EOF 
;

// Rule Transicion
ruleTransicion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransicionAccess().getGroup()); }
		(rule__Transicion__Group__0)
		{ after(grammarAccess.getTransicionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLugar
entryRuleLugar
:
{ before(grammarAccess.getLugarRule()); }
	 ruleLugar
{ after(grammarAccess.getLugarRule()); } 
	 EOF 
;

// Rule Lugar
ruleLugar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLugarAccess().getGroup()); }
		(rule__Lugar__Group__0)
		{ after(grammarAccess.getLugarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArco_Impl
entryRuleArco_Impl
:
{ before(grammarAccess.getArco_ImplRule()); }
	 ruleArco_Impl
{ after(grammarAccess.getArco_ImplRule()); } 
	 EOF 
;

// Rule Arco_Impl
ruleArco_Impl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArco_ImplAccess().getGroup()); }
		(rule__Arco_Impl__Group__0)
		{ after(grammarAccess.getArco_ImplAccess().getGroup()); }
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

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArcoTL
entryRuleArcoTL
:
{ before(grammarAccess.getArcoTLRule()); }
	 ruleArcoTL
{ after(grammarAccess.getArcoTLRule()); } 
	 EOF 
;

// Rule ArcoTL
ruleArcoTL 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArcoTLAccess().getGroup()); }
		(rule__ArcoTL__Group__0)
		{ after(grammarAccess.getArcoTLAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArcoLT
entryRuleArcoLT
:
{ before(grammarAccess.getArcoLTRule()); }
	 ruleArcoLT
{ after(grammarAccess.getArcoLTRule()); } 
	 EOF 
;

// Rule ArcoLT
ruleArcoLT 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArcoLTAccess().getGroup()); }
		(rule__ArcoLT__Group__0)
		{ after(grammarAccess.getArcoLTAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Arco__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArcoAccess().getArco_ImplParserRuleCall_0()); }
		ruleArco_Impl
		{ after(grammarAccess.getArcoAccess().getArco_ImplParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getArcoAccess().getArcoTLParserRuleCall_1()); }
		ruleArcoTL
		{ after(grammarAccess.getArcoAccess().getArcoTLParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getArcoAccess().getArcoLTParserRuleCall_2()); }
		ruleArcoLT
		{ after(grammarAccess.getArcoAccess().getArcoLTParserRuleCall_2()); }
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

rule__RdP__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__0__Impl
	rule__RdP__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getRdPKeyword_0()); }
	'RdP'
	{ after(grammarAccess.getRdPAccess().getRdPKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__1__Impl
	rule__RdP__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__2__Impl
	rule__RdP__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getTransicionesKeyword_2()); }
	'transiciones'
	{ after(grammarAccess.getRdPAccess().getTransicionesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__3__Impl
	rule__RdP__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__4__Impl
	rule__RdP__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getTransicionesAssignment_4()); }
	(rule__RdP__TransicionesAssignment_4)
	{ after(grammarAccess.getRdPAccess().getTransicionesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__5__Impl
	rule__RdP__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getGroup_5()); }
	(rule__RdP__Group_5__0)*
	{ after(grammarAccess.getRdPAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__6__Impl
	rule__RdP__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__7__Impl
	rule__RdP__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getLugaresKeyword_7()); }
	'lugares'
	{ after(grammarAccess.getRdPAccess().getLugaresKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__8__Impl
	rule__RdP__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_8()); }
	'{'
	{ after(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__9__Impl
	rule__RdP__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getLugaresAssignment_9()); }
	(rule__RdP__LugaresAssignment_9)
	{ after(grammarAccess.getRdPAccess().getLugaresAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__10__Impl
	rule__RdP__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getGroup_10()); }
	(rule__RdP__Group_10__0)*
	{ after(grammarAccess.getRdPAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__11__Impl
	rule__RdP__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__12__Impl
	rule__RdP__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getArcosKeyword_12()); }
	'arcos'
	{ after(grammarAccess.getRdPAccess().getArcosKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__13__Impl
	rule__RdP__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_13()); }
	'{'
	{ after(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__14__Impl
	rule__RdP__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getArcosAssignment_14()); }
	(rule__RdP__ArcosAssignment_14)
	{ after(grammarAccess.getRdPAccess().getArcosAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__15__Impl
	rule__RdP__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getGroup_15()); }
	(rule__RdP__Group_15__0)*
	{ after(grammarAccess.getRdPAccess().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__16__Impl
	rule__RdP__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_16()); }
	'}'
	{ after(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group__17__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_17()); }
	'}'
	{ after(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RdP__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group_5__0__Impl
	rule__RdP__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getRdPAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getTransicionesAssignment_5_1()); }
	(rule__RdP__TransicionesAssignment_5_1)
	{ after(grammarAccess.getRdPAccess().getTransicionesAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RdP__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group_10__0__Impl
	rule__RdP__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getCommaKeyword_10_0()); }
	','
	{ after(grammarAccess.getRdPAccess().getCommaKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getLugaresAssignment_10_1()); }
	(rule__RdP__LugaresAssignment_10_1)
	{ after(grammarAccess.getRdPAccess().getLugaresAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RdP__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group_15__0__Impl
	rule__RdP__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getCommaKeyword_15_0()); }
	','
	{ after(grammarAccess.getRdPAccess().getCommaKeyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RdP__Group_15__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRdPAccess().getArcosAssignment_15_1()); }
	(rule__RdP__ArcosAssignment_15_1)
	{ after(grammarAccess.getRdPAccess().getArcosAssignment_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transicion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transicion__Group__0__Impl
	rule__Transicion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransicionAccess().getTransicionAction_0()); }
	()
	{ after(grammarAccess.getTransicionAccess().getTransicionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transicion__Group__1__Impl
	rule__Transicion__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransicionAccess().getTransicionKeyword_1()); }
	'Transicion'
	{ after(grammarAccess.getTransicionAccess().getTransicionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transicion__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransicionAccess().getNameAssignment_2()); }
	(rule__Transicion__NameAssignment_2)
	{ after(grammarAccess.getTransicionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Lugar__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lugar__Group__0__Impl
	rule__Lugar__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLugarAccess().getLugarKeyword_0()); }
	'Lugar'
	{ after(grammarAccess.getLugarAccess().getLugarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lugar__Group__1__Impl
	rule__Lugar__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLugarAccess().getNameAssignment_1()); }
	(rule__Lugar__NameAssignment_1)
	{ after(grammarAccess.getLugarAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lugar__Group__2__Impl
	rule__Lugar__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLugarAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getLugarAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lugar__Group__3__Impl
	rule__Lugar__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLugarAccess().getMarcaKeyword_3()); }
	'marca'
	{ after(grammarAccess.getLugarAccess().getMarcaKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lugar__Group__4__Impl
	rule__Lugar__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLugarAccess().getMarcaAssignment_4()); }
	(rule__Lugar__MarcaAssignment_4)
	{ after(grammarAccess.getLugarAccess().getMarcaAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lugar__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLugarAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getLugarAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Arco_Impl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Arco_Impl__Group__0__Impl
	rule__Arco_Impl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Arco_Impl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArco_ImplAccess().getArcoKeyword_0()); }
	'Arco'
	{ after(grammarAccess.getArco_ImplAccess().getArcoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Arco_Impl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Arco_Impl__Group__1__Impl
	rule__Arco_Impl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Arco_Impl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArco_ImplAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getArco_ImplAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Arco_Impl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Arco_Impl__Group__2__Impl
	rule__Arco_Impl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Arco_Impl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArco_ImplAccess().getPesoKeyword_2()); }
	'peso'
	{ after(grammarAccess.getArco_ImplAccess().getPesoKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Arco_Impl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Arco_Impl__Group__3__Impl
	rule__Arco_Impl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Arco_Impl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArco_ImplAccess().getPesoAssignment_3()); }
	(rule__Arco_Impl__PesoAssignment_3)
	{ after(grammarAccess.getArco_ImplAccess().getPesoAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Arco_Impl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Arco_Impl__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Arco_Impl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArco_ImplAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getArco_ImplAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArcoTL__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoTL__Group__0__Impl
	rule__ArcoTL__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoTLAccess().getArcoTLKeyword_0()); }
	'ArcoTL'
	{ after(grammarAccess.getArcoTLAccess().getArcoTLKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoTL__Group__1__Impl
	rule__ArcoTL__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoTLAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getArcoTLAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoTL__Group__2__Impl
	rule__ArcoTL__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoTLAccess().getPesoKeyword_2()); }
	'peso'
	{ after(grammarAccess.getArcoTLAccess().getPesoKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoTL__Group__3__Impl
	rule__ArcoTL__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoTLAccess().getPesoAssignment_3()); }
	(rule__ArcoTL__PesoAssignment_3)
	{ after(grammarAccess.getArcoTLAccess().getPesoAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoTL__Group__4__Impl
	rule__ArcoTL__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoTLAccess().getOrigenKeyword_4()); }
	'origen'
	{ after(grammarAccess.getArcoTLAccess().getOrigenKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoTL__Group__5__Impl
	rule__ArcoTL__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoTLAccess().getOrigenAssignment_5()); }
	(rule__ArcoTL__OrigenAssignment_5)
	{ after(grammarAccess.getArcoTLAccess().getOrigenAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoTL__Group__6__Impl
	rule__ArcoTL__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoTLAccess().getDestinoKeyword_6()); }
	'destino'
	{ after(grammarAccess.getArcoTLAccess().getDestinoKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoTL__Group__7__Impl
	rule__ArcoTL__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoTLAccess().getDestinoAssignment_7()); }
	(rule__ArcoTL__DestinoAssignment_7)
	{ after(grammarAccess.getArcoTLAccess().getDestinoAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoTL__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoTLAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getArcoTLAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArcoLT__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoLT__Group__0__Impl
	rule__ArcoLT__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoLTAccess().getArcoLTKeyword_0()); }
	'ArcoLT'
	{ after(grammarAccess.getArcoLTAccess().getArcoLTKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoLT__Group__1__Impl
	rule__ArcoLT__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoLTAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getArcoLTAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoLT__Group__2__Impl
	rule__ArcoLT__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoLTAccess().getPesoKeyword_2()); }
	'peso'
	{ after(grammarAccess.getArcoLTAccess().getPesoKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoLT__Group__3__Impl
	rule__ArcoLT__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoLTAccess().getPesoAssignment_3()); }
	(rule__ArcoLT__PesoAssignment_3)
	{ after(grammarAccess.getArcoLTAccess().getPesoAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoLT__Group__4__Impl
	rule__ArcoLT__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoLTAccess().getOrigenKeyword_4()); }
	'origen'
	{ after(grammarAccess.getArcoLTAccess().getOrigenKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoLT__Group__5__Impl
	rule__ArcoLT__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoLTAccess().getOrigenAssignment_5()); }
	(rule__ArcoLT__OrigenAssignment_5)
	{ after(grammarAccess.getArcoLTAccess().getOrigenAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoLT__Group__6__Impl
	rule__ArcoLT__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoLTAccess().getDestinoKeyword_6()); }
	'destino'
	{ after(grammarAccess.getArcoLTAccess().getDestinoKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoLT__Group__7__Impl
	rule__ArcoLT__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoLTAccess().getDestinoAssignment_7()); }
	(rule__ArcoLT__DestinoAssignment_7)
	{ after(grammarAccess.getArcoLTAccess().getDestinoAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArcoLT__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArcoLTAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getArcoLTAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RdP__TransicionesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRdPAccess().getTransicionesTransicionParserRuleCall_4_0()); }
		ruleTransicion
		{ after(grammarAccess.getRdPAccess().getTransicionesTransicionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__TransicionesAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRdPAccess().getTransicionesTransicionParserRuleCall_5_1_0()); }
		ruleTransicion
		{ after(grammarAccess.getRdPAccess().getTransicionesTransicionParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__LugaresAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRdPAccess().getLugaresLugarParserRuleCall_9_0()); }
		ruleLugar
		{ after(grammarAccess.getRdPAccess().getLugaresLugarParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__LugaresAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRdPAccess().getLugaresLugarParserRuleCall_10_1_0()); }
		ruleLugar
		{ after(grammarAccess.getRdPAccess().getLugaresLugarParserRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__ArcosAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRdPAccess().getArcosArcoParserRuleCall_14_0()); }
		ruleArco
		{ after(grammarAccess.getRdPAccess().getArcosArcoParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RdP__ArcosAssignment_15_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRdPAccess().getArcosArcoParserRuleCall_15_1_0()); }
		ruleArco
		{ after(grammarAccess.getRdPAccess().getArcosArcoParserRuleCall_15_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransicionAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getTransicionAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLugarAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getLugarAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lugar__MarcaAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLugarAccess().getMarcaEIntParserRuleCall_4_0()); }
		ruleEInt
		{ after(grammarAccess.getLugarAccess().getMarcaEIntParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Arco_Impl__PesoAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArco_ImplAccess().getPesoEIntParserRuleCall_3_0()); }
		ruleEInt
		{ after(grammarAccess.getArco_ImplAccess().getPesoEIntParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__PesoAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArcoTLAccess().getPesoEIntParserRuleCall_3_0()); }
		ruleEInt
		{ after(grammarAccess.getArcoTLAccess().getPesoEIntParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__OrigenAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArcoTLAccess().getOrigenTransicionCrossReference_5_0()); }
		(
			{ before(grammarAccess.getArcoTLAccess().getOrigenTransicionEStringParserRuleCall_5_0_1()); }
			ruleEString
			{ after(grammarAccess.getArcoTLAccess().getOrigenTransicionEStringParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getArcoTLAccess().getOrigenTransicionCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoTL__DestinoAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArcoTLAccess().getDestinoLugarCrossReference_7_0()); }
		(
			{ before(grammarAccess.getArcoTLAccess().getDestinoLugarEStringParserRuleCall_7_0_1()); }
			ruleEString
			{ after(grammarAccess.getArcoTLAccess().getDestinoLugarEStringParserRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getArcoTLAccess().getDestinoLugarCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__PesoAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArcoLTAccess().getPesoEIntParserRuleCall_3_0()); }
		ruleEInt
		{ after(grammarAccess.getArcoLTAccess().getPesoEIntParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__OrigenAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArcoLTAccess().getOrigenLugarCrossReference_5_0()); }
		(
			{ before(grammarAccess.getArcoLTAccess().getOrigenLugarEStringParserRuleCall_5_0_1()); }
			ruleEString
			{ after(grammarAccess.getArcoLTAccess().getOrigenLugarEStringParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getArcoLTAccess().getOrigenLugarCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArcoLT__DestinoAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArcoLTAccess().getDestinoTransicionCrossReference_7_0()); }
		(
			{ before(grammarAccess.getArcoLTAccess().getDestinoTransicionEStringParserRuleCall_7_0_1()); }
			ruleEString
			{ after(grammarAccess.getArcoLTAccess().getDestinoTransicionEStringParserRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getArcoLTAccess().getDestinoTransicionCrossReference_7_0()); }
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
