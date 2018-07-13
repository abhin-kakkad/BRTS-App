package com.example.savandoshi.brtsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer = new Thread(){
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent openStartingPoint = new Intent("android.intent.action.MAINACTIVITY");
                    startActivity(openStartingPoint);
                }
            }


        };
        timer.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
