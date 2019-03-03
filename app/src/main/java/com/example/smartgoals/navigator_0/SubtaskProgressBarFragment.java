package com.example.smartgoals.navigator_0;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SubtaskProgressBarFragment extends Fragment {




    private ProgressBar progressBar;
    private double TEST_SUBTASKS_COMPLETE = 4;
    private double TESTS_SUBSTASKS_INCOMPLETE = 1;
    private double TEST_SUBTASKS_TOTAL = TEST_SUBTASKS_COMPLETE + TESTS_SUBSTASKS_INCOMPLETE;
    private int PERCENT_COMPLETE = (int) Math.round((TEST_SUBTASKS_COMPLETE / TEST_SUBTASKS_TOTAL) * 100);
    private int Test_Subtasks_Total = (int) TEST_SUBTASKS_TOTAL;
    private int TestSubTasksComplete = (int) (TEST_SUBTASKS_COMPLETE);
    private String complete_subtasks = String.valueOf(TestSubTasksComplete);
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


        View view = inflater.inflate(R.layout.fragment_subtasks_progress_bar, container, false);
        progressBar = view.findViewById(R.id.SubtasksCompleted); //Gets the handle to subtasks completed progress bar
        progressBar.setProgress(PERCENT_COMPLETE);
        String subtasksprogress = getString(R.string.subtasks_complete_fragment_text, Test_Subtasks_Total);


        TextView textView = view.findViewById(R.id.subtasks_completed_of_total_text);
        //Log.d("subtasks", "Value: " + (subtasksprogress));

        String conCat = complete_subtasks + ' ' + subtasksprogress;
        textView.setText(conCat);

        return view;
    }

}
