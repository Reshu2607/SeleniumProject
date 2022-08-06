package TestPackage;


abstract class F{
	public static void getG() {
		System.out.println("Static method");
	
}
	public void get() {
		System.out.println("Non abstract");
	}
	abstract void get1() ;	

}

class G extends F{

	@Override
	void get1() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method ");
	

	
	}
}
public class AbstractClass {
	
	public static void main(String [] args ) {
       F.getG();
       F f = new G();
       f.get();
       f.get1();
       
}
}