package com.example.darksoul.myapplication.beam_content;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.darksoul.myapplication.R;


public class BeamContentHome extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View beam_content_home = inflater.inflate(R.layout.beam_content_login, null);
//        return super.onCreateView(inflater, container, savedInstanceState);

        RelativeLayout login = (RelativeLayout)beam_content_home.findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: isAdded() check

                FragmentManager fragmentManager = getActivity().getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragment_container, new BeamContentFrame1()).addToBackStack("bmc_login").commit();

            }
        });

        return beam_content_home;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
