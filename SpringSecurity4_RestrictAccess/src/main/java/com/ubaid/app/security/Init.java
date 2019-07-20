package com.ubaid.app.security;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Order(-110)
public class Init extends AbstractSecurityWebApplicationInitializer
{

}
