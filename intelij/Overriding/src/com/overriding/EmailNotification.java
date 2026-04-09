package com.overriding;

public class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending an Email notification");
    }

}
