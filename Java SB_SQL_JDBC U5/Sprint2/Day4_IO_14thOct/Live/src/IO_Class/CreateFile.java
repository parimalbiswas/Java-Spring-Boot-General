package IO_Class;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File("e://abc.txt");
		
		System.out.println(f1);
		
		System.out.println(f1.exists());
		
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(f1.exists());
		
		

	}

}
