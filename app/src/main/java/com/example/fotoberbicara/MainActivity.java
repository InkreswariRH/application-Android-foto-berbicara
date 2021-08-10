package com.example.fotoberbicara;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.*;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bagianTubuh, aktivitas, keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       bagianTubuh = findViewById(R.id.bagianTubuh);
        bagianTubuh.setOnClickListener(this);

       aktivitas = findViewById(R.id.aktivitas);
        aktivitas.setOnClickListener(this);

        keluar = findViewById(R.id.keluar);
        keluar.setOnClickListener(this);

    }

    @Override
   public void onClick(View v){

        switch (v.getId()){

            case R.id.bagianTubuh:
                Intent menuBagianTubuh = new Intent(this, bagianTubuh.class);
                startActivity(menuBagianTubuh);
                break;

            case R.id.aktivitas:
                Intent menuAktivitas = new Intent(this, aktivitas.class);
                startActivity(menuAktivitas);
                break;

            case R.id.keluar:
                AlertDialog.Builder mauKeluar = new AlertDialog.Builder(MainActivity.this);
                mauKeluar.setMessage("Keluar aplikasi ?").setCancelable(false)
                        .setPositiveButton("YA",new AlertDialog.OnClickListener(){

                            public void onClick(DialogInterface arg0,int arg1){
                                Intent exit = new Intent (Intent.ACTION_MAIN);
                                exit.addCategory(Intent.CATEGORY_HOME);
                                exit.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                                startActivity(exit);
                            }
                        })
                        .setNegativeButton("TIDAK",new AlertDialog.OnClickListener(){

                            public void onClick(DialogInterface dialog,int arg1){
                                dialog.cancel();
                            }
                        });
                AlertDialog judul = mauKeluar.create();
                judul.setTitle("Keluar ?");
                judul.show();

        }
    }

}
