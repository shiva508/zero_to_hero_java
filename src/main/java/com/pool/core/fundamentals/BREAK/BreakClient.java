package com.pool.core.fundamentals.BREAK;

public class BreakClient {
	public static void main(String[] args) {
		breakStatement();
	}

	private static void breakStatement() {
		int MARKS_LIST[]= {10,87,98,25,67};
		for (int i = 0; i < MARKS_LIST.length; i++) {
			if(MARKS_LIST[i]==98) {
				break;
			}
			System.out.println(MARKS_LIST[i]);
			
		}
	}
}
