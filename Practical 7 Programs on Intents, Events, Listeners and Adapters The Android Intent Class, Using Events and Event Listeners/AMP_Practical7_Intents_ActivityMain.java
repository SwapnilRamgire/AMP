package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText fName, lName;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fName = (EditText) findViewById(R.id.fn);
        lName = (EditText) findViewById(R.id.ln);
        submitBtn = (Button) findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        ViewActivity.class);
                i.putExtra("vFName", fName.getText().toString());
                i.putExtra("vLName", lName.getText().toString());
                startActivity(i);
            }
        });
    }
}
