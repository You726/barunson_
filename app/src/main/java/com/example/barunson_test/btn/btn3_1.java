package com.example.barunson_test.btn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.barunson_test.MainActivity;
import com.example.barunson_test.R;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;


public class btn3_1 extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private View drawerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn3_1);

        //Kakao API
        MapView mapView = new MapView(this);
        ViewGroup mapViewContainer = findViewById(R.id.map_view);

        MapPoint mapPoint = MapPoint.mapPointWithGeoCoord(36.42596863509463, 127.38704113379147);
        mapView.setMapCenterPoint(mapPoint,true);
        mapViewContainer.addView(mapView);

        MapPOIItem mapPOIItem = new MapPOIItem();
        mapPOIItem.setItemName("관평동 바른손치과");
        mapPOIItem.setTag(0);
        mapPOIItem.setMapPoint(mapPoint);
        mapPOIItem.setMarkerType(MapPOIItem.MarkerType.BluePin);
        mapPOIItem.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin);
        mapPOIItem.setDraggable(true);
        mapView.addPOIItem(mapPOIItem);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.drawer);

        Button btn_before = (Button)findViewById(R.id.btn_before);
        btn_before.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent before = new Intent(btn3_1.this, MainActivity.class);
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