package com.gg.codearena;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Upload Questions

        Intent intent = new Intent(this, MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        },2000);
    }

    /*void uploadQuestions(){

        // Add the question in this format
        String[] questions = {"Question1", "Question2", "Question3", ......, "QuestionN"};
        String[][] options = {
                {"Option1 of Question1", "Option 2 of Question1", "Option 3 of Question1","Option 4 of Question1"},
                {"Option1 of Question2", "Option 2 of Question2", "Option 3 of Question2","Option 4 of Question2"},
                {"Option1 of Question3", "Option 2 of Question3", "Option 3 of Question3","Option 4 of Question3"},
                .....
                {"Option1 of QuestionN", "Option 2 of QuestionN", "Option 3 of QuestionN","Option 4 of QuestionN"}
        long[] answer  = { 0, 1, 1, ...., 3} // The answer should be in index of options.
}

        for(int i=0;i<questions.length;i++){
            ArrayList<String> as = new ArrayList<>();
            for (int j = 0;j<4;j++){
                as.add(options[i][j]);
            }
            Question myQues = new Question(questions[i], as, answer[i]);
            FirebaseFirestore db = FirebaseFirestore.getInstance();
            db.collection("languages")
                    .document("9421KeM8ErYGrAN6AjkB")
                    .collection("python")
                    .add(myQues)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Toast.makeText(SplashActivity.this, "Added", Toast.LENGTH_SHORT).show();
                        }
                    })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(SplashActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                                }
                            });
            as.clear();
        }

    }*/
}