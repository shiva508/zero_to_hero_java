package com.pool.l2.featurs8.stream.sort;

public class Game {
	private String userName;
	private String userLevel;
	public String getUserName() {
		return userName;
	}
	public Game setUserName(String userName) {
		this.userName = userName;
		return this;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public Game setUserLevel(String userLevel) {
		this.userLevel = userLevel;
		return this;
	}
	
	@Override
	public String toString() {
		return "Game [userName=" + userName + ", userLevel=" + userLevel + "]";
	}
	
}
