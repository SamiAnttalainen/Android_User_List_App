package com.example.registerusers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    private EditText firstName, surName, emailAddress;

    String userFirstName, userSurName, userEmail, userDegree;
    RadioButton softEng, industrialEng, compEng, electEng, firstImage, secondImage;
    int tabImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        firstName = findViewById(R.id.editTextFirstName);
        surName = findViewById(R.id.editTextSurname);
        emailAddress = findViewById(R.id.editTextEmail);
        softEng = findViewById(R.id.radioButtonSoftware);
        industrialEng = findViewById(R.id.radioButtonIndustMan);
        compEng = findViewById(R.id.radioButtonCompEng);
        electEng = findViewById(R.id.radioButttonElectEng);
        firstImage = findViewById(R.id.radioButtonFirstImage);
        secondImage = findViewById(R.id.radioButtonSecondImage);


    }


    public void addUser(View view) {

        userFirstName = firstName.getText().toString();
        userSurName = surName.getText().toString();
        userEmail = emailAddress.getText().toString();

        if (softEng.isChecked()) {
            userDegree = softEng.getText().toString();
        }

        else if (industrialEng.isChecked()) {
            userDegree = industrialEng.getText().toString();
        }

        else if (compEng.isChecked()) {
            userDegree = compEng.getText().toString();
        }

        else if (electEng.isChecked()) {
            userDegree = electEng.getText().toString();
        }

        if (firstImage.isChecked()) {
            tabImage = R.drawable.pngwing_com;
        }
        else if (secondImage.isChecked()) {
            tabImage = R.drawable.pngtreefemale_face_avatar_in_circle_7965921;
        }

        User user = new User(userFirstName, userSurName, userEmail, userDegree, tabImage);
        UserStorage.getInstance().addUser(user);

    }
}