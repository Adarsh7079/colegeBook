package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cseseventhsem extends AppCompatActivity {
    Button computation,ai,elective2,elective3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cseseventhsem);
        computation=(Button) findViewById(R.id.buttoncomputation);
        ai=(Button) findViewById(R.id.buttonai);
        elective2=(Button) findViewById(R.id.buttonelective2);
        elective3=(Button) findViewById(R.id.buttonelective3);
        computation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cseseventhsem.this,computation.class);
                startActivity(intent);
            }
        });
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cseseventhsem.this,ai.class);
                startActivity(intent);
            }
        });
        elective2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cseseventhsem.this,elective.class);
                startActivity(intent);
            }
        });
        elective3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cseseventhsem.this,elective.class);
                startActivity(intent);
            }
        });
    }
}