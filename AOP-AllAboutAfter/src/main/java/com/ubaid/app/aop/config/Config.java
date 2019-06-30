package com.ubaid.app.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ubaid.app.aop")
@EnableAspectJAutoProxy
public class Config
{

}
