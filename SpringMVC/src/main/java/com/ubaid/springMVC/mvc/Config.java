package com.ubaid.springMVC.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ubaid.springMVC")
@PropertySource("classpath:/com/ubaid/springMVC/mvc/student.properties")
public class Config
{

}
