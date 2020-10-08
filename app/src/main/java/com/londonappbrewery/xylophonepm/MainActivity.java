package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool msound;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
msound = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,1);

        // TODO: Load and get the IDs to identify the sounds
mCSoundId = msound.load(getApplicationContext(),R.raw.note1_c,0);
mDSoundId = msound.load(getApplicationContext(),R.raw.note2_d,0);
mESoundId = msound.load(getApplicationContext(),R.raw.note3_e,0);
mFSoundId = msound.load(getApplicationContext(),R.raw.note4_f,0);
mGSoundId = msound.load(getApplicationContext(),R.raw.note5_g,0);
mASoundId = msound.load(getApplicationContext(),R.raw.note6_a,0);
mBSoundId = msound.load(getApplicationContext(),R.raw.note7_b,0);
    }

    // TODO: Add the play methods triggered by the buttons

public void Playc(View v){
        msound.play(mCSoundId,1.0f,1.0f,0,0,1.0f);
}
    public void Playd(View v){
        msound.play(mDSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void Playe(View v){
        msound.play(mESoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void Playf(View v){
        msound.play(mFSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void Playg(View v){
        msound.play(mGSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void Playa(View v){
        msound.play(mASoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void Playb(View v){
        msound.play(mBSoundId,1.0f,1.0f,0,0,1.0f);
    }
}
