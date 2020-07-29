package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

import perisistence.BookTransactionsDAO;
import perisistence.LibraryBookDetailsDAO;
import perisistence.StudentDAO;

public class BookTransactions {
	private int transaction_id;
	private int book_id;
	private int librarian_id;
	private int student_id;
	private String issue_date;
	private String return_date;
	private String due_date;
	private int fine_amt;
	
	//ArrayList<BookTransactions> btList = new ArrayList<BookTransactions>();
	
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
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public int getFine_amt() {
		return fine_amt;
	}
	public void setFine_amt(int fine_amt) {
		this.fine_amt = fine_amt;
	}
	
//	public BookTransactions populateArray() {
//		BookTransactions bt = new BookTransactions();
//		
//		System.out.println("Transaction ID:");
//		bt.setTransaction_id(sc.nextInt());
//		System.out.println("Book Id: ");
//		bt.setBook_id(sc.nextInt());
//		System.out.println("Librarian Id: ");
//		bt.setLibrarian_id(sc.nextInt());
//		System.out.println("Student Id");
//		bt.setStudent_id(sc.nextInt());
//		System.out.println("Enter Date: ");
//		//Date iss_date = new Date();
//				
//		String trans_date = sc.next();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
//		try {
//			Date date = sdf.parse(trans_date);
//			//Calendar cal = Calendar.getInstance();
//			
//			int day = date.getDate();
//			System.out.println(day);
//		}catch(ParseException e) {
//			System.out.println(e.getMessage());
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}finally {
//			System.out.println("In finally");
//		}
//		
//		
//		
//		return bt;
//	}
	
	public void issueBook(int libId) {
		BookTransactions transaction = new BookTransactions();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int id;
		System.out.println("Student Id: ");
		try {
			id = br.read();
			System.out.println("Book Name: ");
			String bname = br.readLine();
			
			boolean sFlag = StudentDAO.validateId(id);
			if(sFlag == true) {
				int bookId = LibraryBookDetailsDAO.retrieveBookID(bname);
				
				if(bookId > 0) {
					transaction.setBook_id(bookId);
					transaction.setStudent_id(id);
					transaction.setLibrarian_id(libId);
					
					Date d = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
					String issueDate = sdf.format(d);
					
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(d);
					
					transaction.setIssue_date(issueDate);
						
					//adding 7 days to current date
					calendar.add(Calendar.DAY_OF_MONTH, 7);
				
					String returnDate = sdf.format(calendar.getTime());
					String dueDate = sdf.format(calendar.getTime());
				
					transaction.setDue_date(dueDate);
					transaction.setReturn_date(returnDate);
					transaction.setFine_amt(0);
					
					boolean flag = BookTransactionsDAO.insertTransaction(transaction);
					
					if(flag == true) {
						System.out.println("Book issued successfully");
					}else {
						System.out.println("something went wrong. try again!");
					}
				}else {
					System.out.println("Book not found");
				}
			}else {
				System.out.println("Student not found!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
