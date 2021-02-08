package com.example.barunson_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.barunson_test.btn.btn2_1;
import com.example.barunson_test.btn.btn2_2;
import com.example.barunson_test.btn.btn2_3;
import com.example.barunson_test.btn.btn2_4;

public class fragment2 extends Fragment {
    private View view;

    public static fragment2 newInstantce() {
        fragment2 fragment2 = new fragment2();
        return fragment2;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment2, container, false);
        ViewGroup fragmentbnt2_1 = (ViewGroup) view.findViewById(R.id.fragmentbtn2_1);
        ViewGroup fragmentbnt2_2 = (ViewGroup) view.findViewById(R.id.fragmentbtn2_2);
        ViewGroup fragmentbnt2_3 = (ViewGroup) view.findViewById(R.id.fragmentbtn2_3);
        ViewGroup fragmentbnt2_4 = (ViewGroup) view.findViewById(R.id.fragmentbtn2_4);
        fragmentbnt2_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn2_1.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

        });
        fragmentbnt2_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn2_2.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        fragmentbnt2_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn2_3.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        fragmentbnt2_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), btn2_4.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        return view;
    }

}
