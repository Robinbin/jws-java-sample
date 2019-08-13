package com.jws.samples.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootConfiguration
public class SpringBootAopApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext();

        BuyService buyService = cxt.getBean(BuyService.class);
        buyService.buyItem(1);

        ChatService chatService = cxt.getBean(ChatService.class);
        chatService.privateChat(2);

    }
}

