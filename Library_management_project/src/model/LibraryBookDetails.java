package model;

public class LibraryBookDetails {
	private int book_id;
	private String book_title;
	private String book_author;
	private int available_copies;
	//private String department;
	private Department department;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public int getAvailable_copies() {
		return available_copies;
	}
	public void setAvailable_copies(int available_copies) {
		this.available_copies = available_copies;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department dept) {
		this.department = dept;
	}
	
	
	
}
