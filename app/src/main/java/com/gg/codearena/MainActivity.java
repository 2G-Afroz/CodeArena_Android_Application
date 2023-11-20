package com.gg.codearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.res.TypedArray;
import android.os.Bundle;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // For data
    private ArrayList<Languages> langData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing views
        // For views
        RecyclerView rv_languages = findViewById(R.id.rv_languages);

        // For data
        langData = new ArrayList<>();
        // Initializing data to langData.
        initializeData();

        LanguagesRvAdapter languagesRvAdapter = new LanguagesRvAdapter(this, langData);
        rv_languages.setLayoutManager(new LinearLayoutManager(this));
        rv_languages.setAdapter(languagesRvAdapter);
    }

    void initializeData(){
        TypedArray img_res = getResources().obtainTypedArray(R.array.lang_logos);
        String[] lang_names = getResources().getStringArray(R.array.lang_name);
        String[] lang_topic_list = getResources().getStringArray(R.array.str_arr_languages_contents);
        for(int i=0;i<lang_topic_list.length;i++){
            langData.add(new Languages(img_res.getResourceId(i, 0), lang_names[i],lang_topic_list[i]));
        }
    }
}