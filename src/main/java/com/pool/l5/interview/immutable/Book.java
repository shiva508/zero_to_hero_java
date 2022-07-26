package com.pool.l5.interview.immutable;

import java.util.List;

public final class Book {
	private final String bookName;
	private final String autherName;
	private final Chapter chapter;
	private final List<String> data;

	public Book(String bookName, String autherName, Chapter chapter, List<String> data) {
		this.bookName = bookName;
		this.autherName = autherName;
		this.chapter = chapter;
		this.data = data;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAutherName() {
		return autherName;
	}


	public Chapter getChapter() {
		Chapter chapterClone=new Chapter(chapter);
		return chapterClone;
	}

	public List<String> getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", autherName=" + autherName + ", chapter=" + chapter + ", data=" + data
				+ "]";
	}
}
