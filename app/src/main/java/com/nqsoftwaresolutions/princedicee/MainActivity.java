package com.nqsoftwaresolutions.princedicee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    /**
     * This is comment
     */
    private final int NU_OF_STREAMS = 5;
    private final int SOURCE_QUALITY = 1;
    private final float LEFT_VOLUME = 1.0f;

    private final float RIGHT_VOLUME = 1.0f;
    private final int PRIORITY = 1;
    private final int NO_LOOP = 0;
    private final float SOUND_BIT_RATE = 1.0f;
    private SoundPool mSoundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollBtn = findViewById(R.id.id_btn_roll);
        final ImageView leftDiceImg = findViewById(R.id.id_img_dice_left);
        final ImageView rightDiceImg = findViewById(R.id.id_img_dice_right);
        //Todo Play sound when clicked on button
        mSoundPool = new SoundPool(NU_OF_STREAMS, AudioManager.STREAM_MUSIC,SOURCE_QUALITY);
        // ids of sounds
        int countTwo = mSoundPool.load(this,R.raw.two, PRIORITY);
        int countThree = mSoundPool.load(this,R.raw.three, PRIORITY);
        int countFour = mSoundPool.load(this,R.raw.four, PRIORITY);
        int countFive = mSoundPool.load(this,R.raw.five, PRIORITY);
        int countSix = mSoundPool.load(this,R.raw.six, PRIORITY);
        int countSeven = mSoundPool.load(this,R.raw.seven, PRIORITY);
        int countEight = mSoundPool.load(this,R.raw.eight, PRIORITY);
        int countNine = mSoundPool.load(this,R.raw.nine, PRIORITY);
        int countTen = mSoundPool.load(this,R.raw.ten, PRIORITY);
        int countEleven = mSoundPool.load(this,R.raw.elevan, PRIORITY);
        int countTwelve = mSoundPool.load(this,R.raw.twelive, PRIORITY);
        //Arrays of images
        final int[] diceArray = {
               R.drawable.dice1,
               R.drawable.dice2,
               R.drawable.dice3,
               R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollBtn.setOnClickListener(V ->{
            Random randomNumberGenerator = new Random();
            int randomNumber = randomNumberGenerator.nextInt(6);
            leftDiceImg.setImageResource(diceArray[randomNumber]);
            int randomNumber2 = randomNumberGenerator.nextInt(6);
            rightDiceImg.setImageResource(diceArray[randomNumber2]);
            int sum = randomNumber + randomNumber2 + 2;
            switch (sum){
                case 2:
                    mSoundPool.play(countTwo,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, SOUND_BIT_RATE);
                    break;
                case 3:
                    mSoundPool.play(countThree,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, SOUND_BIT_RATE);
                    break;
                case 4:
                    mSoundPool.play(countFour,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, SOUND_BIT_RATE);
                    break;
                case 5:
                    mSoundPool.play(countFive,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, SOUND_BIT_RATE);
                    break;
                case 6:
                    mSoundPool.play(countSix,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, SOUND_BIT_RATE);
                    break;
                case 7:
                    mSoundPool.play(countSeven,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, SOUND_BIT_RATE);
                    break;
                case 8:
                    mSoundPool.play(countEight,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, SOUND_BIT_RATE);
                    break;
                case 9:
                    mSoundPool.play(countNine,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, SOUND_BIT_RATE);
                    break;
                case 10:
                    mSoundPool.play(countTen,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, SOUND_BIT_RATE);
                    break;
                case 11:
                    mSoundPool.play(countEleven,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, SOUND_BIT_RATE);
                    break;
                case 12:
                    mSoundPool.play(countTwelve,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, SOUND_BIT_RATE);
                    break;
            }
        });

    }
}