package TestPackage;

public class ProtectedUsage {
	
	 int a =20;
	 
	 public void getA()
	 {
		 System.out.println(a);
	 }
	 
	
	public ProtectedUsage(int a){
		
		System.out.println(a + "This is single parameter constructor");
		
		// or getA();(compiler by default adding this keyword)
	}
	public ProtectedUsage(int a,int b){
		this(20);
		System.out.println("This is 2 parameter constructor");
	}	
	
	public static void main(String args[]) {
		
		
		ProtectedUsage protectedUsage= new ProtectedUsage(5);
		protectedUsage.getA();
		
	
	}
}
	

	


