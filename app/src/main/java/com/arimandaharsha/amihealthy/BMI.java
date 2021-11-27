package com.arimandaharsha.amihealthy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMI extends AppCompatActivity {

    EditText ft,in,kg;
    double feet,inch,kgs,height,bmiValue,feetinm,inchinm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        ft = (EditText) findViewById(R.id.heightfeet);
        in = (EditText) findViewById(R.id.heightinches);
        kg = (EditText) findViewById(R.id.weightkg);
        TextView bmitext = (TextView) findViewById(R.id.BmiValue);
        CardView bmiButton = (CardView) findViewById(R.id.bmicalccard);

        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        String sft = ft.getText().toString();
        String sin = in.getText().toString();
        String skg = kg.getText().toString();

        if (sft.isEmpty() || sin.isEmpty() || skg.isEmpty()) {

            Toast.makeText(BMI.this,"Please Enter All Values", Toast.LENGTH_SHORT).show();

        } else {
            feet = Double.parseDouble(sft);
            inch = Double.parseDouble(sin);
            kgs = Double.parseDouble(skg);

            feetinm = feet *  0.3048;
            inchinm = inch * 0.0254;

            height = feetinm + inchinm;

            bmiValue = kgs/(height*height);

            bmitext.setText(Double.toString(bmiValue));

        }

            }
        });

    }
}