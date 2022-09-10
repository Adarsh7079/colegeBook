package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class course extends AppCompatActivity {
    ImageView img;
    ImageView civil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        img=(ImageView) findViewById(R.id.cse);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(course.this,cse.class);
                startActivity(intent);
            }
        });
        civil=(ImageView)findViewById(R.id.civil);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(course.this,civil.class);
                startActivity(intent2);
            }
        });

    }
}