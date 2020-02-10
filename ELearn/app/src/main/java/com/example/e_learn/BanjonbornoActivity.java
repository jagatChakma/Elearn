package com.example.e_learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.e_learn.BanglaBanjonbornoFragment.Banjonborno_Home_Fragment;
import com.example.e_learn.BanglaShorbornoFragment.Shorborno_Home_Fragment;

public class BanjonbornoActivity extends AppCompatActivity {


    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banjonborno);


        fragmentManager = getSupportFragmentManager();


        if (findViewById(R.id.container) != null) {

            if (savedInstanceState != null) {

                return;
            }

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            Banjonborno_Home_Fragment login = new Banjonborno_Home_Fragment();

            fragmentTransaction.add(R.id.container, login, null);
            fragmentTransaction.commit();

        }
    }
}
