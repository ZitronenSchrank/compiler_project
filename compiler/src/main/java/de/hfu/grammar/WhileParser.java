// Generated from /home/zitrone/Documents/OwnProjects/WhileProjects/compiler_project/Grammatik/While.g4 by ANTLR 4.8
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
			null, "'('", "')'", "':'", "','", "'write'", "'read'", "'while'", "'succ'", 
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
		public TerminalNode SEMICOLON() { return getToken(WhileParser.SEMICOLON, 0); }
		public List<DefParametersContext> defParameters() {
			return getRuleContexts(DefParametersContext.class);
		}
		public DefParametersContext defParameters(int i) {
			return getRuleContext(DefParametersContext.class,i);
		}
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(50);
				defParameters();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__1);
			setState(57);
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
			setState(59);
			match(SUCC);
			setState(60);
			match(T__0);
			setState(61);
			match(ID);
			setState(62);
			match(T__1);
			setState(63);
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
			setState(65);
			match(PRED);
			setState(66);
			match(T__0);
			setState(67);
			match(ID);
			setState(68);
			match(T__1);
			setState(69);
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
			setState(71);
			match(ID);
			setState(72);
			match(T__0);
			setState(73);
			callParameters();
			setState(74);
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
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(DEFINE);
				setState(77);
				match(ID);
				setState(78);
				match(T__0);
				setState(79);
				defParameters();
				setState(80);
				match(T__1);
				setState(81);
				match(BEGIN);
				setState(82);
				match(T__2);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
					{
					{
					setState(83);
					statement();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				retStatement();
				setState(90);
				match(END);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(ID);
				setState(93);
				match(T__0);
				setState(94);
				defParameters();
				setState(95);
				match(T__1);
				setState(96);
				match(BEGIN);
				setState(97);
				match(T__2);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
					{
					{
					setState(98);
					statement();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				retStatement();
				setState(105);
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
			setState(109);
			match(DEFINE);
			setState(110);
			match(ID);
			setState(111);
			match(T__0);
			setState(112);
			defParameters();
			setState(113);
			match(T__1);
			setState(114);
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
			setState(116);
			match(VARIABLE);
			setState(117);
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
			setState(119);
			match(ID);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(120);
				match(T__3);
				setState(121);
				match(ID);
				}
				}
				setState(126);
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
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(128);
				match(T__3);
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
				}
				}
				setState(134);
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
			setState(135);
			match(WHILE);
			setState(136);
			match(T__0);
			setState(137);
			match(ID);
			setState(138);
			match(T__1);
			setState(139);
			match(BEGIN);
			setState(140);
			match(T__2);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
				{
				{
				setState(141);
				statement();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
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
			setState(149);
			match(LOOP);
			setState(150);
			match(T__0);
			setState(151);
			match(ID);
			setState(152);
			match(T__1);
			setState(153);
			match(BEGIN);
			setState(154);
			match(T__2);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WHILE) | (1L << SUCC) | (1L << PRED) | (1L << LOOP) | (1L << VARIABLE) | (1L << ID))) != 0)) {
				{
				{
				setState(155);
				statement();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
			setState(163);
			match(ID);
			setState(164);
			match(ASSIGN);
			setState(165);
			expr();
			setState(166);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				callFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				read();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
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
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUCC:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				succ();
				}
				break;
			case PRED:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				pred();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				whl();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				loop();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				defVar();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				write();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
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
			setState(183);
			match(RETURN);
			setState(184);
			match(ID);
			setState(185);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\bW\n\b\f\b\16\bZ\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bf"+
		"\n\b\f\b\16\bi\13\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\7\13}\n\13\f\13\16\13\u0080\13\13\3\f\3\f\3"+
		"\f\7\f\u0085\n\f\f\f\16\f\u0088\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0091"+
		"\n\r\f\r\16\r\u0094\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7"+
		"\16\u009f\n\16\f\16\16\16\u00a2\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\5\20\u00af\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00b8\n\21\3\22\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\3\3\2\24\25\2\u00c0\2)\3\2\2\2\4.\3\2\2\2\6"+
		"\62\3\2\2\2\b=\3\2\2\2\nC\3\2\2\2\fI\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22"+
		"v\3\2\2\2\24y\3\2\2\2\26\u0081\3\2\2\2\30\u0089\3\2\2\2\32\u0097\3\2\2"+
		"\2\34\u00a5\3\2\2\2\36\u00ae\3\2\2\2 \u00b7\3\2\2\2\"\u00b9\3\2\2\2$("+
		"\5\20\t\2%(\5\16\b\2&(\5 \21\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(+\3\2"+
		"\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3\2\2\2./\7"+
		"\b\2\2/\60\7\3\2\2\60\61\7\4\2\2\61\5\3\2\2\2\62\63\7\7\2\2\63\67\7\3"+
		"\2\2\64\66\5\24\13\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2"+
		"\28:\3\2\2\29\67\3\2\2\2:;\7\4\2\2;<\7\23\2\2<\7\3\2\2\2=>\7\n\2\2>?\7"+
		"\3\2\2?@\7\24\2\2@A\7\4\2\2AB\7\23\2\2B\t\3\2\2\2CD\7\13\2\2DE\7\3\2\2"+
		"EF\7\24\2\2FG\7\4\2\2GH\7\23\2\2H\13\3\2\2\2IJ\7\24\2\2JK\7\3\2\2KL\5"+
		"\26\f\2LM\7\4\2\2M\r\3\2\2\2NO\7\r\2\2OP\7\24\2\2PQ\7\3\2\2QR\5\24\13"+
		"\2RS\7\4\2\2ST\7\17\2\2TX\7\5\2\2UW\5 \21\2VU\3\2\2\2WZ\3\2\2\2XV\3\2"+
		"\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\5\"\22\2\\]\7\20\2\2]n\3\2\2\2^"+
		"_\7\24\2\2_`\7\3\2\2`a\5\24\13\2ab\7\4\2\2bc\7\17\2\2cg\7\5\2\2df\5 \21"+
		"\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\"\22"+
		"\2kl\7\20\2\2ln\3\2\2\2mN\3\2\2\2m^\3\2\2\2n\17\3\2\2\2op\7\r\2\2pq\7"+
		"\24\2\2qr\7\3\2\2rs\5\24\13\2st\7\4\2\2tu\7\23\2\2u\21\3\2\2\2vw\7\16"+
		"\2\2wx\5\34\17\2x\23\3\2\2\2y~\7\24\2\2z{\7\6\2\2{}\7\24\2\2|z\3\2\2\2"+
		"}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\25\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u0086\t\2\2\2\u0082\u0083\7\6\2\2\u0083\u0085\t\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\27\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\t\2\2\u008a\u008b\7\3\2"+
		"\2\u008b\u008c\7\24\2\2\u008c\u008d\7\4\2\2\u008d\u008e\7\17\2\2\u008e"+
		"\u0092\7\5\2\2\u008f\u0091\5 \21\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7\20\2\2\u0096\31\3\2\2\2\u0097\u0098\7\f\2"+
		"\2\u0098\u0099\7\3\2\2\u0099\u009a\7\24\2\2\u009a\u009b\7\4\2\2\u009b"+
		"\u009c\7\17\2\2\u009c\u00a0\7\5\2\2\u009d\u009f\5 \21\2\u009e\u009d\3"+
		"\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\20\2\2\u00a4\33\3\2\2"+
		"\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\5\36\20\2\u00a8"+
		"\u00a9\7\23\2\2\u00a9\35\3\2\2\2\u00aa\u00af\5\f\7\2\u00ab\u00af\5\4\3"+
		"\2\u00ac\u00af\7\24\2\2\u00ad\u00af\7\25\2\2\u00ae\u00aa\3\2\2\2\u00ae"+
		"\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\37\3\2\2"+
		"\2\u00b0\u00b8\5\b\5\2\u00b1\u00b8\5\n\6\2\u00b2\u00b8\5\30\r\2\u00b3"+
		"\u00b8\5\32\16\2\u00b4\u00b8\5\22\n\2\u00b5\u00b8\5\6\4\2\u00b6\u00b8"+
		"\5\34\17\2\u00b7\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2"+
		"\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8!\3\2\2\2\u00b9\u00ba\7\21\2\2\u00ba\u00bb\7\24\2\2\u00bb"+
		"\u00bc\7\23\2\2\u00bc#\3\2\2\2\16\')\67Xgm~\u0086\u0092\u00a0\u00ae\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}