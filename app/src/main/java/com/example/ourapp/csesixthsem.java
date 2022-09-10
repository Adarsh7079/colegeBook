package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class csesixthsem extends AppCompatActivity {
    Button web,mad,mlearning,elective1,oelective;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesixthsem);
        web=(Button) findViewById(R.id.buttonweb);
        mad=(Button) findViewById(R.id.buttonandroid);
        mlearning=(Button) findViewById(R.id.buttonmachinelearning);
        elective1=(Button) findViewById(R.id.buttonelective1);
        oelective=(Button) findViewById(R.id.buttonoelective);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csesixthsem.this,web.class);
                startActivity(intent);
            }
        });
        mad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csesixthsem.this,android.class);
                startActivity(intent);
            }
        });
        mlearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csesixthsem.this,machnielearning.class);
                startActivity(intent);
            }
        });
        elective1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csesixthsem.this,elective.class);
                startActivity(intent);
            }
        });
        oelective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(csesixthsem.this,openelective.class);
                startActivity(intent);
            }
        });
    }
}