package com.pool.l2.featurs8.FI.supplier;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Developer implements Serializable {
	private String name;
	private BigDecimal salary;
	private LocalDate start;

	public Developer() {
	}

	// for factory(() -> new Developer("mkyong"));
	public Developer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", start=" + start + "]";
	}

}
