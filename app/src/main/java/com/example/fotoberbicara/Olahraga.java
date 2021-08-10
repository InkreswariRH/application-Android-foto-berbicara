package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Olahraga extends AppCompatActivity implements View.OnClickListener{
    Button olahraga;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olahraga);
        olahraga = findViewById(R.id.olahraga);

        olahraga.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(Olahraga.this, R.raw.olahraga);

        switch (view.getId()) {
            case R.id.olahraga:
                buttonSound.start();
                break;
        }
    }
}
