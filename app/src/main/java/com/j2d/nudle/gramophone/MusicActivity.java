package com.j2d.nudle.gramophone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_music);

        Music music  = (Music) getIntent().getSerializableExtra("MUSIC");
        getSupportActionBar().setTitle(music.title);

    }
}
