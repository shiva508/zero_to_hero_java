package com.pool.l0.core.inharitance;

import com.pool.l0.core.oops.THIS.Signal;

public class MessageClient {
	public static void main(String[] args) {
		WhatsApp whatsApp = new WhatsApp("Whatsapp ");
		// whatsApp.typeOfApp = "Whatsapp ";
		whatsApp.sendMessage("Ravi");

		Facebook facebook = new Facebook("FaceBook");
		// facebook.typeOfApp = "FaceBook";
		facebook.sendMessage("Shiva");

		Signal signal = new Signal(" Signal");
		signal.sendMessage("Satish");
	}
}
