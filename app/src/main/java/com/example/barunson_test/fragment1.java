package com.example.barunson_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.barunson_test.btn.btn1;
import com.example.barunson_test.btn.btn1_2;
import com.example.barunson_test.btn.btn1_3;
import com.example.barunson_test.btn.btn1_4;


public class fragment1 extends Fragment {

    private View view;

    public static fragment1 newInstantce() {
        fragment1 fragment1 = new fragment1();
        return fragment1;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment1, container, false);
        ViewGroup fragmentbnt1_1 = (ViewGroup) view.findViewById(R.id.fragmentbtn1_1);
        ViewGroup fragmentbnt1_2 = (ViewGroup) view.findViewById(R.id.fragmentbtn1_2);
        ViewGroup fragmentbnt1_3 = (ViewGroup) view.findViewById(R.id.fragmentbtn1_3);
        ViewGroup fragmentbnt1_4 = (ViewGroup) view.findViewById(R.id.fragmentbtn1_4);
        fragmentbnt1_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn1.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

        });
        fragmentbnt1_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn1_2.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        fragmentbnt1_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn1_3.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        fragmentbnt1_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn1_4.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        return view;
    }

}
