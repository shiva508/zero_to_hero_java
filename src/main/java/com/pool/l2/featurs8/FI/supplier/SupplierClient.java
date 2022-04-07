package com.pool.l2.featurs8.FI.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierClient {
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {
		Supplier<LocalDateTime> ldt = () -> LocalDateTime.now();
		LocalDateTime dateTime = ldt.get();
		System.out.println(dateTime);
		Supplier<String> formatedDate = () -> dtf.format(LocalDateTime.now());
		String dateOutput=formatedDate.get();
		System.out.println(dateOutput);

	}
}
