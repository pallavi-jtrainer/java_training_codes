package perisistence;

import model.BookTransactions;

public class BookTransactionsDAO {
	public static void insertTransaction(BookTransactions b) {
		String sql = "insert into book_transaction(BOOK_ID, LIBRARIAN_ID, STUDENT_ID, " + 
				"ISSUE_DATE, RETURN_DATE, DUE_DATE, FINE_AMOUNT) values ("+b.getBook_id()+
				", " + b.getLibrarian_id() + ", " + b.getStudent_id() + ", to_date('" +
				b.getIssue_date() + "', 'dd-mm-yyyy'), to_date('" + b.getReturn_date() +
				"', 'dd-mm-yyyy'), to_date('"+b.getDue_date()+"','dd-mm-yyyy'), " + 
				b.getFine_amt()+");";
		
	}
}
