package com.pool.l2.featurs8.filljoin;

import java.util.Arrays;

public class StringJoinArrayClient {
	public static void main(String[] args) {
		String[] array = new String[10];
		Arrays.fill(array, "Shiva");
		String joinData=String.join("\n", array);
		System.out.println(joinData);
	}
}
