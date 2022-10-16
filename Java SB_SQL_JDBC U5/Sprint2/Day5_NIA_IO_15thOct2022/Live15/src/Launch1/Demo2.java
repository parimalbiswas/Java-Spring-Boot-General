package Launch1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileWriter fw2 = new FileWriter("abbbb.txt");

		fw2.write(100);
		fw2.write("\n");
		fw2.write("Welcome");

		fw2.flush();
		fw2.close();

		System.out.println("Done");

		// Limitation - Line separatator add
		// manually karna parta hai

//		------------------------------------------
		// 2nd way of Create file
		File file = new File("ghf.txt");

		FileWriter fw11 = new FileWriter(file, true);

	}

}
