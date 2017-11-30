package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<Word> androidFlavors = new ArrayList<Word>();
        androidFlavors.add(new Word("One", "ek"));
        androidFlavors.add(new Word("Two", "do"));
        androidFlavors.add(new Word("Three", "teen"));
        androidFlavors.add(new Word("Four", "chaar"));
        androidFlavors.add(new Word("Five", "paanch"));
        androidFlavors.add(new Word("Six", "cheyy"));
        androidFlavors.add(new Word("Seven", "saath"));
        androidFlavors.add(new Word("Eight", "aatth"));
        androidFlavors.add(new Word("Nine", "nau"));
        androidFlavors.add(new Word("Ten", "dus"));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        WordClassAdapter flavorAdapter = new WordClassAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(flavorAdapter);

    }
}
