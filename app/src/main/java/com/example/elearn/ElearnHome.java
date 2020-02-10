package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ElearnHome extends AppCompatActivity {

    private Button banglabornomala,englishbornomala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearn_home);

        banglabornomala=(Button) findViewById(R.id.BanglaBornomala);
        englishbornomala=(Button) findViewById(R.id.EnglishBornomala);

        banglabornomala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(ElearnHome.this,ElearnBanglaBornomala.class);
                startActivity(i);

            }
        });


        englishbornomala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(ElearnHome.this,ElearnEnglishBornomala.class);
                startActivity(i);

            }
        });


    }
}
