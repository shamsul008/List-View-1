package com.example.listview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.listview.R;

import java.util.ArrayList;
import java.util.List;

public class CountryAdaptor extends BaseAdapter {
    Context context;
    List <String> list=new ArrayList<>();

    public CountryAdaptor (Context context,List<String>list){
        this.context=context;
        this.list=list;

    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public String getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view= LayoutInflater.from(context).inflate(R.layout.list_row_country,parent,false);

        TextView tvCountry = view.findViewById(R.id.list_row_country);
        String countryName= getItem(position);
        tvCountry.setText(countryName);

        return view;
    }
}
