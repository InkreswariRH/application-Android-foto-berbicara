package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent i=new Intent(splashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }

        },1500);
    }
}
