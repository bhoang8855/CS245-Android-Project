package com.cs245project.fragments;

/**
 * Created by jason on 3/5/2017.
 */

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import com.cs245project.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jason on 2/25/2017.
 */

public class GameFragment extends Fragment {

    private final String[] words =
            {"PANDA", "LION", "DONKEY", "ZEBRA", "WHALE", "TURKEY",
            "CHICKEN", "LIZARD", "GIRAFFE", "DOLPHIN"};

    private int difficulty;
    List<String> list = new ArrayList<>();
    private ToggleButton toggle1, toggle2, toggle3, toggle4, toggle5, toggle6, toggle7, toggle8, toggle9, toggle10,
            toggle11, toggle12, toggle13, toggle14, toggle15, toggle16, toggle17, toggle18, toggle19, toggle20;

    private List<ToggleButton> buttons = new ArrayList<ToggleButton>();
    ToggleButton tempButton=null;
    int tempNum;
    int numOfButtons;

    public static GameFragment newInstance(int difficulty) {
        GameFragment fragment = new GameFragment();
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
            view = inflater.inflate(R.layout.fragment_game4, container, false);
            numOfButtons = 4;
        } else if(difficulty == 6) {
            view = inflater.inflate(R.layout.fragment_game6, container, false);
            numOfButtons = 6;
        } else if(difficulty == 8) {
            view = inflater.inflate(R.layout.fragment_game8, container, false);
            numOfButtons = 8;
        } else if(difficulty == 10) {
            view = inflater.inflate(R.layout.fragment_game10, container, false);
            numOfButtons = 10;
        } else if(difficulty == 12) {
            view = inflater.inflate(R.layout.fragment_game12, container, false);
            numOfButtons = 12;
        } else if(difficulty == 14) {
            view = inflater.inflate(R.layout.fragment_game14, container, false);
            numOfButtons = 14;
        } else if(difficulty == 16) {
            view = inflater.inflate(R.layout.fragment_game16, container, false);
            numOfButtons = 16;
        } else if(difficulty == 18) {
            view = inflater.inflate(R.layout.fragment_game18, container, false);
            numOfButtons = 18;
        } else {
            view = inflater.inflate(R.layout.fragment_game20, container, false);
            numOfButtons = 20;
        }



        toggle1 = (ToggleButton) view.findViewById(R.id.tile1);
        toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    checkButton(toggle1, 0);
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

                    checkButton(toggle2, 1);
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
                    checkButton(toggle3, 2);
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        toggle4 = (ToggleButton) view.findViewById(R.id.tile4);
        toggle4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkButton(toggle4, 3);
                } else {
                    // The toggle is disabled
                }
            }
        });

        buttons.add(toggle1);
        buttons.add(toggle2);
        buttons.add(toggle3);
        buttons.add(toggle4);

        if(difficulty > 4) {

            toggle5 = (ToggleButton) view.findViewById(R.id.tile5);
            toggle5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle5, 4);
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
                        checkButton(toggle6, 5);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            buttons.add(toggle5);
            buttons.add(toggle6);
        }

        if(difficulty > 6) {
            toggle7 = (ToggleButton) view.findViewById(R.id.tile7);
            toggle7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle7, 6);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            toggle8 = (ToggleButton) view.findViewById(R.id.tile8);
            toggle8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle8, 7);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            buttons.add(toggle7);
            buttons.add(toggle8);
        }

        if(difficulty > 8) {
            toggle9 = (ToggleButton) view.findViewById(R.id.tile9);
            toggle9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle9, 8);
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
                        checkButton(toggle10, 9);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            buttons.add(toggle9);
            buttons.add(toggle10);
        }

        if(difficulty > 10) {
            toggle11 = (ToggleButton) view.findViewById(R.id.tile11);
            toggle11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle11, 10);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            toggle12 = (ToggleButton) view.findViewById(R.id.tile12);
            toggle12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle12, 11);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            buttons.add(toggle11);
            buttons.add(toggle12);
        }

        if(difficulty > 12) {
            toggle13 = (ToggleButton) view.findViewById(R.id.tile13);
            toggle13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle13, 12);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            toggle14 = (ToggleButton) view.findViewById(R.id.tile14);
            toggle14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle14, 13);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            buttons.add(toggle13);
            buttons.add(toggle14);
        }

        if(difficulty > 14) {
            toggle15 = (ToggleButton) view.findViewById(R.id.tile15);
            toggle15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle15, 14);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            toggle16 = (ToggleButton) view.findViewById(R.id.tile16);
            toggle16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle16, 15);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            buttons.add(toggle15);
            buttons.add(toggle16);
        }

        if(difficulty > 16) {
            toggle17 = (ToggleButton) view.findViewById(R.id.tile17);
            toggle17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle17, 16);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            toggle18 = (ToggleButton) view.findViewById(R.id.tile18);
            toggle18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle18, 17);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            buttons.add(toggle17);
            buttons.add(toggle18);
        }

        if(difficulty > 18) {
            toggle19 = (ToggleButton) view.findViewById(R.id.tile19);
            toggle19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle19, 18);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            toggle20 = (ToggleButton) view.findViewById(R.id.tile20);
            toggle20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        checkButton(toggle20, 19);
                        // The toggle is enabled
                    } else {
                        // The toggle is disabled
                    }
                }
            });

            buttons.add(toggle19);
            buttons.add(toggle20);

        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        for(int i = 0; i < difficulty / 2; i++) {
            list.add(words[i]);
            list.add(words[i]);
        }

        Collections.shuffle(list);

        
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

        ((Button)getActivity().findViewById(R.id.try_again_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0; i < difficulty; i++){
                    if(buttons.get(i).getCurrentTextColor() == Color.RED){

                        buttons.get(i).setChecked(false);
                        buttons.get(i).setClickable(true);
                        buttons.get(i).setTextColor(Color.BLACK);
                    }
                }
                enableAllButtons();
            }
        });


    }

    private void disableAllButtons(){
        //for(int i = 0; i < numOfButtons; i++){
        //    buttons.get(i).setEnabled(false);
        //}
        toggle1.setEnabled(false);
        toggle2.setEnabled(false);
        toggle3.setEnabled(false);
        toggle4.setEnabled(false);
        if(difficulty > 4) {
            toggle5.setEnabled(false);
            toggle6.setEnabled(false);
        }
        if(difficulty > 6) {
            toggle7.setEnabled(false);
            toggle8.setEnabled(false);
        }
        if(difficulty > 8) {
            toggle9.setEnabled(false);
            toggle10.setEnabled(false);
        }
        if(difficulty > 10) {
            toggle11.setEnabled(false);
            toggle12.setEnabled(false);
        }
        if(difficulty > 12) {
            toggle13.setEnabled(false);
            toggle14.setEnabled(false);
        }
        if(difficulty > 14) {
            toggle15.setEnabled(false);
            toggle16.setEnabled(false);
        }
        if(difficulty > 16) {
            toggle17.setEnabled(false);
            toggle18.setEnabled(false);
        }
        if(difficulty > 18) {
            toggle19.setEnabled(false);
            toggle20.setEnabled(false);
        }
    }

    private void enableAllButtons(){
        //for(int i = 0; i < numOfButtons; i++){
        //    buttons.get(i).setEnabled(true);
        //}
        toggle1.setEnabled(true);
        toggle2.setEnabled(true);
        toggle3.setEnabled(true);
        toggle4.setEnabled(true);
        if(difficulty > 4) {
            toggle5.setEnabled(true);
            toggle6.setEnabled(true);
        }
        if(difficulty > 6) {
            toggle7.setEnabled(true);
            toggle8.setEnabled(true);
        }
        if(difficulty > 8) {
            toggle9.setEnabled(true);
            toggle10.setEnabled(true);
        }
        if(difficulty > 10) {
            toggle11.setEnabled(true);
            toggle12.setEnabled(true);
        }
        if(difficulty > 12) {
            toggle13.setEnabled(true);
            toggle14.setEnabled(true);
        }
        if(difficulty > 14) {
            toggle15.setEnabled(true);
            toggle16.setEnabled(true);
        }
        if(difficulty > 16) {
            toggle17.setEnabled(true);
            toggle18.setEnabled(true);
        }
        if(difficulty > 18) {
            toggle19.setEnabled(true);
            toggle20.setEnabled(true);
        }
    }

    public void checkButton( ToggleButton X, int I) {

        System.out.println("hitXXX");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        X.setTextOn(list.get(I));
        if (tempButton == null) {
            tempButton = X;
            tempNum = I;
            tempButton.setClickable(false);
        }
        else if ( list.get(tempNum) == list.get(I) && tempButton != X) {
            //         X.setTextOn("Correct");
            System.out.println("correct");
            X.setTextColor(0xFF00FF00);
            X.getCurrentTextColor();
            //          tempButton.setText("Correct");
            tempButton.setTextColor(0xFF00FF00);
            tempButton.setClickable(false);
            X.setClickable(false);
            tempButton=null;
        }
        else {
            System.out.println("incorrect");
            X.setTextColor(Color.RED);

            //          tempButton.setText("Correct");
            tempButton.setTextColor(Color.RED);
            tempButton.setClickable(false);
            X.setClickable(false);
            tempButton=null;
            disableAllButtons();

        }
    }
}