package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import static android.view.View.*;

public class MainActivity extends AppCompatActivity {
    EditText input1, input2;
    Button add, sub, mul, div, clear, submit;
    TextView tv;
    int n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = (EditText) findViewById(R.id.num1);
        input2 = (EditText) findViewById(R.id.num2);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        clear = (Button) findViewById(R.id.clearBtn);
        tv = (TextView) findViewById(R.id.output);
        add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(input1.getText().toString());
                n2 = Integer.parseInt(input2.getText().toString());
                int output = n1 + n2;
                tv.setText("OUTPUT: " + output);
            }
        });
        sub.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(input1.getText().toString());
                n2 = Integer.parseInt(input2.getText().toString());
                int output = n1 - n2;
                tv.setText("OUTPUT: " + output);
            }
        });
        mul.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(input1.getText().toString());
                n2 = Integer.parseInt(input2.getText().toString());
                float output = n1 * n2;
                tv.setText("OUTPUT: " + output);
            }
        });
        div.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(input1.getText().toString());
                n2 = Integer.parseInt(input2.getText().toString());
                float output = (float) n1 / n2;
                tv.setText("OUTPUT: " + output);
            }
        });
        clear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.setText("");
                input2.setText("");
            }
        });
    }
}
