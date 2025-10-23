package com.course.spring.tut.di;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsService implements  MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
