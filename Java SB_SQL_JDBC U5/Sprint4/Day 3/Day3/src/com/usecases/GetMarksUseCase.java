package com.usecases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;

public class GetMarksUseCase
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Roll: -> ");
		int roll = scanner.nextInt();

		StudentDao dao1 = new StudentDaoImpl();

		int marks = dao1.getMarksByRoll(roll);

		if (marks >= 0)
		{
			System.out.println("Marks is" + marks);
		}
		else
		{
			System.out.println("Student not found with roll -" + roll);
		}

	}

}
