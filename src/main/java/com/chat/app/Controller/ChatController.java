package com.chat.app.Controller;

import com.chat.app.Model.ChatMessage;
import com.chat.app.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChatController {

    @Autowired
    private ChatService chatService;

    @MessageMapping("/sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/chat";
    }

    @GetMapping("/isCodeSet")
    @ResponseBody
    public boolean isCodeSet() {
        return chatService.isCodeSet();
    }

    @PostMapping("/setCode")
    @ResponseBody
    public boolean setCode(@RequestParam String code) {
        if (!chatService.isCodeSet()) {
            chatService.setCode(code);
            return true;
        }
        return false;
    }

    @PostMapping("/validate")
    @ResponseBody
    public boolean validate(@RequestParam String code) {
        return chatService.validateCode(code);
    }
}
