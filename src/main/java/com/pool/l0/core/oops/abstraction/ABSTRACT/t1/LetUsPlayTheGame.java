package com.pool.l0.core.oops.abstraction.ABSTRACT.t1;

public class LetUsPlayTheGame {
	public static void main(String[] args) {
		Team matchDay=onlyCreatedOnMatchDay();
		matchDay.getSelectorName();
		matchDay.matchDate();
		matchDay.play11();
		System.out.println("Everything is ready let us play");
	}

	private static MatchDay onlyCreatedOnMatchDay() {
		return new MatchDay();
	}
}
