package com.chat.app.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private String secretCode = null;

    public boolean isCodeSet() {
        return secretCode != null;
    }

    public void setCode(String code) {
        this.secretCode = code;
    }

    public boolean validateCode(String code) {
        return secretCode != null && secretCode.equals(code);
    }
}
