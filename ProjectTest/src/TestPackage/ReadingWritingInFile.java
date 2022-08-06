package TestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingWritingInFile {

	public static void main(String[] args) throws IOException {
		File file=new File("D:/codemind.txt");
        file.createNewFile();
        
        
        String str= "This is example of file handling";
        byte [] array=str.getBytes();
        
        FileOutputStream   fileOutputStream = new FileOutputStream(file, false);
        fileOutputStream.write(array);
        fileOutputStream.close();
        
        FileInputStream fileInputStream=new FileInputStream(file);
        int i =0;
        while((i=fileInputStream.read())!=-1) {
        	
        	
            System.out.print((char)i);
        	}
        fileInputStream.close();
        
	
	}
        
        
        
        
        
	}


