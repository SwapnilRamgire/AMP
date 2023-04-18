package com.example.practical11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button start, pause, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.start);
        pause = (Button) findViewById(R.id.pause);
        stop = (Button) findViewById(R.id.stop);
        MediaPlayer ring = MediaPlayer.create(this, R.raw.relaxing);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ring.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ring.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ring.stop();
            }
        });
    }
}
