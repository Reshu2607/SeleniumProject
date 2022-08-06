package TestPackage;

class C1 {
	public void add() {
		System.out.println("addition of two number :"+ (10+20));
	}
	
}
 class D extends  C1 {
	 public void substract() {
		 System.out.println("substract of two number :"+ (20-10));
		 
		 
		 
	 }
	 
 }
public class ClassB {
	public static void main (String []args) {
	D d  = new D ();
	d.add();
	d.substract();
	
	

}
}
