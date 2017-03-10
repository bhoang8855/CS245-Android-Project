package com.cs245project.fragments;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.cs245project.MainActivity;
import com.cs245project.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Gary on 3/8/2017.
 */


//class ScoresFragment
//shows high scores for a particular difficulty level
public class ScoresFragment extends Fragment {

    private int difficulty = 0;

    public static ScoresFragment newInstance(int difficulty) {
        ScoresFragment fragment = new ScoresFragment();
        fragment.difficulty = difficulty;
        return fragment;}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view;
        if(difficulty == 4) {
            view = inflater.inflate(R.layout.fragment_score4, container, false);

            try {
                File path = getActivity().getFilesDir();
                File mFile = new File(path, "highscore" + difficulty + ".txt");
                FileInputStream fileInputStream = new FileInputStream(mFile);
                if (mFile.exists()) {
                    String string = "";
                    BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
                    int counter = 1;
                    while ((string = reader.readLine()) != null) {
                        if (counter == 1) {
                            TextView textView = (TextView) view.findViewById(R.id.highScore1);
                            textView.setText("1.)" + string);
                        }
                        if (counter == 2) {
                            TextView textView = (TextView) view.findViewById(R.id.highScore2);
                            textView.setText("2.)" + string);
                        }
                        if (counter == 3) {
                            TextView textView = (TextView) view.findViewById(R.id.highScore3);
                            textView.setText("3.)" + string);
                        }
                        counter++;

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if(difficulty == 6) {
            view = inflater.inflate(R.layout.fragment_score6, container, false);

            AssetManager am = view.getContext().getAssets();
            try {
                String string = "";
                File path = getActivity().getFilesDir();
                File mFile = new File(path, "highscore" + difficulty + ".txt");
                FileInputStream fileInputStream = new FileInputStream(mFile);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
                int counter = 1;
                while ((string = reader.readLine()) != null) {
                    if (counter == 1) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore1);
                        textView.setText("1.)"+ string);
                    }
                    if (counter == 2) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore2);
                        textView.setText("2.)" + string);
                    }
                    if (counter == 3) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore3);
                        textView.setText("3.)" + string);
                    }
                    counter++;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if(difficulty == 8) {
            view = inflater.inflate(R.layout.fragment_score8, container, false);

            AssetManager am = view.getContext().getAssets();
            try {
                String string = "";
                File path = getActivity().getFilesDir();
                File mFile = new File(path, "highscore" + difficulty + ".txt");
                FileInputStream fileInputStream = new FileInputStream(mFile);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
                int counter = 1;
                while ((string = reader.readLine()) != null) {
                    if (counter == 1) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore1);
                        textView.setText("1.)"+ string);
                    }
                    if (counter == 2) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore2);
                        textView.setText("2.)" + string);
                    }
                    if (counter == 3) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore3);
                        textView.setText("3.)" + string);
                    }
                    counter++;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if(difficulty == 10) {
            view = inflater.inflate(R.layout.fragment_score10, container, false);

            AssetManager am = view.getContext().getAssets();
            try {
                String string = "";
                File path = getActivity().getFilesDir();
                File mFile = new File(path, "highscore" + difficulty + ".txt");
                FileInputStream fileInputStream = new FileInputStream(mFile);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
                int counter = 1;
                while ((string = reader.readLine()) != null) {
                    if (counter == 1) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore1);
                        textView.setText("1.)"+ string);
                    }
                    if (counter == 2) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore2);
                        textView.setText("2.)" + string);
                    }
                    if (counter == 3) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore3);
                        textView.setText("3.)" + string);
                    }
                    counter++;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if(difficulty == 12) {
            view = inflater.inflate(R.layout.fragment_score12, container, false);

            AssetManager am = view.getContext().getAssets();
            try {
                String string = "";

                File path = getActivity().getFilesDir();
                File mFile = new File(path, "highscore" + difficulty + ".txt");
                FileInputStream fileInputStream = new FileInputStream(mFile);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
                int counter = 1;
                while ((string = reader.readLine()) != null) {
                    if (counter == 1) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore1);
                        textView.setText("1.)"+ string);
                    }
                    if (counter == 2) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore2);
                        textView.setText("2.)" + string);
                    }
                    if (counter == 3) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore3);
                        textView.setText("3.)" + string);
                    }
                    counter++;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if(difficulty == 14) {
            view = inflater.inflate(R.layout.fragment_score14, container, false);

            AssetManager am = view.getContext().getAssets();
            try {
                String string = "";
                File path = getActivity().getFilesDir();
                File mFile = new File(path, "highscore" + difficulty + ".txt");
                FileInputStream fileInputStream = new FileInputStream(mFile);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
                int counter = 1;
                while ((string = reader.readLine()) != null) {
                    if (counter == 1) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore1);
                        textView.setText("1.)"+ string);
                    }
                    if (counter == 2) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore2);
                        textView.setText("2.)" + string);
                    }
                    if (counter == 3) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore3);
                        textView.setText("3.)" + string);
                    }
                    counter++;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if(difficulty == 16) {
            view = inflater.inflate(R.layout.fragment_score16, container, false);

            AssetManager am = view.getContext().getAssets();
            try {
                String string = "";
                File path = getActivity().getFilesDir();
                File mFile = new File(path, "highscore" + difficulty + ".txt");
                FileInputStream fileInputStream = new FileInputStream(mFile);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
                int counter = 1;
                while ((string = reader.readLine()) != null) {
                    if (counter == 1) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore1);
                        textView.setText("1.)"+ string);
                    }
                    if (counter == 2) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore2);
                        textView.setText("2.)" + string);
                    }
                    if (counter == 3) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore3);
                        textView.setText("3.)" + string);
                    }
                    counter++;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if(difficulty == 18) {
            view = inflater.inflate(R.layout.fragment_score18, container, false);

            AssetManager am = view.getContext().getAssets();
            try {
                String string = "";
                File path = getActivity().getFilesDir();
                File mFile = new File(path, "highscore" + difficulty + ".txt");
                FileInputStream fileInputStream = new FileInputStream(mFile);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
                int counter = 1;
                while ((string = reader.readLine()) != null) {
                    if (counter == 1) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore1);
                        textView.setText("1.)"+ string);
                    }
                    if (counter == 2) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore2);
                        textView.setText("2.)" + string);
                    }
                    if (counter == 3) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore3);
                        textView.setText("3.)" + string);
                    }
                    counter++;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            view = inflater.inflate(R.layout.fragment_score20, container, false);

            AssetManager am = view.getContext().getAssets();
            try {
                String string = "";
                File path = getActivity().getFilesDir();
                File mFile = new File(path, "highscore" + difficulty + ".txt");
                FileInputStream fileInputStream = new FileInputStream(mFile);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
                int counter = 1;
                while ((string = reader.readLine()) != null) {
                    if (counter == 1) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore1);
                        textView.setText("1.)"+ string);
                    }
                    if (counter == 2) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore2);
                        textView.setText("2.)" + string);
                    }
                    if (counter == 3) {
                        TextView textView = (TextView) view.findViewById(R.id.highScore3);
                        textView.setText("3.)" + string);
                    }
                    counter++;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        return view;
    }


}
