package com.course.spring.tut.di;

import com.course.spring.tut.AppConfig;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = appContext.getBean(MessageSender.class);
        String message = "hello how are you?";

        messageSender.sendMessage(message);

    }

}
