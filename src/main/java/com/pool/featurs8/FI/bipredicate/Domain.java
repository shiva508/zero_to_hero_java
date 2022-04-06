package com.pool.featurs8.FI.bipredicate;

public class Domain {
	private String name;
	private Integer score;

	public Domain(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public Domain setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getScore() {
		return score;
	}

	public Domain setScore(Integer score) {
		this.score = score;
		return this;
	}

}
