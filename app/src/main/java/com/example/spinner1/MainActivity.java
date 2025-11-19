package com.example.spinner1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // First spinner (pays)
        Spinner s = findViewById(R.id.pays);
        ArrayAdapter<CharSequence> adp1 = ArrayAdapter.createFromResource(
                this,
                R.array.liste_pays,
                android.R.layout.simple_dropdown_item_1line
        );
        s.setAdapter(adp1);

        // Second spinner (liste)
        Spinner s1 = findViewById(R.id.liste);
        String[] str = {"a", "b"};
        ArrayAdapter<String> adp2 = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                str
        );
        s1.setAdapter(adp2);
    }
}
