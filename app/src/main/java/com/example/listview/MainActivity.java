package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listview.adapter.CountryAdaptor;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List <String> country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country = new ArrayList<>();
        country.add("Bangladesh");
        country.add("India");
        country.add("Canada");
        country.add("China");
        country.add("Russia");
        country.add("South Africa");
        country.add("Afghanistan");
        country.add("France");
        country.add("Japan");

        listView.findViewById(R.id.listView);
        CountryAdaptor adaptor=new CountryAdaptor(this,country);
        listView.setAdapter(adaptor);
    }
}
