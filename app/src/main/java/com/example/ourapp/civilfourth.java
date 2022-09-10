package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class civilfourth extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilfourth);
        b1=(Button) findViewById(R.id.buttonm3);
        b2=(Button) findViewById(R.id.buttonsurvey2);
        b3=(Button) findViewById(R.id.buttonstructure1);
        b4=(Button) findViewById(R.id.buttondesignconcreat1);
        b5=(Button) findViewById(R.id.buttonconstruction);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilfourth.this,civilm3.class);
                startActivity(intent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilfourth.this,fluid.class);
                startActivity(intent);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilfourth.this,strucureanalysis.class);
                startActivity(intent);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilfourth.this,concrete2.class);
                startActivity(intent);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilfourth.this,buildingconstruction.class);
                startActivity(intent);

            }
        });

    }
}