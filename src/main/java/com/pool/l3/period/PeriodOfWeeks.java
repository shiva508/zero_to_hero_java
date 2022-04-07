package com.pool.l3.period;

import java.time.Period;

public class PeriodOfWeeks {

	public static void main(String[] args) {
		Period period = Period.ofWeeks(2);
	      System.out.println(period.getDays()); 
	}

}
