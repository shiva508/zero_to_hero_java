package com.pool.l5.interview.immutable;

import java.util.Arrays;

public class BookLibrary {
	public static void main(String[] args) {
		Chapter chapter = new Chapter(20, "Everything going to be ok");
		Book book = new Book("Monk Who Sold Ferrari", "Rabbin S Sharma", chapter,Arrays.asList("A"));
		System.out.println(book);
		book.getChapter().setStory("Its is going to be lasssss");
		book.getData().add("B");
		System.out.println(book);
	}
}
