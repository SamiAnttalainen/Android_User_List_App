package com.example.registerusers;

public class User {

    String firstName, lastName, email, degreeProgram;
    protected int userImage;

    public User(String firstName, String lastName, String email, String degreeProgram, int userImage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.userImage = userImage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getUserImage() {
        return userImage;
    }
}
