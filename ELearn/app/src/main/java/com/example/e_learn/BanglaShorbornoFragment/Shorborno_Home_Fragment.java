package com.example.e_learn.BanglaShorbornoFragment;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_learn.R;
import com.example.e_learn.ShorbornoActivity;


public class Shorborno_Home_Fragment extends Fragment {

    public CardView cardBanglaShorborno1;
    public CardView cardBanglaShorborno2;
    public CardView cardBanglaShorborno3;
    public CardView cardBanglaShorborno4;
    public CardView cardBanglaShorborno5;
    public CardView cardBanglaShorborno6;
    public CardView cardBanglaShorborno7;
    public CardView cardBanglaShorborno8;
    public CardView cardBanglaShorborno9;
    public CardView cardBanglaShorborno10;
    public CardView cardBanglaShorborno11;



    public Shorborno_Home_Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_shorborno__home_, container, false);

        cardBanglaShorborno1=(CardView)view.findViewById(R.id.cardBanglaShorborno1);
        cardBanglaShorborno2=(CardView)view.findViewById(R.id.cardBanglaShorborno2);
        cardBanglaShorborno3=(CardView)view.findViewById(R.id.cardBanglaShorborno3);
        cardBanglaShorborno4=(CardView)view.findViewById(R.id.cardBanglaShorborno4);
        cardBanglaShorborno5=(CardView)view.findViewById(R.id.cardBanglaShorborno5);
        cardBanglaShorborno6=(CardView)view.findViewById(R.id.cardBanglaShorborno6);
        cardBanglaShorborno7=(CardView)view.findViewById(R.id.cardBanglaShorborno7);
        cardBanglaShorborno8=(CardView)view.findViewById(R.id.cardBanglaShorborno8);
        cardBanglaShorborno9=(CardView)view.findViewById(R.id.cardBanglaShorborno9);
        cardBanglaShorborno10=(CardView)view.findViewById(R.id.cardBanglaShorborno10);
        cardBanglaShorborno11=(CardView)view.findViewById(R.id.cardBanglaShorborno11);



        cardBanglaShorborno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment1(),null).addToBackStack(null).commit();


            }
        });

        cardBanglaShorborno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment2(),null).addToBackStack(null).commit();

            }
        });

        cardBanglaShorborno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment3(),null).addToBackStack(null).commit();
            }
        });


        cardBanglaShorborno4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment4(),null).addToBackStack(null).commit();

            }
        });


        cardBanglaShorborno5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment5(),null).addToBackStack(null).commit();

            }
        });


        cardBanglaShorborno6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment6(),null).addToBackStack(null).commit();

            }
        });


        cardBanglaShorborno7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment7(),null).addToBackStack(null).commit();

            }
        });


        cardBanglaShorborno8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment8(),null).addToBackStack(null).commit();

            }
        });


        cardBanglaShorborno9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment9(),null).addToBackStack(null).commit();
            }
        });


        cardBanglaShorborno10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment10(),null).addToBackStack(null).commit();

            }
        });


        cardBanglaShorborno11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment11(),null).addToBackStack(null).commit();
            }
        });


    return view;
    }


}
