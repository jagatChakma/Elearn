package com.example.e_learn.BanglaShorbornoFragment;


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
public class ShorbornoFragment8 extends Fragment {
    private TextView sarobornoText;
    private ImageView imageView1, imageView2, imageView3, imageView4;
    private CanvasView canvasView;


    public ShorbornoFragment8() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_shorborno_fragment8, container, false);
        final CanvasView canvasView = (CanvasView)view.findViewById(R.id.canvasViewId);
        //here is audio code

        final MediaPlayer mp3 = MediaPlayer.create(getActivity(),R.raw.sa_mp3_8);
        final MediaPlayer mp33 = MediaPlayer.create(getActivity(),R.raw.sa_dilog8);

        sarobornoText = (TextView)view.findViewById(R.id.saroborno1);

        imageView1 = (ImageView) view.findViewById(R.id.sarimg);
        imageView2 = (ImageView)view.findViewById(R.id.clearImageCanvas);
        imageView3 = (ImageView)view.findViewById(R.id.speakerImageButton);
        imageView4 = (ImageView)view.findViewById(R.id.saveImageButton);

        sarobornoText.setOnClickListener(new View.OnClickListener() {
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
