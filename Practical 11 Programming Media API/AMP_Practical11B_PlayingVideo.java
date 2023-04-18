package com.example.practical11;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView v = (VideoView) findViewById(R.id.video);

        v.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vid));
        MediaController m = new MediaController(this);
        v.setMediaController(m);
        v.start();
    }
}