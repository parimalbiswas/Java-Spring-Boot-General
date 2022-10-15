package IO_Class;

import java.io.File;
import java.io.IOException;

public class CreateFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f11 = new File("JioFiles");
		
		File f12 = new File("e://","JioFiles");
		
		f11.mkdir(); // create folder
		f12.mkdir();
		try {
			f12.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(f11);
		System.out.println(f11.exists());
		

	}

}
