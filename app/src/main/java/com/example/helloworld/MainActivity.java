package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText To, Subject, Message;
    Button Send, Toastbtn;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        To = findViewById(R.id.To);
        Subject = findViewById(R.id.Subject);
        Message = findViewById(R.id.Message);
        Send = findViewById(R.id.Send);
        Toastbtn = findViewById(R.id.Toast);

        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String kepada = To.getText().toString();
                    if(kepada != null && !kepada.isEmpty() && !kepada.equals("null")){
                        Intent i = new Intent(MainActivity.this, RelativeLayout.class);
                        i.putExtra(KEY_NAME, kepada);
                        startActivity(i);
                    }else{
                        Toast.makeText(getApplicationContext(), "Field Kepada masih kosong", Toast.LENGTH_LONG).show();
                    }
                }catch (Exception e){
                    e.getMessage();
                    Toast.makeText(getApplicationContext(), "Error Failed, Try Again", Toast.LENGTH_LONG).show();
                }
//                startActivity(new Intent(MainActivity.this, RelativeLayout.class));
            }
        });

        Toastbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Mencoba Menampilkan Toast", Toast.LENGTH_LONG).show();
            }
        });
    }

}
