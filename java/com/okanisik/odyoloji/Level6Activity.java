package com.okanisik.odyoloji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.startapp.sdk.adsbase.StartAppAd;

public class Level6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_level6);

        StartAppAd.disableSplash();




        CardView seviyebir = findViewById(R.id.dilvekonusma1);
        // Set a click listener on that View
        seviyebir.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Level6Activity.this, dilvekonusma1Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });


    }
}