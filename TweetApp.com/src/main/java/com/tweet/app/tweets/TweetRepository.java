package com.tweet.app.tweets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Abhishek
 *
 */
public class TweetRepository {
	
	
	/**
	 * 
	 */
	private List<Twiter> allTweets;
	private List<Twiter> alllFavTweets;

	/**
	 * 
	 */
	public TweetRepository() {
		// TODO Auto-generated constructor stub
		allTweets = getAllTweets(); 
	}
	

	/**
	 * @return
	 */
	private List<Twiter> getAllTweets() {
		if (allTweets == null) {
			allTweets = new ArrayList<Twiter>();
		}
		List<Twiter> newFavList = new ArrayList<Twiter>();
		Iterator itTweets = allTweets.iterator();
		while (itTweets.hasNext()) {
			Twiter current = (Twiter) itTweets.next();
			Iterator itLikes = current.getLikes().iterator();
			boolean enc = false;
			while (itLikes.hasNext() && !enc) {
				Likes likes = (Likes) itLikes.next();
				if (likes.getUserName().equals(getAllTweets())) {
					enc = true;
					newFavList.add(current);
				}
			}
		}
		// allTweets.add(0,newFavList);
		return alllFavTweets;
	}

}
