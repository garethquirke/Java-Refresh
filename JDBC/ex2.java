package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ex2 {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		ArrayList<Guitar> guitars = new ArrayList<Guitar>();
		
		

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/jdbcDB?" + "user=root&password=");
			System.out.println("aw sweet connection baby");
			
			
			// query from guitar db and return results to an arraylist of that object
			stmt = con.createStatement();
			rs  = stmt.executeQuery("SELECT * FROM guitar");
			
			while(rs.next()) {
				guitars.add(new Guitar(rs.getString("name"), rs.getDouble("price")));
			}
			
			
			output(guitars);
			

		} catch (SQLException ex) {

			ex.printStackTrace();
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

	}
	
	public static void output(ArrayList<Guitar> guitars) {
		for(Guitar g: guitars) {
			System.out.println(g.Name);
			System.out.println(g.Price);
		}
	}

}
