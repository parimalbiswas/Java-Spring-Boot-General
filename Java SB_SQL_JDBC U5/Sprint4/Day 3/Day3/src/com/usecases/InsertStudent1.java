package com.usecases;

import java.util.Scanner;

import com.dao.StudentDaoImpl;

public class InsertStudent1
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Roll: -> ");
		int roll = scanner.nextInt();

		System.out.println("Enter Name: -> ");
		String name = scanner.next();

		System.out.println("Enter Marks: -> ");
		int marks = scanner.nextInt();

		StudentDaoImpl dao1 = new StudentDaoImpl();
		String result = dao1.insertStudentDetails(roll, name, marks);

		System.out.println(result);
	}

}
