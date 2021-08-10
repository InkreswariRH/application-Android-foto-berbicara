package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Belajar extends AppCompatActivity implements View.OnClickListener {
    Button belajar;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        belajar = findViewById(R.id.belajar);

        belajar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(Belajar.this, R.raw.belajar);

        switch (view.getId()) {
            case R.id.belajar:
                buttonSound.start();
                break;
        }
    }

}
