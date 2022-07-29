package com.pool.l1.util.cmr;

public class StudentLib {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Student [] students=new Student[3];
		students[0]=new Student("A");
		students[1]=new Student("b");
		students[2]=new Student("c");
		System.out.println("Lenngth of Array:"+students.length);
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}
}
