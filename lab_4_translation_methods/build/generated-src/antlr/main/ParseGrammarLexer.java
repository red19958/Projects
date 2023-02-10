// Generated from java-escape by ANTLR 4.11.1

import java.util.*;
import parseGrammar.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParseGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAMMAR=1, TOKEN_NAME=2, NAME=3, EPS=4, OR=5, COLON=6, SEMICOLON=7, BRACKET_OPEN=8, 
		BRACKET_CLOSE=9, SQUARE_OPEN=10, SQUARE_CLOSE=11, RETURNS=12, OPEN=13, 
		CLOSE=14, EXC=15, CODE=16, EXPR_ATTR=17, HERIT_ATTR=18, REGEXP=19, WHITESPACE=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GRAMMAR", "TOKEN_NAME", "NAME", "EPS", "OR", "COLON", "SEMICOLON", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "SQUARE_OPEN", "SQUARE_CLOSE", "RETURNS", "OPEN", "CLOSE", 
			"EXC", "CODE", "EXPR_ATTR", "HERIT_ATTR", "REGEXP", "WHITESPACE"
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


	public ParseGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParseGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u00013\b\u0001\u000b\u0001\f\u00014\u0001\u0002\u0004"+
		"\u00028\b\u0002\u000b\u0002\f\u00029\u0001\u0002\u0005\u0002=\b\u0002"+
		"\n\u0002\f\u0002@\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000f]\b\u000f\n\u000f\f\u000f`\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010f\b\u0010\n\u0010"+
		"\f\u0010i\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005"+
		"\u0011o\b\u0011\n\u0011\f\u0011r\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0005\u0012x\b\u0012\n\u0012\f\u0012{\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u0080\b\u0013\u000b\u0013\f"+
		"\u0013\u0081\u0001\u0013\u0001\u0013\u0004^gpy\u0000\u0014\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0003\u0001\u0000"+
		"AZ\u0001\u0000az\u0003\u0000\t\n\r\r  \u008c\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u00032\u0001\u0000\u0000\u0000"+
		"\u00057\u0001\u0000\u0000\u0000\u0007A\u0001\u0000\u0000\u0000\tC\u0001"+
		"\u0000\u0000\u0000\u000bE\u0001\u0000\u0000\u0000\rG\u0001\u0000\u0000"+
		"\u0000\u000fI\u0001\u0000\u0000\u0000\u0011K\u0001\u0000\u0000\u0000\u0013"+
		"M\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017Q\u0001"+
		"\u0000\u0000\u0000\u0019T\u0001\u0000\u0000\u0000\u001bV\u0001\u0000\u0000"+
		"\u0000\u001dX\u0001\u0000\u0000\u0000\u001fZ\u0001\u0000\u0000\u0000!"+
		"c\u0001\u0000\u0000\u0000#l\u0001\u0000\u0000\u0000%u\u0001\u0000\u0000"+
		"\u0000\'\u007f\u0001\u0000\u0000\u0000)*\u0005g\u0000\u0000*+\u0005r\u0000"+
		"\u0000+,\u0005a\u0000\u0000,-\u0005m\u0000\u0000-.\u0005m\u0000\u0000"+
		"./\u0005a\u0000\u0000/0\u0005r\u0000\u00000\u0002\u0001\u0000\u0000\u0000"+
		"13\u0007\u0000\u0000\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\u0004\u0001"+
		"\u0000\u0000\u000068\u0007\u0001\u0000\u000076\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:>\u0001\u0000\u0000\u0000;=\u0007\u0000\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?\u0006\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000AB\u0005~\u0000\u0000B\b\u0001\u0000\u0000\u0000CD\u0005|\u0000"+
		"\u0000D\n\u0001\u0000\u0000\u0000EF\u0005:\u0000\u0000F\f\u0001\u0000"+
		"\u0000\u0000GH\u0005;\u0000\u0000H\u000e\u0001\u0000\u0000\u0000IJ\u0005"+
		"{\u0000\u0000J\u0010\u0001\u0000\u0000\u0000KL\u0005}\u0000\u0000L\u0012"+
		"\u0001\u0000\u0000\u0000MN\u0005[\u0000\u0000N\u0014\u0001\u0000\u0000"+
		"\u0000OP\u0005]\u0000\u0000P\u0016\u0001\u0000\u0000\u0000QR\u0005-\u0000"+
		"\u0000RS\u0005>\u0000\u0000S\u0018\u0001\u0000\u0000\u0000TU\u0005(\u0000"+
		"\u0000U\u001a\u0001\u0000\u0000\u0000VW\u0005)\u0000\u0000W\u001c\u0001"+
		"\u0000\u0000\u0000XY\u0005!\u0000\u0000Y\u001e\u0001\u0000\u0000\u0000"+
		"Z^\u0003\u000f\u0007\u0000[]\t\u0000\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]`\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0003"+
		"\u0011\b\u0000b \u0001\u0000\u0000\u0000cg\u0003\u0013\t\u0000df\t\u0000"+
		"\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jk\u0003\u0015\n\u0000k\"\u0001\u0000\u0000"+
		"\u0000lp\u0003\u0019\f\u0000mo\t\u0000\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0003"+
		"\u001b\r\u0000t$\u0001\u0000\u0000\u0000uy\u0005\"\u0000\u0000vx\t\u0000"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|}\u0005\"\u0000\u0000}&\u0001\u0000\u0000\u0000"+
		"~\u0080\u0007\u0002\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0006\u0013\u0000\u0000\u0084(\u0001\u0000\u0000\u0000\t\u000049>^gp"+
		"y\u0081\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}