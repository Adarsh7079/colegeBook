package com.example.ourapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class firstsem extends AppCompatActivity{
   Button physics,maths1,comenglish,eme,hvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstsem);
        physics=(Button) findViewById(R.id.buttonphysics);
        maths1=(Button) findViewById(R.id.buttonmaths1);
        comenglish=(Button) findViewById(R.id.buttoncomenglish);
        eme=(Button) findViewById(R.id.buttoneme);
        hvalue=(Button)findViewById(R.id.buttonhvalue);
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(firstsem.this,physics.class);
                startActivity(intent);

            }
        });
        maths1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(firstsem.this,csemaths1.class);
                startActivity(intent);
            }
        });
        comenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(firstsem.this,communicationenglish.class);
                startActivity(intent);

            }
        });
        eme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(firstsem.this,eme.class);
                startActivity(intent);

            }
        });
        hvalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(firstsem.this,hvalue.class);
                startActivity(intent);

            }
        });
    }
//    public  void popup(View v)
//    {
//        PopupMenu popupMenu=new PopupMenu(this,v);
//        popupMenu.setOnMenuItemClickListener(this);
//        popupMenu.inflate(R.menu.menu);
//        popupMenu.show();
//    }
//    @Override
//    public boolean onMenuItemClick(MenuItem menuItem) {
//        switch (menuItem.getItemId())
//        {
//            case R.id.item1:
//                Intent intent=new Intent(firstsem.this,course.class);
//                startActivity(intent);
//                return true;
//            case  R.id.item2:
//                Toast.makeText(this, "this is first", Toast.LENGTH_SHORT).show();
//        }
//        return false;
//    }
}