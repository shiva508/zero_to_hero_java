package com.pool.l2.featurs8.FI.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DelivaryPredicateLibrary {
	public static List<Delivary> getDelivaryItemsGreaterThan2Days(List<Delivary> delivaries,Predicate<Delivary> predicate){
		return delivaries.stream().filter(predicate).collect(Collectors.toList());
	}
	
	public static Predicate<Delivary> predicateByNumberOfDelivaryDates(Integer numberOfDaysLimit){
		return delivary-> delivary.getNumberOfDaysFromDispatch()<=numberOfDaysLimit;
	}
}
