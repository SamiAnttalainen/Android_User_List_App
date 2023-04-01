package com.example.registerusers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserHolder> {

    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        holder.fullName.setText(users.get(position).getFirstName() + " " + users.get(position).getLastName());
        holder.degreeName.setText(users.get(position).getDegreeProgram());
        holder.emailAddress.setText(users.get(position).getEmail());
        holder.image.setImageResource(users.get(position).getUserImage());

        if (users.get(position).getDegreeCredentials().isEmpty()) {
            holder.credentials.setText(null);
        }
        else {
            StringBuilder stringBuilder = new StringBuilder("Suoritetut tutkinnnot:");
            for (String cred : users.get(position).degreeCredentials) {
                stringBuilder.append("\n-" + cred);
            }
            holder.credentials.setText(stringBuilder.toString());
        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
