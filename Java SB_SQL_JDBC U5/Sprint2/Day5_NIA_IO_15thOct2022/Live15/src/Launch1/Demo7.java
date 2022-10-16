package Launch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo7
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name: -> ");

		String name = bReader.readLine();

		System.out.println("Welcome : --> " + name);

		System.out.println("Enter Age");

		int age = Integer.parseInt(bReader.readLine());

		System.out.println("Welcome age is: --> " + age);

		System.out.println("Done");

		// Reading data
//		1. Scanner Class
//		2. BufferReadeer
//		3. Commend Line Argument

	}

}

//Note: The most enhanced reader is the BufferedReader class and the most enhanced Writer is the
//PrintWriter class.
