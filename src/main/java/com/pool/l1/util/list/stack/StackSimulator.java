package com.pool.l1.util.list.stack;

import java.util.Stack;

public class StackSimulator {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}
