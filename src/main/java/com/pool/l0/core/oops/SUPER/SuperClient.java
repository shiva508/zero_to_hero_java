package com.pool.l0.core.oops.SUPER;

public class SuperClient extends SuperParent {

	public void getParentData() {
		System.out.println(super.userName);
	}

	public static void main(String[] args) {
		new SuperClient().getParentData();
	}
}
