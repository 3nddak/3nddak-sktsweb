package com.za.tutorial.websocket;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/serverendpointdemo")
public class ServerEndPointDemo {
	
	@OnOpen
	public void handleOpen() {
		System.out.println("le client est connecté...");
	}
	@OnMessage
	public String handleMessage(String message) {
		System.out.println("reçu du client: "+message);
		String repplyMessage = "echo "+message;
		System.out.println("reponse au client: "+repplyMessage);
		return repplyMessage;
	}
	@OnClose
	public void handleClose() {
		System.out.println("le client est deconnecté...");
	}
	@OnError
	public void handleError(Throwable t) {
		t.printStackTrace();
	}
	  


}
