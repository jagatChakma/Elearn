package com.example.e_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class test2 extends AppCompatActivity {
    private Activity context;
    private int resource;


    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;

    private ArrayList<String> boss;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);


        listView = (ListView) findViewById(R.id.searchListView);
        boss= new ArrayList<>();
        boss.addAll(Arrays.asList(getResources().getStringArray(R.array.boss)));
        arrayAdapter = new ArrayAdapter<String>(test2.this, R.layout.customlist, boss);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Toast.makeText(test2.this, "item clicked "+listView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();

                Intent a = new Intent(test2.this,test3.class);
              //  a.putExtra("bk1", listView.getItemAtPosition(i).toString());
                //a.putExtra("bkL1","Mahandibad");
               // a.putExtra("bkkL1",1);
                startActivity(a);
            }
        });



    }
}
