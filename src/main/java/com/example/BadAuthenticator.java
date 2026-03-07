package com.example;

import java.util.ArrayList; // Added import for ArrayList
import java.util.List; // Added import for List

public class BadAuthenticator {

    public void authenticate(String userType, String username) {
        if (userType.equals("admin")) {
            System.out.println("Auth admin"); // Added missing semicolon
        } else if (userType.equals("guest")) {
            System.out.println("Auth guest");
        }
        
        List<String> logs = new ArrayList<>();
        logs.add(username + " logged in");

        sendEmail(username);
    }

    private void sendEmail(String username) {
        System.out.println("Sending email to " + username);
    }
}