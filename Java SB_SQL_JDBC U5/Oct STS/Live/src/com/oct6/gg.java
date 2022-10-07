package com.oct6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class gg
{

	public static void main(String[] args)
	{
		List<Student> students = new ArrayList<>();
		ArrayList<Student> students2 = new ArrayList<>();
		Collection<Student> students3 = new ArrayList<>();
		Object students4 = new ArrayList<>();

		ArrayList<Student> aList = (ArrayList<Student>) students4; // DownCasting

		aList.add(null);

	}

}
