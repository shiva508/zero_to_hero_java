package com.pool.l1.util.cmr.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.pool.l1.util.cmr.StudentComparator;

public class ComparatorClient {
	public static void main(String[] args) {
		List<StudentComparator> studentComparatorsRecords = new ArrayList<>();
		studentComparatorsRecords.add(new StudentComparator("Ravi", "Mech",20));
		studentComparatorsRecords.add(new StudentComparator("Shiva", "ECE",10));
		studentComparatorsRecords.add(new StudentComparator("Satish", "Mech",30));
		studentComparatorsRecords.add(new StudentComparator("Anish", "CSE",90));
		studentComparatorsRecords.add(new StudentComparator("Dawan", "IT",55));
		studentComparatorsRecords.add(new StudentComparator("Sachin", "ECE",20));
		studentComparatorsRecords.add(new StudentComparator("Ganguly", "IT",50));
		//Collections.sort(StudentComparatorsRecords,new CustomComp());
		//Collections.sort(StudentComparatorsRecords,CustomCompOtherway.nameComparator);
		Collections.sort(studentComparatorsRecords,CustomCompOtherway.depotComparator);
		studentComparatorsRecords.add(5,new StudentComparator("Sachin", "IT",90));
		for (StudentComparator studentComparator : studentComparatorsRecords) {
			System.out.println(studentComparator);
		}
	}
}
