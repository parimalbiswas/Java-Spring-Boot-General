package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo4
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

			PreparedStatement ps1 = conn1.prepareStatement("insert into studentjdbc values(?,?,?)");

			ps1.setInt(1, roll);
			ps1.setString(2, name);
			ps1.setInt(3, marks);

			int x = ps1.executeUpdate();

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
