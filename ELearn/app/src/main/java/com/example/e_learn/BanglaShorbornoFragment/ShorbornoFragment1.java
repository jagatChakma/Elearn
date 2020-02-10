package com.example.e_learn.BanglaShorbornoFragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_learn.CanvasView;
import com.example.e_learn.R;

import java.util.UUID;


public class ShorbornoFragment1 extends Fragment {

    private TextView sarobornoText;
    private ImageView imageView1, imageView2, imageView3, imageView4;
    private CanvasView canvasView;

    public ShorbornoFragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_shorborno_fragment1, container, false);
        final CanvasView canvasView = (CanvasView)view.findViewById(R.id.canvasViewId);
        //here is audio code

        final MediaPlayer mp3 = MediaPlayer.create(getActivity(),R.raw.sa_mp3_1);
        final MediaPlayer mp33 = MediaPlayer.create(getActivity(),R.raw.sa_dilog1);

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

//
//        imageView4.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        AlertDialog.Builder saveAlertDilog = new AlertDialog.Builder(getContext());
//        saveAlertDilog.setTitle("Save ?");
//        saveAlertDilog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//@Override
//public void onClick(DialogInterface dialog, int which) {
//        canvasView.setDrawingCacheEnabled(true);
//        String imageSave = MediaStore.Images.Media.insertImage(
//        getContentResolver(),canvasView.getDrawingCache(), UUID.randomUUID().toString()+".png","drawing");
//        if (imageSave != null){
//        Toast saveToast = Toast.makeText(getContext(), "Save", Toast.LENGTH_SHORT);
//        saveToast.show();
//        }else {
//        Toast unSave = Toast.makeText(getContext(), "Opps, error..", Toast.LENGTH_SHORT);
//        unSave.show();
//        }
//        canvasView.destroyDrawingCache();
//        // make score alow in manifests file to use-permission in store  ->     <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
//        }
//        });
//        saveAlertDilog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//@Override
//public void onClick(DialogInterface dialog, int which) {
//        dialog.cancel();
//        }
//        });
//        saveAlertDilog.show();
//        }
//        });