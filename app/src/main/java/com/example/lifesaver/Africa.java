package com.example.lifesaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Africa extends AppCompatActivity {
    private ImageButton androidimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa);
        androidimage = (ImageButton) findViewById(R.id.btnAfrica);
        androidimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Africa.this, map_activity.class);
                startActivity(intent);
            }
        });
    }
}