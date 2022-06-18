package com.pool.l1.thread.v2.studentapp;

import java.util.Random;

public class Student implements Runnable {
	private int id;
	private Book[] books;
	private Random random;

	public Student(int id, Book[] books) {
		super();
		this.id = id;
		this.books = books;
		this.random = new Random();
	}

	@Override
	public void run() {
		int bookId = this.random.nextInt(StudentConstants.NUMBER_OF_BOOKS);
		while (true) {
			books[bookId].read(this);
		}
	}

	@Override
	public String toString() {
		return "Student id=" + id;
	}

}
