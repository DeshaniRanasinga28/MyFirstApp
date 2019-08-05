package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMassageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_massage);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MASSAGE);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}
