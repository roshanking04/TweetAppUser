package com.tweet.app;

import java.io.BufferedReader;
import java.io.IOException;

import com.tweet.app.registaration.User;
import com.tweet.app.registaration.UserDao;
import com.tweet.app.registaration.UserDaoImpl;

/**
 * @author Abhishek
 *
 */
public class UserRegister {
	
	
	/**
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("hello world");
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		while (true) {
			System.out.println("press 1 to register a user");
			System.out.println("press 2 to login a user");
			System.out.println("press 3 to tweet a user");
			System.out.println("press 4 to viewAll the app");
			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				System.out.println("Enter UserRegister Detials:");
				// int id=br.readLine();
				System.out.println("Enter user Name");
				String name = br.readLine();
				System.out.println("Enter user Email");
				String email = br.readLine();
				System.out.println("Enter user Password");
				String password = br.readLine();

				User user = new User(name, email, password);
				System.out.println(user);
				UserDao userDao = new UserDaoImpl();
				int answer = userDao.insertUser(user);
				if (answer == 1) {
					System.out.println("user sucessfully Registerd");
				} else {
					System.out.println("user adding is failed email missing");
				}

			} else if (choice == 2) {
				System.out.println("user login Detials");
				System.out.println("Enter user Name");
				String name = br.readLine();
				System.out.println("Enter user Email");
				String email = br.readLine();
				System.out.println("Enter user Password");
				String password = br.readLine();
 
				User user = new User(name, email, password);
				System.out.println(user);
				if (name.equals(user.getName()) && email.equals(user.getEmail())
						&& password.equals(user.getPassword())) {
					UserDao userDao = new UserDaoImpl();
					userDao.getCustomer(name, email, password);
					System.out.println("user sucessfully Login");

				}
			} else if (choice == 3) {
				System.out.println("user Logn failed due to wrong detials");
				// display
			} else if (choice == 4) {
				// exit
			} else {

			}

			System.out.println("Thanks for using User Management System");

		}

	}

}
