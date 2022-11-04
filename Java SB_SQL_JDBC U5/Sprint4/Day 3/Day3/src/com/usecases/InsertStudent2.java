package com.usecases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.Student;

public class InsertStudent2
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

		Student student = new Student(roll, name, marks);

//		StudentDaoImpl dao1 = new StudentDaoImpl();
		StudentDao dao1 = new StudentDaoImpl();

		String result = dao1.insertStudentDetails2(student);

		System.out.println(result);
	}

}
