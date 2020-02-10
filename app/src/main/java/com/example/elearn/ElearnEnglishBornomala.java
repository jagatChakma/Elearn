package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElearnEnglishBornomala extends AppCompatActivity {

    private Button Vowel,Consonant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearn_english_bornomala);

        Vowel=(Button)findViewById(R.id.vowel);
        Consonant=(Button)findViewById(R.id.consonant);

        Vowel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i=new Intent(ElearnEnglishBornomala.this,ElearnVowel.class);
                startActivity(i);
            }
        });


        Consonant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(ElearnEnglishBornomala.this,ElearnConsonant.class);
                startActivity(i);

            }
        });
    }
}
