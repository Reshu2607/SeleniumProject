package TestPackage;

public class DecisionMakingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if,if-else ,if-else-if
		
		int balance = 250000 ,age = 19, s=30;	
		
		if (balance<10000) {
			
			System.out.println("Customer will be fined Rs. 100");
			
		}else if (balance >10000 && balance <100000){
			
			System.out.println("Customer eligible for credit card with limit Rs. 10000");
			
		}else if (balance >100000 && balance <200000) {
			
			System.out.println("Customer eligible for credit card with limit Rs. 20000");
			
		}else {
			
			System.out.println("Customer is having balance more than Rs. 2,00,000");
			
		}
		System.out.println("Next set of code");
		
		//Nested if 
		
		     if (age>18)  {
			   if (age <30) {
				if (age <25) {
					
						
			  System.out.println("Eligible for NDA exam ");
						
		    }else {
					
			System.out.println("Eligible for mpsc exam");
				}
			} else {
				
				System.out.println(" Not Eligible for exam");
			}
			
			}else {
				System.out.println(" U are Not Eligible for Exam,Ur age is less then 18");
			}
		     
		     //switch statement
		     
		    switch (s) {
		     case 10:System.out.println("case 10 exicuted ");
		          System.out.println("Again case 10 statement");
		          break;
		          
		          
		     case 20:System.out.println("case 20 exicuted ");
	          System.out.println("Again case 20  statement");
	          break;
	          
		     case 30:System.out.println("case 30 exicuted ");
	          System.out.println("Again case 30 statement");
	          break;
	          
	          default : System.out.println("This is default block");
	          
		     }
		     System.out.println("Next set of statement after switch");
		     
		     
		     
			
		}
}
		
		
		
	
		    
	



