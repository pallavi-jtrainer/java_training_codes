package demoPackage;

public class HelloWorld {

	public static void main(String[] args) {
//		System.out.println("Hello World");
		// bd is the reference object
		BookDetails bd = new BookDetails();
		bd.bookName = "Tell me your dreams";
		bd.isbnNumber=234626;
		bd.acceptData(1, 250.00);
		bd.printBookDetails();
		
		BookDetails book = new BookDetails(2, "Remember Me", 280.00, 123456);
		book.printBookDetails();
		
	}

}
