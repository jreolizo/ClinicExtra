package org.example.clinic.webapp.Payment;

public interface PaymentMethod {
	
	//Request Information for Payment
	public void requestInfo();
	
	//Make Payment
	public String makePayment(int payment);
}
