package com.pool.l0.object;

public class Tea {

	private String teaType;
	private Double rate;
	
	
	public Tea(String teaType, Double rate) {
		super();
		this.teaType = teaType;
		this.rate = rate;
	}
	
	
	public String getTeaType() {
		return teaType;
	}


	public void setTeaType(String teaType) {
		this.teaType = teaType;
	}


	public Double getRate() {
		return rate;
	}


	public void setRate(Double rate) {
		this.rate = rate;
	}


	@Override
	public String toString() {
		return "{teaType=" + teaType + ", rate=" + rate + "}";
	}
}
