package TestPackage;

public class VotersSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		
		
		int age =19;
		try {
			if (age <=18) {
				throw new ArithmeticException("you are not eligible for voting, your age is less 18");
			}
		}catch (ArithmeticException e) {
			System.out.println("Please wait for" + (18-age)+ " years(s)");
		}
	
	    finally {
		System.out.println("Finally block executed ");
		
	}

}
}