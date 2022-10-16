package Launch1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo4
{

	public static void main(String[] args) throws IOException
	{
		// It is used to read small file . long file wont work
		File f1 = new File("f://xxx.txt");

		long len = f1.length();

		FileReader fr1 = new FileReader(f1);

		char[] chr = new char[(int) len];

		fr1.read(chr);

		for (char c : chr)
		{
			System.out.print(c);
		}

	}

}
