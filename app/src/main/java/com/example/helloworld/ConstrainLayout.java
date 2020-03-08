package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConstrainLayout extends AppCompatActivity {

    CardView Tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constrain_layout);

        Tombol = findViewById(R.id.cardView);

        Tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConstrainLayout.this, FrameLayout.class));
            }
        });
    }
}
