package com.ubaid.app.config;

interface Util
{
	final static String URL = "jdbc.url";
	final static String DRIVER = "jdbc.driver";
	final static String USERNAME = "jdbc.username";
	final static String PASSWORD = "jdbc.password";
	
	
	final static String INITIAL_POOL_SIZE = "jdbc.connection.initialPoolSize";
	final static String MAX_POOL_SIZE = "jdbc.connection.maxPoolSize";
	final static String MIN_POOL_SIZE = "jdbc.connection.minPoolSize";
	final static String IDLE_TIME = "jdbc.connection.idleTime";
	
	final static String DIALECT = "hibernate.dialect";
	final static String SHOW_SQL = "hibernate.show_sql";
	final static String PACKAGES_TO_SCAN = "hibernate.packagesToScan";
	
}
