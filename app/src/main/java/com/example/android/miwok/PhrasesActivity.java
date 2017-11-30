package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> androidFlavors = new ArrayList<Word>();

        androidFlavors.add(new Word("You are welcome", "Aapka swaagat hai"));
        androidFlavors.add(new Word("Hi!", "namaste"));
        androidFlavors.add(new Word("Good Morning", "suprabhaat"));
        androidFlavors.add(new Word("Thank you", "dhanyavaad"));
        androidFlavors.add(new Word("What are you doing?", "tum kya kar rahe ho"));
        androidFlavors.add(new Word("What is your name?", "tumhara naam kya hai"));
        androidFlavors.add(new Word("It is good", "achcha hai"));
        androidFlavors.add(new Word("Stop", "rukiye"));
        androidFlavors.add(new Word("Good evening", "Shubh Sandyaa"));
        androidFlavors.add(new Word("Eat food", "khana khao"));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        WordClassAdapter flavorAdapter = new WordClassAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(flavorAdapter);

    }
}
