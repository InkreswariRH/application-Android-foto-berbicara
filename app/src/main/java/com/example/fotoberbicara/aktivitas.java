package com.example.fotoberbicara;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.Button;

import android.view.View;

public class aktivitas extends AppCompatActivity implements View.OnClickListener {
Button btnMakan, btnMinum, btnBelajar, btnOlahraga, btnTidur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivitas2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnMakan = findViewById(R.id.makan);
        btnMakan.setOnClickListener(this);

        btnMinum = findViewById(R.id.minum);
        btnMinum.setOnClickListener(this);

        btnBelajar = findViewById(R.id.belajar);
        btnBelajar.setOnClickListener(this);

        btnOlahraga = findViewById(R.id.olahraga);
        btnOlahraga.setOnClickListener(this);

        btnTidur = findViewById(R.id.tidur);
        btnTidur.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){

        switch (v.getId()){

            case R.id.makan:
                Intent menuMakan = new Intent(this, Makan.class);
                startActivity(menuMakan);
                break;

            case R.id.minum:
                Intent menuMinum = new Intent(this, Minum.class);
                startActivity(menuMinum);
                break;

            case R.id.belajar:
                Intent menuBelajar = new Intent(this, Belajar.class);
                startActivity(menuBelajar);
                break;

            case R.id.olahraga:
                Intent menuOlahraga = new Intent(this, Olahraga.class);
                startActivity(menuOlahraga);
                break;

            case R.id.tidur:
                Intent menuTidur = new Intent(this, Tidur.class);
                startActivity(menuTidur);
                break;
        }
    }

}
