package TestPackage;

public class StringPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "sachin";
         String s1=new String("Sachin");
         
         System.out.println(s.hashCode());
         System.out.println(s1.hashCode());
         
         StringBuffer sb = new StringBuffer();
         sb.append("sachin");
         System.out.println(sb.append("Tendulkar"));
         
         StringBuilder sb1= new StringBuilder();
         sb1.append("sachin");
         System.out.println(sb1.append("Tendulkar"));
         
	}

}
