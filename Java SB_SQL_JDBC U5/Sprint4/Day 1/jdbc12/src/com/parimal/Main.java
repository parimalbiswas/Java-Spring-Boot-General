package com.parimal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.exceptions.SQLError;


public class Main {
	
public static void main(String[] args) {
		
		//Loading the Driver related main class into the memory
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
			System.out.println("Could not load the Driver main class");
		}
		

		String url = "jdbc:mysql://localhost:3306/web20";
		
		try 
		{
			Connection conn=  DriverManager.getConnection(url,"root","India@4444");
			
			if(conn != null)
				System.out.println("connected...");
			else
				System.out.println("not connected..");
		
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
		
	}


}
