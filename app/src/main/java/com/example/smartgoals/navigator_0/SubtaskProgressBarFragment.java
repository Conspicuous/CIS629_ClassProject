package com.example.smartgoals.navigator_0;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SubtaskProgressBarFragment extends Fragment {

    private static final int TEST_PERCENT_COMPLETE = 68;

    public SubtaskProgressBarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//     View view = inflater.inflate(R.layout.fragment_progress_bars, container, false);
        View view = inflater.inflate(R.layout.fragment_subtasks_progress_bar, container, false);

//    TextView goalProgress = view.findViewById(R.id.Goal_Progress_Text);
//    goalProgress.setText(R.string.Goal_Progress_Title);

        return view;
    }
}
