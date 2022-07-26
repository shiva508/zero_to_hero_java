package com.pool.l0.core.constructor;

public class MrfBat extends Bat {
	String ambosidorName;

	public MrfBat() {
		super("2 M", "4 M");
		//super();
		this.ambosidorName = "Sachin,Lara,Stevwa";
	}

	public void displayBatDetails() {
		
		System.out.println("Bat Height:" + height);
		System.out.println("Bat Width:" + width);
		System.out.println("Bat Ambosidor Name:" + ambosidorName);
		

	}

	public static void main(String[] args) {
		MrfBat mrfBat = new MrfBat();
		mrfBat.displayBatDetails();
	}
}
