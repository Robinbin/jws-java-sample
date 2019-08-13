package com.jws.samples.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AopConfig.class);

        IBuyService buyService = configApplicationContext.getBean(IBuyService.class);
        buyService.buyItem(1);

        ChatService chatService = configApplicationContext.getBean(ChatService.class);
        chatService.privateChat(2);
    }
}
