package BasicPackage;

public class Exceptionhand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("this is first line ");
		try {
		System.out.println(20/num);
		}catch (Exception e) {
			System.out.println("enter number is not valid please enter valid number");
			
		}
		System.out.println("this is third line");

	}

}
