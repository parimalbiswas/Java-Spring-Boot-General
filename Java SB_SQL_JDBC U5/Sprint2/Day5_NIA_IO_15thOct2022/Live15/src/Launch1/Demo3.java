package Launch1;

import java.io.FileReader;
import java.io.IOException;

public class Demo3
{

	public static void main(String[] args) throws IOException
	{
		// not suitable in term from performance

		FileReader fr1 = new FileReader("f://xxx.txt");

		int ch = fr1.read();

		while (ch != -1)
		{
			System.out.print((char) ch);
			ch = fr1.read();
		}

	}

}
