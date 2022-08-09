package com.pool.l1.thread.functionalinterface;

public class ArthmeticOperationsClient {
	public static void main(String[] args) {
		// step1();
		// step2();
		// step3();
		StringOperation uppercase = (String inputText) -> inputText.toUpperCase();
		System.out.println(uppercase.changeTextCase("Lal Sing Chadda"));
		StringOperation lowerInputString = inputText -> inputText.toLowerCase();
		System.out.println(lowerInputString.changeTextCase("Lal Sing Chadda"));

	}

	private static void step3() {
		ArthmeticOperations arthmeticOperationsSum = (int input1, int input2) -> input1 + input2;
		int sum = arthmeticOperationsSum.operation(20, 10);
		System.out.println(sum);
		ArthmeticOperations arthmeticOperationsSub = (int input1, int input2) -> input1 - input2;
		int sub = arthmeticOperationsSub.operation(20, 10);
		System.out.println(sub);
	}

	private static void step2() {
		ArthmeticOperations arthmeticOperationsSum = new ArthmeticOperations() {
			@Override
			public int operation(int input1, int input2) {
				return input1 + input2;
			}
		};
		int sum = arthmeticOperationsSum.operation(20, 10);
		System.out.println(sum);

		ArthmeticOperations arthmeticOperationsSub = new ArthmeticOperations() {
			@Override
			public int operation(int input1, int input2) {
				return input1 - input2;
			}
		};
		int sub = arthmeticOperationsSub.operation(20, 10);
		System.out.println(sub);
	}

	private static void step1() {
		ArthmeticOperations arthmeticOperations = new ArthmeticOperationsImpl();
		int sum = arthmeticOperations.operation(20, 10);
		System.out.println(sum);
	}
}
