package com.gg.codearena;

import com.google.firebase.Firebase;

import java.util.List;

public class Question {
    private final String question;
    private final List<String> options;
    private final Long answer_index;

    public Question(String question, List<String> options, Long answer_index){
        this.question = question;
        this.options = options;
        this.answer_index = answer_index;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public Long getAnswer_index() {
        return answer_index;
    }
}
