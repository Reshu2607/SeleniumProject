package TestPackage;

abstract class Z{
	
  public static void getD() {
	  System.out.println("Static method");
	  
  }
  public  void get() {
	  System.out.println("Non abstract method");
	  
  }
   abstract void get1();
}
class X extends Z{

	@Override
	void get1() {
		System.out.println("Abstract method");
	}
	
}


public class ClassAbst {
	public static void main(String [] args) {
		Z.getD();
		Z z= new X();
		z.get();
		z.get1();
	}

}
