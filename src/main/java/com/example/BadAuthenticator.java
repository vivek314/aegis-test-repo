package com.example;

// 1. Missing import for List
// 2. Compilation error: missing semicolon
// 3. SOLID Violation (SRP): This class logs, authenticates, and sends emails
// 4. SOLID Violation (OCP): Hardcoded if-else types instead of polymorphism

public class BadAuthenticator {

    public void authenticate(String userType, String username) {
        if (userType.equals("admin")) {
            System.out.println("Auth admin") // ERROR
        } else if (userType.equals("guest")) {
            System.out.println("Auth guest");
        }
        
        // This won't compile because List isn't imported
        List<String> logs = new ArrayList<>();
        logs.add(username + " logged in");

        sendEmail(username);
    }

    private void sendEmail(String username) {
        // Doing email sending inside an authenticator
        System.out.println("Sending email to " + username);
    }
}
