package com.pool.l1.util.cmr.list;

import java.util.Comparator;

import com.pool.l1.util.cmr.StudentComparator;

public class CustomCompOtherway  {

	static Comparator<StudentComparator> nameComparator=new Comparator<StudentComparator>() {
		@Override
		public int compare(StudentComparator o1, StudentComparator o2) {
			int nameCompResult=o1.getStudentName().compareTo(o2.getStudentName());
			int deptCompResi=o1.getDept().compareTo(o2.getDept());
			int result=0;
			
			if(nameCompResult>0 && deptCompResi>0) {
				result=1;
			}
			if(nameCompResult<0 && deptCompResi<0) {
				result=-1;
			}
			if(nameCompResult==0 && deptCompResi==0) {
				result=0;
			}
			if(nameCompResult>0 && deptCompResi<0) {
				result=1;
			}
			if(nameCompResult<0 && deptCompResi>0) {
				result=-1;
			}
			return result;
		}
	};
	
	static Comparator<StudentComparator> depotComparator=new Comparator<StudentComparator>() {
		@Override
		public int compare(StudentComparator o1, StudentComparator o2) {
			return o1.getDept().compareTo(o2.getDept());
		}
	};

}
