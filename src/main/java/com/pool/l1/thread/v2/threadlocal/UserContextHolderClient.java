package com.pool.l1.thread.v2.threadlocal;

class User {
	private String userName;
	private String email;

	public User() {

	}

	public String getUserName() {
		return userName;
	}

	public User setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + "]";
	}

}

class UserContextHolder {
	public static ThreadLocal<User> userThreadLocal = new ThreadLocal<>();
}

class ServiceOne {
	public void processOne() {
		UserContextHolder.userThreadLocal.set(new User().setUserName("Shiva").setEmail("Dasari"));
	}
}

class ServiceTwo {
	public void processTwo() {
		User user = UserContextHolder.userThreadLocal.get();
		System.out.println(user);
	}
}

class UserContextHolderClient {
	public static void main(String[] args) {
		new ServiceOne().processOne();
		new ServiceTwo().processTwo();
	}
}
