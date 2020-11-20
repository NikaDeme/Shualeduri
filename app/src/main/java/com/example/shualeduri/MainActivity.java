package com.example.shualeduri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    

    public void OnRegister (View view) {

        EditText firstname = (EditText) findViewById(R.id.editTextName);
        EditText Lastname = (EditText) findViewById(R.id.editTextLastname);
        EditText Age = (EditText) findViewById(R.id.editTextNumber);

        if (firstname.getText().toString().isEmpty() || Lastname.getText().toString().isEmpty() || Age.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please Fill Gap", Toast.LENGTH_SHORT).show();
        }
        else if (Integer.parseInt(Age.getText().toString()) < 1) {
            Toast.makeText(this, "You Cant Enter This Age", Toast.LENGTH_SHORT).show();
            Age.setText("");
        }
        else if (Integer.parseInt(Age.getText().toString()) < 18) {

            Toast.makeText(this, "You Must Be 18 Years old", Toast.LENGTH_SHORT).show();
            Age.setText("");
        }

        else {
            Toast.makeText(this, "Registration Succesfuly Done !!!", Toast.LENGTH_SHORT).show();
            User newuser = new User(firstname.getText().toString(),Lastname.getText().toString(), Integer.parseInt(Age.getText().toString()));
        }
    }


    





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}



