package com.cs245project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import com.cs245project.fragments.GameFragment;
import com.cs245project.fragments.HomeFragment;

import static com.cs245project.R.id.difficulty;

/**
 * Created by jason on 3/7/2017.
 */


//Class GameActivity
//handles Game fragment and shows the game
public class GameActivity extends AppCompatActivity {

    MainActivity main = new MainActivity();
    ToggleButton music;
    boolean isPlaying;
    int currentDuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment mContent;
        music = (ToggleButton)findViewById(R.id.music_toggle);
        music.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked) {
                    main.startMusic();
                } else {
                    main.stopMusic();
                    main.isPlaying = false;
                }
            }
        });

        int difficulty = getIntent().getExtras().getInt("DIFFICULTY");
        int points = getIntent().getExtras().getInt("POINTS");
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
                    .replace(R.id.main_container, GameFragment.newInstance(difficulty, points))
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
