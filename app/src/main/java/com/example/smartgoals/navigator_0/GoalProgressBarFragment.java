package com.example.smartgoals.navigator_0;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GoalProgressBarFragment extends Fragment {

    private static final int TEST_PERCENT_COMPLETE = 68;

    public GoalProgressBarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//     View view = inflater.inflate(R.layout.fragment_progress_bars, container, false);
        View view = inflater.inflate(R.layout.fragment_progress_bars, container, false);

//    TextView goalProgress = view.findViewById(R.id.Goal_Progress_Text);
//    goalProgress.setText(R.string.Goal_Progress_Title);

        return view;
    }
}





/*
//TODO: Add ticks between subtasks in second progress bar (e.g. 4 subtasks results in 4 ticks).
https://www.codeproject.com/Articles/875924/Bar-Clock

for ticks between subtasks in second progress bar (e.g. 4 subtasks results in 4 ticks).
    // what is the distance between each tick mark?
    float increment = (float) getWidth() / getMax();

// draw the tick marks
for (int i = 0; i <= getMax(); i++)
        {
        float x = i * increment;

        canvas.drawLine(x, nMiddle - 20.0f, x, nMiddle + 20.0f, m_paintLine);
        }*/
