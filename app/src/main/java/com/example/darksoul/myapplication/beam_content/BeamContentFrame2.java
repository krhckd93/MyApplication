package com.example.darksoul.myapplication.beam_content;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.darksoul.myapplication.R;

public class BeamContentFrame2 extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beam_content_frame_2, null);

        RelativeLayout sixth = (RelativeLayout)view.findViewById(R.id.sixth_selected);
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getFragmentManager().beginTransaction().replace(R.id.fragment_container, new BeamContentFrame2Child()).addToBackStack("bmc_content").commit();
            }
        });
        return view;
    }
}
