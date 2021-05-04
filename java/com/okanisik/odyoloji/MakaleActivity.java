package com.okanisik.odyoloji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.startapp.sdk.adsbase.StartAppAd;

public class MakaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_makale);

        StartAppAd.disableSplash();


        CardView bolum1 = findViewById(R.id.bolum_1);
        // Set a click listener on that View
        bolum1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale1Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });

        CardView bolum2 = findViewById(R.id.bolum_2);
        // Set a click listener on that View
        bolum2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale2Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });


        CardView bolum3 = findViewById(R.id.bolum_3);
        // Set a click listener on that View
        bolum3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale3Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });




        CardView bolum4 = findViewById(R.id.bolum_4);
        // Set a click listener on that View
        bolum4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale4Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });




        CardView bolum5 = findViewById(R.id.bolum_5);
        // Set a click listener on that View
        bolum5.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale5Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });


        CardView bolum6 = findViewById(R.id.bolum_6);
        // Set a click listener on that View
        bolum6.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale6Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });


        CardView bolum7 = findViewById(R.id.bolum_7);
        // Set a click listener on that View
        bolum7.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale7Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });




        CardView bolum8 = findViewById(R.id.bolum_8);
        // Set a click listener on that View
        bolum8.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale8Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });



        CardView bolum9 = findViewById(R.id.bolum_9);
        // Set a click listener on that View
        bolum9.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale9Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });



        CardView bolum10 = findViewById(R.id.bolum_10);
        // Set a click listener on that View
        bolum10.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale10Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });



        CardView bolum11 = findViewById(R.id.bolum_11);
        // Set a click listener on that View
        bolum11.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale11Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });



        CardView bolum12 = findViewById(R.id.bolum_12);
        // Set a click listener on that View
        bolum12.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, MakaleonikiActivity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });



        CardView bolum13 = findViewById(R.id.bolum_13);
        // Set a click listener on that View
        bolum13.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale13Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });


        CardView bolum14 = findViewById(R.id.bolum_14);
        // Set a click listener on that View
        bolum14.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale14Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });



        CardView bolum15 = findViewById(R.id.bolum_15);
        // Set a click listener on that View
        bolum15.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale15Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });



        CardView bolum16 = findViewById(R.id.bolum_16);
        // Set a click listener on that View
        bolum16.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale16Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });




        CardView bolum17 = findViewById(R.id.bolum_17);
        // Set a click listener on that View
        bolum17.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale17Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });


        CardView bolum18 = findViewById(R.id.bolum_18);
        // Set a click listener on that View
        bolum18.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale18Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });





        CardView bolum19 = findViewById(R.id.bolum_19);
        // Set a click listener on that View
        bolum19.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale19Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });



        CardView bolum20 = findViewById(R.id.bolum_20);
        // Set a click listener on that View
        bolum20.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MakaleActivity.this, Makale20Activity.class);
                // Start the new activity
                startActivity(playIntent);
                StartAppAd.showAd(MakaleActivity.this);
            }
        });




    }
}