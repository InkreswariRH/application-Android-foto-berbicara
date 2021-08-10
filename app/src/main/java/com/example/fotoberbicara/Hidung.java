package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hidung extends AppCompatActivity implements View.OnClickListener{
    Button hidung;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidung);
        hidung = findViewById(R.id.hidung);
        hidung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(Hidung.this, R.raw.hidung);

        switch (view.getId()) {
            case R.id.hidung:
                buttonSound.start();
                break;
        }
    }
}
