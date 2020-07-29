package perisistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
	public static boolean validateId(int id) {
		boolean flag = false;
		
		Connection c = ConnectToDB.getConnection();
		
		try {
			PreparedStatement ps = c.prepareStatement("select * from orcluser.student where student_id = ?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next() != false)
				flag = true;
			
			ConnectToDB.closeConnection(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}
