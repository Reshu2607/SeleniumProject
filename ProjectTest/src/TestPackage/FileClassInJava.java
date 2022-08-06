package TestPackage;

import java.io.File;
import java.io.IOException;

public class FileClassInJava {
	
	public static void main(String []args) throws IOException {
		File file = new File("D:\\codemind.txt");
		file.createNewFile();
		System.out.println(file.canRead());		
		System.out.println(file.canWrite());	
		System.out.println(file.getAbsolutePath());	
		System.out.println(file.getName());	
		System.out.println(file.length());
		file.delete();
	}

}
