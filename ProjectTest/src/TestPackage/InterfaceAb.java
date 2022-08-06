package TestPackage;

public interface InterfaceAb {
	int a = 20;
	void add();
	
}
interface Ac extends InterfaceAb{
	void sub();
	
}
abstract class Abc implements Ac{
	abstract void mul();
	
	
}
class AD extends Abc{

	@Override
	public void sub() {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mul() {
		// TODO Auto-generated method stub
		
	}
	
}