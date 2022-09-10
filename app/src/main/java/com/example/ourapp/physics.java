package com.example.ourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class physics extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
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
               gotoUrl("https://youtube.com/playlist?list=PL-JvKqQx2Atc-7gw0SglqTajukZhc6Azu");
                return true;
            case  R.id.item2:
                gotoUrl("https://www.javatpoint.com/quantum-physics");
                return  true;
            case  R.id.item3:
//                https://drive.google.com/file/d/1qNHZ55LnixTagk_NcYz6I8AiA5kp3iLq/view?usp=drivesdk
//                gotoUrl("https://drive.google.com/uc?id=1qNHZ55LnixTagk_NcYz6I8AiA5kp3iLq");
//              return true;
                Intent intent=new Intent(physics.this,physicsPrev.class);
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