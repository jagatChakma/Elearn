package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    public ImageView splashscreenImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        splashscreenImage=(ImageView)findViewById(R.id.splashImage);

        Animation splashScreen= AnimationUtils.loadAnimation(this,R.anim.splash_transition);

        splashscreenImage.startAnimation(splashScreen);

        final Intent intent=new Intent(SplashScreen.this,ElearnHome.class);

        Thread timer = new Thread(){
            public void run(){

                try {
                    sleep(5000);

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
