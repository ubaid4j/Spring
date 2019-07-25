package com.ubaid.app.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.ubaid.app"})
@PropertySource("classpath:databaseConfig.properties")
public class Config
{
	
	/**
	 * This is the Environment which holds all properties in teh .properties file
	 */
	@Autowired
	private Environment evn;
	
	
	/**
	 * This method create a ComboPooledDataSource and add all
	 * required properties in it and
	 * @return dataSource
	 */
	@Bean
	public DataSource dataSource()
	{
	
		//creating comboPooledDataSource
		ComboPooledDataSource ds = new ComboPooledDataSource();
		try
		{
			//JDBC Related Stuff
			ds.setDriverClass(evn.getProperty(Util.DRIVER));
			ds.setJdbcUrl(evn.getProperty(Util.URL));
			ds.setUser(evn.getProperty(Util.USERNAME));
			ds.setPassword(evn.getProperty(Util.PASSWORD));
			
			
			//JDBC Connection Pool Stuff
			int initialPoolSize = getIntVal(evn.getProperty(Util.INITIAL_POOL_SIZE));
			int maxPoolSize = getIntVal(evn.getProperty(Util.MAX_POOL_SIZE));
			int minPoolSize = getIntVal(evn.getProperty(Util.MIN_POOL_SIZE));
			int maxIdleTime = getIntVal(evn.getProperty(Util.IDLE_TIME));
			
			ds.setInitialPoolSize(initialPoolSize);
			ds.setMaxPoolSize(maxPoolSize);
			ds.setMinPoolSize(minPoolSize);
			ds.setMaxIdleTime(maxIdleTime);
					
		}
		catch (PropertyVetoException e)
		{
			e.printStackTrace();
		}
		
		return ds;
	}
	
	/**
	 * helper method to return the integer value of string property
	 * @param prop
	 * @return
	 */
	private int getIntVal(String prop)
	{
		return Integer.parseInt(prop);
	}	
	
	/**
	 * Set the HIBERNATE properties [dialect and show_sql]
	 * @return properties
	 */
	private final Properties hibernateProperties()
	{
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty(Util.SHOW_SQL, evn.getProperty(Util.SHOW_SQL));
		hibernateProperties.setProperty(Util.DIALECT, evn.getProperty(Util.DIALECT));
		return hibernateProperties;
	}
	
	
	/**
	 * 
	 * @return local session factory 
	 */
	@Bean
	public LocalSessionFactoryBean localSessionFactory()
	{
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(dataSource());
		lsfb.setHibernateProperties(hibernateProperties());
		lsfb.setPackagesToScan(evn.getProperty(Util.PACKAGES_TO_SCAN));
		return lsfb;
	}
	
	/**
	 * 
	 * @return HIBERNATE transaction manager
	 */
	@Bean
	@Autowired
	public HibernateTransactionManager hibernateTransactionManager()
	{
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(localSessionFactory().getObject());
		return transactionManager;
	}
}
