package com.example.registerusers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToListActivity(View view) {
        Intent intentLists = new Intent(this, ListActivity.class);
        startActivity(intentLists);
    }

    public void switchToAddUser(View view) {
        Intent intentAdd = new Intent(this, AddUserActivity.class);
        startActivity(intentAdd);
    }
}