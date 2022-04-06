package com.pool.functionalinterface;

public class ViewSimulater {

	public static void main(String[] args) {
		FunctionalView functionalView=(name)->System.out.println(name);
		functionalView.viewTitle("Data");
	}

}
