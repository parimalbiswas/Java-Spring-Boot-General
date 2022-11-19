package com.parimal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo
{
	public static void main(String[] args)
	{

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e)
		{

			e.printStackTrace();
		}

		String url1 = "jdbc:mysql://localhost:3306/sb201r";

		try
		{
			Connection conn1 = DriverManager.getConnection(url1, "root", "India@4444");

			System.out.println(conn1);
		}
		catch (SQLException e)
		{

			e.printStackTrace();
		}

	}
}
