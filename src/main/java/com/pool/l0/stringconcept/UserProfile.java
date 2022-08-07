package com.pool.l0.stringconcept;

public final class UserProfile {
	
	private final String userName;
	private final String userId;
	
	public UserProfile(String userName, String userId) {
		this.userName = userName;
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	
	public String getUserId() {
		return userId;
	}

}
