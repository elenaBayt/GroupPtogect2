package com.company.groupProject.Task5;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        String[] arr = email.split("@");
        String[] arr2 = arr[1].split("\\.");
        if (arr2[0].equals("yahoo")) {
            this.email = email;
        } else {
            System.out.println("Valid email consider to be only yahoo");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Username can not be empty");
        } else if (userName.length() <= 6) {
            System.out.println("Username should be of length larger than 6 characters");
        } else {
            this.userName = userName;
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        if (password.isEmpty()) {
            System.out.println("Password can not be empty");
        } else if (password.length() <= 6) {
            System.out.println("Password should be of length larger than 6 characters");
        } else if (userName != null) {
            if (password.contains(userName)) {
                System.out.println("Password can not contain username");
            } else {
                this.password = password;
            }
        } else {
            System.out.println("Username is empty. Complete step with username first");
        }
    }

    public String getPassword() {
        return password;
    }
}
