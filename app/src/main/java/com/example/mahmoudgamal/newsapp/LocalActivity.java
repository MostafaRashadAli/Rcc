package com.example.mahmoudgamal.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LocalActivity extends AppCompatActivity {
    ListView listView_Local;
    String[] Local_Agencies = {"BBC Arabic"
                              ,"IEEE Egypt"
                              ,"Al Jazeera Mubasher"
                              ,"France 24 Arabic"
                              ,"Al Ahram"
                              ,"El Watn"
                              ,"Gomhorya"
                              ,"El Youm7"};
    int []Local_Agencies_resource = {R.drawable.bbc_ar
            ,R.drawable.ieee_ar
            ,R.drawable.aljazeeramubasher_ar
            ,R.drawable.france24_ar
            ,R.drawable.ahram_ar
            ,R.drawable.elwatan_ar
            ,R.drawable.gomohria_ar
            ,R.drawable.youm7_ar};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        listView_Local = (ListView) findViewById(R.id.ListView);
        CustomListView customListView = new CustomListView(this,Local_Agencies,Local_Agencies_resource);
        listView_Local.setAdapter(customListView);
        listView_Local.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),"You Choosed "+parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show();}
        });
    }
    }
