import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

	public static void main(String[] args) {
		// Oracle SID = pdborcl , find yours in tnsname.ora
        try (Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/pdborcl", "sys as sysdba", "Welcome123")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
