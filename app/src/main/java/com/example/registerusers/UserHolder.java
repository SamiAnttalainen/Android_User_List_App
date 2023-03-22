package com.example.registerusers;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView fullName, degreeName, emailAddress;


    public UserHolder(@NonNull View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.userImage);
        fullName = itemView.findViewById(R.id.textFullName);
        degreeName = itemView.findViewById(R.id.textDegree);
        emailAddress = itemView.findViewById(R.id.textEmail);


    }
}
