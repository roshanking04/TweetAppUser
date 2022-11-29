package com.tweet.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.tweet.app.registaration.User;
import com.tweet.app.registaration.UserDao;
import com.tweet.app.registaration.UserDaoImpl;

//@WebServlet("/loginregister")
public class LoginRegister {

	public LoginRegister() {

	}

	/**
	 * @param user
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	protected void doPost(User user) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int choice = Integer.parseInt(br.readLine());
		UserDao userDao = new UserDaoImpl();
		String name = user.getName();
		String email = user.getEmail(); 
		String password = user.getPassword();

		User user1 = userDao.getCustomer(name, email, password);

		if (choice == 1 && name.equals(user1.getName()) && email.equals(user1.getEmail())
				&& password.equals(user1.getPassword())) {

			System.out.printf("welcome to twitter login", user1.getName());
		} else if (choice == 2) {
			user1.setName(name);
			user1.setEmail(email);
			user1.setPassword(password);
			userDao.insertUser(user1);
			System.out.println("User Registartion is sucessfully");

		} else {
			System.out.println("Detials not found please check Detials");
		}
			
		}

		
//		protected void dPost(User user) throws NumberFormatException, IOException {
//			
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//			int choice = Integer.parseInt(br.readLine());
//			UserDao userDao = new UserDaoImpl();
//			String name = user.getName();
//			String email = user.getEmail(); 
//			String password = user.getPassword();
//
//			User user1 = userDao.getCustomer(name, email, password);
//
//			if (choice == 1 && name.equals(user1.getName()) && email.equals(user1.getEmail())
//					&& password.equals(user1.getPassword())) {
//
//				System.out.printf("welcome to twitter login", user1.getName());
//			} else if (choice == 2) {
//				user1.setName(name);
//				user1.setEmail(email);
//				user1.setPassword(password);
//				userDao.insertUser(user1);
//				System.out.println("User Registartion is sucessfully");
//
//			} else {
//				System.out.println("Detials not found please check Detials");
//			}
//	}
//	
//	 protected void forgetpassword (User user) throws NumberFormatException, IOException {
//		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		 UserDao dao = new UserDaoImpl();
//		 if(dao!=null) {
//		 int choice = Integer.parseInt(br.readLine());
//			UserDao userDao = new UserDaoImpl();
//			String name = user.getName();
//			String email = user.getEmail(); 
//    		String password = user.getPassword();
//    		User user1 = userDao.getCustomer(name, email, password);
//  
//		 }else {
//			 User u= new User();
//			 UserDao newDao = new UserDaoImpl(); 
//			 user.setName(u.getName());
//			 user.setEmail(u.getEmail()); 
//	    	 user.setPassword(u.getPassword());
//	    	 User user2 = newDao.getCustomer(user.getName(), user.getEmail(), user.getPassword());
//	    	 newDao.insertUser(user2);
//		 }
//	 }

}
