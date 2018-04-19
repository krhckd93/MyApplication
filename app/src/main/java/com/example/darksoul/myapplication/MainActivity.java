package com.example.darksoul.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.darksoul.myapplication.beam_content.BeamContentHome;
import com.example.darksoul.myapplication.notification.NotificationHome;
import com.example.darksoul.myapplication.profile.ProfileHome;
import com.example.darksoul.myapplication.sector.SectorHome;
import com.example.darksoul.myapplication.training.TrainingHome;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            getSupportActionBar().hide();
        } catch (java.lang.NullPointerException ex) {
            ex.printStackTrace();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bott_nav = (BottomNavigationView) findViewById(R.id.bott_nav);
        bott_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

//                Toast.makeText(getApplicationContext(), item.getItemId() + "_" + item.getTitle() + "_" + this.getClass().toString(), Toast.LENGTH_SHORT).show();
                FragmentManager fragmentManager = getFragmentManager();

                switch (item.getItemId()) {

                    case R.id.menu_sectors:
                        SectorHome sectorHome = new SectorHome();
                        fragmentManager.beginTransaction().replace(R.id.fragment_container, sectorHome).addToBackStack("sectors").commit();
                        return true;

                    case R.id.menu_training:
                        TrainingHome trainingHome = new TrainingHome();
                        fragmentManager.beginTransaction().replace(R.id.fragment_container, trainingHome).addToBackStack("training").commit();
                        return true;

                    case R.id.menu_notifications:
                        NotificationHome notificationHome = new NotificationHome();
                        fragmentManager.beginTransaction().replace(R.id.fragment_container, notificationHome).addToBackStack("notifications").commit();
                        return true;

                    case R.id.menu_beam_content:
                        BeamContentHome beamContentHome = new BeamContentHome();
                        fragmentManager.beginTransaction().replace(R.id.fragment_container, beamContentHome).addToBackStack("content").commit();
                        return true;

                    case R.id.menu_profile:
                        ProfileHome profileHome = new ProfileHome();
                        fragmentManager.beginTransaction().replace(R.id.fragment_container, profileHome).addToBackStack("profile").commit();
                        return true;

                }

                return true;
            }
        });

        bott_nav.setSelectedItemId(R.id.menu_sectors);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
