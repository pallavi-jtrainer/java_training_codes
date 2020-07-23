package demoPackage;

public class BookDetails {
	//member variables or attributes
	private int bookId;
	String bookName;
	private double price;
	public long isbnNumber;
	Author author;
	
	public BookDetails() {}
	
	//parameterized constructor
	public BookDetails(int bookId, String bookName, double price, long isbnNumber) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.isbnNumber = isbnNumber;
	}
	
	//member methods
	public void acceptData(int bId, double p) {
		bookId = bId;
//		bookName = bName;
		price = p;
//		isbnNumber = isbn;
	}
	
	public void printBookDetails() {
		System.out.println("Book Id: " + bookId + " Book name: " + bookName
				+ " Price: " + price);
	}
}
