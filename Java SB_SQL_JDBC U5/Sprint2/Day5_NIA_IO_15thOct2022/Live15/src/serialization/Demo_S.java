package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo_S
{

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		List<Student> students = new ArrayList<>();
		students.add(new Student(10, "n1", 500));
		students.add(new Student(11, "n2", 400));
		students.add(new Student(12, "n3", 600));
		students.add(new Student(13, "n4", 800));
		students.add(new Student(14, "n5", 300));

		ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("d://myFile.txt"));
		oos1.writeObject(students);

		System.out.println("Done...");

	}

}
