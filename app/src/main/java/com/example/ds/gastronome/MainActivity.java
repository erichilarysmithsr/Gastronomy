package com.example.ds.gastronome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected TextView letsGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letsGo = (TextView)findViewById(R.id.order);

        //onclick event for the button to enter the app
        letsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(MainActivity.this, com.example.ds.gastronome.ListActivity.class);
                startActivity(listIntent);
            }
        });

    }
}
