package TestPackage;

import java.util.Scanner;

public class TakingInputFromUser {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
       
		System.out.println("Please enter you input");
		String str= scanner.nextLine();
		System.out.println(str);
		scanner.close();
		
		
		
	}

}
