package com.example.e_learn.BanglaBanjonbornoFragment;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.e_learn.CanvasView;
import com.example.e_learn.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BanjonbornoFragment10 extends Fragment {
    private TextView banjonbornoText;
    private ImageView imageView1, imageView2, imageView3, imageView4;
    private CanvasView canvasView;


    public BanjonbornoFragment10() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_banjonborno_fragment10, container, false);

        final MediaPlayer mp3 = MediaPlayer.create(getActivity(),R.raw.bng_mp3_10);
        final MediaPlayer mp33 = MediaPlayer.create(getActivity(),R.raw.bng_dilog10);

        banjonbornoText = (TextView)view.findViewById(R.id.banjonborno);

        imageView1 = (ImageView) view.findViewById(R.id.banjonbornoimage);
        imageView2 = (ImageView)view.findViewById(R.id.clearImageCanvas);
        imageView3 = (ImageView)view.findViewById(R.id.speakerImageButton);
        imageView4 = (ImageView)view.findViewById(R.id.saveImageButton);

        banjonbornoText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp33.start();
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                canvasView.clearCanvas();
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp33.start();
            }
        });

        return view;
    }

}
