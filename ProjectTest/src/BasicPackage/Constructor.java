package BasicPackage;

class Truck {
	int Truckid;
	String Truckname;
	
    Truck(){
	 System.out.println("inside default constructor");
	 Truckid=101;
	 Truckname="ford";
 
 }
    Truck(int i,String str){
    	 System.out.println("inside parameterised constructor");
    	 Truckid=102;
    	 Truckname="BMW";
    }
    

    public void display() {
	System.out.println(" Truckid : " + Truckid + " Truckname :" + Truckname);
}  
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t = new Truck ();
		t .display();
		Truck t1 = new Truck ();
		t1.display();

	}
}


