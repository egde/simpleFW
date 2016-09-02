// Generated from de/kazkazi/simple/cliParser/simpleRPC.g4 by ANTLR 4.3
package de.kazkazi.simple.cliParser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleRPCParser}.
 */
public interface simpleRPCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleRPCParser#callInput}.
	 * @param ctx the parse tree
	 */
	void enterCallInput(@NotNull simpleRPCParser.CallInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleRPCParser#callInput}.
	 * @param ctx the parse tree
	 */
	void exitCallInput(@NotNull simpleRPCParser.CallInputContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleRPCParser#listCommand}.
	 * @param ctx the parse tree
	 */
	void enterListCommand(@NotNull simpleRPCParser.ListCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleRPCParser#listCommand}.
	 * @param ctx the parse tree
	 */
	void exitListCommand(@NotNull simpleRPCParser.ListCommandContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleRPCParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull simpleRPCParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleRPCParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull simpleRPCParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleRPCParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull simpleRPCParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleRPCParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull simpleRPCParser.ArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleRPCParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull simpleRPCParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleRPCParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull simpleRPCParser.QualifiedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleRPCParser#helpCommand}.
	 * @param ctx the parse tree
	 */
	void enterHelpCommand(@NotNull simpleRPCParser.HelpCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleRPCParser#helpCommand}.
	 * @param ctx the parse tree
	 */
	void exitHelpCommand(@NotNull simpleRPCParser.HelpCommandContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleRPCParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(@NotNull simpleRPCParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleRPCParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(@NotNull simpleRPCParser.JsonContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleRPCParser#callCommand}.
	 * @param ctx the parse tree
	 */
	void enterCallCommand(@NotNull simpleRPCParser.CallCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleRPCParser#callCommand}.
	 * @param ctx the parse tree
	 */
	void exitCallCommand(@NotNull simpleRPCParser.CallCommandContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleRPCParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull simpleRPCParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleRPCParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull simpleRPCParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleRPCParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(@NotNull simpleRPCParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleRPCParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(@NotNull simpleRPCParser.PairContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleRPCParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull simpleRPCParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleRPCParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull simpleRPCParser.ObjectContext ctx);
}