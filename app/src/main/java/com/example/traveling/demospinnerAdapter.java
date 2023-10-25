package com.example.traveling;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class demospinnerAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<demo> list;

    public demospinnerAdapter(Context context, ArrayList<demo> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=((Activity)context).getLayoutInflater();
        convertView=inflater.inflate(R.layout.spinner_item,parent,false);

        ImageView imgLogo=convertView.findViewById(R.id.demo_item_img);
        TextView txtname=convertView.findViewById(R.id.demo_item_name);
        imgLogo.setImageResource(list.get(position).getImage());
        txtname.setText(list.get(position).getName());
        return convertView;
    }
}

