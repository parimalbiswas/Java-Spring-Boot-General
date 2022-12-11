package com.parimal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parimal.model.Course;
import com.parimal.repository.CourseRepositoryDAO;

@Service
public class CourseServiceDAOImpl implements CourseServiceDAO
{
	@Autowired
	private CourseRepositoryDAO cRepoDao;

	@Override
	public Course registerNewCourse(Course course)
	{
		return cRepoDao.save(course);

	}

}
