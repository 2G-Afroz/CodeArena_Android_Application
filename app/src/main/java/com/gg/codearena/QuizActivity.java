package com.gg.codearena;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.gg.codearena.databinding.ActivityQuizBinding;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;

    // For View Binding
    public ActivityQuizBinding binding;
    TextView tv_quiz_lang, tv_quiz_time, tv_quiz_q_num, tv_quiz_qn;
    // Options Views
    CardView cv_quiz_option_1, cv_quiz_option_2, cv_quiz_option_3, cv_quiz_option_4;
    TextView tv_quiz_option_1, tv_quiz_option_2, tv_quiz_option_3, tv_quiz_option_4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflating the layout using viewBinding
        binding = ActivityQuizBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Initializing views
        toolbar = findViewById(R.id.toolbar);

        // Toolbar options
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");

        // bindings views
        binding.cvQuizOption1.setOnClickListener(this);
        binding.cvQuizOption2.setOnClickListener(this);
        binding.cvQuizOption3.setOnClickListener(this);
        binding.cvQuizOption4.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                // Home/<- pressed
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * This is an on click function
     * It get called when the option card view get clicked.
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if (binding.cvQuizOption1.getId() == v.getId()) {
            changeOptionColor(binding.cvQuizOption1);
        } else {
            if (binding.cvQuizOption2.getId() == v.getId()) {
                changeOptionColor(binding.cvQuizOption2);
            } else {
                if (binding.cvQuizOption3.getId() == v.getId()) {
                    changeOptionColor(binding.cvQuizOption3);
                } else {
                    if (binding.cvQuizOption4.getId() == v.getId()) {
                        changeOptionColor(binding.cvQuizOption4);
                    }
                }
            }
        }
    }

    /**
     * This function is used to set the color of recently selected/clicked card view/option.
     * @param cv is the clicked card view.
     */
    void changeOptionColor(CardView cv){
        binding.cvQuizOption1.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
        binding.cvQuizOption2.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
        binding.cvQuizOption3.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
        binding.cvQuizOption4.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
        cv.setCardBackgroundColor(ContextCompat.getColor(this, R.color.selected));
    }
}