// Generated from c:\Users\petro\Projekte\While\compiler_project\Grammatik\While.g4 by ANTLR 4.8
package de.hfu.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WhileParser}.
 */
public interface WhileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WhileParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(WhileParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(WhileParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(WhileParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(WhileParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(WhileParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(WhileParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#succ}.
	 * @param ctx the parse tree
	 */
	void enterSucc(WhileParser.SuccContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#succ}.
	 * @param ctx the parse tree
	 */
	void exitSucc(WhileParser.SuccContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#pred}.
	 * @param ctx the parse tree
	 */
	void enterPred(WhileParser.PredContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#pred}.
	 * @param ctx the parse tree
	 */
	void exitPred(WhileParser.PredContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(WhileParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(WhileParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void enterDefFunction(WhileParser.DefFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void exitDefFunction(WhileParser.DefFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#defVar}.
	 * @param ctx the parse tree
	 */
	void enterDefVar(WhileParser.DefVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#defVar}.
	 * @param ctx the parse tree
	 */
	void exitDefVar(WhileParser.DefVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#defParameters}.
	 * @param ctx the parse tree
	 */
	void enterDefParameters(WhileParser.DefParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#defParameters}.
	 * @param ctx the parse tree
	 */
	void exitDefParameters(WhileParser.DefParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#callParameters}.
	 * @param ctx the parse tree
	 */
	void enterCallParameters(WhileParser.CallParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#callParameters}.
	 * @param ctx the parse tree
	 */
	void exitCallParameters(WhileParser.CallParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#whl}.
	 * @param ctx the parse tree
	 */
	void enterWhl(WhileParser.WhlContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#whl}.
	 * @param ctx the parse tree
	 */
	void exitWhl(WhileParser.WhlContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(WhileParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(WhileParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(WhileParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(WhileParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(WhileParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(WhileParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WhileParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WhileParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#retStatement}.
	 * @param ctx the parse tree
	 */
	void enterRetStatement(WhileParser.RetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#retStatement}.
	 * @param ctx the parse tree
	 */
	void exitRetStatement(WhileParser.RetStatementContext ctx);
}