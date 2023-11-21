package com.gg.codearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.TypefaceSpan;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    Button btn_home, btn_replay;
    TextView tv_score, tv_completion, tv_total_qn, tv_correct, tv_wrong, tv_not_ans;
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
        tv_not_ans = findViewById(R.id.tv_not_answered);


        int score = getIntent().getIntExtra("score", 0); // Correct
        int total = getIntent().getIntExtra("total", 0); // Total
        int not_ans = getIntent().getIntExtra("notAns", 0); // Not Answered
        int completion;
        if(total == 0 || not_ans == total)
            completion = 0;
        else
            completion = ((total-not_ans)*100)/total;

        // Strings for the text
        String str_finalScore = "Your Score\n"+score+" pt";
        String str_completion = completion+"%\nCompletion";
        String str_total_qn = total+"\nTotal Questions";
        String str_correct = score+"\nCorrect";
        String str_wrong = total-score-not_ans+"\nWrong";
        String str_notAns = not_ans+"\nNot Answered";

        // Creating spans to highlight texts
        // For Score
        Spannable span_finalScore = new SpannableString(str_finalScore);
        span_finalScore.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.primary_dark)),
                10,
                str_finalScore.length()-3,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span_finalScore.setSpan(new RelativeSizeSpan(1.5f),
                10,
                str_finalScore.length()-3,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        // For Completion
        Spannable span_completion = new SpannableString(str_completion);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                span_completion.setSpan(new TypefaceSpan(getResources().getFont(R.font.poppins_bold)),
                        0,
                        str_completion.length()-10,
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        // For Total Questions
        Spannable span_total_qn = new SpannableString(str_total_qn);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            span_total_qn.setSpan(new TypefaceSpan(getResources().getFont(R.font.poppins_bold)),
                    0,
                   str_total_qn.length()-15,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        // For Correct
        Spannable span_correct = new SpannableString(str_correct);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            span_correct.setSpan(new TypefaceSpan(getResources().getFont(R.font.poppins_bold)),
                    0,
                    str_correct.length()-7,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        span_correct.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.right_green)),
                0,
                str_correct.length()-7,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        // For Wrong
        Spannable span_wrong = new SpannableString(str_wrong);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            span_wrong.setSpan(new TypefaceSpan(getResources().getFont(R.font.poppins_bold)),
                    0,
                    str_wrong.length() - 5,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        span_wrong.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.wrong_red)),
                0,
                str_wrong.length() - 5,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        // For Not Answered
        Spannable span_notAns = new SpannableString(str_notAns);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            span_notAns.setSpan(new TypefaceSpan(getResources().getFont(R.font.poppins_bold)),
                    0,
                    str_notAns.length() - 12,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        tv_score.setText(span_finalScore);
        tv_completion.setText(span_completion);
        tv_total_qn.setText(span_total_qn);
        tv_correct.setText(span_correct);
        tv_wrong.setText(span_wrong);
        tv_not_ans.setText(span_notAns);

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