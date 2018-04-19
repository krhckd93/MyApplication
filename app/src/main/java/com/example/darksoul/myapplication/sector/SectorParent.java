package com.example.darksoul.myapplication.sector;

import android.app.Fragment;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.darksoul.myapplication.R;


public class SectorParent extends Fragment {

    public int num_pages = 7;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View sector_detail = inflater.inflate(R.layout.sector_page, null);
/*
        getArguments().getString("src");

        ImageView hex_img = (ImageView)sector_detail.findViewById(R.id.not_edit);
        TextView hex_text = (TextView)sector_detail.findViewById(R.id.multisectoral__);
        hex_img.setImageResource(getArguments().getInt("image"));
        hex_text.setText(getArguments().getString("text"));*/
        ViewPager viewPager = (ViewPager)sector_detail.findViewById(R.id.view_pager); // Fixme : Resource ID
        viewPager.setAdapter(new SectorParentAdapter(((AppCompatActivity)getActivity()).getSupportFragmentManager()));
        return sector_detail;
    }

    public class SectorParentAdapter extends FragmentStatePagerAdapter {

        public SectorParentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            Bundle bundle = new Bundle();
            switch (position) {
                case 0 : bundle.putString("parent", getResources().getString(R.string.min_comm));
                case 1 : bundle.putString("parent", getResources().getString(R.string.min_ed));
                case 2 : bundle.putString("parent", getResources().getString(R.string.min_labor_social));
                case 3 : bundle.putString("parent", getResources().getString(R.string.min_water));
                case 4 : bundle.putString("parent", getResources().getString(R.string.min_agri_natural));
                case 5 : bundle.putString("parent", getResources().getString(R.string.min_fed_health));
                case 6 : bundle.putString("parent", getResources().getString(R.string.min_livestock));
                default: bundle.putString("parent", "null");

            }
            SectorPage sectorPage = new SectorPage();
            sectorPage.setArguments(bundle);
            return sectorPage;
        }

        @Override
        public int getCount() {
            return num_pages;
        }
    }
}
