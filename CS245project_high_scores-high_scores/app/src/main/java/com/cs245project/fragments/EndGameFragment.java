package com.cs245project.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.cs245project.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import static android.content.Context.MODE_APPEND;


/**
 * Created by Gary on 3/8/2017.
 */

 public class EndGameFragment extends Fragment {

    private int points;
    private int difficulty;

    public static EndGameFragment newInstance(int points, int difficulty) {
        EndGameFragment fragment = new EndGameFragment();
        fragment.points = points;
        fragment.difficulty = difficulty;

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;

        if (savedInstanceState != null) {
            points = savedInstanceState.getInt("POINTS");
            difficulty = savedInstanceState.getInt("DIFFICULTY");
        }

        boolean shouldWrite = readFromFile(getActivity());

        view = inflater.inflate(R.layout.fragment_endgame, container, false);
        TextView textView = (TextView) view.findViewById(R.id.endGame_points);
        textView.setText("Score:  " + String.valueOf(points));

        final EditText editText = (EditText) view.findViewById(R.id.enter_name);
        Button saveButton = (Button) view.findViewById(R.id.save_button);

        if(shouldWrite) {
            saveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    writeToFile(editText.getText() + " " + points, getActivity());
                    getActivity().finish();
                }
            });
        } else {
            editText.setVisibility(View.GONE);
            saveButton.setVisibility(View.GONE);
        }
        return view;
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("POINTS", points);
        outState.putInt("DIFFICULTY", difficulty);
    }

    private void writeToFile(String data, Context context) {
        try {
            File path = context.getFilesDir();
            File mFile = new File(path, "highscore" + difficulty + ".txt");
            FileOutputStream stream = getActivity().openFileOutput("highscore" + difficulty + ".txt", MODE_APPEND);
            if (mFile.exists()) {
                int length = (int) mFile.length();

                byte[] bytes = new byte[length];

                FileInputStream in = new FileInputStream(mFile);

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String line = reader.readLine();
                if(line == null) {
                    try {
                        stream.write((data + "\n").getBytes());
                    } finally {
                        stream.close();
                    }
                }

                while (line != null) {
                    String[] results = line.split(" ");
                    int highscore = Integer.parseInt(results[1]);
                    if (highscore > points) {
                        line = reader.readLine();
                        if (line == null)
                        {
                            try {
                                stream.write((data + "\n").getBytes() );
                            } finally {
                                stream.close();
                            }
                        }
                    }
                    else  {
                        try {
                            stream.write((data + "\n").getBytes() );
                        } finally {
                            stream.close();
                        }

                    }

                }
            }

        } catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }


    //method: readFromFile
    //attempts to read from a file and returns if writer should attempt to write to high scores file
    private boolean readFromFile(Context context) {
        try {
            File path = context.getFilesDir();
            File mFile = new File(path, "highscore" + difficulty + ".txt");
            if (mFile.exists()) {
                int length = (int) mFile.length();

                byte[] bytes = new byte[length];

                FileInputStream in = new FileInputStream(mFile);

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String line = reader.readLine();
                int counter = 0;

                while (line != null) {
                    String[] results = line.split(" ");
                    int highscore = Integer.parseInt(results[1]);
                    if(highscore > points)
                        counter++;
                    if(counter >= 3)
                        return false;
                    line = reader.readLine();
                }

                return true;

            } else {
                return true;
            }
        } catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
        return true;
    }


}
