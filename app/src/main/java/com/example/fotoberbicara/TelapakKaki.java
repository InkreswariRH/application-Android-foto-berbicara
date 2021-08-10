package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelapakKaki extends AppCompatActivity implements View.OnClickListener{
    Button TKaki;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telapak_kaki);

        TKaki = findViewById(R.id.tKaki);
        TKaki.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(TelapakKaki.this, R.raw.telapakkaki);

        switch (view.getId()) {
            case R.id.tKaki:
                buttonSound.start();
                break;
        }
    }
}
