package com.pool.l1.thread.v2.studentapp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudentAppClient {
	public static void main(String[] args) {
		Student[] students = null;
		Book[] books = null;
		ExecutorService service = Executors.newFixedThreadPool(StudentConstants.NUMBER_OF_STUDENTS);

		try {
			books = new Book[StudentConstants.NUMBER_OF_BOOKS];
			students = new Student[StudentConstants.NUMBER_OF_STUDENTS];
			for (int i = 0; i < StudentConstants.NUMBER_OF_BOOKS; i++) {
				books[i] = new Book(i + 1);
			}
			for (int i = 0; i < StudentConstants.NUMBER_OF_STUDENTS; i++) {
				students[i] = new Student(i + 1, books);
				service.submit(students[i]);
			}
		} finally {
			service.shutdown();
		}

	}
}
