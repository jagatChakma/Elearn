package com.example.e_learn.BanglaBanjonbornoFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_learn.BanglaShorbornoFragment.ShorbornoFragment1;
import com.example.e_learn.BanjonbornoActivity;
import com.example.e_learn.R;
import com.example.e_learn.ShorbornoActivity;


public class Banjonborno_Home_Fragment extends Fragment {
    public CardView cardBanglaBanjonborno1;
    public CardView cardBanglabanjonborno2;
    public CardView cardBanglabanjonborno3;
    public CardView cardBanglabanjonborno4;
    public CardView cardBanglabanjonborno5;
    public CardView cardBanglabanjonborno6;
    public CardView cardBanglabanjonborno7;
    public CardView cardBanglabanjonborno8;
    public CardView cardBanglabanjonborno9;
    public CardView cardBanglabanjonborno10;
    public CardView cardBanglabanjonborno11;
    public CardView cardBanglabanjonborno12;
    public CardView cardBanglabanjonborno13;
    public CardView cardBanglabanjonborno14;
    public CardView cardBanglabanjonborno15;

    public Banjonborno_Home_Fragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_banjonborno__home_, container, false);

        cardBanglaBanjonborno1=(CardView)view.findViewById(R.id.cardBanglabanjonborno1);
        cardBanglabanjonborno2=(CardView)view.findViewById(R.id.cardBanglabanjonborno2);
        cardBanglabanjonborno3=(CardView)view.findViewById(R.id.cardBanglabanjonborno3);
        cardBanglabanjonborno4=(CardView)view.findViewById(R.id.cardBanglabanjonborno4);
        cardBanglabanjonborno5=(CardView)view.findViewById(R.id.cardBanglabanjonborno5);
        cardBanglabanjonborno6=(CardView)view.findViewById(R.id.cardBanglabanjonborno6);
        cardBanglabanjonborno7=(CardView)view.findViewById(R.id.cardBanglabanjonborno7);
        cardBanglabanjonborno8=(CardView)view.findViewById(R.id.cardBanglabanjonborno8);
        cardBanglabanjonborno9=(CardView)view.findViewById(R.id.cardBanglabanjonborno9);
        cardBanglabanjonborno10=(CardView)view.findViewById(R.id.cardBanglabanjonborno10);
        cardBanglabanjonborno11=(CardView)view.findViewById(R.id.cardBanglabanjonborno11);
        cardBanglabanjonborno12=(CardView)view.findViewById(R.id.cardBanglabanjonborno12);
        cardBanglabanjonborno13=(CardView)view.findViewById(R.id.cardBanglabanjonborno13);
        cardBanglabanjonborno14=(CardView)view.findViewById(R.id.cardBanglabanjonborno14);
        cardBanglabanjonborno15=(CardView)view.findViewById(R.id.cardBanglabanjonborno15);

        cardBanglaBanjonborno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment1(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment2(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment3(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment4(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment5(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment6(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment7(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment8(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment9(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment10(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment11(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment12(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment13(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment14(),null).addToBackStack(null).commit();
            }
        });
        cardBanglabanjonborno15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanjonbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new BanjonbornoFragment15(),null).addToBackStack(null).commit();
            }
        });


        return view;
    }


}
