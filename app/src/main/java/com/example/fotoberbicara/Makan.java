package com.example.fotoberbicara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Makan extends AppCompatActivity implements View.OnClickListener {
Button makan;
public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makan);
        makan = findViewById(R.id.makan);

        makan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer buttonSound = MediaPlayer.create(Makan.this, R.raw.makan);

        switch (view.getId()) {
            case R.id.makan:
                buttonSound.start();
                break;
        }
    }
}
