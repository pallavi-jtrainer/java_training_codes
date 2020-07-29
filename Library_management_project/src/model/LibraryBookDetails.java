package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import perisistence.LibrarianDAO;
import perisistence.LibraryBookDetailsDAO;

public class LibraryBookDetails {
	private int book_id;
	private String book_title;
	private String book_author;
	private int available_copies;
	//private String department;
	private Department department;
	
	Scanner sc = new Scanner(System.in);
	
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
		
	@Override
	public String toString() {
		return "Library Book Details [book_id=" + book_id + ", book_title=" + book_title + ", book_author=" + book_author
				+ ", available_copies=" + available_copies + ", department=" + department + "]";
	}
	
	public void ListAllBooks() {
		ArrayList<LibraryBookDetails> bookList = new ArrayList<LibraryBookDetails>();
		
		bookList = LibraryBookDetailsDAO.listBooks();
		for(LibraryBookDetails book : bookList) {
			System.out.println(book.toString());
		}	
	}
	
	public void getBookDetails() {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				
		LibraryBookDetails book = new LibraryBookDetails();
		System.out.println("Book Name: ");
		String bname;
		try {
			bname = br.readLine();
			book.setBook_title(bname);
			System.out.println("Book Author: ");
			String author = br.readLine();
			book.setBook_author(author);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				//sc.next();
		System.out.println("Number of copies: ");
		book.setAvailable_copies(sc.nextInt());
		
		System.out.println("Department[Science, Maths, Information_Technology]: ");
		String dept = sc.next();
		dept = dept.toUpperCase();
		book.setDepartment(Department.valueOf(dept));
		
		boolean flag = LibraryBookDetailsDAO.insertNewBook(book);
		
		if(flag == true)
			System.out.println("Book added to the database");
		else
			System.out.println("Unable to add the book");
	}
}
