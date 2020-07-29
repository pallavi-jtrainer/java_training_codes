package perisistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.BookTransactions;

public class BookTransactionsDAO {
	public static boolean insertTransaction(BookTransactions b) {
		String sql = "insert into orcluser.book_transaction(BOOK_ID, LIBRARIAN_ID, STUDENT_ID, "+
					"ISSUE_DATE, RETURN_DATE, DUE_DATE, FINE_AMOUNT) values (" +
					" ?,?,?,to_date(?,'dd-mm-yyyy'),to_date(?,'dd-mm-yyyy')," +
					"to_date(?,'dd-mm-yyyy'),?)";
		
		boolean flag = false;
		
//		String sql = "insert into book_transaction(BOOK_ID, LIBRARIAN_ID, STUDENT_ID, " + 
//				"ISSUE_DATE, RETURN_DATE, DUE_DATE, FINE_AMOUNT) values ("+b.getBook_id()+
//				", " + b.getLibrarian_id() + ", " + b.getStudent_id() + ", to_date('" +
//				b.getIssue_date() + "', 'dd-mm-yyyy'), to_date('" + b.getReturn_date() +
//				"', 'dd-mm-yyyy'), to_date('"+b.getDue_date()+"','dd-mm-yyyy'), " + 
//				b.getFine_amt()+");";
//	
		Connection con = ConnectToDB.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, b.getBook_id());
			ps.setInt(2, b.getLibrarian_id());
			ps.setInt(3, b.getStudent_id());
			ps.setString(4, b.getIssue_date());
			ps.setString(5, b.getReturn_date());
			ps.setString(6, b.getDue_date());
			ps.setInt(7, b.getFine_amt());
			
			int rows = ps.executeUpdate();
			
			if(rows > 0)
				flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
}
