package de.kazkazi.simple.parsing;

import javax.inject.Inject;
import javax.inject.Singleton;

import de.kazkazi.simple.MethodManager;
import de.kazkazi.simple.cliparser.antlr.SimpleRPCBaseListener;
import de.kazkazi.simple.cliparser.antlr.SimpleRPCParser.CallCommandContext;
import de.kazkazi.simple.cliparser.antlr.SimpleRPCParser.CallInputContext;
import de.kazkazi.simple.cliparser.antlr.SimpleRPCParser.ListCommandContext;

@Singleton
public class SimpleRPCParserListener extends SimpleRPCBaseListener {

	private String response;
	@Inject
	private MethodManager methodManager;
	
	@Override
	public void enterCallCommand(CallCommandContext ctx) {
		String methodName = ctx.qualifiedName().getText();
		CallInputContext callInput = ctx.callInput();
		String input = null;
		if (callInput != null) {
			input = ctx.callInput().getText();
		}
		response = methodManager.invoke(methodName, input);
	}
	
	@Override
	public void enterListCommand(ListCommandContext ctx) {
		response = methodManager.listMethods();
	}
	
	public MethodManager getMethodManager() {
		return methodManager;
	}
	
	public void setMethodManager(MethodManager methodManager) {
		this.methodManager = methodManager;
	}

	public String getResponse() {
		return response;
	}
}
