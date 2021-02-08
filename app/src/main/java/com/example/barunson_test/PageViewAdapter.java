package com.example.barunson_test;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageViewAdapter extends FragmentPagerAdapter {
    public PageViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    // 프래그먼트 교체를 보여주는 처리를 구현.
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return fragment1.newInstantce();
            case 1:
                return fragment2.newInstantce();
            case 2:
                return fragment3.newInstantce();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
    @NonNull
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "홈";
            case 1:
                return "2번";
            case 2:
                return "안내";
            default:
                return null;
        }
    }
}
