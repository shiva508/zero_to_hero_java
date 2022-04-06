package com.pool.featurs8.FI.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierClientGeneric<T> {
	public static void main(String[] args) {
		SupplierClientGeneric<String> clientGeneric = new SupplierClientGeneric<>();
		List<String> list = clientGeneric.supplier().get();
		System.out.println(list.size());
	}

	public Supplier<List<T>> supplier() {
		// return () -> new ArrayList<>();
		return ArrayList::new;
	}
}
