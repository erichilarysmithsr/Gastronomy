package com.example.ds.gastronome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hello on 23/05/16.
 */
public class ListActivity extends AppCompatActivity {

    ExpandableHeightListView listview;


    private int[] Image = {R.drawable.confit, R.drawable.foaming, R.drawable.consume, R.drawable.molecular, R.drawable.deconstruct, R.drawable.smoking, R.drawable.sousvide};

    private String[] Title = {"Confit", "Foaming", "Consume", "Molecular", "Deconstruct", "Smoking", "Sous Vide"};


    private ArrayList<Bean> beans;
    private ListViewBaseAdapter listViewBaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_food);


        listview = (ExpandableHeightListView) findViewById(R.id.listview);
        beans = new ArrayList<Bean>();

        for (int i = 0; i < Title.length; i++) {

            Bean beanclass = new Bean(Image[i], Title[i]);
            beans.add(beanclass);

        }
        listViewBaseAdapter = new ListViewBaseAdapter(ListActivity.this, beans);

        listview.setAdapter(listViewBaseAdapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });
    }
}
