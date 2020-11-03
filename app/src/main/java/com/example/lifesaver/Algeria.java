package com.example.lifesaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Algeria extends AppCompatActivity {
    private Button btncolera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algeria);


        btncolera = findViewById(R.id.btColera);
        btncolera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Algeria.this , Colera.class);
                startActivity(i);
            }
        });

    }
}