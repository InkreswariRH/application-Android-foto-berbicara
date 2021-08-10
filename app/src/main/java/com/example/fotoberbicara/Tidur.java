package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tidur extends AppCompatActivity implements View.OnClickListener {
    Button tidur;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tidur);
        tidur = findViewById(R.id.tidur);

        tidur.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(Tidur.this, R.raw.tidur);

        switch (view.getId()) {
            case R.id.tidur:
                buttonSound.start();
                break;
        }
    }
}
