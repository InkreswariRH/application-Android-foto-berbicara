package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mulut extends AppCompatActivity implements View.OnClickListener{
    Button mulut;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulut);
        mulut = findViewById(R.id.mulut);
        mulut.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(Mulut.this, R.raw.mulut);

        switch (view.getId()) {
            case R.id.mulut:
                buttonSound.start();
                break;
        }
    }
}
