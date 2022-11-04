package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2
{

	public static void main(String[] args)
	{

		String url1 = "jdbc:mysql://localhost:3306/web16";

		try (Connection conn1 = DriverManager.getConnection(url1, "root", "India@4444"))
		{

			Statement st1 = conn1.createStatement();

			int x = st1.executeUpdate("insert into studentjdbc values(30,'modhu',200)");

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

	}

}
