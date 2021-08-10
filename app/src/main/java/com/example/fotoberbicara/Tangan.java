package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tangan extends AppCompatActivity implements View.OnClickListener{
    Button tangan;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangan);
        tangan = findViewById(R.id.tangan);
        tangan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(Tangan.this, R.raw.tangan);

        switch (view.getId()) {
            case R.id.tangan:
                buttonSound.start();
                break;
        }
    }
}
