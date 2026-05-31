package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlSelectCommand {

	public static void main(String[] args) throws SQLException {

		// Connection URL Syntax: jdbc:mysql://ipaddress:portnumber/db_name
		String dbUrl = "jdbc:mysql://localhost:3306/emp";

		// Database Username
		String username = "root";

		// Database Password
		String password = "password";

		// Query to Execute
		String query1 = "SELECT * FROM employee";

		// Load MySQL JDBC Driver (new version)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Create Connection to DB
		Connection con = DriverManager.getConnection(dbUrl, username, password);

		// Create Statement Object
		Statement stmt = con.createStatement();

		// Execute the SQL Query
		ResultSet rs = stmt.executeQuery(query1);

		// Iterate through result
		while (rs.next()) {

			String myName = rs.getString(1); // First column
			int age = rs.getInt(2); // Second column

			System.out.println(myName + " " + age);
		}
		// Close resources
		rs.close();
		stmt.close();
		con.close();
	}
}