package com.example.darksoul.myapplication.sector;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.darksoul.myapplication.R;

public class SectorPageChild extends Fragment {

    public String parent;
    public int frame;

    public SectorPageChild() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        parent = getArguments().getString("parent");
        frame = getArguments().getInt("frame");
        View mView = null;
        if(frame == 0) {
            mView = inflater.inflate(R.layout.sector_child_frame1, null);
            mView = getFrame1View(mView);
        } else if(frame == 1) {
            mView = inflater.inflate(R.layout.sector_child_frame2, null);
            mView = getFrame2View(mView);
        } else if(frame == 2) {
            mView = inflater.inflate(R.layout.sector_child_frame1, null);
            mView = getFrame3View(mView);
        } else {
            mView = inflater.inflate(R.layout.sector_child_frame1, null);
        }
        return mView;
    }

    public View getFrame1View(View view) {


        return view;
    }

    public View getFrame2View(View view) {


        return view;
    }

    public View getFrame3View(View view) {


        return view;
    }



}
