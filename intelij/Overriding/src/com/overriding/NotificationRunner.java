package com.overriding;

public class NotificationRunner {
    public static void main(String[] args) {
        EmailNotification emailNotification=new EmailNotification();

        emailNotification.send();
    }
}
