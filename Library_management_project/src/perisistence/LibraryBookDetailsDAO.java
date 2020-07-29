package perisistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		
		LibraryBookDetails lb;
		
		String sql = "select * from orcluser.library_book_details";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next() == false) {
				System.out.println("No books in library");
			}else {
				do {
					lb  = new LibraryBookDetails();
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
	
	public static boolean insertNewBook(LibraryBookDetails book) {
		Connection c = ConnectToDB.getConnection();
		
		boolean flag = false;
		
		String sql = "insert into orcluser.library_book_details(book_title," +
				" book_author,available_copies, department)values(?,?,?,?)";
		
		try {
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, book.getBook_title());
			ps.setString(2, book.getBook_author());
			ps.setInt(3, book.getAvailable_copies());
			ps.setString(4, String.valueOf(book.getDepartment()));
			
			int res = ps.executeUpdate();
			if(res > 0) {
				//System.out.println("Row inserted");
				flag = true;
			}
			ConnectToDB.closeConnection(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public static int retrieveBookID(String name) {
		Connection c =  ConnectToDB.getConnection();
		int id = 0;
		try {
			PreparedStatement ps = c.prepareStatement("select book_id from orcluser.library_book_details"
					+ " where book_title=?");
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next() != false) {
				id  = rs.getInt("book_id");
			}
			ConnectToDB.closeConnection(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}
	
}
