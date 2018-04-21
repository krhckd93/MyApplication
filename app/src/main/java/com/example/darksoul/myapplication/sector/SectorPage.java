package com.example.darksoul.myapplication.sector;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.darksoul.myapplication.R;

import org.w3c.dom.Text;

import me.relex.circleindicator.CircleIndicator;
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
        viewPager.setPadding(270, 0, 270, 0);
        CircleIndicator circleIndicator = (CircleIndicator)sector_detail.findViewById(R.id.circle_indicator);
        circleIndicator.setViewPager(viewPager);

        TextView header_tv = (TextView)sector_detail.findViewById(R.id.header_tv);
        header_tv.setText(parent);

        final TextSwitcher textSwitcher = (TextSwitcher)sector_detail.findViewById(R.id.sector_page_switcher);
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView switcherTextView = new TextView(getContext().getApplicationContext());
                switcherTextView.setTextSize(18);
                switcherTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.sec_blue));
                switcherTextView.setText("Federal");
                return switcherTextView;
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 0) {
                    textSwitcher.setCurrentText("Federal");
                } else if (position == 1) {
                    textSwitcher.setCurrentText("Regional");
                } else if(position ==2) {
                    textSwitcher.setCurrentText("Woreda");
                } else {
                    textSwitcher.setCurrentText("");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
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
