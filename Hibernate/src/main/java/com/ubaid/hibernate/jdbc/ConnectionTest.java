package com.ubaid.hibernate.jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

public class ConnectionTest
{
	public static void main(String [] args)
	{
		try
		{
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setUser("hbstudent");
			dataSource.setPassword("hbstudent");
			dataSource.setPort(3306);
			dataSource.setDatabaseName("hb_student_tracker");
			System.out.println("Connecting: " + dataSource.getURL());
			dataSource.getConnection();
			System.out.println("Connection Successfull");
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
}
