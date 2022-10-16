package Launch1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo6
{

	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		// TODO Auto-generated method stub
		BufferedReader bfReader = new BufferedReader(new FileReader("f://www.txt"));

		String line = bfReader.readLine();

		while (line != null)
		{
			System.out.println(line);
			line = bfReader.readLine();

		}

		// BufferedReader bfReader1 = new BufferedReader(new
		// InputStreamReader(System.in));

	}

}
