import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class JDBCDemo {
	/*
	 * steps to connect to Oracle
	 * 1. Register your driver
	 * 2. create a connection
	 * 
	 * perform operations
	 * 1. create statement
	 * 2. execute statement
	 * 3. close connection
	 */
	public static void main(String[] args) {
		/*
		 * thin driver
		 * 2 ways to connect
		 * 1. using SID
		 * 2. Service Name
		 */
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","sys as sysdba", "Welcome123");
		
			if(con != null) {
				System.out.println("Connected to Database");
				
				//PreparedStatement ps = con.prepareStatement("select * from orcluser.customers where credit_limit > ?");
				//ps.setFloat(1, 2500);
				//ResultSet rs = ps.executeQuery();
				
//				Statement stmt = con.createStatement();
//				ResultSet rs = stmt.executeQuery("select * from orcluser.customers");
				
//				while(rs.next()) {
//					System.out.println("ID: " + rs.getInt("customer_id"));
//					System.out.println("Customer Name: " + rs.getString(2));
//					System.out.println("Address: " + rs.getString("address"));
//					System.out.println("Credit Limit: " + rs.getFloat("credit_limit"));
//					System.out.println("Website: " + rs.getString("website"));
//					System.out.println("**************************************");
//					System.out.println();
//				}
				
				// insert a record
//				String sql = "insert into orcluser.customers values(?, ?, ?,?,?)";
//				PreparedStatement ps = con.prepareStatement(sql);
//				ps.setInt(1, 50);
//				ps.setString(2, "Cheetah Prints");
//				ps.setString(3, "Green Valley, Manahattan");
//				ps.setFloat(4, 4000);
//				ps.setString(5, "http://www.printcheetah.com");
//				
//				//insert into tablename (list of columns) values(id, 'name', to_date('12/10/2020','dd-mm-yyyy'))
//				
//				//int rows = stmt.executeUpdate(sql);
//				int rows = ps.executeUpdate();
//				
//				if(rows > 0) {
//					System.out.println("Insert successful");
//					
//				}else
//					System.out.println("Unable to insert record");
				
				CallableStatement cs = con.prepareCall("{call orcluser.get_emp_name(?,?)}");
				cs.setInt(1, 2005);
				cs.registerOutParameter(2, Types.VARCHAR);
				
				cs.execute();
				System.out.println(cs.getString(2));
			}
			else
				System.out.println("Connection failed");
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
