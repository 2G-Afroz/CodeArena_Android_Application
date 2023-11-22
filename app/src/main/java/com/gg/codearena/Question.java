package com.gg.codearena;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.List;

// Using Parcelable in this class to transfer object of this class using intent.
public class Question implements Parcelable {
    private final String question;
    private final List<String> options;
    private final Long answer_index;

    public Question(String question, List<String> options, Long answer_index){
        this.question = question;
        this.options = options;
        this.answer_index = answer_index;
    }

    protected Question(Parcel in) {
        question = in.readString();
        options = in.createStringArrayList();
        if (in.readByte() == 0) {
            answer_index = null;
        } else {
            answer_index = in.readLong();
        }
    }

    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public Long getAnswer_index() {
        return answer_index;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeStringList(options);
        if (answer_index == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(answer_index);
        }
    }
}
