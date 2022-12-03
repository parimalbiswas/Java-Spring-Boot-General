package com.parimal.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parimal.model.Student;

//@RequestMapping("/studentapp")
@RestController
public class MyController
{
	@RequestMapping("/welcome")
	public String myWelcomeService()
	{
		return "Welcome to SpringBoot";
	}

	@RequestMapping("/")
	public String myHellowService()
	{
		return "Welcome to HeLLOW";
	}

	@RequestMapping("/getstudent/{r}/{n}/{m}")
	public Student getStudentHandeller(@PathVariable("r") Integer roll, @PathVariable("n") String name,
			@PathVariable("m") Integer marks)
	{
		Student student = new Student(roll, name, "Kolkata", marks);

		return student;
	}

	@RequestMapping("/getstudent/{r}")
	public Student getStudentHandeller(@PathVariable("r") Integer roll)
	{
		Student student = new Student(roll, "Parimal", "Kolkata", 500);

		return student;
	}

	@RequestMapping("/getstudent1/{r}")
	public Student getStudentHandeller1(@PathVariable("r") Integer roll,
			@RequestParam(value = "address", required = false) String address)
	{
		Student student = new Student(roll, "Parimal", address, 500);

		return student;
	}

	@RequestMapping("/getstudent")
	public Student getStudentHandeller(@RequestParam(value = "r", required = false) Integer roll,
			@RequestParam("n") String name)
	{
		Student student = new Student(roll, name, "Kolkata", 500);

		return student;
	}

	// @RequestMapping("/students")
	@RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAllStudentHandeller()
	{
		List<Student> list = Arrays.asList(

				new Student(10, "A", "AA", 200), new Student(15, "B", "BB", 143), new Student(20, "V", "VV", 899)

		);

		return list;
	}

	@PostMapping("/students1")
	public String saveStudentHandler(@RequestBody Student student)
	{

		return student.toString() + "saved Succsfully...";
	}
}
