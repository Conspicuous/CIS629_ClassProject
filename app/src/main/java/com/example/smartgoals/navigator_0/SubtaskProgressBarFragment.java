package com.example.smartgoals.navigator_0;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

public class SubtaskProgressBarFragment extends Fragment {

    // private static final int TEST_PERCENT_COMPLETE = 68;


    private ProgressBar progressBar;
    private int TEST_PERCENT_COMPLETE = 65;
    public SubtaskProgressBarFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Test", "Hello");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//     View view = inflater.inflate(R.layout.fragment_progress_bars, container, false);
        View view = inflater.inflate(R.layout.fragment_subtasks_progress_bar, container, false);
        progressBar = view.findViewById(R.id.SubtasksCompleted); //Gets the handle to subtasks completed progress bar
        progressBar.setProgress(TEST_PERCENT_COMPLETE);
//        ProgressBar goalProgressBar = view.findViewById(R.id.Goal_ProgressBar_PercentCompleted);
//        goalProgressBar.setProgress(68);
//        decrease = (ProgressBar)view.findViewById(R.id.decrease);
//        increase = (ProgressBar)view.findViewById(R.id.increase);
//        decrease.setOnClickListener(new View.OnClickListener() {
//    TextView goalProgress = view.findViewById(R.id.Goal_Progress_Text);
//    goalProgress.setText(R.string.Goal_Progress_Title);

        return view;
    }

}
