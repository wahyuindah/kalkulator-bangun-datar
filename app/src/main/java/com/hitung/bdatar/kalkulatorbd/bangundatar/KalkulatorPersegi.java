package com.hitung.bdatar.kalkulatorbd.bangundatar;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 */

public class KalkulatorPersegi extends AppCompatActivity {

    EditText editSisiPersegi;
    TextView textKllPersegi;
    TextView textLuasPersegi;

    Double sisi;
    Double kllPersegi;
    Double luasPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_persegi);

        editSisiPersegi = (EditText) findViewById(R.id.editsisipersegi);
        textKllPersegi = (TextView) findViewById(R.id.text_kll_persegi);
        textLuasPersegi = (TextView) findViewById(R.id.text_luas_persegi);

        Intent intent = getIntent();
        final String namaBangunDatar = intent.getExtras().getString("namaBangunDatar");
        final String descBangunDatar = intent.getExtras().getString("descBangunDatar");
        final int whiteThumbBangunDatar = intent.getExtras().getInt("whiteThumbBangunDatar");
        final String luasBangunDatar = intent.getExtras().getString("luasBangunDatar");
        final String kelilingBangunDatar = intent.getExtras().getString("kelilingBangunDatar");
        final int imageRumusBangunDatar = intent.getExtras().getInt("rumusBangunDatar");

        FloatingActionButton fab = findViewById(R.id.fabBack);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MateriBangunDatar.class);
                intent.putExtra("namaBangunDatar", namaBangunDatar);
                intent.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                intent.putExtra("descBangunDatar", descBangunDatar);
                intent.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                intent.putExtra("luasBangunDatar", luasBangunDatar);
                intent.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(intent);
            }
        });

    }

    public void HitungKllPersegi(View view){
        sisi = Double.parseDouble(editSisiPersegi.getText().toString());
        kllPersegi = sisi * 4;

        textKllPersegi.setText(String.valueOf(kllPersegi));

    }
    public void HitungLuasPersegi(View view){
        sisi = Double.parseDouble(editSisiPersegi.getText().toString());
        luasPersegi = sisi * sisi;

        textLuasPersegi.setText(String.valueOf(luasPersegi));

    }


}

