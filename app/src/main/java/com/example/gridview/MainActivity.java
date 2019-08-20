package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;


import android.os.Bundle;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    GridView simpleList;
    ArrayList birdList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (GridView) findViewById(R.id.simpleGridView);
        birdList.add(new Item("Bird 1",R.drawable.b1));
        birdList.add(new Item("Bird 2",R.drawable.b2));
        birdList.add(new Item("Bird 3",R.drawable.b3));
        birdList.add(new Item("Bird 4",R.drawable.b4));
        birdList.add(new Item("Bird 5",R.drawable.b5));
        birdList.add(new Item("Bird 6",R.drawable.b6));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.grid_view_items,birdList);
        simpleList.setAdapter(myAdapter);

    }
}
