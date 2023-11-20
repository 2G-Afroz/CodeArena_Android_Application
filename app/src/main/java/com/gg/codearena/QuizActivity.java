package com.gg.codearena;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.gg.codearena.databinding.ActivityQuizBinding;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;
    LinearProgressIndicator lpi_progress_bar;

    // For View Binding
    public ActivityQuizBinding binding;

    // For Questions
    MyFirestoreHelper myFirestoreHelper;
    ArrayList<Question> arrayQuestions;
    int index;
    Long[] userAnsIndex;
    // For updating time
    Handler handler;
    private static int elapsedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflating the layout using viewBinding
        binding = ActivityQuizBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Initializing views
        toolbar = findViewById(R.id.toolbar);
        lpi_progress_bar = findViewById(R.id.lpb_progress_bar);
        // Initializing variables
        index = 0;

        // Toolbar options
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");

        // bindings views click event
        binding.cvQuizOption1.setOnClickListener(this);
        binding.cvQuizOption2.setOnClickListener(this);
        binding.cvQuizOption3.setOnClickListener(this);
        binding.cvQuizOption4.setOnClickListener(this);

        // Getting and Loading Questions
        myFirestoreHelper = new MyFirestoreHelper();
        arrayQuestions = new ArrayList<>();
        String lang = getIntent().getStringExtra("lang");

        // New Thread for setting time
        handler = new Handler(Looper.getMainLooper());

        // Setting top-bar language
        binding.tvQuizLang.setText(lang);

        myFirestoreHelper.getQuestions(lang.toLowerCase(), new MyFirestoreHelper.QuestionItemFetchListener() {
            @Override
            public void onQuestionModelFetch(ArrayList<Question> questions) {
                // For time
                elapsedTime = 0;
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        updateTime();
                        handler.postDelayed(this, 1000);
                    }
                },1000);

                // For progressBar
                lpi_progress_bar.setVisibility(View.GONE);

                // For questions
                arrayQuestions.addAll(questions);
                if(arrayQuestions.size()>0)
                    setQuestion(arrayQuestions.get(0));
                userAnsIndex = new Long[arrayQuestions.size()];

                // Setting question number
                setQnNum(1, userAnsIndex.length);

            }

            @Override
            public void onFailure(Exception e) {
                Toast.makeText(QuizActivity.this, "Failed to load Questions.", Toast.LENGTH_SHORT).show();
            }
        });

        // Setting next/prev click events
        binding.btnPrev.setOnClickListener(v -> {
            if (index>0){
                index--;
                setQuestion(arrayQuestions.get(index));
                // Setting Selected option color
                clearOptionColor();
                if(userAnsIndex[index] != null){
                    setOptionColor(userAnsIndex[index].intValue());
                }
                setQnNum(index+1, userAnsIndex.length);
            }
        });

        binding.btnNext.setOnClickListener(v -> {
            if (index<arrayQuestions.size()-1){
                index++;
                setQuestion(arrayQuestions.get(index));
                // Setting Selected option color
                clearOptionColor();
                if(userAnsIndex[index] != null){
                    setOptionColor(userAnsIndex[index].intValue());
                }
                setQnNum(index+1, userAnsIndex.length);
            }
        });

        // Submitting the test
        binding.btnSubmit.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Submit test?")
                    .setPositiveButton("SUBMIT", (dialog, which) -> {
                        Intent intent = new Intent(this, ResultActivity.class);
                        // Putting data for result
                        intent.putExtra("score", getResult());
                        intent.putExtra("total", userAnsIndex.length);
                        intent.putExtra("lang", lang);
                        startActivity(intent);
                        finish();
                    })
                    .setNegativeButton("CANCEL", ((dialog, which) -> {
                        dialog.dismiss();
                    }))
                    .create().show();
        });



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {// (Home/<-) pressed
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
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
            userAnsIndex[index] = 0L;
        } else {
            if (binding.cvQuizOption2.getId() == v.getId()) {
                changeOptionColor(binding.cvQuizOption2);
                userAnsIndex[index] = 1L;
            } else {
                if (binding.cvQuizOption3.getId() == v.getId()) {
                    changeOptionColor(binding.cvQuizOption3);
                    userAnsIndex[index] = 2L;
                } else {
                    if (binding.cvQuizOption4.getId() == v.getId()) {
                        changeOptionColor(binding.cvQuizOption4);
                        userAnsIndex[index] = 3L;
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
        clearOptionColor();
        cv.setCardBackgroundColor(ContextCompat.getColor(this, R.color.selected));
    }

    /**
     * This function is used to clear the color of options card background.
     */
    void clearOptionColor(){
        binding.cvQuizOption1.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
        binding.cvQuizOption2.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
        binding.cvQuizOption3.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
        binding.cvQuizOption4.setCardBackgroundColor(ContextCompat.getColor(this, android.R.color.background_light));
    }

    /**
     * This function is used to set the color of previously selected option by the user
     * @param index is the index of option.
     */
    void setOptionColor(int index){
        switch (index){
            case 0:
                binding.cvQuizOption1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.selected));
                break;
            case 1:
                binding.cvQuizOption2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.selected));
                break;
            case 2:
                binding.cvQuizOption3.setCardBackgroundColor(ContextCompat.getColor(this, R.color.selected));
                break;
            case 3:
                binding.cvQuizOption4.setCardBackgroundColor(ContextCompat.getColor(this, R.color.selected));
                break;

        }
    }
    void setQnNum(int index, int totalQn){
        binding.tvQuizQNum.setText(index+"/"+totalQn);
    }

    /**
     * This function is used to set the question and their options in their respective fields.
     * @param qn is the current Question.
     */
    void setQuestion(Question qn){
        binding.tvQuizQn.setText(qn.getQuestion());
        binding.tvQuizOption1.setText(qn.getOptions().get(0));
        binding.tvQuizOption2.setText(qn.getOptions().get(1));
        binding.tvQuizOption3.setText(qn.getOptions().get(2));
        binding.tvQuizOption4.setText(qn.getOptions().get(3));
    }

    /**
     * THis function is used to get the result of the quiz according to the selected options of the questions.
     * @return the final result as score.
     */
    int getResult(){
        int score = 0;
        if(arrayQuestions.size()>0){
            for(int i=0;i<userAnsIndex.length;i++){
                if(Objects.equals(userAnsIndex[i], arrayQuestions.get(i).getAnswer_index())) {
                    score++;
                }
            }
        }
        return score;
    }

    /**
     * This function is used to set the time in time field.
     */
    private void updateTime(){
        elapsedTime++;
        int min = elapsedTime/60;
        int sec = elapsedTime%60;
        String formattedTime = String.format(Locale.US, "%02d:%02d", min, sec);
        binding.tvQuizTime.setText(formattedTime);
    }
}