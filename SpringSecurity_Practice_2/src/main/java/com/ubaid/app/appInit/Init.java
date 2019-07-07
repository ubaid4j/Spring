package com.ubaid.app.appInit;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.ubaid.app.appConfig.Config;

public class Init extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return new Class<?>[] {Config.class};
//		Class<?>[] classes = {Config.class};
//		return classes;

	}

	@Override
	protected String[] getServletMappings()
	{
		return new String[] {"/"};
//		String[] mapping = {"/"};
//		return mapping;
	}

}
