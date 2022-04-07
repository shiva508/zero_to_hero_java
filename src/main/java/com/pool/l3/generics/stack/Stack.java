package com.pool.l3.generics.stack;

public interface Stack<E> {
	public boolean empty();

	public void push(E input);

	public E pop();
}
