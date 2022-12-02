package com.parimal;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller(value = "isuc")
public class InsertStudentUseCase
{
	@Autowired
	private StudentService sService;

	public void insertStudent()
	{
		Scanner scanner = new Scanner(System.in);

		Student student = new Student(5, "KAka", 500);

		String retult = sService.saveStudent(student);

		System.out.println(retult);
	}

	public static void main(String[] args)
	{
		ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);

		InsertStudentUseCase isucObj1 = ctx1.getBean("isuc", InsertStudentUseCase.class);

		isucObj1.insertStudent();
	}

}
