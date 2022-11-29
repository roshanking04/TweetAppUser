package com.tweet.app.tweets;

public class Likes {
	private long id;
	private String UserName;
	private String description;
	private String website;
	private String photoURl;
	private String created;
	public Likes(long id, String userName, String description, String website, String photoURl, String created) {
		super();
		this.id = id;
		UserName = userName;
		this.description = description;
		this.website = website;
		this.photoURl = photoURl;
		this.created = created;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getPhotoURl() {
		return photoURl;
	}
	public void setPhotoURl(String photoURl) {
		this.photoURl = photoURl;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
	
	

}
