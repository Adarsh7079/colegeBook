package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cse extends AppCompatActivity {
    Button first,second,third,fourth,fifth,sixth,seventh,eight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
        first=(Button) findViewById(R.id.cse1);
        second=(Button) findViewById(R.id.cse2);
        third=(Button) findViewById(R.id.cse3);
        fourth=(Button) findViewById(R.id.cse4);
        fifth=(Button) findViewById(R.id.cse5);
        sixth=(Button) findViewById(R.id.cse6);
        seventh=(Button) findViewById(R.id.cse7);
        eight=(Button) findViewById(R.id.cse8);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(cse.this,firstsem.class);
                startActivity(intent1);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(cse.this,csesecondsem.class);
                startActivity(intent2);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(cse.this,csethird.class);
                startActivity(intent3);


            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(cse.this,csefourthsem.class);
                startActivity(intent4);

            }
        });
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(cse.this,csefifthsem.class);
                startActivity(intent5);

            }
        });
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(cse.this,csesixthsem.class);
                startActivity(intent6);
            }
        });
        seventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7=new Intent(cse.this,cseseventhsem.class);
                startActivity(intent7);

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8=new Intent(cse.this,cseeightsem.class);
                startActivity(intent8);
            }
        });
    }
}