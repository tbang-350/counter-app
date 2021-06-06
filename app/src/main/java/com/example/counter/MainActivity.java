package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView NumDisp;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumDisp = (TextView) findViewById(R.id.NumDisp);
    }


    public void AddbyOne(View view) {
        count++;
        NumDisp.setText(Integer.toString(count));

    }

    public void DecreasebyOne(View view) {
        count--;
        NumDisp.setText(Integer.toString(count));
    }
}