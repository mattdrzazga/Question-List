package com.example.matt.questionslist.questions;

import android.arch.lifecycle.LiveData;

import com.example.matt.questionslist.db.Question;

import java.util.List;

public interface QuestionDataSource {
    LiveData<List<Question>> getQuestions();
    void newQuestion();
}
