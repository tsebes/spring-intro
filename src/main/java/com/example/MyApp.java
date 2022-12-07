package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigApp.class);

        MessageService messageService = applicationContext.getBean(MessageService.class);

        MessageService secondMessageService = applicationContext.getBean(MessageService.class);

        System.out.println(messageService.hashCode());

        System.out.println(secondMessageService.hashCode());

        System.out.println(messageService.getMessage());
    }
}
