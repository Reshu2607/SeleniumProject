/**
 * 
 */
package TestPackage;

/**
 * @author Vighnesh Ingale
 *
 */
public interface InterfacePractice {

	
	public static final int a =10;
	public abstract void additionOfTwoNumber(int a, int b);
	
	
	int b =10;
	void subofTwoNumbers(int c , int d);
	
} 
class S implements InterfacePractice{

	@Override
	public void additionOfTwoNumber(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subofTwoNumbers(int c, int d) {
		// TODO Auto-generated method stub
		
	}

}	
	class T{
 public static void main(String [] args) {
		InterfacePractice interfacePractice= new S();
		interfacePractice.additionOfTwoNumber(10,20);
}


}
	
	
	

