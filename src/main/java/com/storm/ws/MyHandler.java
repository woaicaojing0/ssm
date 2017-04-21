package com.storm.ws;

import com.storm.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cj34920 on 2017/4/21.
 */
@Component
public class MyHandler extends TextWebSocketHandler {

    private Logger logger = LoggerFactory.getLogger(UserController.class);
    private static Map<String, WebSocketSession> userWebSocketSessions;

    public MyHandler() {
        userWebSocketSessions = new HashMap<String, WebSocketSession>();
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String result = message.getPayload();
        System.out.println(result);
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        String sessionId = session.getId();
        userWebSocketSessions.put(sessionId, session);
        logger.debug("add session" + sessionId);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        userWebSocketSessions.remove(session.getId());
        logger.debug("remove session" + session.getId());
    }

    public void broadCast(String messages) {
        for (Map.Entry<String, WebSocketSession> webSocketSessionEntry : userWebSocketSessions.entrySet()) {
          WebSocketSession webSocketSession =  webSocketSessionEntry.getValue();
            if (webSocketSession.isOpen()) {
                try {
                    webSocketSession.sendMessage(new TextMessage(messages));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            }
    }
}
