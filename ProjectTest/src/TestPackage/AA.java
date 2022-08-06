package TestPackage;

public interface AA {
	int a =10;
	void sub();
	

}
interface BB extends AA{
	void  add();
	
}
abstract class CCC implements BB {
	abstract void mul();{
}
class DD extends CCC {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mul() {
		// TODO Auto-generated method stub
		
	}
	
}
}