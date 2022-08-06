package BasicPackage;

class p {
	public void division() {
		System.out.println("Division of two number :" +(20/5));
	}
}
	class Q extends p{
		public void mul() {
			System.out.println("Multiplication of two number :"+(40*20));
		}
	}


public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Q q = new Q();
        q.division();
        q.mul();
	}

}
