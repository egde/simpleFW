package de.kazkazi.simple.responses;

import org.antlr.v4.runtime.misc.ParseCancellationException;

public class CommandNotRecognizedFault extends Fault {

	public CommandNotRecognizedFault(ParseCancellationException e ) {
		this.setMessage(String.format("Command not recognized: %s", e.getMessage()));
	}
}
