package com.ubaid.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ubaid.aop")
@EnableAspectJAutoProxy
public class JavaConfig
{

}
