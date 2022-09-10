package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class civilfifth extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilfifth);
        b1=(Button) findViewById(R.id.buttonstranalysis2);
        b2=(Button) findViewById(R.id.buttonconcrete2);
        b3=(Button) findViewById(R.id.buttontranspotation1);
        b4=(Button) findViewById(R.id.buttonirrigation1);
        b5=(Button) findViewById(R.id.buttonprofessional);;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilfifth.this,structureana2.class);
                startActivity(intent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilfifth.this,concrete2.class);
                startActivity(intent);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilfifth.this,transpotationengineering1.class);
                startActivity(intent);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilfifth.this,irrigation1.class);
                startActivity(intent);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilfifth.this,professionalpratics.class);
                startActivity(intent);

            }
        });
    }
}