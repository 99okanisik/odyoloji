package com.okanisik.odyoloji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.startapp.sdk.adsbase.StartAppAd;

public class GorsellerActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_gorseller);


        StartAppAd.disableSplash();




        CardView gorseller11 = findViewById(R.id.gorseller1);
        // Set a click listener on that View
        gorseller11.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(GorsellerActivity.this, Gorsel1Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });


        CardView gorseller22 = findViewById(R.id.gorseller2);
        // Set a click listener on that View
       gorseller22.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(GorsellerActivity.this, Gorsel2Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });



        CardView gorseller33 = findViewById(R.id.gorseller3);
        // Set a click listener on that View
        gorseller33.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(GorsellerActivity.this, Gorsel3Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });



        CardView gorseller44 = findViewById(R.id.gorseller4);
        // Set a click listener on that View
        gorseller44.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(GorsellerActivity.this, Gorsel4Activity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });


    }


}