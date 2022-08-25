package org.example.clinic.webapp.Notification;

public class SMS implements NotificationMethod {
	
	public SMS() {
		System.out.println("Creating SMS message");
	}

	@Override
	//Send Message
	public void sendMessage(String message) {
		
		System.out.println("Sending SMS message : " + message);
	}
}