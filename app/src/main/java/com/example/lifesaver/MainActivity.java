package com.example.lifesaver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.example.lifesaver.R.id.btnAfrica;
import static com.example.lifesaver.R.string.welcome;

public class MainActivity extends AppCompatActivity {
    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsinfo;
    private String username = "Admin";
    private String password = "12345";
//    private ImageButton androidimage;

    boolean isValid = false;
    private  int counter = 5;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eName = findViewById(R.id.etUsername);
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);
        eAttemptsinfo = findViewById(R.id.tvAttempts);
//        androidimage = (ImageButton) findViewById(btnAfrica);
//        androidimage.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//               Intent intent = new Intent(MainActivity.this, map_activity.class);
//               startActivity(intent);
//           }
//       });

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();


                if(inputName.isEmpty() || inputPassword.isEmpty())
                {

                   Toast.makeText(MainActivity.this , "Please enter all the details correctly", Toast.LENGTH_SHORT).show();
                }
                else {
                       isValid = validate(inputName , inputPassword);
                       if (!isValid){
                           counter --;
                           Toast.makeText(MainActivity.this , "Incorrect credentials Entered", Toast.LENGTH_SHORT).show();
                           eAttemptsinfo.setText( "Number of attempts remaining: " + counter);
                           if(counter == 0){
                               eLogin.setEnabled(false);
                           }


                       }else{


                           Toast.makeText(MainActivity.this , "Log in was successful", Toast.LENGTH_SHORT).show();
                           // Add the code to go to new activity
                           Intent intent = new Intent(MainActivity.this, Africa.class);
                           startActivity(intent);
                       }

                }
            }
        });
//
//

    }
    private boolean validate(String name, String password){
        if(name.equals(username) && password.equals(password)){
            return true;
        }
        return false;

    }
}