package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class ElearnVowel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearn_vowel);
    }



    public void didTapButton(View view) {

        MediaPlayer v1=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_a);

        Button button1 = (Button)findViewById(R.id.button1);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        v1.start();
        button1.startAnimation(myAnim);
    }

    public void didTapButton2(View view) {

        MediaPlayer v2=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_e);

        Button button2 = (Button)findViewById(R.id.button2);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        v2.start();
        button2.startAnimation(myAnim);
    }

    public void didTapButton3(View view) {

        MediaPlayer v3=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_i);

        Button button3 = (Button)findViewById(R.id.button3);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        v3.start();
        button3.startAnimation(myAnim);
    }

    public void didTapButton4(View view) {

        MediaPlayer v4=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_o);

        Button button4 = (Button)findViewById(R.id.button4);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        v4.start();
        button4.startAnimation(myAnim);

    }

    public void didTapButton5(View view) {

        MediaPlayer v5=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_u);

        Button button5 = (Button)findViewById(R.id.button5);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        v5.start();
        button5.startAnimation(myAnim);

    }
}
