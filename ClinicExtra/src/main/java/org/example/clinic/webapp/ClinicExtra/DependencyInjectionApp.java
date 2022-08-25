package org.example.clinic.webapp.ClinicExtra;

import org.example.clinic.webapp.Notification.Notification;
import org.example.clinic.webapp.Payment.PaymentMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dependency Injection Example
 * Changing the value of the configuration bean,
 * changes the object/s created and/or functions
 */
public class DependencyInjectionApp 
{
    public static void main( String[] args )
    {
    	//ClassPathXmlApplicationContext loads the XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        //Create Payment Method depending on configuration
        PaymentMethod payment = (PaymentMethod) context.getBean("PaymentMethod");
        payment.requestInfo();
        
      //Create Notification depending on configuration
        Notification notification = (Notification) context.getBean("Notification");
        notification.sendNotification(payment.makePayment(20));
    }
}
