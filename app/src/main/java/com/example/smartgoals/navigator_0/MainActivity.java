package com.example.smartgoals.navigator_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Display Brand Logo on Toolbar, right side*/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);



    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        super.onCreateOptionsMenu(menu);
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.mainmenu,menu);
//
//        return true;}



    public void launchNewGoalCreatorActivity(View view) {}
          //Create Goal--> Launch Data Entry Screen (Initial)


//        Intent intent = new Intent(this, com.example.olts.debug.Create_New_Goals.class);
//        // Log.d(LOG_TAG, "New Goal Creator Clicked!");
//        startActivity(intent);



    public void launchGoalUpdateActivity(View view) {
        //UpdateGoal--> Launch Data Entry Screen

    }

    public void deleteGoalActivity(View view){}
}
