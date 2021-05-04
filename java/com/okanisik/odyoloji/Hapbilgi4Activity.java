package com.okanisik.odyoloji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.startapp.sdk.adsbase.StartAppAd;

public class Hapbilgi4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hapbilgi4);

        StartAppAd.disableSplash();

        CardView iletimtipii = findViewById(R.id.iletimtipi);
        // Set a click listener on that View
        iletimtipii.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Hapbilgi4Activity.this, iletimtipiisitmekaybiActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });








        CardView sensorinoraltips = findViewById(R.id.sensorinoraltip);
        // Set a click listener on that View
        sensorinoraltips.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Hapbilgi4Activity.this, SensorinoraltipisitmekaybiActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });



        CardView miksttipp = findViewById(R.id.miksttip);
        // Set a click listener on that View
        miksttipp.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Hapbilgi4Activity.this, MiksttipisitmeActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });




        CardView aniisitme1 = findViewById(R.id.aniisitme);
        // Set a click listener on that View
        aniisitme1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Hapbilgi4Activity.this, AniisitmekaybiActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });




    }









}