package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelapakTangan extends AppCompatActivity implements View.OnClickListener{
    Button tTangan;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telapak_tangan);
        tTangan = findViewById(R.id.tTangan);
        tTangan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(TelapakTangan.this, R.raw.telapaktangan);

        switch (view.getId()) {
            case R.id.tTangan:
                buttonSound.start();
                break;
        }
    }
}
