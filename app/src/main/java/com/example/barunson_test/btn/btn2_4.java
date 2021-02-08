package com.example.barunson_test.btn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.barunson_test.MainActivity;
import com.example.barunson_test.R;

public class btn2_4 extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private View drawerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn2_4);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.drawer);

        Button btn_before = (Button)findViewById(R.id.btn_before);
        btn_before.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent before = new Intent(btn2_4.this, MainActivity.class);
                before.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                before.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity (before);
            }
        });

        Button btn_open = (Button)findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        Button btn_close = (Button)findViewById(R.id.delete);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawers();
            }
        });
        drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
    }
    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) { }
        @Override
        public void onDrawerOpened(@NonNull View drawerView) { }
        @Override
        public void onDrawerClosed(@NonNull View drawerView) { }
        @Override
        public void onDrawerStateChanged(int newState) { }
    };
}