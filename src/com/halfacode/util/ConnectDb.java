package com.halfacode.util;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectDb {

	Connection connection=null;
	
	public static Connection connectDb() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsf", "root", "");
			return connection;
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
}
