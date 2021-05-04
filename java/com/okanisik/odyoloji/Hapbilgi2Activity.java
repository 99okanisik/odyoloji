package com.okanisik.odyoloji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.startapp.sdk.adsbase.StartAppAd;

public class Hapbilgi2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hapbilgi2);

        StartAppAd.disableSplash();

        CardView abr = findViewById(R.id.abr);
        // Set a click listener on that View
        abr.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Hapbilgi2Activity.this, AbrActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });




        CardView saffses = findViewById(R.id.safses);
        // Set a click listener on that View
        saffses.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Hapbilgi2Activity.this, SafsesodyometriActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });







        CardView timpanometrii = findViewById(R.id.timpanometri);
        // Set a click listener on that View
        timpanometrii.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Hapbilgi2Activity.this, TimpanometriActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });





        CardView assrr1 = findViewById(R.id.assr);
        // Set a click listener on that View
        assrr1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Hapbilgi2Activity.this, AssrActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });






        CardView vestibulervemps = findViewById(R.id.vestibulervemp);
        // Set a click listener on that View
        vestibulervemps.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Hapbilgi2Activity.this, VempActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });


    }
}



