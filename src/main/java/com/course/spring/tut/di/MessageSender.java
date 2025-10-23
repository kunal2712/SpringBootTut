package com.course.spring.tut.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {


    private final MessageService messageService;

    public MessageSender(@Qualifier("emailService") MessageService messageService){
        this.messageService = messageService;
    }

    public  void sendMessage(String s){
        this.messageService.sendMessage(s);
    }


}
