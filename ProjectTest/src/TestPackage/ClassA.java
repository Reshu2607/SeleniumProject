package TestPackage;

class B {

	public void add() {
		System.out.println("Addition of two numbers: " + (10 + 20));
	}

}

class C extends B {
	public void substract() {
		System.out.println("Substarction of two numbers: " + (20 - 10));
	}

}

public class ClassA {
	public static void main(String args[]) {
		C c = new C();
		c.add();
		c.substract();
	}
}

