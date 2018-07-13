package com.example.savandoshi.brtsapp;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ltw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#003399")));



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Bundle b = getIntent().getExtras();
        String[] temp = b.getStringArray("abc");
        Log.d("ltw class",temp[0]+temp[1]);
        ListView lv = (ListView)findViewById(R.id.listView2);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,temp);

        lv.setAdapter(adapter);
    }
}
