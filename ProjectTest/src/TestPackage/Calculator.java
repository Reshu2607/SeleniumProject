package TestPackage;

	class operation {
		
		int a = 10, b =20,c,d;
		
		public void addition () {
			
			 c = a + b;
			System.out.println("Addition : " + c );
		}
		
		
		public int  add () {
			
		c = a + b;
		return d ;
		
		}
		
		 
		public void sub(int i, int j ) {
			
			int k = j - i;
			System.out.println("function with argument : " + k);
		}
		
	     public int mul(int i, int j) {
	    	 int k = i * j;
	    	 return k ;
	    	 
		
		
	     }
	   
	    	 
	    	 
	    public class Calculator {

		     public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	         operation op = new operation();
	         
	         System.out.println("value of variable a :"+ op.a); // access the variable 
	         
	         op.addition();    //access the methods of class 
	         
	         System.out.println("Returned value: "+ op.add());
	         
	         op.sub(10,20);
	         
	         System.out.println("Returned mul value : " + op.mul(10,20));
	         
		}
		     
	    }
	}

	    


	
	
	
	
	
	