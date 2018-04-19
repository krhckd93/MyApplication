package com.example.darksoul.myapplication.sector;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.darksoul.myapplication.R;

public class SectorPage extends Fragment {

    public String parent;

    public SectorPage() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        parent = getArguments().getString("parent");
        View  sector_detail = (RelativeLayout) inflater.inflate(R.layout.sector_page, null);

        ViewPager viewPager = (ViewPager)sector_detail.findViewById(R.id.view_pager); // Fixme : Resource ID
        viewPager.setAdapter(new SectorChildAdapter(getChildFragmentManager()));
        viewPager.setCurrentItem(0);
        viewPager.setClipToPadding(false);
        viewPager.setPadding(40, 0, 40, 0);
        viewPager.setPageMargin(20);
        return sector_detail;
    }


    private class SectorChildAdapter extends FragmentStatePagerAdapter {

        public SectorChildAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            SectorPageChild spc = new SectorPageChild();
            Bundle bundle = new Bundle();
            bundle.putString("parent", parent);
            bundle.putInt("frame", position);
            spc.setArguments(bundle);
            return spc;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
