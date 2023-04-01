package com.example.registerusers;

import android.content.Context;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserStorage {

    ArrayList<User> users = new ArrayList<>();

    private static UserStorage userStorage = null;

    private UserStorage() {

    }

    public static UserStorage getInstance() {
        if (userStorage == null) {
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        // Sorts users by their surnames
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                return user.lastName.compareToIgnoreCase(t1.lastName);
            }
        });

        return users;
    }

    public void saveUsers(Context context) {
        try {
            ObjectOutputStream saveUser = new ObjectOutputStream(context.openFileOutput("users.data", Context.MODE_PRIVATE));
            saveUser.writeObject(users);
            saveUser.close();
        } catch (IOException e) {
            System.out.println("Käyttäjän tallentaminen epäonnistui.");
        }
    }

    public void loadUsers(Context context) {
        try {
            ObjectInputStream loadUsers = new ObjectInputStream(context.openFileInput("users.data"));
            users = (ArrayList<User>) loadUsers.readObject();
            loadUsers.close();
        } catch (IOException e) {
            System.out.println("Käyttäjien lataaminen epäonnistui.");
        } catch (ClassNotFoundException e) {
            System.out.println("Käyttäjien lataaminen epäonnistui");
        }
    }

}
