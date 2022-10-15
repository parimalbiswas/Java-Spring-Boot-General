package IO_Class;

import java.io.File;

public class FetchFile {

	public static void main(String[] args) {

		File f11 = new File("d://");
		
		String string [] = f11.list();
		
		for (String element1 : string) {
			System.out.println(element1);
		}
		
		
		File filesFileArrFile [] = f11.listFiles();
		
		for (File file : filesFileArrFile) {
			System.out.println(file);
		}
		

	}

}
