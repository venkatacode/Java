package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EmployeeDetails {
	private static final Log LOGGER = LogFactory.getLog(EmployeeDetails.class);
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_demo";

	// Provide your own database credentials
	static final String USER = "root";
	static final String PASS = "";

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			// Registering the JDBC driver
			Class.forName(JDBC_DRIVER);

			// Opening a connection
			connection = DriverManager.getConnection(DB_URL, USER, PASS);

			
			statement = connection.createStatement();
			String sql;
			// Executing the query
			sql = "select * from employee";
			ResultSet resultset = statement.executeQuery(sql);

			// Extracting the result
			// The next() method moves the cursor forward by one row from it current
			// position in the resultset
			while (resultset.next()) {
				// getInt() gets the value of a column as integer
				// getString() gets the value of a column as string
				// Retrieve by column id
				int id = resultset.getInt(1);
				String name = resultset.getString(2);
				int age = resultset.getInt(3);

				// Displaying the values
				LOGGER.info("Id: " + id+", Name: " + name+", Age: " + age);
				
			}
			// Closing the connection
			resultset.close();
			statement.close();
			connection.close();
		} catch (SQLException se) {
			// This handles errors for JDBC
			System.out.println(se);
		} catch (Exception e) {
			// This handles errors for Class.forName
			LOGGER.info(e);
		} finally {
			// finally block closes all the resources
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException se2) {
				LOGGER.info(se2);
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				LOGGER.info(se);
			}
		}
	}
}
