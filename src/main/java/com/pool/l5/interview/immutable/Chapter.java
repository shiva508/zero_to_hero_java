package com.pool.l5.interview.immutable;

public class Chapter {
	private Integer pageNumber;
	private String story;

	public Chapter(Chapter cloneObject) {
		this(cloneObject.getPageNumber(), cloneObject.getStory());
	}

	public Chapter(Integer pageNumber, String story) {
		super();
		this.pageNumber = pageNumber;
		this.story = story;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	@Override
	public String toString() {
		return "Chapter [pageNumber=" + pageNumber + ", story=" + story + "]";
	}

}
