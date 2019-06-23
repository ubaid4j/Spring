package com.ubaid.springHibernate.connectionTest;

import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * Servlet implementation class Connection
 */
@WebServlet("/connection")
public class Connection extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connection()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		java.sql.Connection connection = null;
		
		try
		{
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setPort(3306);
			dataSource.setServerName("localhost");
			dataSource.setUser("springstudent");
			dataSource.setPassword("springstudent");
			dataSource.setDatabaseName("web_customer_tracker");
			
			Writer writer = response.getWriter();
			
			writer.write("Connecting with Database");
			
			connection = dataSource.getConnection();
			
			writer.write("Connection successfull at " + dataSource.getUrl());

		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
