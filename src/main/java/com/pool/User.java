package com.pool;

public class User {

	public User() {
	super();
	}
	
	private String firstname;
	private String lastName;
	private String email;
	private String password;
	private int age;

	public User(String firstname, String lastName, String email, String password, int age) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.age = age;
	}
	
	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.setEmail(lastName);
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) {
			this.age=0;
		}else {
			this.age = age;	
		}
		
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastName=" + lastName + ", email=" + email + ", password=" + password
				+ ", age=" + age + "]";
	}

}
