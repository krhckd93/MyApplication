package com.example.darksoul.myapplication.profile;

import android.app.Fragment;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import com.example.darksoul.myapplication.R;


public class ProfileHome extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        Context context = getActivity().getApplicationContext();
        View profile_home = inflater.inflate(R.layout.profile, null);
        RelativeLayout ellipse_ = (RelativeLayout)profile_home.findViewById(R.id.ellipse_);
        ellipse_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShowPopup( getActivity(), R.layout.sector);
            }
        });

        RelativeLayout ellipse__1 = (RelativeLayout)profile_home.findViewById(R.id.ellipse__1);
        ellipse__1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopup( getActivity(), R.layout.phase);
            }
        });

        RelativeLayout ellipse_2 = (RelativeLayout)profile_home.findViewById(R.id.ellipse_2);
        ellipse_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopup( getActivity(), R.layout.performance);
            }
        });
        RelativeLayout ellipse_1 = (RelativeLayout)profile_home.findViewById(R.id.ellipse_1);
        ellipse_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopup( getActivity(), R.layout.knowledge_transfer);
            }
        });

        RelativeLayout ellipse = (RelativeLayout)profile_home.findViewById(R.id.ellipse);
        ellipse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopup( getActivity(), R.layout.achievements);
            }
        });

        RelativeLayout sector_1 = (RelativeLayout)profile_home.findViewById(R.id.sector_1);
        sector_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopup( getActivity(), R.layout.pathway);
            }
        });

        RelativeLayout circle = (RelativeLayout)profile_home.findViewById(R.id.circle);
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopup( getActivity(), R.layout.sessions);
            }
        });
        return profile_home;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void ShowPopup(Context context, int id) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(id, null);
//        PopupWindow popupWindow = new PopupWindow(context);
        final PopupWindow popupWindow = new PopupWindow(popupView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        popupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);

        ImageView back_icon = ((ImageView)popupView.findViewById(R.id.back_icon));
        if(back_icon != null) {
            back_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    popupWindow.dismiss();
                }
            });
        }

    }
}
