package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kuping extends AppCompatActivity implements View.OnClickListener {
    Button kuping;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuping);
        kuping = findViewById(R.id.kuping);
        kuping.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(Kuping.this, R.raw.kuping);

        switch (view.getId()) {
            case R.id.kuping:
                buttonSound.start();
                break;
        }
    }
}
