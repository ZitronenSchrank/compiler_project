// Generated from c:\Users\petro\Projekte\While\compiler_project\Grammatik\While.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, T__3=4, WRITE=5, READ=6, WHILE=7, SUCC=8, PRED=9, 
		LOOP=10, DEFINE=11, VARIABLE=12, BEGIN=13, END=14, RETURN=15, ASSIGN=16, 
		SEMICOLON=17, ID=18, NUM=19, COMMENT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "WRITE", "READ", "WHILE", "SUCC", "PRED", 
			"LOOP", "DEFINE", "VARIABLE", "BEGIN", "END", "RETURN", "ASSIGN", "SEMICOLON", 
			"ID", "NUM", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "':'", "'write'", "'read'", "'while'", "'succ'", 
			"'pred'", "'loop'", "'def'", "'var'", "'begin'", "'end'", "'return'", 
			"':='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "WRITE", "READ", "WHILE", "SUCC", "PRED", 
			"LOOP", "DEFINE", "VARIABLE", "BEGIN", "END", "RETURN", "ASSIGN", "SEMICOLON", 
			"ID", "NUM", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\7\23v\n\23\f\23\16\23y\13\23\3\24\3\24\3\24\7\24~\n\24\f"+
		"\24\16\24\u0081\13\24\5\24\u0083\n\24\3\25\3\25\3\25\3\25\7\25\u0089\n"+
		"\25\f\25\16\25\u008c\13\25\3\25\3\25\3\26\6\26\u0091\n\26\r\26\16\26\u0092"+
		"\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\b\4\2C\\c|\5\2\62;"+
		"C\\c|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u009a\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3"+
		"\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r;\3\2\2\2\17@\3\2\2\2\21F\3\2\2\2\23"+
		"K\3\2\2\2\25P\3\2\2\2\27U\3\2\2\2\31Y\3\2\2\2\33]\3\2\2\2\35c\3\2\2\2"+
		"\37g\3\2\2\2!n\3\2\2\2#q\3\2\2\2%s\3\2\2\2\'\u0082\3\2\2\2)\u0084\3\2"+
		"\2\2+\u0090\3\2\2\2-.\7*\2\2.\4\3\2\2\2/\60\7+\2\2\60\6\3\2\2\2\61\62"+
		"\7.\2\2\62\b\3\2\2\2\63\64\7<\2\2\64\n\3\2\2\2\65\66\7y\2\2\66\67\7t\2"+
		"\2\678\7k\2\289\7v\2\29:\7g\2\2:\f\3\2\2\2;<\7t\2\2<=\7g\2\2=>\7c\2\2"+
		">?\7f\2\2?\16\3\2\2\2@A\7y\2\2AB\7j\2\2BC\7k\2\2CD\7n\2\2DE\7g\2\2E\20"+
		"\3\2\2\2FG\7u\2\2GH\7w\2\2HI\7e\2\2IJ\7e\2\2J\22\3\2\2\2KL\7r\2\2LM\7"+
		"t\2\2MN\7g\2\2NO\7f\2\2O\24\3\2\2\2PQ\7n\2\2QR\7q\2\2RS\7q\2\2ST\7r\2"+
		"\2T\26\3\2\2\2UV\7f\2\2VW\7g\2\2WX\7h\2\2X\30\3\2\2\2YZ\7x\2\2Z[\7c\2"+
		"\2[\\\7t\2\2\\\32\3\2\2\2]^\7d\2\2^_\7g\2\2_`\7i\2\2`a\7k\2\2ab\7p\2\2"+
		"b\34\3\2\2\2cd\7g\2\2de\7p\2\2ef\7f\2\2f\36\3\2\2\2gh\7t\2\2hi\7g\2\2"+
		"ij\7v\2\2jk\7w\2\2kl\7t\2\2lm\7p\2\2m \3\2\2\2no\7<\2\2op\7?\2\2p\"\3"+
		"\2\2\2qr\7=\2\2r$\3\2\2\2sw\t\2\2\2tv\t\3\2\2ut\3\2\2\2vy\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2x&\3\2\2\2yw\3\2\2\2z\u0083\7\62\2\2{\177\t\4\2\2|~\t"+
		"\5\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082z\3\2\2\2\u0082{\3\2\2\2\u0083(\3\2\2"+
		"\2\u0084\u0085\7\61\2\2\u0085\u0086\7\61\2\2\u0086\u008a\3\2\2\2\u0087"+
		"\u0089\n\6\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\b\25\2\2\u008e*\3\2\2\2\u008f\u0091\t\7\2\2\u0090\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0095\b\26\2\2\u0095,\3\2\2\2\t\2w\177\u0082\u008a\u0090"+
		"\u0092\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}