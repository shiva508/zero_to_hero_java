package com.pool.l4.assignments.bank;

import java.util.ArrayList;
import java.util.List;

public class BankLoanApp {
	public static void main(String[] args) {
		List<BankLoanApp> bankLoanApps=new ArrayList();

	}  

	private String employeeName;
	private Double salary;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
