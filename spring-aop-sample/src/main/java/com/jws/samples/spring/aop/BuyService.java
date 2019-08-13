package com.jws.samples.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BuyService implements IBuyService {

    @AuthPermission
    public void buyItem(int userId) {
        log.info("我要买东西！来自：" + userId);
    }
}
