package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2
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

		String url1 = "jdbc:mysql://localhost:3306/web16";
		Connection conn1 = null;
		try
		{
			conn1 = DriverManager.getConnection(url1, "root", "India@4444");

			Statement st1 = conn1.createStatement();

			int x = st1.executeUpdate("insert into studentjdbc values(20,'biswas',502)");

			if (x > 0)
			{
				System.out.println(x + " recored Inserted.....");
			}
			else
			{
				System.out.println("Failed.......");
			}

		}
		catch (SQLException e)
		{

			e.printStackTrace();
		}

		finally
		{
			try
			{
				conn1.close();
			}
			catch (SQLException e)
			{

				e.printStackTrace();
			}
		}

	}

}
