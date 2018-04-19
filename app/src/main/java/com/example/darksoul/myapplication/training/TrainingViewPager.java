package com.example.darksoul.myapplication.training;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.darksoul.myapplication.R;


public class TrainingViewPager extends android.app.Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.training_intervention, null);
        ViewPager viewPager = (ViewPager)view.findViewById(R.id.training_viewpager);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(((AppCompatActivity)getActivity()).getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        viewPager.setCurrentItem(0);
        viewPager.setClipToPadding(false);
        viewPager.setPadding(40, 0, 40, 0);
        viewPager.setPageMargin(20);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private class MyPagerAdapter extends FragmentStatePagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0: return new TraningInv1();
                case 1: return new TrainingInv2();
                case 2: return new TrainingInv3();
                default: return new TraningInv1();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
