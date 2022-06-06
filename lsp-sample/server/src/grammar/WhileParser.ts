// Generated from /home/zitrone/Documents/OwnProjects/WhileProjects/compiler_project/Grammatik/While.g4 by ANTLR 4.7.3-SNAPSHOT


import { ATN } from "antlr4ts/atn/ATN";
import { ATNDeserializer } from "antlr4ts/atn/ATNDeserializer";
import { FailedPredicateException } from "antlr4ts/FailedPredicateException";
import { NotNull } from "antlr4ts/Decorators";
import { NoViableAltException } from "antlr4ts/NoViableAltException";
import { Override } from "antlr4ts/Decorators";
import { Parser } from "antlr4ts/Parser";
import { ParserRuleContext } from "antlr4ts/ParserRuleContext";
import { ParserATNSimulator } from "antlr4ts/atn/ParserATNSimulator";
import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";
import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";
import { RecognitionException } from "antlr4ts/RecognitionException";
import { RuleContext } from "antlr4ts/RuleContext";
//import { RuleVersion } from "antlr4ts/RuleVersion";
import { TerminalNode } from "antlr4ts/tree/TerminalNode";
import { Token } from "antlr4ts/Token";
import { TokenStream } from "antlr4ts/TokenStream";
import { Vocabulary } from "antlr4ts/Vocabulary";
import { VocabularyImpl } from "antlr4ts/VocabularyImpl";

import * as Utils from "antlr4ts/misc/Utils";

import { WhileVisitor } from "./WhileVisitor";


export class WhileParser extends Parser {
	public static readonly T__0 = 1;
	public static readonly T__1 = 2;
	public static readonly T__2 = 3;
	public static readonly T__3 = 4;
	public static readonly WRITE = 5;
	public static readonly READ = 6;
	public static readonly WHILE = 7;
	public static readonly SUCC = 8;
	public static readonly PRED = 9;
	public static readonly LOOP = 10;
	public static readonly DEFINE = 11;
	public static readonly VARIABLE = 12;
	public static readonly BEGIN = 13;
	public static readonly END = 14;
	public static readonly RETURN = 15;
	public static readonly ASSIGN = 16;
	public static readonly SEMICOLON = 17;
	public static readonly ID = 18;
	public static readonly NUM = 19;
	public static readonly COMMENT = 20;
	public static readonly WS = 21;
	public static readonly RULE_prog = 0;
	public static readonly RULE_read = 1;
	public static readonly RULE_write = 2;
	public static readonly RULE_succ = 3;
	public static readonly RULE_pred = 4;
	public static readonly RULE_callFunction = 5;
	public static readonly RULE_defFunction = 6;
	public static readonly RULE_decFunction = 7;
	public static readonly RULE_defVar = 8;
	public static readonly RULE_defParameters = 9;
	public static readonly RULE_callParameters = 10;
	public static readonly RULE_whl = 11;
	public static readonly RULE_loop = 12;
	public static readonly RULE_assign = 13;
	public static readonly RULE_expr = 14;
	public static readonly RULE_statement = 15;
	public static readonly RULE_retStatement = 16;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"prog", "read", "write", "succ", "pred", "callFunction", "defFunction", 
		"decFunction", "defVar", "defParameters", "callParameters", "whl", "loop", 
		"assign", "expr", "statement", "retStatement",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, "'('", "')'", "':'", "','", "'write'", "'read'", "'while'", 
		"'succ'", "'pred'", "'loop'", "'def'", "'var'", "'begin'", "'end'", "'return'", 
		"':='", "';'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, undefined, "WRITE", "READ", 
		"WHILE", "SUCC", "PRED", "LOOP", "DEFINE", "VARIABLE", "BEGIN", "END", 
		"RETURN", "ASSIGN", "SEMICOLON", "ID", "NUM", "COMMENT", "WS",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(WhileParser._LITERAL_NAMES, WhileParser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return WhileParser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "While.g4"; }

	// @Override
	public get ruleNames(): string[] { return WhileParser.ruleNames; }

	// @Override
	public get serializedATN(): string { return WhileParser._serializedATN; }

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(WhileParser._ATN, this);
	}
	// @RuleVersion(0)
	public prog(): ProgContext {
		let _localctx: ProgContext = new ProgContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, WhileParser.RULE_prog);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 39;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << WhileParser.WRITE) | (1 << WhileParser.WHILE) | (1 << WhileParser.SUCC) | (1 << WhileParser.PRED) | (1 << WhileParser.LOOP) | (1 << WhileParser.DEFINE) | (1 << WhileParser.VARIABLE) | (1 << WhileParser.ID))) !== 0)) {
				{
				this.state = 37;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 0, this._ctx) ) {
				case 1:
					{
					this.state = 34;
					this.decFunction();
					}
					break;

				case 2:
					{
					this.state = 35;
					this.defFunction();
					}
					break;

				case 3:
					{
					this.state = 36;
					this.statement();
					}
					break;
				}
				}
				this.state = 41;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 42;
			this.match(WhileParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public read(): ReadContext {
		let _localctx: ReadContext = new ReadContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, WhileParser.RULE_read);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 44;
			this.match(WhileParser.READ);
			this.state = 45;
			this.match(WhileParser.T__0);
			this.state = 46;
			this.match(WhileParser.T__1);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public write(): WriteContext {
		let _localctx: WriteContext = new WriteContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, WhileParser.RULE_write);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 48;
			this.match(WhileParser.WRITE);
			this.state = 49;
			this.match(WhileParser.T__0);
			this.state = 50;
			this.defParameters();
			this.state = 51;
			this.match(WhileParser.T__1);
			this.state = 52;
			this.match(WhileParser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public succ(): SuccContext {
		let _localctx: SuccContext = new SuccContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, WhileParser.RULE_succ);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 54;
			this.match(WhileParser.SUCC);
			this.state = 55;
			this.match(WhileParser.T__0);
			this.state = 56;
			this.match(WhileParser.ID);
			this.state = 57;
			this.match(WhileParser.T__1);
			this.state = 58;
			this.match(WhileParser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public pred(): PredContext {
		let _localctx: PredContext = new PredContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, WhileParser.RULE_pred);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 60;
			this.match(WhileParser.PRED);
			this.state = 61;
			this.match(WhileParser.T__0);
			this.state = 62;
			this.match(WhileParser.ID);
			this.state = 63;
			this.match(WhileParser.T__1);
			this.state = 64;
			this.match(WhileParser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public callFunction(): CallFunctionContext {
		let _localctx: CallFunctionContext = new CallFunctionContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, WhileParser.RULE_callFunction);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 66;
			this.match(WhileParser.ID);
			this.state = 67;
			this.match(WhileParser.T__0);
			this.state = 68;
			this.callParameters();
			this.state = 69;
			this.match(WhileParser.T__1);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public defFunction(): DefFunctionContext {
		let _localctx: DefFunctionContext = new DefFunctionContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, WhileParser.RULE_defFunction);
		let _la: number;
		try {
			this.state = 102;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case WhileParser.DEFINE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 71;
				this.match(WhileParser.DEFINE);
				this.state = 72;
				this.match(WhileParser.ID);
				this.state = 73;
				this.match(WhileParser.T__0);
				this.state = 74;
				this.defParameters();
				this.state = 75;
				this.match(WhileParser.T__1);
				this.state = 76;
				this.match(WhileParser.BEGIN);
				this.state = 77;
				this.match(WhileParser.T__2);
				this.state = 81;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << WhileParser.WRITE) | (1 << WhileParser.WHILE) | (1 << WhileParser.SUCC) | (1 << WhileParser.PRED) | (1 << WhileParser.LOOP) | (1 << WhileParser.VARIABLE) | (1 << WhileParser.ID))) !== 0)) {
					{
					{
					this.state = 78;
					this.statement();
					}
					}
					this.state = 83;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 84;
				this.retStatement();
				this.state = 85;
				this.match(WhileParser.END);
				}
				break;
			case WhileParser.ID:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 87;
				this.match(WhileParser.ID);
				this.state = 88;
				this.match(WhileParser.T__0);
				this.state = 89;
				this.defParameters();
				this.state = 90;
				this.match(WhileParser.T__1);
				this.state = 91;
				this.match(WhileParser.BEGIN);
				this.state = 92;
				this.match(WhileParser.T__2);
				this.state = 96;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << WhileParser.WRITE) | (1 << WhileParser.WHILE) | (1 << WhileParser.SUCC) | (1 << WhileParser.PRED) | (1 << WhileParser.LOOP) | (1 << WhileParser.VARIABLE) | (1 << WhileParser.ID))) !== 0)) {
					{
					{
					this.state = 93;
					this.statement();
					}
					}
					this.state = 98;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 99;
				this.retStatement();
				this.state = 100;
				this.match(WhileParser.END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public decFunction(): DecFunctionContext {
		let _localctx: DecFunctionContext = new DecFunctionContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, WhileParser.RULE_decFunction);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 104;
			this.match(WhileParser.DEFINE);
			this.state = 105;
			this.match(WhileParser.ID);
			this.state = 106;
			this.match(WhileParser.T__0);
			this.state = 107;
			this.defParameters();
			this.state = 108;
			this.match(WhileParser.T__1);
			this.state = 109;
			this.match(WhileParser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public defVar(): DefVarContext {
		let _localctx: DefVarContext = new DefVarContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, WhileParser.RULE_defVar);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 111;
			this.match(WhileParser.VARIABLE);
			this.state = 112;
			this.match(WhileParser.ID);
			this.state = 113;
			this.match(WhileParser.ASSIGN);
			this.state = 114;
			this.expr();
			this.state = 115;
			this.match(WhileParser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public defParameters(): DefParametersContext {
		let _localctx: DefParametersContext = new DefParametersContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, WhileParser.RULE_defParameters);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 117;
			this.match(WhileParser.ID);
			this.state = 122;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === WhileParser.T__3) {
				{
				{
				this.state = 118;
				this.match(WhileParser.T__3);
				this.state = 119;
				this.match(WhileParser.ID);
				}
				}
				this.state = 124;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public callParameters(): CallParametersContext {
		let _localctx: CallParametersContext = new CallParametersContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, WhileParser.RULE_callParameters);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 125;
			_la = this._input.LA(1);
			if (!(_la === WhileParser.ID || _la === WhileParser.NUM)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 130;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === WhileParser.T__3) {
				{
				{
				this.state = 126;
				this.match(WhileParser.T__3);
				this.state = 127;
				_la = this._input.LA(1);
				if (!(_la === WhileParser.ID || _la === WhileParser.NUM)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				}
				}
				this.state = 132;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public whl(): WhlContext {
		let _localctx: WhlContext = new WhlContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, WhileParser.RULE_whl);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 133;
			this.match(WhileParser.WHILE);
			this.state = 134;
			this.match(WhileParser.T__0);
			this.state = 135;
			this.match(WhileParser.ID);
			this.state = 136;
			this.match(WhileParser.T__1);
			this.state = 137;
			this.match(WhileParser.BEGIN);
			this.state = 138;
			this.match(WhileParser.T__2);
			this.state = 142;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << WhileParser.WRITE) | (1 << WhileParser.WHILE) | (1 << WhileParser.SUCC) | (1 << WhileParser.PRED) | (1 << WhileParser.LOOP) | (1 << WhileParser.VARIABLE) | (1 << WhileParser.ID))) !== 0)) {
				{
				{
				this.state = 139;
				this.statement();
				}
				}
				this.state = 144;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 145;
			this.match(WhileParser.END);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public loop(): LoopContext {
		let _localctx: LoopContext = new LoopContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, WhileParser.RULE_loop);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 147;
			this.match(WhileParser.LOOP);
			this.state = 148;
			this.match(WhileParser.T__0);
			this.state = 149;
			this.match(WhileParser.ID);
			this.state = 150;
			this.match(WhileParser.T__1);
			this.state = 151;
			this.match(WhileParser.BEGIN);
			this.state = 152;
			this.match(WhileParser.T__2);
			this.state = 156;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << WhileParser.WRITE) | (1 << WhileParser.WHILE) | (1 << WhileParser.SUCC) | (1 << WhileParser.PRED) | (1 << WhileParser.LOOP) | (1 << WhileParser.VARIABLE) | (1 << WhileParser.ID))) !== 0)) {
				{
				{
				this.state = 153;
				this.statement();
				}
				}
				this.state = 158;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 159;
			this.match(WhileParser.END);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public assign(): AssignContext {
		let _localctx: AssignContext = new AssignContext(this._ctx, this.state);
		this.enterRule(_localctx, 26, WhileParser.RULE_assign);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 161;
			this.match(WhileParser.ID);
			this.state = 162;
			this.match(WhileParser.ASSIGN);
			this.state = 163;
			this.expr();
			this.state = 164;
			this.match(WhileParser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public expr(): ExprContext {
		let _localctx: ExprContext = new ExprContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, WhileParser.RULE_expr);
		try {
			this.state = 170;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 9, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 166;
				this.callFunction();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 167;
				this.read();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 168;
				this.match(WhileParser.ID);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 169;
				this.match(WhileParser.NUM);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public statement(): StatementContext {
		let _localctx: StatementContext = new StatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, WhileParser.RULE_statement);
		try {
			this.state = 179;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case WhileParser.SUCC:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 172;
				this.succ();
				}
				break;
			case WhileParser.PRED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 173;
				this.pred();
				}
				break;
			case WhileParser.WHILE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 174;
				this.whl();
				}
				break;
			case WhileParser.LOOP:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 175;
				this.loop();
				}
				break;
			case WhileParser.VARIABLE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 176;
				this.defVar();
				}
				break;
			case WhileParser.WRITE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 177;
				this.write();
				}
				break;
			case WhileParser.ID:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 178;
				this.assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public retStatement(): RetStatementContext {
		let _localctx: RetStatementContext = new RetStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 32, WhileParser.RULE_retStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 181;
			this.match(WhileParser.RETURN);
			this.state = 182;
			this.match(WhileParser.ID);
			this.state = 183;
			this.match(WhileParser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public static readonly _serializedATN: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03\x17\xBC\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x03" +
		"\x02\x03\x02\x03\x02\x07\x02(\n\x02\f\x02\x0E\x02+\v\x02\x03\x02\x03\x02" +
		"\x03\x03\x03\x03\x03\x03\x03\x03\x03\x04\x03\x04\x03\x04\x03\x04\x03\x04" +
		"\x03\x04\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x06\x03\x06" +
		"\x03\x06\x03\x06\x03\x06\x03\x06\x03\x07\x03\x07\x03\x07\x03\x07\x03\x07" +
		"\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x07\bR\n\b\f\b\x0E\b" +
		"U\v\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x07" +
		"\ba\n\b\f\b\x0E\bd\v\b\x03\b\x03\b\x03\b\x05\bi\n\b\x03\t\x03\t\x03\t" +
		"\x03\t\x03\t\x03\t\x03\t\x03\n\x03\n\x03\n\x03\n\x03\n\x03\n\x03\v\x03" +
		"\v\x03\v\x07\v{\n\v\f\v\x0E\v~\v\v\x03\f\x03\f\x03\f\x07\f\x83\n\f\f\f" +
		"\x0E\f\x86\v\f\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x07\r\x8F\n\r" +
		"\f\r\x0E\r\x92\v\r\x03\r\x03\r\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E" +
		"\x03\x0E\x03\x0E\x07\x0E\x9D\n\x0E\f\x0E\x0E\x0E\xA0\v\x0E\x03\x0E\x03" +
		"\x0E\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x03\x10\x03\x10\x03\x10\x03" +
		"\x10\x05\x10\xAD\n\x10\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11" +
		"\x03\x11\x05\x11\xB6\n\x11\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x02" +
		"\x02\x02\x13\x02\x02\x04\x02\x06\x02\b\x02\n\x02\f\x02\x0E\x02\x10\x02" +
		"\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C\x02\x1E\x02 \x02\"\x02\x02" +
		"\x03\x03\x02\x14\x15\x02\xBD\x02)\x03\x02\x02\x02\x04.\x03\x02\x02\x02" +
		"\x062\x03\x02\x02\x02\b8\x03\x02\x02\x02\n>\x03\x02\x02\x02\fD\x03\x02" +
		"\x02\x02\x0Eh\x03\x02\x02\x02\x10j\x03\x02\x02\x02\x12q\x03\x02\x02\x02" +
		"\x14w\x03\x02\x02\x02\x16\x7F\x03\x02\x02\x02\x18\x87\x03\x02\x02\x02" +
		"\x1A\x95\x03\x02\x02\x02\x1C\xA3\x03\x02\x02\x02\x1E\xAC\x03\x02\x02\x02" +
		" \xB5\x03\x02\x02\x02\"\xB7\x03\x02\x02\x02$(\x05\x10\t\x02%(\x05\x0E" +
		"\b\x02&(\x05 \x11\x02\'$\x03\x02\x02\x02\'%\x03\x02\x02\x02\'&\x03\x02" +
		"\x02\x02(+\x03\x02\x02\x02)\'\x03\x02\x02\x02)*\x03\x02\x02\x02*,\x03" +
		"\x02\x02\x02+)\x03\x02\x02\x02,-\x07\x02\x02\x03-\x03\x03\x02\x02\x02" +
		"./\x07\b\x02\x02/0\x07\x03\x02\x0201\x07\x04\x02\x021\x05\x03\x02\x02" +
		"\x0223\x07\x07\x02\x0234\x07\x03\x02\x0245\x05\x14\v\x0256\x07\x04\x02" +
		"\x0267\x07\x13\x02\x027\x07\x03\x02\x02\x0289\x07\n\x02\x029:\x07\x03" +
		"\x02\x02:;\x07\x14\x02\x02;<\x07\x04\x02\x02<=\x07\x13\x02\x02=\t\x03" +
		"\x02\x02\x02>?\x07\v\x02\x02?@\x07\x03\x02\x02@A\x07\x14\x02\x02AB\x07" +
		"\x04\x02\x02BC\x07\x13\x02\x02C\v\x03\x02\x02\x02DE\x07\x14\x02\x02EF" +
		"\x07\x03\x02\x02FG\x05\x16\f\x02GH\x07\x04\x02\x02H\r\x03\x02\x02\x02" +
		"IJ\x07\r\x02\x02JK\x07\x14\x02\x02KL\x07\x03\x02\x02LM\x05\x14\v\x02M" +
		"N\x07\x04\x02\x02NO\x07\x0F\x02\x02OS\x07\x05\x02\x02PR\x05 \x11\x02Q" +
		"P\x03\x02\x02\x02RU\x03\x02\x02\x02SQ\x03\x02\x02\x02ST\x03\x02\x02\x02" +
		"TV\x03\x02\x02\x02US\x03\x02\x02\x02VW\x05\"\x12\x02WX\x07\x10\x02\x02" +
		"Xi\x03\x02\x02\x02YZ\x07\x14\x02\x02Z[\x07\x03\x02\x02[\\\x05\x14\v\x02" +
		"\\]\x07\x04\x02\x02]^\x07\x0F\x02\x02^b\x07\x05\x02\x02_a\x05 \x11\x02" +
		"`_\x03\x02\x02\x02ad\x03\x02\x02\x02b`\x03\x02\x02\x02bc\x03\x02\x02\x02" +
		"ce\x03\x02\x02\x02db\x03\x02\x02\x02ef\x05\"\x12\x02fg\x07\x10\x02\x02" +
		"gi\x03\x02\x02\x02hI\x03\x02\x02\x02hY\x03\x02\x02\x02i\x0F\x03\x02\x02" +
		"\x02jk\x07\r\x02\x02kl\x07\x14\x02\x02lm\x07\x03\x02\x02mn\x05\x14\v\x02" +
		"no\x07\x04\x02\x02op\x07\x13\x02\x02p\x11\x03\x02\x02\x02qr\x07\x0E\x02" +
		"\x02rs\x07\x14\x02\x02st\x07\x12\x02\x02tu\x05\x1E\x10\x02uv\x07\x13\x02" +
		"\x02v\x13\x03\x02\x02\x02w|\x07\x14\x02\x02xy\x07\x06\x02\x02y{\x07\x14" +
		"\x02\x02zx\x03\x02\x02\x02{~\x03\x02\x02\x02|z\x03\x02\x02\x02|}\x03\x02" +
		"\x02\x02}\x15\x03\x02\x02\x02~|\x03\x02\x02\x02\x7F\x84\t\x02\x02\x02" +
		"\x80\x81\x07\x06\x02\x02\x81\x83\t\x02\x02\x02\x82\x80\x03\x02\x02\x02" +
		"\x83\x86\x03\x02\x02\x02\x84\x82\x03\x02\x02\x02\x84\x85\x03\x02\x02\x02" +
		"\x85\x17\x03\x02\x02\x02\x86\x84\x03\x02\x02\x02\x87\x88\x07\t\x02\x02" +
		"\x88\x89\x07\x03\x02\x02\x89\x8A\x07\x14\x02\x02\x8A\x8B\x07\x04\x02\x02" +
		"\x8B\x8C\x07\x0F\x02\x02\x8C\x90\x07\x05\x02\x02\x8D\x8F\x05 \x11\x02" +
		"\x8E\x8D\x03\x02\x02\x02\x8F\x92\x03\x02\x02\x02\x90\x8E\x03\x02\x02\x02" +
		"\x90\x91\x03\x02\x02\x02\x91\x93\x03\x02\x02\x02\x92\x90\x03\x02\x02\x02" +
		"\x93\x94\x07\x10\x02\x02\x94\x19\x03\x02\x02\x02\x95\x96\x07\f\x02\x02" +
		"\x96\x97\x07\x03\x02\x02\x97\x98\x07\x14\x02\x02\x98\x99\x07\x04\x02\x02" +
		"\x99\x9A\x07\x0F\x02\x02\x9A\x9E\x07\x05\x02\x02\x9B\x9D\x05 \x11\x02" +
		"\x9C\x9B\x03\x02\x02\x02\x9D\xA0\x03\x02\x02\x02\x9E\x9C\x03\x02\x02\x02" +
		"\x9E\x9F\x03\x02\x02\x02\x9F\xA1\x03\x02\x02\x02\xA0\x9E\x03\x02\x02\x02" +
		"\xA1\xA2\x07\x10\x02\x02\xA2\x1B\x03\x02\x02\x02\xA3\xA4\x07\x14\x02\x02" +
		"\xA4\xA5\x07\x12\x02\x02\xA5\xA6\x05\x1E\x10\x02\xA6\xA7\x07\x13\x02\x02" +
		"\xA7\x1D\x03\x02\x02\x02\xA8\xAD\x05\f\x07\x02\xA9\xAD\x05\x04\x03\x02" +
		"\xAA\xAD\x07\x14\x02\x02\xAB\xAD\x07\x15\x02\x02\xAC\xA8\x03\x02\x02\x02" +
		"\xAC\xA9\x03\x02\x02\x02\xAC\xAA\x03\x02\x02\x02\xAC\xAB\x03\x02\x02\x02" +
		"\xAD\x1F\x03\x02\x02\x02\xAE\xB6\x05\b\x05\x02\xAF\xB6\x05\n\x06\x02\xB0" +
		"\xB6\x05\x18\r\x02\xB1\xB6\x05\x1A\x0E\x02\xB2\xB6\x05\x12\n\x02\xB3\xB6" +
		"\x05\x06\x04\x02\xB4\xB6\x05\x1C\x0F\x02\xB5\xAE\x03\x02\x02\x02\xB5\xAF" +
		"\x03\x02\x02\x02\xB5\xB0\x03\x02\x02\x02\xB5\xB1\x03\x02\x02\x02\xB5\xB2" +
		"\x03\x02\x02\x02\xB5\xB3\x03\x02\x02\x02\xB5\xB4\x03\x02\x02\x02\xB6!" +
		"\x03\x02\x02\x02\xB7\xB8\x07\x11\x02\x02\xB8\xB9\x07\x14\x02\x02\xB9\xBA" +
		"\x07\x13\x02\x02\xBA#\x03\x02\x02\x02\r\')Sbh|\x84\x90\x9E\xAC\xB5";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!WhileParser.__ATN) {
			WhileParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(WhileParser._serializedATN));
		}

		return WhileParser.__ATN;
	}

}

export class ProgContext extends ParserRuleContext {
	public EOF(): TerminalNode { return this.getToken(WhileParser.EOF, 0); }
	public decFunction(): DecFunctionContext[];
	public decFunction(i: number): DecFunctionContext;
	public decFunction(i?: number): DecFunctionContext | DecFunctionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DecFunctionContext);
		} else {
			return this.getRuleContext(i, DecFunctionContext);
		}
	}
	public defFunction(): DefFunctionContext[];
	public defFunction(i: number): DefFunctionContext;
	public defFunction(i?: number): DefFunctionContext | DefFunctionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DefFunctionContext);
		} else {
			return this.getRuleContext(i, DefFunctionContext);
		}
	}
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_prog; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitProg) {
			return visitor.visitProg(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ReadContext extends ParserRuleContext {
	public READ(): TerminalNode { return this.getToken(WhileParser.READ, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_read; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitRead) {
			return visitor.visitRead(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class WriteContext extends ParserRuleContext {
	public WRITE(): TerminalNode { return this.getToken(WhileParser.WRITE, 0); }
	public defParameters(): DefParametersContext {
		return this.getRuleContext(0, DefParametersContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(WhileParser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_write; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitWrite) {
			return visitor.visitWrite(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SuccContext extends ParserRuleContext {
	public SUCC(): TerminalNode { return this.getToken(WhileParser.SUCC, 0); }
	public ID(): TerminalNode { return this.getToken(WhileParser.ID, 0); }
	public SEMICOLON(): TerminalNode { return this.getToken(WhileParser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_succ; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitSucc) {
			return visitor.visitSucc(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PredContext extends ParserRuleContext {
	public PRED(): TerminalNode { return this.getToken(WhileParser.PRED, 0); }
	public ID(): TerminalNode { return this.getToken(WhileParser.ID, 0); }
	public SEMICOLON(): TerminalNode { return this.getToken(WhileParser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_pred; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitPred) {
			return visitor.visitPred(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CallFunctionContext extends ParserRuleContext {
	public ID(): TerminalNode { return this.getToken(WhileParser.ID, 0); }
	public callParameters(): CallParametersContext {
		return this.getRuleContext(0, CallParametersContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_callFunction; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitCallFunction) {
			return visitor.visitCallFunction(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DefFunctionContext extends ParserRuleContext {
	public DEFINE(): TerminalNode | undefined { return this.tryGetToken(WhileParser.DEFINE, 0); }
	public ID(): TerminalNode { return this.getToken(WhileParser.ID, 0); }
	public defParameters(): DefParametersContext {
		return this.getRuleContext(0, DefParametersContext);
	}
	public BEGIN(): TerminalNode { return this.getToken(WhileParser.BEGIN, 0); }
	public retStatement(): RetStatementContext {
		return this.getRuleContext(0, RetStatementContext);
	}
	public END(): TerminalNode { return this.getToken(WhileParser.END, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_defFunction; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitDefFunction) {
			return visitor.visitDefFunction(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DecFunctionContext extends ParserRuleContext {
	public DEFINE(): TerminalNode { return this.getToken(WhileParser.DEFINE, 0); }
	public ID(): TerminalNode { return this.getToken(WhileParser.ID, 0); }
	public defParameters(): DefParametersContext {
		return this.getRuleContext(0, DefParametersContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(WhileParser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_decFunction; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitDecFunction) {
			return visitor.visitDecFunction(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DefVarContext extends ParserRuleContext {
	public VARIABLE(): TerminalNode { return this.getToken(WhileParser.VARIABLE, 0); }
	public ID(): TerminalNode { return this.getToken(WhileParser.ID, 0); }
	public ASSIGN(): TerminalNode { return this.getToken(WhileParser.ASSIGN, 0); }
	public expr(): ExprContext {
		return this.getRuleContext(0, ExprContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(WhileParser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_defVar; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitDefVar) {
			return visitor.visitDefVar(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DefParametersContext extends ParserRuleContext {
	public ID(): TerminalNode[];
	public ID(i: number): TerminalNode;
	public ID(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(WhileParser.ID);
		} else {
			return this.getToken(WhileParser.ID, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_defParameters; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitDefParameters) {
			return visitor.visitDefParameters(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CallParametersContext extends ParserRuleContext {
	public ID(): TerminalNode[];
	public ID(i: number): TerminalNode;
	public ID(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(WhileParser.ID);
		} else {
			return this.getToken(WhileParser.ID, i);
		}
	}
	public NUM(): TerminalNode[];
	public NUM(i: number): TerminalNode;
	public NUM(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(WhileParser.NUM);
		} else {
			return this.getToken(WhileParser.NUM, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_callParameters; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitCallParameters) {
			return visitor.visitCallParameters(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class WhlContext extends ParserRuleContext {
	public WHILE(): TerminalNode { return this.getToken(WhileParser.WHILE, 0); }
	public ID(): TerminalNode { return this.getToken(WhileParser.ID, 0); }
	public BEGIN(): TerminalNode { return this.getToken(WhileParser.BEGIN, 0); }
	public END(): TerminalNode { return this.getToken(WhileParser.END, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_whl; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitWhl) {
			return visitor.visitWhl(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LoopContext extends ParserRuleContext {
	public LOOP(): TerminalNode { return this.getToken(WhileParser.LOOP, 0); }
	public ID(): TerminalNode { return this.getToken(WhileParser.ID, 0); }
	public BEGIN(): TerminalNode { return this.getToken(WhileParser.BEGIN, 0); }
	public END(): TerminalNode { return this.getToken(WhileParser.END, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_loop; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitLoop) {
			return visitor.visitLoop(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AssignContext extends ParserRuleContext {
	public ID(): TerminalNode { return this.getToken(WhileParser.ID, 0); }
	public ASSIGN(): TerminalNode { return this.getToken(WhileParser.ASSIGN, 0); }
	public expr(): ExprContext {
		return this.getRuleContext(0, ExprContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(WhileParser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_assign; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitAssign) {
			return visitor.visitAssign(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExprContext extends ParserRuleContext {
	public callFunction(): CallFunctionContext | undefined {
		return this.tryGetRuleContext(0, CallFunctionContext);
	}
	public read(): ReadContext | undefined {
		return this.tryGetRuleContext(0, ReadContext);
	}
	public ID(): TerminalNode | undefined { return this.tryGetToken(WhileParser.ID, 0); }
	public NUM(): TerminalNode | undefined { return this.tryGetToken(WhileParser.NUM, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_expr; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitExpr) {
			return visitor.visitExpr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatementContext extends ParserRuleContext {
	public succ(): SuccContext | undefined {
		return this.tryGetRuleContext(0, SuccContext);
	}
	public pred(): PredContext | undefined {
		return this.tryGetRuleContext(0, PredContext);
	}
	public whl(): WhlContext | undefined {
		return this.tryGetRuleContext(0, WhlContext);
	}
	public loop(): LoopContext | undefined {
		return this.tryGetRuleContext(0, LoopContext);
	}
	public defVar(): DefVarContext | undefined {
		return this.tryGetRuleContext(0, DefVarContext);
	}
	public write(): WriteContext | undefined {
		return this.tryGetRuleContext(0, WriteContext);
	}
	public assign(): AssignContext | undefined {
		return this.tryGetRuleContext(0, AssignContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_statement; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitStatement) {
			return visitor.visitStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RetStatementContext extends ParserRuleContext {
	public RETURN(): TerminalNode { return this.getToken(WhileParser.RETURN, 0); }
	public ID(): TerminalNode { return this.getToken(WhileParser.ID, 0); }
	public SEMICOLON(): TerminalNode { return this.getToken(WhileParser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return WhileParser.RULE_retStatement; }
	// @Override
	public accept<Result>(visitor: WhileVisitor<Result>): Result {
		if (visitor.visitRetStatement) {
			return visitor.visitRetStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


