package de.kazkazi.simple;

import java.util.Scanner;

public class Parser {

	private String line;
	
	private String methodName;
	private String command;
	
	public Parser(String line) {
		this.line = line;
	}
	
	public void parse() {
		Scanner scanner = new Scanner(line);
		scanner.useDelimiter(" ");
		if (scanner.hasNext()) {
			command = scanner.next();
			switch (command.toUpperCase()) {
			case "CALL":
				methodName = scanner.next();
				break;
			default:
				methodName = null;
				break;
			}
		}
		scanner.close();
	}

	public String getMethodName() {
		return methodName;
	}
	
	public String getCommand() {
		return command;
	}
	
}
