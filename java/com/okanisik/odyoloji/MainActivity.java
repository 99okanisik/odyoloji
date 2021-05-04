package com.okanisik.odyoloji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.startapp.sdk.adsbase.StartAppAd;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        StartAppAd.disableSplash();


        CardView sorular = findViewById(R.id.cardviewA);
        // Set a click listener on that View
        sorular.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, SoruEkraniActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });








        CardView sozluk = findViewById(R.id.cardviewB);
        // Set a click listener on that View
        sozluk.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, SozlukActivity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MainActivity.this);
            }
        });






        CardView gorseller = findViewById(R.id.cardviewC);
        // Set a click listener on that View
        gorseller.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, GorsellerActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });


        CardView ayarlar = findViewById(R.id.cardviewCC);
        // Set a click listener on that View
        ayarlar.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, AyarlarActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });



        CardView hapbilgi = findViewById(R.id.cardviewD);
        // Set a click listener on that View
        hapbilgi.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, HapbilgiActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });


        CardView iletisimm = findViewById(R.id.cardviewDD);
        // Set a click listener on that View
        iletisimm.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, iletisimActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });


    }
}