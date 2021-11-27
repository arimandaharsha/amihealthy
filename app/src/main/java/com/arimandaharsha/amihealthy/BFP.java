package com.arimandaharsha.amihealthy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BFP extends AppCompatActivity {

    EditText bmival,ageval;
    RadioGroup gender;
    double bmi,age,bfp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfp);

        bmival = (EditText) findViewById(R.id.enterbmi);
        ageval = (EditText) findViewById(R.id.enterage);
        gender = (RadioGroup) findViewById(R.id.gender);
        CardView bfpButton = (CardView) findViewById(R.id.bfpcalcard);
        TextView bfptext = (TextView) findViewById(R.id.bfpValue);


        bfpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = gender.getCheckedRadioButtonId();
                RadioButton genderselected = (RadioButton) findViewById(selectedId);
                String sbmi = bmival.getText().toString();
                String sage = ageval.getText().toString();

                if(selectedId == -1 || sbmi.isEmpty() || sage.isEmpty()){
                    Toast.makeText(BFP.this,"Please Enter All Values", Toast.LENGTH_SHORT).show();
                }
                else if(selectedId == 0){
                    bmi = Double.parseDouble(sbmi);
                    age = Double.parseDouble(sage);
                    bfp = (1.39*bmi)+(0.16*age)-(10.34*0)-9;
                    bfptext.setText(Double.toString(bfp));
                }
                else{
                    bmi = Double.parseDouble(sbmi);
                    age = Double.parseDouble(sage);
                    bfp = (1.39*bmi)+(0.16*age)-(10.34*1)-9;
                    bfptext.setText(Double.toString(bfp));
                }

            }
        });

    }
}