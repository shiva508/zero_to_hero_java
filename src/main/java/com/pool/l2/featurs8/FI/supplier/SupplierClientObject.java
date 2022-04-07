package com.pool.l2.featurs8.FI.supplier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierClientObject {

	public static void main(String[] args) {
		Developer developer = factory(Developer::new);
		System.out.println(developer);
		Developer developer2 = factory(()->new Developer("Shiva"));
		System.out.println(developer2);
	}

	public static Developer factory(Supplier<? extends Developer> supplier) {
		Developer developer = supplier.get();
		if (developer.getName() == null || "".equals(developer.getName())) {
			developer.setName("default");
		}
		developer.setSalary(BigDecimal.ONE);
		developer.setStart(LocalDate.of(2017, 8, 8));
		return developer;
	}
}
