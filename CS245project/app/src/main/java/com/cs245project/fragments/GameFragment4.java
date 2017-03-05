package com.cs245project.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import com.cs245project.R;

/**
 * Created by jason on 2/25/2017.
 */

public class GameFragment4 extends Fragment {

    List<String> list = new ArrayList<>();
    private ToggleButton toggle1, toggle2, toggle5, toggle6;

    public static GameFragment4 newInstance() { return new GameFragment4();}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        list.add("PANDA");
        list.add("LION");
        list.add("PANDA");
        list.add("LION");

        Collections.shuffle(list);

        View view = inflater.inflate(R.layout.fragment_game4, container, false);

        toggle1 = (ToggleButton) view.findViewById(R.id.tile1);
        toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle1.setTextOn(list.get(0));
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        toggle2 = (ToggleButton) view.findViewById(R.id.tile2);
        toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle2.setTextOn(list.get(1));
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        toggle5 = (ToggleButton) view.findViewById(R.id.tile5);
        toggle5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle5.setTextOn(list.get(2));
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        toggle6 = (ToggleButton) view.findViewById(R.id.tile6);
        toggle6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle6.setTextOn(list.get(3));
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ((Button)getActivity().findViewById(R.id.new_game_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_container, SettingsFragment.newInstance())
                        .addToBackStack(null)
                        .commit();
            }
        });


    }
}