package com.gg.codearena;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.gg.codearena.databinding.ActivityQuizBinding;
import java.util.ArrayList;
import java.util.Objects;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;

    // For View Binding
    public ActivityQuizBinding binding;

    // For Questions
    MyFirestoreHelper myFirestoreHelper;
    ArrayList<Question> arrayQuestions;
    int index;
    Long[] userAnsIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflating the layout using viewBinding
        binding = ActivityQuizBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Initializing views
        toolbar = findViewById(R.id.toolbar);
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

        // Setting topbar language
        binding.tvQuizLang.setText(lang.toUpperCase());
        myFirestoreHelper.getQuestions(lang, new MyFirestoreHelper.QuestionItemFetchListener() {
            @Override
            public void onQuestionModelFetch(ArrayList<Question> questions) {
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
            userAnsIndex[index] = 0l;
        } else {
            if (binding.cvQuizOption2.getId() == v.getId()) {
                changeOptionColor(binding.cvQuizOption2);
                userAnsIndex[index] = 1l;
            } else {
                if (binding.cvQuizOption3.getId() == v.getId()) {
                    changeOptionColor(binding.cvQuizOption3);
                    userAnsIndex[index] = 2l;
                } else {
                    if (binding.cvQuizOption4.getId() == v.getId()) {
                        changeOptionColor(binding.cvQuizOption4);
                        userAnsIndex[index] = 3l;
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

    void setQuestion(Question qn){
        binding.tvQuizQn.setText(qn.getQuestion());
        binding.tvQuizOption1.setText(qn.getOptions().get(0));
        binding.tvQuizOption2.setText(qn.getOptions().get(1));
        binding.tvQuizOption3.setText(qn.getOptions().get(2));
        binding.tvQuizOption4.setText(qn.getOptions().get(3));
    }

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
}