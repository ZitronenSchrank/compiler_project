// Generated from c:\Users\petro\Projekte\While\compiler_project\Grammatik\While.g4 by ANTLR 4.8
package de.hfu.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WhileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WRITE=5, READ=6, WHILE=7, SUCC=8, PRED=9, 
		LOOP=10, DEFINE=11, VARIABLE=12, BEGIN=13, END=14, RETURN=15, ASSIGN=16, 
		SEMICOLON=17, ID=18, NUM=19, COMMENT=20, WS=21;
	public static final int
		RULE_prog = 0, RULE_read = 1, RULE_write = 2, RULE_succ = 3, RULE_pred = 4, 
		RULE_callFunction = 5, RULE_defFunction = 6, RULE_decFunction = 7, RULE_defVar = 8, 
		RULE_defParameters = 9, RULE_callParameters = 10, RULE_whl = 11, RULE_loop = 12, 
		RULE_assign = 13, RULE_expr = 14, RULE_statement = 15, RULE_retStatement = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "read", "write", "succ", "pred", "callFunction", "defFunction", 
			"decFunction", "defVar", "defParameters", "callParameters", "whl", "loop", 
			"assign", "expr", "statement", "retStatement"
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

	@Override
	public String getGrammarFileName() { return "While.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WhileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(WhileParser.EOF, 0); }
		public List<DecFunctionContext> decFunction() {
			return getRuleContexts(DecFunctionContext.class);
		}
		public DecFunctionContext decFunction(int i) {
			return getRuleContext(DecFunctionContext.class,i);
		}
		public List<DefFunctionContext> defFunction() {
			return getRuleContexts(DefFunctionContext.class);
		}
		public DefFunctionContext defFunction(int i) {
			return getRuleContext(DefFunctionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << DEFINE) | (1L << VARIABLE) | (1L << ID))) != 0)) {
				{
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(34);
					decFunction();
					}
					break;
				case 2:
					{
					setState(35);
					defFunction();
					}
					break;
				case 3:
					{
					setState(36);
					statement();
					}
					break;
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(WhileParser.READ, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(READ);
			setState(45);
			match(T__0);
			setState(46);
			match(T__1);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(WhileParser.WRITE, 0); }
		public List<TerminalNode> ID() { return getTokens(WhileParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WhileParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(WhileParser.SEMICOLON, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(WRITE);
			setState(49);
			match(T__0);
			setState(50);
			match(ID);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(51);
				match(T__2);
				setState(52);
				match(ID);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(T__1);
			setState(59);
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

	public static class SuccContext extends ParserRuleContext {
		public TerminalNode SUCC() { return getToken(WhileParser.SUCC, 0); }
		public TerminalNode ID() { return getToken(WhileParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(WhileParser.SEMICOLON, 0); }
		public SuccContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_succ; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitSucc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuccContext succ() throws RecognitionException {
		SuccContext _localctx = new SuccContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_succ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(SUCC);
			setState(62);
			match(T__0);
			setState(63);
			match(ID);
			setState(64);
			match(T__1);
			setState(65);
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

	public static class PredContext extends ParserRuleContext {
		public TerminalNode PRED() { return getToken(WhileParser.PRED, 0); }
		public TerminalNode ID() { return getToken(WhileParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(WhileParser.SEMICOLON, 0); }
		public PredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pred; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitPred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredContext pred() throws RecognitionException {
		PredContext _localctx = new PredContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(PRED);
			setState(68);
			match(T__0);
			setState(69);
			match(ID);
			setState(70);
			match(T__1);
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

	public static class CallFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WhileParser.ID, 0); }
		public CallParametersContext callParameters() {
			return getRuleContext(CallParametersContext.class,0);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
			setState(74);
			match(T__0);
			setState(75);
			callParameters();
			setState(76);
			match(T__1);
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

	public static class DefFunctionContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(WhileParser.DEFINE, 0); }
		public TerminalNode ID() { return getToken(WhileParser.ID, 0); }
		public DefParametersContext defParameters() {
			return getRuleContext(DefParametersContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(WhileParser.BEGIN, 0); }
		public RetStatementContext retStatement() {
			return getRuleContext(RetStatementContext.class,0);
		}
		public TerminalNode END() { return getToken(WhileParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitDefFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefFunctionContext defFunction() throws RecognitionException {
		DefFunctionContext _localctx = new DefFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defFunction);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(DEFINE);
				setState(79);
				match(ID);
				setState(80);
				match(T__0);
				setState(81);
				defParameters();
				setState(82);
				match(T__1);
				setState(83);
				match(BEGIN);
				setState(84);
				match(T__3);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
					{
					{
					setState(85);
					statement();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				retStatement();
				setState(92);
				match(END);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(ID);
				setState(95);
				match(T__0);
				setState(96);
				defParameters();
				setState(97);
				match(T__1);
				setState(98);
				match(BEGIN);
				setState(99);
				match(T__3);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
					{
					{
					setState(100);
					statement();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				retStatement();
				setState(107);
				match(END);
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

	public static class DecFunctionContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(WhileParser.DEFINE, 0); }
		public TerminalNode ID() { return getToken(WhileParser.ID, 0); }
		public DefParametersContext defParameters() {
			return getRuleContext(DefParametersContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(WhileParser.SEMICOLON, 0); }
		public DecFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitDecFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecFunctionContext decFunction() throws RecognitionException {
		DecFunctionContext _localctx = new DecFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(DEFINE);
			setState(112);
			match(ID);
			setState(113);
			match(T__0);
			setState(114);
			defParameters();
			setState(115);
			match(T__1);
			setState(116);
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

	public static class DefVarContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(WhileParser.VARIABLE, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DefVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitDefVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefVarContext defVar() throws RecognitionException {
		DefVarContext _localctx = new DefVarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(VARIABLE);
			setState(119);
			assign();
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

	public static class DefParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(WhileParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WhileParser.ID, i);
		}
		public DefParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitDefParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefParametersContext defParameters() throws RecognitionException {
		DefParametersContext _localctx = new DefParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ID);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(122);
				match(T__2);
				setState(123);
				match(ID);
				}
				}
				setState(128);
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

	public static class CallParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(WhileParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WhileParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(WhileParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(WhileParser.NUM, i);
		}
		public CallParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitCallParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParametersContext callParameters() throws RecognitionException {
		CallParametersContext _localctx = new CallParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(130);
				match(T__2);
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(136);
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

	public static class WhlContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(WhileParser.WHILE, 0); }
		public TerminalNode ID() { return getToken(WhileParser.ID, 0); }
		public TerminalNode BEGIN() { return getToken(WhileParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(WhileParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitWhl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhlContext whl() throws RecognitionException {
		WhlContext _localctx = new WhlContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(WHILE);
			setState(138);
			match(T__0);
			setState(139);
			match(ID);
			setState(140);
			match(T__1);
			setState(141);
			match(BEGIN);
			setState(142);
			match(T__3);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
				{
				{
				setState(143);
				statement();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(END);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(WhileParser.LOOP, 0); }
		public TerminalNode ID() { return getToken(WhileParser.ID, 0); }
		public TerminalNode BEGIN() { return getToken(WhileParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(WhileParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(LOOP);
			setState(152);
			match(T__0);
			setState(153);
			match(ID);
			setState(154);
			match(T__1);
			setState(155);
			match(BEGIN);
			setState(156);
			match(T__3);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
				{
				{
				setState(157);
				statement();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(END);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WhileParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(WhileParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(WhileParser.SEMICOLON, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ID);
			setState(166);
			match(ASSIGN);
			setState(167);
			expr();
			setState(168);
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

	public static class ExprContext extends ParserRuleContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public TerminalNode ID() { return getToken(WhileParser.ID, 0); }
		public TerminalNode NUM() { return getToken(WhileParser.NUM, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				callFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				read();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(NUM);
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

	public static class StatementContext extends ParserRuleContext {
		public SuccContext succ() {
			return getRuleContext(SuccContext.class,0);
		}
		public PredContext pred() {
			return getRuleContext(PredContext.class,0);
		}
		public WhlContext whl() {
			return getRuleContext(WhlContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public DefVarContext defVar() {
			return getRuleContext(DefVarContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUCC:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				succ();
				}
				break;
			case PRED:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				pred();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				whl();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				loop();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				defVar();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				write();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				assign();
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

	public static class RetStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(WhileParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(WhileParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(WhileParser.SEMICOLON, 0); }
		public RetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitRetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetStatementContext retStatement() throws RecognitionException {
		RetStatementContext _localctx = new RetStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_retStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(RETURN);
			setState(186);
			match(ID);
			setState(187);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00c0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bh\n\b\f\b\16\bk\13\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\7\13\177\n\13\f\13\16\13\u0082\13\13"+
		"\3\f\3\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u0093\n\r\f\r\16\r\u0096\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00a1\n\16\f\16\16\16\u00a4\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00b1\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00ba\n\21\3\22\3\22\3\22\3\22\3\22\2\2\23\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\24\25\2\u00c2\2)\3\2\2\2"+
		"\4.\3\2\2\2\6\62\3\2\2\2\b?\3\2\2\2\nE\3\2\2\2\fK\3\2\2\2\16o\3\2\2\2"+
		"\20q\3\2\2\2\22x\3\2\2\2\24{\3\2\2\2\26\u0083\3\2\2\2\30\u008b\3\2\2\2"+
		"\32\u0099\3\2\2\2\34\u00a7\3\2\2\2\36\u00b0\3\2\2\2 \u00b9\3\2\2\2\"\u00bb"+
		"\3\2\2\2$(\5\20\t\2%(\5\16\b\2&(\5 \21\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2"+
		"\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3"+
		"\2\2\2./\7\b\2\2/\60\7\3\2\2\60\61\7\4\2\2\61\5\3\2\2\2\62\63\7\7\2\2"+
		"\63\64\7\3\2\2\649\7\24\2\2\65\66\7\5\2\2\668\7\24\2\2\67\65\3\2\2\28"+
		";\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\4\2\2=>\7\23\2"+
		"\2>\7\3\2\2\2?@\7\n\2\2@A\7\3\2\2AB\7\24\2\2BC\7\4\2\2CD\7\23\2\2D\t\3"+
		"\2\2\2EF\7\13\2\2FG\7\3\2\2GH\7\24\2\2HI\7\4\2\2IJ\7\23\2\2J\13\3\2\2"+
		"\2KL\7\24\2\2LM\7\3\2\2MN\5\26\f\2NO\7\4\2\2O\r\3\2\2\2PQ\7\r\2\2QR\7"+
		"\24\2\2RS\7\3\2\2ST\5\24\13\2TU\7\4\2\2UV\7\17\2\2VZ\7\6\2\2WY\5 \21\2"+
		"XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\5\"\22"+
		"\2^_\7\20\2\2_p\3\2\2\2`a\7\24\2\2ab\7\3\2\2bc\5\24\13\2cd\7\4\2\2de\7"+
		"\17\2\2ei\7\6\2\2fh\5 \21\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl"+
		"\3\2\2\2ki\3\2\2\2lm\5\"\22\2mn\7\20\2\2np\3\2\2\2oP\3\2\2\2o`\3\2\2\2"+
		"p\17\3\2\2\2qr\7\r\2\2rs\7\24\2\2st\7\3\2\2tu\5\24\13\2uv\7\4\2\2vw\7"+
		"\23\2\2w\21\3\2\2\2xy\7\16\2\2yz\5\34\17\2z\23\3\2\2\2{\u0080\7\24\2\2"+
		"|}\7\5\2\2}\177\7\24\2\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\25\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0088\t\2\2"+
		"\2\u0084\u0085\7\5\2\2\u0085\u0087\t\2\2\2\u0086\u0084\3\2\2\2\u0087\u008a"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\27\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7\t\2\2\u008c\u008d\7\3\2\2\u008d\u008e\7\24"+
		"\2\2\u008e\u008f\7\4\2\2\u008f\u0090\7\17\2\2\u0090\u0094\7\6\2\2\u0091"+
		"\u0093\5 \21\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7\20\2\2\u0098\31\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u009b\7\3\2"+
		"\2\u009b\u009c\7\24\2\2\u009c\u009d\7\4\2\2\u009d\u009e\7\17\2\2\u009e"+
		"\u00a2\7\6\2\2\u009f\u00a1\5 \21\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\7\20\2\2\u00a6\33\3\2\2\2\u00a7\u00a8\7\24"+
		"\2\2\u00a8\u00a9\7\22\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7\23\2\2\u00ab"+
		"\35\3\2\2\2\u00ac\u00b1\5\f\7\2\u00ad\u00b1\5\4\3\2\u00ae\u00b1\7\24\2"+
		"\2\u00af\u00b1\7\25\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\37\3\2\2\2\u00b2\u00ba\5\b\5"+
		"\2\u00b3\u00ba\5\n\6\2\u00b4\u00ba\5\30\r\2\u00b5\u00ba\5\32\16\2\u00b6"+
		"\u00ba\5\22\n\2\u00b7\u00ba\5\6\4\2\u00b8\u00ba\5\34\17\2\u00b9\u00b2"+
		"\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9"+
		"\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba!\3\2\2\2"+
		"\u00bb\u00bc\7\21\2\2\u00bc\u00bd\7\24\2\2\u00bd\u00be\7\23\2\2\u00be"+
		"#\3\2\2\2\16\')9Zio\u0080\u0088\u0094\u00a2\u00b0\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}