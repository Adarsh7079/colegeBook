package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class civilthird extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilthird);
        b1=(Button) findViewById(R.id.buttonstrengthmaterial);
        b2=(Button) findViewById(R.id.buttonfluid);
        b3=(Button) findViewById(R.id.buttonbmaterial);
        b4=(Button) findViewById(R.id.buttonevs);
        b5=(Button) findViewById(R.id.buttonsurvey);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilthird.this,strengthofmaterial.class);
                startActivity(intent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilthird.this,fluid.class);
                startActivity(intent);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilthird.this,buildingmaterial.class);
                startActivity(intent);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilthird.this,evs.class);
                startActivity(intent);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilthird.this,suveying.class);
                startActivity(intent);

            }
        });
    }
}