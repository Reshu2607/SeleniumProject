package BasicPackage;

class animal {
	void run() {
		System.out.println("running");
	}
	
}
	class Dog1 extends animal {
		void bark () {
			System.out.println("barking");
		}
	}


public class Signle2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog1 d1 = new Dog1();
		d1.run();
		d1.bark();
		
		
		
	}	
	}


