package com.example.darksoul.myapplication.sector;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.darksoul.myapplication.R;


public class SectorHome extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View sector_home = inflater.inflate(R.layout.sectors, null);

        try {

            ImageView polygon_1_copy_2 = (ImageView)sector_home.findViewById(R.id.polygon_1_copy_2);
            final TextView national_nutrition_cordinating = (TextView)sector_home.findViewById(R.id.national_nutrition_cordinating);
            polygon_1_copy_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    StartDetailFragment(national_nutrition_cordinating.getText().toString(), R.drawable.polygon_1_copy_2);

                }
            });

            ImageView polygon_1_copy_10;
            final TextView regional_nutrition__coordinating = (TextView)sector_home.findViewById(R.id.regional_nutrition__coordinating);
            final TextView regional_nutrition__coordinating1 = (TextView)sector_home.findViewById(R.id.regional_nutrition__coordinating1);
            polygon_1_copy_10 = (ImageView)sector_home.findViewById(R.id.polygon_1_copy_10);
            polygon_1_copy_10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    StartDetailFragment(regional_nutrition__coordinating.getText().toString() + regional_nutrition__coordinating1.getText().toString(), R.drawable.polygon_1_copy_10);
                }
            });


            ImageView polygon_1_copy_11;
            final TextView multisectoral__nutrition__implementation = (TextView)sector_home.findViewById(R.id.multisectoral__nutrition__implementation);
            polygon_1_copy_11 = (ImageView)sector_home.findViewById(R.id.polygon_1_copy_11);
            polygon_1_copy_11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    StartDetailFragment(multisectoral__nutrition__implementation.getText().toString(), R.drawable.polygon_1_copy_11);
                }
            });

            ImageView polygon_1_copy_5;
            final TextView establish_and__strengthen_zona_woreda_level__nutrition = (TextView)sector_home.findViewById(R.id.establish_and__strengthen_zona_woreda_level__nutrition);
            polygon_1_copy_5 = (ImageView)sector_home.findViewById(R.id.polygon_1_copy_5);
            polygon_1_copy_5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    StartDetailFragment(establish_and__strengthen_zona_woreda_level__nutrition.getText().toString(), R.drawable.polygon_1_copy_5);
                }
            });

            ImageView polygon_1_copy_7;
            final TextView nutrition_technical__committees = (TextView)sector_home.findViewById(R.id.nutrition_technical__committees);
            polygon_1_copy_7 = (ImageView)sector_home.findViewById(R.id.polygon_1_copy_7);
            polygon_1_copy_7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    StartDetailFragment(nutrition_technical__committees.getText().toString(), R.drawable.polygon_1_copy_7 );
                }
            });

            ImageView polygon_1_copy_8;
            final TextView appropriate__structure__for_nutrition = (TextView)sector_home.findViewById(R.id.appropriate__structure__for_nutrition);
            polygon_1_copy_8 = (ImageView)sector_home.findViewById(R.id.polygon_1_copy_8);
            polygon_1_copy_8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    StartDetailFragment(appropriate__structure__for_nutrition.getText().toString(), R.drawable.polygon_1_copy_8 );
                }
            });

        } catch (Exception ex) {

        }
        return sector_home;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void StartDetailFragment(String text, int src) {
        Bundle bundle = new Bundle();
        bundle.putString("text", text);
        bundle.putInt("image", src);
        SectorParent sectorParent = new SectorParent();
        sectorParent.setArguments(bundle);
        getFragmentManager().beginTransaction().replace(R.id.fragment_container, sectorParent).addToBackStack("sector_details").commit();
    }
}
