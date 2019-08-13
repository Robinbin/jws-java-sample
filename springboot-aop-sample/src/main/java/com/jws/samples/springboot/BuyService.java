package com.jws.samples.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BuyService {

    @AuthPermission
    public void buyItem(int userId) {
        log.info("我要买东西！来自：" + userId);
    }
}
