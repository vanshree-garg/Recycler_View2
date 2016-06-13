package com.vanshreegarg.recyclerview2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.CheckBox;

public class MainActivity extends Activity {

    String[] names = {"Alto", "Polo", "Honda Civic", "Honda City", "Swift", "Verna", "Alto", "Polo", "Honda Civic", "Honda City", "Swift", "Verna", "Alto", "Polo", "Honda Civic", "Honda City", "Swift", "Verna"};
    String[] description = {"Petrol", "Petrol", "CNG", "Diesel", "Petrol", "Diesel", "Petrol", "Petrol", "CNG", "Diesel", "Petrol", "Diesel", "Petrol", "Petrol", "CNG", "Diesel", "Petrol", "Diesel"};

    public RecyclerView view1;
    RecyclerView.Adapter myAdapter;
    CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view1 = (RecyclerView) findViewById(R.id.recyclerview);

        RecyclerView.LayoutManager viewManager = new LinearLayoutManager(this);
        view1.setLayoutManager(viewManager);
        view1.setHasFixedSize(true);

        myAdapter = new Adapter(names, description, checkBox, this);
        view1.setAdapter(myAdapter);
    }
}