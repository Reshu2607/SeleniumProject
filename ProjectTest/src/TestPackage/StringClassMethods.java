package TestPackage;

public class StringClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String class methods
		
		String s = "This is my first string program";
		String s1= "this is my first string program";
	// charAt its getting character from respective index
	System.out.println(s.charAt(3));
	// it compares two string lexicographically
	System.out.println (s.compareTo(s1));
	// it compares two string lexicographically
	System.out.println(s.compareToIgnoreCase(s1));
    //it is used to Concatenates two string
	System.out.println(s.concat(" and this concat"));
	// Returns true if and only if this string contains the specified sequence of
	// char values
	System.out.println(s.contains(" my is  first "));
	//it is camparing whole strings
	System.out.println(s.contentEquals("This is my first string program "));
	// it is camparing whole strings
	System.out.println(s.endsWith("my first"));
	//it is camparing whole strings
	System.out.println(s.equals(s1));
	//it is compairing contents of two strings by ignoring cases
	System.out.println(s.equalsIgnoreCase(s1));
	//it will return true only if stringis empty
	System.out.println(s.isEmpty());
	// it will split string according to given regex
	String []array=s.split("first");
	for (String ss:array)
	{
		System.out.println(ss);
		
	}
	String []array1=s.split(" ", 6);
	for (String sss:array1)
	{
		System.out.println("--------------" +sss);
		
	
	}
	
		
	
	}
		
	}	
		

	


