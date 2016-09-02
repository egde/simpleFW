package de.kazkazi.simple;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Strings;


public class TCPServer {

	private int port = 9999;
	private boolean isRunning = false;
	private int nThreads = 1;

	private static Logger logger = LoggerFactory.getLogger(TCPServer.class);
	
	private MethodManager methodManager;
	
	public TCPServer(MethodManager methodManager) {
		this.methodManager = methodManager;
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
						while (isRunning) {
							try {
								BufferedReader inFromClient = new BufferedReader(
										new InputStreamReader(connectionSocket.getInputStream()));
		
								String clientMessage = inFromClient.readLine();
								logger.debug(String.format("Received from %sd: %s", connectionSocket.getInetAddress(), clientMessage));
								Parser parser = new Parser(clientMessage);
								parser.parse();
								String methodName = parser.getMethodName();
								String command = parser.getCommand();
								String response = null;
								switch (command.toUpperCase()) {
									case "CALL":
										response = methodManager.invoke(methodName, null);
										break;
									case "LIST":
										response = methodManager.listMethods();
										break;
									default :
										
								}
								DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
								response = response + "\n";
								outToClient.writeBytes(response);
							} catch (Exception e) {
								logger.debug("Error in the connection", e);
							}
						}
					});
				} catch (Exception e) {
					logger.error("An Error occurred in the server communication", e);
				}
			}
		});
	}

	public void stop() {
		isRunning = false;
	}
}
