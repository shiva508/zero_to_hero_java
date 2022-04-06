package com.pool.core.oops.clone.user;

public class AssignmentClone {

	public static void main(String[] args) {
		Department department=new Department(1, "Development");
		User user=new User(408, "Shiva", "dasarishiva1@gmail.com",department);
		System.out.println("Hashcode:"+user.hashCode());
		System.out.println("Deportment Hashcode:"+user.getDepartment().hashCode());
		System.out.println(user.getUserId()+"-"+user.getUserName()+"-"+user.getEmail());
		User newAssignmentUser=user;
		newAssignmentUser.setUserId(508);
		newAssignmentUser.getDepartment().setDepartmentName("Management");
		System.out.println("Hashcode:"+user.hashCode());
		System.out.println("Deportment Hashcode:"+user.getDepartment().hashCode());
		System.out.println("Hashcode:"+newAssignmentUser.hashCode());
		System.out.println("Deportment Hashcode:"+newAssignmentUser.getDepartment().hashCode());
		System.out.println(user.getUserId()+"-"+user.getUserName()+"-"+user.getEmail()+"-"+user.getDepartment());
		System.out.println(newAssignmentUser.getUserId()+"-"+newAssignmentUser.getUserName()+"-"+newAssignmentUser.getEmail()+"-"+newAssignmentUser.getDepartment());
	}

}
