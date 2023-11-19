package com.gg.codearena;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.progressindicator.LinearProgressIndicator;

public class ResultActivity extends AppCompatActivity {

    Button btn_home, btn_replay;
    TextView tv_score, tv_completion, tv_total_qn, tv_correct, tv_wrong;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Initializing views
        btn_home = findViewById(R.id.btn_home);
        btn_replay = findViewById(R.id.btn_play_again);
        tv_score = findViewById(R.id.tv_score);
        tv_completion = findViewById(R.id.tv_completion);
        tv_total_qn = findViewById(R.id.tv_total_qn);
        tv_correct = findViewById(R.id.tv_correct);
        tv_wrong = findViewById(R.id.tv_wrong);

        int score = getIntent().getIntExtra("score", 0); // Correct
        int total = getIntent().getIntExtra("total", 0);
        int completion;
        if(total == 0)
            completion = 0;
        else
            completion = (score*100)/total;
        tv_score.setText("Yout Score\n"+getIntent().getIntExtra("score", 0)+" pt");
        tv_completion.setText(completion+"%\nCompletion");
        tv_total_qn.setText(total+"\nTotal Questions");
        tv_correct.setText(score+"\nCorrect");
        tv_wrong.setText(total-score+"\nWrong");

        // Button click event
        btn_home.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });
        btn_replay.setOnClickListener(v -> {
            Intent intent = new Intent(this, QuizActivity.class);
            intent.putExtra("lang", getIntent().getStringExtra("lang"));
            startActivity(intent);
            finish();
        });
    }
}