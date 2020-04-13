package com.example.myapplication.dataadapterfinal;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Object String;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] name = new String [10];
        name [0] = "Nadine";
        name [1] = "Emiliano";
        name [2] = "Kanya";
        name [3] = "Lourenco";
        name [4] = "Paul";
        name [5] = "Rainer";
        name [6] = "Peter";
        name [7] = "Danilo";
        name [8] = "Felipe";
        name [9] = "Rodrigo";

        ArrayAdapter <String> studentsAdapter =
                new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, name);

        ListView classListView = (ListView) findViewById(R.id.studentList);

        classListView.setAdapter(studentsAdapter);



    }
}
