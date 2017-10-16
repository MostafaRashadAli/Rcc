package com.example.mahmoudgamal.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class InternationalActivity extends AppCompatActivity {
    ListView listView_International;
    String [] International_Agencies =  {"CNN","NewYork Times","IEEE","Sky News","BBC English","France 24","Al Jazeera News"};
    int []International_Agencies_resource = {R.drawable.cnn_en
                                            ,R.drawable.thenewyorktimes_en
                                            ,R.drawable.ieee_en
                                            ,R.drawable.skynews_en
                                            ,R.drawable.bbc_en
                                            ,R.drawable.france24_en
                                            ,R.drawable.aljazeera_en};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international);
        listView_International = (ListView) findViewById(R.id.ListView);
        CustomListView customListView = new CustomListView(this,International_Agencies,International_Agencies_resource);
        listView_International.setAdapter(customListView);
        listView_International.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),"You Choosed "+parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show();}
        });
    }



}
