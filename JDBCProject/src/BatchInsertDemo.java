import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsertDemo {

	public static void main(String[] args) {
		try {
			Connection c =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl",
					"sys as sysdba", "Welcome123");
			
			//Statement st = c.createStatement();
			PreparedStatement st = c.prepareStatement("insert into orcluser.persons values (?,?,?,?)");
			for(int i = 10; i < 15; i++) {
				st.setInt(1, i);
				st.setString(2,  "Pallavi");
				st.setString(3, "Prasad");
				st.setInt(4, (i*3));
				st.addBatch();
			}
			
			int[] rows = st.executeBatch();
			System.out.println("The number of rows inserted: " + rows.length);
			//c.commit();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
