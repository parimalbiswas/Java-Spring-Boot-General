package com.oct6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		List<Student> students = new ArrayList<>();

		students.add(new Student(2, "fg", 25));
		students.add(new Student(5, "dfd", 55));

		System.out.println(students);

	}
}
