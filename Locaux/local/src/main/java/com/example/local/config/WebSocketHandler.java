package com.example.local.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class WebSocketHandler extends TextWebSocketHandler {
	
	
	private final List<WebSocketSession> websocketsessions = new ArrayList<>();

	  @Override
	  public void afterConnectionEstablished(WebSocketSession session) throws Exception {
	    // TODO Auto-generated method stub
	    websocketsessions.add(session);
	    System.out.print(session);}

	  @Override
	  public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
	    // TODO Auto-generated method stub
	    websocketsessions.remove(session);
	  }

	  @Override
	  public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
	    // TODO Auto-generated method stub

	    for(WebSocketSession websocketsession : websocketsessions){
	      websocketsession.sendMessage(message);

	    }
	  }

	  @Override
	  public boolean supportsPartialMessages() {
	    // TODO Auto-generated method stub
	    return true;
	  }

}

