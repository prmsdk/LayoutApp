package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.Instant;

public class RelativeLayout extends AppCompatActivity {

    Bundle DataKepada;
    TextView Kepada;
    Button Tombol;
    private String KEY_NAME = "NAMA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        Tombol = findViewById(R.id.button);
        Kepada = findViewById(R.id.kepada);

        Tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RelativeLayout.this, ConstrainLayout.class));
            }
        });

        DataKepada = getIntent().getExtras();
        String Nama = DataKepada.getString(KEY_NAME);
        Kepada.setText(Nama);

    }

}
