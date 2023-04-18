package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        tv = (TextView) findViewById(R.id.outputText);
        Intent intent = getIntent();
        String fName = intent.getStringExtra("vFName");
        String lName = intent.getStringExtra("vLName");
        tv.setText("Your name is : " + fName + " " + lName);
    }
}