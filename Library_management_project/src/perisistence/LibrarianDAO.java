package perisistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibrarianDAO {
	public boolean validate(int id, String pass) {
		boolean flag = false;
		Connection connection = ConnectToDB.getConnection();
		String sql = "select librarian_password from orcluser.librarian where librarian_id = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next() == false) {
				System.out.println("Librarian does not exist");
			}else {
				String data = rs.getString("librarian_password");
				
				if(pass.equals(data)) {
					flag = true;
				}
			}
			ConnectToDB.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}
