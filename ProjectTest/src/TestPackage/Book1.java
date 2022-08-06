package TestPackage;

class NovelBook{
	int bookid = 201;
	String bookName;
	Float bookPrice;
	String PublicationName;
	
public void read() {
	System.out.println("User read book ");
}
   public String getbookName(){
	bookName=  "RadhaKrishna";
	return bookName;
}
   public float bookPrice() {
   bookPrice =  56.23f;
   return bookPrice;
   
}
   public String getPublicationName() {
	   PublicationName=  "Mamata Publication";
	   return PublicationName;
   }
	   
   }







public class Book1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          NovelBook nb = new NovelBook ();
          System.out.println("Book id : "+ nb.bookid);
          System.out.println("BookName:"+ nb.getbookName());
          System.out.println("bookPrice:" +nb.bookPrice() );
          System.out.println("PublicationName :"+nb.getPublicationName());
	}

}
