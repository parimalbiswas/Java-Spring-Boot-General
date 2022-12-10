package com.parimal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.parimal.exception.StudentException;
import com.parimal.model.Student;
import com.parimal.service.StudentServiceDao;

@RestController
public class StudentController
{
	@Autowired
	private StudentServiceDao sServiceDao;

	@PostMapping("/student")
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

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudentHandler() throws StudentException
	{

		List<Student> students = sServiceDao.getAllStudents();

		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	@DeleteMapping("/student/{roll}")
	public ResponseEntity<Student> deleteStudentByRollHandler(@PathVariable("roll") Integer roll)
			throws StudentException
	{
		Student deletedStudent = sServiceDao.deleteStudentByRoll(roll);

		return new ResponseEntity<Student>(deletedStudent, HttpStatus.OK);

	}

	@PutMapping("/student")
	public ResponseEntity<Student> updateStudentHandler(@RequestBody Student student) throws StudentException
	{

		Student updatedStudent = sServiceDao.updateStudentDetails(student);

		return new ResponseEntity<Student>(updatedStudent, HttpStatus.ACCEPTED);
	}

	@PutMapping("/student/{roll}")
	public ResponseEntity<Student> updateStudentMarksHandler(@PathVariable("roll") Integer roll,
			@RequestParam("gmarks") Integer gmarks) throws StudentException
	{

		Student updatedStudent = sServiceDao.updateStudentMarks(roll, gmarks);

		return new ResponseEntity<Student>(updatedStudent, HttpStatus.ACCEPTED);
	}

	@GetMapping("/getstudentbymarks/{marks}")
	public ResponseEntity<List<Student>> getStudentsByMarksHandler(@PathVariable("marks") Integer marks)
			throws StudentException
	{
		List<Student> students = sServiceDao.getStudentsByMarks(marks);

		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	@GetMapping("/getstudentbyaddress/{address}")
	public ResponseEntity<Student> getStudentsByAddressHandler(@PathVariable("address") String address)
			throws StudentException
	{
		Student student = sServiceDao.getStudentByAddress(address);

		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	@GetMapping("/getname/{roll}")
	public ResponseEntity<String> getStudentNameByRollHandler(@PathVariable("roll") Integer roll)
			throws StudentException
	{
		String name = sServiceDao.getStudentNameByRoll(roll);

		return new ResponseEntity<String>(name, HttpStatus.OK);
	}

}
