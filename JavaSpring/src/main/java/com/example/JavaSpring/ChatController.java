package com.example.JavaSpring;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ChatController {
    private static ChatClient chatClient;

    public ChatController(ChatClient.Builder builder) {
        chatClient = builder.build();
    }

    @GetMapping("")
    public String home() {
        return chatClient.prompt()
                .user("Tell me joke")
                .call()
                .content();
    }

    public static void main(String[] args) {
        SpringApplication.run(ChatController.class, args);
    }

}
