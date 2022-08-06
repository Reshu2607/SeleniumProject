package TestPackage;

class animal2 {
	public void eat() {
		System.out.println("Eating..");
	}
}
class Dog extends animal2{
	public void bark() {
		System.out.println("Barking..");
	}
}
class Cat extends animal2{
	public void meow() {
		System.out.println("Meowing ...");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
        c.meow();
        c.eat();
       // c.bark();
	}

}
