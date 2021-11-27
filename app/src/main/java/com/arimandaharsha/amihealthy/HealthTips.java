package com.arimandaharsha.amihealthy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class HealthTips extends AppCompatActivity {

    CardView weightloss;
    CardView weightgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tips);

        weightloss = (CardView) findViewById(R.id.weightlosscard);
        weightgain = (CardView) findViewById(R.id.weightgaincard);

        weightloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=weight+loss+tips")));
            }
        });

        weightgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=weight+gain+tips")));
            }
        });


    }
}