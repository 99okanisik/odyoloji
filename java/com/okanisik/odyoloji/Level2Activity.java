package com.okanisik.odyoloji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.startapp.sdk.adsbase.StartAppAd;

public class Level2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_level2);

        StartAppAd.disableSplash();


        CardView fizyolojibir = findViewById(R.id.fizyolojibir);
        // Set a click listener on that View
        fizyolojibir.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Level2Activity.this, isitmesistemifizyolojibir.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });




        CardView fizyolojiiki = findViewById(R.id.fizyolojiiki);
        // Set a click listener on that View
        fizyolojiiki.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Level2Activity.this, isitmesistemifizyolojiiki.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });





        CardView fizyolojiuc = findViewById(R.id.fizyolojiuc);
        // Set a click listener on that View
        fizyolojiuc.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Level2Activity.this, isitmesistemifizyolojiuc.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });



    }
}