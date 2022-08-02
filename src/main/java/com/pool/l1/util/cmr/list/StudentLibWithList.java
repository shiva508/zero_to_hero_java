package com.pool.l1.util.cmr.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.pool.l1.thread.deadlock.A;
import com.pool.l1.util.cmr.Student;


public class StudentLibWithList {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();// 10
		/*
		 * for (int i = 0; i < 5; i++) { // 1 ,10,10, 11
		 */
		names.add("Shiva");
		names.add("Satish");
		names.add("Ravi");
		/* } */

		System.out.println("Names Size:" + names.size());
		for (String name : names) {
			System.out.println(name);
		}

		List<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student("A","A"));
		arrayList.add(new Student("B","B"));
		arrayList.add(new Student("C","C"));
		// FOR_EACH LOOP
		for (Student student : arrayList) {
			System.out.println(student);
		}

		List<String> duplicate = new ArrayList<>();

		// duplicate.addAll(names);

		// UPDATE OR REPALCE EXISTING VALUE
		// duplicate.add(4, "Shiva");

		Iterator<String> iterator = duplicate.iterator();
		// ITERATOR
		System.out.println("From Duplicate ArrayLits");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		boolean isShivaIsAvailable = names.contains("Shiva");
		System.out.println("isShivaIsAvailable:" + isShivaIsAvailable);
		boolean isShivaIsAvailableCaseSensitive = names.contains("shiva");
		System.out.println("isShivaIsAvailableCaseSensitive:" + isShivaIsAvailableCaseSensitive);

		String index2Name = names.get(2);

		System.out.println("index2Name:" + index2Name);

		names.remove(0);
		System.out.println("After Removing 0th index element");
		for (String name : names) {
			System.out.println(name);
		}

		names.remove("Satish");
		System.out.println("After Removing Object Satish ");
		for (String name : names) {
			System.out.println(name);
		}

		int sizeOfList = names.size();
		System.out.println("sizeOfList:" + sizeOfList);

		names.clear();

		sizeOfList = names.size();
		System.out.println("After clearing size of list:" + sizeOfList);
		// USED TO check if list is having some data
		boolean isDataExistInTheList = names.isEmpty();
		System.out.println("isDataExistInTheList:" + isDataExistInTheList);
		names.add("Ravi");
		names.add("Anish");
		names.add("Dawan");
		names.add("Sachin");
		names.add("Ganguly");
		isDataExistInTheList = names.isEmpty();
		System.out.println("after adding data isDataExistInTheList:" + isDataExistInTheList);
		// To Know index of any element
		int raviNameIndex = names.indexOf("Ravi");
		System.out.println("raviNameIndex:" + raviNameIndex);

		sorting(names);

		sublist(names);
		listToArrayConverion(names);
		
		List<Student> studentsRecords = new ArrayList<>();
		studentsRecords.add(new Student("Ravi", "Mech"));
		studentsRecords.add(new Student("Shiva", "ECE"));
		studentsRecords.add(new Student("Satish", "Mech"));
		studentsRecords.add(new Student("Anish", "CSE"));
		studentsRecords.add(new Student("Dawan", "IT"));
		studentsRecords.add(new Student("Sachin", "ECE"));
		studentsRecords.add(new Student("Ganguly", "IT"));
		Collections.sort(studentsRecords);
		for (Student student : studentsRecords) {
			System.out.println(student);
		}

	}

	private static void listToArrayConverion(List<String> names) {
		System.out.println("=========List to Array===========");
		Object[] array = names.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void sublist(List<String> names) {
		List<String> subList = names.subList(2, 5);
		System.out.println(subList);
	}

	private static void sorting(List<String> names) {
		System.out.println("Bofore Sorting:");
		for (String nonSortedNames : names) {
			System.out.println(nonSortedNames);
		}
		Collections.sort(names);
		System.out.println("After Sorting:");
		for (String sortedNames : names) {
			System.out.println(sortedNames);
		}
	}
}
