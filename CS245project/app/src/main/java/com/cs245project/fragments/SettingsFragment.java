package com.cs245project.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.cs245project.R;

/**
 * Created by jason on 2/25/2017.
 */

public class SettingsFragment extends Fragment {
    int progress = 0;
    int difficulty = 0;

    public static SettingsFragment newInstance() { return new SettingsFragment();}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final TextView textView = (TextView)getActivity().findViewById(R.id.difficulty);
        SeekBar seekBar = (SeekBar)getActivity().findViewById(R.id.slider);

        textView.setText("4 / 20");

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress = i;
                difficulty = i * 2 + 4;
                System.out.println(difficulty);
                textView.setText(i * 2 + 4 + " /  20");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ((Button)getActivity().findViewById(R.id.game_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(difficulty == 20) {
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.main_container, GameFragment20.newInstance())
                            .addToBackStack(null)
                            .commit();
                } else if(difficulty == 18) {
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.main_container, GameFragment18.newInstance())
                            .addToBackStack(null)
                            .commit();
                } else if(difficulty == 16) {
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.main_container, GameFragment16.newInstance())
                            .addToBackStack(null)
                            .commit();
                } else if(difficulty == 14) {
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.main_container, GameFragment14.newInstance())
                            .addToBackStack(null)
                            .commit();
                } else if(difficulty == 12) {
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.main_container, GameFragment12.newInstance())
                            .addToBackStack(null)
                            .commit();
                } else if(difficulty == 10) {
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.main_container, GameFragment10.newInstance())
                            .addToBackStack(null)
                            .commit();
                } else if(difficulty == 8) {
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.main_container, GameFragment8.newInstance())
                            .addToBackStack(null)
                            .commit();
                } else if(difficulty == 6) {
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.main_container, GameFragment6.newInstance())
                            .addToBackStack(null)
                            .commit();
                } else if(progress == 0){
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.main_container, GameFragment4.newInstance())
                            .addToBackStack(null)
                            .commit();
                }
            }
        });

    }
}
