package TestPackage;

class ComicBook {
	
	int bookid = 101;
	String bookName;
	Float bookPrice;
	String PublicationName;
	
	private int t = 50; 
	
	public void read() {
		System.out.println("User reads book");
		System.out.println("Private variable:"+t);
		
	}
	
	public String getBookName() {                               
		
	      bookName ="Core Java ";
	      return bookName;
	      
	}
	
                                                                        
	
	}





public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComicBook cb = new ComicBook();
		cb.read();
		
		System.out.println("Book id :"+ cb.bookid);
		System.out.println("Book Name:"+ cb.getBookName());
		
		
		
	}

}
