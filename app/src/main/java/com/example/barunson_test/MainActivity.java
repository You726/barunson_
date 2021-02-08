package com.example.barunson_test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.example.barunson_test.btn.btn3_1;
import com.example.barunson_test.btn.btn3_2;
import com.example.barunson_test.btn.btn3_3;
import com.example.barunson_test.btn.btn3_4;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.barunson_test.btn.btn1;
import com.example.barunson_test.btn.btn1_2;
import com.example.barunson_test.btn.btn1_3;
import com.example.barunson_test.btn.btn1_4;
import com.example.barunson_test.btn.btn2_1;
import com.example.barunson_test.btn.btn2_2;
import com.example.barunson_test.btn.btn2_3;
import com.example.barunson_test.btn.btn2_4;

public class MainActivity extends AppCompatActivity {
    //listview
    ListView listview = null;
    //fragmentAdapter
    private FragmentPagerAdapter fragmentPagerAdapter;

    //drawer
    private DrawerLayout drawerLayout;
    private View drawerView;
    ViewFlipper v_fllipper;

    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    long groupCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //KeyHash
//        getHashKey();

        //DrawerLayout
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerView = (View) findViewById(R.id.drawer);

        Button btn_open = (Button) findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);

                ExpandableListView ListView = (ExpandableListView) drawerLayout.findViewById(R.id.list);

                prepareListData();

                ExpandableListAdapter listAdapter = new ExpandableListAdapter(getApplicationContext(), listDataHeader, listDataChild);
                ListView.setAdapter(listAdapter);
                ListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

                    @Override
                    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                        if(groupPosition == 0 && id == 0){
                            Intent intent = new Intent(MainActivity.this, btn1.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        else if(groupPosition == 0 && id == 1){
                            Intent intent = new Intent(MainActivity.this, btn1_2.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        else if(groupPosition == 0 && id == 2){
                            Intent intent = new Intent(MainActivity.this, btn1_3.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        else if(groupPosition == 0 && id == 3){
                            Intent intent = new Intent(MainActivity.this, btn1_4.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        else if(groupPosition == 1 && id == 0){
                            Intent intent = new Intent(MainActivity.this, btn2_1.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        else if(groupPosition == 1 && id == 1){
                            Intent intent = new Intent(MainActivity.this, btn2_2.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        else if(groupPosition == 1 && id == 2){
                            Intent intent = new Intent(MainActivity.this, btn2_3.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        else if(groupPosition == 1 && id == 3){
                            Intent intent = new Intent(MainActivity.this, btn2_4.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        else if(groupPosition == 2 && id == 0){
                            Intent intent = new Intent(MainActivity.this, btn3_1.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        else if(groupPosition == 2 && id == 1){
                            Intent intent = new Intent(MainActivity.this, btn3_2.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        else if(groupPosition == 2 && id == 2){
                            Intent intent = new Intent(MainActivity.this, btn3_3.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        else{
                            Intent intent = new Intent(MainActivity.this, btn3_4.class);
                            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                        return false;

                    }
                });
            }

            private void prepareListData() {
                listDataHeader = new ArrayList<String>();
                listDataChild = new HashMap<String, List<String>>();

                listDataHeader.add("홈");
                listDataHeader.add("2번");
                listDataHeader.add("안내");

                List<String> first = new ArrayList<String>();
                first.add("병원소개");
                first.add("의료진소개");
                first.add("1-3번");
                first.add("1-4번");

                List<String> second = new ArrayList<String>();
                second.add("2-1번");
                second.add("2-2번");
                second.add("2-3번");
                second.add("2-4번");

                List<String> third = new ArrayList<String>();
                third.add("병원 오시는길");
                third.add("편의시설");
                third.add("3-3번");
                third.add("3-4번");

                listDataChild.put(listDataHeader.get(0), first);
                listDataChild.put(listDataHeader.get(1), second);
                listDataChild.put(listDataHeader.get(2), third);
            }
        });

        Button btn_close = (Button) findViewById(R.id.delete);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawers();
            }
        });
        Button btn_home = (Button) findViewById(R.id.home);
        btn_home.setOnClickListener(new View.OnClickListener(){
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

        //뷰페이저 세팅
        ViewPager viewPager = findViewById(R.id.viewpager);
        fragmentPagerAdapter = new

                PageViewAdapter(getSupportFragmentManager());

        TabLayout tabLayout = findViewById(R.id.tab);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        Button btnreservation = (Button) findViewById(R.id.btnreservation);
        btnreservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.booking.naver.com/booking/13/bizes/318374?area=ple"));
                startActivity(intent);
            }
        });
        //슬라이드 배너
        int images[] = {
                R.drawable.ba1,
                R.drawable.ba7,
                R.drawable.ba4,
                R.drawable.ba2,
                R.drawable.ba3,
                R.drawable.ba5
        };
        v_fllipper =

                findViewById(R.id.image_slide);

        for (
                int image : images) {
            fllipperImages(image);
        }

    }
    //KeyHash
//    private void getHashKey(){
//        PackageInfo packageInfo = null;
//        try {
//            packageInfo = getPackageManager().getPackageInfo("com.example.barunson_test", PackageManager.GET_SIGNATURES);
//        } catch (PackageManager.NameNotFoundException e) {
//            e.printStackTrace();
//        }
//        if (packageInfo == null)
//            Log.e("KeyHash", "KeyHash:null");
//
//        for (Signature signature : packageInfo.signatures) {
//            try {
//                MessageDigest md = MessageDigest.getInstance("SHA");
//                md.update(signature.toByteArray());
//                Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT));
//            } catch (NoSuchAlgorithmException e) {
//                Log.e("KeyHash", "Unable to get MessageDigest. signature=" + signature, e);
//            }
//        }
//    }

    public void fllipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_fllipper.addView(imageView);
        v_fllipper.setFlipInterval(3000);
        v_fllipper.setAutoStart(true);

        v_fllipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_fllipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {
        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {
        }

        @Override
        public void onDrawerStateChanged(int newState) {
        }
    };
}