package com.pool.l0.core.inharitance;

public class WhatsApp {
	
	String typeOfApp;
	
	public WhatsApp(String typeOfApp) {
		super();
		this.typeOfApp = typeOfApp;
	}


	public void sendMessage(String name) {
		System.out.println("Sending message to "+name +" Using "+ this.typeOfApp);
	}
	
}
