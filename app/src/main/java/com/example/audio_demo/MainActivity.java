package com.example.audio_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer sampleMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sampleMusic = MediaPlayer.create(this,R.raw.sample);
    }
    public void playMusic (View v){
        sampleMusic.start();
    }

    public void pauseMusic (View v){
        if(sampleMusic.isPlaying()){
            sampleMusic.pause();
        }
    }
}
