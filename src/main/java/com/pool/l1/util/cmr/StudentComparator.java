package com.pool.l1.util.cmr;

import java.util.Objects;

public class StudentComparator{
	private String studentName;

	private String dept;

	public StudentComparator(String studentName, String dept) {
		super();
		this.studentName = studentName;
		this.dept = dept;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", dept=" + dept + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentComparator other = (StudentComparator) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(studentName, other.studentName);
	}

}
