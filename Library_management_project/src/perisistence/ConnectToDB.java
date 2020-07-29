package perisistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {
	public static Connection getConnection() {
		Connection connect = null;
		try {
			connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl", 
					"sys as sysdba", "Welcome123");
			
			if(connect != null)
				System.out.println("connected!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connect;
	}
	
	public static void closeConnection(Connection c) {
		try {
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
