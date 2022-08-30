package com.pool.l0.core.fundamentals.scanner;

import java.util.Scanner;

public class UserDetailsScannerClient {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Please Enter Full Name:");
		String fullName = keyboardInput.nextLine();
		System.out.println("User Full Name:" + fullName);
		keyboardInput.close();
	}
}
