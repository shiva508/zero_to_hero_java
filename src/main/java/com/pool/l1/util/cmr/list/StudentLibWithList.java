package com.pool.l1.util.cmr.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pool.l1.util.cmr.Student;

public class StudentLibWithList {
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();//10
		
		for (int i = 0; i < 100; i++) {
			//1 ,10,10, 11
			names.add("A");
		}
		
		System.out.println("Names Size:"+names.size());
		for(String name:names) {
			System.out.println(name);
		}
		
		
		
		List<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student("A"));
		arrayList.add(new Student("B"));
		arrayList.add(new Student("C"));
		for (Student student : arrayList) {
			System.out.println(student);
		}
	}
}
