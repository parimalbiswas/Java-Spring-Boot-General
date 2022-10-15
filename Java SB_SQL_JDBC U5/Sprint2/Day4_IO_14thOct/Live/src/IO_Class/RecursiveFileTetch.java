package IO_Class;

import java.io.File;

public class RecursiveFileTetch {

	public static void readFiles(File f) {
		File file [] = f.listFiles();
		
		for (File elemFile : file) 
		{
			if (elemFile.isDirectory()) 
			{
				readFiles(elemFile);
			}
			else 
			{
				System.out.println(elemFile.getName());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("d://xyz");
		readFiles(file);
		
	}

}

//create a folder under folder and File under file manually
//Recursive file search