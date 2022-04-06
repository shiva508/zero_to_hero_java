package com.pool.featurs8.date.between;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class NumberOdDaysCalculator {
	public static void main(String[] args) {
		daysBetweenTwoDates();
		dateFormateAndCalculate();
		dateManualFormateAndCalculate();
	}

	private static void dateManualFormateAndCalculate() {
		String date="2001-07-04T12:08:56.235-0700";
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(dateFormat.format(date));
		
	}

	private static void dateFormateAndCalculate() {
		LocalDate startDate = LocalDate.parse("2017-09-11");
		LocalDate endDate=LocalDate.parse("2021-12-01");
		Long numberOfDays=ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(numberOfDays);
	}

	private static void daysBetweenTwoDates() {
		LocalDate startDate = LocalDate.of(2017, Month.SEPTEMBER, 11);
		LocalDate endDate = LocalDate.of(2021, Month.DECEMBER, 1);
		Long numberOfDays=ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(numberOfDays);
	}
}
