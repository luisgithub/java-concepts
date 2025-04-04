package com.lugarsoft.java_concepts.solid.singleresponsability;

public class NotificationService implements NotificationDelivery{
    @Override
    public void send(EmailNotification emailNotification) {
        System.out.println("Email notification: "+ emailNotification.getSubject() +" sent to: " + emailNotification.getTo());
    }
}
