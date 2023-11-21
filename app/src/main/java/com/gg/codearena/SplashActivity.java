package com.gg.codearena;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Upload Questions
        //uploadQuestions();

        Intent intent = new Intent(this, MainActivity.class);
        new Handler().postDelayed(() -> {
            startActivity(intent);
            finish();
        },2000);
    }

    void uploadQuestions(){

        // Add the question in this format
        // String[] questions = {"Question1", "Question2", "Question3", ......, "QuestionN"};
        // String[][] options = {
        //        {"Option1 of Question1", "Option 2 of Question1", "Option 3 of Question1","Option 4 of Question1"},
        //        {"Option1 of Question2", "Option 2 of Question2", "Option 3 of Question2","Option 4 of Question2"},
        //        {"Option1 of Question3", "Option 2 of Question3", "Option 3 of Question3","Option 4 of Question3"},
        //        .....
        //       {"Option1 of QuestionN", "Option 2 of QuestionN", "Option 3 of QuestionN","Option 4 of QuestionN"}
        // long[] answer  = { 0, 1, 1, ...., 3} // The answer should be in index of options.


        String[] questions =
                {
                        "Which property is not used for positioning columns next to each other?",
                        "Which part of box model clears an area around the content ?",
                        "Which part of box model is transparent?",
                        "Which is not a box-level element?",
                        "The content of the box , where text and images appear.",
                        "What will take the element out of normal flow?",
                        "Which visibility property value is described by the element is not visible, but the layout of surrounding element is not affected?",
                        "Which property can't be the value of float property?",
                        "Which property defines the style for the left border of an element?",
                        "Which value is not taken by the border-style property?",
                        "Which type of margin collapses? ",
                        "Which overrides container's align-items property?",
                        "Which property is nearest to the element, as per the box model",
                        "Which specifies initial length of flex item?",
                        "Which property specifies the stack order of elements?",
                        "Which box sizing property value is described by width and height include content ,padding and border ?",
                        "Which property controls the horizontal overflow of a block or inline block?",
                        "Which was not previous layout mode?",
                        "What can't be the value of a clear property?",
                        "What does not affect the element itself"
                };

        String[][] options =
                {
                        {"float", "width", "margin", "border"},
                        {"padding", "border", "margin", "none of them"},
                        {"padding", "margin", "border", "all of the above"},
                        {"<p>", "<ul>", "<li>", "<b>"},
                        {"true", "false", "can be true or false", "can't say"},
                        {"fixed positioning", "floating elements", "relative positioning", "absolute positioning"},
                        {"visible", "hidden", "collapse", "none"},
                        {"left", "right", "center", "inherit"},
                        {"border-style", "border-left-style", "border-left-width", "border-right"},
                        {"out", "groove", "ridge", "inset"},
                        {"only Top or Bottom", "only Right or Left", "Top and Bottom", "Left and Right"},
                        {"order", "align-self", "align-items", "flex"},
                        {"padding", "margin", "border", "alignment"},
                        {"flex-flow", "flex-grow", "flex-shrink", "flex-basis"},
                        {"z-index", "overlap", "override", "none"},
                        {"content-box", "border-box", "both", "none"},
                        {"overflow-y", "overflow-k", "overflow-x", "overflow"},
                                {"block","flexbox layout", "inline", "positioned"},
                                {"left", "inherit", "right", "center"},
                                {"perspective()", "scale()", "matrix()", "rotate"}
                        };

        Long[] answer = {3L, 0L, 0L, 3L, 0L, 1L, 1L, 2L, 1L, 0L, 2L, 1L, 0L, 3L, 0L, 2L, 2L, 1L, 3L, 0L};

        for(int i=0;i<questions.length;i++){
            ArrayList<String> as = new ArrayList<>();
            for (int j = 0;j<4;j++){
                as.add(options[i][j]);
            }
            Question myQues = new Question(questions[i], as, answer[i]);
            FirebaseFirestore db = FirebaseFirestore.getInstance();
            db.collection("languages")
                    .document("UuNCgF7HJSoYiMeua2FD")
                    .collection("css")
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
                            Toast.makeText(SplashActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
            as.clear();
        }

    }
}