package com.example.savandoshi.brtsapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bRoute,bStation,bFare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#003399")));



        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bRoute = (Button)findViewById(R.id.bRoute);
        bStation = (Button)findViewById(R.id.bStation);
        bFare = (Button)findViewById(R.id.bFare);

        bRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,RouteNames.class);
                    startActivity(i);
            }
        });

        bStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Line.class));
            }
        });

        bFare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Fare.class));
            }
        });
    }
}
