package JDBC;

import java.sql.*;
import java.util.ArrayList;

public class ex1 {
	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		ArrayList<String> users = new ArrayList<String>();

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/flaskapp?" + "user=root&password=");
			System.out.println("aw sweet connection baby");
			
			
			stmt = con.createStatement();
			rs  = stmt.executeQuery("SELECT * FROM users");
			
			
			while(rs.next()) {
				
				int i = 1;
				while(i <= 3) {
					users.add(rs.getString(i++));
				}
				
				for(String s:users) {
					System.out.println(s);
				}
			}

		} catch (SQLException ex) {

			ex.printStackTrace();
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

	}
}

/*
 # mysql config 
 localhost:61259 app.config['MYSQL_HOST'] = 'localhost'
 app.config['MYSQL_USER'] = 'root' 
 app.config['MYSQL_PASSWORD'] = '' 
 */