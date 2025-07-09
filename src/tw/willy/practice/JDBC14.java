package tw.willy.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.willy.api.Bike;

public class JDBC14 {
	private static final String URL = "jdbc:mysql://localhost/willy";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String updateSQL = "UPDATE member SET bike = ? WHERE id = ?";
	
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("user", USER);
		prop.setProperty("password", PASSWORD);
		
		Bike b1 = new Bike();
		b1.upSpeed().upSpeed().upSpeed().upSpeed();
		System.out.println();
		
		try(Connection	conn = DriverManager.getConnection(URL, prop);){
				
				PreparedStatement pstmt = conn.prepareStatement(updateSQL);
				pstmt.setObject(1,b1);
				pstmt.setInt(2, 1);
				
				pstmt.executeUpdate();
				System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
