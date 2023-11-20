package com.gg.codearena;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.List;

public class MyFirestoreHelper {
    public void getQuestions(String lang, final QuestionItemFetchListener listener){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("languages")
                .document("UuNCgF7HJSoYiMeua2FD")
                .collection(lang)
                .get()
                .addOnCompleteListener(task -> {
                    if(task.isSuccessful()){
                        ArrayList<Question> qns_array = new ArrayList<>();
                        for(QueryDocumentSnapshot qds: task.getResult()){
                            qns_array.add(new Question((String)qds.getData().get("question"), (List<String>) qds.getData().get("options"), (Long) qds.getData().get("answer_index")));
                        }
                        listener.onQuestionModelFetch(qns_array);
                    }
                })
                .addOnFailureListener(listener::onFailure);
    }
    public interface QuestionItemFetchListener{
        void onQuestionModelFetch(ArrayList<Question> questions);

        void onFailure(Exception e);
    }
}
