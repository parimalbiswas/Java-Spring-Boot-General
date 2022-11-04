package com.part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Launch3
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Roll you want to search");
		int roll = scanner.nextInt();

		String url1 = "jdbc:mysql://localhost:3306/web20";

		try (Connection conn1 = DriverManager.getConnection(url1, "root", "India@4444"))
		{
			PreparedStatement ps1 = conn1.prepareStatement("select marks from student where roll = ?");

			ps1.setInt(1, roll);

			ResultSet rs1 = ps1.executeQuery();

			if (rs1.next())
			{

				int m = rs1.getInt("marks");

				System.out.println("Marks is --> " + m);

				System.out.println("-----------------------------------");
			}

			else
			{
				System.out.println("student not exist");
			}

		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
