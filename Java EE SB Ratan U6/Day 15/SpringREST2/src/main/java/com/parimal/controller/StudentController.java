package com.parimal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ResponseEntity<Student> getStudentByRollHandeler(@PathVariable("roll") Integer roll)
	{

		List<Student> list = students.stream().filter(s -> s.getRoll() == roll).collect(Collectors.toList());

		if (list.size() == 0)
		{
			throw new IllegalArgumentException("Student Does Not Exist");
		}

		// return list.get(0);

		HttpHeaders hh = new HttpHeaders();
		hh.add("jwt", "mjhkhkjh");
		hh.add("user", "admin");

		return new ResponseEntity<Student>(list.get(0), hh, HttpStatus.OK);
	}

	@PostMapping("/students")
	public ResponseEntity<String> addStudentHandeler(@RequestBody Student student)
	{

		String res1 = "";

		students.add(student);

//		res1 = "Student Added Succssfully....";
//		return res1;

		return new ResponseEntity<String>("Student Added Succssfully....", HttpStatus.CREATED);
	}

	@PutMapping("/students/{roll}")
	public Student updateStudentHandeler1Entire(@RequestBody Student studentResv, @PathVariable("roll") Integer roll)
	{
		boolean flag = false;

		Student studentRETURN = null;

		for (Student elem1 : students)
		{
			if (elem1.getRoll() == roll)
			{
				elem1.setName(studentResv.getName());
				elem1.setMarks(studentResv.getMarks());
				flag = true;
			}

			studentRETURN = elem1;
		}

		if (flag != true)
		{
			throw new IllegalArgumentException("Student does not exist with roll " + roll);
		}

		return studentRETURN;
	}

	@PutMapping("/studentsmarksupdate/{roll}")
	public Student gracemarksHandelr(@PathVariable("roll") Integer roll, @RequestParam("gmarks") Integer gmarks)
	{
		boolean flag = false;

		Student studentRETURN = null;

		for (Student elem1 : students)
		{
			if (elem1.getRoll() == roll)
			{

				elem1.setMarks(elem1.getMarks() + gmarks);
				flag = true;
				studentRETURN = elem1;
			}

		}

		if (flag != true)
		{
			throw new IllegalArgumentException("Student does not exist with roll " + roll);
		}

		return studentRETURN;

	}

	@DeleteMapping("/students/{roll}")
	public Student deleteStudentByRollHandeler(@PathVariable("roll") Integer roll)
	{
		Student student = null;

		boolean flag = students.removeIf(s -> s.getRoll() == roll);

		if (flag != true)
		{
			throw new IllegalArgumentException("Student does not exist with roll " + roll);
		}
		else
		{
			System.out.println("Sutudent Deleted Succsfully...");
		}

		return student;
	}

}
