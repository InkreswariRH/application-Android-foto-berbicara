package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mata extends AppCompatActivity implements View.OnClickListener{
    Button mata;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mata);
        mata = findViewById(R.id.mata);
        mata.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(Mata.this, R.raw.mata);

        switch (view.getId()) {
            case R.id.mata:
                buttonSound.start();
                break;
        }
    }
}
