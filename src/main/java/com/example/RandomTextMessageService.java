package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("randomMessageService")
public class RandomTextMessageService implements MessageService{
    String[] container;
    RandomTextMessageService(){
        container = new String[10];
        container[0] = "pierwsza wiadomosc";
        container[1] = "druga wiadomosc";
        container[2] = "trzecia wiadomosc";
        container[3] = "czwarta wiadomosc";
        container[4] = "piata wiadomosc";
        container[5] = "szosta wiadomosc";
        container[6] = "siodma wiadomosc";
        container[7] = "osma wiadomosc";
        container[8] = "dziewiata wiadomosc";
        container[9] = "dziesiata wiadomosc";
    }
    @Override
    public String getMessage() {
        Random generator = new Random();
        int messageNumber = generator.nextInt(10);
        return container[messageNumber];
    }
}
