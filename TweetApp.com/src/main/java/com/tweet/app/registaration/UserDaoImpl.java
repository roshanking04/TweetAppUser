package com.tweet.app.registaration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Abhishek
 *
 */
public class UserDaoImpl implements UserDao {

	static Connection conn;
	static PreparedStatement ps;

	/**
	 * return status
	 */
	public int insertUser(User user) {
		int status = 0;
		try {
			conn = ConnectionProvider.getCon();
			ps = conn.prepareStatement("insert into user values(?,?,?)");
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			status = ps.executeUpdate();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	/**
	 * return user
	 */
	public User getCustomer(String name, String email, String password) {
		User user = new User();
		try {
			conn = ConnectionProvider.getCon();
			ps = conn.prepareStatement("select * from user where name=? and email=? and password=?");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				user.setName(rs.getString(1));
				user.setEmail(rs.getString(2));
				user.setPassword(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return user;
	}

//	public static boolean addStudent(User user) {
//		boolean status=false;
//		try {
//			Connection conn=ConnectionProvider.createC();
//			String query = "insert into user(name,email,password)values(?,?,?)";
//			PreparedStatement pt=conn.prepareStatement(query);
//			pt.setString(1, user.getEmail());
//			pt.setString(2, user.getName());
//			pt.setString(3, user.getPassword());
//			pt.executeUpdate();
//			status=true;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return status;
//	}
}
