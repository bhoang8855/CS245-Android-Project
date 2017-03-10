package com.cs245project;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import com.cs245project.fragments.HomeFragment;

//Class MainActivity
//Handles navigation between all fragments besides GameFragment and EndGameFragment
public class MainActivity extends AppCompatActivity {
    boolean isPlaying = false;
    ToggleButton music;
    public static MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startStopMusic();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, HomeFragment.newInstance())
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

    //method: startStopMusic
    //stop and starts the music
    public void startStopMusic()
    {
        music = (ToggleButton) findViewById(R.id.music_toggle);
        mp = MediaPlayer.create(MainActivity.this, R.raw.background_music);
        mp.start();
        mp.setLooping(true);
//        music.setChecked(false);
        music.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked) {
                    startMusic();
                } else {
                    stopMusic();
                }
            }
        });
    }

    public void stopMusic()
    {
        mp.pause();
    }
    public void startMusic()
    {
        mp.start();
    }
}
