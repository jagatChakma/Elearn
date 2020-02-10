package com.example.e_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcome_txt=findViewById(R.id.welcome_text);
        TextView welcome_txt2=findViewById(R.id.welcome_text2);
        ImageView welcome_img=findViewById(R.id.welcome_image);

        //lottieAnimationView=(LottieAnimationView)findViewById(R.id.animation);

        Typeface typeface=Typeface.createFromAsset(getAssets(),"font/Roboto.ttf");

        welcome_txt.setTypeface(typeface);
        welcome_txt2.setTypeface(typeface);


        Animation animation= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        Animation animation1=AnimationUtils.loadAnimation(this,R.anim.rotateimagetransition);

        welcome_txt.startAnimation(animation);
        welcome_txt2.startAnimation(animation);
        welcome_img.startAnimation(animation1);

        final Intent intent=new Intent(SplashScreen.this,Home.class);

        Thread timer=new Thread() {
            public void run() {
                try{
                    sleep(5000);


                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                            // lottieAnimationView.setVisibility(View.GONE);
                            finish();

                        }
                    });

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }

            }
        };
        timer.start();

    }
}

