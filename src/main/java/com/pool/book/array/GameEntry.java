package com.pool.book.array;

public class GameEntry {
	private String name;
	private int score;

	public GameEntry(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "GameEntry [name=" + name + ", score=" + score + "]";
	}

}
