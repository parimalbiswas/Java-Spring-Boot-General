package com.parimal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parimal.model.Course;
import com.parimal.service.CourseServiceDAOImpl;

@RestController
public class CourseController
{
	@Autowired
	private CourseServiceDAOImpl cServiveDao;

	@PostMapping("/savecourse")
	public ResponseEntity<Course> saveCourseHandler(@RequestBody Course course)
	{
		Course addedCourse = cServiveDao.registerNewCourse(course);

		return new ResponseEntity<Course>(addedCourse, HttpStatus.ACCEPTED);

	}
}
