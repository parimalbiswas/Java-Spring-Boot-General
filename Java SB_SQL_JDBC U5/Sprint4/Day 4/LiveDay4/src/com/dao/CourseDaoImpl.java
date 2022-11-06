package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.CourseException;
import com.model.StudentCourseDTO;
import com.utility.DBUtil;

public class CourseDaoImpl implements CourseDao
{

	@Override
	public List<StudentCourseDTO> getAllStudentByCourseName(String cname) throws CourseException
	{
		List<StudentCourseDTO> list1 = new ArrayList<>();

		try (Connection conn1 = DBUtil.provideConnection())
		{
			PreparedStatement ps1 = conn1.prepareStatement("select s.roll,s.name,s.address,s.email, c.cname,c.duration "
					+ "from Student s INNER JOIN Course c INNER JOIN student_course sc "
					+ "ON s.roll=sc.roll AND c.cid =  sc.cid AND c.cname = ?");
			ps1.setString(1, cname);
			ResultSet rs1 = ps1.executeQuery();

			while (rs1.next())
			{
				// int rollX = rs1.getInt("roll");
				StudentCourseDTO dtoX = new StudentCourseDTO();
				dtoX.setRoll(rs1.getInt("roll"));
				dtoX.setName(rs1.getString("name"));
				dtoX.setAddress(rs1.getString("address"));
				dtoX.setEmail(rs1.getString("email"));
				dtoX.setCname(rs1.getString("cname"));
				dtoX.setDuration(rs1.getString("duration"));

				list1.add(dtoX);

			}

			if (list1.size() == 0)
			{
				throw new CourseException("No student Enrolled in that course");

			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new CourseException(e.getMessage());
		}

		return list1;
	}

}
