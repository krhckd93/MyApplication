package com.example.darksoul.myapplication.beam_content;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.darksoul.myapplication.R;


public class BeamContentFrame1 extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View bmc_frame1 = inflater.inflate(R.layout.beam_content_frame1, null);
//        return super.onCreateView(inflater, container, savedInstanceState);
        RelativeLayout btn_beam = (RelativeLayout)bmc_frame1.findViewById(R.id.btn_beam);
        RelativeLayout btn_community = (RelativeLayout)bmc_frame1.findViewById(R.id.btn_community);
        RelativeLayout btn_content = (RelativeLayout)bmc_frame1.findViewById(R.id.btn_content);

        btn_beam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    getFragmentManager().beginTransaction().replace(R.id.fragment_container, new BeamContentFrame2()).addToBackStack("beam").commit();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        btn_community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    getFragmentManager().beginTransaction().replace(R.id.fragment_container, new BeamContentFrame4()).addToBackStack("community").commit();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        btn_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    getFragmentManager().beginTransaction().replace(R.id.fragment_container, new BeamContentFrame3()).addToBackStack("content").commit();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        return bmc_frame1;
    }
}
