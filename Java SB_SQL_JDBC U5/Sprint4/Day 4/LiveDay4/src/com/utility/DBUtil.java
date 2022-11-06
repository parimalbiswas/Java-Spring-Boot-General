package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil
{
	public static Connection provideConnection()
	{
		Connection conn1 = null;

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		String utl1 = "jdbc:mysql://localhost:3306/web19";

		try
		{
			conn1 = DriverManager.getConnection(utl1, "root", "India@4444");
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}

		return conn1;
	}
}
