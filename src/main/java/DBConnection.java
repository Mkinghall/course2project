import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static final String USERNAME ="Yamin";
	static final String PASSWORD ="Y@min12345!";
	static final String DB_URL= "jdbc:mysql://localhost:6060/zumba";
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	
	private Connection connection;
	
	public static Connection connection() {
		Connection connection = null;
		try {
			System.out.println("Create DB Connection!");
			connection =DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			
		} catch (SQLException se) {
				se.printStackTrace();
		}
		return connection;
		}
	public Connection getconection() {
		return connection;
	}
	public void closeConnection() {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static Connection initConnection() {
		// TODO Auto-generated method stub
		return null;
	}
	}

