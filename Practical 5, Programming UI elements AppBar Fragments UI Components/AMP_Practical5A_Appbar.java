package com.example.practical5;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
public class MainActivity extends AppCompatActivity {
TextView tw;
int count=0;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 Toolbar tbar = (Toolbar) findViewById(R.id.toolbar);
 setSupportActionBar(tbar);
 getSupportActionBar().setDisplayShowHomeEnabled(true);
 getSupportActionBar().setLogo(R.drawable.android);
 getSupportActionBar().setDisplayUseLogoEnabled(true);
 tw = (TextView) findViewById(R.id.textView);
 tbar.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 count++;
 tw.setText(" "+count);
 }
 });
 }
}