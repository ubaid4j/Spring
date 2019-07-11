package com.ubaid.app.appConfig;

import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Order(-25)
public class Init extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return new Class<?>[] {Config.class};
	}

	@Override
	protected String[] getServletMappings()
	{
		return new String[] {"/"};
	}

}
