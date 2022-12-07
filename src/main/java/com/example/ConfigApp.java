package com.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigApp {
        @Bean
        @Scope("prototype")
        public RandomTextMessageService MessageService() {
            return new RandomTextMessageService();
        }
}
