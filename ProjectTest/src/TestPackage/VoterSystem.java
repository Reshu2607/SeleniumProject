package TestPackage;

public class VoterSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int age =17;
            
    
        if (age<18) 
        	  try {
            throw new ArithmeticException("you are not eligible for voting, your age is less than 18 ");
 
         }catch (ArithmeticException e) {
            		
      	      System.out.println("Please wait for "+(18-age)+ "year(s)");
         }
      	    	  finally {
      	    		  System.out.println("Block is executed");
      	    	  }
                
        
        
        
        
        
      	      }
            
        
            		
        }
           
	

	

