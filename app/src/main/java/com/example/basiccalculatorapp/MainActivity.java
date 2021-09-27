package com.example.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void clickFunctionAdd(View view) {

        //Log.i("Info","Button pressed");
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(),Toast.LENGTH_LONG).show();
        String str1 = input1.getText().toString();
        Integer int1 = Integer.parseInt(str1);
        String str2 = input2.getText().toString();
        Integer int2 = Integer.parseInt(str2);
        goToActivity2(int1+int2);
    }
    public void clickFunctionMinus(View view) {

        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        String str1 = input1.getText().toString();
        Integer int1 = Integer.parseInt(str1);
        String str2 = input2.getText().toString();
        Integer int2 = Integer.parseInt(str2);
        goToActivity2(int1-int2);
    }
    public void clickFunctionMultiply(View view) {

        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        String str1 = input1.getText().toString();
        Integer int1 = Integer.parseInt(str1);
        String str2 = input2.getText().toString();
        Integer int2 = Integer.parseInt(str2);
        goToActivity2(int1*int2);
    }
    public void clickFunctionDivide(View view) {

        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        String str1 = input1.getText().toString();
        Integer int1 = Integer.parseInt(str1);
        String str2 = input2.getText().toString();
        Integer int2 = Integer.parseInt(str2);
        goToActivity2(int1/int2);
    }
    public void goToActivity2(int s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}