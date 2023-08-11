import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewStudent {

		public static void main(String args) throws SQLException {
			
			Connection connection = null;
			Statement statement = null;
			ResultSet result= null;
			
			try {
				connection = DBConnection.initConnection();
				statement = connection.createStatement();
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
}
