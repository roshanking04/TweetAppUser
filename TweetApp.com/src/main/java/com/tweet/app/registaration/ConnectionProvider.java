package com.tweet.app.registaration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Abhishek
 *
 */
public class ConnectionProvider implements DataSource {
	
	/**
	 * counnection 
	 */
	static Connection conn=null;
	
	/**
	 * @return Connection DB
	 */
	public static Connection getCon() {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tweeter","root","root");
		}
		catch(Exception e) {
			e.printStackTrace();
			
		} 
		return conn;
	}
}
