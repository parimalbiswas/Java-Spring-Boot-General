package com.parimal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parimal.model.Course;

@Repository
public interface CourseRepositoryDAO extends JpaRepository<Course, Integer>
{

}
