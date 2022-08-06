package TestPackage;

class Car {
	
	 int carId ;
	 String carName;
	 
	 Car(){
		 System.out.println("inside default constructor");
		 carId=101;
		 carName="ford";
	 }
	 Car (int i,String str){
		 System.out.println("inside parameterised constructor");
		 carId =i;
		 carName =str;
	 }
	 
	
	 public void display() {
		 
		 System.out.println("Car Id :"+ carId  + " Car name :" + carName);                    
		 
	}
}



public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1= new Car();// calling default constructor
		c1.display();
		Car c2 = new Car(102,"BMW");// calling pa rameterised constructor
		c2.display();
		
	}

}

