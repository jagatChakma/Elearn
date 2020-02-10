package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class ElearnBanjonbornomala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearn_banjonbornomala);
    }

    public void didTapButton1(View view) {

        MediaPlayer bn1=MediaPlayer.create(getApplicationContext(),R.raw.sndc1);

        Button button = (Button)findViewById(R.id.bgn1);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn1.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton2(View view) {

        MediaPlayer bn2=MediaPlayer.create(getApplicationContext(),R.raw.sndc2);

        Button button = (Button)findViewById(R.id.bgn2);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn2.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton3(View view) {

        MediaPlayer bn3=MediaPlayer.create(getApplicationContext(),R.raw.sndc3);

        Button button = (Button)findViewById(R.id.bgn3);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn3.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton4(View view) {

        MediaPlayer bn4=MediaPlayer.create(getApplicationContext(),R.raw.sndc4);

        Button button = (Button)findViewById(R.id.bgn4);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn4.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton5(View view) {

        MediaPlayer bn5=MediaPlayer.create(getApplicationContext(),R.raw.sndc5);

        Button button = (Button)findViewById(R.id.bgn5);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn5.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton6(View view) {

        MediaPlayer bn6=MediaPlayer.create(getApplicationContext(),R.raw.sndc6);

        Button button = (Button)findViewById(R.id.bgn6);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn6.start();
        button.startAnimation(myAnim);

    }

    public void didTapButton7(View view) {
        MediaPlayer bn7=MediaPlayer.create(getApplicationContext(),R.raw.sndc7);

        Button button = (Button)findViewById(R.id.bgn7);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn7.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton8(View view) {

        MediaPlayer bn8=MediaPlayer.create(getApplicationContext(),R.raw.sndc8);

        Button button = (Button)findViewById(R.id.bgn8);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn8.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton9(View view) {

        MediaPlayer bn9=MediaPlayer.create(getApplicationContext(),R.raw.sndc9);

        Button button = (Button)findViewById(R.id.bgn9);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn9.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton10(View view) {

        MediaPlayer bn10=MediaPlayer.create(getApplicationContext(),R.raw.sndc10);

        Button button = (Button)findViewById(R.id.bgn10);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn10.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton11(View view) {

        MediaPlayer bn11=MediaPlayer.create(getApplicationContext(),R.raw.sndc11);

        Button button = (Button)findViewById(R.id.bgn11);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn11.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton12(View view) {
        MediaPlayer bn12=MediaPlayer.create(getApplicationContext(),R.raw.sndc12);

        Button button = (Button)findViewById(R.id.bgn12);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn12.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton13(View view) {

        MediaPlayer bn13=MediaPlayer.create(getApplicationContext(),R.raw.sndc13);

        Button button = (Button)findViewById(R.id.bgn13);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn13.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton14(View view) {

        MediaPlayer bn14=MediaPlayer.create(getApplicationContext(),R.raw.sndc14);

        Button button = (Button)findViewById(R.id.bgn14);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn14.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton15(View view) {

        MediaPlayer bn15=MediaPlayer.create(getApplicationContext(),R.raw.sndc15);

        Button button = (Button)findViewById(R.id.bgn15);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn15.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton16(View view) {

        MediaPlayer bn16=MediaPlayer.create(getApplicationContext(),R.raw.sndc16);

        Button button = (Button)findViewById(R.id.bgn16);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn16.start();
        button.startAnimation(myAnim);
    }


    public void didTapButton17(View view) {

        MediaPlayer bn17=MediaPlayer.create(getApplicationContext(),R.raw.sndc17);

        Button button = (Button)findViewById(R.id.bgn17);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn17.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton18(View view) {
        MediaPlayer bn18=MediaPlayer.create(getApplicationContext(),R.raw.sndc18);

        Button button = (Button)findViewById(R.id.bgn18);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn18.start();
        button.startAnimation(myAnim);

    }

    public void didTapButton19(View view) {

        MediaPlayer bn19=MediaPlayer.create(getApplicationContext(),R.raw.sndc19);

        Button button = (Button)findViewById(R.id.bgn19);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn19.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton20(View view) {

        MediaPlayer bn20=MediaPlayer.create(getApplicationContext(),R.raw.sndc20);

        Button button = (Button)findViewById(R.id.bgn20);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn20.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton21(View view) {
        MediaPlayer bn21=MediaPlayer.create(getApplicationContext(),R.raw.sndc21);

        Button button = (Button)findViewById(R.id.bgn21);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn21.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton22(View view) {

        MediaPlayer bn22=MediaPlayer.create(getApplicationContext(),R.raw.sndc22);

        Button button = (Button)findViewById(R.id.bgn22);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn22.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton23(View view) {

        MediaPlayer bn23=MediaPlayer.create(getApplicationContext(),R.raw.sndc23);

        Button button = (Button)findViewById(R.id.bgn23);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn23.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton24(View view) {

        MediaPlayer bn24=MediaPlayer.create(getApplicationContext(),R.raw.sndc24);

        Button button = (Button)findViewById(R.id.bgn24);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn24.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton25(View view) {

        MediaPlayer bn25=MediaPlayer.create(getApplicationContext(),R.raw.sndc25);

        Button button = (Button)findViewById(R.id.bgn25);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn25.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton26(View view) {

        MediaPlayer bn26=MediaPlayer.create(getApplicationContext(),R.raw.sndc26);

        Button button = (Button)findViewById(R.id.bgn26);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn26.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton27(View view) {

        MediaPlayer bn27=MediaPlayer.create(getApplicationContext(),R.raw.sndc27);

        Button button = (Button)findViewById(R.id.bgn27);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn27.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton28(View view) {

        MediaPlayer bn28=MediaPlayer.create(getApplicationContext(),R.raw.sndc28);

        Button button = (Button)findViewById(R.id.bgn28);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn28.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton29(View view) {

        MediaPlayer bn29=MediaPlayer.create(getApplicationContext(),R.raw.sndc29);

        Button button = (Button)findViewById(R.id.bgn29);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn29.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton30(View view) {

        MediaPlayer bn30=MediaPlayer.create(getApplicationContext(),R.raw.sndc30);

        Button button = (Button)findViewById(R.id.bgn30);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn30.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton31(View view) {

        MediaPlayer bn31=MediaPlayer.create(getApplicationContext(),R.raw.sndc31);

        Button button = (Button)findViewById(R.id.bgn31);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn31.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton32(View view) {

        MediaPlayer bn32=MediaPlayer.create(getApplicationContext(),R.raw.sndc32);
        bn32.start();
        Button button = (Button)findViewById(R.id.bgn32);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
    }


    public void didTapButton33(View view) {

        MediaPlayer bn33=MediaPlayer.create(getApplicationContext(),R.raw.sndc33);

        Button button = (Button)findViewById(R.id.bgn33);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn33.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton34(View view) {

        MediaPlayer bn34=MediaPlayer.create(getApplicationContext(),R.raw.sndc34);

        Button button = (Button)findViewById(R.id.bgn34);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn34.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton35(View view) {

        MediaPlayer bn35=MediaPlayer.create(getApplicationContext(),R.raw.sndc35);

        Button button = (Button)findViewById(R.id.bgn35);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn35.start();
        button.startAnimation(myAnim);
    }

    public void didTapButton36(View view) {

        MediaPlayer bn36=MediaPlayer.create(getApplicationContext(),R.raw.sndc36);

        Button button = (Button)findViewById(R.id.bgn36);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn36.start();
        button.startAnimation(myAnim);
    }


    public void didTapButton37(View view) {


        MediaPlayer bn37=MediaPlayer.create(getApplicationContext(),R.raw.sndc37);

        Button button = (Button)findViewById(R.id.bgn37);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn37.start();
        button.startAnimation(myAnim);
    }



    public void didTapButton38(View view) {

        MediaPlayer bn38=MediaPlayer.create(getApplicationContext(),R.raw.sndc38);

        Button button = (Button)findViewById(R.id.bgn38);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn38.start();
        button.startAnimation(myAnim);
    }


    public void didTapButton39(View view) {

        MediaPlayer bn39=MediaPlayer.create(getApplicationContext(),R.raw.sndc39);

        Button button = (Button)findViewById(R.id.bgn39);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        bn39.start();
        button.startAnimation(myAnim);
    }

}
