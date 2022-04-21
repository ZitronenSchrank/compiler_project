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
		RULE_callFunction = 5, RULE_defFunction = 6, RULE_defVar = 7, RULE_defParameters = 8, 
		RULE_callParameters = 9, RULE_whl = 10, RULE_loop = 11, RULE_assign = 12, 
		RULE_expr = 13, RULE_statement = 14, RULE_retStatement = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "read", "write", "succ", "pred", "callFunction", "defFunction", 
			"defVar", "defParameters", "callParameters", "whl", "loop", "assign", 
			"expr", "statement", "retStatement"
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
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << DEFINE) | (1L << VARIABLE) | (1L << ID))) != 0)) {
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32);
					defFunction();
					}
					break;
				case 2:
					{
					setState(33);
					statement();
					}
					break;
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
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
			setState(41);
			match(READ);
			setState(42);
			match(T__0);
			setState(43);
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
			setState(45);
			match(WRITE);
			setState(46);
			match(T__0);
			setState(47);
			match(ID);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(48);
				match(T__2);
				setState(49);
				match(ID);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__1);
			setState(56);
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
			setState(58);
			match(SUCC);
			setState(59);
			match(T__0);
			setState(60);
			match(ID);
			setState(61);
			match(T__1);
			setState(62);
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
			setState(64);
			match(PRED);
			setState(65);
			match(T__0);
			setState(66);
			match(ID);
			setState(67);
			match(T__1);
			setState(68);
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
			setState(70);
			match(ID);
			setState(71);
			match(T__0);
			setState(72);
			callParameters();
			setState(73);
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
		public TerminalNode SEMICOLON() { return getToken(WhileParser.SEMICOLON, 0); }
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(DEFINE);
				setState(76);
				match(ID);
				setState(77);
				match(T__0);
				setState(78);
				defParameters();
				setState(79);
				match(T__1);
				setState(80);
				match(BEGIN);
				setState(81);
				match(T__3);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
					{
					{
					setState(82);
					statement();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				retStatement();
				setState(89);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(DEFINE);
				setState(92);
				match(ID);
				setState(93);
				match(T__0);
				setState(94);
				defParameters();
				setState(95);
				match(T__1);
				setState(96);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(ID);
				setState(99);
				match(T__0);
				setState(100);
				defParameters();
				setState(101);
				match(T__1);
				setState(102);
				match(BEGIN);
				setState(103);
				match(T__3);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
					{
					{
					setState(104);
					statement();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				retStatement();
				setState(111);
				match(END);
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
		enterRule(_localctx, 14, RULE_defVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(VARIABLE);
			setState(116);
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
		enterRule(_localctx, 16, RULE_defParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(119);
				match(T__2);
				setState(120);
				match(ID);
				}
				}
				setState(125);
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
		enterRule(_localctx, 18, RULE_callParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(127);
				match(T__2);
				setState(128);
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
				setState(133);
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
		enterRule(_localctx, 20, RULE_whl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(WHILE);
			setState(135);
			match(T__0);
			setState(136);
			match(ID);
			setState(137);
			match(T__1);
			setState(138);
			match(BEGIN);
			setState(139);
			match(T__3);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
				{
				{
				setState(140);
				statement();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
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
		enterRule(_localctx, 22, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(LOOP);
			setState(149);
			match(T__0);
			setState(150);
			match(ID);
			setState(151);
			match(T__1);
			setState(152);
			match(BEGIN);
			setState(153);
			match(T__3);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
				{
				{
				setState(154);
				statement();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
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
		enterRule(_localctx, 24, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(163);
			match(ASSIGN);
			setState(164);
			expr();
			setState(165);
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
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				callFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				read();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
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
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUCC:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				succ();
				}
				break;
			case PRED:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				pred();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				whl();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				loop();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				defVar();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				write();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
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
		enterRule(_localctx, 30, RULE_retStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(RETURN);
			setState(183);
			match(ID);
			setState(184);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00bd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\7\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\65\n\4\f\4\16\48\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"V\n\b\f\b\16\bY\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\b\3\b\3\b\5\bt\n\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\3\13\3\13\7\13\u0084"+
		"\n\13\f\13\16\13\u0087\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0090\n\f"+
		"\f\f\16\f\u0093\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009e\n\r"+
		"\f\r\16\r\u00a1\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\5\17\u00ae\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b7\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \2\3\3\2\24\25\2\u00c0\2&\3\2\2\2\4+\3\2\2\2\6/\3\2\2\2\b<\3\2\2\2\n"+
		"B\3\2\2\2\fH\3\2\2\2\16s\3\2\2\2\20u\3\2\2\2\22x\3\2\2\2\24\u0080\3\2"+
		"\2\2\26\u0088\3\2\2\2\30\u0096\3\2\2\2\32\u00a4\3\2\2\2\34\u00ad\3\2\2"+
		"\2\36\u00b6\3\2\2\2 \u00b8\3\2\2\2\"%\5\16\b\2#%\5\36\20\2$\"\3\2\2\2"+
		"$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\2\2"+
		"\3*\3\3\2\2\2+,\7\b\2\2,-\7\3\2\2-.\7\4\2\2.\5\3\2\2\2/\60\7\7\2\2\60"+
		"\61\7\3\2\2\61\66\7\24\2\2\62\63\7\5\2\2\63\65\7\24\2\2\64\62\3\2\2\2"+
		"\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\4"+
		"\2\2:;\7\23\2\2;\7\3\2\2\2<=\7\n\2\2=>\7\3\2\2>?\7\24\2\2?@\7\4\2\2@A"+
		"\7\23\2\2A\t\3\2\2\2BC\7\13\2\2CD\7\3\2\2DE\7\24\2\2EF\7\4\2\2FG\7\23"+
		"\2\2G\13\3\2\2\2HI\7\24\2\2IJ\7\3\2\2JK\5\24\13\2KL\7\4\2\2L\r\3\2\2\2"+
		"MN\7\r\2\2NO\7\24\2\2OP\7\3\2\2PQ\5\22\n\2QR\7\4\2\2RS\7\17\2\2SW\7\6"+
		"\2\2TV\5\36\20\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3"+
		"\2\2\2Z[\5 \21\2[\\\7\20\2\2\\t\3\2\2\2]^\7\r\2\2^_\7\24\2\2_`\7\3\2\2"+
		"`a\5\22\n\2ab\7\4\2\2bc\7\23\2\2ct\3\2\2\2de\7\24\2\2ef\7\3\2\2fg\5\22"+
		"\n\2gh\7\4\2\2hi\7\17\2\2im\7\6\2\2jl\5\36\20\2kj\3\2\2\2lo\3\2\2\2mk"+
		"\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\5 \21\2qr\7\20\2\2rt\3\2\2\2"+
		"sM\3\2\2\2s]\3\2\2\2sd\3\2\2\2t\17\3\2\2\2uv\7\16\2\2vw\5\32\16\2w\21"+
		"\3\2\2\2x}\7\24\2\2yz\7\5\2\2z|\7\24\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2"+
		"\2\2}~\3\2\2\2~\23\3\2\2\2\177}\3\2\2\2\u0080\u0085\t\2\2\2\u0081\u0082"+
		"\7\5\2\2\u0082\u0084\t\2\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\25\3\2\2\2\u0087\u0085\3\2\2"+
		"\2\u0088\u0089\7\t\2\2\u0089\u008a\7\3\2\2\u008a\u008b\7\24\2\2\u008b"+
		"\u008c\7\4\2\2\u008c\u008d\7\17\2\2\u008d\u0091\7\6\2\2\u008e\u0090\5"+
		"\36\20\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\20"+
		"\2\2\u0095\27\3\2\2\2\u0096\u0097\7\f\2\2\u0097\u0098\7\3\2\2\u0098\u0099"+
		"\7\24\2\2\u0099\u009a\7\4\2\2\u009a\u009b\7\17\2\2\u009b\u009f\7\6\2\2"+
		"\u009c\u009e\5\36\20\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a3\7\20\2\2\u00a3\31\3\2\2\2\u00a4\u00a5\7\24\2\2\u00a5\u00a6\7\22"+
		"\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\7\23\2\2\u00a8\33\3\2\2\2\u00a9"+
		"\u00ae\5\f\7\2\u00aa\u00ae\5\4\3\2\u00ab\u00ae\7\24\2\2\u00ac\u00ae\7"+
		"\25\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\35\3\2\2\2\u00af\u00b7\5\b\5\2\u00b0\u00b7\5\n\6"+
		"\2\u00b1\u00b7\5\26\f\2\u00b2\u00b7\5\30\r\2\u00b3\u00b7\5\20\t\2\u00b4"+
		"\u00b7\5\6\4\2\u00b5\u00b7\5\32\16\2\u00b6\u00af\3\2\2\2\u00b6\u00b0\3"+
		"\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\7\21\2"+
		"\2\u00b9\u00ba\7\24\2\2\u00ba\u00bb\7\23\2\2\u00bb!\3\2\2\2\16$&\66Wm"+
		"s}\u0085\u0091\u009f\u00ad\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}