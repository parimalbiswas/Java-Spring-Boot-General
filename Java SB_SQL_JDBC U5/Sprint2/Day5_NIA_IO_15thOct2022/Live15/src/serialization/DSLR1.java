package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class DSLR1
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		InputStream fis1 = new FileInputStream("d://kk.txt");

		ObjectInputStream ois1 = new ObjectInputStream(fis1);

//		Object obj1 = ois1.readObject();

		A a1 = (A) ois1.readObject();

		a1.fun1();
	}

}
