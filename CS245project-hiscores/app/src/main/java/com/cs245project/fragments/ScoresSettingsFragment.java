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

public class ScoresSettingsFragment extends Fragment {

    int progress = 0;
    int difficulty = 0;

    public static ScoresSettingsFragment newInstance() { return new ScoresSettingsFragment();}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_setting_scores, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final TextView textView = (TextView)getActivity().findViewById(R.id.difficultyScores);
        SeekBar seekBar = (SeekBar)getActivity().findViewById(R.id.seekBarScores);

        textView.setText("4 / 20");
        difficulty = 4;

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

        ((Button)getActivity().findViewById(R.id.scoresButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.main_container, ScoresFragment.newInstance(difficulty))
                        .commit();
            }
        });

    }
}
