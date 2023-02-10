// Generated from java-escape by ANTLR 4.11.1

import java.util.*;
import parseGrammar.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParseGrammarParser}.
 */
public interface ParseGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#parseGrammar}.
	 * @param ctx the parse tree
	 */
	void enterParseGrammar(ParseGrammarParser.ParseGrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#parseGrammar}.
	 * @param ctx the parse tree
	 */
	void exitParseGrammar(ParseGrammarParser.ParseGrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void enterGrammarName(ParseGrammarParser.GrammarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void exitGrammarName(ParseGrammarParser.GrammarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(ParseGrammarParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(ParseGrammarParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(ParseGrammarParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(ParseGrammarParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void enterTerminalRule(ParseGrammarParser.TerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void exitTerminalRule(ParseGrammarParser.TerminalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ParseGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ParseGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(ParseGrammarParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(ParseGrammarParser.RegexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalRule(ParseGrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalRule(ParseGrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(ParseGrammarParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(ParseGrammarParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(ParseGrammarParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(ParseGrammarParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#eps}.
	 * @param ctx the parse tree
	 */
	void enterEps(ParseGrammarParser.EpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#eps}.
	 * @param ctx the parse tree
	 */
	void exitEps(ParseGrammarParser.EpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(ParseGrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(ParseGrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(ParseGrammarParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(ParseGrammarParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseGrammarParser#heritableAttr}.
	 * @param ctx the parse tree
	 */
	void enterHeritableAttr(ParseGrammarParser.HeritableAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseGrammarParser#heritableAttr}.
	 * @param ctx the parse tree
	 */
	void exitHeritableAttr(ParseGrammarParser.HeritableAttrContext ctx);
}