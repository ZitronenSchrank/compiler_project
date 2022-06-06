// Generated from /home/zitrone/Documents/OwnProjects/WhileProjects/compiler_project/Grammatik/While.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { ProgContext } from "./WhileParser";
import { ReadContext } from "./WhileParser";
import { WriteContext } from "./WhileParser";
import { SuccContext } from "./WhileParser";
import { PredContext } from "./WhileParser";
import { CallFunctionContext } from "./WhileParser";
import { DefFunctionContext } from "./WhileParser";
import { DecFunctionContext } from "./WhileParser";
import { DefVarContext } from "./WhileParser";
import { DefParametersContext } from "./WhileParser";
import { CallParametersContext } from "./WhileParser";
import { WhlContext } from "./WhileParser";
import { LoopContext } from "./WhileParser";
import { AssignContext } from "./WhileParser";
import { ExprContext } from "./WhileParser";
import { StatementContext } from "./WhileParser";
import { RetStatementContext } from "./WhileParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `WhileParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface WhileVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `WhileParser.prog`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProg?: (ctx: ProgContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.read`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRead?: (ctx: ReadContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.write`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWrite?: (ctx: WriteContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.succ`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSucc?: (ctx: SuccContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.pred`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPred?: (ctx: PredContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.callFunction`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCallFunction?: (ctx: CallFunctionContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.defFunction`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefFunction?: (ctx: DefFunctionContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.decFunction`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDecFunction?: (ctx: DecFunctionContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.defVar`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefVar?: (ctx: DefVarContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.defParameters`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefParameters?: (ctx: DefParametersContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.callParameters`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCallParameters?: (ctx: CallParametersContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.whl`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhl?: (ctx: WhlContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.loop`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLoop?: (ctx: LoopContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.assign`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssign?: (ctx: AssignContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpr?: (ctx: ExprContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatement?: (ctx: StatementContext) => Result;

	/**
	 * Visit a parse tree produced by `WhileParser.retStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRetStatement?: (ctx: RetStatementContext) => Result;
}

