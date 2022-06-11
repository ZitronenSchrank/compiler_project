// Generated from /home/zitrone/Documents/OwnProjects/WhileProjects/compiler_project/Grammatik/While.g4 by ANTLR 4.8
package de.hfu.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WhileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WRITE=3, READ=4, WHILE=5, SUCC=6, PRED=7, LOOP=8, DEFINE=9, 
		VARIABLE=10, BEGIN=11, END=12, RETURN=13, COLON=14, EQUAL=15, COMMA=16, 
		ASSIGN=17, SEMICOLON=18, MINUS=19, PLUS=20, ID=21, NUM=22, COMMENT=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WRITE", "READ", "WHILE", "SUCC", "PRED", "LOOP", "DEFINE", 
			"VARIABLE", "BEGIN", "END", "RETURN", "COLON", "EQUAL", "COMMA", "ASSIGN", 
			"SEMICOLON", "MINUS", "PLUS", "ID", "NUM", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'write'", "'read'", "'while'", "'succ'", "'pred'", 
			"'loop'", "'def'", "'var'", "'begin'", "'end'", "'return'", "':'", "'='", 
			"','", null, "';'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WRITE", "READ", "WHILE", "SUCC", "PRED", "LOOP", "DEFINE", 
			"VARIABLE", "BEGIN", "END", "RETURN", "COLON", "EQUAL", "COMMA", "ASSIGN", 
			"SEMICOLON", "MINUS", "PLUS", "ID", "NUM", "COMMENT", "WS"
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


	public WhileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "While.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\7\26"+
		"\u0082\n\26\f\26\16\26\u0085\13\26\3\27\3\27\3\27\7\27\u008a\n\27\f\27"+
		"\16\27\u008d\13\27\5\27\u008f\n\27\3\30\3\30\3\30\3\30\7\30\u0095\n\30"+
		"\f\30\16\30\u0098\13\30\3\30\3\30\3\31\6\31\u009d\n\31\r\31\16\31\u009e"+
		"\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\b\5\2"+
		"C\\aac|\7\2//\62;C\\aac|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\2\u00a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t=\3"+
		"\2\2\2\13B\3\2\2\2\rH\3\2\2\2\17M\3\2\2\2\21R\3\2\2\2\23W\3\2\2\2\25["+
		"\3\2\2\2\27_\3\2\2\2\31e\3\2\2\2\33i\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!"+
		"t\3\2\2\2#v\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)}\3\2\2\2+\177\3\2\2\2-\u008e"+
		"\3\2\2\2/\u0090\3\2\2\2\61\u009c\3\2\2\2\63\64\7*\2\2\64\4\3\2\2\2\65"+
		"\66\7+\2\2\66\6\3\2\2\2\678\7y\2\289\7t\2\29:\7k\2\2:;\7v\2\2;<\7g\2\2"+
		"<\b\3\2\2\2=>\7t\2\2>?\7g\2\2?@\7c\2\2@A\7f\2\2A\n\3\2\2\2BC\7y\2\2CD"+
		"\7j\2\2DE\7k\2\2EF\7n\2\2FG\7g\2\2G\f\3\2\2\2HI\7u\2\2IJ\7w\2\2JK\7e\2"+
		"\2KL\7e\2\2L\16\3\2\2\2MN\7r\2\2NO\7t\2\2OP\7g\2\2PQ\7f\2\2Q\20\3\2\2"+
		"\2RS\7n\2\2ST\7q\2\2TU\7q\2\2UV\7r\2\2V\22\3\2\2\2WX\7f\2\2XY\7g\2\2Y"+
		"Z\7h\2\2Z\24\3\2\2\2[\\\7x\2\2\\]\7c\2\2]^\7t\2\2^\26\3\2\2\2_`\7d\2\2"+
		"`a\7g\2\2ab\7i\2\2bc\7k\2\2cd\7p\2\2d\30\3\2\2\2ef\7g\2\2fg\7p\2\2gh\7"+
		"f\2\2h\32\3\2\2\2ij\7t\2\2jk\7g\2\2kl\7v\2\2lm\7w\2\2mn\7t\2\2no\7p\2"+
		"\2o\34\3\2\2\2pq\7<\2\2q\36\3\2\2\2rs\7?\2\2s \3\2\2\2tu\7.\2\2u\"\3\2"+
		"\2\2vw\5\35\17\2wx\5\37\20\2x$\3\2\2\2yz\7=\2\2z&\3\2\2\2{|\7/\2\2|(\3"+
		"\2\2\2}~\7-\2\2~*\3\2\2\2\177\u0083\t\2\2\2\u0080\u0082\t\3\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084,\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008f\7\62\2\2\u0087\u008b"+
		"\t\4\2\2\u0088\u008a\t\5\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0086\3\2\2\2\u008e\u0087\3\2\2\2\u008f.\3\2\2\2\u0090\u0091"+
		"\7\61\2\2\u0091\u0092\7\61\2\2\u0092\u0096\3\2\2\2\u0093\u0095\n\6\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\b\30\2\2"+
		"\u009a\60\3\2\2\2\u009b\u009d\t\7\2\2\u009c\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\b\31\2\2\u00a1\62\3\2\2\2\t\2\u0083\u008b\u008e\u0096\u009c\u009e"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}