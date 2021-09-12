package com.company.groupProject.Task5;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("elena@yahoo.com");
        System.out.println(registration.getEmail());

        registration.setUserName("Elena Baytimerova");
        System.out.println(registration.getUserName());

        registration.setPassword("1234");
        System.out.println(registration.getPassword());
    }
}
