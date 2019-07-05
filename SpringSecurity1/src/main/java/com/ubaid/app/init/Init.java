package com.ubaid.app.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.ubaid.app.config.Config;


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
		Class<?>[] classes = {Config.class};
		return classes;
	}

	@Override
	protected String[] getServletMappings()
	{
		String[] mapping = {"/"};
		return mapping;
	}

}
