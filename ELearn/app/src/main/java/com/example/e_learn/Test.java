package com.example.e_learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Test extends AppCompatActivity {

    public CardView crd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        crd=(CardView)findViewById(R.id.card1);

        crd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i=new Intent(Test.this,test2.class);
                startActivity(i);

            }
        });

    }
}
