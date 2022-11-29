package com.tweet.app.testingRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.tweet.app.registaration.User;
import com.tweet.app.registaration.UserDaoImpl;
import com.tweet.app.tweets.TweetRepository;
import com.tweet.app.tweets.Twiter;

public class UserDaoImplTesing {


	public void steup() {
		
	}
	@Test
	public void getAllTweets() {
		UserDaoImpl us= new UserDaoImpl();
		User user = new User();
		user.setName("kjdls");
		//Mockito.when(imp.insertUser(user)).thenReturn(1);
		assertEquals(us.insertUser(user), user.getName());
	}

}
