package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable
{
	int i = 10;

	public void fun1()
	{
		System.out.println("Inside FunA() of A");
		System.out.println(i);
	}
}

public class CLS1
{

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
//		Student s1 = new Student(10, "Ram", 320);

		A a1 = new A();
		a1.i = 200;

		ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("d://kk.txt"));
		oos1.writeObject(a1);

		System.out.println("Done...");

	}

}
