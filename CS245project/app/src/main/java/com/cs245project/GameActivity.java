package com.cs245project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.cs245project.fragments.GameFragment;
import com.cs245project.fragments.HomeFragment;

import static com.cs245project.R.id.difficulty;

/**
 * Created by jason on 3/7/2017.
 */

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment mContent;

        int difficulty = getIntent().getExtras().getInt("DIFFICULTY");
        if (savedInstanceState != null) {
            //Restore the fragment's instance
            mContent = getSupportFragmentManager().getFragment(savedInstanceState, "myFragmentName");

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_container, mContent)
                    .commit();
        } else {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_container, GameFragment.newInstance(difficulty))
                    .commit();
        }



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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        //Save the fragment's instance
        getSupportFragmentManager().putFragment(outState, "myFragmentName", getSupportFragmentManager().getFragments().get(0));
    }

}
