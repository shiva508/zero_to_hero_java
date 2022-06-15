package com.pool.l1.thread.v2.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadSafeDataFormatter {
	public static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd");
		}

		@Override
		public SimpleDateFormat get() {

			return super.get();
		}
	};
}

public class UserServiceExecutorservice {
	// introduses data inconstancy
	private static ExecutorService service = Executors.newFixedThreadPool(10);
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) {
		System.out.println("================USING THREADS START=====================");
		for (int i = 0; i < 1000; i++) {
			int I = i;
			service.submit(() -> {
				String dateOfBirth = new UserServiceExecutorservice().getDateOfBirth(I);
				System.out.println(dateOfBirth);
			});
		}
		System.out.println("================USING THREADS END=====================");
		service.shutdown();
	}

	public String getDateOfBirth(Integer userid) {
		Date date = new Date();
		SimpleDateFormat dateFormatThread = ThreadSafeDataFormatter.threadLocal.get();
		return dateFormatThread.format(date);
	}
}
