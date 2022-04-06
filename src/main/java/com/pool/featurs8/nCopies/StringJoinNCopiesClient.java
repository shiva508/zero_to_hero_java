package com.pool.featurs8.nCopies;

import java.util.Collections;

public class StringJoinNCopiesClient {
	public static void main(String[] args) {
		String data = String.join("\n", Collections.nCopies(10, "Shiva"));
		System.out.println(data);
	}
}
