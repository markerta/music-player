package com.example.android.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.media.ToneGenerator.MAX_VOLUME;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.audio_file);
    }

    public void playMusic (View v) {
        mediaPlayer.start();
    }
    public void pauseMusic (View v) {
        mediaPlayer.pause();
    }

    public void upMusic (View v) {
        mediaPlayer.setVolume(1.0f, 1.0f);
    }

    public void downMusic (View v) {
        mediaPlayer.setVolume(0.0f, 0.0f);
    }

}
