package TestPackage;

class Student {
	
     public int sid=10 ;
     final int age=20;
     static int i =50;
    
    
    public void display() {
	  
    	 sid = 1;
       System.out.println("Sid :"+ sid);
 	           //age = 50; we can not modify the value of final variable 
  }
    //local variable
    public void show() {
    	int j= 10;
    	System.out.println("value of j:"+j); 
    }
	
}

public class NonAccessModifire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		
		//instance variable
		System.out.println(" value of SID in s1:"+ s1.sid);
		System.out.println(" value of SID in s2:"+ s2.sid);
		System.out.println(" value of SID in s3:"+ s3.sid);
		
		s1.sid=20;
		s2.sid=30;
		s3.sid=40;
		
		System.out.println(" value of SID in s1 Aftter modification :"+ s1.sid);
		System.out.println(" value of SID in s2 Aftter modification :"+ s2.sid);
		System.out.println(" value of SID in s3 Aftter modification :"+ s3.sid);
		
		//Static variable example
		
		/*System.out.println("value of SID in s1: " + s1.i);
		System.out.println("value of SID in s2: " + s2.i);
		System.out.println("value of SID in s3: " + s3.i);
		
		s1.i = 100;
		
		System.out.println("value of SID in s1 After modification: " + s1.i);
		System.out.println("value of SID in s2 After modification: " + s2.i);
		System.out.println("value of SID in s3 After modification: " + s3.i);
		 
		s2.i= 70;
		
		System.out.println("value of SID in s1 After modification: " + s1.i);
		System.out.println("value of SID in s2 After modification: " + s2.i);
		System.out.println("value of SID in s3 After modification: " + s3.i);
		s1.show();*/
		
	
	}

}
