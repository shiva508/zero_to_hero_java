package com.pool.l1.thread.v2.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentClient {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Shiva", false));
		students.add(new Student("hiva", false));
		students.add(new Student("iva", false));
		students.add(new Student("va", false));
		students.stream().map(Student::getName).forEach(System.out::println);
		String name = students.stream().map(Student::getName).collect(Collectors.joining(","));
		System.out.println(name);
	}
}
