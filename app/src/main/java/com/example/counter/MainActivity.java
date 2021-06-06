package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView NumDisp;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AddbyOne(View view) {
        counter = 0;
        int disp = counter ++;

        NumDisp.setText(String.valueOf(disp));

    }

    public void DecreasebyOne(View view) {
        counter = 0;
        int disp = counter --;

        NumDisp.setText(String.valueOf(disp));
    }
}