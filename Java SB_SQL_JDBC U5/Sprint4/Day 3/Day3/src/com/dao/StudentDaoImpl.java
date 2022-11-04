package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;
import com.utility.DBUtil;

public class StudentDaoImpl implements StudentDao
{

	@Override
	public String insertStudentDetails(int roll, String name, int marks)
	{
		String message = "Not Inserted........";

		try (Connection conn1 = DBUtil.provideConnection())
		{
			PreparedStatement ps1 = conn1.prepareStatement("insert into student values(?,?,?)");

			ps1.setInt(1, roll);
			ps1.setString(2, name);
			ps1.setInt(3, marks);

			int x = ps1.executeUpdate();

			if (x > 0)
			{
				message = "Record inserted succsfully...";
			}

		}
		catch (SQLException e)
		{
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public String insertStudentDetails2(Student student)
	{
		String message = "Not Inserted........";

		try (Connection conn1 = DBUtil.provideConnection())
		{
			PreparedStatement ps1 = conn1.prepareStatement("insert into student values(?,?,?)");

			ps1.setInt(1, student.getRoll());
			ps1.setString(2, student.getName());
			ps1.setInt(3, student.getMarks());

			int x = ps1.executeUpdate();

			if (x > 0)
			{
				message = "Record inserted succsfully...";
			}

		}
		catch (SQLException e)
		{
			message = e.getMessage();
		}

		return message;
	}

}
