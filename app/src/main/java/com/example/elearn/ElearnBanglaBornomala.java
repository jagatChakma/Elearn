package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ElearnBanglaBornomala extends AppCompatActivity {


   private Button Shorborno,Banjonborno,Dekhipori,Choloaki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearn_bangla_bornomala);


        Shorborno=(Button) findViewById(R.id.ShorBorno);
        Banjonborno=(Button) findViewById(R.id.BanjonBorno);
        Dekhipori=(Button) findViewById(R.id.DekhiPori);
        Choloaki=(Button) findViewById(R.id.CholoAaki);


        Shorborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(ElearnBanglaBornomala.this,ElearnShorbornomala.class);
                startActivity(i);

            }
        });

        Banjonborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ElearnBanglaBornomala.this,ElearnBanjonbornomala.class);
                startActivity(i);
            }
        });


        Dekhipori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(ElearnBanglaBornomala.this,ElearnDekhiPori.class);
                startActivity(i);

            }
        });


        Choloaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(ElearnBanglaBornomala.this,ElearndrawingCholoAki.class);
                startActivity(i);
            }
        });




    }
}
