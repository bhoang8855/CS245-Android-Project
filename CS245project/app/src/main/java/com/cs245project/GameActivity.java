package com.cs245project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cs245project.fragments.GameFragment;
import com.cs245project.fragments.HomeFragment;

/**
 * Created by jason on 3/7/2017.
 */

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int difficulty = getIntent().getExtras().getInt("DIFFICULTY");

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, GameFragment.newInstance(difficulty))
                .commit();
    }

    @Override
    public void onBackPressed() {

        int count = getSupportFragmentManager().getBackStackEntryCount();

        if (count == 0) {
            super.onBackPressed();
            //additional code
        } else {
            getSupportFragmentManager().popBackStack();
        }
    }

}
