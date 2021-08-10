package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kaki extends AppCompatActivity implements View.OnClickListener{
    Button kaki;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaki);
        kaki = findViewById(R.id.kaki);
        kaki.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(Kaki.this, R.raw.kaki);

        switch (view.getId()) {
            case R.id.kaki:
                buttonSound.start();
                break;
        }
    }
}
