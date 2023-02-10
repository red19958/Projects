// Generated from java-escape by ANTLR 4.11.1

import java.util.*;
import parseGrammar.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParseGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAMMAR=1, TOKEN_NAME=2, NAME=3, EPS=4, OR=5, COLON=6, SEMICOLON=7, BRACKET_OPEN=8, 
		BRACKET_CLOSE=9, SQUARE_OPEN=10, SQUARE_CLOSE=11, RETURNS=12, OPEN=13, 
		CLOSE=14, EXC=15, CODE=16, EXPR_ATTR=17, HERIT_ATTR=18, REGEXP=19, WHITESPACE=20;
	public static final int
		RULE_parseGrammar = 0, RULE_grammarName = 1, RULE_rules = 2, RULE_grammarRule = 3, 
		RULE_terminalRule = 4, RULE_name = 5, RULE_regexp = 6, RULE_nonTerminalRule = 7, 
		RULE_rule = 8, RULE_product = 9, RULE_eps = 10, RULE_code = 11, RULE_attr = 12, 
		RULE_heritableAttr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"parseGrammar", "grammarName", "rules", "grammarRule", "terminalRule", 
			"name", "regexp", "nonTerminalRule", "rule", "product", "eps", "code", 
			"attr", "heritableAttr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", null, null, "'~'", "'|'", "':'", "';'", "'{'", "'}'", 
			"'['", "']'", "'->'", "'('", "')'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GRAMMAR", "TOKEN_NAME", "NAME", "EPS", "OR", "COLON", "SEMICOLON", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "SQUARE_OPEN", "SQUARE_CLOSE", "RETURNS", 
			"OPEN", "CLOSE", "EXC", "CODE", "EXPR_ATTR", "HERIT_ATTR", "REGEXP", 
			"WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParseGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseGrammarContext extends ParserRuleContext {
		public Grammar grammar;
		public GrammarNameContext grammarName;
		public GrammarNameContext grammarName() {
			return getRuleContext(GrammarNameContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ParseGrammarParser.EOF, 0); }
		public ParseGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterParseGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitParseGrammar(this);
		}
	}

	public final ParseGrammarContext parseGrammar() throws RecognitionException {
		ParseGrammarContext _localctx = new ParseGrammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parseGrammar);

		    Grammar grammar = new Grammar();
		    ((ParseGrammarContext)_localctx).grammar =  grammar;

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((ParseGrammarContext)_localctx).grammarName = grammarName();
			setState(29);
			rules(grammar);
			 _localctx.grammar.setNameGrammar(((ParseGrammarContext)_localctx).grammarName.nameGrammar); 
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GrammarNameContext extends ParserRuleContext {
		public String nameGrammar;
		public NameContext name;
		public TerminalNode GRAMMAR() { return getToken(ParseGrammarParser.GRAMMAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParseGrammarParser.SEMICOLON, 0); }
		public GrammarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterGrammarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitGrammarName(this);
		}
	}

	public final GrammarNameContext grammarName() throws RecognitionException {
		GrammarNameContext _localctx = new GrammarNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(GRAMMAR);
			setState(34);
			((GrammarNameContext)_localctx).name = name();
			setState(35);
			match(SEMICOLON);
			 ((GrammarNameContext)_localctx).nameGrammar =  (((GrammarNameContext)_localctx).name!=null?_input.getText(((GrammarNameContext)_localctx).name.start,((GrammarNameContext)_localctx).name.stop):null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulesContext extends ParserRuleContext {
		public Grammar grammar;
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RulesContext(ParserRuleContext parent, int invokingState, Grammar grammar) {
			super(parent, invokingState);
			this.grammar = grammar;
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitRules(this);
		}
	}

	public final RulesContext rules(Grammar grammar) throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState(), grammar);
		enterRule(_localctx, 4, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_NAME || _la==NAME) {
				{
				{
				setState(38);
				grammarRule(grammar);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GrammarRuleContext extends ParserRuleContext {
		public Grammar grammar;
		public TerminalRuleContext terminalRule() {
			return getRuleContext(TerminalRuleContext.class,0);
		}
		public NonTerminalRuleContext nonTerminalRule() {
			return getRuleContext(NonTerminalRuleContext.class,0);
		}
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrammarRuleContext(ParserRuleContext parent, int invokingState, Grammar grammar) {
			super(parent, invokingState);
			this.grammar = grammar;
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitGrammarRule(this);
		}
	}

	public final GrammarRuleContext grammarRule(Grammar grammar) throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState(), grammar);
		enterRule(_localctx, 6, RULE_grammarRule);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				terminalRule(grammar);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				nonTerminalRule(grammar);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminalRuleContext extends ParserRuleContext {
		public Grammar grammar;
		public NameContext name;
		public RegexpContext regexp;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ParseGrammarParser.COLON, 0); }
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParseGrammarParser.SEMICOLON, 0); }
		public TerminalRuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TerminalRuleContext(ParserRuleContext parent, int invokingState, Grammar grammar) {
			super(parent, invokingState);
			this.grammar = grammar;
		}
		@Override public int getRuleIndex() { return RULE_terminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitTerminalRule(this);
		}
	}

	public final TerminalRuleContext terminalRule(Grammar grammar) throws RecognitionException {
		TerminalRuleContext _localctx = new TerminalRuleContext(_ctx, getState(), grammar);
		enterRule(_localctx, 8, RULE_terminalRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((TerminalRuleContext)_localctx).name = name();
			setState(49);
			match(COLON);
			setState(50);
			((TerminalRuleContext)_localctx).regexp = regexp();
			setState(51);
			match(SEMICOLON);
			 _localctx.grammar.addToken((((TerminalRuleContext)_localctx).name!=null?_input.getText(((TerminalRuleContext)_localctx).name.start,((TerminalRuleContext)_localctx).name.stop):null), (((TerminalRuleContext)_localctx).regexp!=null?_input.getText(((TerminalRuleContext)_localctx).regexp.start,((TerminalRuleContext)_localctx).regexp.stop):null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ParseGrammarParser.NAME, 0); }
		public TerminalNode TOKEN_NAME() { return getToken(ParseGrammarParser.TOKEN_NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_NAME || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegexpContext extends ParserRuleContext {
		public TerminalNode REGEXP() { return getToken(ParseGrammarParser.REGEXP, 0); }
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitRegexp(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		RegexpContext _localctx = new RegexpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_regexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(REGEXP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonTerminalRuleContext extends ParserRuleContext {
		public Grammar grammar;
		public NameContext name;
		public HeritableAttrContext heritableAttr;
		public AttrContext attr;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public HeritableAttrContext heritableAttr() {
			return getRuleContext(HeritableAttrContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ParseGrammarParser.COLON, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(ParseGrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> OR() { return getTokens(ParseGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ParseGrammarParser.OR, i);
		}
		public NonTerminalRuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NonTerminalRuleContext(ParserRuleContext parent, int invokingState, Grammar grammar) {
			super(parent, invokingState);
			this.grammar = grammar;
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterNonTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitNonTerminalRule(this);
		}
	}

	public final NonTerminalRuleContext nonTerminalRule(Grammar grammar) throws RecognitionException {
		NonTerminalRuleContext _localctx = new NonTerminalRuleContext(_ctx, getState(), grammar);
		enterRule(_localctx, 14, RULE_nonTerminalRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((NonTerminalRuleContext)_localctx).name = name();
			setState(59);
			((NonTerminalRuleContext)_localctx).heritableAttr = heritableAttr();
			setState(60);
			((NonTerminalRuleContext)_localctx).attr = attr();
			RuleSignature ruleSignature = new RuleSignature((((NonTerminalRuleContext)_localctx).name!=null?_input.getText(((NonTerminalRuleContext)_localctx).name.start,((NonTerminalRuleContext)_localctx).name.stop):null), (((NonTerminalRuleContext)_localctx).attr!=null?_input.getText(((NonTerminalRuleContext)_localctx).attr.start,((NonTerminalRuleContext)_localctx).attr.stop):null), (((NonTerminalRuleContext)_localctx).heritableAttr!=null?_input.getText(((NonTerminalRuleContext)_localctx).heritableAttr.start,((NonTerminalRuleContext)_localctx).heritableAttr.stop):null));
			setState(62);
			match(COLON);
			setState(63);
			rule_(grammar, ruleSignature);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(64);
				match(OR);
				setState(65);
				rule_(grammar, ruleSignature);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleContext extends ParserRuleContext {
		public Grammar grammar;
		public RuleSignature n;
		public ProductContext product;
		public CodeContext code;
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public EpsContext eps() {
			return getRuleContext(EpsContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RuleContext(ParserRuleContext parent, int invokingState, Grammar grammar, RuleSignature n) {
			super(parent, invokingState);
			this.grammar = grammar;
			this.n = n;
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitRule(this);
		}
	}

	public final RuleContext rule_(Grammar grammar,RuleSignature n) throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState(), grammar, n);
		enterRule(_localctx, 16, RULE_rule);

		    List<Product> productions = new ArrayList<>();

		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_NAME:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					((RuleContext)_localctx).product = product();
					 productions.add(((RuleContext)_localctx).product.production); 
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TOKEN_NAME || _la==NAME );
				 _localctx.grammar.putRuleSelector(_localctx.n, new RuleSelector(productions)); 
				}
				break;
			case EPS:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				eps();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(83);
					((RuleContext)_localctx).code = code();
					}
				}

				 _localctx.grammar.putRuleSelector(_localctx.n, new RuleSelector(List.of(new Product(List.of(), (((RuleContext)_localctx).code!=null?_input.getText(((RuleContext)_localctx).code.start,((RuleContext)_localctx).code.stop):null))))); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductContext extends ParserRuleContext {
		public Product production;
		public NameContext name;
		public HeritableAttrContext heritableAttr;
		public CodeContext code;
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<HeritableAttrContext> heritableAttr() {
			return getRuleContexts(HeritableAttrContext.class);
		}
		public HeritableAttrContext heritableAttr(int i) {
			return getRuleContext(HeritableAttrContext.class,i);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_product);

		    List<RuleCalling> ruleCallings = new ArrayList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				((ProductContext)_localctx).name = name();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HERIT_ATTR) {
					{
					setState(91);
					((ProductContext)_localctx).heritableAttr = heritableAttr();
					}
				}

				 ruleCallings.add(new RuleCalling((((ProductContext)_localctx).name!=null?_input.getText(((ProductContext)_localctx).name.start,((ProductContext)_localctx).name.stop):null), (((ProductContext)_localctx).heritableAttr!=null?_input.getText(((ProductContext)_localctx).heritableAttr.start,((ProductContext)_localctx).heritableAttr.stop):null))); 
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_NAME || _la==NAME );
			setState(100);
			((ProductContext)_localctx).code = code();
			 ((ProductContext)_localctx).production =  new Product(ruleCallings, (((ProductContext)_localctx).code!=null?_input.getText(((ProductContext)_localctx).code.start,((ProductContext)_localctx).code.stop):null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EpsContext extends ParserRuleContext {
		public TerminalNode EPS() { return getToken(ParseGrammarParser.EPS, 0); }
		public EpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterEps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitEps(this);
		}
	}

	public final EpsContext eps() throws RecognitionException {
		EpsContext _localctx = new EpsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(EPS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(ParseGrammarParser.CODE, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(CODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrContext extends ParserRuleContext {
		public TerminalNode EXPR_ATTR() { return getToken(ParseGrammarParser.EXPR_ATTR, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(EXPR_ATTR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeritableAttrContext extends ParserRuleContext {
		public TerminalNode HERIT_ATTR() { return getToken(ParseGrammarParser.HERIT_ATTR, 0); }
		public HeritableAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heritableAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).enterHeritableAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseGrammarListener ) ((ParseGrammarListener)listener).exitHeritableAttr(this);
		}
	}

	public final HeritableAttrContext heritableAttr() throws RecognitionException {
		HeritableAttrContext _localctx = new HeritableAttrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_heritableAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(HERIT_ATTR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014p\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0005\u0002(\b\u0002\n\u0002\f\u0002+\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003/\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007C\b\u0007\n\u0007\f\u0007"+
		"F\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\bM\b\b"+
		"\u000b\b\f\bN\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bU\b\b\u0001\b\u0001"+
		"\b\u0003\bY\b\b\u0001\t\u0001\t\u0003\t]\b\t\u0001\t\u0001\t\u0004\ta"+
		"\b\t\u000b\t\f\tb\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u0000\u0001\u0001\u0000\u0002\u0003i\u0000\u001c\u0001\u0000\u0000\u0000"+
		"\u0002!\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006."+
		"\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000"+
		"\u0000\f8\u0001\u0000\u0000\u0000\u000e:\u0001\u0000\u0000\u0000\u0010"+
		"X\u0001\u0000\u0000\u0000\u0012`\u0001\u0000\u0000\u0000\u0014g\u0001"+
		"\u0000\u0000\u0000\u0016i\u0001\u0000\u0000\u0000\u0018k\u0001\u0000\u0000"+
		"\u0000\u001am\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000"+
		"\u001d\u001e\u0003\u0004\u0002\u0000\u001e\u001f\u0006\u0000\uffff\uffff"+
		"\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!"+
		"\"\u0005\u0001\u0000\u0000\"#\u0003\n\u0005\u0000#$\u0005\u0007\u0000"+
		"\u0000$%\u0006\u0001\uffff\uffff\u0000%\u0003\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0006\u0003\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0005\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,/\u0003\b\u0004\u0000-/\u0003"+
		"\u000e\u0007\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000"+
		"/\u0007\u0001\u0000\u0000\u000001\u0003\n\u0005\u000012\u0005\u0006\u0000"+
		"\u000023\u0003\f\u0006\u000034\u0005\u0007\u0000\u000045\u0006\u0004\uffff"+
		"\uffff\u00005\t\u0001\u0000\u0000\u000067\u0007\u0000\u0000\u00007\u000b"+
		"\u0001\u0000\u0000\u000089\u0005\u0013\u0000\u00009\r\u0001\u0000\u0000"+
		"\u0000:;\u0003\n\u0005\u0000;<\u0003\u001a\r\u0000<=\u0003\u0018\f\u0000"+
		"=>\u0006\u0007\uffff\uffff\u0000>?\u0005\u0006\u0000\u0000?D\u0003\u0010"+
		"\b\u0000@A\u0005\u0005\u0000\u0000AC\u0003\u0010\b\u0000B@\u0001\u0000"+
		"\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"GH\u0005\u0007\u0000\u0000H\u000f\u0001\u0000\u0000\u0000IJ\u0003\u0012"+
		"\t\u0000JK\u0006\b\uffff\uffff\u0000KM\u0001\u0000\u0000\u0000LI\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0006\b\uffff\uffff"+
		"\u0000QY\u0001\u0000\u0000\u0000RT\u0003\u0014\n\u0000SU\u0003\u0016\u000b"+
		"\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VW\u0006\b\uffff\uffff\u0000WY\u0001\u0000\u0000\u0000XL\u0001"+
		"\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000Y\u0011\u0001\u0000\u0000"+
		"\u0000Z\\\u0003\n\u0005\u0000[]\u0003\u001a\r\u0000\\[\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0006\t"+
		"\uffff\uffff\u0000_a\u0001\u0000\u0000\u0000`Z\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0003\u0016\u000b\u0000ef\u0006\t\uffff"+
		"\uffff\u0000f\u0013\u0001\u0000\u0000\u0000gh\u0005\u0004\u0000\u0000"+
		"h\u0015\u0001\u0000\u0000\u0000ij\u0005\u0010\u0000\u0000j\u0017\u0001"+
		"\u0000\u0000\u0000kl\u0005\u0011\u0000\u0000l\u0019\u0001\u0000\u0000"+
		"\u0000mn\u0005\u0012\u0000\u0000n\u001b\u0001\u0000\u0000\u0000\b).DN"+
		"TX\\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}