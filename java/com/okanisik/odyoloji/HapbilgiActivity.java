package com.okanisik.odyoloji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.startapp.sdk.adsbase.StartAppAd;

public class HapbilgiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hapbilgi);


        StartAppAd.disableSplash();

        CardView bolum1 = findViewById(R.id.bolum_1);
        // Set a click listener on that View
        bolum1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(HapbilgiActivity.this, Hapbilgi1Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });

        CardView bolum2 = findViewById(R.id.bolum_2);
        // Set a click listener on that View
        bolum2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(HapbilgiActivity.this, Hapbilgi2Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });


        CardView bolum3 = findViewById(R.id.bolum_3);
        // Set a click listener on that View
        bolum3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(HapbilgiActivity.this, Hapbilgi3Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });




        CardView bolum4 = findViewById(R.id.bolum_4);
        // Set a click listener on that View
        bolum4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(HapbilgiActivity.this, Hapbilgi4Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });




        CardView bolum5 = findViewById(R.id.bolum_5);
        // Set a click listener on that View
        bolum5.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(HapbilgiActivity.this, Hapbilgi5Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });


        CardView bolum6 = findViewById(R.id.bolum_6);
        // Set a click listener on that View
        bolum6.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(HapbilgiActivity.this, MakaleActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });


    }
}