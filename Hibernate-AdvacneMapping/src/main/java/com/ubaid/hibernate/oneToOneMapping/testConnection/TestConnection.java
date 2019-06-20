package com.ubaid.hibernate.oneToOneMapping.testConnection;

import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * Testing the Connection with database
 * @author UbaidurRehman
 *
 */
public class TestConnection {

	public static void main(String[] args)
	{
		try
		{
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setPort(3306);
			dataSource.setDatabaseName("hb-01-one-to-one-uni");
			dataSource.setPassword("hbstudent");
			dataSource.setUser("hbstudent");
			
			System.out.println("Testing Connection");
			dataSource.getConnection();
			System.out.print("Test Passed");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
