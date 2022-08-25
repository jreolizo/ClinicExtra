package org.example.clinic.webapp.Notification;

public class Email implements NotificationMethod {

	public Email() {
		System.out.println("Creating Email message");
	}

	@Override
	//Send Message
	public void sendMessage(String message) {
		
		System.out.println("Sending Email message : " + message);
	}
}