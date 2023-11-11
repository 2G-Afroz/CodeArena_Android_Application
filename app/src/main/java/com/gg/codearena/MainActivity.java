package com.gg.codearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_languages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing views
        rv_languages = findViewById(R.id.rv_languages);

        // int_array from strings.xml is not working
        int[] logos = {
                R.drawable.logo_python,
                R.drawable.logo_js,
                R.drawable.logo_html,
                R.drawable.logo_go,
                R.drawable.logo_css,
                R.drawable.logo_ruby,
                R.drawable.logo_php,
                R.drawable.logo_java
        };

        String[] strs = getResources().getStringArray(R.array.str_arr_languages_contents);

        LanguagesRvAdapter languagesRvAdapter = new LanguagesRvAdapter(this, logos, strs);
        rv_languages.setLayoutManager(new LinearLayoutManager(this));
        rv_languages.setAdapter(languagesRvAdapter);
    }
}