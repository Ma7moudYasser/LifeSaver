package com.example.lifesaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Angola extends AppCompatActivity {

    private Button Colera;
    private Button fever;
    private Button Rabbies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angola);


        Colera = findViewById(R.id.btColera);
        fever = findViewById(R.id.btYellowfever);
        Rabbies = findViewById(R.id.btRabbies);


//        Colera.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(Angola.this , com.example.lifesaver.Colera.class);
//                startActivity(i);
//
//            }
//        });
fever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Angola.this , Fever.class);
                startActivity(i);

            }
        });Rabbies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Angola.this , com.example.lifesaver.Rabbies.class);
                startActivity(i);

            }
        });




    }
}