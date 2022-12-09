package com.parimal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parimal.exception.StudentException;
import com.parimal.model.Student;
import com.parimal.service.StudentServiceDao;

@RestController
public class StudentController
{
	@Autowired
	private StudentServiceDao sServiceDao;

	@PostMapping("/students")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student)
	{
		Student savedStudent = sServiceDao.registerStudent(student);

		return new ResponseEntity<Student>(savedStudent, HttpStatus.CREATED);
	}

	@GetMapping("/student/{r}")
	public ResponseEntity<Student> getStudentByRollHandeler(@PathVariable("r") Integer roll) throws StudentException
	{
		Student student = sServiceDao.getStudentByRoll(roll);

		return new ResponseEntity<Student>(student, HttpStatus.OK);

	}
}
