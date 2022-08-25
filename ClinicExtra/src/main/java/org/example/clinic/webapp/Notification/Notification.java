package org.example.clinic.webapp.Notification;

public class Notification {
	private boolean isSMSavail;
	private boolean isEMAILavail;
	
	public Notification(boolean smsAvail, boolean emailAvail) {
		super();
		this.isSMSavail = smsAvail;
		this.isEMAILavail = emailAvail;
	}
	
	//Sends Notification
	public void sendNotification(String message) {
		
		if(this.isSMSavail == true) {
			SMS sms = new SMS();
			
			sms.sendMessage(message);
		}
		
		if(this.isEMAILavail == true) {
			Email email = new Email();
			
			email.sendMessage(message);
		}
	}
}