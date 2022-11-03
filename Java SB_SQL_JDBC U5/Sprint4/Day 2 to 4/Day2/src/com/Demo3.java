package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Demo3
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Roll Number");
		int roll = scanner.nextInt();

		System.out.println("Enter name");
		String name = scanner.next();

		System.out.println("Enter Marks");
		int marks = scanner.nextInt();

		String url1 = "jdbc:mysql://localhost:3306/web16";

		try (Connection conn1 = DriverManager.getConnection(url1, "root", "India@4444"))
		{
			Statement st1 = conn1.createStatement();

			int x = st1.executeUpdate("insert into studentjdbc values(" + roll + ",'" + name + "'," + marks + ")");

			if (x > 0)
			{
				System.out.println(x + " Record Insered Sucssfully..........");
			}
			else
			{
				System.out.println("Error Not Insert");
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}
