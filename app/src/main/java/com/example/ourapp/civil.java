package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class civil extends AppCompatActivity {
    Button first,second,third,fourth,fifth,sixth,seventh,eight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);
        first=(Button) findViewById(R.id.button1civil);
        second=(Button) findViewById(R.id.button2civil);
        third=(Button) findViewById(R.id.button3civil);
        fourth=(Button) findViewById(R.id.button4civil);
        fifth=(Button) findViewById(R.id.button5civil);
        sixth=(Button) findViewById(R.id.button6civil);
        seventh=(Button) findViewById(R.id.button7civil);
        eight=(Button) findViewById(R.id.button8civil);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(civil.this,firstsem.class);
                startActivity(intent1);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(civil.this,csesecondsem.class);
                startActivity(intent2);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(civil.this,civilthird.class);
                startActivity(intent3);


            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(civil.this,civilfourth.class);
                startActivity(intent4);

            }
        });
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(civil.this,civilfifth.class);
                startActivity(intent5);

            }
        });
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(civil.this,civilsix.class);
                startActivity(intent6);
            }
        });
        seventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7=new Intent(civil.this,civilseventh.class);
                startActivity(intent7);

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8=new Intent(civil.this,civileight.class);
                startActivity(intent8);
            }
        });
    }
}