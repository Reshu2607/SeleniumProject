package BasicPackage;

import TestPackage.ProtectedUsage;

public class ProtectedOutsideOfPackage extends ProtectedUsage{
	
	 private static int a;



	public ProtectedOutsideOfPackage(int a) {
			super(a);
			// TODO Auto-generated constructor stub
		}
	
	
	
	public static void main(String args[])
		// TODO Auto-generated constructor stub
	{
		ProtectedOutsideOfPackage protectedUsage=new ProtectedOutsideOfPackage(a);
        protectedUsage.getA();
	
	}
	
	

}
