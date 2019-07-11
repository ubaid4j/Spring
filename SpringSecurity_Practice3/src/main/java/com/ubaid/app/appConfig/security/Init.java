package com.ubaid.app.appConfig.security;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Order(-50)
public class Init extends AbstractSecurityWebApplicationInitializer
{

}
