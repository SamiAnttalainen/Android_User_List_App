package com.example.registerusers;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{

    String firstName, lastName, email, degreeProgram;
    ArrayList<String> degreeCredentials = new ArrayList<>();
    protected int userImage;

    public User(String firstName, String lastName, String email, String degreeProgram, int userImage,ArrayList<String> degreeCredentials) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.userImage = userImage;
        this.degreeCredentials = degreeCredentials;
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

    public ArrayList<String> getDegreeCredentials() {
        return degreeCredentials;
    }
}
