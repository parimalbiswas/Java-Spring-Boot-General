package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//Giving 50 grace marks to all the students whose marks is less than 800
public class Demo5
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Grase Marks...........");
		int gmarks = scanner.nextInt();

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e)
		{

			System.out.println(e.getMessage());
		}

		String url1 = "jdbc:mysql://localhost:3306/web16";

		try (Connection conn1 = DriverManager.getConnection(url1, "root", "India@4444"))
		{
			PreparedStatement ps1 = conn1.prepareStatement("update studentjdbc set marks= marks + ? where marks < 100");

			ps1.setInt(1, gmarks);

			int x = ps1.executeUpdate();

			if (x > 0)
			{
				System.out.println("Succsefull......");
			}
			else
			{
				System.out.println("failed...........");
			}

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
