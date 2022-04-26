package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutils {

private static Connection connection = null;
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

	private static final String USERNAME = "system";

	private static final String PASSWORD = "12345";
	
	public static Connection getConnection() {
		if (connection != null) {
			// null != null
			return connection;
		}

		else {
			try {

				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();

			}
			return connection;
		}

	}
	
	
	
}
