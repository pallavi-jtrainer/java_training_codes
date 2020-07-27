package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookTransactions {
	private int transaction_id;
	private int book_id;
	private int librarian_id;
	private int student_id;
	private Date issue_date;
	private Date return_date;
	private Date due_date;
	private int fine_amt;
	
	ArrayList<BookTransactions> btList = new ArrayList<BookTransactions>();
	
	Scanner sc = new Scanner(System.in);
	
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getLibrarian_id() {
		return librarian_id;
	}
	public void setLibrarian_id(int librarian_id) {
		this.librarian_id = librarian_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public int getFine_amt() {
		return fine_amt;
	}
	public void setFine_amt(int fine_amt) {
		this.fine_amt = fine_amt;
	}
	
	public BookTransactions populateArray() {
		BookTransactions bt = new BookTransactions();
		
		System.out.println("Transaction ID:");
		bt.setTransaction_id(sc.nextInt());
		System.out.println("Book Id: ");
		bt.setBook_id(sc.nextInt());
		System.out.println("Librarian Id: ");
		bt.setLibrarian_id(sc.nextInt());
		System.out.println("Student Id");
		bt.setStudent_id(sc.nextInt());
		System.out.println("Enter Date: ");
		//Date iss_date = new Date();
				
		String trans_date = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		try {
			Date date = sdf.parse(trans_date);
			//Calendar cal = Calendar.getInstance();
			
			int day = date.getDate();
			System.out.println(day);
		}catch(ParseException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("In finally");
		}
		
		
		
		return bt;
	}
	
	
}
