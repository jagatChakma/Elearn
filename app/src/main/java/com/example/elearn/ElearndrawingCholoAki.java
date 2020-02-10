package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ElearndrawingCholoAki extends AppCompatActivity {

    private ImageView drawingImage;
    private Button save,erase,showOrhideLetter;
    private ImageView changeimageButton;
    private CanvasView canvasView;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearndrawing_cholo_aki);

        drawingImage=(ImageView)findViewById(R.id.drawingimage);

        save=(Button)findViewById(R.id.save);

        erase=(Button)findViewById(R.id.eraseText);

        showOrhideLetter=(Button)findViewById(R.id.changeviewbornomala);

        changeimageButton=(ImageView) findViewById(R.id.changeView);

        canvasView=(CanvasView)findViewById(R.id.canvasViewId);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                canvasView.clearCanvas();
            }
        });

        showOrhideLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (i==0) {

                    drawingImage.setVisibility(View.GONE);

                    changeimageButton.setBackgroundResource(R.drawable.lettershowtext);
                    i++;
                }
                else{
                    drawingImage.setVisibility(View.VISIBLE);
                    changeimageButton.setBackgroundResource(R.drawable.letterhidetext);
                    i=0;
                }

            }
        });
    }




    public void tapButton1(View view) {


       drawingImage.setBackgroundResource(R.drawable.read1);

    }

    public void tapButton2(View view) {

        drawingImage.setBackgroundResource(R.drawable.read2);
    }

    public void tapButton3(View view) {

        drawingImage.setBackgroundResource(R.drawable.read3);
    }

    public void tapButton4(View view) {
        drawingImage.setBackgroundResource(R.drawable.read4);
    }

    public void tapButton5(View view) {

        drawingImage.setBackgroundResource(R.drawable.read5);
    }

    public void tapButton6(View view) {

        drawingImage.setBackgroundResource(R.drawable.read6);
    }

    public void tapButton7(View view) {
        drawingImage.setBackgroundResource(R.drawable.read7);
    }

    public void tapButton8(View view) {
        drawingImage.setBackgroundResource(R.drawable.read8);
    }

    public void tapButton9(View view) {

        drawingImage.setBackgroundResource(R.drawable.read9);
    }

    public void tapButton10(View view) {
        drawingImage.setBackgroundResource(R.drawable.read10);
    }

    public void tapButton11(View view) {

        drawingImage.setBackgroundResource(R.drawable.read11);
    }

    public void tapButton12(View view) {
        drawingImage.setBackgroundResource(R.drawable.read12);
    }

    public void tapButton13(View view) {
        drawingImage.setBackgroundResource(R.drawable.read13);
    }

    public void tapButton14(View view) {
        drawingImage.setBackgroundResource(R.drawable.read14);
    }

    public void tapButton15(View view) {
        drawingImage.setBackgroundResource(R.drawable.read15);
    }

    public void tapButton16(View view) {
        drawingImage.setBackgroundResource(R.drawable.read16);
    }

    public void tapButton17(View view) {
        drawingImage.setBackgroundResource(R.drawable.read17);
    }

    public void tapButton18(View view) {
        drawingImage.setBackgroundResource(R.drawable.read18);
    }

    public void tapButton19(View view) {
        drawingImage.setBackgroundResource(R.drawable.read19);
    }

    public void tapButton20(View view) {
        drawingImage.setBackgroundResource(R.drawable.read20);
    }

    public void tapButton21(View view) {
        drawingImage.setBackgroundResource(R.drawable.read21);
    }

    public void tapButton22(View view) {
        drawingImage.setBackgroundResource(R.drawable.read22);
    }

    public void tapButton23(View view) {
        drawingImage.setBackgroundResource(R.drawable.read23);
    }

    public void tapButton24(View view) {
        drawingImage.setBackgroundResource(R.drawable.read24);
    }

    public void tapButton25(View view) {
        drawingImage.setBackgroundResource(R.drawable.read25);
    }

    public void tapButton26(View view) {
        drawingImage.setBackgroundResource(R.drawable.read26);
    }

    public void tapButton27(View view) {
        drawingImage.setBackgroundResource(R.drawable.read27);
    }

    public void tapButton28(View view) {
        drawingImage.setBackgroundResource(R.drawable.read28);
    }

    public void tapButton29(View view) {
        drawingImage.setBackgroundResource(R.drawable.read29);
    }

    public void tapButton30(View view) {
        drawingImage.setBackgroundResource(R.drawable.read30);
    }

    public void tapButton31(View view) {
        drawingImage.setBackgroundResource(R.drawable.read31);
    }

    public void tapButton32(View view) {
        drawingImage.setBackgroundResource(R.drawable.read32);
    }

    public void tapButton33(View view) {
        drawingImage.setBackgroundResource(R.drawable.read33);
    }

    public void tapButton34(View view) {
        drawingImage.setBackgroundResource(R.drawable.read34);
    }

    public void tapButton35(View view) {
        drawingImage.setBackgroundResource(R.drawable.read35);
    }

    public void tapButton36(View view) {
        drawingImage.setBackgroundResource(R.drawable.read36);
    }

    public void tapButton37(View view) {
        drawingImage.setBackgroundResource(R.drawable.read37);
    }

    public void tapButton38(View view) {
        drawingImage.setBackgroundResource(R.drawable.read38);
    }

    public void tapButton39(View view) {
        drawingImage.setBackgroundResource(R.drawable.read39);
    }

    public void tapButton40(View view) {
        drawingImage.setBackgroundResource(R.drawable.read40);
    }

    public void tapButton41(View view) {
        drawingImage.setBackgroundResource(R.drawable.read41);
    }

    public void tapButton42(View view) {
        drawingImage.setBackgroundResource(R.drawable.read42);
    }

    public void tapButton43(View view) {
        drawingImage.setBackgroundResource(R.drawable.read43);
    }

    public void tapButton44(View view) {
        drawingImage.setBackgroundResource(R.drawable.read44);
    }

    public void tapButton45(View view) {
        drawingImage.setBackgroundResource(R.drawable.read45);
    }

    public void tapButton46(View view) {
        drawingImage.setBackgroundResource(R.drawable.read46);
    }

    public void tapButton47(View view) {
        drawingImage.setBackgroundResource(R.drawable.read47);
    }

    public void tapButton48(View view) {
        drawingImage.setBackgroundResource(R.drawable.read48);
    }

    public void tapButton49(View view) {
        drawingImage.setBackgroundResource(R.drawable.read49);
    }

    public void tapButton50(View view) {
        drawingImage.setBackgroundResource(R.drawable.read50);
    }
}
