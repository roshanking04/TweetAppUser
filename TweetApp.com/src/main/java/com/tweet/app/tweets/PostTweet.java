package com.tweet.app.tweets;

public class PostTweet {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PostTweet(String message) {
		super();
		this.message = message;
	}

}
