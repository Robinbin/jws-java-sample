package com.jws.samples.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ChatService {
    @AuthPermission
    public void privateChat(int userId) {
        log.info("我要聊开！来自：" + userId);
    }
}
