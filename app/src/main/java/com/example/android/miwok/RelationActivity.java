package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RelationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relation);

        ArrayList<Word> androidFlavors = new ArrayList<Word>();
        androidFlavors.add(new Word("Mother", "mata"));
        androidFlavors.add(new Word("Father", "Betaa"));
        androidFlavors.add(new Word("Brother", "bhai"));
        androidFlavors.add(new Word("Sister", "behen"));
        androidFlavors.add(new Word("Daughter", "beti"));
        androidFlavors.add(new Word("Son", "beta"));
        androidFlavors.add(new Word("Grandfather", "nana"));
        androidFlavors.add(new Word("Wife", "patni"));
        androidFlavors.add(new Word("Husband", "pati"));
        androidFlavors.add(new Word("Granmother", "nani"));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        WordClassAdapter flavorAdapter = new WordClassAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(flavorAdapter);

    }
}
