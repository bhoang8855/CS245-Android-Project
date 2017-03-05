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

public class GameFragment10 extends Fragment {

    List<String> list = new ArrayList<>();
    private ToggleButton toggle1, toggle2, toggle3, toggle5, toggle6, toggle7, toggle9, toggle10,
            toggle11, toggle13;

    public static GameFragment10 newInstance() { return new GameFragment10();}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        list.add("PANDA");
        list.add("LION");
        list.add("DONKEY");
        list.add("ZEBRA");
        list.add("WHALE");
        list.add("PANDA");
        list.add("LION");
        list.add("DONKEY");
        list.add("ZEBRA");
        list.add("WHALE");

        Collections.shuffle(list);

        View view = inflater.inflate(R.layout.fragment_game10, container, false);

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

        toggle3 = (ToggleButton) view.findViewById(R.id.tile3);
        toggle3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle3.setTextOn(list.get(2));
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
                    toggle5.setTextOn(list.get(3));
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
                    toggle6.setTextOn(list.get(4));
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        toggle7 = (ToggleButton) view.findViewById(R.id.tile7);
        toggle7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle7.setTextOn(list.get(5));
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        toggle9 = (ToggleButton) view.findViewById(R.id.tile9);
        toggle9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle9.setTextOn(list.get(6));
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        toggle10 = (ToggleButton) view.findViewById(R.id.tile10);
        toggle10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle10.setTextOn(list.get(7));
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        toggle11 = (ToggleButton) view.findViewById(R.id.tile11);
        toggle11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle11.setTextOn(list.get(8));
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        toggle13 = (ToggleButton) view.findViewById(R.id.tile13);
        toggle13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle13.setTextOn(list.get(9));
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