package com.example.mahmoudgamal.newsapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

 /**
 * Created by Mahmoud Gamal on 10/16/2017.
 */

public class CustomListView extends ArrayAdapter<String> {
    private String[] International_Agencies;
    private int []International_Agencies_resource;
    private Activity context;
    public CustomListView(Activity context, String[] International_Agencies ,int []International_Agencies_resource) {
        super(context, R.layout.list_view_layout,International_Agencies);
        this.context = context;
        this.International_Agencies = International_Agencies;
        this.International_Agencies_resource = International_Agencies_resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      View r = convertView ;
        ViewHolder viewHolder = null;
        if (r == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.list_view_layout,null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) r.getTag();
        }
         viewHolder.ivw.setImageResource(International_Agencies_resource[position]);
         viewHolder.tvw.setText(International_Agencies[position]);
        return  r;
    }
    class ViewHolder{
        TextView tvw;
        ImageView ivw;
        ViewHolder(View v){
            tvw = (TextView) v.findViewById(R.id.tv98);
            ivw = (ImageView) v.findViewById(R.id.imageView98);
        }
    }

}