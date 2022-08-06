package TestPackage;

 class subClass {

	 
	 int a = 10;
	 
     public void SubClass() {
    	 System.out.println("This is super class constructor");
     }
     public subClass(int a ) {
    	 System.out.println("This is super class parameterised constructor");
     }
	public subClass() {
		// TODO Auto-generated constructor stub
	}

 }
 
     class ChildClass extends subClass {
    	 
    	 ChildClass(){
    		 super();
    		 
    		 System.out.println("This is sub class constructor");
    	 }
	    int a =20;
	    
	    public void add() {
	    	System.out.println(this.a);
	    	 System.out.println(super.a);
	    	}
	    	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	ChildClass childClass = new ChildClass();
	    	childClass.add();
	    	
	    	

	}



}