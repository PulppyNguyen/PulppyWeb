package com.pulppy.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
		String hostName = "demotest.coclv5jznhwc.us-east-1.rds.amazonaws.com";
		String dbName = "PulppyDemo";
		String userName = "admin";
		String password = "admin12345";

		return getMySQLConnection(hostName, dbName, userName, password);
	}

	public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password)
			throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}

	public static void main(String[] args) {
		try {
			MysqlConnection sa = new MysqlConnection();
			System.out.println(sa.getMySQLConnection());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
