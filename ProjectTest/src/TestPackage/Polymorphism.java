package TestPackage;

public class Polymorphism {
	
	//compile time polymorphism /early binding method overloading 
	public void add (int a , int b) {
		
	}
	 void add (int a ,int b , int c) {
		
	}
	public int add (float a, int b){
		return 10;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism polymorphism = new Polymorphism();
      polymorphism.add(10.5f,10); 
	}

}
