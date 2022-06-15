package com.pool.l1.thread.v2.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UserService {
	private ExecutorService service = Executors.newFixedThreadPool(10);
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) {
		System.out.println("================USING THREADS START=====================");
		for (int i = 0; i < 10; i++) {
			int I = i;
			new Thread(() -> {
				String dateOfBirth = new UserService().getDateOfBirth(I);
				System.out.println(dateOfBirth);
			}).start();
		}
		System.out.println("================USING THREADS END=====================");
	}

	public String getDateOfBirth(Integer userid) {
		Date date = new Date();
		return dateFormat.format(date);
	}
}
