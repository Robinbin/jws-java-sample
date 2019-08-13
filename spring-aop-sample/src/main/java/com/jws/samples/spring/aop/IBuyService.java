package com.jws.samples.spring.aop;

import org.springframework.stereotype.Service;

@Service
public interface IBuyService {
    void buyItem(int userId);
}
