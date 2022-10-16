package Launch1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo8
{

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub

		// FileWriter fw=new FileWriter("abc.txt",true);
		// PrintWriter out=new PrintWriter(fw);
		// or
		PrintWriter out = new PrintWriter("dabc.txt");
		out.write(100);// d will be added
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("amit");

		out.flush(); // need not call the flush method
		out.close();

		System.out.println("done..");

	}

}
