package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        ArrayList<Word> androidFlavors = new ArrayList<Word>();
        androidFlavors.add(new Word("Red", "laal"));
        androidFlavors.add(new Word("Green", "haraa"));
        androidFlavors.add(new Word("Yellow", "peela"));
        androidFlavors.add(new Word("Orange", "narangi"));
        androidFlavors.add(new Word("Black", "kaala"));
        androidFlavors.add(new Word("White", "safeyd"));
        androidFlavors.add(new Word("Blue", "neela"));
        androidFlavors.add(new Word("Violet", "baingani"));
        androidFlavors.add(new Word("Brown", "bhura"));
        androidFlavors.add(new Word("Gray", "sleti"));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        WordClassAdapter flavorAdapter = new WordClassAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(flavorAdapter);


    }
}
