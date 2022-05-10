// Generated from /home/zitrone/Documents/OwnProjects/WhileProjects/compiler_project/Grammatik/While.g4 by ANTLR 4.8
package de.hfu.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WhileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WhileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WhileParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(WhileParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(WhileParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(WhileParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#succ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSucc(WhileParser.SuccContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#pred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPred(WhileParser.PredContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(WhileParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#defFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunction(WhileParser.DefFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#decFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFunction(WhileParser.DecFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#defVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefVar(WhileParser.DefVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#defParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefParameters(WhileParser.DefParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#callParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParameters(WhileParser.CallParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#whl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhl(WhileParser.WhlContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(WhileParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(WhileParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(WhileParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(WhileParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#retStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStatement(WhileParser.RetStatementContext ctx);
}