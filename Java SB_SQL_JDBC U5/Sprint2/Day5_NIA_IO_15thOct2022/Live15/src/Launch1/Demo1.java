package Launch1;

import java.io.FileWriter;
import java.io.IOException;

public class Demo1
{

	public static void main(String[] args) throws IOException
	{
		FileWriter fw1 = new FileWriter("abb.txt", true);

		fw1.write(102);

		System.out.println("Done...");

		fw1.flush();
		fw1.close();

	}
}
