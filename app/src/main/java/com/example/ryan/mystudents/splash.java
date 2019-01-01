package com.example.ryan.mystudents;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class splash extends AppCompatActivity {
    private int waktu_loading=1000;
    //1000= 1 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading langsung menuju home/dashboard
                Intent home = new Intent(splash.this, Home.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}
