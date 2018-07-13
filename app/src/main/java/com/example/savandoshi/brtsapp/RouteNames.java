package com.example.savandoshi.brtsapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RouteNames extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_names);

        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#003399")));



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        ListView listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.sub_name,android.R.layout.simple_expandable_list_item_1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(RouteNames.this,Routes.class);

                switch (position)
                {
                    case 0:
                        i.putExtra("ABC", 0);
                        break;
                    case 1:
                        i.putExtra("ABC", 1);
                        break;
                    case 2:
                        i.putExtra("ABC", 2);
                        break;
                    case 3:
                        i.putExtra("ABC", 3);
                        break;
                    case 4:
                        i.putExtra("ABC", 4);
                        break;
                    case 5:
                        i.putExtra("ABC", 5);
                        break;
                    case 6:
                        i.putExtra("ABC", 6);
                        break;
                    case 7:
                        i.putExtra("ABC", 7);
                        break;
                    case 8:
                        i.putExtra("ABC", 8);
                        break;
                    case 9:
                        i.putExtra("ABC", 9);
                        break;
                    case 10:
                        i.putExtra("ABC", 10);
                        break;

                }

                startActivity(i);
            }
        });

    }



}
