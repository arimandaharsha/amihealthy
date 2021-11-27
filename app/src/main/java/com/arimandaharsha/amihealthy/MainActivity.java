package com.arimandaharsha.amihealthy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView tips;
    CardView bmi;
    CardView bfp;
    CardView donate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tips = (CardView) findViewById(R.id.tipscard);
        bmi = (CardView) findViewById(R.id.bmicardcard);
        bfp = (CardView) findViewById(R.id.bfpcard);
        donate = (CardView) findViewById(R.id.donatecard);

        //on click listener for tips card
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tips = new Intent(MainActivity.this, HealthTips.class);
                startActivity(tips);
            }
        });

        //on click listener for bmi card
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tips = new Intent(MainActivity.this, BMI.class);
                startActivity(tips);
            }
        });

        //on click listener for bfp card
        bfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tips = new Intent(MainActivity.this, BFP.class);
                startActivity(tips);
            }
        });

        //on click listener for donation card
        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://help.unicef.org/in/everychildalive")));
            }
        });

    }
}