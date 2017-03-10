package com.cs245project.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cs245project.R;

import java.util.ArrayList;

import static android.R.attr.fragment;

/**
 * Created by Gary on 3/8/2017.
 */

 public class EndGameFragment extends Fragment {

    private int points;

    public static Fragment newInstance(int points) {
        EndGameFragment fragment = new EndGameFragment();
        //fragment.points = points;

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;

        if(savedInstanceState != null){
            points = savedInstanceState.getInt("POINTS");
        }

        view = inflater.inflate(R.layout.fragment_endgame, container, false);
        TextView textView = (TextView) view.findViewById(R.id.points);
        textView.setText("Score:  " + points);

        return inflater.inflate(R.layout.fragment_endgame, container, false);
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("POINTS", points);
    }
}
