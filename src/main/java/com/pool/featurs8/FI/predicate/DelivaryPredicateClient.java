package com.pool.featurs8.FI.predicate;

public class DelivaryPredicateClient {
	public static void main(String[] args) {
		
		DelivaryPredicateLibrary.getDelivaryItemsGreaterThan2Days(null, DelivaryPredicateLibrary.predicateByNumberOfDelivaryDates(4));
	}
}
