package com.example.darksoul.myapplication.sector;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.darksoul.myapplication.HexagonDrawable;
import com.example.darksoul.myapplication.R;
import com.example.darksoul.myapplication.hexagons.BiannualHexagonLayout;
import com.example.darksoul.myapplication.hexagons.MonthlyHexagonLayout;
import com.example.darksoul.myapplication.hexagons.QuaterlyHexagonLayout;

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
//            MonthlyHexagonLayout monthlyHexagonLayout = (MonthlyHexagonLayout)mView.findViewById(R.id.monthlyHexagonLayout);
//            monthlyHexagonLayout.setmColor(Color.GREEN);
//            monthlyHexagonLayout.setRotationX(180);
//            monthlyHexagonLayout.setRotation(180);
            mView = getFrame3View(mView);
        } else {
            mView = inflater.inflate(R.layout.sector_child_frame1, null);
//            MonthlyHexagonLayout monthlyHexagonLayout = (MonthlyHexagonLayout)mView.findViewById(R.id.monthlyHexagonLayout);
//            monthlyHexagonLayout.setmColor(Color.GREEN);
//            monthlyHexagonLayout.setRotationY(180);
        }
        return mView;
    }

    public View getFrame1View(View mView) {
        BiannualHexagonLayout bi_top_center = (BiannualHexagonLayout)mView.findViewById(R.id.bi_top_center);
        bi_top_center.setmColor(R.color.sec_yellow);

        QuaterlyHexagonLayout quat_bott_center = (QuaterlyHexagonLayout) mView.findViewById(R.id.quat_bott_center);
        quat_bott_center.setmColor(R.color.sec_blue);

        BiannualHexagonLayout bi_top_left = (BiannualHexagonLayout)mView.findViewById(R.id.bi_top_left);
        bi_top_left.setmColor(R.color.sec_red);

        BiannualHexagonLayout bi_bott_left = (BiannualHexagonLayout)mView.findViewById(R.id.bi_bott_left);
        bi_bott_left.setmColor(R.color.sec_violet);

        BiannualHexagonLayout bi_top_right = (BiannualHexagonLayout)mView.findViewById(R.id.bi_top_right);
        bi_top_right.setmColor(R.color.sec_green);

        BiannualHexagonLayout bi_bott_right = (BiannualHexagonLayout)mView.findViewById(R.id.bi_bott_right);
        bi_bott_right.setmColor(R.color.sec_black);

        return mView;
    }

    public View getFrame2View(View mView) {

        BiannualHexagonLayout top_center_left = (BiannualHexagonLayout)mView.findViewById(R.id.top_center_left);
        top_center_left.setmColor(R.color.sec_violet);

        QuaterlyHexagonLayout top_center_right = (QuaterlyHexagonLayout) mView.findViewById(R.id.top_center_right);
        top_center_right.setmColor(R.color.sec_green);

        QuaterlyHexagonLayout top_left = (QuaterlyHexagonLayout) mView.findViewById(R.id.top_left);
        top_left.setmColor(R.color.sec_yellow);

        BiannualHexagonLayout top_right = (BiannualHexagonLayout)mView.findViewById(R.id.top_right);
        top_right.setmColor(R.color.sec_blue);

        BiannualHexagonLayout left = (BiannualHexagonLayout)mView.findViewById(R.id.left);
        left.setmColor(R.color.sec_red);

        QuaterlyHexagonLayout right = (QuaterlyHexagonLayout) mView.findViewById(R.id.right);
        right.setmColor(R.color.sec_red);

        QuaterlyHexagonLayout bott_left = (QuaterlyHexagonLayout) mView.findViewById(R.id.bott_left);
        bott_left.setmColor(R.color.sec_blue);

        QuaterlyHexagonLayout bott_right = (QuaterlyHexagonLayout) mView.findViewById(R.id.bott_right);
        bott_right.setmColor(R.color.sec_yellow);

        QuaterlyHexagonLayout bott_center_left = (QuaterlyHexagonLayout) mView.findViewById(R.id.bott_center_left);
        bott_center_left.setmColor(R.color.sec_green);

        QuaterlyHexagonLayout bott_center_right = (QuaterlyHexagonLayout)mView.findViewById(R.id.bott_center_right);
        bott_center_right.setmColor(R.color.sec_violet);

        return mView;
    }

    public View getFrame3View(View view) {


        return view;
    }



}
