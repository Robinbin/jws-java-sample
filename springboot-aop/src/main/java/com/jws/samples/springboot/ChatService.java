package com.jws.samples.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ChatService {
    @AuthPermission
    public void privateChat(int userId) {
        log.info("我要聊开！来自：" + userId);
    }
}
