package TestPackage;

class Parent{
	int age =50;
	public void getAge() {
		System.out.println("Parent age = " +age);
	}
	public void getName() {
		System.out.println("Name is Sachin");
		
	}
	

}
class Child extends Parent{
	  int age =25;
	  
	public void getAge() {
		System.out.println("Child age = " +age);
	}
	
}



public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.getAge();
        p.getName();
        
	}

}
