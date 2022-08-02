package com.pool.l1.util.cmr.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.pool.l1.util.cmr.StudentComparator;

public class ComparatorClient {
	public static void main(String[] args) {
		List<StudentComparator> StudentComparatorsRecords = new ArrayList<>();
		StudentComparatorsRecords.add(new StudentComparator("Ravi", "Mech"));
		StudentComparatorsRecords.add(new StudentComparator("Shiva", "ECE"));
		StudentComparatorsRecords.add(new StudentComparator("Satish", "Mech"));
		StudentComparatorsRecords.add(new StudentComparator("Anish", "CSE"));
		StudentComparatorsRecords.add(new StudentComparator("Dawan", "IT"));
		StudentComparatorsRecords.add(new StudentComparator("Sachin", "ECE"));
		StudentComparatorsRecords.add(new StudentComparator("Ganguly", "IT"));
		//Collections.sort(StudentComparatorsRecords,new CustomComp());
		//Collections.sort(StudentComparatorsRecords,CustomCompOtherway.nameComparator);
		Collections.sort(StudentComparatorsRecords,CustomCompOtherway.depotComparator);
		for (StudentComparator studentComparator : StudentComparatorsRecords) {
			System.out.println(studentComparator);
		}
	}
}
