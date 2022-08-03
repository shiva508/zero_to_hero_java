package com.pool.l1.util.cmr.list.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.pool.l1.util.cmr.StudentComparator;
import com.pool.l1.util.cmr.list.CustomCompOtherway;
import com.pool.l1.util.cmr.list.CustomComparator;

public class LinkedlistClient {
	public static void main(String[] args) {
		//getFirst();
		//peek();
		//peekRemove();
		//poll();
		//pollFirst();
		//pollLast();
		addFirst();
	}

	private static LinkedList<StudentComparator> getFirst() {
		LinkedList<StudentComparator> studentComparatorsRecords = new LinkedList<>();
		studentComparatorsRecords.add(new StudentComparator("Ravi", "Mech",20));
		studentComparatorsRecords.add(new StudentComparator("Shiva", "ECE",10));
		studentComparatorsRecords.add(new StudentComparator("Satish", "Mech",30));
		studentComparatorsRecords.add(new StudentComparator("Anish", "CSE",90));
		studentComparatorsRecords.add(new StudentComparator("Dawan", "IT",55));
		studentComparatorsRecords.add(new StudentComparator("Sachin", "ECE",20));
		studentComparatorsRecords.add(new StudentComparator("Ganguly", "IT",50));
		System.out.println("getFirst:"+studentComparatorsRecords.getFirst());
		studentComparatorsRecords.forEach(System.out::println);
		return studentComparatorsRecords;
	}
	
	private static LinkedList<StudentComparator> getLast() {
		LinkedList<StudentComparator> studentComparatorsRecords = new LinkedList<>();
		studentComparatorsRecords.add(new StudentComparator("Ravi", "Mech",20));
		studentComparatorsRecords.add(new StudentComparator("Shiva", "ECE",10));
		studentComparatorsRecords.add(new StudentComparator("Satish", "Mech",30));
		studentComparatorsRecords.add(new StudentComparator("Anish", "CSE",90));
		studentComparatorsRecords.add(new StudentComparator("Dawan", "IT",55));
		studentComparatorsRecords.add(new StudentComparator("Sachin", "ECE",20));
		studentComparatorsRecords.add(new StudentComparator("Ganguly", "IT",50));
		System.out.println("getLast:"+studentComparatorsRecords.getLast());
		studentComparatorsRecords.forEach(System.out::println);
		return studentComparatorsRecords;
	}
	
	private static LinkedList<StudentComparator> removeFirst() {
		LinkedList<StudentComparator> studentComparatorsRecords = new LinkedList<>();
		studentComparatorsRecords.add(new StudentComparator("Ravi", "Mech",20));
		studentComparatorsRecords.add(new StudentComparator("Shiva", "ECE",10));
		studentComparatorsRecords.add(new StudentComparator("Satish", "Mech",30));
		studentComparatorsRecords.add(new StudentComparator("Anish", "CSE",90));
		studentComparatorsRecords.add(new StudentComparator("Dawan", "IT",55));
		studentComparatorsRecords.add(new StudentComparator("Sachin", "ECE",20));
		studentComparatorsRecords.add(new StudentComparator("Ganguly", "IT",50));
		System.out.println("removeFirst:"+studentComparatorsRecords.removeFirst());
		studentComparatorsRecords.forEach(System.out::println);
		return studentComparatorsRecords;
	}
	private static LinkedList<StudentComparator> removeLast() {
		LinkedList<StudentComparator> studentComparatorsRecords = new LinkedList<>();
		studentComparatorsRecords.add(new StudentComparator("Ravi", "Mech",20));
		studentComparatorsRecords.add(new StudentComparator("Shiva", "ECE",10));
		studentComparatorsRecords.add(new StudentComparator("Satish", "Mech",30));
		studentComparatorsRecords.add(new StudentComparator("Anish", "CSE",90));
		studentComparatorsRecords.add(new StudentComparator("Dawan", "IT",55));
		studentComparatorsRecords.add(new StudentComparator("Sachin", "ECE",20));
		studentComparatorsRecords.add(new StudentComparator("Ganguly", "IT",50));
		System.out.println("removeFirst:"+studentComparatorsRecords.removeLast());
		studentComparatorsRecords.forEach(System.out::println);
		return studentComparatorsRecords;
	}
	
	private static LinkedList<StudentComparator> peek() {
		LinkedList<StudentComparator> studentComparatorsRecords = new LinkedList<>();
		studentComparatorsRecords.add(new StudentComparator("Ravi", "Mech",20));
		studentComparatorsRecords.add(new StudentComparator("Shiva", "ECE",10));
		studentComparatorsRecords.add(new StudentComparator("Satish", "Mech",30));
		studentComparatorsRecords.add(new StudentComparator("Anish", "CSE",90));
		studentComparatorsRecords.add(new StudentComparator("Dawan", "IT",55));
		studentComparatorsRecords.add(new StudentComparator("Sachin", "ECE",20));
		studentComparatorsRecords.add(new StudentComparator("Ganguly", "IT",50));
		System.out.println("peek:"+studentComparatorsRecords.peek());
		studentComparatorsRecords.forEach(System.out::println);
		return studentComparatorsRecords;
	}
	
	private static LinkedList<StudentComparator> peekRemove() {
		LinkedList<StudentComparator> studentComparatorsRecords = new LinkedList<>();
		studentComparatorsRecords.add(new StudentComparator("Ravi", "Mech",20));
		studentComparatorsRecords.add(new StudentComparator("Shiva", "ECE",10));
		studentComparatorsRecords.add(new StudentComparator("Satish", "Mech",30));
		studentComparatorsRecords.add(new StudentComparator("Anish", "CSE",90));
		studentComparatorsRecords.add(new StudentComparator("Dawan", "IT",55));
		studentComparatorsRecords.add(new StudentComparator("Sachin", "ECE",20));
		studentComparatorsRecords.add(new StudentComparator("Ganguly", "IT",50));
		System.out.println("peek:"+studentComparatorsRecords.peek());
		studentComparatorsRecords.forEach(System.out::println);
		List<StudentComparator> collect = studentComparatorsRecords.stream().sorted((q0,q1)->q0.getStudentName().compareTo(q1.getStudentName())).collect(Collectors.toList());
		System.out.println("After Sort");
		collect.forEach(System.out::println);
		return studentComparatorsRecords;
	}
	
	private static LinkedList<StudentComparator> poll() {
		LinkedList<StudentComparator> studentComparatorsRecords = new LinkedList<>();
		System.out.println("Before Poll");
		studentComparatorsRecords.add(new StudentComparator("Ravi", "Mech",20));
		studentComparatorsRecords.add(new StudentComparator("Shiva", "ECE",10));
		studentComparatorsRecords.add(new StudentComparator("Satish", "Mech",30));
		studentComparatorsRecords.add(new StudentComparator("Anish", "CSE",90));
		studentComparatorsRecords.add(new StudentComparator("Dawan", "IT",55));
		studentComparatorsRecords.add(new StudentComparator("Sachin", "ECE",20));
		studentComparatorsRecords.add(new StudentComparator("Ganguly", "IT",50));
		studentComparatorsRecords.forEach(System.out::println);
		System.out.println("peek:"+studentComparatorsRecords.poll());
		System.out.println("Before Poll");
		studentComparatorsRecords.forEach(System.out::println);
		return studentComparatorsRecords;
	}
	
	private static LinkedList<StudentComparator> pollFirst() {
		LinkedList<StudentComparator> studentComparatorsRecords = new LinkedList<>();
		System.out.println("Before pollFirst");
		studentComparatorsRecords.add(new StudentComparator("Ravi", "Mech",20));
		studentComparatorsRecords.add(new StudentComparator("Shiva", "ECE",10));
		studentComparatorsRecords.add(new StudentComparator("Satish", "Mech",30));
		studentComparatorsRecords.add(new StudentComparator("Anish", "CSE",90));
		studentComparatorsRecords.add(new StudentComparator("Dawan", "IT",55));
		studentComparatorsRecords.add(new StudentComparator("Sachin", "ECE",20));
		studentComparatorsRecords.add(new StudentComparator("Ganguly", "IT",50));
		studentComparatorsRecords.forEach(System.out::println);
		System.out.println("peek:"+studentComparatorsRecords.pollFirst());
		System.out.println("Before pollFirst");
		studentComparatorsRecords.forEach(System.out::println);
		return studentComparatorsRecords;
	}
	
	private static LinkedList<StudentComparator> pollLast() {
		LinkedList<StudentComparator> studentComparatorsRecords = new LinkedList<>();
		System.out.println("Before pollFirst");
		studentComparatorsRecords.add(new StudentComparator("Ravi", "Mech",20));
		studentComparatorsRecords.add(new StudentComparator("Shiva", "ECE",10));
		studentComparatorsRecords.add(new StudentComparator("Satish", "Mech",30));
		studentComparatorsRecords.add(new StudentComparator("Anish", "CSE",90));
		studentComparatorsRecords.add(new StudentComparator("Dawan", "IT",55));
		studentComparatorsRecords.add(new StudentComparator("Sachin", "ECE",20));
		studentComparatorsRecords.add(new StudentComparator("Ganguly", "IT",50));
		studentComparatorsRecords.forEach(System.out::println);
		System.out.println("peek:"+studentComparatorsRecords.pollLast());
		System.out.println("Before pollFirst");
		studentComparatorsRecords.forEach(System.out::println);
		return studentComparatorsRecords;
	}
	
	private static LinkedList<StudentComparator> addFirst() {
		LinkedList<StudentComparator> studentComparatorsRecords = new LinkedList<>();
		System.out.println("Before addFirst");
		studentComparatorsRecords.add(new StudentComparator("Ravi", "Mech",20));
		studentComparatorsRecords.add(new StudentComparator("Shiva", "ECE",10));
		studentComparatorsRecords.add(new StudentComparator("Satish", "Mech",30));
		studentComparatorsRecords.add(new StudentComparator("Anish", "CSE",90));
		studentComparatorsRecords.add(new StudentComparator("Dawan", "IT",55));
		studentComparatorsRecords.add(new StudentComparator("Sachin", "ECE",20));
		studentComparatorsRecords.add(new StudentComparator("Ganguly", "IT",50));
		studentComparatorsRecords.forEach(System.out::println);
		studentComparatorsRecords.addFirst(new StudentComparator("Ravi-10", "Mech",20));
		System.out.println("Before addFirst");
		studentComparatorsRecords.forEach(System.out::println);
		return studentComparatorsRecords;
	}
}
