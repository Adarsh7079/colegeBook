package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class csefourthsem extends AppCompatActivity {
    Button python,ds,comeng,cn,os;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csefourthsem);
        python=(Button) findViewById(R.id.buttonpython);
        ds=(Button) findViewById(R.id.buttondiscrete);
        comeng=(Button) findViewById(R.id.button3);
        cn=(Button) findViewById(R.id.buttonnetwork) ;
        os=(Button) findViewById(R.id.buttonos);
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csefourthsem.this,python.class);
                startActivity(intent);
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csefourthsem.this,ds.class);
                startActivity(intent);
            }
        });
        comeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csefourthsem.this,communicationenglish.class);
                startActivity(intent);
            }
        });
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csefourthsem.this,cn.class);
                startActivity(intent);
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csefourthsem.this,os.class);
                startActivity(intent);
            }
        });
    }
}