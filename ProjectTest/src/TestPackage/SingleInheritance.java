package TestPackage;

class A {
	public void add() {
		System.out.println("addition of two number :" +(10+20));
	}
}
class E extends A{
       public void mul() {
	System.out.println("Multiplication of two number:"+ (10*20));
}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       E e = new E();
       e.add();
       e.mul();
	}

}
