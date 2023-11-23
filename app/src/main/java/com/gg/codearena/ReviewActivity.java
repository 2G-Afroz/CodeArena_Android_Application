package com.gg.codearena;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.gg.codearena.databinding.ActivityReviewBinding;
import java.util.ArrayList;
import java.util.Objects;

public class ReviewActivity extends AppCompatActivity {

    private ActivityReviewBinding binding;
    int index;

    ArrayList<Question> questions;
    long[] userAnsIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Setting toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");

        // Initializing data.
        index = 0;

        // Getting data from intent
        questions = getIntent().getParcelableArrayListExtra("questions");
        userAnsIndex = getIntent().getLongArrayExtra("user_ans");

        // Setting question at starting
        setQuestionAnswer(questions.get(index));
        // Setting Selected option color
        if(userAnsIndex[index] != -1)
            setOptionColor((int)userAnsIndex[index], ContextCompat.getColor(this, R.color.selected));   // Setting user answer

        setOptionColor(questions.get(index).getAnswer_index().intValue(), ContextCompat.getColor(this, R.color.right_green));   // Setting actual answer

        // button click event
        // Setting next/prev click events
        binding.btnPrev.setOnClickListener(v -> {
            if (index > 0) {
                index--;
                setQuestionAnswer(questions.get(index));
                // Setting Selected option color
                clearOptionColor();
                if(userAnsIndex[index] != -1)
                    setOptionColor((int)userAnsIndex[index], ContextCompat.getColor(this, R.color.selected));   // Setting user answer

                setOptionColor(questions.get(index).getAnswer_index().intValue(), ContextCompat.getColor(this, R.color.right_green));   // Setting actual answer


            }
        });
        binding.btnNext.setOnClickListener(v -> {
            if (index < questions.size() - 1) {
                index++;
                setQuestionAnswer(questions.get(index));
                // Setting Selected option color
                clearOptionColor();
                if(userAnsIndex[index] != -1)
                    setOptionColor((int)userAnsIndex[index], ContextCompat.getColor(this, R.color.selected));   // Setting user answer

                setOptionColor(questions.get(index).getAnswer_index().intValue(), ContextCompat.getColor(this, R.color.right_green));   // Setting actual answer
            }
        });

        binding.btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK); // Clears all the tasks/Activity
            startActivity(intent);
            finish();
        });


    }

    void setQuestionAnswer(Question qn){
        binding.tvQuizQn.setText(qn.getQuestion());
        binding.tvQuizOption1.setText(qn.getOptions().get(0));
        binding.tvQuizOption2.setText(qn.getOptions().get(1));
        binding.tvQuizOption3.setText(qn.getOptions().get(2));
        binding.tvQuizOption4.setText(qn.getOptions().get(3));
        clearOptionColor();
    }

    /**
     * This function is used to clear the color of options card background.
     */
    void clearOptionColor() {
        binding.cvQuizOption1.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
        binding.cvQuizOption2.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
        binding.cvQuizOption3.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
        binding.cvQuizOption4.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
    }

    /**
     * This function is used to set the color of previously selected option by the user
     *
     * @param index is the index of option.
     */
    void setOptionColor(int index, int color) {
        switch (index) {
            case 0:
                binding.cvQuizOption1.setCardBackgroundColor(color);
                break;
            case 1:
                binding.cvQuizOption2.setCardBackgroundColor(color);
                break;
            case 2:
                binding.cvQuizOption3.setCardBackgroundColor(color);
                break;
            case 3:
                binding.cvQuizOption4.setCardBackgroundColor(color);
                break;

        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {// (Home/<-) pressed
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}