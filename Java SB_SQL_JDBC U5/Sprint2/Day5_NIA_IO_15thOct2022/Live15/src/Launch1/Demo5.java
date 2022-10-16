package Launch1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo5
{

	public static void main(String[] args) throws IOException
	{
		// 1st Way
		FileWriter fw1 = new FileWriter("uuu.txt");
		BufferedWriter bWriter = new BufferedWriter(fw1);

		// 2nd Way
		BufferedWriter bWriter2 = new BufferedWriter(new FileWriter("www.txt"));

		bWriter2.write(100);
		bWriter.newLine();
		bWriter2.write("Ramesh");
		bWriter2.newLine();
		bWriter2.write("India");

		bWriter2.flush();
		bWriter2.close();

		System.out.println("Done");

	}

}
