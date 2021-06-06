package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView NumDisp;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumDisp = (TextView) findViewById(R.id.NumDisp);
    }


    public void AddbyOne(View view) {
        //counter = 0;
        counter++;

        NumDisp.setText(Integer.toString(counter));

    }

    public void DecreasebyOne(View view) {
        //counter = 0;
        counter--;

        NumDisp.setText(Integer.toString(counter));
    }
}