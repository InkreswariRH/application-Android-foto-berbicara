package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Minum extends AppCompatActivity implements View.OnClickListener{
    Button minum;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minum);
        minum = findViewById(R.id.minum);

        minum.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(Minum.this, R.raw.minum);

        switch (view.getId()) {
            case R.id.minum:
                buttonSound.start();
                break;
        }
    }
}
