package com.pool.l3.period;

import java.time.Period;

public class PeriodOfMonths {

	public static void main(String[] args) {
		 Period period = Period.of(10,5,2);
	      System.out.println(period.getMonths()); 
	}
}
