package com.example.barunson_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.barunson_test.btn.btn3_1;
import com.example.barunson_test.btn.btn3_2;
import com.example.barunson_test.btn.btn3_3;
import com.example.barunson_test.btn.btn3_4;

public class fragment3 extends Fragment {
    private View view;

    public static fragment3 newInstantce() {
        fragment3 fragment3 = new fragment3();
        return fragment3;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment3, container, false);
        ViewGroup fragmentbnt3_1 = (ViewGroup) view.findViewById(R.id.fragmentbtn3_1);
        ViewGroup fragmentbnt3_2 = (ViewGroup) view.findViewById(R.id.fragmentbtn3_2);
        ViewGroup fragmentbnt3_3 = (ViewGroup) view.findViewById(R.id.fragmentbtn3_3);
        ViewGroup fragmentbnt3_4 = (ViewGroup) view.findViewById(R.id.fragmentbtn3_4);

        fragmentbnt3_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn3_1.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

        });
        fragmentbnt3_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn3_2.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        fragmentbnt3_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn3_3.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        fragmentbnt3_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn3_4.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        return view;
    }

}
