package com.course.spring.tut.di;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
