package com.tweet.app.tweets;

import java.util.ArrayList;

import com.tweet.app.registaration.User;

public class Twiter {
	
private long id;

private String message;

private ArrayList<Likes>likes;

private User user;



public Twiter(long id, String message, ArrayList<Likes> likes, User user) {
	super();
	this.id = id;
	this.message = message;
	this.likes = likes;
	this.user = user;
}
public Twiter(Twiter newTweet) {
	this.id=newTweet.id;
	this.message=newTweet.message;
	this.likes=newTweet.likes;
	this.user=newTweet.user;
	
}

public Twiter() {
	super();
	// TODO Auto-generated constructor stub
}


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public ArrayList<Likes> getLikes() {
	return likes;
}

public void setLikes(ArrayList<Likes> likes) {
	this.likes = likes;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

}
