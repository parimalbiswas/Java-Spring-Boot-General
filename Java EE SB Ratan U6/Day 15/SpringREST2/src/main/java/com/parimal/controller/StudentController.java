package com.parimal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parimal.model.Student;

@RestController
public class StudentController
{

	List<Student> students = new ArrayList<>();

	public StudentController()
	{
		students.add(new Student(10, "Parimal", 200));
		students.add(new Student(20, "Kaka", 200));
		students.add(new Student(30, "Chaha", 200));
		students.add(new Student(40, "Hulo", 200));
		students.add(new Student(10, "Susmita", 200));

	}

	@GetMapping("/students")
	public List<Student> getAllStudentDetailsHandeler()
	{

		return students;
	}

	@GetMapping("/students/{roll}")
	public Student getStudentByRollHandeler(@PathVariable("roll") Integer roll)
	{

		List<Student> list = students.stream().filter(s -> s.getRoll() == roll).collect(Collectors.toList());

		if (list.size() == 0)
		{
			throw new IllegalArgumentException("Student Does Not Exist");
		}

		return list.get(0);
	}

	@PostMapping("/students")
	public String addStudentHandeler(@RequestBody Student student)
	{

		String res1 = "";

		students.add(student);
		res1 = "Added....";

		return res1;
	}

}
