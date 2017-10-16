package com.example.mahmoudgamal.newsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    private Intent Activity ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
    //The following code make your Menu linked in your Activity
    @Override
    public boolean onCreateOptionsMenu(Menu x){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,x);
        return true;}

    public void Open_International_Activity(View view) {
      Activity = new Intent(HomeActivity.this,InternationalActivity.class);startActivity(Activity);
    }


    public void Open_Local_Activity(View view) {
        Activity = new Intent(HomeActivity.this,LocalActivity.class);startActivity(Activity);
    }
}
