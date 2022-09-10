package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class csefifthsem extends AppCompatActivity {
     Button java,daa,english,software,bd,information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csefifthsem);
        java=(Button) findViewById(R.id.buttonjava);
        daa=(Button) findViewById(R.id.buttondaa);
        english=(Button) findViewById(R.id.button3);
        software=(Button) findViewById(R.id.buttonsoftware);
        bd=(Button) findViewById(R.id.buttonbigdata);
        information=(Button) findViewById(R.id.buttonIT);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csefifthsem.this,java.class);
                startActivity(intent);
            }
        });
        daa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csefifthsem.this,daa.class);
                startActivity(intent);
            }
        });

        software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csefifthsem.this,software.class);
                startActivity(intent);
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csefifthsem.this,bd.class);
                startActivity(intent);
            }
        });
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csefifthsem.this,IT.class);
                startActivity(intent);
            }
        });
    }
}