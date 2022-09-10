package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class cpp extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp);
    }
    public  void popup(View v)
    {
        PopupMenu popupMenu=new PopupMenu(this,v);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menu);
        popupMenu.show();
    }
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.item1:
                gotoUrl("https://youtube.com/playlist?list=PLVlQHNRLflP8_DGKcMoRw-TYJJALgGu4J");
                return true;
            case  R.id.item2:
                gotoUrl("https://www.tutorialspoint.com/cplusplus/cpp_object_oriented.htm");
                return true;
            case  R.id.item3:
                Intent intent=new Intent(cpp.this,prevoop.class);
                startActivity(intent);
                return true;
        }
        return false;
    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}