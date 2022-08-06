package TestPackage;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("This is first line");
		try {
		System.out.println(10/num);
		}catch(Exception e) {
			System.out.println("Please enter valid number enter number is not valid :"+num);
		}
		System.out.println("This is third line");

	}

}
