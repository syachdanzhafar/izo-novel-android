package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class FormInptActivity extends AppCompatActivity {
    String[] genre = {"Action", "Romance", "Fantasi", "Horor", "Comedy", "Sci-fi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_inpt);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, genre);
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.filled_exposed_dropdown);
        actv.setThreshold(1);
        actv.setAdapter(adapter);

    }
}