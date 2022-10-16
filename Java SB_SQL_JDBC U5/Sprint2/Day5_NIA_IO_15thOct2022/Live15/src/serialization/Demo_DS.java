package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo_DS
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fis1 = new FileInputStream("d://myFile.txt");

		ObjectInputStream ois1 = new ObjectInputStream(fis1);

		Object obj1 = ois1.readObject();

		List<Student> students = (List<Student>) obj1;

		students.forEach(s -> System.out.println(s));
	}

}
