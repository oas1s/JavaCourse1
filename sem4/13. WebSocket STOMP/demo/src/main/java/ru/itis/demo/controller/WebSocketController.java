package ru.itis.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import ru.itis.demo.dto.Message;
import ru.itis.demo.security.UserDetailsImpl;

@Controller
@RequiredArgsConstructor
public class WebSocketController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat")
    @SneakyThrows
    public void broadcastNews(@Payload Message message, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        simpMessagingTemplate.convertAndSend("/topic/messages", message);
    }
}
