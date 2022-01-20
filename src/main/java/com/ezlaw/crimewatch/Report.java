package com.ezlaw.crimewatch;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Report extends AppCompatActivity {

    Button confirmButton;
    RadioButton currLoc;
    RadioButton otherLoc;
    EditText otherAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        confirmButton = findViewById(R.id.confirmButton);
        currLoc = findViewById(R.id.currLoc);
        otherLoc = findViewById(R.id.otherLoc);
        otherAddress = findViewById(R.id.otherAddress);

        otherAddress.setVisibility(View.GONE);

        otherLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                otherAddress.setVisibility(View.VISIBLE);
            }
        });

        currLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                otherAddress.setVisibility(View.GONE);
            }
        });

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }





}
