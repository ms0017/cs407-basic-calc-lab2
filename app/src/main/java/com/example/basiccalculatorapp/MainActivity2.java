package com.example.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView result = (TextView) findViewById((R.id.result));
        Intent intent = getIntent();
        Integer str = intent.getIntExtra("message", 0);
        result.setText(str.toString());
    }
}