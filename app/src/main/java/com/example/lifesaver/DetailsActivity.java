package com.example.lifesaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {
    private Button bAngola;
    private Button bAlgeria;
    private Button bMali;
    private Button btMorocco;
    private Button bLiberia;
    private Button bIvory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        bAngola = findViewById(R.id.btAngola);
        bAlgeria = findViewById(R.id.btAlgeria);
        btMorocco= findViewById(R.id.btMorocco);
        bLiberia = findViewById(R.id.btLiberia);
        bMali = findViewById(R.id.btMali);
        bIvory = findViewById(R.id.btIvory);
        bIvory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this, Ivory_coast.class);
                startActivity(i);
            }
        }); btMorocco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this, Morocco.class);
                startActivity(i);
            }
        }); bMali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this, Mali.class);
                startActivity(i);
            }
        }); bLiberia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this, Liberia.class);
                startActivity(i);
            }
        }); bAlgeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this, Algeria.class);
                startActivity(i);
            }
        });
        bAngola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this , Angola.class);
                startActivity(i);
            }
        });



    }
}