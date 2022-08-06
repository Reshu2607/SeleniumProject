package TestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


class ExceptionExample {

	public static void main1()throws FileNotFoundException{
		// TODO Auto-generated method stub
          File file = new File ("path");
          try {
            FileInputStream fis = new FileInputStream(file);
          }catch (FileNotFoundException e) {
        	  e.printStackTrace();
          }
	}

}




class main2 {

   public static void main(String args[]) throws FileNotFoundException {
	ExceptionExample example = new ExceptionExample();
	ExceptionExample.main1();
	
   }
   }

