package com.okanisik.odyoloji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.startapp.sdk.adsbase.StartAppAd;

public class Hapbilgi1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hapbilgi1);

        StartAppAd.disableSplash();


        CardView yenidoganisitme = findViewById(R.id.yenidoganisitme);
        // Set a click listener on that View
        yenidoganisitme.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Hapbilgi1Activity.this, YenidoganisitmeActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });


        CardView okulcagıisitme = findViewById(R.id.okulcagıisitme);
        // Set a click listener on that View
        okulcagıisitme.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Hapbilgi1Activity.this, OkulcagiisitmeActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });




    }
}