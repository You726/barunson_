package com.example.barunson_test.btn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import com.example.barunson_test.MainActivity;
import com.example.barunson_test.R;
import com.example.barunson_test.introduce_Adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class btn1_2 extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private View drawerView;

    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    ExpandableListView listview;
    introduce_Adapter listAdapter;
    List<Integer> listDataImage;
    ArrayList<String> listDataSubHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1_2);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerView = (View) findViewById(R.id.drawer);
        listview = (ExpandableListView) findViewById(R.id.introduce);

        Button btn_before = (Button) findViewById(R.id.btn_before);
        btn_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent before = new Intent(btn1_2.this, MainActivity.class);
                before.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                before.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(before);
            }
        });

        Button btn_open = (Button) findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        Button btn_close = (Button) findViewById(R.id.delete);
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


        prepareListData();
        listAdapter = new introduce_Adapter(getApplicationContext(), listDataHeader,listDataSubHeader, listDataChild, listDataImage);
        listview.setAdapter(listAdapter);

    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataSubHeader = new ArrayList<String>();
        listDataImage = new ArrayList<Integer>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("손정원 원장님");
        listDataHeader.add("승바위 원장님");
        listDataHeader.add("박시영 원장님");

        listDataSubHeader.add("대표원장 / 구강외과 전문의");
        listDataSubHeader.add("대표원장 / 통합진료과 전문의");
        listDataSubHeader.add("대표원장 / 통합진료과 전문의");

        listDataImage.add(R.drawable.ic_baseline_account_box_24_1);
        listDataImage.add(R.drawable.ic_baseline_account_box_24_1);
        listDataImage.add(R.drawable.ic_baseline_account_box_24_1);

        List<String> first = new ArrayList<String>();
        first.add("원광대학교 치의학과 졸업\n" +
                "선치과병원 구강외과 수련\n" +
                "서울아산병원 대학원 보철과\n" +
                "\n" +
                "AADI(미국임플란트학회) associate fellow 수료\n" +
                "ICOI(세계임플란트학회) active member\n" +
                "\n" +
                "Baylor University periodontal lecture 이수\n" +
                "Newyork University Implantology curriculum 이수\n" +
                "University of Pennsylvania Microendodontics 과정 이수\n" +
                "\n" +
                "전)하나병원 임플란트센터장\n" +
                "전)대전모아치과 대표원장\n" +
                "\n" +
                "현)바른손치과 구강외과 대표원장");

        List<String> second = new ArrayList<String>();
        second.add("한양대학교 경영학과 학사\n" +
                "전남대학교 치의학전문대학원 석하\n" +
                "\n" +
                "대학치과의사협회 통합치의학 전문의\n" +
                "대한 통합치과학회 정회원\n" +
                "대한 심미치과학회 정회원\n" +
                "\n" +
                "뉴욕대학교 implant CE과정\n" +
                "Univ of penn endo course\n" +
                "아시아 턱관절 포럼\n" +
                "\n" +
                "대한 심미치과학회 인정의 과정 이수\n" +
                "\n" +
                "현) 바른손치과 통합진료과 대표원장");

        List<String> third = new ArrayList<String>();
        third.add("카이스트 전기 및 전자공학과 졸업\n" +
                "조선대 치의학 전문대학원 석사\n" +
                "\n" +
                "대한 보존학회 정회원\n" +
                "대한 치주과학회 정회원\n" +
                "대한 근관치료학회 정회원\n" +
                "\n" +
                "대한 통합치의학과 전문의 과정 중\n" +
                "대한 치과사회공헌 협회 자문의사\n" +
                "덴탈씨드 치과경영 자문의사\n" +
                "\n" +
                "현) 바른손치과 통합진료과 대표원장");


        listDataChild.put(listDataHeader.get(0), first);
        listDataChild.put(listDataHeader.get(1), second);
        listDataChild.put(listDataHeader.get(2), third);
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