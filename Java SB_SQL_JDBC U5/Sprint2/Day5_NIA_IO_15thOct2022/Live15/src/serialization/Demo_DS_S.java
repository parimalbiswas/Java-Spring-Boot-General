package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo_DS_S
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		// Never use Appending Mode
		FileInputStream fis1 = new FileInputStream("d://myFile.txt");

		ObjectInputStream ois1 = new ObjectInputStream(fis1);

		Object obj1 = ois1.readObject();

		List<Student> students = (List<Student>) obj1;

		// after DeSerialize Create new Student Object
		Student newStudent = new Student(50, "n50", 5000);

		students.add(newStudent);

		ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("d://myFile.txt"));

		oos2.writeObject(students);

		// students.forEach(s -> System.out.println(s));

	}

}
