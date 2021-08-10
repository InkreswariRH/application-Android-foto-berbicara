package com.example.fotoberbicara;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class bagianTubuh extends AppCompatActivity implements View.OnClickListener {
Button mata, hidung, mulut, kuping, tangan, telapaktangan, kaki, telapakkaki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagian_tubuh2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mata = findViewById(R.id.tombol_mata);
        mata.setOnClickListener(this);

        hidung = findViewById(R.id.tombol_hidung);
        hidung.setOnClickListener(this);

        mulut = findViewById(R.id.tombol_mulut);
        mulut.setOnClickListener(this);

        kuping = findViewById(R.id.tombol_kuping);
        kuping.setOnClickListener(this);

        tangan = findViewById(R.id.tombol_tangan);
        tangan.setOnClickListener(this);

        telapaktangan = findViewById(R.id.tombol_telapaktangan);
        telapaktangan.setOnClickListener(this);

        kaki = findViewById(R.id.tombol_kaki);
        kaki.setOnClickListener(this);

        telapakkaki = findViewById(R.id.tombol_telapakkaki);
        telapakkaki.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){

        switch (v.getId()){

            case R.id.tombol_mata:
                Intent menuMata = new Intent(this, Mata.class);
                startActivity(menuMata);
                break;

            case R.id.tombol_hidung:
                Intent menuHidung = new Intent(this, Hidung.class);
                startActivity(menuHidung);
                break;

            case R.id.tombol_mulut:
                Intent menuMulut = new Intent(this, Mulut.class);
                startActivity(menuMulut);
                break;

            case R.id.tombol_kuping:
                Intent menuKuping = new Intent(this, Kuping.class);
                startActivity(menuKuping);
                break;

            case R.id.tombol_tangan:
                Intent menuTangan = new Intent(this, Tangan.class);
                startActivity(menuTangan);
                break;

            case R.id.tombol_telapaktangan:
                Intent menuTTangan = new Intent(this, TelapakTangan.class);
                startActivity(menuTTangan);
                break;

            case R.id.tombol_kaki:
                Intent menuKaki = new Intent(this, Kaki.class);
                startActivity(menuKaki);
                break;

            case R.id.tombol_telapakkaki:
                Intent menuTKaki = new Intent(this, TelapakKaki.class);
                startActivity(menuTKaki);
                break;
        }
    }

}
