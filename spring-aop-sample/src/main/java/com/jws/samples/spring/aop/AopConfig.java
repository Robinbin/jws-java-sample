package com.jws.samples.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.jws.samples.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
