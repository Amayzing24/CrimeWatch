package com.ezlaw.crimewatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class PersonType extends AppCompatActivity {

    Button continueButton;
    RadioButton policeOpt;
    RadioButton civilianOpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_type);

        continueButton = findViewById(R.id.continueToReg);
        policeOpt = findViewById(R.id.policeOption);
        civilianOpt = findViewById(R.id.civilianOption);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (policeOpt.isChecked())
                {

                }
                else
                {
                    startActivity(new Intent(PersonType.this, Register.class));
                }
            }
        });
    }
}
