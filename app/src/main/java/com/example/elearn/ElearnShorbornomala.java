package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class ElearnShorbornomala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearn_shorbornomala);
    }

    public void didTapButton(View view) {

        MediaPlayer sr1=MediaPlayer.create(getApplicationContext(),R.raw.sndv1);

        Button button = (Button)findViewById(R.id.button);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
         sr1.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton2(View view) {
        MediaPlayer sr2=MediaPlayer.create(getApplicationContext(),R.raw.sndv2);

        Button button2 = (Button)findViewById(R.id.button2);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        sr2.start();
        button2.startAnimation(myAnim);
    }

    public void didTapButton11(View view) {

        MediaPlayer sr11=MediaPlayer.create(getApplicationContext(),R.raw.sndv11);


        Button button11 = (Button)findViewById(R.id.button11);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        sr11.start();
        button11.startAnimation(myAnim);
    }

    public void didTapButton10(View view) {


        MediaPlayer sr10=MediaPlayer.create(getApplicationContext(),R.raw.sndv10);


        Button button10 = (Button)findViewById(R.id.button10);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        sr10.start();
        button10.startAnimation(myAnim);
    }

    public void didTapButton9(View view) {

        MediaPlayer sr9=MediaPlayer.create(getApplicationContext(),R.raw.sndv9);


        Button button9 = (Button)findViewById(R.id.button9);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        sr9.start();
        button9.startAnimation(myAnim);
    }

    public void didTapButton8(View view) {

        MediaPlayer sr8=MediaPlayer.create(getApplicationContext(),R.raw.sndv8);


        Button button8 = (Button)findViewById(R.id.button8);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        sr8.start();
        button8.startAnimation(myAnim);

    }

    public void didTapButton7(View view) {

        MediaPlayer sr7=MediaPlayer.create(getApplicationContext(),R.raw.sndv7);


        Button button7 = (Button)findViewById(R.id.button7);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        sr7.start();
        button7.startAnimation(myAnim);
    }

    public void didTapButton6(View view) {

        MediaPlayer sr6=MediaPlayer.create(getApplicationContext(),R.raw.sndv6);


        Button button6 = (Button)findViewById(R.id.button6);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        sr6.start();
        button6.startAnimation(myAnim);
    }

    public void didTapButton5(View view) {

        MediaPlayer sr5=MediaPlayer.create(getApplicationContext(),R.raw.sndv5);


        Button button5 = (Button)findViewById(R.id.button5);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        sr5.start();
        button5.startAnimation(myAnim);
    }

    public void didTapButton4(View view) {
        MediaPlayer sr4=MediaPlayer.create(getApplicationContext(),R.raw.sndv4);



        Button button4 = (Button)findViewById(R.id.button4);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        sr4.start();
        button4.startAnimation(myAnim);
    }

    public void didTapButton3(View view) {

        MediaPlayer sr3=MediaPlayer.create(getApplicationContext(),R.raw.sndv3);


        Button button3 = (Button)findViewById(R.id.button3);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        sr3.start();
        button3.startAnimation(myAnim);

    }
}
