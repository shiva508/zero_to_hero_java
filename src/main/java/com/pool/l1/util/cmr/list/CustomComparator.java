package com.pool.l1.util.cmr.list;

import java.util.Comparator;

import com.pool.l1.util.cmr.Student;

public class CustomComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getStudentName().compareTo(o2.getStudentName());
	}

}
