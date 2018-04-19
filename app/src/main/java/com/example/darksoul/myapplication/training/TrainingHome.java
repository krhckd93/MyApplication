package com.example.darksoul.myapplication.training;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.darksoul.myapplication.R;

public class TrainingHome extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View training_home = inflater.inflate(R.layout.training_home, null);

        RelativeLayout first_inv = (RelativeLayout)training_home.findViewById(R.id.first);
        first_inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new TrainingViewPager()).addToBackStack("training_vp").commit();
            }
        });
//        return super.onCreateView(inflater, container, savedInstanceState);
        return training_home;
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
