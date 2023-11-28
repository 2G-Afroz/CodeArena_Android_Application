package com.gg.codearena;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.List;

public class MyFirestoreHelper {

    private FirebaseFirestore db;
    private Context context;

    public MyFirestoreHelper(Context context){
        db = FirebaseFirestore.getInstance();
        this.context = context;
    }
    public void getQuestions(String lang, final QuestionItemFetchListener listener){
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

    public void getUserName(String userID, final UserNameFetchListener listener){
        final String[] userName = {""};
        db.collection("users")
                .whereEqualTo("userID", userID)
                .get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        for(QueryDocumentSnapshot snapshot: queryDocumentSnapshots){
                            userName[0] = (String) snapshot.get("userName");
                            Toast.makeText(context,userName[0], Toast.LENGTH_SHORT).show();
                        }
                        listener.onNameFetch(userName[0]);
                    }
                });
    }

    public interface UserNameFetchListener{
        void onNameFetch(String name);
        void onFailure(Exception e);
    }
}
