package com.parimal.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parimal.model.Course;
import com.parimal.model.Student;
import com.parimal.repository.CourseRepositoryDAO;

@Service
public class CourseServiceDAOImpl implements CourseServiceDAO
{
	@Autowired
	private CourseRepositoryDAO cRepoDao;

	@Override
	public Course registerNewCourse(Course course)
	{
		Set<Student> students = course.getStudentSet();

		for (Student studentElem : students)
		{
			studentElem.getCourseSet().add(course);
		}

		return cRepoDao.save(course);

	}

}
