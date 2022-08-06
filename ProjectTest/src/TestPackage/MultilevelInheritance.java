package TestPackage;

class zooanimal{
	public void eat() {
		System.out.println(("eating..."));
	}
}
class dogz extends zooanimal {
	public void bark() {
		System.out.println(("barking..."));
	}
}
class Babydog extends dogz {
	public void weep() {
		System.out.println(("weeping..."));
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babydog d = new Babydog();
       d.eat();
       d.bark();
       d.weep();
      
      }

}
