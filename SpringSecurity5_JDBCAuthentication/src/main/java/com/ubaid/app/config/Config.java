package com.ubaid.app.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan(basePackages = {"com.ubaid.app"})
@EnableWebMvc
@Import(com.ubaid.app.config.security.Config.class)
@PropertySource("classpath:databaseConfig.properties")
public class Config implements WebMvcConfigurer
{

	@Autowired
	Environment env;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("/zsvw12/**").addResourceLocations("/resources/");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry)
	{
		registry.jsp("WEB-INF/views/", ".jsp");
	}
	
	@Bean
	public DataSource dataSource()
	{
		ComboPooledDataSource ds = new ComboPooledDataSource();
		try
		{
			ds.setDriverClass(env.getProperty("jdbc.driver"));
			ds.setJdbcUrl(env.getProperty("jdbc.url"));
			ds.setUser(env.getProperty("jdbc.user"));
			ds.setPassword(env.getProperty("jdbc.password"));
			
			ds.setInitialPoolSize(getIntegerValue("connection.pool.initialPoolSize"));
			ds.setMinPoolSize(getIntegerValue("connection.pool.minPoolSize"));
			ds.setMaxPoolSize(getIntegerValue("connection.pool.maxPoolSize"));
			ds.setMaxIdleTime(getIntegerValue("connection.pool.maxIdleTime"));
		}
		catch (PropertyVetoException e)
		{
			e.printStackTrace();
		}
		return ds;
	}
	
	private int getIntegerValue(String property)
	{
		String valueInString = env.getProperty(property);
		int value = Integer.parseInt(valueInString);
		return value;
	}
	
}
