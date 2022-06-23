package com.pool.l5.solid.srp;

public class NotificationService {
	public void sendOTP(String medium) {
		if (medium.equals("email")) {
			// write email related logic
			// use JavaMailSenderAPI
		}
		if (medium.equals("mobile")) {
			// write logic using twillio API
		}
	}
}
