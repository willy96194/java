package tw.willy.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class WillyUtil {
	private static final String URL = "jdbc:mysql://localhost/willy";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	public static Connection getConnection() throws SQLException{
		Properties prop = new Properties();
		prop.setProperty("user", USER);
		prop.setProperty("password", PASSWORD);
		
		return DriverManager.getConnection(URL, prop);
	}

}
