package com.tweet.app.registaration;

public interface UserDao {
	
	public int insertUser(User user);

	public User getCustomer(String name, String email, String password);

}
