package perisistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Department;
import model.LibraryBookDetails;

public class LibraryBookDetailsDAO {
	public static ArrayList<LibraryBookDetails> listBooks(){
		Connection con = ConnectToDB.getConnection();
		ArrayList<LibraryBookDetails> books = new ArrayList<LibraryBookDetails>();
		
		LibraryBookDetails lb = new LibraryBookDetails();
		
		String sql = "select * from orcluser.library_book_details";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next() == false) {
				System.out.println("No books in library");
			}else {
				do {
					lb.setBook_id(rs.getInt("book_id"));
					lb.setBook_title(rs.getString("book_title"));
					lb.setBook_author(rs.getString("book_author"));
					lb.setAvailable_copies(rs.getInt("available_copies"));
					lb.setDepartment(Department.valueOf(rs.getString("department")));
					books.add(lb);
				}while(rs.next());
			}
			
			ConnectToDB.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}
	
}
