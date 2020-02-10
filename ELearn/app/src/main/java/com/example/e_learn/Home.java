package com.example.e_learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    public CardView cardbangla,cardenglish,cardmath,cardetc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        cardbangla=(CardView)findViewById(R.id.cardBangla);
        cardenglish=(CardView)findViewById(R.id.cardEnglish);
        cardmath=(CardView)findViewById(R.id.cardMath);
        cardetc=(CardView)findViewById(R.id.cardEtc);

        cardbangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(Home.this,Bangla.class);
                startActivity(intent);

            }
        });

        cardenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(Home.this,English.class);
                startActivity(intent);
            }
        });

        cardmath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Home.this,Math.class);
                startActivity(intent);

            }
        });

        cardetc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Home.this,ETC.class);
                startActivity(intent);

            }
        });




    }
}
