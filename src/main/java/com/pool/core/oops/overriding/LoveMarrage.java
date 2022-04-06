package com.pool.core.oops.overriding;

public class LoveMarrage extends Marrage {
	@Override
	public void marrageType() {
		System.out.println("Love Marrage");
	}

	public boolean isFamilyAccepted() {
		return true;
	}
	@Override
	public Integer costOfMarrage() {
		return 508;
	}
}
