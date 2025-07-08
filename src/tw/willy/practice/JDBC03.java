package tw.willy.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC03 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "root");
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/willy",prop);){
			String sql = "INSERT INTO cust (cname,tel,birthday) VALUES ('andy','123','2001-06-03')";
			
			Statement stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if(n > 0) {
				System.out.println("insert success");
			}else {
				System.out.println("insert failure");
			}
			System.out.println("-------");
			sql = "DELETE FROM cust WHERE id = 2";
			stmt.executeUpdate(sql);
			System.out.println("--------");
			sql = "UPDATE cust SET tel='456' , birthday='1997-03-04' WHERE id = 3";
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
