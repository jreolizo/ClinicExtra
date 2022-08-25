package org.example.clinic.webapp.Payment;

import org.springframework.stereotype.Component;

@Component
public class PayPal implements PaymentMethod {

	@Override
	//Request Information for Payment
	public void requestInfo() {

		System.out.println("Requesting PayPal Info");
	}

	@Override
	//Make Payment
	public String makePayment(int payment) {
		String output;
		
		if(payment < 0) {
			output = "Error: payment value is less than 0";
		} else {
			output = "PayPal Payment: " + payment;
		}
		
		return output;
	}
}