package com.part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Launch1
{
	public static void main(String[] args)
	{
		String url1 = "jdbc:mysql://localhost:3306/web20";

		try (Connection conn1 = DriverManager.getConnection(url1, "root", "India@4444"))
		{
			PreparedStatement ps1 = conn1.prepareStatement("select * from student");

			ResultSet rs1 = ps1.executeQuery();

			while (rs1.next())
			{
				int r = rs1.getInt("roll");
				String n = rs1.getString("sname");
				int m = rs1.getInt("marks");

				System.out.println("Roll number is --> " + r);
				System.out.println("Name is --> " + n);
				System.out.println("Marks is --> " + m);
				System.out.println("-----------------------------------");
			}

		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
