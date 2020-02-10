package com.example.e_learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.e_learn.BanglaShorbornoFragment.Shorborno_Home_Fragment;

public class Bangla extends AppCompatActivity {

    public CardView cardShorborno,cardBanjonborno;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);

        cardShorborno=(CardView)findViewById(R.id.cardShorborno);
        cardBanjonborno=(CardView)findViewById(R.id.cardBanjonborno);

        cardShorborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bangla.this,ShorbornoActivity.class);
                startActivity(intent);
            }
        });

        cardBanjonborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bangla.this,BanjonbornoActivity.class);
                startActivity(intent);
            }
        });



    }
}
