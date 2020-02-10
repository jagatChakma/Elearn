package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class ElearnConsonant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearn_consonant);
    }

    public void didTapButton(View view) {

        MediaPlayer c1=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_b);

        Button button1 = (Button)findViewById(R.id.button1);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c1.start();
        button1.startAnimation(myAnim);
    }

    public void didTapButton2(View view) {

        MediaPlayer c2=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_c);

        Button button2 = (Button)findViewById(R.id.button2);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c2.start();
        button2.startAnimation(myAnim);
    }

    public void didTapButton3(View view) {

        MediaPlayer c3=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_d);

        Button button3 = (Button)findViewById(R.id.button3);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c3.start();
        button3.startAnimation(myAnim);
    }

    public void didTapButton4(View view) {
        MediaPlayer c4=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_f);

        Button button4 = (Button)findViewById(R.id.button4);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c4.start();
        button4.startAnimation(myAnim);
    }

    public void didTapButton5(View view) {

        MediaPlayer c5=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_g);

        Button button5 = (Button)findViewById(R.id.button5);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c5.start();
        button5.startAnimation(myAnim);
    }

    public void didTapButton6(View view) {

        MediaPlayer c6=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_h);

        Button button6 = (Button)findViewById(R.id.button6);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c6.start();
        button6.startAnimation(myAnim);
    }

    public void didTapButton7(View view) {
        MediaPlayer c7=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_j);

        Button button7 = (Button)findViewById(R.id.button7);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c7.start();
        button7.startAnimation(myAnim);

    }

    public void didTapButton8(View view) {

        MediaPlayer c8=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_k);

        Button button8 = (Button)findViewById(R.id.button8);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c8.start();
        button8.startAnimation(myAnim);
    }

    public void didTapButton9(View view) {

        MediaPlayer c9=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_l);

        Button button9 = (Button)findViewById(R.id.button9);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c9.start();
        button9.startAnimation(myAnim);
    }

    public void didTapButton10(View view) {

        MediaPlayer c10=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_m);

        Button button10 = (Button)findViewById(R.id.button10);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c10.start();
        button10.startAnimation(myAnim);
    }

    public void didTapButton11(View view) {

        MediaPlayer c11=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_n);

        Button button11 = (Button)findViewById(R.id.button11);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c11.start();
        button11.startAnimation(myAnim);
    }

    public void didTapButton12(View view) {

        MediaPlayer c12=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_p);

        Button button12 = (Button)findViewById(R.id.button12);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c12.start();
        button12.startAnimation(myAnim);
    }

    public void didTapButton13(View view) {

        MediaPlayer c13=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_q);

        Button button13 = (Button)findViewById(R.id.button13);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c13.start();
        button13.startAnimation(myAnim);
    }

    public void didTapButton14(View view) {

        MediaPlayer c14=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_r);

        Button button14 = (Button)findViewById(R.id.button14);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c14.start();
        button14.startAnimation(myAnim);

    }

    public void didTapButton15(View view) {

        MediaPlayer c15=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_s);

        Button button15 = (Button)findViewById(R.id.button15);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c15.start();
        button15.startAnimation(myAnim);
    }

    public void didTapButton16(View view) {

        MediaPlayer c16=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_t);

        Button button16 = (Button)findViewById(R.id.button16);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c16.start();
        button16.startAnimation(myAnim);
    }

    public void didTapButton17(View view) {

        MediaPlayer c17=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_v);

        Button button17 = (Button)findViewById(R.id.button17);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c17.start();
        button17.startAnimation(myAnim);
    }

    public void didTapButton18(View view) {

        MediaPlayer c18=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_w);

        Button button18 = (Button)findViewById(R.id.button18);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c18.start();
        button18.startAnimation(myAnim);
    }

    public void didTapButton19(View view) {

        MediaPlayer c19=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_x);

        Button button19 = (Button)findViewById(R.id.button19);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c19.start();
        button19.startAnimation(myAnim);
    }

    public void didTapButton20(View view) {

        MediaPlayer c20=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_y);

        Button button20 = (Button)findViewById(R.id.button20);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c20.start();
        button20.startAnimation(myAnim);
    }

    public void didTapButton21(View view) {

        MediaPlayer c21=MediaPlayer.create(getApplicationContext(),R.raw.bng_mp3_z);

        Button button21 = (Button)findViewById(R.id.button21);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        c21.start();
        button21.startAnimation(myAnim);
    }
}
