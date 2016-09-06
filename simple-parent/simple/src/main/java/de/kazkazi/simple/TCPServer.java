package de.kazkazi.simple;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import de.kazkazi.simple.cliparser.antlr.SimpleRPCLexer;
import de.kazkazi.simple.cliparser.antlr.SimpleRPCParser;
import de.kazkazi.simple.parsing.SimpleRPCParserListener;
import de.kazkazi.simple.parsing.ThrowingErrorListener;
import de.kazkazi.simple.responses.CommandNotRecognizedFault;

@Singleton
public class TCPServer {

	private int port = 9999;
	private boolean isRunning = false;
	private int nThreads = 10;

	private static Logger logger = LoggerFactory.getLogger(TCPServer.class);
	
	@Inject
	private SimpleRPCParserListener parserListener;
	private Gson gson = new Gson();
	
	public TCPServer() {
	}
	
	public TCPServer(int port) {
		this.port = port;
	}
	
	public void start() {
		logger.info("Starting TCP Server on port " + port);
		isRunning = true;
		ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService connectionExecutor = Executors.newFixedThreadPool(nThreads);
		executor.submit(() -> {
			ServerSocket serverSocket = null;
			try {
				serverSocket = new ServerSocket(port);
			} catch (IOException | SecurityException | IllegalArgumentException e) {
				logger.error("Failed to open socket", e);
				isRunning = false;
			}
			while (isRunning) {
				try {
					Socket connectionSocket = serverSocket.accept();
					
					
					connectionExecutor.submit(() -> {
						while (isRunning && !connectionSocket.isClosed()) {
							try {
								BufferedReader inFromClient = new BufferedReader(
										new InputStreamReader(connectionSocket.getInputStream()));
		
								String clientMessage = inFromClient.readLine();
								//Whenever the clientMessage == null, then the connection has been closed by the client. 
								//So we will close the connection too
								if (clientMessage == null) {
									connectionSocket.close();
									break;
								}
								logger.debug(String.format("Received from %sd: %s", connectionSocket.getInetAddress(), clientMessage));
								
								SimpleRPCLexer lexer = new SimpleRPCLexer(new ANTLRInputStream(clientMessage));
								TokenStream tokens = new CommonTokenStream(lexer);
								SimpleRPCParser parser = new SimpleRPCParser(tokens);
								parser.removeErrorListeners();
								parser.addErrorListener(ThrowingErrorListener.INSTANCE);
								   
								String response;
								try {
									ParseTreeWalker.DEFAULT.walk(parserListener, parser.compilationUnit());
									response = parserListener.getResponse();
								} catch (ParseCancellationException e) {
									response = gson.toJson(new CommandNotRecognizedFault(e));
								}
								
								response = response +"\n";
								DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
								outToClient.writeBytes(response);
							} catch (Exception e) {
								logger.debug("Error in the connection", e);
								try {
									connectionSocket.close();
								} catch (IOException e1) {
									logger.error("Error while closing connection", e1);
								}
							}
						}
					});
				} catch (Exception e) {
					logger.error("An Error occurred in the server communication", e);
					try {
						serverSocket.close();
					} catch (IOException e1) {
						logger.error("Error while closing the server socket", e1);
					}
				}
			}
		});
	}

	public void stop() {
		isRunning = false;
	}

	public void setParserListener(SimpleRPCParserListener parserListener) {
		this.parserListener = parserListener;
	}
}
