package com.example.smartgoals.navigator_0;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public int dummy_progress = 68;
    protected Button btn_dataentry;
    protected Button btn_rewards;
    // TODO https://codelabs.developers.google.com/codelabs/android-navigation/#0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);

//Implement the basic bottom navigation view that starts the relevant activity

        //TODO: Configure buttons based on presence of goal

        // FragmentManager fragmentManager = getSupportFragmentManager();

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.create_new_goal_button:
                                //ONLY DISPLAY THIS IF NO GOAL

                                // Toast.makeText(getApplicationContext(),"Hello New Goal!",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), DataEntryScreen.class);
                                startActivity(intent);
                                // startActivity(new Intent("com.example.smartgoals.navigator_0.DataEntryScreen"));
                                break;
                            case R.id.update_goal_button:
                                Intent intent1 = new Intent(getApplicationContext(), DataEntryScreen.class);
                                startActivity(intent1);

                                //startActivity(new Intent("com.example.smartgoals.navigator_0.DataEntryScreen"));
                                break;
                            case R.id.rewards_button:

                                Intent intent2 = new Intent(getApplicationContext(), RewardsScreen.class);
                                startActivity(intent2);
                                //startActivity(new Intent("com.example.smartgoals.navigator_0.RewardsScreen"));
                                break;
                        }
                        return true;
                    }
                });


        /*Display Brand Logo on Toolbar, right side*/
        //toolbar=getSupportActionBar();
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        if (dummy_progress != 0) {
            //Create Fragments

        }

    }


//TODO: Hide fragments in specific cases
    //SEE PAGE 83


//    public void onClick(View view) {
//        try {
//            switch (view.getId()) {
//                case R.id.btn_dataentry:
//                    showDataEntry(view);
//                    break;
//                case R.id.btn_rewards:
//                    showRewards(view);
//                    break;
//
//
//            }
//
//        }
//        catch(Exception e)
//        {
//            Log.d("ActivityInterface",e.getMessage());
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        super.onCreateOptionsMenu(menu);
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.mainmenu,menu);
//
//        return true;}


//    public void launchNewGoalCreatorActivity(View view) {
//
//        startActivity(new Intent("com.example.smartgoals.navigator_0.DataEntryScreen"));
//
//    }
//
//    //Create Goal--> Launch Data Entry Screen (Initial)
//
//
////        Intent intent = new Intent(this, com.example.olts.debug.Create_New_Goals.class);
////        // Log.d(LOG_TAG, "New Goal Creator Clicked!");
////        startActivity(intent);
//
//
//    public void launchGoalUpdateActivity(View view) {
//        startActivity(new Intent("com.example.smartgoals.navigator_0.DataEntryScreen"));
//
//    }



    public void deleteGoalActivity(View view) {
    }
}
