package com.dao;

import java.util.List;

import com.exception.CourseException;
import com.model.StudentCourseDTO;

public interface CourseDao
{
	public List<StudentCourseDTO> getAllStudentByCourseName(String cname) throws CourseException;
}
