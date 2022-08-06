package TestPackage;

class TestOperators {
	
	int i = 10, j =10, k = 10,l= 10;
	
	public void prefixPlusExample() {
		
		
		System.out.println("prefix plus: "+ ++i);
	}
	public void postfixPlusExample() {
		
		System.out.println("postfix Plus: "+ j++);
		System.out.println("Updated value of J:"+ j);
}
	public void prefixMinusExample() {
		System.out.println("prefix Minus:"+ --k);
	}



	public void postfixMinusExample() {
		System.out.println("postfix Minus:" +l--);
		System.out.println("Updated value of L:"+l);
		
	}	
	public void arithmaticCalculation() {
		
		int m=10,n=20,o;
		o = m + n;
		System.out.println("Addition : "+ o);
		
		o= n-m;     //20-10
		System.out.println("substraction :"+o);
		
		o= m*n;
		System.out.println("Multiplication :"+o);
		
		o = n/m;    //20/10
		System.out.println("division :"+o);
	}
	public void relationalOperator() {
		int w = 5000, p= 10, u= 20;
		 
         if (w <=5000) {
			System.out.println("Balance is less than 5000");

	}  
               if (w>=5000) {
			System.out.println("Value of w is greater than or equal to 5000");
		}
		if (w==5000){
			System.out.println("Value of W is equal to 5000");
		}
		if (p!=u) {
			System.out.println("Two variable P and U are  not equal");
		}
	}
	       public void logicalOperators() {
			
		
			int j =10,k =20, m=30;
			
			if (j==10 && k==20 && m==30) {
				
				System.out.println("conditions is matching for AND Operator");
	}
			if (j==10 || k==20) {
				System.out.println("Condition is matching for OR Operator");
		}
  }
		public void ternaryOperator() {
			int m, i=10;
			m = i>20 ? 100:200;
			System.out.println("Ternary operator :"+ m);
	}
		public void assignmentOperators() {
			int i= 15;
			// Addition equal to example 
			i +=20;  //i=i+20
		   System.out.println("Value of I (+=):"+i);
	}
            //Substraction equal to example
		{

			int i= 15;
			i-=20;//i=i-20
			System.out.println("Value of I (-=):"+i);
			
	}
		   //Multiplication equal to example 
		  {
			  int i= 15;
		     i *=20;// i=i*20
		    System.out.println("Value of I (*=):"+i);

	}
		    //division equal to example
		 {
			 int i= 20;
			   i /=15;// i=i/20                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
			   System.out.println("Value of I (/=):"+i);

			 }
		
} 

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestOperators tp = new TestOperators () ;
		
		    //prefix example 
			//tp.prefixPlusExample();
			//tp.postfixPlusExample();
			
			//postfix example
			//tp.prefixMinusExample();
			//tp.postfixMinusExample();
			
			//arithmatic calculation example
			//tp.arithmaticCalculation();
		 
		    // relational operator
		    // tp.relationalOperator();
		
		  //  tp.logicalOperators();
		
		      // tp.ternaryOperator();
		      tp.assignmentOperators();
		  
		}
	
}






		
	

