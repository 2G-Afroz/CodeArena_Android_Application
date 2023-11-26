package com.gg.codearena;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // For data
    private ArrayList<Languages> langData;
    private LanguagesRvAdapter languagesRvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting toolbar
        setSupportActionBar(findViewById(R.id.toolbar));

        // Initializing views
        // For views
        RecyclerView rv_languages = findViewById(R.id.rv_languages);

        // Initializing data to langData.
        langData = new ArrayList<>();
        initializeData();

        languagesRvAdapter = new LanguagesRvAdapter(this, langData);
        rv_languages.setLayoutManager(new LinearLayoutManager(this));
        rv_languages.setAdapter(languagesRvAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_appbar_menu, menu);

        SearchView searchView = (SearchView) menu.findItem(R.id.menu_search).getActionView();
        if (searchView != null){
            searchView.setQueryHint("Search");
            searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    languagesRvAdapter.getFilter().filter(newText);
                    return false;
                }
            });
        }

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    void initializeData(){

        TypedArray img_res = getResources().obtainTypedArray(R.array.lang_logos);
        String[] lang_names = getResources().getStringArray(R.array.lang_name);
        String[] lang_topic_list = getResources().getStringArray(R.array.str_arr_languages_contents);
        for(int i=0;i<lang_topic_list.length;i++)
            langData.add(new Languages(img_res.getResourceId(i, 0), lang_names[i],lang_topic_list[i]));
    }


}