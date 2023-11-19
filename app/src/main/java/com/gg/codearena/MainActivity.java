package com.gg.codearena;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    // For views
    private RecyclerView rv_languages;

    // For data
    private ArrayList<Languages> langData;
    // For Database
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing views
        rv_languages = findViewById(R.id.rv_languages);

        // For data
        langData = new ArrayList<>();
        // Initializing data to langData.
        initializeData();

        // Database Work
        db = FirebaseFirestore.getInstance();
        db.collection("languages")
                .get()
                .addOnCompleteListener(task -> {
                    if(task.isSuccessful()){
                        for (QueryDocumentSnapshot doc: task.getResult()){
                        }
                    }
                });

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