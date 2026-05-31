package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlInsertCommand {

	public static void main(String[] args) throws SQLException {

		String dbUrl = "jdbc:mysql://localhost:3306/emp";
		String username = "root";
		String password = "password";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();

		System.out.println(" Existing Records ");

		ResultSet rs1 = stmt.executeQuery("SELECT * FROM employee");

		while (rs1.next()) {
			String name = rs1.getString(1);
			int age = rs1.getInt(2);

			System.out.println(name + " " + age);
		}

		rs1.close();

		// Insert New Record
		String insertQuery = "INSERT INTO employee VALUES ('Karan', 28)";
		int rows = stmt.executeUpdate(insertQuery);

		System.out.println("\n" + rows + " record inserted successfully!");

		// Fetch Updated Records
		System.out.println("\n----- Updated Records -----");

		ResultSet rs2 = stmt.executeQuery("SELECT * FROM employee");

		while (rs2.next()) {
			String name = rs2.getString(1);
			int age = rs2.getInt(2);

			System.out.println(name + " " + age);
		}

		rs2.close();
		stmt.close();
		con.close();
	}

}
