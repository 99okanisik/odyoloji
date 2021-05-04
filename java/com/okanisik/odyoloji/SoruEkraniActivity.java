package com.okanisik.odyoloji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.startapp.sdk.adsbase.StartAppAd;

public class SoruEkraniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_soru_ekrani);

        StartAppAd.disableSplash();


        CardView level1 = findViewById(R.id.cardviewA);
        // Set a click listener on that View
        level1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(SoruEkraniActivity.this, Level1Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });





        CardView level2 = findViewById(R.id.cardviewB);
        // Set a click listener on that View
        level2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(SoruEkraniActivity.this, Level2Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });






        CardView level3 = findViewById(R.id.cardviewC);
        // Set a click listener on that View
        level3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(SoruEkraniActivity.this, Level3Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });







        CardView level4 = findViewById(R.id.cardviewD);
        // Set a click listener on that View
        level4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(SoruEkraniActivity.this, Level4Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });







        CardView level5 = findViewById(R.id.cardviewE);
        // Set a click listener on that View
        level5.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(SoruEkraniActivity.this, Level5Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });





        CardView level6 = findViewById(R.id.cardviewF);
        // Set a click listener on that View
        level6.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(SoruEkraniActivity.this, Level6Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });



        CardView level7 = findViewById(R.id.cardviewG);
        // Set a click listener on that View
        level7.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(SoruEkraniActivity.this, Level7Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });




    }
}