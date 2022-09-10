package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class csethird extends AppCompatActivity {
    Button oop,dsa,colap,dcld,m3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csethird);
        oop=(Button) findViewById(R.id.buttonoop);
        dcld=(Button) findViewById(R.id.buttondcld);
        colap=(Button) findViewById(R.id.buttoncoalp);
        m3=(Button) findViewById(R.id.buttonmaths3);
        dsa=(Button) findViewById(R.id.buttondsa);
        oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csethird.this,cpp.class);
                startActivity(intent);
            }
        });
        dcld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csethird.this,dcld.class);
                startActivity(intent);
            }
        });
        colap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csethird.this,coalp.class);
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csethird.this,maths3.class);
                startActivity(intent);
            }
        });
        dsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csethird.this,dsa.class);
                startActivity(intent);
            }
        });
     }
}