package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class csesecondsem extends AppCompatActivity {
  Button c,che,english2,beee,maths2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesecondsem);
        che=(Button) findViewById(R.id.buttonche);
        c=(Button) findViewById(R.id.buttonit);
        english2=(Button) findViewById(R.id.buttonenglish2);
        beee=(Button) findViewById(R.id.buttonbeee);
        maths2=(Button) findViewById(R.id.buttonmaths2);
        che.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(csesecondsem.this,csechemistry.class);
                startActivity(intent);

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(csesecondsem.this,it.class);
                startActivity(intent);

            }
        });
        english2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(csesecondsem.this,comenglish2.class);
                startActivity(intent);

            }
        });
        maths2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(csesecondsem.this,maths2.class);
                startActivity(intent);

            }
        });
        beee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(csesecondsem.this,beee.class);
                startActivity(intent);

            }
        });
    }

}