package jdbc;

import java.sql.*;

public class sqlCon {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/SCORE_TABLE";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";

	public static void main(String args[]) throws ClassNotFoundException, SQLException {

		Connection conn = null;
		Statement stmt = null;
		// try{
		// STEP 2: Register JDBC driver
		Class.forName(JDBC_DRIVER);

		// STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);

		// STEP 4: Execute a query
		System.out.println("Creating statement...");
		stmt = conn.createStatement();
		
		String sql1 = "SELECT   * FROM batsmen ";
		String sql2 = "SELECT   * FROM batsmen WHERE SCORE = ( SELECT MAX(SCORE)FROM batsmen WHERE STATUS = 'OUT') ";
		String sql3 = "SELECT   * FROM batsmen WHERE SCORE = ( SELECT MAX(SCORE)FROM batsmen WHERE STATUS = 'NOT OUT') ";
		ResultSet rs = stmt.executeQuery(sql2);
		

		// STEP 5: Extract data from result set
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("B_ID");
			String name = rs.getString("B_NAME");
			int score = rs.getInt("SCORE");
			String status = rs.getString("STATUS");
			

			// Display values
			System.out.print("BATSMAN ID: " + id +"||");
			System.out.print("  NAME: " + name +"||");
			System.out.print(" SCORE: " + score +"||");
			System.out.println(" STATUS: " + status);
			
		}

		// try {
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection con =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/SCORE", "root", "");
		//
		// //String sql = "INSERT INTO persons (id, name, age, sex) VALUES (?, ?, ?,
		// ?)";
		//
		// String sql = "DELETE FROM persons WHERE id=?";
		//
		// Statement stmt = con.createStatement();
		// PreparedStatement stmt12 =con.prepareStatement(sql);
		//
		//
		// stmt12.setString(1, "3");
		//
		// int RowsDeleted = stmt12.executeUpdate();
		// if (RowsDeleted > 0) {
		// System.out.println("A new user was inserted successfully!");
		// }
		//
		//
		// ResultSet rs = stmt.executeQuery("select * from persons ");
		// while (rs.next())
		// System.out
		// .println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " +
		// rs.getString(4));
		// rs.close();
		// stmt.close();
		// con.close();
		// } catch (Exception e) {
		// System.out.println(e);
		// }

	}
}